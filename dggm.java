public final class dggm implements dgff {
    public static final dggm a;

    static {
        dggm.a = new dggm();
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.c);
        dbxg dbxg0 = dbxf.a(((ProtoLiteMessage)dciz.a).v_newBuilder());
        dbxg0.b(dciy.e);
        dcnr0.b(dbxg0.a());
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dggm)) {
            return false;
        }
        dggm dggm0 = (dggm)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0xF18B6F59;
    }

    @Override
    public final String toString() {
        return "UnsupportedAttachmentType";
    }
}

