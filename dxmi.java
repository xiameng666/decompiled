import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tapandpay.firstparty.IsDeviceRecentlyUnlockedRequest;
import com.google.android.gms.tapandpay.firstparty.IsDeviceRecentlyUnlockedResponse;
import com.google.android.gms.wallet.PaymentData;

public abstract class dxmi extends lsb implements lom {
    public static final bboh a;
    public final frxn b;
    public final frxj c;
    public final dxnc d;
    public final ibrt e;
    public final dxte f;
    public final dmgi g;
    public final ftem h;
    public PaymentData i;
    public final etgl j;
    public final azts k;
    private final Bundle l;
    private final dmhi m;

    static {
        dxmi.a = bboh.b("Pay", bbcu.cZ);
    }

    public dxmi(Bundle bundle0, dxnc dxnc0, ibrt ibrt0, dmhi dmhi0, dxte dxte0, azts azts0, dmgi dmgi0, etgl etgl0) {
        this.b = new frxn();
        this.c = new frxj(new dxnb(null));
        this.l = bundle0;
        this.d = dxnc0;
        this.e = ibrt0;
        this.m = dmhi0;
        this.f = dxte0;
        this.k = azts0;
        this.g = dmgi0;
        this.j = etgl0;
        this.h = dxsy.l(bundle0);
    }

    public abstract gtlg a();

    public abstract gucv b(boolean arg1);

    public final Object c(ibrl ibrl0) {
        Object object2;
        dxmh dxmh0;
        if((ibrl0 instanceof dxmh)) {
            dxmh0 = (dxmh)ibrl0;
            int v = dxmh0.c;
            if((v & 0x80000000) == 0) {
                dxmh0 = new dxmh(this, ibrl0);
            }
            else {
                dxmh0.c = v - 0x80000000;
            }
        }
        else {
            dxmh0 = new dxmh(this, ibrl0);
        }
        Object object0 = dxmh0.a;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(dxmh0.c) {
            case 0: {
                ibnx.b(object0);
                ftem ftem0 = this.h;
                if((ftem0.b & 0x1000000) != 0) {
                    return Boolean.valueOf(true);
                }
                if(bbmq.P()) {
                    return Boolean.valueOf(true);
                }
                if(!dxmi.o(ftem0) && !hwgk.u() && !dsjv.b(this.m.d)) {
                    return Boolean.valueOf(true);
                }
                if(!hwue.c()) {
                    return Boolean.valueOf(false);
                }
                IsDeviceRecentlyUnlockedRequest isDeviceRecentlyUnlockedRequest0 = new IsDeviceRecentlyUnlockedRequest();
                isDeviceRecentlyUnlockedRequest0.a = (int)hwue.a.b().a();
                azzc azzc0 = new azzc();
                azzc0.a = new etek(this.j, isDeviceRecentlyUnlockedRequest0);
                azzc0.c = new Feature[]{eseb.w};
                azzc0.b = false;
                azzc0.d = 2200;
                azzd azzd0 = azzc0.a();
                evql evql0 = this.j.iG(azzd0);
                dxmh0.c = 1;
                object2 = fsdk.a(evql0, dxmh0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!(object2 instanceof ibnv)) {
            if(((IsDeviceRecentlyUnlockedResponse)object2) != null) {
                z = ((IsDeviceRecentlyUnlockedResponse)object2).a;
            }
            return Boolean.valueOf(z);
        }
        a.ae(dxmi.a.i(), "Failed to check if device is recently unlocked.", ibnw.a(object2));
        return Boolean.valueOf(false);
    }

    public abstract void e();

    public final void f() {
        this.l(this.b(false));
    }

    public final void g() {
        icck icck0 = lsc.a(this);
        dxmg dxmg0 = new dxmg(this, null);
        icbb.b(icck0, this.e, null, dxmg0, 2);
    }

    public final void h(hagt hagt0, hagu hagu0) {
        ibuq.f(hagt0, "eventType");
        ibuq.f(hagu0, "purchaseErrorType");
        gtlq gtlq0 = gtlq.b(this.h.B) == null ? gtlq.a : gtlq.b(this.h.B);
        ibuq.e(gtlq0, "getImplementationType(...)");
        hapr hapr0 = dxsy.a(hagt0, gtlq0, (this.h.r == null ? hkug.a : this.h.r).d, dxsy.m(false, false, hagu0, 3));
        this.g.b(hapr0);
    }

    public final void i(Intent intent0) {
        this.j(lsc.a(this), new frxf[]{new dxne(intent0)});
    }

    public final void j(icck icck0, frxf[] arr_frxf) {
        this.b.b(icck0, arr_frxf);
    }

    public final void k(dxnb dxnb0) {
        this.c.b(dxnb0);
    }

    public final void l(gucv gucv0) {
        ibuq.f(gucv0, "templateInfo");
        ibuq.f(gucv0, "<this>");
        this.k(new dxnb(false, new dsqo(0, gucv0, 12)));
    }

    public final void m() {
        dsqo dsqo0 = ((dxnb)this.c.a()).b;
        ibuq.f(dsqo0.b, "templateInfo");
        ibuq.f(dsqo0.c, "colorProfile");
        ibuq.f(dsqo0.d, "darkColorProfile");
        this.k(new dxnb(true, new dsqo(8, dsqo0.b, dsqo0.c, dsqo0.d)));
    }

    public static gucv n(dxmi dxmi0) {
        return dxmi0.b(false);
    }

    public static final boolean o(ftem ftem0) {
        ibuq.f(ftem0, "<this>");
        return hwiq.d() ? (gtlq.b(ftem0.B) == null ? gtlq.a : gtlq.b(ftem0.B)) == gtlq.e : false;
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }

    public static void p(dxmi dxmi0, hagt hagt0) {
        dxmi0.h(hagt0, hagu.a);
    }

    public static void q(dxmi dxmi0, String s, hagt hagt0, hagu hagu0, int v) {
        if((v & 2) != 0) {
            hagt0 = hagt.be;
        }
        if((v & 4) != 0) {
            hagu0 = hagu.a;
        }
        if(1 == (v & 1)) {
            s = null;
        }
        ibuq.f(hagt0, "eventType");
        ibuq.f(hagu0, "purchaseErrorType");
        dxmi0.h(hagt0, hagu0);
        dxmi0.j(lsc.a(dxmi0), new frxf[]{new dxnf(s)});
    }
}

