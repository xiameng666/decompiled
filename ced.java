final class ced extends ibur implements ibts {
    final ibts a;

    public ced(ibts ibts0) {
        this.a = ibts0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new jlf(((long)((Number)this.a.a(Integer.valueOf(((int)(((jlk)object0).a >> 0x20))))).intValue()) << 0x20);
    }
}

