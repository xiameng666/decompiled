import android.content.res.Resources;
import j..util.DesugarCollections;
import java.util.List;

public final class gboh {
    public static final hcnu a(gbot gbot0, Resources resources0, hcus hcus0, hcog hcog0) {
        ibuq.f(resources0, "resources");
        ibuq.f(hcus0, "cardOcrData");
        ibuq.f(hcog0, "initialExecutionState");
        hcnt hcnt0 = hcns.a(((hftr)((ProtoLiteMessage)hcnu.a).v_newBuilder()));
        hcon hcon0 = hcom.a(((hftr)((ProtoLiteMessage)hcos.a).v_newBuilder()));
        hcon0.b(-100L);
        hcoc hcoc0 = hcob.a(((ProtoLiteMessage)hcoj.a).v_newBuilder());
        hcoc0.b(hcog0);
        hcon0.d(hcoc0.a());
        hfta hfta0 = hcuv.g;
        ibuq.e(hfta0, "cardOcrSecureDataValueExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcuv.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hcur hcur0 = hcur.c;
        ibuq.f(hcur0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcuv)hftp0.b_message).f = hcur0.e;
        ((hcuv)hftp0.b_message).b |= 8;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        hcon0.c(hfta0, ((hcuv)hftv0));
        hcnt0.c(hcon0.a());
        hcnt0.e(hcus.g.a());
        ibuq.e(hcus.g, "cardOcrDataExtension");
        hcnt0.d(hcus.g, hcus0);
        hcnq hcnq0 = hcnp.a(((hftr)((ProtoLiteMessage)hcnr.a).v_newBuilder()));
        ibuq.e("Align your card to this frame and tap to focus", "getString(...)");
        hcnq0.b("Align your card to this frame and tap to focus");
        hcnt0.b(hcnq0.a());
        hcnt0.k();
        hcnt0.h(gbov.f(gbot0, hcse.b, new long[]{2L, 3L, 4L}));
        hcnt0.k();
        hcnt0.h(gbov.f(gbot0, hcse.e, new long[]{9L, 10L}));
        hcnt0.k();
        hcsh hcsh0 = hcsg.a(((hftr)((ProtoLiteMessage)hcsi.a).v_newBuilder()));
        hcsh0.c(gbot0.b());
        hcsh0.e();
        hcsh0.d(6L);
        hfta hfta1 = hcup.d;
        ibuq.e(hfta1, "cameraTriggerExtension");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcup.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        hcuo hcuo0 = hcuo.b;
        ibuq.f(hcuo0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hcup)hftp1.b_message).c = hcuo0.c;
        ((hcup)hftp1.b_message).b |= 1;
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        hcsh0.b(hfta1, ((hcup)hftv1));
        hcnt0.h(hcsh0.a());
        hcnt0.i();
        hcnt0.f(gbov.c(gbot0, 2L, hcog.e));
        hcnt0.i();
        hcog hcog1 = hcog.d;
        hcnt0.f(gbov.c(gbot0, 3L, hcog1));
        hcnt0.i();
        hcnt0.f(gbov.c(gbot0, 4L, hcog.f));
        hcnt0.i();
        hcqu hcqu0 = hcqt.a(((hftr)((ProtoLiteMessage)hcqv.a).v_newBuilder()));
        hcqu0.b(gbot0.a());
        hcqu0.e();
        hcqu0.d(6L);
        hfta hfta2 = hcuf.f;
        ibuq.e(hfta2, "cameraConditionExtension");
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hcuf.a).v_newBuilder();
        ibuq.f(hftp2, "builder");
        hcue hcue0 = hcue.b;
        ibuq.f(hcue0, "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hcuf)hftp2.b_message).e = hcue0.c;
        ((hcuf)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hcug.a).v_newBuilder();
        ibuq.f(hftp3, "builder");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hcug hcug0 = (hcug)hftp3.b_message;
        hcug0.b |= 1;
        hcug0.c = true;
        ProtoLiteMessage hftv2 = hftp3.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((hcug)hftv2), "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hcuf hcuf0 = (hcuf)hftp2.b_message;
        ((hcug)hftv2).getClass();
        hcuf0.d = (hcug)hftv2;
        hcuf0.c = 2;
        ProtoLiteMessage hftv3 = hftp2.N_build();
        ibuq.e(hftv3, "build(...)");
        hcqu0.c(hfta2, ((hcuf)hftv3));
        hcnt0.f(hcqu0.a());
        hcnt0.i();
        hcnn hcnn0 = hcnm.a(((ProtoLiteMessage)hcno.a).v_newBuilder());
        hcnn0.c();
        hcnn0.b(1);
        hcnt0.f(gbov.b(gbot0, 9L, hcnn0.a()));
        hcnt0.i();
        hcnn hcnn1 = hcnm.a(((ProtoLiteMessage)hcno.a).v_newBuilder());
        hcnn1.c();
        hcnn1.b(2);
        hcnt0.f(gbov.b(gbot0, 10L, hcnn1.a()));
        hcnt0.j();
        hcnt0.g(gbov.d(1L, hcog1));
        hcnt0.j();
        hcnt0.g(gbov.d(5L, hcog1));
        hcnt0.j();
        hcnt0.g(gbos.a(7L, hcur.b));
        hcnt0.j();
        hcnt0.g(gbos.a(8L, hcur0));
        hcnt0.j();
        hcnt0.g(gbov.d(11L, hcog1));
        hcnt0.j();
        hcnt0.g(gbov.d(12L, hcog.c));
        hftr hftr0 = hcnt0.a;
        List list0 = DesugarCollections.unmodifiableList(((hcnu)hftr0.b_message).k);
        ibuq.e(list0, "getLoggingConfigurationList(...)");
        new hfxu(list0);
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hdzz.a).v_newBuilder();
        ibuq.f(hftp4, "builder");
        gkwx gkwx0 = gkwx.s;
        ibuq.f(gkwx0, "value");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((hdzz)hftp4.b_message).e = gkwx0.G;
        ((hdzz)hftp4.b_message).b |= 1;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)heaa.a).v_newBuilder();
        ibuq.f(hftp5, "builder");
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        heaa.b(((heaa)hftp5.b_message));
        ProtoLiteMessage hftv4 = hftp5.N_build();
        ibuq.e(hftv4, "build(...)");
        ibuq.f(((heaa)hftv4), "value");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hdzz hdzz0 = (hdzz)hftp4.b_message;
        ((heaa)hftv4).getClass();
        hdzz0.d = (heaa)hftv4;
        hdzz0.c = 5;
        ProtoLiteMessage hftv5 = hftp4.N_build();
        ibuq.e(hftv5, "build(...)");
        ibuq.f(((hdzz)hftv5), "value");
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        ((hdzz)hftv5).getClass();
        hfuo hfuo0 = hcnu0.k;
        if(!hfuo0.c()) {
            hcnu0.k = ProtoLiteMessage.E(hfuo0);
        }
        hcnu0.k.add(((hdzz)hftv5));
        return hcnt0.a();
    }

    public static final hcnu b(gbot gbot0, hdih hdih0, String s) {
        ibuq.f(hdih0, "embeddedImage");
        hcnt hcnt0 = hcns.a(((hftr)((ProtoLiteMessage)hcnu.a).v_newBuilder()));
        hcon hcon0 = hcom.a(((hftr)((ProtoLiteMessage)hcos.a).v_newBuilder()));
        hcon0.b(gbot0.c());
        hcnt0.c(hcon0.a());
        hfta hfta0 = hdio.d;
        hcnt0.e(hfta0.a());
        ibuq.e(hfta0, "imageDataExtension");
        hdin hdin0 = hdim.a(((ProtoLiteMessage)hdio.a).v_newBuilder());
        hdie hdie0 = hdid.a(((ProtoLiteMessage)hdil.a).v_newBuilder());
        if(s != null) {
            hdie0.b(s);
        }
        hdie0.d();
        hdic hdic0 = hdib.a(((ProtoLiteMessage)hdif.a).v_newBuilder());
        hdic0.b(hdih0);
        hdif hdif0 = hdic0.a();
        ibuq.f(hdif0, "value");
        ProtoLiteBuilder hftp0 = hdie0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdil hdil0 = (hdil)hftp0.b_message;
        hdif0.getClass();
        hdil0.b();
        hdil0.f.add(hdif0);
        hdin0.b(hdie0.a());
        hcnt0.d(hfta0, hdin0.a());
        return hcnt0.a();
    }

    public static final hcnu c(gbot gbot0, hcnu hcnu0, hcnu hcnu1, hcnu hcnu2) {
        ibuq.f(hcnu0, "flashAutoButtonData");
        ibuq.f(hcnu1, "flashOnButtonData");
        ibuq.f(hcnu2, "flashOffButtonData");
        hdud hdud0 = gbox.c(1, gbov.a(hcnu0));
        hdud hdud1 = gbox.c(2, gbov.a(hcnu1));
        hdud hdud2 = gbox.c(3, gbov.a(hcnu2));
        hftr hftr0 = gbov.g(gbot0);
        gbox.e(hftr0, 4, ibpo.g(new hdud[]{hdud0, hdud1, hdud2}));
        hftr0.p(gbox.a(gbot0, 6L, 4));
        hftr hftr1 = gbov.h(new long[]{6L});
        gbox.d(hftr1, 1);
        hftr0.dt(hftr1);
        hftr hftr2 = gbov.h(new long[]{7L});
        gbox.d(hftr2, 3);
        hftr0.dt(hftr2);
        hftr hftr3 = gbov.h(new long[]{8L});
        gbox.d(hftr3, 1);
        hftr0.dt(hftr3);
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcnu)hftv0;
    }

    public static final hcnu d(gbot gbot0, hcnu hcnu0, Resources resources0) {
        ibuq.f(hcnu0, "cardOcrData");
        ibuq.f(resources0, "resources");
        hftr hftr0 = gbov.g(gbot0);
        hfta hfta0 = hdcz.c;
        int v = hfta0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu1 = (hcnu)hftr0.b_message;
        hcnu1.b |= 8;
        hcnu1.i = v;
        hftr0.n(hfta0, hdcz.a);
        hftr hftr1 = gbov.i(gbot0, new long[]{5L});
        gbow.c(hftr1, hddb.b);
        hftr0.du(hftr1);
        hftr hftr2 = gbov.h(new long[]{2L});
        hddk hddk0 = (hddk)((ProtoLiteMessage)hddl.a).v_newBuilder();
        hddk0.a(gbov.a(hcnu0));
        hddl hddl0 = (hddl)((ProtoLiteBuilder)hddk0).N_build();
        gbow.b(hftr2, hddn.b, hddl0, null, 28);
        hftr0.dt(hftr2);
        hftr hftr3 = gbov.h(new long[]{1L});
        hddn hddn0 = hddn.c;
        hcjo hcjo0 = hcjo.a;
        hftr hftr4 = (hftr)((ProtoLiteMessage)hcjo0).v_newBuilder();
        fbck fbck0 = fbck.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbck0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbck fbck1 = (fbck)hftp0.b_message;
        fbck1.b |= 1;
        fbck1.c = 10007;
        ByteString hfsf0 = ((fbck)hftp0.N_build()).getDefaultInstanceForType();
        if(!hftr4.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr4).ensureMutable();
        }
        hcjo hcjo1 = (hcjo)hftr4.b_message;
        hcjo1.b = 1;
        hcjo1.c = hfsf0;
        gbow.b(hftr3, hddn0, null, ((hcjo)((ProtoLiteBuilder)hftr4).N_build()), 22);
        hftr0.dt(hftr3);
        hftr hftr5 = gbov.h(new long[]{5L});
        hftr hftr6 = (hftr)((ProtoLiteMessage)hcjo0).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fbck0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fbck fbck2 = (fbck)hftp1.b_message;
        fbck2.b |= 1;
        fbck2.c = 0;
        ByteString hfsf1 = ((fbck)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftr6.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr6).ensureMutable();
        }
        hcjo hcjo2 = (hcjo)hftr6.b_message;
        hcjo2.b = 1;
        hcjo2.c = hfsf1;
        gbow.b(hftr5, hddn0, null, ((hcjo)((ProtoLiteBuilder)hftr6).N_build()), 22);
        hftr0.dt(hftr5);
        hftr hftr7 = gbov.h(new long[]{3L});
        hddn hddn1 = hddn.d;
        hftr hftr8 = (hftr)((ProtoLiteMessage)hcjo0).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fbck0).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        fbck fbck3 = (fbck)hftp2.b_message;
        fbck3.b |= 1;
        fbck3.c = 10003;
        ByteString hfsf2 = ((fbck)hftp2.N_build()).getDefaultInstanceForType();
        if(!hftr8.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr8).ensureMutable();
        }
        hcjo hcjo3 = (hcjo)hftr8.b_message;
        hcjo3.b = 1;
        hcjo3.c = hfsf2;
        gbow.b(hftr7, hddn1, null, ((hcjo)((ProtoLiteBuilder)hftr8).N_build()), 22);
        hftr0.dt(hftr7);
        hftr hftr9 = gbov.h(new long[]{4L});
        hftr hftr10 = (hftr)((ProtoLiteMessage)hcjo0).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fbck0).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        fbck fbck4 = (fbck)hftp3.b_message;
        fbck4.b |= 1;
        fbck4.c = 10003;
        ByteString hfsf3 = ((fbck)hftp3.N_build()).getDefaultInstanceForType();
        if(!hftr10.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr10).ensureMutable();
        }
        hcjo hcjo4 = (hcjo)hftr10.b_message;
        hcjo4.b = 1;
        hcjo4.c = hfsf3;
        gbow.b(hftr9, hddn1, null, ((hcjo)((ProtoLiteBuilder)hftr10).N_build()), 22);
        hftr0.dt(hftr9);
        gaxl.a();
        ibuq.e("Credit card number recognized.", "getString(...)");
        hftr0.q(gbow.a("Credit card number recognized.", new long[]{2L}));
        ibuq.e("Credit card number not recognized.", "getString(...)");
        hftr0.q(gbow.a("Credit card number not recognized.", new long[]{3L, 4L}));
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcnu)hftv0;
    }

    public static final hcnu e(gbot gbot0, hcnu hcnu0, hcnu hcnu1) {
        ibuq.f(hcnu0, "textInfoLoadingData");
        ibuq.f(hcnu1, "textInfoDescData");
        hdud hdud0 = gbox.c(1, gbov.a(hcnu0));
        hdud hdud1 = gbox.c(2, gbov.a(hcnu1));
        hftr hftr0 = gbov.g(gbot0);
        gbox.e(hftr0, 1, ibpo.g(new hdud[]{hdud0, hdud1}));
        hftr hftr1 = gbov.h(new long[]{9L});
        gbox.d(hftr1, 2);
        hftr0.dt(hftr1);
        hftr hftr2 = gbov.h(new long[]{10L});
        gbox.d(hftr2, 1);
        hftr0.dt(hftr2);
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcnu)hftv0;
    }

    public static hcnu f(gbot gbot0, Resources resources0, hcus hcus0) {
        return gboh.a(gbot0, resources0, hcus0, hcog.c);
    }
}

