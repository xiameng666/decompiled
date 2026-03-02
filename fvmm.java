public final class fvmm implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmm(ProtoLiteBuilder hftp0) {
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
                    gwuc gwuc2 = (gwuc)hftp0.b_message;
                    gwuc2.b |= 4;
                    gwuc2.e = (int)v1;
                    return;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwuc gwuc3 = (gwuc)hftp0.b_message;
                    gwuc3.b |= 8;
                    gwuc3.f = (int)v1;
                    return;
                }
                default: {
                    if(v - 1 != 3) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwuc gwuc0 = (gwuc)hftp0.b_message;
                        gwuc0.b |= 0x20;
                        gwuc0.h = v1;
                        return;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwuc gwuc1 = (gwuc)hftp0.b_message;
                    gwuc1.b |= 16;
                    gwuc1.g = v1;
                    return;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwuc gwuc4 = (gwuc)hftp0.b_message;
        gwuc4.b |= 2;
        gwuc4.d = (int)v1;
    }
}

