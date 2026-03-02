public final class cyvo implements gfsi {
    public final boolean a;
    public final cyxs b;

    public cyvo(boolean z, cyxs cyxs0) {
        this.a = z;
        this.b = cyxs0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyxt)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyxt)object0))));
        cyxs cyxs0 = this.b;
        if(this.a) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cyxt cyxt0 = (cyxt)hftp0.b_message;
            cyxs0.getClass();
            cyxt0.d = cyxs0;
            cyxt0.b |= 1;
            return (cyxt)hftp0.N_build();
        }
        for(int v = 0; v < ((cyxt)hftp0.b_message).c.size(); ++v) {
            if(cyxs0.d.equals(((cyxs)((cyxt)hftp0.b_message).c.get(v)).d)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cyxt cyxt1 = (cyxt)hftp0.b_message;
                cyxt1.b();
                cyxt1.c.remove(v);
                break;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cyxt cyxt2 = (cyxt)hftp0.b_message;
        cyxs0.getClass();
        cyxt2.b();
        cyxt2.c.add(cyxs0);
        return (cyxt)hftp0.N_build();
    }
}

