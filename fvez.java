public final class fvez implements ibts {
    public final fvfq a;

    public fvez(fvfq fvfq0) {
        this.a = fvfq0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v = ((fvfw)object0).e;
        fvfq fvfq0 = this.a;
        if(Long.compare(v, 0x8000000000000000L) != 0) {
            long v1 = ((fvfw)object0).d.c.toMillis();
            if(fvfq0.l - v < v1 - Math.min(((long)(((float)v1) * 0.1f)), 30000L)) {
                return new fvft();
            }
        }
        return new fvfu(((fvfw)object0), fvfq0);
    }
}

