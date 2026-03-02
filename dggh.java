public final class dggh implements dgfe {
    public static final dggh a;

    static {
        dggh.a = new dggh();
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.h);
        dciq dciq0 = dcip.a(((ProtoLiteMessage)dcjr.a).v_newBuilder());
        dciq0.b(0.0f);
        ProtoLiteBuilder hftp0 = dciq0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjr.b(((dcjr)hftp0.b_message));
        dcnr0.c(dciq0.a());
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dggh)) {
            return false;
        }
        dggh dggh0 = (dggh)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0x2B9BFFB4;
    }

    @Override
    public final String toString() {
        return "StartTransfer";
    }
}

