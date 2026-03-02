public final class fvml implements fvmr {
    public final ProtoLiteBuilder a;

    public fvml(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // fvmr
    public final void a(int v, long v1) {
        ProtoLiteBuilder hftp0 = this.a;
        switch(v - 1) {
            case 0: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwul gwul1 = (gwul)hftp0.b_message;
                gwul1.b |= 8;
                gwul1.f = (int)v1;
                return;
            }
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwul gwul2 = (gwul)hftp0.b_message;
                gwul2.b |= 0x40;
                gwul2.g = (int)v1;
                return;
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwul gwul3 = (gwul)hftp0.b_message;
                gwul3.b |= 0x80;
                gwul3.h = (int)v1;
                return;
            }
            case 3: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwul gwul4 = (gwul)hftp0.b_message;
                gwul4.b |= 0x100;
                gwul4.i = v1;
                return;
            }
            default: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwul gwul0 = (gwul)hftp0.b_message;
                gwul0.b |= 0x200;
                gwul0.j = v1;
            }
        }
    }
}

