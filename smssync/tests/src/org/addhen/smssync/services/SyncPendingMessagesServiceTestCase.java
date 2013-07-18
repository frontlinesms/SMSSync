
package org.addhen.smssync.services;

import android.test.ServiceTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Testcase for testing submission of pending messages when SMS fails to submit
 * to the configured URL.
 * 
 * @author eyedol
 */
public class SyncPendingMessagesServiceTestCase extends ServiceTestCase<SyncPendingMessagesService> {

    public SyncPendingMessagesServiceTestCase() {
        super(SyncPendingMessagesService.class);

    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

    }

    @LargeTest
    public void testSyncMessages() {
    }
	@SmallTest
	public void testShouldFail() {
		fail("This test should fail");
	}

	@SmallTest
	public void testShouldPass() {
		assertTrue("This test should pass", true);
	}

    @Override
    public void tearDown() {
    }
}
