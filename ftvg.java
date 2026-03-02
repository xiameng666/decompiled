import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ftvg {
    public static final void a(hfc hfc0, ftvk ftvk0, goz goz0, int v, int v1) {
        long v4;
        crk crk0;
        hfc hfc1;
        int v2;
        ibuq.f(ftvk0, "state");
        goz goz1 = goz0.ao(0x4F229626);
        if(v1 != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(ftvk0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_57;
        }
        if(v1 != 0) {
            hfc1 = hfc.e;
        }
        eag eag0 = eah.b(100.0f);
        goz1.M(0x10D5BAE2);
        if((ftvk0 instanceof ftvi)) {
            ftvi ftvi0 = (ftvi)ftvk0;
            goz1.M(0x9E5700F);
            ibuq.f(fpu.a(goz1), "<this>");
            goz1.M(0xF56D8F9A);
            long v3 = csd.a(goz1) ? 0xFF8E918FL : 0xFF747775L;
            goz1.x();
            goz1.x();
            crk0 = crl.a(1.0f, v3 << 0x20);
        }
        else {
            crk0 = null;
        }
        goz1.x();
        if((ftvk0 instanceof ftvi)) {
            goz1.M(0x10D5FC65);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            v4 = ((ftvi)ftvk0).a.a(context0);
            goz1.x();
            goto label_54;
        }
        if((ftvk0 instanceof ftvj)) {
            goz1.M(0x10D60855);
            ibuq.f(fpu.a(goz1), "<this>");
            goz1.M(851240874);
            v4 = (csd.a(goz1) ? 0xFF0F5223L : 0xFFC4EED0L) << 0x20;
            goz1.x();
            goz1.x();
            goto label_54;
        }
        if((ftvk0 instanceof ftvh)) {
            goz1.M(0x10D61255);
            ibuq.f(fpu.a(goz1), "<this>");
            goz1.M(0xF67CEA22);
            v4 = (csd.a(goz1) ? 0xFF8C1D18L : 0xFFF9DEDCL) << 0x20;
            goz1.x();
            goz1.x();
        label_54:
            hfc1 = hfc1;
            fdb.a(hfc1, eag0, fcq.h(v4, 0L, 0L, 0L, goz1, 14), null, crk0, gzf.e(0x5440D974, new ftvf(ftvk0), goz1), goz1, v2 & 14 | 0x30000, 8);
            goz1 = goz1;
        label_57:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new ftve(hfc1, ftvk0, v, v1);
            }
            return;
        }
        goz1.M(0x10D5F41B);
        goz1.x();
        throw new ibnq();
    }
}

