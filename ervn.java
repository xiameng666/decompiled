import android.os.Bundle;

public final class ervn extends clsp {
    public final erwq a;

    static {
    }

    public ervn(erwq erwq0) {
        super(clnd.e);
        this.a = erwq0;
    }

    public final void a(Bundle bundle0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xC738CF17);
        boolean z = true;
        int v1 = (v & 6) == 0 ? (goz1.Z(bundle0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(this) : goz1.Z(this)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            erwq erwq0 = this.a;
            erwq0.p(bundle0);
            erxk.c(((erxm)gtr.a(erwq0.m, goz1).a()), goz1, 0);
            lpe lpe0 = lpe.ON_START;
            goz1.M(5004770);
            if((v1 & 0x70) != 0x20 && ((v1 & 0x40) == 0 || !goz1.Z(this))) {
                z = false;
            }
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new ervk(this);
                goz1.P(object0);
            }
            goz1.x();
            ltn.b(lpe0, null, ((ibth)object0), goz1, 6);
            cltv.a(erwq0.f, null, goz1, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ervl(this, bundle0, v);
        }
    }

    @Override  // clsp
    public final void b(Bundle bundle0, goz goz0, int v) {
        goz goz1 = goz0.ao(113700504);
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
            gsb0.d = new ervm(this, bundle0, v);
        }
    }
}

