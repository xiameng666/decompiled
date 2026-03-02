public final class dcmn implements ibth {
    public final dcmf a;
    public final dcnp b;

    public dcmn(dcmf dcmf0, dcnp dcnp0) {
        this.a = dcmf0;
        this.b = dcnp0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.N(this.b);
        return ibom.a;
    }
}

