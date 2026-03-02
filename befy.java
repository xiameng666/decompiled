import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.gms.common.Feature;

public final class befy {
    public static final bboh a;
    public final acqj b;
    public final Context c;
    public final String d;
    public final lqi e;
    public final lqi f;
    public final lqi g;
    public final lqi h;
    public final lqi i;
    public final lqi j;
    public final lqi k;
    public final azts l;
    public final azts m;
    public final azts n;

    static {
        befy.a = bboh.b("EnhancedProtectionRepository", bbcu.cX);
    }

    public befy(azts azts0, bdzr bdzr0, acqj acqj0, Context context0, String s) {
        this.l = azts0;
        this.b = acqj0;
        this.c = context0;
        this.d = s;
        this.m = bdzr0.a("chromesync", "pwm_settings");
        this.n = bdzr0.a("chromesync", "pwm_promo_card");
        this.e = new lqi();
        this.f = new lqi();
        this.g = new lqi();
        this.h = new lqi();
        this.i = new lqi();
        this.j = new lqi();
        this.k = new lqi();
    }

    public final evql a() {
        evql evql0 = this.m.jE(this.d, 2);
        evql0.b(new befh(new befg(this)));
        evql0.A(new befi(this));
        return evql0;
    }

    public final evql b() {
        bedv bedv0 = new bedv(bedu.b, null, null);
        this.f.l(bedv0);
        azzc azzc0 = new azzc();
        azzc0.a = new ajul(this.m, this.d);
        azzc0.c = new Feature[]{amjz.c};
        azzc0.d = 0x66B;
        azzd azzd0 = azzc0.a();
        evql evql0 = this.m.iG(azzd0);
        evql0.b(new befk(new beez(this)));
        evql0.A(new befp(this));
        return evql0;
    }

    public static Object c(befy befy0, ibrl ibrl0) {
        befx befx0;
        if((ibrl0 instanceof befx)) {
            befx0 = (befx)ibrl0;
            int v = befx0.c;
            if((v & 0x80000000) == 0) {
                befx0 = new befx(befy0, ibrl0);
            }
            else {
                befx0.c = v - 0x80000000;
            }
        }
        else {
            befx0 = new befx(befy0, ibrl0);
        }
        Object object0 = befx0.a;
        Object object1 = ibrx.a;
        switch(befx0.c) {
            case 0: {
                ibnx.b(object0);
                lqi lqi0 = befy0.f;
                if(bedv.d(((bedv)lqi0.ij()))) {
                    bedv bedv0 = (bedv)lqi0.ij();
                    Boolean boolean0 = bedv0 == null ? null : ((Boolean)bedv0.b);
                    if(boolean0 != null) {
                        return Boolean.valueOf(boolean0.booleanValue());
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                evql evql0 = befy0.b();
                befx0.d = befy0;
                befx0.c = 1;
                object0 = ictn.b(evql0, befx0);
                return object0 != object1 ? Boolean.valueOf(befy0.f(((byte[])object0))) : object1;
            }
            case 1: {
                befy0 = befx0.d;
                ibnx.b(object0);
                return Boolean.valueOf(befy0.f(((byte[])object0)));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void d() {
        bedv bedv0 = new bedv(bedu.b, null, null);
        this.h.l(bedv0);
        evql evql0 = this.l.jw(this.d);
        evql0.b(new befl(new befj(this)));
        evql0.A(new befm(this));
    }

    public final void e() {
        bedv bedv0 = new bedv(bedu.b, null, null);
        this.g.l(bedv0);
        evql evql0 = this.m.jw(this.d);
        evql0.b(new befu(new beft(this)));
        evql0.A(new befv(this));
    }

    public final boolean f(byte[] arr_b) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grej.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return ((grej)hftv0).c == 1 ? ((greh)((grej)hftv0).d).b : greh.a.b;
    }

    public final boolean g() {
        KeyguardManager keyguardManager0 = (KeyguardManager)this.c.getSystemService("keyguard");
        if(keyguardManager0 != null) {
            return keyguardManager0.isDeviceSecure();
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

