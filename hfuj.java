public final class hfuj {
    final hfuc a;
    final hfub b;

    public hfuj(hfuc hfuc0, hfub hfub0) {
        this.a = hfuc0;
        this.b = hfub0;
        super();
    }

    public final Object a(Object object0) {
        Object object1 = this.a.a(((Integer)object0).intValue());
        return object1 == null ? this.b : object1;
    }

    public static final Object b(Object object0) {
        return ((hfub)object0).a();
    }
}

