import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fujs {
    public static final void a(hfc hfc0, fujt fujt0, goz goz0, int v, int v1) {
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(0xDED593C);
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
            v2 |= (goz1.Z(fujt0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc2 = v1 == 0 ? hfc1 : hfc.e;
            long v3 = feq.f(hll.h, goz1);
            long v4 = hll.h(feq.f(hll.h, goz1), 0.38f);
            fcp fcp0 = fcq.c(fpu.a(goz1)).c(hll.h, v3, hll.i, v4);
            gze gze0 = gzf.e(0x91421A65, new fujr(fujt0), goz1);
            fdb.d(fujt0.c, hfc2, false, fye.b, fcp0, null, null, gze0, goz1, v2 << 3 & 0x70 | 0x6000000);
            hfc1 = hfc2;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fujq(hfc1, fujt0, v, v1);
        }
    }

    public static final void b(fujo fujo0, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(951102004);
        int v1 = (v & 6) == 0 ? (goz1.X(fujo0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_33;
        }
        if((fujo0 instanceof fujm)) {
            hfc1 = dls.o(hfc0, 24.0f);
        }
        else {
            if(!(fujo0 instanceof fujn)) {
                throw new ibnq();
            }
            hfc1 = dls.e(dls.o(hfc0, 24.0f), 16.0f);
        }
        if((fujo0 instanceof fujm)) {
            goz1.M(380928925);
            fujj.b(hfc1, ((fujm)fujo0).a, goz1, 0x40, 0);
            goz1.x();
            goto label_33;
        }
        if((fujo0 instanceof fujn)) {
            goz1.M(381023630);
            fryk fryk0 = ((fujn)fujo0).a;
            fryv fryv0 = ((fujn)fujo0).b;
            goz1.M(0xCF2F372E);
            hlm hlm0 = null;
            CharSequence charSequence0 = fryv0 == null ? null : fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            frxs frxs0 = ((fujn)fujo0).c;
            String s = String.valueOf(charSequence0);
            goz1.M(0xCF2F3F90);
            if(frxs0 != null) {
                hlm0 = frxs0.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            }
            goz1.x();
            ftyy.b(fryk0, s, hfc1, null, null, 0.0f, hlm0, goz1, 0, 56);
            goz1.x();
        label_33:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new fujp(fujo0, hfc0, v);
            }
            return;
        }
        goz1.M(0xCF2F1842);
        goz1.x();
        throw new ibnq();
    }
}

