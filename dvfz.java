public final class dvfz {
    private final dmhi a;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dvfz(dmhi dmhi0) {
        this.a = dmhi0;
    }

    public final void a(gged_interceptors gged0, int v, dpug dpug0, dpuf dpuf0) {
        if(gged0.isEmpty()) {
            dpuf0.a(new dpui("Tried to archive a valuable with no ID."));
            return;
        }
        ggdy ggdy0 = new ggdy();
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = (String)gged0.get(v2);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvep.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gvep)hftv0).b = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gvep)hftp0.b_message).c = v - 2;
            ggdy0.i(((gvep)hftp0.N_build()));
        }
        dmhi dmhi0 = this.a;
        dpuj dpuj0 = dpuj.aR;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvdc.a).v_newBuilder();
        gged_interceptors gged1 = ggdy0.h();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvdc gvdc0 = (gvdc)hftp1.b_message;
        hfuo hfuo0 = gvdc0.b;
        if(!hfuo0.c()) {
            gvdc0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged1, gvdc0.b);
        dptv.m(dmhi0, dpuj0, ((MessageLite)hftp1.N_build()), ((MessageLite)gvdd.a), dpug0, dpuf0);
    }
}

