import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class acgd extends acjl {
    final AtomicReference a;
    final CountDownLatch b;

    public acgd(acgm acgm0, AtomicReference atomicReference0, CountDownLatch countDownLatch0) {
        this.a = atomicReference0;
        this.b = countDownLatch0;
        Objects.requireNonNull(acgm0);
        super();
    }

    @Override  // acjm
    public final void a(AppSearchResultParcel appSearchResultParcel0) {
        this.a.set(appSearchResultParcel0.l);
        this.b.countDown();
    }
}

