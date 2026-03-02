public final class ehin {
    public String a;
    public int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private byte i;

    public final gipd a() {
        if(this.i == 0x3F) {
            String s = this.a;
            if(s != null) {
                int v = this.b;
                if(v != 0) {
                    ehio ehio0 = new ehio(s, this.c, this.d, this.e, v, this.f, this.g, this.h);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gipd.a).v_newBuilder();
                    String s1 = ehio0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s1.getClass();
                    ((gipd)hftv0).b |= 1;
                    ((gipd)hftv0).c = s1;
                    long v1 = ehio0.b;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((gipd)hftv1).b |= 2;
                    ((gipd)hftv1).d = v1;
                    long v2 = ehio0.c;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((gipd)hftv2).b |= 4;
                    ((gipd)hftv2).e = v2;
                    int v3 = ehio0.d;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gipd gipd0 = (gipd)hftp0.b_message;
                    gipd0.b |= 8;
                    gipd0.f = v3;
                    if(ehio0.e) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gipc.a).v_newBuilder();
                        int v4 = ehio0.g;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp1.b_message;
                        if(v4 == 0) {
                            throw null;
                        }
                        ((gipc)hftv3).c = v4 - 1;
                        ((gipc)hftv3).b |= 1;
                        if(!hftv3.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv4 = hftp1.b_message;
                        ((gipc)hftv4).b |= 2;
                        ((gipc)hftv4).d = v3;
                        int v5 = ehio0.f;
                        if(!hftv4.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gipc gipc0 = (gipc)hftp1.b_message;
                        gipc0.b |= 4;
                        gipc0.e = v5;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gipd gipd1 = (gipd)hftp0.b_message;
                        gipc gipc1 = (gipc)hftp1.N_build();
                        gipc1.getClass();
                        gipd1.g = gipc1;
                        gipd1.b |= 16;
                        return (gipd)hftp0.N_build();
                    }
                    return (gipd)hftp0.N_build();
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" name");
        }
        if((this.i & 1) == 0) {
            stringBuilder0.append(" startTimeMicroSec");
        }
        if((this.i & 2) == 0) {
            stringBuilder0.append(" timeDurationMicroSec");
        }
        if((this.i & 4) == 0) {
            stringBuilder0.append(" subEventCount");
        }
        if(this.b == 0) {
            stringBuilder0.append(" networkType");
        }
        if((this.i & 8) == 0) {
            stringBuilder0.append(" payloadSize");
        }
        if((this.i & 16) == 0) {
            stringBuilder0.append(" networkEvent");
        }
        if((this.i & 0x20) == 0) {
            stringBuilder0.append(" statusCode");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.g = z;
        this.i = (byte)(this.i | 16);
    }

    public final void c(int v) {
        this.f = v;
        this.i = (byte)(this.i | 8);
    }

    public final void d(long v) {
        this.c = v;
        this.i = (byte)(this.i | 1);
    }

    public final void e(int v) {
        this.h = v;
        this.i = (byte)(this.i | 0x20);
    }

    public final void f(int v) {
        this.e = v;
        this.i = (byte)(this.i | 4);
    }

    public final void g(long v) {
        this.d = v;
        this.i = (byte)(this.i | 2);
    }
}

