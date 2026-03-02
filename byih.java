import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class byih {
    public static final void a(boolean z, ibtw ibtw0, goz goz0, int v) {
        boolean z1;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0x8518D5);
        int v1 = (v & 6) == 0 ? v | 2 : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
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
            fen fen0 = z1 ? flg.b(context0) : flg.c(context0);
            goz1.M(5004770);
            boolean z2 = goz1.X(context0);
            Object object0 = goz1.j();
            if(z2 || object0 == gop.a) {
                ibuq.f(context0, "context");
                object0 = new byim(byik.a(context0, byil.a), byik.a(context0, byil.b));
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(5004770);
            boolean z3 = goz1.X(((byim)object0));
            Object object1 = goz1.j();
            if(!z3 && object1 != gop.a) {
                z = z1;
            }
            else {
                byio byio0 = new byio(new byij(new byin(((byim)object0))));
                z = z1;
                geu geu0 = new geu(byio0.d, byio0.e, byio0.f, byio0.g, byio0.h, byio0.i, byio0.m, byio0.n, byio0.o, byio0.a, byio0.b, byio0.c, byio0.j, byio0.k, byio0.l, byio0.d, byio0.e, byio0.f, byio0.g, byio0.h, byio0.i, byio0.m, byio0.n, byio0.o, byio0.a, byio0.b, byio0.c, byio0.j, byio0.k, byio0.l);
                goz1.P(geu0);
                object1 = geu0;
            }
            goz1.x();
            fqc.a(fen0, null, ((geu)object1), gzf.e(-2003752279, new byig(ibtw0), goz1), goz1, 0xC00, 2);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byie(z, ibtw0, v);
        }
    }
}

