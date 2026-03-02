import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class bgny {
    public static final void a(boolean z, ibtw ibtw0, goz goz0, int v) {
        fen fen0;
        boolean z1;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(-1800625175);
        int v1 = (v & 6) == 0 ? v | 2 : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            z1 = z;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                z1 = z;
            }
            else {
                z1 = csd.a(goz1);
            }
            goz1.w();
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            if(!hsam.f() || !hsam.h() && !hsam.c() || !fyhn.c()) {
                fen0 = z1 ? firh.d() : firh.e(0L, 0L, 0L, 0L, -1);
            }
            else if(z1) {
                fen0 = firh.b(context0);
            }
            else {
                fen0 = firh.c(context0);
            }
            fish.a(fen0, null, null, ibtw0, goz1, (v1 & -15) << 6 & 0x1C00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bgnx(z1, ibtw0, v);
        }
    }
}

