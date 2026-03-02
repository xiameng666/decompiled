public final class fvmg implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmg(ProtoLiteBuilder hftp0) {
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
                    gwun gwun2 = (gwun)hftp0.b_message;
                    gwun2.b |= 4;
                    gwun2.e = (int)v1;
                    return;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwun gwun3 = (gwun)hftp0.b_message;
                    gwun3.b |= 8;
                    gwun3.f = (int)v1;
                    return;
                }
                default: {
                    if(v - 1 != 3) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwun gwun0 = (gwun)hftp0.b_message;
                        gwun0.b |= 0x20;
                        gwun0.h = v1;
                        return;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwun gwun1 = (gwun)hftp0.b_message;
                    gwun1.b |= 16;
                    gwun1.g = v1;
                    return;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwun gwun4 = (gwun)hftp0.b_message;
        gwun4.b |= 2;
        gwun4.d = (int)v1;
    }
}

