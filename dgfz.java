public final class dgfz implements dgff {
    public static final dgfz a;

    static {
        dgfz.a = new dgfz();
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.c);
        dbxg dbxg0 = dbxf.a(((ProtoLiteMessage)dciz.a).v_newBuilder());
        dbxg0.b(dciy.c);
        dcnr0.b(dbxg0.a());
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfz)) {
            return false;
        }
        dgfz dgfz0 = (dgfz)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return -489184200;
    }

    @Override
    public final String toString() {
        return "Reject";
    }
}

