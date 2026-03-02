import j..util.DesugarCollections;
import java.util.List;

public final class gboi {
    public static final hcnu a(gbot gbot0) {
        hdif[] arr_hdif = new hdif[2];
        hdif hdif0 = hdif.a;
        hdic hdic0 = hdib.a(((ProtoLiteMessage)hdif0).v_newBuilder());
        hdic0.b(hdih.s);
        ProtoLiteBuilder hftp0 = hdic0.a;
        List list0 = DesugarCollections.unmodifiableList(((hdif)hftp0.b_message).d);
        ibuq.e(list0, "getConditionList(...)");
        new hfxu(list0);
        hdpm hdpm0 = hdpl.a(((ProtoLiteMessage)hdpp.a).v_newBuilder());
        hdpm0.b(hdpo.c);
        hdpp hdpp0 = hdpm0.a();
        ibuq.f(hdpp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdif hdif1 = (hdif)hftp0.b_message;
        hdpp0.getClass();
        hfuo hfuo0 = hdif1.d;
        if(!hfuo0.c()) {
            hdif1.d = ProtoLiteMessage.E(hfuo0);
        }
        hdif1.d.add(hdpp0);
        arr_hdif[0] = hdic0.a();
        hdic hdic1 = hdib.a(((ProtoLiteMessage)hdif0).v_newBuilder());
        hdic1.b(hdih.r);
        arr_hdif[1] = hdic1.a();
        return gboi.b(gbot0, ibpo.g(arr_hdif));
    }

    public static final hcnu b(gbot gbot0, List list0) {
        hcnt hcnt0 = hcns.a(((hftr)((ProtoLiteMessage)hcnu.a).v_newBuilder()));
        hcon hcon0 = hcom.a(((hftr)((ProtoLiteMessage)hcos.a).v_newBuilder()));
        hcon0.b(gbot0.c());
        hcnt0.c(hcon0.a());
        hcnt0.e(hdio.d.a());
        ibuq.e(hdio.d, "imageDataExtension");
        hdin hdin0 = hdim.a(((ProtoLiteMessage)hdio.a).v_newBuilder());
        hdie hdie0 = hdid.a(((ProtoLiteMessage)hdil.a).v_newBuilder());
        hdie0.d();
        hdie0.c(list0);
        hdin0.b(hdie0.a());
        hdio hdio0 = hdin0.a();
        hcnt0.d(hdio.d, hdio0);
        return hcnt0.a();
    }
}

