import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;

public final class eias {
    public static final eias a;

    static {
        eias.a = new eias();
    }

    public static final void a(ComposeView composeView0, lqd lqd0, eiam eiam0) {
        if(composeView0 != null) {
            composeView0.j();
            composeView0.a(new gze(0xD4317D7F, true, new eiap(lqd0, eiam0)));
        }
    }

    public final void b(ibtw ibtw0, goz goz0, int v) {
        ibtw ibtw1;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0x5B525435);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            ibtw1 = ibtw0;
        }
        else {
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            ibtw1 = ibtw0;
            fish.a((csd.a(goz1) ? firh.b(context0) : firh.c(context0)), null, null, ibtw1, goz1, v1 << 9 & 0x1C00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new eian(this, ibtw1, v);
        }
    }
}

