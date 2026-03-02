final class jmp extends ibur implements ibts {
    final jmw a;

    public jmp(jmw jmw0) {
        this.a = jmw0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        this.a.q = (ibts)object0;
        return ibom.a;
    }
}

