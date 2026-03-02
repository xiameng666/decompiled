import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ddxv {
    public static final ddxw a(goz goz0) {
        return (ddxw)goz0.h(ddxy.a);
    }

    public static final deaa b(goz goz0) {
        return (deaa)goz0.h(deac.a);
    }

    public static final void c(boolean z, ibtw ibtw0, goz goz0, int v) {
        goz goz2;
        fen fen0;
        geu geu0;
        boolean z1;
        ibtw ibtw1;
        goz goz1 = goz0.ao(0x1CF8C41E);
        int v1 = (v & 6) == 0 ? v | 2 : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            ibtw1 = ibtw0;
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
            goz1.M(0xED43BBA0);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            goz1.M(5004770);
            boolean z2 = goz1.Y(z1);
            Object object0 = goz1.j();
            if(z2 || object0 == gop.a) {
                object0 = z1 ? firh.b(context0) : firh.c(context0);
                goz1.P(object0);
            }
            goz1.x();
            goz1.x();
            if(hvod.a.b().d()) {
                z = z1;
                geu0 = fisi.c(null, -1);
                fen0 = (fen)object0;
                goz2 = goz1;
            }
            else {
                z = z1;
                fen0 = (fen)object0;
                goz2 = goz1;
                ibuq.f(fiwo.d, "displayLarge");
                ibuq.f(fiwo.e, "displayMedium");
                ibuq.f(fiwo.f, "displaySmall");
                ibuq.f(fiwo.g, "headlineLarge");
                ibuq.f(fiwo.h, "headlineMedium");
                ibuq.f(fiwo.i, "headlineSmall");
                ibuq.f(fiwo.m, "titleLarge");
                ibuq.f(fiwo.n, "titleMedium");
                ibuq.f(fiwo.o, "titleSmall");
                ibuq.f(fiwo.a, "bodyLarge");
                ibuq.f(fiwo.b, "bodyMedium");
                ibuq.f(fiwo.c, "bodySmall");
                ibuq.f(fiwo.j, "labelLarge");
                ibuq.f(fiwo.k, "labelMedium");
                ibuq.f(fiwo.l, "labelSmall");
                ibuq.f(fiwn.d, "displayLargeEmphasized");
                ibuq.f(fiwn.e, "displayMediumEmphasized");
                ibuq.f(fiwn.f, "displaySmallEmphasized");
                ibuq.f(fiwn.g, "headlineLargeEmphasized");
                ibuq.f(fiwn.h, "headlineMediumEmphasized");
                ibuq.f(fiwn.i, "headlineSmallEmphasized");
                ibuq.f(fiwn.m, "titleLargeEmphasized");
                ibuq.f(fiwn.n, "titleMediumEmphasized");
                ibuq.f(fiwn.o, "titleSmallEmphasized");
                ibuq.f(fiwn.a, "bodyLargeEmphasized");
                ibuq.f(fiwn.b, "bodyMediumEmphasized");
                ibuq.f(fiwn.c, "bodySmallEmphasized");
                ibuq.f(fiwn.j, "labelLargeEmphasized");
                ibuq.f(fiwn.k, "labelMediumEmphasized");
                ibuq.f(fiwn.l, "labelSmallEmphasized");
                geu0 = new geu(fiwo.d, fiwo.e, fiwo.f, fiwo.g, fiwo.h, fiwo.i, fiwo.m, fiwo.n, fiwo.o, fiwo.a, fiwo.b, fiwo.c, fiwo.j, fiwo.k, fiwo.l, fiwn.d, fiwn.e, fiwn.f, fiwn.g, fiwn.h, fiwn.i, fiwn.m, fiwn.n, fiwn.o, fiwn.a, fiwn.b, fiwn.c, fiwn.j, fiwn.k, fiwn.l);
            }
            ibtw1 = ibtw0;
            goz1 = goz2;
            fisd.a(fen0, null, null, geu0, gzf.e(0xC48E04DF, new ddxu(ibtw1), goz1), goz1, 0x6000);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddxs(z, ibtw1, v);
        }
    }
}

