public final class atmu {
    private static final baun a;
    private final long b;
    private final long c;
    private final String d;
    private final String e;

    static {
        atmu.a = new aqql(new String[]{"RestoreRequestGenerator"});
    }

    public atmu(long v, long v1, String s, String s1) {
        this.b = v;
        this.c = v1;
        this.d = s;
        this.e = s1;
    }

    public final ProtoLiteBuilder a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqfe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)hftp0.b_message;
        aqfe0.b |= 1;
        aqfe0.c = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfe aqfe1 = (aqfe)hftp0.b_message;
        aqfe1.b |= 0x20;
        aqfe1.g = 0x7D000;
        String s = this.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfe aqfe2 = (aqfe)hftp0.b_message;
        s.getClass();
        aqfe2.b |= 4;
        aqfe2.e = s;
        if(hqhk.c()) {
            long v = this.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfe aqfe3 = (aqfe)hftp0.b_message;
            aqfe3.b |= 2;
            aqfe3.d = v;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((aqfe)hftp0.b_message).k = 1;
        ((aqfe)hftp0.b_message).b |= 0x800;
        String s1 = this.e;
        if(s1 != null) {
            if(hqmf.a.b().c()) {
                aqfe aqfe4 = (aqfe)hftp0.b_message;
                if((aqfe4.b & 1) == 0 || this.c != aqfe4.c) {
                    goto label_34;
                }
            }
            else {
            label_34:
                atmu.a.j("Requesting ancestral secondary key:%s", new Object[]{s1});
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aqfe aqfe5 = (aqfe)hftp0.b_message;
                aqfe5.b |= 0x200;
                aqfe5.i = s1;
            }
        }
        return hftp0;
    }
}

