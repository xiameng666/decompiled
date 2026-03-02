import android.content.res.Resources;
import java.util.List;

public final class gbog {
    public static final hdrl a(hcnu hcnu0, gbot gbot0, Resources resources0) {
        ibuq.f(hcnu0, "alternateImageData");
        ibuq.f(resources0, "resources");
        hdpz hdpz0 = hdpy.a(((ProtoLiteMessage)hdrf.b).v_newBuilder());
        hdsf hdsf0 = hdse.a(((ProtoLiteMessage)hdsi.a).v_newBuilder());
        hdsf0.b(hdsh.b);
        hdsf0.c(gboy.c(gboy.a(resources0, 0x7F070285)));  // dimen:bc25_icon_size
        hdpz0.i(hdsf0.a());
        hdsf hdsf1 = hdse.a(((ProtoLiteMessage)hdsi.a).v_newBuilder());
        hdsf1.b(hdsh.b);
        hdsf1.c(gboy.c(gboy.a(resources0, 0x7F070285)));  // dimen:bc25_icon_size
        hdpz0.d(hdsf1.a());
        hdrf hdrf0 = hdpz0.a();
        hdsp hdsp0 = hdso.a(((ProtoLiteMessage)hdtf.a).v_newBuilder());
        hdsp0.g(30);
        return gbog.b(hcnu0, hdrf0, hdsp0.a(), ibps.a, gbot0);
    }

    public static final hdrl b(hcnu hcnu0, hdrf hdrf0, hdtf hdtf0, List list0, gbot gbot0) {
        ibuq.f(hcnu0, "imageData");
        ibuq.f(list0, "nodeTriggerList");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hdrk0.d(hdit.e.a());
        ibuq.e(hdit.e, "imageNodeExtension");
        hdit hdit0 = hdip.a(((ProtoLiteMessage)hdit.a).v_newBuilder()).a();
        hdrk0.c(hdit.e, hdit0);
        hdrk0.e(gboy.k(hdrf0, hdtf0, null, null, 16));
        hdrk0.i();
        hdrk0.g(list0);
        return hdrk0.a();
    }

    public static final hdrl c(hcnu hcnu0, hdzg hdzg0, hdrf hdrf0, hdtf hdtf0, gbot gbot0) {
        ibuq.f(hcnu0, "textInfoData");
        ibuq.f(hdzg0, "textInfoNode");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hdrk0.d(hdzg.i.a());
        ibuq.e(hdzg.i, "textInfoNodeExtension");
        hdrk0.c(hdzg.i, hdzg0);
        hdrk0.e(gboy.k(hdrf0, hdtf0, null, null, 16));
        return hdrk0.a();
    }

    public static final hdrl d(hcnu hcnu0, gbot gbot0, Resources resources0) {
        ibuq.f(hcnu0, "alternateTextData");
        ibuq.f(resources0, "resources");
        hdpz hdpz0 = hdpy.a(((ProtoLiteMessage)hdrf.b).v_newBuilder());
        hdsf hdsf0 = hdse.a(((ProtoLiteMessage)hdsi.a).v_newBuilder());
        hdsf0.b(hdsh.d);
        hdpz0.i(hdsf0.a());
        hdrf hdrf0 = hdpz0.a();
        hdsp hdsp0 = hdso.a(((ProtoLiteMessage)hdtf.a).v_newBuilder());
        hdsp0.f(gboy.e(resources0));
        hdtf hdtf0 = hdsp0.a();
        ibuq.e(hdzg.a, "getDefaultInstance(...)");
        return gbog.c(hcnu0, hdzg.a, hdrf0, hdtf0, gbot0);
    }
}

