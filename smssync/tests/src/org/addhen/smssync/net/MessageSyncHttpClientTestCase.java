package org.addhen.smssync.net;

import org.addhen.smssync.net.MessageSyncHttpClient;
import org.addhen.smssync.test.BaseTestCase;

import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;

import static org.mockito.Mockito.*;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;

public class MessageSyncHttpClientTestCase extends BaseTestCase {
	private static final String TEST_URL = "http://example.com/something";

	/** instance of #{MessageSyncHttpClientTestCase} under test */
	private final MessageSyncHttpClient client;
	/** mock android context */
	private final Context context;

	public MessageSyncHttpClientTestCase() throws Exception {
		context = mock(Context.class);

//		PackageInfo packageInfo = mock(PackageInfo.class);

//		PackageManager packageManager = mock(PackageManager.class);
//		when(packageManager.getPackageInfo(anyString(), anyInt())).thenReturn(packageInfo);

//		when(context.getPackageManager()).thenReturn(packageManager);

		client = new MessageSyncHttpClient(context, TEST_URL, false);
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

