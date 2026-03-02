import android.app.KeyguardManager;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class bgft {
    private final KeyguardManager a;
    private final becz b;
    private final betx c;

    public bgft(KeyguardManager keyguardManager0, betx betx0, becz becz0) {
        this.a = keyguardManager0;
        this.c = betx0;
        this.b = becz0;
    }

    static Object a(bgft bgft0, bdhv bdhv0, ibrl ibrl0) {
        boolean z2;
        bgfn bgfn0;
        if((ibrl0 instanceof bgfn)) {
            bgfn0 = (bgfn)ibrl0;
            int v = bgfn0.f;
            if((v & 0x80000000) == 0) {
                bgfn0 = new bgfn(bgft0, ibrl0);
            }
            else {
                bgfn0.f = v - 0x80000000;
            }
        }
        else {
            bgfn0 = new bgfn(bgft0, ibrl0);
        }
        Object object0 = bgfn0.d;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(bgfn0.f) {
            case 0: {
                ibnx.b(object0);
                icjr icjr0 = new icjr(new bgfr(bgft0.c.d()), new bgfo(null));
                bgfn0.a = bgft0;
                bgfn0.b = bdhv0;
                bgfn0.f = 1;
                object0 = icll.a(icjr0, bgfn0);
                if(object0 != object1) {
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                bdhv0 = bgfn0.b;
                bgft0 = (bgft)bgfn0.a;
                ibnx.b(object0);
            label_25:
                if(((Boolean)object0).booleanValue()) {
                    Object object2 = new Status(8, "Failed to get \'reauth before autofilling\' from storage.");
                    bdhv0.a(((Status)object2), false, cckf.d(bbdp.aX));
                    return object2;
                }
                boolean z1 = bgft0.a.isDeviceSecure();
                icig icig0 = bgft0.c.d();
                bgfn0.a = bdhv0;
                bgfn0.b = null;
                bgfn0.c = z1;
                bgfn0.f = 2;
                Object object3 = icll.a(icig0, bgfn0);
                if(object3 != object1) {
                    object0 = object3;
                    z2 = z1;
                    break;
                }
                return object1;
            }
            case 2: {
                z2 = bgfn0.c;
                bdhv0 = (bdhv)bgfn0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(z2 && ((Boolean)object0).booleanValue()) {
            z = true;
        }
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
        bdhv0.a(Status.b, z, apiMetadata0);
        return Status.b;
    }

    static Object b(bgft bgft0, boolean z, azxs azxs0, ibrl ibrl0) {
        bgfs bgfs0;
        if((ibrl0 instanceof bgfs)) {
            bgfs0 = (bgfs)ibrl0;
            int v = bgfs0.e;
            if((v & 0x80000000) == 0) {
                bgfs0 = new bgfs(bgft0, ibrl0);
            }
            else {
                bgfs0.e = v - 0x80000000;
            }
        }
        else {
            bgfs0 = new bgfs(bgft0, ibrl0);
        }
        Object object0 = bgfs0.c;
        Object object1 = ibrx.a;
        switch(bgfs0.e) {
            case 0: {
                ibnx.b(object0);
                try {
                    bgfs0.f = bgft0;
                    bgfs0.a = azxs0;
                    bgfs0.b = z;
                    bgfs0.e = 1;
                    if(bgft0.c.c(z, bgfs0) == object1) {
                        return object1;
                    label_20:
                        z = bgfs0.b;
                        azxs0 = bgfs0.a;
                        bgft0 = bgfs0.f;
                        ibnx.b(object0);
                    }
                    break;
                }
                catch(IOException unused_ex) {
                    goto label_25;
                }
            }
            case 1: {
                goto label_20;
            label_25:
                Object object2 = new Status(8, "Failed to save \'reauth before autofilling\' in storage.");
                azxs0.a(((Status)object2));
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        bgft0.b.b((z ? gqtg.q : gqtg.r), gqsp.ca);
        azxs0.a(Status.b);
        return Status.b;
    }
}

