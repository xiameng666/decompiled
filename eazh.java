import android.os.RemoteException;

final class eazh extends ibsl implements ibtw {
    int a;
    final eazj b;

    public eazh(eazj eazj0, ibrl ibrl0) {
        this.b = eazj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eazh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eazh(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
            }
            catch(RemoteException remoteException0) {
                eazj.d(this.b, remoteException0, null, 2);
            }
            catch(cjuh cjuh0) {
                eazj.d(this.b, cjuh0, null, 2);
            }
            return ibom.a;
        }
        ibnx.b(object0);
        try {
            this.a = 1;
            if(this.b.c(this) == object1) {
                return object1;
            }
        }
        catch(RemoteException remoteException0) {
            eazj.d(this.b, remoteException0, null, 2);
        }
        catch(cjuh cjuh0) {
            eazj.d(this.b, cjuh0, null, 2);
        }
        return ibom.a;
    }
}

