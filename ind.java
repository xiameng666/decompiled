import android.view.Choreographer;

final class ind extends ibsl implements ibtw {
    public ind(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        icck icck0 = (icck)object0;
        return new ind(((ibrl)object1)).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ind(ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Choreographer.getInstance();
    }
}

