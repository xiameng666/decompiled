import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class sin {
    private static final ibnn a;

    static {
        sin.a = new ibnz(new sik());
    }

    public static final boolean a() {
        return ((Boolean)sin.a.a()).booleanValue();
    }

    public static final void b(ibtw ibtw0, goz goz0, int v) {
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0x7496168C);
        if((((v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            boolean z = csd.a(goz1);
            goz1.M(1983108581);
            grx grx0 = AndroidCompositionLocals_androidKt.b;
            Context context0 = (Context)goz1.h(grx0);
            goz1.M(5004770);
            boolean z1 = goz1.Y(z);
            Object object0 = goz1.j();
            if(z1 || object0 == gop.a) {
                object0 = z ? flg.b(context0) : flg.c(context0);
                goz1.P(object0);
            }
            goz1.x();
            goz1.x();
            goz1.M(0x567C5EFF);
            goz1.M(0xC85AE8F0);
            goz1.M(0x6E3C21FE);
            Object object1 = goz1.j();
            Object object2 = gop.a;
            if(object1 == object2) {
                object1 = sig.a;
                goz1.P(object1);
            }
            goz1.x();
            ibuq.f(((ibts)(((ibwx)object1))), "constructor");
            goz1.M(1114928860);
            Context context1 = (Context)goz1.h(grx0);
            goz1.M(5004770);
            boolean z2 = goz1.X(context1);
            Object object3 = goz1.j();
            if(z2 || object3 == object2) {
                object3 = ((ibts)(((ibwx)object1))).a(context1);
                goz1.P(object3);
            }
            goz1.x();
            goz1.x();
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object4 = goz1.j();
            if(object4 == object2) {
                object4 = sin.a() ? new sio(((sif)object3)).b : new sio(((sif)object3)).a;
                goz1.P(object4);
            }
            goz1.x();
            goz1.x();
            fqc.a(((fen)object0), null, ((geu)object4), gzf.e(0x6F1C8338, new sim(ibtw0), goz1), goz1, 0xC00, 2);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new sij(ibtw0, v);
        }
    }
}

