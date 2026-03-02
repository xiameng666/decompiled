public final class eaaz implements evpo {
    public final eabb a;

    public eaaz(eabb eabb0) {
        this.a = eabb0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        byte[] arr_b = (byte[])evql0.j();
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        eabb eabb0 = this.a;
        if((((dyfy)hftv0).b == 4 ? ((dyhq)((dyfy)hftv0).c) : dyhq.a).d.size() == 0) {
            dylc dylc0 = (dylc)gggq.r(eabb0.m.l);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyju.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dyju dyju0 = (dyju)hftp0.b_message;
            dylc0.getClass();
            dyju0.c = dylc0;
            dyju0.b |= 1;
            if((eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d)) == eagt.j && eabb0.m.k.isEmpty()) {
                gurm gurm0 = gurm.e;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyju dyju1 = (dyju)hftp0.b_message;
                dyju1.e = gurm0.a();
            }
            else {
                gurm gurm1 = gurm.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyju dyju2 = (dyju)hftp0.b_message;
                dyju2.e = gurm1.a();
            }
            if(eabb0.k()) {
                ByteString hfsf0 = eabb0.m.p;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyju dyju3 = (dyju)hftp0.b_message;
                hfsf0.getClass();
                dyju3.b |= 2;
                dyju3.d = hfsf0;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dyfv.a).v_newBuilder();
            String s = eabb0.e.name;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            s.getClass();
            ((dyfv)hftv1).d = s;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            dyfv dyfv0 = (dyfv)hftp1.b_message;
            dyju dyju4 = (dyju)hftp0.N_build();
            dyju4.getClass();
            dyfv0.c = dyju4;
            dyfv0.b = 12;
            dyfv dyfv1 = (dyfv)hftp1.N_build();
            evql evql1 = eabb0.q.ba(dyfv1.toBytesArray());
            evql1.b(new eaam(eabb0, dylc0));
            evql1.A(new eaat(eabb0));
            return null;
        }
        eabb0.p.l(new dzdk(new dzzs(dzsk.g.toString())));
        return null;
    }
}

