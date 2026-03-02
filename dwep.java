public final class dwep implements evpo {
    public final dwfb a;

    public dwep(dwfb dwfb0) {
        this.a = dwfb0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            dwfb dwfb0 = this.a;
            dsik dsik0 = new dsik("ucp_one_time_acknowledgement");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)donh.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((donh)hftp0.b_message).c = true;
            donh donh0 = (donh)hftp0.N_build();
            return edph.a(dwfb0.f.b(dsik0, donh0));
        }
        ((ggtj)dwfb.a.j()).x("Update user acknowledgement to server failed");
        Exception exception0 = evql0.i();
        ibuq.c(exception0);
        return evrg.c(exception0);
    }
}

