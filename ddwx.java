import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ddwx {
    public static final void a(ibty ibty0, ibty ibty1, goz goz0, int v) {
        goz goz1 = goz0.ao(0x670EBFEB);
        int v1 = goz1.b();
        int v2 = (v & 6) == 0 ? (goz1.Z(ibty0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibty1) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_89;
        }
        else {
            boolean z = bbnp.n(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new ParcelableSnapshotMutableIntState(1);
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new ParcelableSnapshotMutableIntState(1);
                goz1.P(object2);
            }
            goz1.x();
            if(!z && (ibty0 == null || ibty1 == null || ((gtl)object0).e() <= 1 && ((gtl)object2).e() <= 1)) {
                goz1.M(-310543071);
                hey hey0 = hfc.e;
                ddxv.b(goz1);
                hfc hfc0 = dls.w(dla.i(hey0, 16.0f, 0.0f, 2));
                iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
                long v3 = gol.c(goz1);
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
                int v4 = (int)(v3 ^ v3 >>> 0x20);
                guo.b(goz1, iau0, iej.e);
                guo.b(goz1, gzk0, iej.d);
                ibtw ibtw0 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                    Integer integer0 = v4;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc1, iej.c);
                dlq dlq0 = dlq.a;
                goz1.M(0xEBCC15D);
                goz1.M(2086185866);
                if(ibty0 != null) {
                    hfc hfc2 = dlo.a(dlq0, hey0, 1.0f);
                    goz1.M(5004770);
                    Object object3 = goz1.j();
                    if(object3 == object1) {
                        object3 = new ddwq(((gtl)object0));
                        goz1.P(object3);
                    }
                    goz1.x();
                    ibty0.a(hfc2, ((ibts)object3), goz1, Integer.valueOf(v2 << 6 & 0x380 | 0x30));
                }
                goz1.x();
                if(ibty1 == null) {
                    goz1.D(v1);
                    gsb gsb0 = goz1.af();
                    if(gsb0 != null) {
                        gsb0.d = new ddwr(ibty0, v);
                    }
                }
                else {
                    goz1.M(2086190083);
                    if(ibty0 != null) {
                        ddxv.b(goz1);
                        dlv.a(dls.o(hey0, 8.0f), goz1);
                    }
                    goz1.x();
                    hfc hfc3 = dlo.a(dlq0, hey0, 1.0f);
                    goz1.M(5004770);
                    Object object4 = goz1.j();
                    if(object4 == object1) {
                        object4 = new ddws(((gtl)object2));
                        goz1.P(object4);
                    }
                    goz1.x();
                    ibty1.a(hfc3, ((ibts)object4), goz1, Integer.valueOf(v2 << 3 & 0x380 | 0x30));
                    goz1.x();
                    goz1.z();
                    goz1.x();
                    goto label_89;
                }
            }
            else {
                goz1.M(-310874926);
                ddxv.b(goz1);
                dhf dhf0 = dho.h(8.0f, hei.o);
                ddxv.b(goz1);
                djr.e(dls.w(dla.i(hfc.e, 16.0f, 0.0f, 2)), dhf0, null, null, 0, 0, gzf.e(640500075, new ddww(ibty0, ibty1), goz1), goz1, 0x180000, 60);
                goz1.x();
            label_89:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new ddwt(ibty0, ibty1, v);
                }
            }
        }
    }
}

