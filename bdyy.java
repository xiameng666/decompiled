import android.app.KeyguardManager;
import java.io.IOException;

public final class bdyy {
    public final boolean a;
    public final icig b;
    public final icig c;
    public final icnl d;
    private static final bboh e;
    private final KeyguardManager f;
    private final icig g;
    private final betx h;

    static {
        bdyy.e = bboh.b("DeviceSettingsViewModel", bbcu.cX);
    }

    public bdyy(KeyguardManager keyguardManager0, betx betx0) {
        this.f = keyguardManager0;
        this.h = betx0;
        hsas.e();
        this.a = true;
        icnl icnl0 = icnm.a(Boolean.valueOf(this.b()));
        this.d = icnl0;
        icig icig0 = icjj.a(new icjr(new bdyw(betx0.d()), new bdys(null)));
        this.g = icig0;
        this.b = new icmj(icnl0, icig0, new bdyt(null));
        this.c = betx0.d();
    }

    static Object a(bdyy bdyy0, boolean z, ibrl ibrl0) {
        bdyx bdyx0;
        if((ibrl0 instanceof bdyx)) {
            bdyx0 = (bdyx)ibrl0;
            int v = bdyx0.c;
            if((v & 0x80000000) == 0) {
                bdyx0 = new bdyx(bdyy0, ibrl0);
            }
            else {
                bdyx0.c = v - 0x80000000;
            }
        }
        else {
            bdyx0 = new bdyx(bdyy0, ibrl0);
        }
        Object object0 = bdyx0.a;
        Object object1 = ibrx.a;
        boolean z1 = true;
        switch(bdyx0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bdyx0.c = 1;
                    if(bdyy0.h.c(((boolean)(((int)z) ^ 1)), bdyx0) == object1) {
                        return object1;
                    label_18:
                        ibnx.b(object0);
                        return Boolean.valueOf(true);
                    }
                    return Boolean.valueOf(z1);
                }
                catch(IOException iOException0) {
                    break;
                }
            }
            case 1: {
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bdyy.e.j(), "Writing IsBioReauthChecked to storage failed.", iOException0);
        z1 = false;
        return Boolean.valueOf(z1);
    }

    public final boolean b() {
        return this.f.isDeviceSecure();
    }
}

