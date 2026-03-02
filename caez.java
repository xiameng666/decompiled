import android.os.Bundle;

public final class caez extends clsp {
    public static final int a;
    private final cafj d;

    static {
    }

    public caez(cafj cafj0) {
        super(clnd.k);
        this.d = cafj0;
    }

    public final void a(Bundle bundle0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xCD04F3AC);
        int v1 = (v & 6) == 0 ? (goz1.Z(bundle0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(this) : goz1.Z(this)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cafj cafj0 = this.d;
            cafj0.p(bundle0);
            caib.k(((caie)gtr.a(cafj0.f, goz1).a()), goz1, 0);
            lpe lpe0 = lpe.ON_START;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new caew();
                goz1.P(object0);
            }
            goz1.x();
            ltn.b(lpe0, null, ((ibth)object0), goz1, 390);
            cltv.a(cafj0.d, null, goz1, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new caex(this, bundle0, v);
        }
    }

    @Override  // clsp
    public final void b(Bundle bundle0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x5E93508D);
        int v1 = (v & 6) == 0 ? (goz1.Z(bundle0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(this) : goz1.Z(this)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            this.a(bundle0, goz1, v1 & 0x70 | (v1 & 14 | 0x40));
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new caey(this, bundle0, v);
        }
    }
}

