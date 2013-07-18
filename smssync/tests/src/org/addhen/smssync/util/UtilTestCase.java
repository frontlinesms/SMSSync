
package org.addhen.smssync.util;

import org.addhen.smssync.test.BaseTestCase;

import android.test.suitebuilder.annotation.SmallTest;

public class UtilTestCase extends BaseTestCase {
    private static String[] SUCCESSFUL_RESPONSES = {
        "{\"payload\":{\"success\":\"true\",\"task\":\"send\",\"messages\":[{\"to\":\"098\",\"message\":\"who got the funk?\"}]}}",
        "{\"payload\":{\"secret\":\"secret\",\"success\":\"true\",\"task\":\"send\",\"messages\":[]}}",
        "{\"payload\":{\"secret\":\"secret\",\"success\":\"true\"}}"
    };

    private static String[] FAILED_RESPONSES = {
        "{\"payload\":{\"success\":\"false\"}}"
    };

    Long timestamp;

    String expected;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        timestamp = 1370831690572l;
        expected = "Jun 10, 2013 at 11:34 AM";

    }

    /**
     * Test date and time formatter
     */
    @SmallTest
    public void testFormatDate() {

        try {
            String formatted = Util.formatDateTime(timestamp,
                    "MMM dd, yyyy 'at' hh:mm a");

            assertNotNullOrEqual("Timestamp cannot be null or empty", expected, formatted);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @SmallTest
    public void testGetJsonSuccessStatus_success() {
        for(String successfulResponse : SUCCESSFUL_RESPONSES) {
            assertTrue(Util.getJsonSuccessStatus(successfulResponse));
        }
    }

    @SmallTest
    public void testGetJsonSuccessStatus_fail() {
        for(String successfulResponse : FAILED_RESPONSES) {
            assertFalse(Util.getJsonSuccessStatus(successfulResponse));
        }
    }

    @Override
    public void tearDown() {
        timestamp = null;
        expected = null;
    }
}
