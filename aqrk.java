public final class aqrk implements evpo {
    public final evql a;
    public final evql b;
    public final acqj c;
    public final grkf d;
    public final String e;
    public final grkh f;

    public aqrk(evql evql0, evql evql1, acqj acqj0, grkf grkf0, String s, grkh grkh0) {
        this.a = evql0;
        this.b = evql1;
        this.c = acqj0;
        this.d = grkf0;
        this.e = s;
        this.f = grkh0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        String s = null;
        String s1 = this.a.n() ? ((String)this.a.j()) : null;
        evql evql1 = this.b;
        if(evql1.n()) {
            s = (String)evql1.j();
        }
        grkf grkf0 = this.d;
        if(s1 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grko grko0 = (grko)hftp0.b_message;
            grko0.b = 1;
            grko0.c = s1;
            grko grko1 = (grko)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkr grkr0 = (grkr)hftp1.b_message;
            grko1.getClass();
            grkr0.c = grko1;
            grkr0.b |= 1;
            grkr grkr1 = (grkr)hftp1.N_build();
            if(!grkf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grkf0).ensureMutable();
            }
            grkg grkg0 = (grkg)grkf0.b_message;
            grkr1.getClass();
            grkg0.d = grkr1;
            grkg0.b |= 1;
        }
        if(s != null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grko grko2 = (grko)hftp2.b_message;
            grko2.b = 1;
            grko2.c = s;
            grko grko3 = (grko)hftp2.N_build();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
            grkn grkn0 = aqrn.f();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp3.b_message;
            grkn0.getClass();
            ((grkr)hftv0).d = grkn0;
            ((grkr)hftv0).b |= 4;
            if(!hftv0.isImmutable()) {
                hftp3.ensureMutable();
            }
            grkr grkr2 = (grkr)hftp3.b_message;
            grko3.getClass();
            grkr2.c = grko3;
            grkr2.b |= 1;
            grkr grkr3 = (grkr)hftp3.N_build();
            if(!grkf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grkf0).ensureMutable();
            }
            grkg grkg1 = (grkg)grkf0.b_message;
            grkr3.getClass();
            grkg1.e = grkr3;
            grkg1.b |= 2;
        }
        return aqrn.e(this.c, grkf0, this.e, this.f);
    }
}

