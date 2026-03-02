import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ddht {
    public static final void a(String s, long v, float f, ibtx ibtx0, goz goz0, int v1) {
        hmai hmai0;
        goz goz2;
        goz goz1 = goz0.ao(0x4F842AD0);
        int v2 = (v1 & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.W(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.U(f) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (goz1.Z(ibtx0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hey hey0 = hfc.e;
            iau iau0 = dhw.a(hei.e, false);
            long v3 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hey0);
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
            guo.b(goz1, hfc0, iej.c);
            dic dic0 = dic.a;
            goz1.M(2106806370);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            int v5 = ibvr.c(((jks)goz1.h(ipa.d)).eg(f));
            long v6 = hvqs.a.aT().bz();
            if(v6 == 0L) {
                hmai0 = hmai.a;
            }
            else if(v6 == 1L) {
                hmai0 = hmai.b;
            }
            else {
                hmai0 = v6 == 2L ? hmai.c : hmai.d;
            }
            int v7 = v2 >> 3 & 14 | v2 << 3 & 0x70 | v2 & 0x380;
            goz1.M(-1633490746);
            int v8 = ((v7 & 14 ^ 6) <= 4 || !goz1.W(v)) && (v7 & 6) != 4 ? 0 : 1;
            Object object0 = goz1.j();
            if((v8 | goz1.V(hmai0.ordinal())) != 0 || object0 == gop.a) {
                fgei fgei0 = new fgei();
                fgei0.c();
                fgei0.b = 2;
                fgei0.a = 1;
                fgei0.d(hln.b(v));
                fgei0.b();
                fgei0.c = hmai0;
                object0 = fgei0.a(context0);
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(0x97EA02AA);
            int v9 = goz1.X(((fgej)object0)) | (((v7 & 0x70 ^ 0x30) <= 0x20 || !goz1.X(s)) && (v7 & 0x30) != 0x20 ? 0 : 1) | goz1.V(v5);
            Object object1 = goz1.j();
            if(v9 != 0 || object1 == gop.a) {
                object1 = ((fgej)object0).a(s, v5);
                goz1.P(object1);
            }
            goz1.x();
            ibuq.c(((Bitmap)object1));
            goz1.x();
            tzc.b(((Bitmap)object1), null, dls.k(hey0, f), null, null, 0.0f, null, tzc.a(dddb.a), null, null, goz1, 0x30, 888);
            goz2 = goz1;
            goz2.M(0xA1583850);
            ibtx0.a(dic0, goz2, Integer.valueOf(v2 >> 6 & 0x70 | 6));
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddhs(s, v, f, ibtx0, v1);
        }
    }
}

