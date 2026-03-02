public final class fvmk implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmk(ProtoLiteBuilder hftp0) {
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
                gwum gwum1 = (gwum)hftp0.b_message;
                gwum1.b |= 16;
                gwum1.g = (int)v1;
                return;
            }
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwum gwum2 = (gwum)hftp0.b_message;
                gwum2.b |= 0x20;
                gwum2.h = (int)v1;
                return;
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwum gwum3 = (gwum)hftp0.b_message;
                gwum3.b |= 0x40;
                gwum3.i = (int)v1;
                return;
            }
            case 3: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwum gwum4 = (gwum)hftp0.b_message;
                gwum4.b |= 0x80;
                gwum4.j = v1;
                return;
            }
            default: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwum gwum0 = (gwum)hftp0.b_message;
                gwum0.b |= 0x100;
                gwum0.k = v1;
            }
        }
    }
}

