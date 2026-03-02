public final class azfa implements gfsi {
    public final long a;
    public final azfj b;
    public final ProtoLiteBuilder c;

    public azfa(long v, azfj azfj0, ProtoLiteBuilder hftp0) {
        this.a = v;
        this.b = azfj0;
        this.c = hftp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp1;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlpf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlpf)object0))));
        for(int v = 0; true; ++v) {
            hftp1 = this.c;
            if(v >= ((hlpf)hftp0.b_message).b.size()) {
                break;
            }
            hlpe hlpe0 = (hlpe)((hlpf)hftp0.b_message).b.get(v);
            if(hlpe0.e < this.a) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlpf hlpf0 = (hlpf)hftp0.b_message;
                hlpf0.b();
                hlpf0.b.remove(v);
                --v;
            }
            else {
                azfj azfj0 = new azfj(((long)hlpe0.c), hlpe0.d);
                if(this.b.a(azfj0) < 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlpf hlpf1 = (hlpf)hftp0.b_message;
                    hlpe hlpe1 = (hlpe)hftp1.N_build();
                    hlpe1.getClass();
                    hlpf1.b();
                    hlpf1.b.add(v, hlpe1);
                    return (hlpf)hftp0.N_build();
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlpf hlpf2 = (hlpf)hftp0.b_message;
        hlpe hlpe2 = (hlpe)hftp1.N_build();
        hlpe2.getClass();
        hlpf2.b();
        hlpf2.b.add(hlpe2);
        return (hlpf)hftp0.N_build();
    }
}

