import java.util.concurrent.CountDownLatch;

public final class ehea {
    final CountDownLatch a;

    public ehea(CountDownLatch countDownLatch0) {
        this.a = countDownLatch0;
        super();
    }

    public final void a(boolean z) {
        egig.e("FSA2_PortalRegistrationUtils", "Checking if Portal is ready: " + z);
        ehef.c = z;
        this.a.countDown();
    }
}

