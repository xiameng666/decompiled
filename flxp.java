public final class flxp implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v;
        switch(((fmhl)object0).j) {
            case 0: {
                v = 2;
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
            case 5: {
                v = 7;
                break;
            }
            case 6: {
                v = 8;
                break;
            }
            case 7: {
                v = 9;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            flbj.f("RichTextProtoConvUtils", "Unrecognized typeface with weight type: " + ((fmhl)object0));
            return hnvj.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnvj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnvj)hftp0.b_message).b = v - 2;
        return (hnvj)hftp0.N_build();
    }
}

