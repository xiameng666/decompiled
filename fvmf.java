public final class fvmf implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmf(ProtoLiteBuilder hftp0) {
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
                    gwur gwur2 = (gwur)hftp0.b_message;
                    gwur2.b |= 4;
                    gwur2.e = (int)v1;
                    return;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwur gwur3 = (gwur)hftp0.b_message;
                    gwur3.b |= 8;
                    gwur3.f = (int)v1;
                    return;
                }
                default: {
                    if(v - 1 != 3) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwur gwur0 = (gwur)hftp0.b_message;
                        gwur0.b |= 0x20;
                        gwur0.h = v1;
                        return;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwur gwur1 = (gwur)hftp0.b_message;
                    gwur1.b |= 16;
                    gwur1.g = v1;
                    return;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwur gwur4 = (gwur)hftp0.b_message;
        gwur4.b |= 2;
        gwur4.d = (int)v1;
    }
}

