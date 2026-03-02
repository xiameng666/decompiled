import j..util.DesugarCollections;

public final class azdx implements gfsi {
    public final String a;

    public azdx(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = (ayvu)DesugarCollections.unmodifiableMap(((ayvv)object0).b).get(this.a);
        return object1 == null || azea.b(((ayvu)object1)) ? null : object1;
    }
}

