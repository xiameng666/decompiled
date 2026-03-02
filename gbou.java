import java.util.List;

public final class gbou {
    public static final hcnu a(gbot gbot0, List list0) {
        ibuq.f(list0, "groupedDataReferences");
        hcnt hcnt0 = hcns.a(((hftr)((ProtoLiteMessage)hcnu.a).v_newBuilder()));
        hcon hcon0 = hcom.a(((hftr)((ProtoLiteMessage)hcos.a).v_newBuilder()));
        hcon0.b(gbot0.c());
        hcnt0.c(hcon0.a());
        hcnt0.e(hdhq.c.a());
        ibuq.e(hdhq.c, "groupingDataExtension");
        hdho hdho0 = hdhn.a(((hdhp)((ProtoLiteMessage)hdhq.a).v_newBuilder()));
        hdho0.b();
        ibuq.f(list0, "values");
        hdho0.a.a(list0);
        hdhq hdhq0 = hdho0.a();
        hcnt0.d(hdhq.c, hdhq0);
        return hcnt0.a();
    }

    public static final void b(hftr hftr0, List list0) {
        ibuq.f(list0, "groupedDataReferences");
        hfta hfta0 = hdhq.c;
        int v = hfta0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcnu0.b |= 8;
        hcnu0.i = v;
        hdhp hdhp0 = (hdhp)((ProtoLiteMessage)hdhq.a).v_newBuilder();
        hdhp0.a(list0);
        hftr0.n(hfta0, ((ProtoLiteBuilder)hdhp0).N_build());
    }

    public static final void c(hftr hftr0, List list0, hdhk hdhk0) {
        ibuq.f(list0, "children");
        ibuq.f(hdhk0, "layoutMode");
        hfta hfta0 = hdhl.f;
        int v = hfta0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrl0.b |= 16;
        hdrl0.g = v;
        hdhi hdhi0 = (hdhi)((ProtoLiteMessage)hdhl.a).v_newBuilder();
        hdhi0.a(list0);
        if(!hdhi0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hdhi0).ensureMutable();
        }
        ((hdhl)hdhi0.b_message).d = hdhk0.i;
        ((hdhl)hdhi0.b_message).b |= 1;
        hftr0.n(hfta0, ((ProtoLiteBuilder)hdhi0).N_build());
    }
}

