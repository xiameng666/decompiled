public final class egf implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        int v = jbk.a(((eqt)object0).c);
        int v1 = v > 0 ? Character.offsetByCodePoints(((eqt)object0).d.b, v, -1) : -1;
        return v1 == -1 ? null : new jfy(jbk.a(((eqt)object0).c) - v1, 0);
    }
}

