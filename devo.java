import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.format.Formatter;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.nearby.sharing.ShareTargetAction;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class devo {
    public static final void A(deco deco0, ibts ibts0, goz goz0, int v) {
        hpw hpw1;
        hpw hpw0;
        goz goz1 = goz0.ao(0xDEAFA5B0);
        int v1 = (v & 6) == 0 ? (goz1.V(deco0.ordinal()) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(deco0 == deco.b) {
                goz1.M(977595209);
                hpw0 = ism.a(0x7F080555, goz1, 0);  // drawable:gs_download_2_fill1_vd_theme_24
            }
            else {
                goz1.M(0x3A461CAF);
                hpw0 = ism.a(0x7F080556, goz1, 0);  // drawable:gs_download_2_vd_theme_24
            }
            goz1.x();
            if(deco0 == deco.a) {
                goz1.M(977808427);
                hpw1 = ism.a(0x7F08066B, goz1, 0);  // drawable:gs_upload_2_fill1_vd_theme_24
            }
            else {
                goz1.M(0x3A4955D1);
                hpw1 = ism.a(0x7F08066C, goz1, 0);  // drawable:gs_upload_2_vd_theme_24
            }
            goz1.x();
            fite.a(null, fpu.a(goz1).G, 0L, 0.0f, null, gzf.e(0x81F0D0A9, new devc(deco0, ibts0, hpw0, hpw1), goz1), goz1, 0x30000);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deqv(deco0, ibts0, v);
        }
    }

    public static final void B(fzp fzp0, String s, ibth ibth0, ibth ibth1, goz goz0, int v) {
        ibth ibth2;
        int v2;
        fzp fzp1;
        goz goz1 = goz0.ao(0xF1C6CEB8);
        int v1 = 1;
        if((v & 6) == 0) {
            fzp1 = fzp0;
            v2 = (goz1.X(fzp1) ? 4 : 2) | v;
        }
        else {
            fzp1 = fzp0;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            ibth2 = ibth1;
            v2 |= (goz1.Z(ibth2) ? 0x800 : 0x400);
        }
        else {
            ibth2 = ibth1;
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s1 = isq.c(0x7F1508FA, goz1);  // string:common_undo "Undo"
            ibom ibom0 = ibom.a;
            goz1.M(-1224400529);
            int v3 = ((v2 & 14) == 4 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | goz1.X(s1);
            if((v2 & 0x1C00) != 0x800) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v3 | ((v2 & 0x380) == 0x100 ? 1 : 0) | v1) != 0 || object0 == gop.a) {
                devg devg0 = new devg(fzp1, s, s1, ibth0, ibth2, null);
                goz1.P(devg0);
                object0 = devg0;
            }
            goz1.x();
            gqe.f(ibom0, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derl(fzp0, s, ibth0, ibth1, v);
        }
    }

    public static final void C(fzp fzp0, ibts ibts0, ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(1110558274);
        int v1 = (v & 6) == 0 ? (goz1.X(fzp0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x407E6, gzf.e(0xF1993700, new devl(fzp0, ibts0, ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deqt(fzp0, ibts0, ibth0, v);
        }
    }

    public static final void D(gei gei0, ibth ibth0, ibtw ibtw0, goz goz0, int v) {
        ibtw ibtw1;
        gei gei1;
        ibuq.f(gei0, "tooltipState");
        ibuq.f(ibth0, "onSeeTipsClick");
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0x63DCF759);
        int v1 = (v & 6) == 0 ? (goz1.Z(gei0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            gei1 = gei0;
            ibtw1 = ibtw0;
            goto label_31;
        }
        else {
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = gqe.a(ibru.a, goz1);
                goz1.P(object0);
            }
            goz1.M(0xE07CA303);
            int v2 = v1 & 14 | 0x6E00 | v1 << 12 & 0x380000;
            if(hvod.e()) {
                delc.c(gei0, isq.c(0x7F150DE5, goz1), ism.a(0x7F080EEC, goz1, 0), gzf.e(-286360501, new desq(((icck)object0), gei0, ibth0), goz1), -10.0f, ibtw0, goz1, v2, 0x20);  // string:discovery_tip_text "Ask the other person to swipe down from the top of their 
                                                                                                                                                                                    // screen and open Quick Share"
                goz1.x();
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new derd(gei0, ibth0, ibtw0, v);
                }
            }
            else {
                gei1 = gei0;
                ibtw1 = ibtw0;
                goz1.x();
                delc.c(gei1, isq.c(0x7F150DE5, goz1), ism.a(0x7F080EEC, goz1, 0), gzf.e(0xBC1E0CC6, new dest(((icck)object0), gei1), goz1), -10.0f, ibtw1, goz1, v2, 0x20);  // string:discovery_tip_text "Ask the other person to swipe down from the top of their 
                                                                                                                                                                             // screen and open Quick Share"
            label_31:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new dere(gei1, ibth0, ibtw1, v);
                }
            }
        }
    }

    public static final void E(devp devp0, ibts ibts0, ibts ibts1, gei gei0, goz goz0, int v) {
        ibts ibts2 = ibts0;
        goz goz1 = goz0.ao(0x1A719702);
        int v1 = (v & 6) == 0 ? (goz1.Z(devp0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts2) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(gei0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = gqe.a(ibru.a, goz1);
                goz1.P(object0);
            }
            gei gei1 = geb.c(true, goz1, 0x30, 5);
            goz1.M(5004770);
            boolean z = goz1.Z(devp0);
            Object object2 = goz1.j();
            if(z || object2 == object1) {
                object2 = new deqw(devp0);
                goz1.P(object2);
            }
            goz1.x();
            gra gra0 = (gra)had.c(new Object[0], ((ibth)object2), goz1, 0);
            goz1.M(5004770);
            Object object3 = goz1.j();
            if((v1 & 0x380) == 0x100 || object3 == object1) {
                object3 = new deqx(ibts1);
                goz1.P(object3);
            }
            boolean z1 = false;
            goz1.x();
            ibts2 = ibts0;
            devo.D(gei1, ((ibth)object3), gzf.e(0x23103F5D, new deut(gra0, ibts1, ((icck)object0), gei1, ibts0), goz1), goz1, 0x180);
            dfgj dfgj0 = devp0.d;
            List list0 = ibpo.ak(dfgj0.a, dfgj0.b);
            if(!list0.isEmpty()) {
                for(Object object4: list0) {
                    if(!(((dffg)object4).h instanceof dffq)) {
                        z1 = true;
                        break;
                    }
                }
            }
            goz1.M(1147700429);
            if(devo.n(gra0) && !devp0.f.isEmpty() && !z1 && !dfgj0.c) {
                ibom ibom0 = ibom.a;
                goz1.M(-1633490746);
                int v2 = goz1.Z(gei1) | ((v1 & 0x70) == 0x20 ? 1 : 0);
                Object object5 = goz1.j();
                if(v2 != 0 || object5 == object1) {
                    object5 = new deuu(ibts2, gei1, null);
                    goz1.P(object5);
                }
                goz1.x();
                gqe.f(ibom0, ((ibtw)object5), goz1);
            }
            goz1.x();
            if(devp0.f.isEmpty() && !z1) {
                ibom ibom1 = ibom.a;
                goz1.M(5004770);
                boolean z2 = goz1.Z(gei0);
                Object object6 = goz1.j();
                if(z2 || object6 == object1) {
                    object6 = new deuv(gei0, null);
                    goz1.P(object6);
                }
                goz1.x();
                gqe.f(ibom1, ((ibtw)object6), goz1);
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deqz(devp0, ibts2, ibts1, gei0, v);
        }
    }

    public static final void F(ibth ibth0, ibth ibth1, goz goz0, int v) {
        goz goz1 = goz0.ao(0xA2AD0445);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40947, gzf.e(0xDAF5B83, new desg(ibth1, ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dera(ibth0, ibth1, v);
        }
    }

    public static final void G(List list0, ibth ibth0, gei gei0, hfc hfc0, ibth ibth1, boolean z, goz goz0, int v) {
        goz goz1 = goz0.ao(0x59A0F5AC);
        int v1 = (v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(gei0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Y(z) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = deps.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth2 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth2);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            if(list0.isEmpty()) {
                goz1.M(0xC0C42F2C);
                demb.f(gei0, ibth0, goz1, v1 & 0x70 | v1 >> 6 & 14);
            }
            else {
                goz1.M(-1060793397);
                demb.h(list0, ibth1, z, goz1, v1 >> 9 & 0x380 | (v1 & 14 | v1 >> 9 & 0x70));
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derc(list0, ibth0, gei0, hfc0, ibth1, z, v);
        }
    }

    public static final void H(dexo dexo0, ibts ibts0, ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x168CEE88);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.V(dexo0.ordinal()) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            Activity activity0 = (Activity)goz1.h(ddyi.a);
            Intent intent0 = activity0 == null ? null : activity0.getIntent();
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            goz1.M(0x97EA02AA);
            if((v2 & 0x70) != 0x20) {
                v1 = 0;
            }
            int v3 = goz1.Z(intent0) | v1 | goz1.Z(context0);
            Object object0 = goz1.j();
            if(v3 != 0 || object0 == gop.a) {
                object0 = new deql(ibts0, intent0, context0);
                goz1.P(object0);
            }
            goz1.x();
            dcvz.a.a().h("QrCloudTroubleShootingDialog for  %s", dexo0);
            cmig.f(0x429FF, gzf.e(0xF2901CC6, new deuo(((ibth)object0), ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deqm(dexo0, ibts0, ibth0, v);
        }
    }

    public static final void I(ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x2F67B54D);
        if((((v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x4094A, gzf.e(0x3023978B, new devf(ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deru(ibth0, v);
        }
    }

    public static final void J(ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x972152AB);
        if((((v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x407E8, gzf.e(0x164C92D, new devj(ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derh(ibth0, v);
        }
    }

    public static final void K(devp devp0, List list0, boolean z, ibts ibts0, ibts ibts1, ibth ibth0, ibts ibts2, goz goz0) {
        devo.p(devp0, list0, z, ibts0, ibts1, ibth0, ibts2, goz0, 0);
    }

    public static final void L(fzp fzp0, ibts ibts0, ibth ibth0, goz goz0) {
        devo.q(fzp0, ibts0, ibth0, goz0, 390);
    }

    public static final void M(fzp fzp0, devp devp0, ibth ibth0, ibth ibth1, goz goz0) {
        devo.s(fzp0, devp0, ibth0, ibth1, goz0, 6);
    }

    public static final void N(devp devp0, ibts ibts0, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, ibth ibth4, ibts ibts1, ibth ibth5, ibth ibth6, ibth ibth7, ibth ibth8, goz goz0) {
        devo.x(devp0, ibts0, ibth0, ibth1, ibth2, ibth3, ibth4, ibts1, ibth5, ibth6, ibth7, ibth8, goz0, 0xC00000, 0);
    }

    public static final void O(devp devp0, ibts ibts0, ibts ibts1, gei gei0, goz goz0) {
        devo.E(devp0, ibts0, ibts1, gei0, goz0, 0);
    }

    public static final void P(fzp fzp0, String s, ibth ibth0, ibth ibth1, goz goz0) {
        devo.B(fzp0, s, ibth0, ibth1, goz0, 0);
    }

    public static final void Q(fzp fzp0, ibts ibts0, ibth ibth0, goz goz0) {
        devo.C(fzp0, ibts0, ibth0, goz0, 390);
    }

    public static final void R(List list0, ibth ibth0, gei gei0, hfc hfc0, ibth ibth1, ibts ibts0, boolean z, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(-2033905436);
        int v1 = (v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        int v2 = (v & 0x6000) == 0 ? v1 | 0xC00 | (goz1.Z(ibth1) ? 0x4000 : 0x2000) : v1 | 0xC00;
        if((0x30000 & v) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v2 |= (goz1.Y(z) ? 0x100000 : 0x80000);
        }
        if((599059 & v2) == 599058 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v3 = deps.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hey0);
            ibth ibth2 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth2);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            if(list0.isEmpty()) {
                goz1.M(0x2714CD87);
                demb.d(ibth0, ibts0, goz1, v2 >> 3 & 14 | v2 >> 12 & 0x70);
            }
            else {
                goz1.M(0x271713BF);
                demb.h(list0, ibth1, z, goz1, v2 >> 9 & 0x70 | v2 & 14 | v2 >> 12 & 0x380);
            }
            goz1.x();
            goz1.z();
            hfc1 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derg(list0, ibth0, gei0, hfc1, ibth1, ibts0, z, v);
        }
    }

    public static final cusz a(gra gra0) {
        return (cusz)gra0.a();
    }

    public static final devp b(gui gui0) {
        return (devp)gui0.a();
    }

    public static final Object c(Context context0, Intent intent0, ibrl ibrl0) {
        devm devm0;
        if((ibrl0 instanceof devm)) {
            devm0 = (devm)ibrl0;
            int v = devm0.b;
            if((v & 0x80000000) == 0) {
                devm0 = new devm(ibrl0);
            }
            else {
                devm0.b = v - 0x80000000;
            }
        }
        else {
            devm0 = new devm(ibrl0);
        }
        Object object0 = devm0.a;
        Object object1 = ibrx.a;
        switch(devm0.b) {
            case 0: {
                ibnx.b(object0);
                ibrt ibrt0 = curg.b();
                devn devn0 = new devn(intent0, context0, null);
                devm0.b = 1;
                object0 = icbd.a(ibrt0, devn0, devm0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "withContext(...)");
        return object0;
    }

    // Detected as a lambda impl.
    public static final ibom d(ShareTargetAction shareTargetAction0) {
        ibuq.f(shareTargetAction0, "action");
        try {
            if(Build.VERSION.SDK_INT >= 34) {
                Bundle bundle0 = cjoy.a().setPendingIntentBackgroundActivityStartMode((Build.VERSION.SDK_INT < 36 ? 1 : 3)).toBundle();
                PendingIntent pendingIntent0 = shareTargetAction0.c;
                if(pendingIntent0 != null) {
                    pendingIntent0.send(bundle0);
                    return ibom.a;
                }
            }
            else {
                PendingIntent pendingIntent1 = shareTargetAction0.c;
                if(pendingIntent1 != null) {
                    pendingIntent1.send();
                    return ibom.a;
                }
            }
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            dcvz.a.e().f(pendingIntent$CanceledException0).h("Failed to take action %s", shareTargetAction0.d);
        }
        return ibom.a;
    }

    public static final ibts e(gui gui0) {
        return (ibts)gui0.a();
    }

    public static final void f(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final void g(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final void h(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final void i(gra gra0, cusz cusz0) {
        gra0.b(cusz0);
    }

    public static final void j(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final boolean k(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final boolean l(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final boolean m(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final boolean n(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final boolean o(devp devp0) {
        return (devp0.b instanceof deym) ? true : (devp0.b instanceof deyn) && ibuq.m(devq.a(devp0.a.i), deyw.a);
    }

    public static final void p(devp devp0, List list0, boolean z, ibts ibts0, ibts ibts1, ibth ibth0, ibts ibts2, goz goz0, int v) {
        ibth ibth1;
        List list1;
        ibts ibts5;
        ibts ibts4;
        boolean z1;
        devp devp1 = devp0;
        ibts ibts3 = ibts0;
        goz goz1 = goz0.ao(0xD42FD72D);
        int v1 = (v & 6) == 0 ? (goz1.Z(devp1) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(list0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            z1 = z;
            v1 |= (goz1.Y(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibts3) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            ibts4 = ibts1;
            v1 |= (goz1.Z(ibts4) ? 0x4000 : 0x2000);
        }
        else {
            ibts4 = ibts1;
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            ibts5 = ibts2;
            v1 |= (goz1.Z(ibts5) ? 0x100000 : 0x80000);
        }
        else {
            ibts5 = ibts2;
        }
        if((v1 & 0x92493) == 0x92492 && goz1.ac()) {
            goz1.G();
            list1 = list0;
            ibth1 = ibth0;
        }
        else {
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new diwz(new dixf(context0, cuui.f()));
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new diwy(new dixf(context0, cuui.f()));
                goz1.P(object2);
            }
            goz1.x();
            int v2 = devp1.c.ordinal();
            switch(v2) {
                case 0: {
                    list1 = list0;
                    ibth1 = ibth0;
                    goz1.M(-2020138564);
                    gpo.a(dewn.a.c(((diwz)object0)), gzf.e(-1806210203, new derz(devp1, list1, ibth1, ibts3), goz1), goz1, 56);
                    goz1.x();
                    break;
                }
                case 1: {
                    list1 = list0;
                    ibth1 = ibth0;
                    goz1.M(-2020128510);
                    devp1 = devp0;
                    ibts3 = ibts0;
                    gpo.a(dewn.b.c(((diwy)object2)), gzf.e(0xEE5D0A4E, new desa(devp1, z, ibts3, ibts1, ibts5), goz1), goz1, 56);
                    goz1.x();
                    break;
                }
                default: {
                    if(v2 == 2) {
                        goz1.M(-2020115209);
                        list1 = list0;
                        ibth1 = ibth0;
                        gpo.a(dewn.b.c(((diwy)object2)), gzf.e(0x8B9921AD, new desb(devp1, z1, list0, ibth0, ibts4, ibts3), goz1), goz1, 56);
                        goz1.x();
                        devp1 = devp0;
                        ibts3 = ibts0;
                        break;
                    }
                    goz1.M(-2020139664);
                    goz1.x();
                    throw new ibnq();
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derj(devp1, list1, z, ibts3, ibts1, ibth1, ibts2, v);
        }
    }

    public static final void q(fzp fzp0, ibts ibts0, ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(-1941003285);
        int v1 = (v & 6) == 0 ? (goz1.X(fzp0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x407E7, gzf.e(0xC845F9ED, new desi(fzp0, ibts0, ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derb(fzp0, ibts0, ibth0, v);
        }
    }

    public static final void r(boolean z, devp devp0, ibts ibts0, goz goz0, int v) {
        List list0;
        goz goz1 = goz0.ao(0x60766FC9);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(devp0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            switch(devp0.c.ordinal()) {
                case 1: {
                    dffg dffg0 = devp0.e.a;
                    if(dffg0 == null) {
                        list0 = ibps.a;
                    }
                    else {
                        list0 = ibpo.b(dffg0);
                        if(list0 == null) {
                            list0 = ibps.a;
                        }
                    }
                    break;
                }
                case 0: 
                case 2: {
                    list0 = ibpo.ak(devp0.d.a, devp0.d.b);
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    if((((dffg)object0).h instanceof dffl)) {
                        goz1.M(0x6E3C21FE);
                        Object object1 = goz1.j();
                        Object object2 = gop.a;
                        if(object1 == object2) {
                            object1 = new derm();
                            goz1.P(object1);
                        }
                        goz1.x();
                        gra gra0 = (gra)had.c(new Object[0], ((ibth)object1), goz1, 0x30);
                        goz1.M(0x1C99FA0B);
                        if(((Boolean)gra0.a()).booleanValue()) {
                            goz1.M(-1633490746);
                            int v3 = goz1.X(gra0);
                            if((v2 & 0x380) != 0x100) {
                                v1 = 0;
                            }
                            Object object3 = goz1.j();
                            if((v3 | v1) != 0 || object3 == object2) {
                                object3 = new dern(ibts0, gra0);
                                goz1.P(object3);
                            }
                            goz1.x();
                            goz1.M(-1633490746);
                            int v4 = goz1.X(gra0) | v1;
                            Object object4 = goz1.j();
                            if(v4 != 0 || object4 == object2) {
                                object4 = new derp(ibts0, gra0);
                                goz1.P(object4);
                            }
                            goz1.x();
                            goz1.M(5004770);
                            boolean z1 = goz1.X(gra0);
                            Object object5 = goz1.j();
                            if(z1 || object5 == object2) {
                                object5 = new derq(gra0);
                                goz1.P(object5);
                            }
                            goz1.x();
                            ddej.g(((ibth)object3), ((ibth)object4), ((ibth)object5), goz1, 0);
                        }
                        goz1.x();
                        if(z) {
                            goz1.M(5004770);
                            boolean z2 = goz1.X(gra0);
                            Object object6 = goz1.j();
                            if(z2 || object6 == object2) {
                                object6 = new derr(gra0);
                                goz1.P(object6);
                            }
                            goz1.x();
                            ddej.j(((ibth)object6), dla.j(hfc.e, 16.0f, 20.0f, 16.0f, 0.0f, 8), goz1, 0);
                        }
                        break;
                    }
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ders(z, devp0, ibts0, v);
        }
    }

    public static final void s(fzp fzp0, devp devp0, ibth ibth0, ibth ibth1, goz goz0, int v) {
        ibom ibom1;
        List list0;
        int v1;
        fzp fzp1;
        devp devp1 = devp0;
        goz goz1 = goz0.ao(-2140883047);
        if((v & 6) == 0) {
            fzp1 = fzp0;
            v1 = (goz1.X(fzp1) ? 4 : 2) | v;
        }
        else {
            fzp1 = fzp0;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(devp1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        ibth ibth2 = ibth1;
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else if(hvqz.ag()) {
            switch(devp1.c.ordinal()) {
                case 1: {
                    dffg dffg0 = devp1.e.a;
                    if(dffg0 == null) {
                        list0 = ibps.a;
                    }
                    else {
                        list0 = ibpo.b(dffg0);
                        if(list0 == null) {
                            list0 = ibps.a;
                        }
                    }
                    break;
                }
                case 0: 
                case 2: {
                    list0 = ibpo.ak(devp1.d.a, devp1.d.b);
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            for(Object object0: list0) {
                dffg dffg1 = (dffg)object0;
                dffz dffz0 = dffg1.h;
                goz1.M(0xFA15933D);
                if((dffz0 instanceof dffr) && ((dffr)dffz0).b) {
                    long v2 = ((dffr)dffz0).c;
                    if(v2 > 0L) {
                        String s = Formatter.formatShortFileSize(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)), v2);
                        String s1 = isq.d(0x7F152BEB, new Object[]{dffg1.c, s}, goz1);  // string:sharing_continue_sharing_first_time_message "No Wi-Fi. Sharing with %1$s 
                                                                                        // may use up to %2$s of data. Charges may apply."
                        String s2 = isq.c(0x7F152BEF, goz1);  // string:sharing_continue_sharing_settings_title "Change in Settings"
                        String s3 = isq.d(0x7F152BEE, new Object[]{dffg1.c, s}, goz1);  // string:sharing_continue_sharing_second_time_message "No Wi-Fi. Sharing with %1$s 
                                                                                        // may use up to %2$s of data."
                        if(hvod.a.b().a()) {
                            goz1.M(1219010743);
                            cmig.f(0x407E5, gzf.e(-347390642, new desk(ibth2, devp1, fzp1, s3, ibth0, s1, s2), goz1), goz1, 54);
                        }
                        else {
                            goz1.M(0x48B5F960);
                            ibom ibom0 = ibom.a;
                            goz1.M(-1224400529);
                            int v3 = 0;
                            int v4 = goz1.Z(devp1) | ((v1 & 14) == 4 ? 1 : 0) | goz1.X(s3) | ((v1 & 0x380) == 0x100 ? 1 : 0) | goz1.X(s1) | goz1.X(s2);
                            if((v1 & 0x1C00) == 0x800) {
                                v3 = 1;
                            }
                            Object object1 = goz1.j();
                            if((v4 | v3) == 0 && object1 != gop.a) {
                                ibom1 = ibom0;
                            }
                            else {
                                ibom1 = ibom0;
                                desl desl0 = new desl(devp1, fzp0, s3, ibth0, s1, s2, ibth1, null);
                                goz1.P(desl0);
                                object1 = desl0;
                            }
                            goz1.x();
                            gqe.f(ibom1, ((ibtw)object1), goz1);
                        }
                        goz1.x();
                    }
                }
                goz1.x();
                fzp1 = fzp0;
                devp1 = devp0;
                ibth2 = ibth1;
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deri(fzp0, devp0, ibth0, ibth1, v);
        }
    }

    public static final void t(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(0xB6F88EA);
        if(v != 0) {
            cmig.f(0x40311, degg.j, goz1, 54);
            v1 = v;
        }
        else if(!goz1.ac()) {
            cmig.f(0x40311, degg.j, goz1, 54);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derw(v1);
        }
    }

    public static final void u(boolean z, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, goz goz0, int v) {
        dfgh dfgh0;
        String s;
        deco deco0;
        goz goz2;
        ibth ibth4 = ibth2;
        ibth ibth5 = ibth3;
        ibuq.f(ibth0, "onBackClick");
        ibuq.f(ibth1, "onSettingsClick");
        ibuq.f(ibth4, "onVisibilityClick");
        ibuq.f(ibth5, "onUpdatePrivacySettingsClick");
        goz goz1 = goz0.ao(0x7645827B);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth4) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth5) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            goto label_250;
        }
        Activity activity0 = (Activity)goz1.h(ddyi.a);
        if(hvod.d()) {
            deco0 = deco.c;
        }
        else {
            deco0 = z ? deco.a : deco.b;
        }
        goz1.M(0x6E3C21FE);
        Object object0 = goz1.j();
        Object object1 = gop.a;
        if(object0 == object1) {
            object0 = deui.a;
            goz1.P(object0);
        }
        goz1.x();
        if(z) {
            dfgh0 = new dfgh(null, false, 15);
        }
        else {
            if(activity0 == null) {
                s = null;
            }
            else {
                Intent intent0 = activity0.getIntent();
                if(intent0 == null) {
                    s = null;
                }
                else {
                    if((intent0.getFlags() & 0x100000) != 0) {
                        intent0 = null;
                    }
                    if(intent0 == null) {
                        s = null;
                    }
                    else {
                        Uri uri0 = intent0.getData();
                        s = uri0 == null ? null : uri0.toString();
                    }
                }
            }
            dfgh0 = new dfgh(s, s != null, 9);
        }
        devp devp0 = new devp(deco0, dfgh0, 107);
        goz1.M(0x56FA0E43);
        grx grx0 = AndroidCompositionLocals_androidKt.b;
        Context context0 = (Context)goz1.h(grx0);
        while((context0 instanceof ContextWrapper)) {
            if((context0 instanceof xnb)) {
                lsk lsk0 = ((xnb)context0).getDefaultViewModelProviderFactory();
                lsq lsq0 = lud.b(goz1);
                if(lsq0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ltx ltx0 = (lsq0 instanceof loz) ? ((loz)lsq0).getDefaultViewModelCreationExtras() : ltv.a;
                dixh dixh0 = (dixh)lue.a(new ibuk(deoa.class), lsq0, null, lsk0, ltx0);
                goz1.x();
                goz1.M(0xDE86146D);
                String s1 = "com.google.android.gms.nearby.DefaultKey:" + ((ibtw)(((ibwx)object0))).hashCode();
                ibuk ibuk0 = new ibuk(denx.class);
                dixj dixj0 = new dixj(((ibtw)(((ibwx)object0))), devp0, ((deoa)dixh0).a, ibuk0);
                lsq lsq1 = lud.b(goz1);
                if(lsq1 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ltx ltx1 = (lsq1 instanceof loz) ? ((loz)lsq1).getDefaultViewModelCreationExtras() : ltv.a;
                dixn dixn0 = (dixn)lue.a(new ibuk(dixn.class), lsq1, s1, dixj0, ltx1);
                goz1.x();
                gui gui0 = ltd.b(dixn0.c, goz1);
                if(devo.b(gui0).c == deco.a) {
                    goz1.M(0x63066A0B);
                    gyza gyza0 = gyza.b;
                    goz1.M(5004770);
                    boolean z1 = goz1.Z(dixn0);
                    Object object2 = goz1.j();
                    if(z1 || object2 == object1) {
                        object2 = new desu(dixn0);
                        goz1.P(object2);
                    }
                    goz1.x();
                    deag.b(gyza0, ((ibts)(((ibwx)object2))), goz1, 6);
                }
                else {
                    goz1.M(0x63076A47);
                    gyza gyza1 = gyza.d;
                    goz1.M(5004770);
                    boolean z2 = goz1.Z(dixn0);
                    Object object3 = goz1.j();
                    if(z2 || object3 == object1) {
                        object3 = new desx(dixn0);
                        goz1.P(object3);
                    }
                    goz1.x();
                    deag.b(gyza1, ((ibts)(((ibwx)object3))), goz1, 6);
                }
                goz1.x();
                Object object4 = goz1.j();
                if(object4 == object1) {
                    object4 = gqe.a(ibru.a, goz1);
                    goz1.P(object4);
                }
                goz1.M(-1224400529);
                int v2 = goz1.Z(((icck)object4)) | goz1.X(gui0) | goz1.Z(dixn0) | goz1.Z(activity0);
                Object object5 = goz1.j();
                if(v2 != 0 || object5 == object1) {
                    object5 = new derx(((icck)object4), dixn0, activity0, gui0);
                    goz1.P(object5);
                }
                goz1.x();
                ddyg.b(((ibts)object5), goz1, 0);
                ade ade0 = new ade();
                goz1.M(0x97EA02AA);
                int v3 = goz1.Z(activity0) | goz1.Z(((icck)object4)) | goz1.Z(dixn0);
                Object object6 = goz1.j();
                if(v3 != 0 || object6 == object1) {
                    object6 = new deqa(activity0, ((icck)object4), dixn0);
                    goz1.P(object6);
                }
                goz1.x();
                aca aca0 = abn.a(ade0, ((ibts)object6), goz1);
                Context context1 = (Context)goz1.h(grx0);
                adt adt0 = new adt();
                goz1.M(-1224400529);
                int v4 = goz1.Z(((icck)object4)) | goz1.Z(dixn0) | goz1.Z(activity0) | goz1.Z(context1);
                Object object7 = goz1.j();
                if(v4 != 0 || object7 == object1) {
                    object7 = new deqb(((icck)object4), dixn0, activity0, context1);
                    goz1.P(object7);
                }
                goz1.x();
                aca aca1 = abn.a(adt0, ((ibts)object7), goz1);
                goz1.M(0x6E3C21FE);
                Object object8 = goz1.j();
                if(object8 == object1) {
                    object8 = Boolean.valueOf(((boolean)(dizg.n(context1) ^ 1)));
                    goz1.P(object8);
                }
                boolean z3 = ((Boolean)object8).booleanValue();
                goz1.x();
                devp devp1 = devo.b(gui0);
                goz1.M(5004770);
                boolean z4 = goz1.Z(dixn0);
                Object object9 = goz1.j();
                if(z4 || object9 == object1) {
                    object9 = new deue(dixn0);
                    goz1.P(object9);
                }
                goz1.x();
                goz1.M(-1633490746);
                int v5 = goz1.X(gui0) | goz1.Z(dixn0);
                Object object10 = goz1.j();
                if(v5 != 0 || object10 == object1) {
                    object10 = new deqc(dixn0, gui0);
                    goz1.P(object10);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z5 = goz1.Z(activity0);
                Object object11 = goz1.j();
                if(z5 || object11 == object1) {
                    object11 = new deqe(activity0);
                    goz1.P(object11);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z6 = goz1.Z(activity0);
                Object object12 = goz1.j();
                if(z6 || object12 == object1) {
                    object12 = new deqf(activity0);
                    goz1.P(object12);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z7 = goz1.Z(activity0);
                Object object13 = goz1.j();
                if(z7 || object13 == object1) {
                    object13 = new deqg(activity0);
                    goz1.P(object13);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z8 = goz1.Z(activity0);
                Object object14 = goz1.j();
                if(z8 || object14 == object1) {
                    object14 = new deqh(activity0);
                    goz1.P(object14);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z9 = goz1.Z(context1);
                Object object15 = goz1.j();
                if(z9 || object15 == object1) {
                    object15 = new deqi(context1);
                    goz1.P(object15);
                }
                goz1.x();
                goz1.M(-1633490746);
                int v6 = goz1.Z(((icck)object4)) | goz1.Z(activity0);
                Object object16 = goz1.j();
                if(v6 != 0 || object16 == object1) {
                    object16 = new deqj(((icck)object4), activity0);
                    goz1.P(object16);
                }
                goz1.x();
                goz1.M(-1633490746);
                int v7 = goz1.Z(activity0) | goz1.X(gui0);
                Object object17 = goz1.j();
                if(v7 != 0 || object17 == object1) {
                    object17 = new dery(activity0, gui0);
                    goz1.P(object17);
                }
                goz1.x();
                goz1.M(-1633490746);
                int v8 = goz1.Z(activity0) | goz1.X(gui0);
                Object object18 = goz1.j();
                if(v8 != 0 || object18 == object1) {
                    object18 = new dept(activity0, gui0);
                    goz1.P(object18);
                }
                goz1.x();
                goz1.M(0x6E3C21FE);
                Object object19 = goz1.j();
                if(object19 == object1) {
                    object19 = (ShareTargetAction shareTargetAction0) -> {
                        ibuq.f(shareTargetAction0, "action");
                        try {
                            if(Build.VERSION.SDK_INT >= 34) {
                                Bundle bundle0 = cjoy.a().setPendingIntentBackgroundActivityStartMode((Build.VERSION.SDK_INT < 36 ? 1 : 3)).toBundle();
                                PendingIntent pendingIntent0 = shareTargetAction0.c;
                                if(pendingIntent0 != null) {
                                    pendingIntent0.send(bundle0);
                                    return ibom.a;
                                }
                            }
                            else {
                                PendingIntent pendingIntent1 = shareTargetAction0.c;
                                if(pendingIntent1 != null) {
                                    pendingIntent1.send();
                                    return ibom.a;
                                }
                            }
                        }
                        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                            dcvz.a.e().f(pendingIntent$CanceledException0).h("Failed to take action %s", shareTargetAction0.d);
                        }
                        return ibom.a;
                    };
                    goz1.P(object19);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z10 = goz1.Z(aca0);
                Object object20 = goz1.j();
                if(z10 || object20 == object1) {
                    object20 = new depv(aca0);
                    goz1.P(object20);
                }
                goz1.x();
                goz1.M(-1633490746);
                int v9 = goz1.Z(context1) | goz1.Z(activity0);
                Object object21 = goz1.j();
                if(v9 != 0 || object21 == object1) {
                    object21 = new depw(context1, activity0);
                    goz1.P(object21);
                }
                goz1.x();
                goz1.M(-1633490746);
                int v10 = goz1.Z(((icck)object4)) | goz1.Z(activity0);
                Object object22 = goz1.j();
                if(v10 != 0 || object22 == object1) {
                    object22 = new depx(((icck)object4), activity0);
                    goz1.P(object22);
                }
                goz1.x();
                goz1.M(-1633490746);
                int v11 = goz1.Z(context1) | goz1.Z(aca1);
                Object object23 = goz1.j();
                if(v11 != 0 || object23 == object1) {
                    object23 = new depy(context1, aca1);
                    goz1.P(object23);
                }
                goz1.x();
                goz2 = goz1;
                devo.v(devp1, ((ibts)(((ibwx)object9))), z3, ibth0, ibth4, ibth1, ibth5, ((ibth)object10), ((ibth)object11), ((ibth)object12), ((ibth)object13), ((ibth)object14), ((ibth)object15), ((ibth)object16), ((ibth)object17), ((ibth)object18), ((ibts)object19), ((ibth)object20), ((ibts)object21), ((ibth)object22), ((ibth)object23), goz2, v1 << 6 & 0x380000 | (v1 << 9 & 0x70000 | (v1 << 6 & 0x1C00 | 0x180 | v1 << 3 & 0xE000)), 0x180000, 0);
            label_250:
                gsb gsb0 = goz2.af();
                if(gsb0 != null) {
                    gsb0.d = new depz(z, ibth0, ibth1, ibth2, ibth3, v);
                }
                return;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
            ibth4 = ibth2;
            ibth5 = ibth3;
        }
        Objects.toString(context0);
        throw new IllegalStateException("Expected a chimerax activity context for providing a view model factory but instead found: " + context0);
    }

    public static final void v(devp devp0, ibts ibts0, boolean z, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, ibth ibth4, ibth ibth5, ibth ibth6, ibth ibth7, ibth ibth8, ibth ibth9, ibth ibth10, ibth ibth11, ibth ibth12, ibts ibts1, ibth ibth13, ibts ibts2, ibth ibth14, ibth ibth15, goz goz0, int v, int v1, int v2) {
        gra gra1;
        goz goz2;
        ibth ibth16;
        int v12;
        int v11;
        int v10;
        ibuq.f(devp0, "state");
        ibuq.f(ibts0, "dispatch");
        ibuq.f(ibth0, "onBackClick");
        ibuq.f(ibth1, "onVisibilityClick");
        ibuq.f(ibth2, "onSettingsClick");
        ibuq.f(ibth3, "onUpdatePrivacySettingsClick");
        ibuq.f(ibth4, "onDismissTransferInProgressDialog");
        ibuq.f(ibth5, "onDismissUnexpectedErrorDialog");
        ibuq.f(ibth6, "onDismissQrCodeScanNotAllowedDialog");
        ibuq.f(ibth7, "onEnableLocation");
        ibuq.f(ibth8, "onBluetoothSettingsClick");
        ibuq.f(ibth9, "onWifiSettingsClick");
        ibuq.f(ibth10, "onEnableWifiClick");
        ibuq.f(ibth11, "onFeedbackClick");
        ibuq.f(ibth12, "onTipsHelpLinkClick");
        ibuq.f(ibts1, "onActionRequest");
        ibuq.f(ibth13, "onSelectFilesClick");
        ibuq.f(ibts2, "onOpenQrCodeUrlClick");
        ibuq.f(ibth14, "onDisableHotspot");
        ibuq.f(ibth15, "onSignInClicked");
        goz goz1 = goz0.ao(719037144);
        int v3 = 4;
        int v4 = (v & 6) == 0 ? (goz1.Z(devp0) ? 4 : 2) | v : v;
        int v5 = 16;
        if((v & 0x30) == 0) {
            v4 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        int v6 = 0x80;
        if((v & 0x180) == 0) {
            v4 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        int v7 = 0x400;
        if((v & 0xC00) == 0) {
            v4 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        int v8 = 0x2000;
        int v9 = (v & 0x6000) == 0 ? v4 | (goz1.Z(ibth1) ? 0x4000 : 0x2000) : v4;
        if((v & 0x30000) == 0) {
            v9 |= (goz1.Z(ibth2) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v9 |= (goz1.Z(ibth3) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v9 |= (goz1.Z(ibth4) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v9 |= (goz1.Z(ibth5) ? 0x4000000 : 0x2000000);
        }
        if((v & 0x30000000) == 0) {
            v9 |= (goz1.Z(ibth6) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 6) == 0) {
            v10 = v9;
            v11 = (goz1.Z(ibth7) ? 4 : 2) | v1;
        }
        else {
            v10 = v9;
            v11 = v1;
        }
        if((v1 & 0x30) == 0) {
            if(goz1.Z(ibth8)) {
                v5 = 0x20;
            }
            v11 |= v5;
        }
        if((v1 & 0x180) == 0) {
            if(goz1.Z(ibth9)) {
                v6 = 0x100;
            }
            v11 |= v6;
        }
        if((v1 & 0xC00) == 0) {
            if(goz1.Z(ibth10)) {
                v7 = 0x800;
            }
            v11 |= v7;
        }
        if((v1 & 0x6000) == 0) {
            if(goz1.Z(ibth11)) {
                v8 = 0x4000;
            }
            v11 |= v8;
        }
        if((v1 & 0x30000) == 0) {
            v11 |= (goz1.Z(ibth12) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x180000) == 0) {
            v11 |= (goz1.Z(ibts1) ? 0x100000 : 0x80000);
        }
        if((v1 & 0xC00000) == 0) {
            v11 |= (goz1.Z(ibth13) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x6000000) == 0) {
            v11 |= (goz1.Z(ibts2) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x30000000) == 0) {
            v11 |= (goz1.Z(ibth14) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 6) == 0) {
            if(!goz1.Z(ibth15)) {
                v3 = 2;
            }
            v12 = v2 | v3;
        }
        else {
            v12 = v2;
        }
        if((v10 & 306783379) == 306783378 && (v11 & 306783379) == 306783378 && (v12 & 3) == 2 && goz1.ac()) {
            goz1.G();
            ibth16 = ibth12;
            goz2 = goz1;
        }
        else {
            dfgh dfgh0 = devp0.e;
            boolean z1 = dfgh0.b == null;
            boolean z2 = dfgh0.b != null;
            gui gui0 = guf.a(ibts0, goz1);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(z1), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            Activity activity0 = (Activity)goz1.h(ddyi.a);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            deco deco0 = devp0.c;
            goz1.M(-1633490746);
            boolean z3 = goz1.Z(devp0);
            Object object2 = goz1.j();
            if(z3 || object2 == object1) {
                object2 = new desy(devp0, ((gra)object0), null);
                goz1.P(object2);
            }
            goz1.x();
            gqe.f(deco0, ((ibtw)object2), goz1);
            ibom ibom0 = ibom.a;
            goz1.M(-1224400529);
            int v13 = goz1.X(gui0) | goz1.Z(activity0) | goz1.Y(z2);
            Object object3 = goz1.j();
            if(v13 != 0 || object3 == object1) {
                object3 = new deqo(activity0, z2, gui0, ((gra)object0));
                goz1.P(object3);
            }
            goz1.x();
            ltn.c(ibom0, null, ((ibts)object3), goz1, 6);
            goz1.M(0x6E3C21FE);
            Object object4 = goz1.j();
            if(object4 == object1) {
                object4 = new fzp();
                goz1.P(object4);
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object5 = goz1.j();
            if(object5 == object1) {
                object5 = new deqp();
                goz1.P(object5);
            }
            goz1.x();
            gra gra0 = (gra)had.c(new Object[0], ((ibth)object5), goz1, 0x30);
            goz1.M(0x6E3C21FE);
            Object object6 = goz1.j();
            if(object6 == object1) {
                gra1 = gra0;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState1);
                object6 = parcelableSnapshotMutableState1;
            }
            else {
                gra1 = gra0;
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object7 = goz1.j();
            if(object7 == object1) {
                object7 = new deqq();
                goz1.P(object7);
            }
            goz1.x();
            gra gra2 = (gra)had.c(new Object[0], ((ibth)object7), goz1, 0x30);
            gei gei0 = geb.c(true, goz1, 0x30, 5);
            dfeo dfeo0 = devp0.a.c;
            Object object8 = goz1.j();
            if(object8 == object1) {
                object8 = gqe.a(ibru.a, goz1);
                goz1.P(object8);
            }
            if((dfeo0 instanceof dfen)) {
                Boolean boolean0 = (Boolean)((dfen)dfeo0).a;
                if(!boolean0.booleanValue() && z && deco0 == deco.a || !boolean0.booleanValue() && deco0 == deco.b && !dfgh0.c || !boolean0.booleanValue() && deco0 == deco.c) {
                    goz1.M(0x6D7D0A53);
                    dfnd.e(ibth0, ibth1, goz1, v10 >> 9 & 0x7E);
                    goz1.x();
                    ibth16 = ibth12;
                    goz2 = goz1;
                }
                else if(hvod.d()) {
                    goz1.M(0x6D83AA3E);
                    gze gze0 = gzf.e(1548664022, new desz(devp0, ibth2), goz1);
                    gze gze1 = gzf.e(357005784, new detc(devp0, ibts0, gra2, gei0, ibth2, ibth11, gra1), goz1);
                    goz2 = goz1;
                    gze gze2 = gzf.e(0x14C9FE09, new deto(devp0, ibth13, gei0, gui0, activity0, ((icck)object8), ibts0, ibts1, ibts2, ibth7, ibth8, ibth9, ibth10, ibth14, ibth4, ibth5, ibth6, ibth15, ((fzp)object4), ibth2, ibth12, gra2, ((gra)object0), ((gra)object6)), goz2);
                    ddxp.a(gze0, degg.b, gze1, null, gze2, goz2, 25014);
                    goz2.x();
                    ibth16 = ibth12;
                }
                else {
                    goz1.M(1843048009);
                    goz2 = goz1;
                    cmig.f(0x40310, gzf.e(0xF0897872, new deuc(ibth0, devp0, ibts0, gra2, gei0, ibth2, ibth11, gra1, ((fzp)object4), deco0, z2, ibth3, ibth13, gui0, activity0, ibts1, ((icck)object8), ibts2, ibth7, ibth8, ibth9, ibth10, ibth14, ibth4, ibth5, ibth6, ibth15, ((gra)object0), ((gra)object6)), goz2), goz2, 54);
                    goz2.M(0xE2851279);
                    if(devo.m(gra2)) {
                        goz2.M(5004770);
                        boolean z4 = goz2.X(gra2);
                        Object object9 = goz2.j();
                        if(z4 || object9 == object1) {
                            object9 = new deqr(gra2);
                            goz2.P(object9);
                        }
                        goz2.x();
                        ibth16 = ibth12;
                        dekm.b(ibth16, ((ibth)object9), goz2, v11 >> 15 & 14);
                    }
                    else {
                        ibth16 = ibth12;
                    }
                    goz2.x();
                    goz2.x();
                }
            }
            else {
                goz1.M(0x6D77B32D);
                devo.t(goz1, 0);
                goz1.x();
                ibth16 = ibth12;
                goz2 = goz1;
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new deqs(devp0, ibts0, z, ibth0, ibth1, ibth2, ibth3, ibth4, ibth5, ibth6, ibth7, ibth8, ibth9, ibth10, ibth11, ibth16, ibts1, ibth13, ibts2, ibth14, ibth15, v, v1, v2);
        }
    }

    public static final void w(boolean z, dfhr dfhr0, ibth ibth0, boolean z1, boolean z2, goz goz0, int v) {
        boolean z5;
        boolean z4;
        ibth ibth1;
        dfhr dfhr1;
        boolean z3;
        goz goz1 = goz0.ao(0xABC948C3);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(dfhr0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Y(z1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Y(z2) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            z3 = z;
            dfhr1 = dfhr0;
            ibth1 = ibth0;
            z4 = z1;
            z5 = z2;
        }
        else {
            z3 = z;
            dfhr1 = dfhr0;
            ibth1 = ibth0;
            z4 = z1;
            z5 = z2;
            cmig.f(0x40952, gzf.e(0xE94FEFC5, new deuj(ibth1, z3, dfhr1, z4, z5), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deqk(z3, dfhr1, ibth1, z4, z5, v);
        }
    }

    public static final void x(devp devp0, ibts ibts0, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, ibth ibth4, ibts ibts1, ibth ibth5, ibth ibth6, ibth ibth7, ibth ibth8, goz goz0, int v, int v1) {
        goz goz2;
        ibts ibts2;
        ibth ibth9 = ibth8;
        goz goz1 = goz0.ao(0x142E75DB);
        int v2 = (v & 6) == 0 ? (goz1.Z(devp0) ? 4 : 2) | v : v;
        int v3 = 16;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= (goz1.Z(ibth2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v2 |= (goz1.Z(ibth3) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v2 |= (goz1.Z(ibth4) ? 0x100000 : 0x80000);
        }
        int v4 = (0xC00000 & v) == 0 ? v2 | (goz1.Z(ibts1) ? 0x800000 : 0x400000) : v2;
        if((0x6000000 & v) == 0) {
            v4 |= (goz1.Z(ibth5) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v) == 0) {
            v4 |= (goz1.Z(ibth6) ? 0x20000000 : 0x10000000);
        }
        int v5 = (v1 & 6) == 0 ? v1 | (goz1.Z(ibth7) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            if(goz1.Z(ibth9)) {
                v3 = 0x20;
            }
            v5 |= v3;
        }
        if((306783379 & v4) == 306783378 && (v5 & 19) == 18 && goz1.ac()) {
            goz1.G();
            ibts2 = ibts0;
            goz2 = goz1;
            goto label_136;
        }
        if(devo.o(devp0)) {
            throw new IllegalStateException("Invariant: Inactive should not be called if active UI should be shown.");
        }
        deyv deyv0 = devp0.b;
        if(!(deyv0 instanceof deym)) {
            if((deyv0 instanceof deyn)) {
                goz1.M(-1967991105);
                deyz deyz0 = (deyz)devq.a(devp0.a.i);
                if(deyz0 == null) {
                    deyz0 = deyy.a;
                }
                if(!(deyz0 instanceof deyw)) {
                    if((deyz0 instanceof deyx)) {
                        goz1.M(-1033300619);
                        cusz cusz0 = ((deyn)deyv0).a;
                        goz1.M(-1224400529);
                        Object object0 = goz1.j();
                        if((((v4 & 0x70) == 0x20 ? 1 : 0) | ((v4 & 0x70000) == 0x20000 ? 1 : 0) | ((v4 & 0x380) == 0x100 ? 1 : 0) | ((v4 & 0x1C00000) == 0x800000 ? 1 : 0)) != 0 || object0 == gop.a) {
                            object0 = new deqd(ibts0, ibth3, ibth0, ibts1);
                            goz1.P(object0);
                        }
                        goz1.x();
                        devo.y(cusz0, ((ibts)object0), false, goz1, 0, 4);
                        goz2 = goz1;
                        goz2.x();
                        goz2.x();
                        ibth9 = ibth8;
                        ibts2 = ibts0;
                        goto label_136;
                    }
                    goz2 = goz1;
                    if((deyz0 instanceof deyy)) {
                        goz2.M(-1033281040);
                        goz2.M(5004770);
                        Object object1 = goz2.j();
                        if((v4 & 0x70) == 0x20 || object1 == gop.a) {
                            object1 = new deqn(ibts0);
                            goz2.P(object1);
                        }
                        goz2.x();
                        goz2.M(5004770);
                        Object object2 = goz2.j();
                        if((v4 & 0x70) == 0x20 || object2 == gop.a) {
                            object2 = new deqy(ibts0);
                            goz2.P(object2);
                        }
                        goz2.x();
                        devo.F(((ibth)object1), ((ibth)object2), goz2, 0);
                        goz2.x();
                        goz2.x();
                        ibth9 = ibth8;
                        ibts2 = ibts0;
                        goto label_136;
                    }
                    goz2.M(-1033310854);
                    goz2.x();
                    throw new ibnq();
                }
                goz1.M(0x8AB56390);
                goz1.x();
                throw new IllegalStateException("Invariant: Inactive should not be visible if state is [QuickShareStatus.AutomaticRadioTogglingDialog] and the user allowed radio toggling.");
            }
            goz2 = goz1;
            if((deyv0 instanceof deyo)) {
                goz2.M(-1033273810);
                devo.t(goz2, 0);
                goz2.x();
                ibth9 = ibth8;
                ibts2 = ibts0;
                goto label_136;
            }
            if((deyv0 instanceof deyp)) {
                goz2.M(0x8AC77729);
                cusz cusz1 = ((deyp)deyv0).a;
                goz2.M(-1633490746);
                Object object3 = goz2.j();
                if((((v4 & 0x1C00) == 0x800 ? 1 : 0) | ((v4 & 0xE000) == 0x4000 ? 1 : 0)) != 0 || object3 == gop.a) {
                    object3 = new derf(ibth1, ibth2);
                    goz2.P(object3);
                }
                goz2.x();
                devo.y(cusz1, ((ibts)object3), true, goz2, 0x180, 0);
                goz2.x();
                ibth9 = ibth8;
                ibts2 = ibts0;
                goto label_136;
            }
            if((deyv0 instanceof deys)) {
                goz2.M(-1033255601);
                cusz cusz2 = ((deys)deyv0).a;
                goz2.M(-1224400529);
                Object object4 = goz2.j();
                if((((v4 & 0x70) == 0x20 ? 1 : 0) | ((v4 & 0x70000) == 0x20000 ? 1 : 0) | ((v4 & 0x380) == 0x100 ? 1 : 0) | ((v4 & 0x380000) == 0x100000 ? 1 : 0) | ((v4 & 0x1C00000) == 0x800000 ? 1 : 0)) == 0 && object4 != gop.a) {
                    ibts2 = ibts0;
                }
                else {
                    ibts2 = ibts0;
                    dero dero0 = new dero(ibts2, ibth3, ibth0, ibth4, ibts1);
                    goz2.P(dero0);
                    object4 = dero0;
                }
                goz2.x();
                devo.y(cusz2, ((ibts)object4), false, goz2, 0, 4);
                goz2.x();
                ibth9 = ibth8;
                goto label_136;
            }
            ibts2 = ibts0;
            if((deyv0 instanceof deyt)) {
                goz2.M(0xC269FE03);
                devo.I(ibth5, goz2, v4 >> 24 & 14);
                goz2.x();
                ibth9 = ibth8;
                goto label_136;
            }
            if((deyv0 instanceof deyu)) {
                goz2.M(0xC26A0D3D);
                devo.J(ibth6, goz2, v4 >> 27 & 14);
                goz2.x();
                ibth9 = ibth8;
                goto label_136;
            }
            if((deyv0 instanceof deyr)) {
                goz2.M(-1033233307);
                devo.I(ibth7, goz2, v5 & 14);
                goz2.x();
                ibth9 = ibth8;
                goto label_136;
            }
            if((deyv0 instanceof deyq)) {
                goz2.M(-1033228828);
                ibth9 = ibth8;
                devo.H(((deyq)deyv0).a, ibts2, ibth9, goz2, v4 & 0x70 | v5 << 3 & 0x380);
                goz2.x();
            label_136:
                gsb gsb0 = goz2.af();
                if(gsb0 != null) {
                    gsb0.d = new derv(devp0, ibts2, ibth0, ibth1, ibth2, ibth3, ibth4, ibts1, ibth5, ibth6, ibth7, ibth9, v, v1);
                }
                return;
            }
            goz2.M(-1033321607);
            goz2.x();
            throw new ibnq();
        }
        goz1.M(0x8AAF4C9A);
        goz1.x();
        throw new IllegalStateException("Invariant: Inactive should not be visible if state is [QuickShareStatus.Active].");
    }

    public static final void y(cusz cusz0, ibts ibts0, boolean z, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(0x63FA631B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.V(cusz0.ordinal()) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.Y(((boolean)(((int)z)))) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            z = ((int)z) & ((v1 & 4) == 0 ? 1 : 0);
            cmig.f(0x4094C, gzf.e(0x2960DB1D, new deup(cusz0, ibts0, ((boolean)(((int)z)))), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dert(cusz0, ibts0, ((boolean)(((int)z))), v, v1);
        }
    }

    public static final void z(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(0xE770FC6E);
        if(v != 0) {
            dezc.a(dls.k(hfc.e, 24.0f), goz1, 6);
            v1 = v;
        }
        else if(!goz1.ac()) {
            dezc.a(dls.k(hfc.e, 24.0f), goz1, 6);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new derk(v1);
        }
    }
}

