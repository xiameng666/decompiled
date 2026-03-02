public final class cyoa implements kar {
    public final cyoi a;
    public final boolean b;

    public cyoa(cyoi cyoi0, boolean z) {
        this.a = cyoi0;
        this.b = z;
    }

    @Override  // kar
    public final void accept(Object object0) {
        cyql cyql0 = (cyql)object0;
        this.a.k.accept(Boolean.valueOf(this.b));
    }
}

