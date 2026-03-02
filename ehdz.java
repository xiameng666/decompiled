import java.util.concurrent.CountDownLatch;

public final class ehdz {
    final CountDownLatch a;

    public ehdz(CountDownLatch countDownLatch0) {
        this.a = countDownLatch0;
        super();
    }

    public final void a(boolean z) {
        egig.e("FSA2_PortalRegistrationUtils", "Checking if Portal is available: " + z);
        ehef.b = z;
        this.a.countDown();
    }
}

