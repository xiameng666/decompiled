public final class dggk implements dgff {
    public static final dggk a;

    static {
        dggk.a = new dggk();
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.c);
        dbxg dbxg0 = dbxf.a(((ProtoLiteMessage)dciz.a).v_newBuilder());
        dbxg0.b(dciy.f);
        dcnr0.b(dbxg0.a());
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dggk)) {
            return false;
        }
        dggk dggk0 = (dggk)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return -387502104;
    }

    @Override
    public final String toString() {
        return "Timeout";
    }
}

