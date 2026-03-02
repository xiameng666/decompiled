public final class fvmi implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmi(ProtoLiteBuilder hftp0) {
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
                    gwuo gwuo2 = (gwuo)hftp0.b_message;
                    gwuo2.b |= 4;
                    gwuo2.e = (int)v1;
                    return;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwuo gwuo3 = (gwuo)hftp0.b_message;
                    gwuo3.b |= 8;
                    gwuo3.f = (int)v1;
                    return;
                }
                default: {
                    if(v - 1 != 3) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwuo gwuo0 = (gwuo)hftp0.b_message;
                        gwuo0.b |= 0x20;
                        gwuo0.h = v1;
                        return;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwuo gwuo1 = (gwuo)hftp0.b_message;
                    gwuo1.b |= 16;
                    gwuo1.g = v1;
                    return;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwuo gwuo4 = (gwuo)hftp0.b_message;
        gwuo4.b |= 2;
        gwuo4.d = (int)v1;
    }
}

