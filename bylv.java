import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class bylv {
    public static final void a(String s, ibtw ibtw0, ibth ibth0, boolean z, goz goz0, int v, int v1) {
        int v5;
        ibtw ibtw2;
        boolean z1;
        ibtw ibtw1;
        int v2;
        ibuq.f(s, "contentText");
        ibuq.f(ibth0, "onDismiss");
        goz goz1 = goz0.ao(0x77E9F6AB);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            ibtw1 = ibtw0;
        }
        else if((v & 0x30) == 0) {
            ibtw1 = ibtw0;
            v2 |= (goz1.Z(ibtw1) ? 0x20 : 16);
        }
        else {
            ibtw1 = ibtw0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (goz1.Y(z) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            z1 = z;
            ibtw2 = ibtw1;
        }
        else {
            ibtw ibtw3 = (v1 & 2) == 0 ? ibtw1 : null;
            int v3 = z & ((v1 & 8) == 0 ? 1 : 0);
            byly.b(vmu.a(goz1), goz1, 0);
            dig.a(null, null, false, gzf.e(0xB9AE8481, new bylt(ibth0, s, ibtw3), goz1), goz1, 0xC00, 7);
            ijz ijz0 = (ijz)goz1.h(ipa.a);
            Boolean boolean0 = Boolean.valueOf(true);
            goz1.M(-1224400529);
            int v4 = goz1.Z(ijz0) | ((v2 & 0x1C00) == 0x800 ? 1 : 0);
            Object object0 = goz1.j();
            if((((v2 & 0x380) == 0x100 ? 1 : 0) | (v4 | ((v2 & 0x70) == 0x20 ? 1 : 0))) == 0 && object0 != gop.a) {
                v5 = v3;
            }
            else {
                v5 = v3;
                object0 = new bylu(((boolean)v5), ijz0, ibtw3, ibth0, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(boolean0, ((ibtw)object0), goz1);
            z1 = v5;
            ibtw2 = ibtw3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bylo(s, ibtw2, ibth0, z1, v, v1);
        }
    }

    public static final void b(long v, ibth ibth0, goz goz0, int v1) {
        ibuq.f(ibth0, "onDismiss");
        goz goz1 = goz0.ao(0x4996E159);
        int v2 = 1;
        int v3 = (v1 & 6) == 0 ? (goz1.W(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= (goz1.Y(true) ? 0x100 : 0x80);
        }
        if((v3 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else if(v != 16L) {
            gui gui0 = chg.c(1.0f, new cmb(400, 0, null, 6), goz1, 0x30, 28);
            goz1.h(AndroidCompositionLocals_androidKt.a);
            goz1.M(1063530167);
            hey hey0 = hfc.e;
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v3 & 0x70) == 0x20 || object0 == gop.a) {
                object0 = new bylq(ibth0);
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc0 = hxb.a(hey0, ibth0, ((PointerInputEventHandler)object0));
            goz1.M(-1633490746);
            int v4 = goz1.X("Close sheet");
            Object object1 = goz1.j();
            if((v4 | ((v3 & 0x70) == 0x20 ? 1 : 0)) != 0 || object1 == gop.a) {
                object1 = new byll("Close sheet", ibth0);
                goz1.P(object1);
            }
            goz1.x();
            hfc hfc1 = iuc.c(hfc0, true, ((ibts)object1));
            goz1.x();
            hfc hfc2 = dls.v(hey0).a(hfc1);
            goz1.M(-1633490746);
            if((v3 & 14) != 4) {
                v2 = 0;
            }
            int v5 = goz1.X(gui0) | v2;
            Object object2 = goz1.j();
            if(v5 != 0 || object2 == gop.a) {
                object2 = new bylm(v, gui0);
                goz1.P(object2);
            }
            goz1.x();
            crn.a(hfc2, ((ibts)object2), goz1, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byln(v, ibth0, v1);
        }
    }
}

