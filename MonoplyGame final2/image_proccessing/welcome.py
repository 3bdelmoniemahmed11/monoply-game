import cv2
import numpy as np

min_threshold = 10  # these values are used to filter our detector.
max_threshold = 200  # they can be tweaked depending on the camera distance, camera angle, ...
min_area = 100  # ... focus, brightness, etc.
min_circularity = .3
min_inertia_ratio = .5

cap = cv2.VideoCapture(1)  # '0' is the webcam's ID. usually it is 0 or 1. 'cap' is the video object.
cap.set(15, -4)  # '15' references video's brightness. '-4' sets the brightness.

counter = 0  # script will use a counter to handle FPS.
readings = [0, 0]  # lists are used to track the number of pips.
display = [0, 0]

while True:
    if counter >= 90000:  # set maximum sizes for variables and lists to save memory.
        counter = 0
        readings = [0, 0]
        display = [0, 0]

    ret, im = cap.read()  # 'im' will be a frame from the video.

    params = cv2.SimpleBlobDetector_Params()  # declare filter parameters.
    params.filterByArea = True
    params.filterByCircularity = True
    params.filterByInertia = True
    params.minThreshold = min_threshold
    params.maxThreshold = max_threshold
    params.minArea = min_area
    params.minCircularity = min_circularity
    params.minInertiaRatio = min_inertia_ratio

    detector = cv2.SimpleBlobDetector_create(params)  # create a blob detector object.

    keypoints = detector.detect(im)  # keypoints is a list containing the detected blobs.

    # here we draw keypoints on the frame.
    im_with_keypoints = cv2.drawKeypoints(im, keypoints, np.array([]), (0, 0, 255),
                                          cv2.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS)

    cv2.imshow("Dice Reader", im_with_keypoints)  # display the frame with keypoints added.

    reading = len(keypoints)  # 'reading' counts the number of keypoints (pips).

    if counter % 10 == 0:  # enter this block every X frames.
        readings.append(reading)  # note the reading from this frame.

        if readings[-1] == readings[-2] == readings[-3]:  # if the last 3 readings are the same...
            display.append(readings[-1])  # ... then we have a valid reading.

        # if the most recent valid reading has changed, and it's something other than zero, then print it.
        if display[-1] != display[-2] and display[-1] != 0:
            msg = str(display[-1])
            print(msg)
            file = open("copy.txt", "w")
            file.write(msg)
            file.close()

    counter += 1

    k = cv2.waitKey(30) & 0xff  # press [Esc] to exit.
    if k == 27:
        break

'''
# this code prints coordinates of two keypoints. it could be expanded to track individual dice, detect when
# dice are thrown, etc.

    try:
        x0 = keypoints[0].pt.x
        y0 = keypoints[0].pt.y
        x1 = keypoints[1].pt.x
        y1 = keypoints[1].pt.y

        msg = "x0: " + str(x0) + "\ny0: " + str(y0) + "\nx1: " + str(x1) + "\ny1: " + str(y1) + "\n\n\n\n\n\n"
        print(msg)

    except:
        pass
'''

cv2.destroyAllWindows()  # since we exited the loop above, end the script.