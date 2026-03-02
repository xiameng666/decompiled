public final class fvmh implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmh(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // fvmr
    public final void a(int v, long v1) {
        ProtoLiteBuilder hftp0 = this.a;
        if(v - 1 != 0) {
            switch(v - 1) {
                case 1: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwux gwux2 = (gwux)hftp0.b_message;
                    gwux2.b |= 4;
                    gwux2.e = (int)v1;
                    return;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwux gwux3 = (gwux)hftp0.b_message;
                    gwux3.b |= 8;
                    gwux3.f = (int)v1;
                    return;
                }
                default: {
                    if(v - 1 != 3) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwux gwux0 = (gwux)hftp0.b_message;
                        gwux0.b |= 0x20;
                        gwux0.h = v1;
                        return;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwux gwux1 = (gwux)hftp0.b_message;
                    gwux1.b |= 16;
                    gwux1.g = v1;
                    return;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwux gwux4 = (gwux)hftp0.b_message;
        gwux4.b |= 2;
        gwux4.d = (int)v1;
    }
}

