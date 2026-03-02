final class cfi extends ibur implements ibts {
    final cfj a;

    public cfi(cfj cfj0) {
        this.a = cfj0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return Boolean.valueOf(!this.a.d.contains(((cfk)object0)) || !((cfk)object0).m());
    }
}

