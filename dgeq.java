public final class dgeq implements dgfe {
    public static final dgeq a;

    static {
        dgeq.a = new dgeq();
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.g);
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgeq)) {
            return false;
        }
        dgeq dgeq0 = (dgeq)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0xC9085F13;
    }

    @Override
    public final String toString() {
        return "Cancel";
    }
}

