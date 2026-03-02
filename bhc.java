final class bhc implements bpd {
    final bfd a;
    final bhd b;

    public bhc(bhd bhd0, bfd bfd0) {
        this.b = bhd0;
        this.a = bfd0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        bfd bfd0 = this.a;
        if(bfd0.b.e) {
            return;
        }
        int v = ((bjo)bfd0.a.get(0)).a();
        if((throwable0 instanceof bcf)) {
            this.b.b.b(new bgx(v, ((bcf)throwable0)));
        }
        else {
            this.b.b.b(new bgx(v, new bcf("Failed to submit capture request", throwable0)));
        }
        this.b.f.a();
    }

    @Override  // bpd
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        this.b.f.a();
    }
}

