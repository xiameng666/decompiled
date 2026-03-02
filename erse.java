import java.io.IOException;

final class erse extends ibsl implements ibtw {
    final ersf a;
    final String b;

    public erse(ersf ersf0, String s, ibrl ibrl0) {
        this.a = ersf0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((erse)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new erse(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        acsq acsq0 = (acsq)this.a.a.get();
        try {
            return evrg.d(acso.e(acsq0.a, this.b));
        }
        catch(IOException | acse exception0) {
            return evrg.c(exception0);
        }
    }
}

