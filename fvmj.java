public final class fvmj implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmj(ProtoLiteBuilder hftp0) {
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
                gwua gwua1 = (gwua)hftp0.b_message;
                gwua1.b |= 8;
                gwua1.f = (int)v1;
                return;
            }
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwua gwua2 = (gwua)hftp0.b_message;
                gwua2.b |= 0x40;
                gwua2.g = (int)v1;
                return;
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwua gwua3 = (gwua)hftp0.b_message;
                gwua3.b |= 0x80;
                gwua3.h = (int)v1;
                return;
            }
            case 3: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwua gwua4 = (gwua)hftp0.b_message;
                gwua4.b |= 0x100;
                gwua4.i = v1;
                return;
            }
            default: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwua gwua0 = (gwua)hftp0.b_message;
                gwua0.b |= 0x200;
                gwua0.j = v1;
            }
        }
    }
}

