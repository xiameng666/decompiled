import j..util.Optional;

public final class fxmx implements gful_cronetEngineProvider {
    public final String a;
    public final long b;
    public final Optional c;
    public final int d;

    public fxmx(String s, long v, int v1, Optional optional0) {
        this.a = s;
        this.b = v;
        this.d = v1;
        this.c = optional0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwli.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.a.getClass();
        ((gwli)hftv0).b |= 1;
        ((gwli)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwli)hftv1).b |= 2;
        ((gwli)hftv1).d = this.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        Optional optional0 = this.c;
        ((gwli)hftp0.b_message).e = this.d - 1;
        ((gwli)hftp0.b_message).b |= 4;
        if(optional0.isPresent()) {
            gwlt gwlt0 = (gwlt)optional0.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwli gwli0 = (gwli)hftp0.b_message;
            gwlt0.getClass();
            gwli0.f = gwlt0;
            gwli0.b |= 8;
        }
        gwli gwli1 = (gwli)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp1.b_message;
        gwli1.getClass();
        gwik0.z = gwli1;
        gwik0.b |= 0x400000;
        return (gwik)hftp1.N_build();
    }
}

