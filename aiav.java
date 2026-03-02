import android.telephony.NumberVerificationCallback;
import com.google.android.gms.auth.api.phone.operation.IncomingCallRetrieverIntentOperation;
import java.util.concurrent.CountDownLatch;

public final class aiav implements NumberVerificationCallback {
    final IncomingCallRetrieverIntentOperation a;
    final long b;
    final String c;
    final CountDownLatch d;

    public aiav(IncomingCallRetrieverIntentOperation incomingCallRetrieverIntentOperation0, long v, String s, CountDownLatch countDownLatch0) {
        this.a = incomingCallRetrieverIntentOperation0;
        this.b = v;
        this.c = s;
        this.d = countDownLatch0;
        super();
    }

    public final void onCallReceived(String s) {
        ibuq.f(s, "phoneNumber");
        int v = IncomingCallRetrieverIntentOperation.a(this.b);
        ((ggtj)IncomingCallRetrieverIntentOperation.a.h()).x("Phone number verified");
        ghwp ghwp0 = aicv.a(this.c, ghwo.h, v);
        this.a.b.a(ghwp0);
        IncomingCallRetrieverIntentOperation.b(this.c, 0, s);
        this.d.countDown();
    }

    public final void onVerificationFailed(int v) {
        int v2;
        ghwm ghwm0;
        int v1 = IncomingCallRetrieverIntentOperation.a(this.b);
        ((ggtj)IncomingCallRetrieverIntentOperation.a.i()).z("Phone number verification failed with error code: %d", v);
        ghwo ghwo0 = ghwo.i;
        switch(v) {
            case 1: {
                ghwm0 = ghwm.k;
                break;
            }
            case 2: {
                ghwm0 = ghwm.j;
                break;
            }
            case 3: {
                ghwm0 = ghwm.l;
                break;
            }
            case 4: {
                ghwm0 = ghwm.g;
                break;
            }
            case 5: {
                ghwm0 = ghwm.h;
                break;
            }
            case 6: {
                ghwm0 = ghwm.i;
                break;
            }
            default: {
                ghwm0 = ghwm.a;
            }
        }
        String s = this.c;
        ghwp ghwp0 = aicv.b(s, ghwo0, ghwm0, v1);
        this.a.b.a(ghwp0);
        switch(v) {
            case 1: {
                v2 = 15;
                break;
            }
            case 2: {
                v2 = 7;
                break;
            }
            case 4: {
                v2 = 0xCF09;
                break;
            }
            case 6: {
                v2 = 0xCF0A;
                break;
            }
            default: {
                v2 = 0xCF10;
            }
        }
        IncomingCallRetrieverIntentOperation.b(s, v2, null);
        this.d.countDown();
    }
}

