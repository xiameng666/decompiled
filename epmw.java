import android.content.Context;
import android.provider.Settings.Secure;

public final class epmw extends ibsl implements ibtw {
    int a;
    final epna b;
    private Object c;

    public epmw(epna epna0, ibrl ibrl0) {
        this.b = epna0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epmw)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epmw(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            epna epna0 = this.b;
            epmv epmv0 = new epmv(epna0, ichm0);
            Context context0 = epna0.a;
            Object object2 = ichd.a(ichm0, Boolean.valueOf(Settings.Secure.getInt(context0.getContentResolver(), "mandatory_biometrics", 0) == 1));
            if(!(object2 instanceof icgy) && !icha.c(object2)) {
                throw new IllegalStateException("Check failed.");
            }
            context0.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("mandatory_biometrics"), true, epmv0);
            epmu epmu0 = new epmu(epna0, epmv0);
            this.a = 1;
            if(ichl.b(ichm0, epmu0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

