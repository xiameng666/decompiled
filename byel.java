import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;

final class byel extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final bxyn d;
    final bxyi e;
    final ClearCredentialStateRequest f;
    final long g;

    public byel(bxyn bxyn0, bxyi bxyi0, ClearCredentialStateRequest clearCredentialStateRequest0, long v, ibrl ibrl0) {
        this.d = bxyn0;
        this.e = bxyi0;
        this.f = clearCredentialStateRequest0;
        this.g = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byel)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byel(this.d, this.e, this.f, this.g, ibrl0);
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
            ((bxyn)object3).b(((Status)object2), ((ClearCredentialStateResponse)object0), cckf.d(bbdp.cm));
            return Status.b;
        }
        ibnx.b(object0);
        bxyn bxyn0 = this.d;
        Status status0 = Status.b;
        String s = bxvo.a(this.g);
        this.a = bxyn0;
        this.b = status0;
        this.c = 1;
        Object object4 = this.e.h(s, this);
        if(object4 != object1) {
            object0 = object4;
            object3 = bxyn0;
            object2 = status0;
            ((bxyn)object3).b(((Status)object2), ((ClearCredentialStateResponse)object0), cckf.d(bbdp.cm));
            return Status.b;
        }
        return object1;
    }
}

