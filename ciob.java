final class ciob {
    public static hfgj a(hfgj hfgj0, cdow cdow0) {
        double f = cdow0.a;
        if(f != 0.0) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfgj0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfgj0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj1 = (hfgj)hftp0.b_message;
            hfgj1.b |= 1;
            hfgj1.e = (int)(1.0 / f);
            return (hfgj)hftp0.N_build();
        }
        return hfgj0;
    }
}

