public final class gbof {
    public static final hcnu a(gbot gbot0, String s, hdif[] arr_hdif) {
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
        hdie0.c(ibpg.e(arr_hdif));
        hdin0.b(hdie0.a());
        hcnt0.d(hfta0, hdin0.a());
        return hcnt0.a();
    }
}

