import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class byky {
    public static final void a(goz goz0, int v) {
        goz goz1 = goz0.ao(0xE994AC98);
        if(v == 0) {
            v = 0;
            if(goz1.ac()) {
                goz1.G();
                goto label_9;
            }
            goto label_6;
        }
        else {
        label_6:
            long v1 = fpu.a(goz1).p;
            long v2 = hln.i(1.0f - hll.d(v1), 1.0f - hll.c(v1), 1.0f - hll.b(v1), 0.0f, null, 24);
            fwy.g(cvc.a(dls.k(hfc.e, 80.0f)), v2, 0.0f, 0L, 0, 0.0f, goz1, 6, 60);
        }
    label_9:
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bykw(v);
        }
    }

    public static final void b(goz goz0, int v) {
        goz goz1 = goz0.ao(0x4504BBC3);
        int v1 = 0;
        if(v != 0) {
        label_8:
            float f = (float)((Configuration)goz1.h(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            hfc hfc0 = dls.e(dls.w(hfc.e), f * 0.4f);
            iau iau0 = dhw.a(hei.e, false);
            long v2 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            byky.a(goz1, 0);
            goz1.z();
            v1 = v;
        }
        else if(!goz1.ac()) {
            v = 0;
            goto label_8;
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bykx(v1);
        }
    }
}

