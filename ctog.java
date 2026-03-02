final class ctog implements ibum, icih {
    final icih a;

    public ctog(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object1 = this.a.a(((byte[])object0), ibrl0);
        return object1 == ibrx.a ? object1 : ibom.a;
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(2, this.a, icih.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
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

