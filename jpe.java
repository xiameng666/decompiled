import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

public final class jpe {
    private static final grx a;

    static {
        jpe.a = new gqc(gul.a, jok.a);
    }

    public static final int a(jqg jqg0, boolean z) {
        return z ? jqg0.a | 0x2000 : jqg0.a & 0xFFFFDFFF;
    }

    public static final boolean b(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getRootView().getLayoutParams();
        WindowManager.LayoutParams windowManager$LayoutParams0 = (viewGroup$LayoutParams0 instanceof WindowManager.LayoutParams) ? ((WindowManager.LayoutParams)viewGroup$LayoutParams0) : null;
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x2000) != 0;
    }

    public static final void c(jqe jqe0, ibth ibth0, jqg jqg0, ibtw ibtw0, goz goz0, int v, int v1) {
        int v3;
        String s1;
        ibth ibth1;
        jqe jqe1 = jqe0;
        goz goz1 = goz0.ao(0x96600711);
        int v2 = (v & 6) == 0 ? (goz1.X(jqe1) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            ibth1 = ibth0;
        }
        else if((v & 0x30) == 0) {
            ibth1 = ibth0;
            v2 |= (goz1.Z(ibth1) ? 0x20 : 16);
        }
        else {
            ibth1 = ibth0;
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.X(jqg0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if(goz1.ad((v2 & 0x493) != 1170, v2 & 1)) {
            ibth ibth2 = (v1 & 2) == 0 ? ibth1 : null;
            View view0 = (View)goz1.h(AndroidCompositionLocals_androidKt.f);
            jks jks0 = (jks)goz1.h(ipa.d);
            String s = (String)goz1.h(jpe.a);
            jlm jlm0 = (jlm)goz1.h(ipa.i);
            gpg gpg0 = gol.e(goz1);
            gui gui0 = guf.a(ibtw0, goz1);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = jow.a;
                goz1.P(object0);
            }
            UUID uUID0 = (UUID)had.c(new Object[0], ((ibth)object0), goz1, 0x30);
            Object object2 = goz1.j();
            if(object2 == object1) {
                s1 = s;
                jqc jqc0 = new jqc(ibth2, jqg0, view0, jks0, jqe0, uUID0);
                ibth1 = ibth2;
                jqe1 = jqe0;
                v3 = 1;
                jqc0.k(gpg0, new gze(-297523940, true, new joz(jqc0, gui0)));
                goz1.P(jqc0);
                jlm0 = jlm0;
                object2 = jqc0;
            }
            else {
                v3 = 1;
                ibth1 = ibth2;
                s1 = s;
                jqe1 = jqe0;
            }
            int v4 = (v2 & 0x70) == 0x20 ? 1 : 0;
            int v5 = (v2 & 0x380) == 0x100 ? 1 : 0;
            int v6 = goz1.Z(((jqc)object2)) | v4 | v5 | goz1.X(s1);
            Object object3 = goz1.j();
            if((v6 | goz1.V(jlm0.ordinal())) != 0 || object3 == object1) {
                object3 = new jom(((jqc)object2), ibth1, jqg0, jlm0);
                goz1.P(object3);
            }
            gqe.c(((jqc)object2), ((ibts)object3), goz1);
            int v7 = goz1.Z(((jqc)object2)) | v4 | v5 | goz1.X(s1);
            Object object4 = goz1.j();
            if((v7 | goz1.V(jlm0.ordinal())) != 0 || object4 == object1) {
                object4 = new jon(((jqc)object2), ibth1, jqg0, jlm0);
                goz1.P(object4);
            }
            gqe.h(((ibth)object4), goz1);
            int v8 = goz1.Z(((jqc)object2));
            if((v2 & 14) != 4) {
                v3 = 0;
            }
            Object object5 = goz1.j();
            if((v8 | v3) != 0 || object5 == object1) {
                object5 = new jop(((jqc)object2), jqe1);
                goz1.P(object5);
            }
            gqe.c(jqe1, ((ibts)object5), goz1);
            boolean z = goz1.Z(((jqc)object2));
            Object object6 = goz1.j();
            if(z || object6 == object1) {
                object6 = new jor(((jqc)object2), null);
                goz1.P(object6);
            }
            gqe.f(((jqc)object2), ((ibtw)object6), goz1);
            hey hey0 = hfc.e;
            boolean z1 = goz1.Z(((jqc)object2));
            Object object7 = goz1.j();
            if(z1 || object7 == object1) {
                object7 = new jos(((jqc)object2));
                goz1.P(object7);
            }
            hfc hfc0 = ibf.a(hey0, ((ibts)object7));
            int v9 = goz1.Z(((jqc)object2));
            Object object8 = goz1.j();
            if((v9 | goz1.V(jlm0.ordinal())) != 0 || object8 == object1) {
                object8 = new jou(((jqc)object2), jlm0);
                goz1.P(object8);
            }
            long v10 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth3 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth3);
            }
            else {
                goz1.T();
            }
            int v11 = (int)(v10 ^ v10 >>> 0x20);
            guo.b(goz1, ((iau)object8), iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw1 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v11))) {
                Integer integer0 = v11;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            goz1.z();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new jov(jqe1, ibth1, jqg0, ibtw0, v, v1);
        }
    }
}

