import android.telephony.NumberVerificationCallback;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

final class bcrp implements NumberVerificationCallback {
    final bcrr a;

    public bcrp(bcrr bcrr0) {
        Objects.requireNonNull(bcrr0);
        this.a = bcrr0;
        super();
    }

    public final void onCallReceived(String s) {
        bcrr bcrr0 = this.a;
        bcrr0.f.set(false);
        baun baun0 = bcrr.a;
        baun0.d("Call received phoneNumber: %s.", new Object[]{s});
        bcru bcru0 = bcrr0.a();
        if(bcru0 == null) {
            baun0.h("No listener to notify of the phone call, storing phone number.", new Object[0]);
            synchronized(bcrr0.e) {
                bcrr0.h = new bcrq(s);
            }
            return;
        }
        bcru0.a(s);
    }

    public final void onVerificationFailed(int v) {
        bcrr bcrr0 = this.a;
        bcrr0.f.set(false);
        CountDownLatch countDownLatch0 = bcrr0.i;
        gftb.check(countDownLatch0);
        countDownLatch0.countDown();
        bcrq bcrq0 = new bcrq(v);
        baun baun0 = bcrr.a;
        baun0.f(bcrq0.d, new Object[0]);
        bcru bcru0 = bcrr0.a();
        if(bcru0 == null) {
            baun0.h("No listener to notify of the failure, storing error.", new Object[0]);
            synchronized(bcrr0.e) {
                bcrr0.h = bcrq0;
            }
            return;
        }
        bcru0.b(bcrq0.b, bcrq0.d);
    }
}

