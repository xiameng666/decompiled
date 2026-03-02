final class rwt implements ibum, icih {
    final rzt a;

    public rwt(rzt rzt0) {
        this.a = rzt0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        this.a.a(((rzz)object0));
        return ibom.a;
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibue(2, this.a, rzt.class, "onChange", "onChange(Lcom/android/onboarding/tasks/service/IPersistableBundleStream;)V", 4);
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

