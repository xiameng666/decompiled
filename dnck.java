import com.google.android.gms.pay.Gp3SupportInfo;

public final class dnck implements ibts {
    public final dndr a;

    public dnck(dndr dndr0) {
        this.a = dndr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Gp3SupportInfo)object0), "info");
        if(((Gp3SupportInfo)object0).a == null) {
            ((ggtj)dndr.a.j()).x("GP3SupportInfo was not set.");
        }
        else {
            dndr dndr0 = this.a;
            boolean z = ibuq.m(dndr0.y(), ((Gp3SupportInfo)object0).a);
            if(dndr0.S().c != z) {
                dndr0.S().c = z;
                dndr0.ai();
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

