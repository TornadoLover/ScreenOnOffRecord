# ScreenOnOffRecord
Android service to detect and record the screen status if changed.

In order to use it, you may need to click the icon first. And it will run as a service.

PLEASE USE REAL ANDROID DEVICE TO DEBUG IT.

With Android Studio, the info part of Logcat may help you to figure out if it works.
If you want to read the full and formal record, you must open the output result file.

The layout and page is empty and you can modify it as you want.

Three factors will be recorded if the screen status is changed(ON/OFF).

1. The system time 
2. The changed screen status
3. The rest power percentage when the screen status changed

The lock/off after screen timeout will be recorded too.

The output file "info.txt" will be stored in the root derectory of your SD card in android phone by default.

Result example: 
Wed Nov 04 10:17:28 EST 2015 Screen OFF! 96.0% 
Wed Nov 04 10:18:33 EST 2015 Screen ON! 95.0%

Reference: harryhow/OnOffMan

# TEST PURPOSE
