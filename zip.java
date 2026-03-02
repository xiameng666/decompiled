import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;
import java.util.List;

public final class zip {
    public final void a(aatb aatb0, zlv zlv0, grwa grwa0) {
        if(!aaua.c(aatb0)) {
            this.b(zlv0, grwa0, null);
            return;
        }
        zls.a().bG(null).e(new zio(this, aatb0, zlv0, grwa0));
    }

    public final void b(zlv zlv0, grwa grwa0, String s) {
        ProtoLiteBuilder hftp0;
        if(grwa0 == null) {
            grwa grwa1 = zip.c(zip.k(s), ggna.a);
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grwa1).jf(5, null);
            hftp0.X(((ProtoLiteMessage)grwa1));
        }
        else {
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grwa0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)grwa0));
            grxr grxr0 = zip.k(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grwa grwa2 = (grwa)hftp0.b_message;
            grxr0.getClass();
            grwa2.b();
            grwa2.d.add(grxr0);
        }
        zlv0.a(((grwa)hftp0.N_build()));
    }

    public static final grwa c(grxr grxr0, List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwa.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grwa grwa0 = (grwa)hftp0.b_message;
        grxr0.getClass();
        grwa0.c = grxr0;
        grwa0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grwa grwa1 = (grwa)hftp0.b_message;
        grwa1.b();
        hfrj.E(list0, grwa1.d);
        return (grwa)hftp0.N_build();
    }

    public static final grxr d() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxw grxw0 = zip.m(10101);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr0 = (grxr)hftp0.b_message;
        grxw0.getClass();
        grxr0.e = grxw0;
        grxr0.b |= 1;
        grvd grvd0 = (grvd)((ProtoLiteMessage)grve.a).v_newBuilder();
        grvd0.a(zip.m(10313));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr1 = (grxr)hftp0.b_message;
        grve grve0 = (grve)((ProtoLiteBuilder)grvd0).N_build();
        grve0.getClass();
        grxr1.d = grve0;
        grxr1.c = 6;
        return (grxr)hftp0.N_build();
    }

    public static final grxr e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxw grxw0 = zip.m(10105);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr0 = (grxr)hftp0.b_message;
        grxw0.getClass();
        grxr0.e = grxw0;
        grxr0.b |= 1;
        grvd grvd0 = (grvd)((ProtoLiteMessage)grve.a).v_newBuilder();
        grvd0.a(zip.m(10313));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr1 = (grxr)hftp0.b_message;
        grve grve0 = (grve)((ProtoLiteBuilder)grvd0).N_build();
        grve0.getClass();
        grxr1.d = grve0;
        grxr1.c = 6;
        return (grxr)hftp0.N_build();
    }

    public static final grxr f() {
        if(hoju.j()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
            grxw grxw0 = zip.m(10313);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grxr grxr0 = (grxr)hftp0.b_message;
            grxw0.getClass();
            grxr0.e = grxw0;
            grxr0.b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grvb.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grvn.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grzd.a).v_newBuilder();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grzj.a).v_newBuilder();
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grwe.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp5.b_message;
            ((grwe)hftv0).b |= 1;
            ((grwe)hftv0).c = 0x30;
            if(!hftv0.isImmutable()) {
                hftp5.ensureMutable();
            }
            grwe.c(((grwe)hftp5.b_message));
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            grwe.b(((grwe)hftp5.b_message));
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            grzj grzj0 = (grzj)hftp4.b_message;
            grwe grwe0 = (grwe)hftp5.N_build();
            grwe0.getClass();
            grzj0.e = grwe0;
            grzj0.b |= 4;
            String s = zip.l(0x7F1508D0);  // string:common_security_ootp_setting_title "Security code"
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            grzj grzj1 = (grzj)hftp4.b_message;
            s.getClass();
            grzj1.b |= 1;
            grzj1.c = s;
            String s1 = zip.l(0x7F1500F5);  // string:accountsettings_ootp_menu_subtitle "Get a one-time code to verify it\'s you"
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            grzj grzj2 = (grzj)hftp4.b_message;
            s1.getClass();
            grzj2.b |= 2;
            grzj2.d = s1;
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)grwp.a).v_newBuilder();
            grxw grxw1 = zip.m(0x1A0);
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            grwp grwp0 = (grwp)hftp6.b_message;
            grxw1.getClass();
            grwp0.c = grxw1;
            grwp0.b |= 1;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            grzj grzj3 = (grzj)hftp4.b_message;
            grwp grwp1 = (grwp)hftp6.N_build();
            grwp1.getClass();
            grzj3.f = grwp1;
            grzj3.b |= 8;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            grzd grzd0 = (grzd)hftp3.b_message;
            grzj grzj4 = (grzj)hftp4.N_build();
            grzj4.getClass();
            hfuo hfuo0 = grzd0.b;
            if(!hfuo0.c()) {
                grzd0.b = ProtoLiteMessage.E(hfuo0);
            }
            grzd0.b.add(grzj4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grvn grvn0 = (grvn)hftp2.b_message;
            grzd grzd1 = (grzd)hftp3.N_build();
            grzd1.getClass();
            hfuo hfuo1 = grvn0.f;
            if(!hfuo1.c()) {
                grvn0.f = ProtoLiteMessage.E(hfuo1);
            }
            grvn0.f.add(grzd1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grvb grvb0 = (grvb)hftp1.b_message;
            grvn grvn1 = (grvn)hftp2.N_build();
            grvn1.getClass();
            grvb0.c = grvn1;
            grvb0.b = 12;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grxr grxr1 = (grxr)hftp0.b_message;
            grvb grvb1 = (grvb)hftp1.N_build();
            grvb1.getClass();
            grxr1.d = grvb1;
            grxr1.c = 8;
            return (grxr)hftp0.N_build();
        }
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxw grxw2 = zip.m(10313);
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        grxr grxr2 = (grxr)hftp7.b_message;
        grxw2.getClass();
        grxr2.e = grxw2;
        grxr2.b |= 1;
        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)grvb.a).v_newBuilder();
        grzr grzr0 = (grzr)((ProtoLiteMessage)grzs.a).v_newBuilder();
        gruw gruw0 = gruw.a;
        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gruw0).v_newBuilder();
        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)grvo.a).v_newBuilder();
        String s2 = zip.l(0x7F1508D0);  // string:common_security_ootp_setting_title "Security code"
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        grvo grvo0 = (grvo)hftp10.b_message;
        s2.getClass();
        grvo0.b |= 1;
        grvo0.c = s2;
        String s3 = zip.l(0x7F1500F5);  // string:accountsettings_ootp_menu_subtitle "Get a one-time code to verify it\'s you"
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        grvo grvo1 = (grvo)hftp10.b_message;
        s3.getClass();
        grvo1.b |= 2;
        grvo1.d = s3;
        grvo grvo2 = (grvo)hftp10.N_build();
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gruw gruw1 = (gruw)hftp9.b_message;
        grvo2.getClass();
        gruw1.d = grvo2;
        gruw1.c = 1;
        grzr0.a(hftp9);
        ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gruw0).v_newBuilder();
        grvp grvp0 = grvp.a;
        if(!hftp11.b_message.isImmutable()) {
            hftp11.ensureMutable();
        }
        gruw gruw2 = (gruw)hftp11.b_message;
        grvp0.getClass();
        gruw2.d = grvp0;
        gruw2.c = 3;
        grzr0.a(hftp11);
        ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gruw0).v_newBuilder();
        String s4 = zip.l(0x7F150903);  // string:common_view "View"
        ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)gruk.a).v_newBuilder();
        if(!hftp13.b_message.isImmutable()) {
            hftp13.ensureMutable();
        }
        gruk gruk0 = (gruk)hftp13.b_message;
        s4.getClass();
        gruk0.b |= 1;
        gruk0.c = s4;
        ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)grwe.a).v_newBuilder();
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp14.b_message;
        ((grwe)hftv1).b |= 1;
        ((grwe)hftv1).c = 21;
        if(!hftv1.isImmutable()) {
            hftp14.ensureMutable();
        }
        grwe.c(((grwe)hftp14.b_message));
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        grwe.b(((grwe)hftp14.b_message));
        grwe grwe1 = (grwe)hftp14.N_build();
        if(!hftp13.b_message.isImmutable()) {
            hftp13.ensureMutable();
        }
        gruk gruk1 = (gruk)hftp13.b_message;
        grwe1.getClass();
        gruk1.d = grwe1;
        gruk1.b |= 2;
        gruk gruk2 = (gruk)hftp13.N_build();
        if(!hftp12.b_message.isImmutable()) {
            hftp12.ensureMutable();
        }
        gruw gruw3 = (gruw)hftp12.b_message;
        gruk2.getClass();
        gruw3.d = gruk2;
        gruw3.c = 8;
        ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)grwp.a).v_newBuilder();
        grxw grxw3 = zip.m(0x1A0);
        if(!hftp15.b_message.isImmutable()) {
            hftp15.ensureMutable();
        }
        grwp grwp2 = (grwp)hftp15.b_message;
        grxw3.getClass();
        grwp2.c = grxw3;
        grwp2.b |= 1;
        if(!hftp12.b_message.isImmutable()) {
            hftp12.ensureMutable();
        }
        gruw gruw4 = (gruw)hftp12.b_message;
        grwp grwp3 = (grwp)hftp15.N_build();
        grwp3.getClass();
        gruw4.e = grwp3;
        gruw4.b |= 2;
        grzr0.a(hftp12);
        if(!hftp8.b_message.isImmutable()) {
            hftp8.ensureMutable();
        }
        grvb grvb2 = (grvb)hftp8.b_message;
        grzs grzs0 = (grzs)((ProtoLiteBuilder)grzr0).N_build();
        grzs0.getClass();
        grvb2.c = grzs0;
        grvb2.b = 1;
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        grxr grxr3 = (grxr)hftp7.b_message;
        grvb grvb3 = (grvb)hftp8.N_build();
        grvb3.getClass();
        grxr3.d = grvb3;
        grxr3.c = 8;
        return (grxr)hftp7.N_build();
    }

    public static final grxr g() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grvg.a).v_newBuilder();
        grxw grxw0 = zip.m(10101);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvg grvg0 = (grvg)hftp0.b_message;
        grxw0.getClass();
        grvg0.f = grxw0;
        grvg0.b |= 0x40;
        if(hoju.j()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grut.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grut grut0 = (grut)hftp1.b_message;
            grut0.b |= 8;
            grut0.d = true;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvg grvg1 = (grvg)hftp0.b_message;
            grut grut1 = (grut)hftp1.N_build();
            grut1.getClass();
            grvg1.i = grut1;
            grvg1.b |= 0x800;
        }
        else {
            grxw grxw1 = zip.m(10203);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvg grvg2 = (grvg)hftp0.b_message;
            grxw1.getClass();
            grvg2.c = grxw1;
            grvg2.b |= 1;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grul.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grul grul0 = (grul)hftp2.b_message;
        grvg grvg3 = (grvg)hftp0.N_build();
        grvg3.getClass();
        grul0.g = grvg3;
        grul0.b |= 0x20;
        return zip.n(2, ((grul)hftp2.N_build()));
    }

    public static final grxr h() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grul.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grwv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grwv grwv0 = (grwv)hftp1.b_message;
        grwv0.b |= 1;
        grwv0.c = 5;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grul grul0 = (grul)hftp0.b_message;
        grwv grwv1 = (grwv)hftp1.N_build();
        grwv1.getClass();
        grul0.c = grwv1;
        grul0.b |= 2;
        return zip.n(0x1A0, ((grul)hftp0.N_build()));
    }

    public static final grxr i() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grvg.a).v_newBuilder();
        grxw grxw0 = zip.m(10105);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvg grvg0 = (grvg)hftp0.b_message;
        grxw0.getClass();
        grvg0.f = grxw0;
        grvg0.b |= 0x40;
        if(hoju.j()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grut.a).v_newBuilder();
            String s = zip.l(0x7F150206);  // string:as_security_tab_name "Security"
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grut grut0 = (grut)hftp1.b_message;
            s.getClass();
            grut0.b |= 1;
            grut0.c = s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvg grvg1 = (grvg)hftp0.b_message;
            grut grut1 = (grut)hftp1.N_build();
            grut1.getClass();
            grvg1.i = grut1;
            grvg1.b |= 0x800;
        }
        else {
            grxw grxw1 = zip.m(10203);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvg grvg2 = (grvg)hftp0.b_message;
            grxw1.getClass();
            grvg2.c = grxw1;
            grvg2.b |= 1;
            grxw grxw2 = zip.m(10201);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvg grvg3 = (grvg)hftp0.b_message;
            grxw2.getClass();
            grvg3.e = grxw2;
            grvg3.b |= 4;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grul.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grul grul0 = (grul)hftp2.b_message;
        grvg grvg4 = (grvg)hftp0.N_build();
        grvg4.getClass();
        grul0.g = grvg4;
        grul0.b |= 0x20;
        return zip.n(10007, ((grul)hftp2.N_build()));
    }

    public static final grxr j() {
        if(hoju.j()) {
            return zip.o(10201);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxw grxw0 = zip.m(10201);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr0 = (grxr)hftp0.b_message;
        grxw0.getClass();
        grxr0.e = grxw0;
        grxr0.b |= 1;
        gsaf gsaf0 = (gsaf)((ProtoLiteMessage)gsag.a).v_newBuilder();
        gsah gsah0 = gsah.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gsah0).v_newBuilder();
        String s = zip.l(0x7F1501FF);  // string:as_home_tab_name "Home"
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gsah gsah1 = (gsah)hftp1.b_message;
        s.getClass();
        gsah1.b |= 2;
        gsah1.c = s;
        grwp grwp0 = grwp.a;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grwp0).v_newBuilder();
        grxw grxw1 = zip.m(2);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grwp grwp1 = (grwp)hftp2.b_message;
        grxw1.getClass();
        grwp1.c = grxw1;
        grwp1.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gsah gsah2 = (gsah)hftp1.b_message;
        grwp grwp2 = (grwp)hftp2.N_build();
        grwp2.getClass();
        gsah2.d = grwp2;
        gsah2.b |= 16;
        gsaf0.a(hftp1);
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gsah0).v_newBuilder();
        String s1 = zip.l(0x7F150206);  // string:as_security_tab_name "Security"
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gsah gsah3 = (gsah)hftp3.b_message;
        s1.getClass();
        gsah3.b |= 2;
        gsah3.c = s1;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grwp0).v_newBuilder();
        grxw grxw2 = zip.m(10007);
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grwp grwp3 = (grwp)hftp4.b_message;
        grxw2.getClass();
        grwp3.c = grxw2;
        grwp3.b |= 1;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gsah gsah4 = (gsah)hftp3.b_message;
        grwp grwp4 = (grwp)hftp4.N_build();
        grwp4.getClass();
        gsah4.d = grwp4;
        gsah4.b |= 16;
        gsaf0.a(hftp3);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr1 = (grxr)hftp0.b_message;
        gsag gsag0 = (gsag)((ProtoLiteBuilder)gsaf0).N_build();
        gsag0.getClass();
        grxr1.d = gsag0;
        grxr1.c = 5;
        return (grxr)hftp0.N_build();
    }

    public static final grxr k(String s) {
        if(hoju.j()) {
            return zip.o(10203);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsak.a).v_newBuilder();
        if(!bbqr.d(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsak gsak0 = (gsak)hftp0.b_message;
            s.getClass();
            gsak0.b |= 2;
            gsak0.c = s;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxw grxw0 = zip.m(10203);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        grxw0.getClass();
        ((grxr)hftv0).e = grxw0;
        ((grxr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        grxr grxr0 = (grxr)hftp1.b_message;
        gsak gsak1 = (gsak)hftp0.N_build();
        gsak1.getClass();
        grxr0.d = gsak1;
        grxr0.c = 4;
        return (grxr)hftp1.N_build();
    }

    private static final String l(int v) {
        return AppContextProvider.a().getResources().getString(v);
    }

    private static final grxw m(int v) {
        grxu grxu0 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
        if(!grxu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grxu0).ensureMutable();
        }
        grxw grxw0 = (grxw)grxu0.b_message;
        grxw0.b |= 1;
        grxw0.c = v - 1;
        return (grxw)((ProtoLiteBuilder)grxu0).N_build();
    }

    private static final grxr n(int v, grul grul0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxw grxw0 = zip.m(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr0 = (grxr)hftp0.b_message;
        grxw0.getClass();
        grxr0.e = grxw0;
        grxr0.b |= 1;
        gryb gryb0 = (gryb)((ProtoLiteMessage)gryc.a).v_newBuilder();
        gryb0.a(grul0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr1 = (grxr)hftp0.b_message;
        gryc gryc0 = (gryc)((ProtoLiteBuilder)gryb0).N_build();
        gryc0.getClass();
        grxr1.d = gryc0;
        grxr1.c = 3;
        return (grxr)hftp0.N_build();
    }

    private static final grxr o(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxw grxw0 = zip.m(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr0 = (grxr)hftp0.b_message;
        grxw0.getClass();
        grxr0.e = grxw0;
        grxr0.b |= 1;
        return (grxr)hftp0.N_build();
    }
}

