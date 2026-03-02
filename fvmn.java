public final class fvmn implements fvmr {
    public final ProtoLiteBuilder a;

    public fvmn(ProtoLiteBuilder hftp0) {
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
                gwuq gwuq1 = (gwuq)hftp0.b_message;
                gwuq1.b |= 8;
                gwuq1.f = (int)v1;
                return;
            }
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuq gwuq2 = (gwuq)hftp0.b_message;
                gwuq2.b |= 0x40;
                gwuq2.g = (int)v1;
                return;
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuq gwuq3 = (gwuq)hftp0.b_message;
                gwuq3.b |= 0x80;
                gwuq3.h = (int)v1;
                return;
            }
            case 3: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuq gwuq4 = (gwuq)hftp0.b_message;
                gwuq4.b |= 0x100;
                gwuq4.i = v1;
                return;
            }
            default: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuq gwuq0 = (gwuq)hftp0.b_message;
                gwuq0.b |= 0x200;
                gwuq0.j = v1;
            }
        }
    }
}

