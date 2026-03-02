public final class cyro implements gfsi {
    public final cyrp a;
    public final String b;
    public final boolean c;
    public final gfsi d;

    public cyro(cyrp cyrp0, String s, boolean z, gfsi gfsi0) {
        this.a = cyrp0;
        this.b = s;
        this.c = z;
        this.d = gfsi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s;
        cyjr cyjr0 = (cyjr)((ProtoLiteMessage)cyjs.a).w(((ProtoLiteMessage)(((cyjs)object0))));
        boolean z = false;
        int v;
        for(v = 0; true; ++v) {
            s = this.b;
            if(v >= ((cyjs)cyjr0.b_message).b.size()) {
                v = -1;
                break;
            }
            if(gfqz.e(cyjr0.a(v).c, s)) {
                break;
            }
        }
        gfsi gfsi0 = this.d;
        if(v != -1) {
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)gfsi0.apply(cyjr0.a(v));
            if(!cyjr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)cyjr0).ensureMutable();
            }
            cyjs cyjs1 = (cyjs)cyjr0.b_message;
            cyjq cyjq2 = (cyjq)hftp1.N_build();
            cyjq2.getClass();
            cyjs1.b();
            cyjs1.b.set(v, cyjq2);
        }
        else if(this.c) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)gfsi0.apply(cyjq.a);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cyjq cyjq0 = (cyjq)hftp0.b_message;
            s.getClass();
            cyjq0.b |= 1;
            cyjq0.c = s;
            if(!cyjr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)cyjr0).ensureMutable();
            }
            cyjs cyjs0 = (cyjs)cyjr0.b_message;
            cyjq cyjq1 = (cyjq)hftp0.N_build();
            cyjq1.getClass();
            cyjs0.b();
            cyjs0.b.add(cyjq1);
        }
        cyrp cyrp0 = this.a;
        if(((cyjs)cyjr0.b_message).b.size() > 0) {
            z = true;
        }
        cyrp0.l(z);
        return (cyjs)((ProtoLiteBuilder)cyjr0).N_build();
    }
}

