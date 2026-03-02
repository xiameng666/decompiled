public final class hvdk implements gfsi {
    public final fpiz a;

    public hvdk(fpiz fpiz0) {
        this.a = fpiz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hvdl hvdl0 = new hvdl();
        return new fpiw(this.a, ((String)object0), null, true, hvdl0);
    }
}

