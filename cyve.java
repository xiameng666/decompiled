public final class cyve implements gfsi {
    public final long a;

    public cyve(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = false;
        if(((ProtoLiteMessage)(((cywx)object0))).equals(cywx.a)) {
            return Boolean.valueOf(false);
        }
        long v = System.currentTimeMillis();
        long v1 = ((cywx)object0).d;
        if(v1 <= v && v1 + this.a >= v) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

