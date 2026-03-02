import java.util.List;

public final class gboj {
    public static final hdrl a(hcnu hcnu0, hdrf hdrf0, hdtf hdtf0, hcuu hcuu0, gbot gbot0) {
        ibuq.f(hcnu0, "cardOcrData");
        ibuq.f(hdtf0, "cardOcrStyleProperties");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hdrk0.d(hcut.b.a());
        ibuq.e(hcut.b, "cardOcrNodeExtension");
        ibuq.e(hcut.a, "getDefaultInstance(...)");
        hdrk0.c(hcut.b, hcut.a);
        hdrk0.e(gboy.k(hdrf0, hdtf0, null, hcuu0, 8));
        return hdrk0.a();
    }

    public static final hdrl b(hcnu hcnu0, hcmf hcmf0, hdrf hdrf0, hdtf hdtf0, hdtf hdtf1, gbot gbot0) {
        ibuq.f(hcnu0, "fallbackButtonData");
        ibuq.f(hcmf0, "buttonNodeMaterialType");
        ibuq.f(hdrf0, "fallbackButtonLayoutProperties");
        ibuq.f(hdtf0, "fallbackButtonStyleProperties");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hdrk0.d(hcmg.e.a());
        ibuq.e(hcmg.e, "buttonNodeExtension");
        hcmd hcmd0 = hcmc.a(((ProtoLiteMessage)hcmg.a).v_newBuilder());
        hcmd0.b(hcmf0);
        hcmg hcmg0 = hcmd0.a();
        hdrk0.c(hcmg.e, hcmg0);
        hdrk0.i();
        hdrk0.h(gbov.e(gbot0, 1L));
        hdrk0.e(gboy.k(hdrf0, hdtf0, hdtf1, null, 16));
        return hdrk0.a();
    }

    public static final hdrl c(hcnu hcnu0, long v, hdrf hdrf0, hdtf hdtf0, hdtf hdtf1, gbot gbot0) {
        ibuq.f(hcnu0, "flashButtonData");
        ibuq.f(hdrf0, "flashButtonLayoutProperties");
        ibuq.f(hdtf0, "flashButtonStyleProperties");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hdrk0.d(hcmg.e.a());
        ibuq.e(hcmg.e, "buttonNodeExtension");
        hcmd hcmd0 = hcmc.a(((ProtoLiteMessage)hcmg.a).v_newBuilder());
        hcmd0.b(hcmf.d);
        hcmg hcmg0 = hcmd0.a();
        hdrk0.c(hcmg.e, hcmg0);
        hdrk0.i();
        hdrk0.h(gbov.e(gbot0, v));
        hdrk0.e(gboy.k(hdrf0, hdtf0, hdtf1, null, 16));
        return hdrk0.a();
    }

    public static final hdrl d(hcnu hcnu0, hdzg hdzg0, hdrf hdrf0, hdtf hdtf0, hdtf hdtf1, gbot gbot0) {
        ibuq.f(hcnu0, "subtitleTextInfoData");
        ibuq.f(hdzg0, "subtitleTextInfoNode");
        ibuq.f(hdrf0, "subtitleTextInfoLayoutProperties");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hdrk0.d(hdzg.i.a());
        ibuq.e(hdzg.i, "textInfoNodeExtension");
        hdrk0.c(hdzg.i, hdzg0);
        hdrk0.e(gboy.k(hdrf0, hdtf0, hdtf1, null, 16));
        return hdrk0.a();
    }

    public static final hdrl e(hcnu hcnu0, hdzg hdzg0, hdrf hdrf0, hdtf hdtf0, gbot gbot0) {
        ibuq.f(hcnu0, "titleTextInfoData");
        ibuq.f(hdzg0, "titleTextInfoNode");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hdrk0.d(hdzg.i.a());
        ibuq.e(hdzg.i, "textInfoNodeExtension");
        hdrk0.c(hdzg.i, hdzg0);
        hdrk0.e(gboy.k(hdrf0, hdtf0, null, null, 24));
        return hdrk0.a();
    }

    public static final List f(hcnu hcnu0, hcnu hcnu1, hcnu hcnu2, hcnu hcnu3, hdrf hdrf0, hdtf hdtf0, hdtf hdtf1, gbot gbot0) {
        ibuq.f(hcnu0, "flashAutoButtonData");
        ibuq.f(hcnu1, "flashOnButtonData");
        ibuq.f(hcnu2, "flashOffButtonData");
        ibuq.f(hcnu3, "flashButtonOneOfData");
        ibuq.f(hdrf0, "flashButtonLayoutProperties");
        ibuq.f(hdtf0, "flashButtonStyleProperties");
        hdrl hdrl0 = gboj.c(hcnu0, 7L, hdrf0, hdtf0, hdtf1, gbot0);
        hdrl hdrl1 = gboj.c(hcnu1, 7L, hdrf0, hdtf0, hdtf1, gbot0);
        hdrl hdrl2 = gboj.c(hcnu2, 8L, hdrf0, hdtf0, hdtf1, gbot0);
        return ibpo.g(new hdrl[]{gbox.b(gbot0, 1, hdrl0, hcnu3), gbox.b(gbot0, 2, hdrl1, hcnu3), gbox.b(gbot0, 3, hdrl2, hcnu3)});
    }

    public static final List g(hcnu hcnu0, hcnu hcnu1, hcnu hcnu2, hdzg hdzg0, hdrf hdrf0, hdtf hdtf0, hdtf hdtf1, gbot gbot0) {
        ibuq.f(hcnu0, "subtitleTextInfoOneOfData");
        ibuq.f(hcnu1, "loadingSubtitleTextInfoData");
        ibuq.f(hcnu2, "descSubtitleTextInfoData");
        ibuq.f(hdzg0, "subtitleTextInfoNode");
        ibuq.f(hdrf0, "subtitleTextInfoLayoutProperties");
        return ibpo.g(new hdrl[]{gbox.b(gbot0, 1, gboj.d(hcnu1, hdzg0, hdrf0, hdtf0, hdtf1, gbot0), hcnu0), gbox.b(gbot0, 2, gboj.d(hcnu2, hdzg0, hdrf0, hdtf0, hdtf1, gbot0), hcnu0)});
    }

    public static final hdrl h(hcnu hcnu0, ProtoLiteBuilder hftp0, gbot gbot0) {
        ibuq.f(hcnu0, "gPayLogoImageData");
        hftr hftr0 = gbov.j(hcnu0, gbot0);
        hfta hfta0 = hdit.e;
        int v = hfta0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrl0.b |= 16;
        hdrl0.g = v;
        hftr0.n(hfta0, hdit.a);
        hftr hftr1 = (hftr)((ProtoLiteMessage)hdrw.a).v_newBuilder();
        ibuq.c(hftr1);
        gboy.m(hftr1, hftp0, null, 6);
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        hdrw.c(((hdrw)hftr1.b_message));
        hdrw hdrw0 = (hdrw)((ProtoLiteBuilder)hftr1).N_build();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl1 = (hdrl)hftr0.b_message;
        hdrw0.getClass();
        hdrl1.d = hdrw0;
        hdrl1.b |= 2;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdrl)hftv0;
    }
}

