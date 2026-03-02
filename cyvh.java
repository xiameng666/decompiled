public final class cyvh implements gfsi {
    public final long a;

    public cyvh(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = false;
        if(((ProtoLiteMessage)(((cyxl)object0))).equals(cyxl.a)) {
            return Boolean.valueOf(false);
        }
        long v = System.currentTimeMillis();
        long v1 = ((cyxl)object0).i;
        if(v1 <= v && v1 + this.a >= v) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

