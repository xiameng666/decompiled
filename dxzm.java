import j..util.DesugarCollections;

public final class dxzm implements ibts {
    public final String a;

    public dxzm(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return (dxfe)DesugarCollections.unmodifiableMap(((dxfb)object0).b).get(this.a);
    }
}

