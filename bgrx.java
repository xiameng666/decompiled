public final class bgrx implements gful_cronetEngineProvider {
    public final int a;
    public final int b;
    public final int c;

    public bgrx(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwje.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwjg.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gwjg)hftp2.b_message).c = 1;
        ((gwjg)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwjo.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((gwjo)hftv0).c = this.a - 1;
        ((gwjo)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((gwjo)hftv1).d = this.b - 1;
        ((gwjo)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gwjo)hftp3.b_message).e = this.c - 1;
        ((gwjo)hftp3.b_message).b |= 4;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwjg gwjg0 = (gwjg)hftp2.b_message;
        gwjo gwjo0 = (gwjo)hftp3.N_build();
        gwjo0.getClass();
        gwjg0.d = gwjo0;
        gwjg0.b |= 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwje gwje0 = (gwje)hftp1.b_message;
        gwjg gwjg1 = (gwjg)hftp2.N_build();
        gwjg1.getClass();
        gwje0.c = gwjg1;
        gwje0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwje gwje1 = (gwje)hftp1.N_build();
        gwje1.getClass();
        gwik0.Y = gwje1;
        gwik0.c |= 0x8000;
        return (gwik)hftp0.N_build();
    }
}

