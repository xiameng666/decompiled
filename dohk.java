import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dohk implements dohd, dohj {
    private final ValuableGroup a;

    public dohk(ValuableGroup valuableGroup0) {
        ibuq.f(valuableGroup0, "valuableGroup");
        super();
        this.a = valuableGroup0;
    }

    @Override  // edxb
    public final int a(edxb edxb0) {
        return dohc.a(edxb0);
    }

    @Override  // edxb
    public final int b() {
        return 0;
    }

    @Override  // edxb
    public final long c() {
        return 0x8000000000000000L;
    }

    @Override  // edxb
    public final String d() {
        ibuq.e(this.a.b, "groupId");
        return this.a.b;
    }

    @Override  // edxb
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dohk) ? ibuq.m(this.a, ((dohk)object0).a) : false;
    }

    @Override  // edxb
    public final boolean g(edxb edxb0) {
        return edxa.a(this, edxb0) && this.j() == ((dohk)edxb0).j() && ibuq.m(this.a, ((dohk)edxb0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // dohj
    public final ValuableGroup i() {
        return this.a;
    }

    public final boolean j() {
        return this.a.bN();
    }

    @Override  // dohd
    public final long k() {
        gged_interceptors gged0 = this.a.a;
        ibuq.e(gged0, "valuables(...)");
        Valuable valuable0 = (Valuable)ibpo.T(gged0);
        return valuable0 == null ? 0L : ((long)(((Long)valuable0.bu().f(Long.valueOf(0L)))));
    }

    @Override  // dohd
    public final boolean l() {
        return guvj.c == this.a.h;
    }

    @Override
    public final String toString() {
        return "ValuableGroupItem(valuableGroup=" + this.a + ")";
    }
}

