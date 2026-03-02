public final class bgi implements kar {
    public final bgs a;

    public bgi(bgs bgs0) {
        this.a = bgs0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        if(((bgr)object0).a.a()) {
            ((bgr)object0).b.close();
            return;
        }
        bgp bgp0 = new bgp(this.a, ((bgr)object0));
        this.a.a.execute(bgp0);
    }
}

