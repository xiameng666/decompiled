public final class dgfw implements dgfe {
    public final float a;

    public dgfw(float f) {
        this.a = f;
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.h);
        dciq dciq0 = dcip.a(((ProtoLiteMessage)dcjr.a).v_newBuilder());
        dciq0.b(this.a);
        dcnr0.c(dciq0.a());
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dgfw) ? Float.compare(this.a, ((dgfw)object0).a) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return "ProgressUpdate(progress=" + this.a + ")";
    }
}

