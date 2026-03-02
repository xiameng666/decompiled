public final class bozq implements gfsi {
    public final hadu a;
    public final String b;
    public final hadw c;
    public final int d;

    public bozq(hadu hadu0, String s, hadw hadw0, int v) {
        this.a = hadu0;
        this.b = s;
        this.c = hadw0;
        this.d = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hadt hadt0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hadv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = this.b;
        hadv hadv0 = (hadv)hftp0.b_message;
        hadv0.e = this.a.a();
        hadv0.b |= 4;
        if(s == null) {
            hadt0 = hadt.a;
        }
        else if(s.equals("BATCH_UPLOAD_TRIGGERED_BY_GMS_TASK")) {
            hadt0 = hadt.d;
        }
        else if(s.equals("BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE")) {
            hadt0 = hadt.b;
        }
        else {
            hadt0 = s.equals("BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE_ACTIVE_NETWORK") ? hadt.c : hadt.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadv hadv1 = (hadv)hftp0.b_message;
        hadv1.c = hadt0.a();
        hadv1.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadv hadv2 = (hadv)hftp0.b_message;
        hadv2.d = this.c.a();
        hadv2.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadv hadv3 = (hadv)hftp0.b_message;
        hadv3.b |= 8;
        hadv3.f = this.d;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hadv hadv4 = (hadv)hftp0.N_build();
        hadv4.getClass();
        hadp0.f = hadv4;
        hadp0.b |= 8;
        return (ProtoLiteBuilder)object0;
    }
}

