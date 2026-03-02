import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

public final class joj {
    public static final void a(ibth ibth0, jpq jpq0, ibtw ibtw0, goz goz0, int v, int v1) {
        jpq jpq2;
        jpq jpq1;
        goz goz1 = goz0.ao(0x3145F7AD);
        int v2 = 1;
        int v3 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v3 |= 0x30;
            jpq1 = jpq0;
        }
        else if((v & 0x30) == 0) {
            jpq1 = jpq0;
            v3 |= (goz1.X(jpq1) ? 0x20 : 16);
        }
        else {
            jpq1 = jpq0;
        }
        if((v & 0x180) == 0) {
            v3 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if(goz1.ad((v3 & 0x93) != 0x92, v3 & 1)) {
            jpq2 = (v1 & 2) == 0 ? jpq1 : new jpq(false, false, 7);
            View view0 = (View)goz1.h(AndroidCompositionLocals_androidKt.f);
            jks jks0 = (jks)goz1.h(ipa.d);
            jlm jlm0 = (jlm)goz1.h(ipa.i);
            gpg gpg0 = gol.e(goz1);
            gui gui0 = guf.a(ibtw0, goz1);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = jof.a;
                goz1.P(object0);
            }
            UUID uUID0 = (UUID)had.c(new Object[0], ((ibth)object0), goz1, 0x30);
            int v4 = goz1.X(view0) | goz1.X(jks0);
            Object object2 = goz1.j();
            if(v4 != 0 || object2 == object1) {
                jpu jpu0 = new jpu(ibth0, jpq2, view0, jlm0, jks0, uUID0);
                gze gze0 = new gze(346960332, true, new joe(gui0));
                jpu0.c.b(gpg0, gze0);
                goz1.P(jpu0);
                object2 = jpu0;
            }
            ibom ibom0 = ibom.a;
            boolean z = goz1.Z(((jpu)object2));
            Object object3 = goz1.j();
            if(z || object3 == object1) {
                object3 = new jny(((jpu)object2), null);
                goz1.P(object3);
            }
            gqe.f(ibom0, ((ibtw)object3), goz1);
            boolean z1 = goz1.Z(((jpu)object2));
            Object object4 = goz1.j();
            if(z1 || object4 == object1) {
                object4 = new joa(((jpu)object2));
                goz1.P(object4);
            }
            gqe.c(((jpu)object2), ((ibts)object4), goz1);
            int v5 = goz1.Z(((jpu)object2));
            if((v3 & 0x70) != 0x20) {
                v2 = 0;
            }
            Object object5 = goz1.j();
            if((v5 | ((v3 & 14) == 4 ? 1 : 0) | v2 | goz1.V(jlm0.ordinal())) != 0 || object5 == object1) {
                object5 = new job(((jpu)object2), ibth0, jpq2, jlm0);
                goz1.P(object5);
            }
            gqe.h(((ibth)object5), goz1);
        }
        else {
            goz1.G();
            jpq2 = jpq1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new joc(ibth0, jpq2, ibtw0, v, v1);
        }
    }

    public static final void b(hfc hfc0, ibtw ibtw0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x4100086B);
        boolean z = true;
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18) {
            z = false;
        }
        if(goz1.ad(z, v1 & 1)) {
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = joh.a;
                goz1.P(object0);
            }
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
            guo.b(goz1, ((iau)object0), iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw1 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            ibtw0.a(goz1, Integer.valueOf(((v1 << 3 & 0x70 | (v1 >> 3 & 14 | 0x180)) << 6 & 0x380 | 6) >> 6 & 14));
            goz1.z();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new joi(hfc0, ibtw0, v);
        }
    }
}

