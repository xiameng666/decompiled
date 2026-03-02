public final class dvbf implements evqf {
    public final dvcl a;
    public final gtxg b;

    public dvbf(dvcl dvcl0, gtxg gtxg0) {
        this.a = dvcl0;
        this.b = gtxg0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        dvcl dvcl0 = this.a;
        if(dvcl0.aw()) {
            return;
        }
        dvcl0.az = (hjzq)object0;
        if(dvcl.M(this.b)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcd.a).v_newBuilder();
            String s = dvcl0.al;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftcd ftcd0 = (ftcd)hftp0.b_message;
            s.getClass();
            ftcd0.b |= 1;
            ftcd0.e = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftan.a).v_newBuilder();
            String s1 = dvcl0.y().a;
            gftb.check(s1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ftan)hftp1.b_message).b = s1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftcd ftcd1 = (ftcd)hftp0.b_message;
            ftan ftan0 = (ftan)hftp1.N_build();
            ftan0.getClass();
            ftcd1.d = ftan0;
            ftcd1.c = 12;
            byte[] arr_b = ((ftcd)hftp0.N_build()).toBytesArray();
            evql evql0 = dvcl0.aD.bc(arr_b);
            evql0.b(new dvbv(dvcl0));
            evql0.A(new dvbw(dvcl0));
            return;
        }
        dvcl0.H(dvcl0.ap, ggna.a, false);
    }
}

