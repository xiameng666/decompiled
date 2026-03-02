final class cbvp extends ibuo implements ibts {
    public cbvp(Object object0) {
        super(1, object0, cbvv.class, "finishFlow", "finishFlow(I)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v = ((Number)object0).intValue();
        ((cbvv)this.e).ah(v);
        return ibom.a;
    }
}

