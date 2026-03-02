final class fvrn {
    private int a;
    private int b;

    public fvrn() {
        this.a = 0;
        this.b = 0;
    }

    final gxnh a() {
        synchronized(this) {
            if(this.a > 0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxnh.a).v_newBuilder();
                int v1 = this.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gxnh)hftv0).b |= 1;
                ((gxnh)hftv0).c = v1;
                int v2 = this.b;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gxnh gxnh0 = (gxnh)hftp0.b_message;
                gxnh0.b |= 2;
                gxnh0.d = v2;
                return (gxnh)hftp0.N_build();
            }
        }
        return null;
    }

    public final void b(boolean z) {
        synchronized(this) {
            ++this.a;
            if(z) {
                ++this.b;
            }
        }
    }

    final void c() {
        synchronized(this) {
            this.a = 0;
            this.b = 0;
        }
    }
}

