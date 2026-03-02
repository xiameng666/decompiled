import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Objects;

public final class dfqn {
    public static final ibts a(gui gui0) {
        return (ibts)gui0.a();
    }

    public static final void b(boolean z, boolean z1, ibth ibth0, ibth ibth1, ibth ibth2, goz goz0, int v) {
        ibuq.f(ibth0, "onAccountClick");
        ibuq.f(ibth1, "onClick");
        ibuq.f(ibth2, "onContactsClick");
        goz goz1 = goz0.ao(0x8A8B55FD);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Y(z1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(z) {
                goz1.M(0x8CAE79FB);
                cmig.f(0x4039D, gzf.e(0x82134C40, new dfpi(ibth0, z1), goz1), goz1, 54);
            }
            else {
                goz1.M(0x8CB5FC39);
                cmig.f(0x406A9, gzf.e(0x2FC81C97, new dfpj(z1, ibth1, ibth2), goz1), goz1, 54);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfou(z, z1, ibth0, ibth1, ibth2, v);
        }
    }

    public static final void c(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(-1898720442);
        if(v != 0) {
            cmig.f(0x40311, dfns.a, goz1, 54);
            v1 = v;
        }
        else if(!goz1.ac()) {
            cmig.f(0x40311, dfns.a, goz1, 54);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfov(v1);
        }
    }

    public static final void d(boolean z, ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0x6640A118);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x406AA, gzf.e(1302931798, new dfpn(z, ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfpg(z, ibth0, v);
        }
    }

    public static final void e(String s, String s1, boolean z, ibth ibth0, goz goz0, int v) {
        String s3;
        String s2;
        goz goz1 = goz0.ao(0x6F9C402B);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            s2 = s1;
        }
        else {
            its its0 = new its(3);
            s2 = s1;
            ddzz.b(s, dzp.c(hfc.e, z, its0, ibth0), s2, gzf.e(-142050200, new dfpo(z), goz1), null, goz1, v1 & 14 | 0xC00 | v1 << 3 & 0x380, 16);
        }
        s3 = s;
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfpd(s3, s2, z, ibth0, v);
        }
    }

    public static final void f(String s, boolean z, ibth ibth0, ibth ibth1, goz goz0, int v) {
        ibuq.f(ibth0, "onAccountClick");
        ibuq.f(ibth1, "onClick");
        goz goz1 = goz0.ao(696109476);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Y(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(s == null) {
                goz1.M(0x650ECAB8);
                cmig.f(0x4039D, gzf.e(-1317722201, new dfpq(ibth0, z), goz1), goz1, 54);
            }
            else {
                goz1.M(1695951909);
                cmig.f(0x406A8, gzf.e(0x156B28BE, new dfpr(s, z, ibth1), goz1), goz1, 54);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfpf(s, z, ibth0, ibth1, v);
        }
    }

    public static final void g(boolean z, ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0xCA95636);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x406AB, gzf.e(0xD20FCE38, new dfps(z, ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfpe(z, ibth0, v);
        }
    }

    public static final void h(ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(-339500878);
        if((((v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40470, gzf.e(0x73F04D70, new dfpt(ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfow(ibth0, v);
        }
    }

    public static final void i(dfqp dfqp0, ibts ibts0, ibth ibth0, ibth ibth1, ibth ibth2, goz goz0, int v) {
        ibuq.f(dfqp0, "state");
        ibuq.f(ibts0, "dispatch");
        ibuq.f(ibth0, "onBackClick");
        ibuq.f(ibth1, "onContactsClick");
        ibuq.f(ibth2, "onAccountClick");
        goz goz1 = goz0.ao(0xBBA043C0);
        int v1 = (v & 6) == 0 ? (goz1.Z(dfqp0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new dfpa();
                goz1.P(object0);
            }
            goz1.x();
            boolean z = ((Boolean)had.c(new Object[0], ((ibth)object0), goz1, 0x30)).booleanValue();
            gui gui0 = guf.a(ibts0, goz1);
            ibom ibom0 = ibom.a;
            goz1.M(5004770);
            boolean z1 = goz1.X(gui0);
            Object object2 = goz1.j();
            if(z1 || object2 == object1) {
                object2 = new dfpb(gui0);
                goz1.P(object2);
            }
            goz1.x();
            gqe.c(ibom0, ((ibts)object2), goz1);
            cmig.f(0x403A9, gzf.e(0x192853FE, new dfqk(ibth0, dfqp0, gui0, ibth2, ibth1, z), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfpc(dfqp0, ibts0, ibth0, ibth1, ibth2, v);
        }
    }

    public static final void j(String s, String s1, boolean z, ibts ibts0, goz goz0, int v) {
        ibuq.f(s, "title");
        ibuq.f(s1, "subtitle");
        goz goz1 = goz0.ao(0x926369AF);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x406D2, gzf.e(0xFCFB84ED, new dfpm(z, ibts0, s, s1), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dfox(s, s1, z, ibts0, v);
        }
    }

    public static final void k(String s, String s1, boolean z, ibth ibth0, goz goz0) {
        dfqn.e(s, s1, z, ibth0, goz0, 0);
    }

    public static final void l(dixi dixi0, ibth ibth0, ibth ibth1, goz goz0, int v) {
        int v2;
        ibth ibth3;
        ibth ibth2;
        ibuq.f(ibth0, "onBackClick");
        ibuq.f(ibth1, "onContactsClick");
        goz goz1 = goz0.ao(-1816850903);
        int v1 = (v & 6) == 0 ? v | 2 : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            ibth2 = ibth0;
            ibth3 = ibth1;
            goto label_89;
        }
        goz1.I();
        if((v & 1) != 0 && !goz1.aa()) {
            v2 = v1 & -15;
            goz1.G();
            goto label_51;
        }
        goz1.M(0x6E3C21FE);
        Object object0 = goz1.j();
        if(object0 == gop.a) {
            object0 = dfpu.a;
            goz1.P(object0);
        }
        goz1.x();
        dfqp dfqp0 = new dfqp(null);
        goz1.M(0x56FA0E43);
        Context context0;
        for(context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b); (context0 instanceof ContextWrapper); context0 = ((ContextWrapper)context0).getBaseContext()) {
            if((context0 instanceof xnb)) {
                lsk lsk0 = ((xnb)context0).getDefaultViewModelProviderFactory();
                lsq lsq0 = lud.b(goz1);
                if(lsq0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ltx ltx0 = (lsq0 instanceof loz) ? ((loz)lsq0).getDefaultViewModelCreationExtras() : ltv.a;
                dixh dixh0 = (dixh)lue.a(new ibuk(dfop.class), lsq0, null, lsk0, ltx0);
                goz1.x();
                goz1.M(0xDE86146D);
                String s = "com.google.android.gms.nearby.DefaultKey:" + ((ibtw)(((ibwx)object0))).hashCode();
                ibuk ibuk0 = new ibuk(dfoo.class);
                dixj dixj0 = new dixj(((ibtw)(((ibwx)object0))), dfqp0, ((dfop)dixh0).a, ibuk0);
                lsq lsq1 = lud.b(goz1);
                if(lsq1 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                v2 = v1 & -15;
                ltx ltx1 = (lsq1 instanceof loz) ? ((loz)lsq1).getDefaultViewModelCreationExtras() : ltv.a;
                dixi0 = (dixn)lue.a(new ibuk(dixn.class), lsq1, s, dixj0, ltx1);
                goz1.x();
            label_51:
                goz1.w();
                gyza gyza0 = gyza.f;
                goz1.M(5004770);
                boolean z = goz1.Z(dixi0);
                Object object1 = goz1.j();
                if(z || object1 == gop.a) {
                    object1 = new dfpv(dixi0);
                    goz1.P(object1);
                }
                goz1.x();
                deag.b(gyza0, ((ibts)(((ibwx)object1))), goz1, 6);
                gui gui0 = ltd.b(((dixn)dixi0).c, goz1);
                goz1.M(5004770);
                boolean z1 = goz1.Z(dixi0);
                Object object2 = goz1.j();
                if(z1 || object2 == gop.a) {
                    object2 = new dfql(dixi0);
                    goz1.P(object2);
                }
                goz1.x();
                gui gui1 = guf.a(((ibwx)object2), goz1);
                goz1.M(5004770);
                boolean z2 = goz1.X(gui1);
                Object object3 = goz1.j();
                if(z2 || object3 == gop.a) {
                    object3 = new dfoy(gui1);
                    goz1.P(object3);
                }
                goz1.x();
                ibth ibth4 = ddwp.a(((ibts)object3), goz1);
                dfqp dfqp1 = (dfqp)gui0.a();
                goz1.M(5004770);
                boolean z3 = goz1.Z(dixi0);
                Object object4 = goz1.j();
                if(z3 || object4 == gop.a) {
                    object4 = new dfpw(dixi0);
                    goz1.P(object4);
                }
                goz1.x();
                ibth2 = ibth0;
                ibth3 = ibth1;
                dfqn.i(dfqp1, ((ibts)(((ibwx)object4))), ibth2, ibth3, ibth4, goz1, v2 << 3 & 0x1F80);
            label_89:
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new dfoz(dixi0, ibth2, ibth3, v);
                }
                return;
            }
        }
        Objects.toString(context0);
        throw new IllegalStateException("Expected a chimerax activity context for providing a view model factory but instead found: " + context0);
    }
}

