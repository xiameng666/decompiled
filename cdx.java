final class cdx extends ibur implements ibts {
    final ibts a;

    public cdx(ibts ibts0) {
        this.a = ibts0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new jlk(((long)(((int)(((jlk)object0).a & 0xFFFFFFFFL)))) & 0xFFFFFFFFL | ((long)((Number)this.a.a(Integer.valueOf(((int)(((jlk)object0).a >> 0x20))))).intValue()) << 0x20);
    }
}

