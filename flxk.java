public final class flxk implements kar {
    public final ProtoLiteBuilder a;

    public flxk(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        int v = 2;
        switch(((fmhg)object0).g) {
            case 0: {
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            case 3: {
                v = 5;
                break;
            }
            case 4: {
                v = 6;
                break;
            }
            default: {
                v = 7;
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnvg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteBuilder hftp1 = this.a;
        ((hnvg)hftp0.b_message).b = v - 2;
        hnvg hnvg0 = (hnvg)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnva hnva0 = (hnva)hftp1.b_message;
        hnvg0.getClass();
        hnva0.d = hnvg0;
        hnva0.b |= 1;
    }
}

