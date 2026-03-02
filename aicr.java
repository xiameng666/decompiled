import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import java.util.concurrent.TimeUnit;

public final class aicr {
    public static final baun a;

    static {
        aicr.a = new baun("EventLogger");
    }

    public static aicq a(String s, ghxn ghxn0) {
        gftb.check(ghxn0);
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(17, smsRetrieverEvent0);
        aiao.b(ghxn0.d, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq b(String s) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(23, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, false);
    }

    public static aicq c(String s) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(18, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, false);
    }

    public static aicq d(String s) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(20, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, false);
    }

    public static aicq e(String s) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(19, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, false);
    }

    public static aicq f(String s, ghxn ghxn0) {
        gftb.check(ghxn0);
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(0x1F, smsRetrieverEvent0);
        aiao.b(ghxn0.d, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq g(String s) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(33, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, false);
    }

    public static aicq h(String s) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(0x20, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, false);
    }

    public static aicq i(String s, long v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(37, smsRetrieverEvent0);
        aiao.h(((int)TimeUnit.MILLISECONDS.toSeconds(v)), smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq j(String s, long v, int v1) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(1, smsRetrieverEvent0);
        aiao.h(((int)TimeUnit.MILLISECONDS.toSeconds(v)), smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v1 != 0) {
            aiao.f(v1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public final void k(Context context0, aicq aicq0) {
        gftb.check(context0);
        SmsRetrieverEvent smsRetrieverEvent0 = aicq0.a;
        if(aicq0.b) {
            String s = ((TelephonyManager)context0.getSystemService("phone")).getNetworkOperatorName();
            if(s != null) {
                SmsRetrieverEvent smsRetrieverEvent1 = new SmsRetrieverEvent();
                smsRetrieverEvent1.a = smsRetrieverEvent0.a;
                smsRetrieverEvent1.b = smsRetrieverEvent0.b;
                smsRetrieverEvent1.c = smsRetrieverEvent0.c;
                smsRetrieverEvent1.d = smsRetrieverEvent0.d;
                smsRetrieverEvent1.f = smsRetrieverEvent0.f;
                smsRetrieverEvent1.g = smsRetrieverEvent0.g;
                smsRetrieverEvent1.h = smsRetrieverEvent0.h;
                smsRetrieverEvent1.i = smsRetrieverEvent0.i;
                smsRetrieverEvent1.j = smsRetrieverEvent0.j;
                smsRetrieverEvent1.k = smsRetrieverEvent0.k;
                smsRetrieverEvent1.l = smsRetrieverEvent0.l;
                smsRetrieverEvent1.m = smsRetrieverEvent0.m;
                smsRetrieverEvent1.n = smsRetrieverEvent0.n | 16;
                smsRetrieverEvent1.e = s;
                smsRetrieverEvent0 = smsRetrieverEvent1;
            }
        }
        aibc aibc0 = new aibc(context0);
        azzc azzc0 = new azzc();
        azzc0.a = new aiay(smsRetrieverEvent0);
        evql evql0 = aibc0.jn(azzc0.a());
        evql0.b(new aico());
        evql0.A(new aicp());
    }

    public static aicq l(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(22, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq m(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(21, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq n(String s, long v, int v1, int v2) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(15, smsRetrieverEvent0);
        aiao.h(((int)TimeUnit.MILLISECONDS.toSeconds(v)), smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v1 != 0) {
            aiao.c(v1 - 1, smsRetrieverEvent0);
        }
        if(v2 != 0) {
            aiao.f(v2, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq o(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(16, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq p(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(12, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq q(String s, long v, int v1, int v2) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(29, smsRetrieverEvent0);
        aiao.h(((int)TimeUnit.MILLISECONDS.toSeconds(v)), smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v1 != 0) {
            aiao.c(v1 - 1, smsRetrieverEvent0);
        }
        if(v2 != 0) {
            aiao.f(v2, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq r(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(30, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq s(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(25, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq t(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(0, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq u(String s, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(11, smsRetrieverEvent0);
        aiao.c(v - 1, smsRetrieverEvent0);
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }

    public static aicq v(String s, boolean z, ghxn ghxn0, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(4, smsRetrieverEvent0);
        if(ghxn0 != null) {
            aiao.g(ghxn0.d, smsRetrieverEvent0);
        }
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        aiao.e(z, smsRetrieverEvent0);
        if(v != 0) {
            aiao.c(v - 1, smsRetrieverEvent0);
        }
        return new aicq(smsRetrieverEvent0, true);
    }
}

