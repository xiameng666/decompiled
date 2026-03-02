public final class fkwg implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkvt.a).v_newBuilder();
        for(Object object1: ((fiyh)object0).h) {
            fiyd fiyd0 = (fiyd)object1;
            switch(fiyd0.c) {
                case "large-photo-id": {
                    String s4 = fiyd0.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fkvt fkvt4 = (fkvt)hftp0.b_message;
                    s4.getClass();
                    fkvt4.b |= 8;
                    fkvt4.f = s4;
                    break;
                }
                case "medium-photo-id": {
                    String s = fiyd0.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fkvt fkvt0 = (fkvt)hftp0.b_message;
                    s.getClass();
                    fkvt0.b |= 4;
                    fkvt0.e = s;
                    break;
                }
                case "small-photo-id": {
                    String s1 = fiyd0.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fkvt fkvt1 = (fkvt)hftp0.b_message;
                    s1.getClass();
                    fkvt1.b |= 2;
                    fkvt1.d = s1;
                    break;
                }
                case "thumbnail-photo-id": {
                    String s3 = fiyd0.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fkvt fkvt3 = (fkvt)hftp0.b_message;
                    s3.getClass();
                    fkvt3.b |= 16;
                    fkvt3.g = s3;
                    break;
                }
                case "tiny-photo-id": {
                    String s5 = fiyd0.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fkvt fkvt5 = (fkvt)hftp0.b_message;
                    s5.getClass();
                    fkvt5.b |= 1;
                    fkvt5.c = s5;
                    break;
                }
                case "x-large-photo-id": {
                    String s2 = fiyd0.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fkvt fkvt2 = (fkvt)hftp0.b_message;
                    s2.getClass();
                    fkvt2.b |= 0x20;
                    fkvt2.h = s2;
                }
            }
        }
        return (fkvt)hftp0.N_build();
    }
}

