final class dcza implements ibum, icih {
    final dixi a;

    public dcza(dixi dixi0) {
        this.a = dixi0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        this.a.a(object0);
        return ibom.a;
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibue(2, this.a, dixi.class, "dispatch", "dispatch(Ljava/lang/Object;)Lkotlinx/coroutines/Job;", 12);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof icih) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }
}

