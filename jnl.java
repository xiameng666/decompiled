import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.FocusGroupPropertiesElement;
import androidx.compose.ui.viewinterop.FocusTargetInteropElement;
import androidx.compose.ui.viewinterop.FocusTargetPropertiesElement;

public final class jnl {
    public static final ibts a;

    static {
        jnl.a = jne.a;
    }

    public static final jmw a(ify ify0) {
        jmw jmw0 = ify0.k;
        if(jmw0 != null) {
            return jmw0;
        }
        hxt.b("Required value was null.");
        throw new ibnm();
    }

    public static final void b(ibts ibts0, hfc hfc0, ibts ibts1, goz goz0, int v, int v1) {
        ibts ibts4;
        hfc hfc1;
        ibts ibts3;
        goz goz1 = goz0.ao(0x95ADE287);
        boolean z = true;
        int v2 = (v & 6) == 0 ? (goz1.Z(ibts0) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibts1) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92) {
            z = false;
        }
        if(goz1.ad(z, v2 & 1)) {
            if((v1 & 2) != 0) {
                hfc0 = hfc.e;
            }
            ibts ibts2 = (v1 & 4) == 0 ? ibts1 : jnl.a;
            ibts3 = ibts0;
            jnl.c(ibts3, hfc0, jnl.a, ibts2, goz1, v2 & 14 | 0xC00 | v2 & 0x70 | 0xE000 & v2 << 6);
            hfc1 = hfc0;
            ibts4 = ibts2;
        }
        else {
            ibts3 = ibts0;
            goz1.G();
            ibts4 = ibts1;
            hfc1 = hfc0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new jna(ibts3, hfc1, ibts4, v, v1);
        }
    }

    public static final void c(ibts ibts0, hfc hfc0, ibts ibts1, ibts ibts2, goz goz0, int v) {
        lps lps1;
        gzk gzk1;
        orl orl1;
        int v6;
        goz goz1 = goz0.ao(-180024211);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibts0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        int v2 = (v & 0xC00) == 0 ? v1 | 0x180 | (goz1.Z(ibts1) ? 0x800 : 0x400) : v1 | 0x180;
        if((v & 0x6000) == 0) {
            v2 |= (goz1.Z(ibts2) ? 0x4000 : 0x2000);
        }
        if(goz1.ad((v2 & 9363) != 9362, v2 & 1)) {
            int v3 = jmz.a(gol.c(goz1));
            hfc hfc1 = hew.c(goz1, hfc0.a(FocusGroupPropertiesElement.a).a(FocusTargetNode.FocusTargetElement.a).a(FocusTargetPropertiesElement.a).a(FocusTargetInteropElement.a));
            jks jks0 = (jks)goz1.h(ipa.d);
            jlm jlm0 = (jlm)goz1.h(ipa.i);
            gzk gzk0 = goz1.ak();
            lps lps0 = (lps)goz1.h(ltr.a);
            orl orl0 = (orl)goz1.h(orq.a);
            goz1.M(1314800527);
            int v4 = jmz.a(gol.c(goz1));
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            gpg gpg0 = gol.e(goz1);
            haq haq0 = (haq)goz1.h(hau.a);
            View view0 = (View)goz1.h(AndroidCompositionLocals_androidKt.f);
            int v5 = goz1.Z(context0) | (((v2 & 14 ^ 6) <= 4 || !goz1.X(ibts0)) && (v2 & 6) != 4 ? 0 : 1) | goz1.Z(gpg0) | goz1.Z(haq0) | goz1.V(v4) | goz1.Z(view0);
            Object object0 = goz1.j();
            if(v5 == 0 && object0 != gop.a) {
                v6 = v3;
                orl1 = orl0;
                gzk1 = gzk0;
                lps1 = lps0;
            }
            else {
                v6 = v3;
                orl1 = orl0;
                gzk1 = gzk0;
                lps1 = lps0;
                jnf jnf0 = new jnf(context0, ibts0, gpg0, haq0, v4, view0);
                goz1.P(jnf0);
                object0 = jnf0;
            }
            if(!(goz1.a instanceof ijo)) {
                gol.a();
            }
            goz1.L();
            if(goz1.x) {
                goz1.t(((ibth)object0));
            }
            else {
                goz1.T();
            }
            guo.b(goz1, gzk1, iej.d);
            guo.b(goz1, hfc1, jng.a);
            guo.b(goz1, jks0, jnh.a);
            guo.b(goz1, lps1, jni.a);
            guo.b(goz1, orl1, jnj.a);
            guo.b(goz1, jlm0, jnk.a);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer0 = v6;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.b(goz1, ibts2, jnb.a);
            guo.b(goz1, ibts1, jnc.a);
            goz1.z();
            goz1.x();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new jnd(ibts0, hfc0, ibts1, ibts2, v);
        }
    }
}

