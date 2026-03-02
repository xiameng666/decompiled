import android.os.Bundle;

public final class cail extends clsp {
    private final caiy a;

    public cail(caiy caiy0) {
        super(clnd.l, true);
        this.a = caiy0;
    }

    public final void a(goz goz0, int v) {
        goz goz1 = goz0.ao(125008779);
        if((((v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            cltv.a(this.a.e, null, goz1, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new caij(this, v);
        }
    }

    @Override  // clsp
    public final void b(Bundle bundle0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x74760B49);
        int v1 = (v & 6) == 0 ? (goz1.Z(bundle0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            this.a.p(bundle0);
            cagz.e(((cahe)gtr.a(this.a.c, goz1).a()), goz1, 0);
            this.a(goz1, v1 >> 3 & 14);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new caik(this, bundle0, v);
        }
    }
}

