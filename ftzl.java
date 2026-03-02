import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ftzl {
    public static final boolean a(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final void b(hfc hfc0, ftzf ftzf0, float f, goz goz0, int v) {
        float f1;
        hfc hfc1;
        ibuq.f(ftzf0, "state");
        goz goz1 = goz0.ao(0xD5389845);
        int v1 = v | 6;
        int v2 = 1;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftzf0) ? 0x20 : 16);
        }
        if(((v1 | 0xD80) & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            f1 = f;
            goto label_65;
        }
        else {
            hfc1 = hfc.e;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            if(fryw.a(ftzf0.a, context0)) {
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new ftzg(hfc1, ftzf0, v);
                }
            }
            else {
                boolean z = goz1.h(ipa.i) == jlm.b;
                hfc hfc2 = iqn.a(hfc1, "RouteLeg");
                gze gze0 = gzf.e(0x9C1B2DF7, new ftzi(ftzf0, z, ((gra)object0)), goz1);
                int v3 = (v1 | 0xD80) >> 3;
                goz1.M(0xDF414975);
                hfc hfc3 = dla.j(hfc2, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                goz1.M(0x97EA02AA);
                int v4 = v3 & 0x380 | (v3 & 0x70 | 0xC00);
                f1 = 8.0f;
                int v5 = (v4 & 0x380 ^ 0x180) <= 0x100 || !goz1.U(8.0f) ? 0 : 1;
                if((v4 & 0x70 ^ 0x30) <= 0x20 || !goz1.U(0.0f)) {
                    v2 = 0;
                }
                Object object2 = goz1.j();
                if((v5 | v2) != 0 || object2 == object1) {
                    object2 = new ftzk(((gra)object0));
                    goz1.P(object2);
                }
                goz1.x();
                long v6 = gol.c(goz1);
                gzk gzk0 = goz1.ak();
                hfc hfc4 = hew.c(goz1, hfc3);
                ibth ibth0 = iej.a;
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                int v7 = (int)(v6 ^ v6 >>> 0x20);
                guo.b(goz1, ((iau)object2), iej.e);
                guo.b(goz1, gzk0, iej.d);
                ibtw ibtw0 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                    Integer integer0 = v7;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc4, iej.c);
                gze0.a(goz1, Integer.valueOf(6));
                goz1.z();
                goz1.x();
            label_65:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new ftzh(hfc1, ftzf0, f1, v);
                }
            }
        }
    }
}

