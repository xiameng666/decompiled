import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.chimera.android.Activity;

public final class bvdv extends clpn {
    public final eoqf a;
    private final lsk b;
    private final String c;

    public bvdv(lsk lsk0) {
        this.b = lsk0;
        this.c = "home";
        this.a = this.h();
    }

    @Override  // eoqh
    public final String b() {
        return this.c;
    }

    @Override  // clpn
    public final void e(Bundle bundle0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xF7DB5E05);
        int v1 = (v & 0x30) == 0 ? (goz1.Z(this) ? 0x20 : 16) | v : v;
        if((v1 & 17) == 16 && goz1.ac()) {
            goz1.G();
        }
        else {
            lsk lsk0 = this.b;
            ltx ltx0 = (ltx)goz1.h(bvkp.a);
            lsq lsq0 = lud.b(goz1);
            if(lsq0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            this.g(((bvgx)gtr.a(((bvkk)lue.a(new ibuk(bvkk.class), lsq0, null, lsk0, ltx0)).i, goz1).a()), goz1, v1 & 0x70 | 8);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvdt(this, bundle0, v);
        }
    }

    public final void g(bvgx bvgx0, goz goz0, int v) {
        ibuq.f(bvgx0, "uiModel");
        goz goz1 = goz0.ao(118632043);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgx0) : goz1.Z(bvgx0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            grx grx0 = cmdp.a;
            goz1.M(0x4B83BC8E);
            Object object0 = goz1.h(AndroidCompositionLocals_androidKt.b);
            ibuq.d(object0, "null cannot be cast to non-null type com.google.android.chimera.android.Activity");
            goz1.M(5004770);
            boolean z = goz1.X(((Activity)object0));
            Object object1 = goz1.j();
            if(z || object1 == gop.a) {
                object1 = new cmdl(((Activity)object0));
                goz1.P(object1);
            }
            goz1.x();
            goz1.x();
            gpo.a(grx0.c(((cmdl)object1)), gzf.e(0x2179532B, new bvdu(this, bvgx0), goz1), goz1, 56);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvds(this, bvgx0, v);
        }
    }
}

