public final class dgfm implements dgff {
    public static final dgfm a;

    static {
        dgfm.a = new dgfm();
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.c);
        dbxg dbxg0 = dbxf.a(((ProtoLiteMessage)dciz.a).v_newBuilder());
        dbxg0.b(dciy.d);
        dcnr0.b(dbxg0.a());
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfm)) {
            return false;
        }
        dgfm dgfm0 = (dgfm)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0xEE88303C;
    }

    @Override
    public final String toString() {
        return "NotEnoughSpace";
    }
}

