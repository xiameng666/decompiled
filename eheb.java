import java.util.concurrent.CountDownLatch;

public final class eheb {
    final CountDownLatch a;

    public eheb(CountDownLatch countDownLatch0) {
        this.a = countDownLatch0;
        super();
    }

    public final void a(boolean z) {
        egig.e("FSA2_PortalRegistrationUtils", "Checking if Portal service is alive: " + z);
        ehef.d = z;
        this.a.countDown();
    }
}

