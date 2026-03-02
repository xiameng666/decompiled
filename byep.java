import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.identitycredentials.RegistrationResponse;

final class byep extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final bxyn d;
    final bxyi e;
    final RegistrationRequest f;
    final long g;
    final byes h;

    public byep(bxyn bxyn0, bxyi bxyi0, RegistrationRequest registrationRequest0, long v, byes byes0, ibrl ibrl0) {
        this.d = bxyn0;
        this.e = bxyi0;
        this.f = registrationRequest0;
        this.g = v;
        this.h = byes0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byep)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byep(this.d, this.e, this.f, this.g, this.h, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            object2 = this.b;
            object3 = this.a;
            ibnx.b(object0);
            ((bxyn)object3).m(((Status)object2), ((RegistrationResponse)object0), cckf.d(bbdp.cm));
            bxzl.g(this.g, this.h.b, bxzq.b, bxzp.b);
            return Status.b;
        }
        ibnx.b(object0);
        object3 = this.d;
        Status status0 = Status.b;
        this.a = object3;
        this.b = status0;
        this.c = 1;
        object0 = this.e.e(this.f, this);
        if(object0 != object1) {
            object2 = status0;
            ((bxyn)object3).m(((Status)object2), ((RegistrationResponse)object0), cckf.d(bbdp.cm));
            bxzl.g(this.g, this.h.b, bxzq.b, bxzp.b);
            return Status.b;
        }
        return object1;
    }
}

