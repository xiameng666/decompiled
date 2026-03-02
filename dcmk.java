public final class dcmk implements ibth {
    public final dcmf a;
    public final dcnp b;

    public dcmk(dcmf dcmf0, dcnp dcnp0) {
        this.a = dcmf0;
        this.b = dcnp0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.M(this.b);
        return ibom.a;
    }
}

