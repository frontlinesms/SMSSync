package org.addhen.smssync;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class org.addhen.smssync.SettingsTest \
 * org.addhen.smssync.tests/android.test.InstrumentationTestRunner
 */
public class SettingsTest extends ActivityInstrumentationTestCase2<Settings> {

    public SettingsTest() {
        super("org.addhen.smssync", Settings.class);
    }

}
