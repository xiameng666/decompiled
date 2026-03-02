import com.google.android.gms.auth.HasCapabilitiesRequest;
import java.io.IOException;

final class bgkr extends ibsl implements ibtw {
    int a;
    final bgks b;
    final HasCapabilitiesRequest c;

    public bgkr(bgks bgks0, HasCapabilitiesRequest hasCapabilitiesRequest0, ibrl ibrl0) {
        this.b = bgks0;
        this.c = hasCapabilitiesRequest0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bgkr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bgkr(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        evql evql0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        try {
            evql0 = evrg.d(Integer.valueOf(acso.c(this.b.a.a, this.c)));
        }
        catch(IOException | acse exception0) {
            evql0 = evrg.c(exception0);
        }
        this.a = 1;
        Object object2 = ictn.b(evql0, this);
        return object2 == object1 ? object1 : object2;
    }
}

