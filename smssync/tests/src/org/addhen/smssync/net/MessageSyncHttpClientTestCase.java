package org.addhen.smssync.net;

import org.addhen.smssync.net.MessageSyncHttpClient;
import org.addhen.smssync.test.BaseTestCase;

import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;

public class MessageSyncHttpClientTestCase extends BaseTestCase {
	MessageSyncHttpClient client;

	public MessageSyncHttpClientTestCase() {
		client = new MessageSyncHttpClient(null, null);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
	}

	@SmallTest
	public void testInit() {
		assertNotNull(client);
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
	public void tearDown() throws Exception {
		super.tearDown();
	}
}

