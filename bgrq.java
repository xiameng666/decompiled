public final class bgrq implements gful_cronetEngineProvider {
    public final hgtu a;
    public final long b;
    public final hgto c;
    public final String d;
    public final String e;
    public final hgue f;
    public final int g;

    public bgrq(hgtu hgtu0, long v, hgto hgto0, String s, String s1, hgue hgue0, int v1) {
        this.a = hgtu0;
        this.b = v;
        this.c = hgto0;
        this.d = s;
        this.e = s1;
        this.f = hgue0;
        this.g = v1;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwje.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwjd.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((gwjd)hftv0).c = 1;
        ((gwjd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        this.a.getClass();
        ((gwjd)hftv1).d = this.a;
        ((gwjd)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        int v = 4;
        ((gwjd)hftv2).b |= 4;
        ((gwjd)hftv2).e = this.b;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwjd gwjd0 = (gwjd)hftp2.b_message;
        gwjd0.f = this.c.a();
        gwjd0.b |= 8;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        this.d.getClass();
        ((gwjd)hftv3).b |= 16;
        ((gwjd)hftv3).g = this.d;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp2.b_message;
        this.e.getClass();
        ((gwjd)hftv4).b |= 0x20;
        ((gwjd)hftv4).h = this.e;
        if(!hftv4.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwjd gwjd1 = (gwjd)hftp2.b_message;
        this.f.getClass();
        gwjd1.i = this.f;
        gwjd1.b |= 0x40;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwjk.a).v_newBuilder();
        switch(this.g) {
            case 1: {
                break;
            }
            case 2: {
                v = 5;
                break;
            }
            case 3: {
                v = 6;
                break;
            }
            case 4: {
                v = 7;
                break;
            }
            case 5: {
                v = 8;
                break;
            }
            case 6: {
                v = 13;
                break;
            }
            case 7: {
                v = 14;
                break;
            }
            case 8: {
                v = 15;
                break;
            }
            case 9: {
                v = 16;
                break;
            }
            case 10: {
                v = 10;
                break;
            }
            case 11: {
                v = 9;
                break;
            }
            case 12: {
                v = 2;
                break;
            }
            case 13: {
                v = 11;
                break;
            }
            case 14: {
                v = 12;
                break;
            }
            case 15: {
                v = 17;
                break;
            }
            case 16: {
                v = 3;
                break;
            }
            case 17: {
                v = 19;
                break;
            }
            case 18: {
                v = 18;
                break;
            }
            default: {
                v = 1;
            }
        }
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gwjk)hftp3.b_message).c = v - 1;
        ((gwjk)hftp3.b_message).b |= 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwjd gwjd2 = (gwjd)hftp2.b_message;
        gwjk gwjk0 = (gwjk)hftp3.N_build();
        gwjk0.getClass();
        gwjd2.j = gwjk0;
        gwjd2.b |= 0x80;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwje gwje0 = (gwje)hftp1.b_message;
        gwjd gwjd3 = (gwjd)hftp2.N_build();
        gwjd3.getClass();
        gwje0.d = gwjd3;
        gwje0.b |= 2;
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

