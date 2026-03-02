import android.net.ConnectivityManager;
import com.google.android.gms.multidevice.service.system.ConnectivityModule.providesConnectivityStatusFlow.1.networkCallback.1;

public final class ctgd extends ibsl implements ibtw {
    int a;
    final ConnectivityManager b;
    private Object c;

    public ctgd(ConnectivityManager connectivityManager0, ibrl ibrl0) {
        this.b = connectivityManager0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctgd)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctgd(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    public static final void d(ichm ichm0, boolean z) {
        Boolean boolean0 = Boolean.valueOf(z);
        Object object0 = ichm0.b(boolean0);
        if((object0 instanceof icgy)) {
            ((ggtj)ctge.a.j()).x("Error: connectivity trySend() closed");
        }
        if((object0 instanceof icgz)) {
            ((ggtj)ctge.a.j()).x("Error: connectivity trySend() failure");
            return;
        }
        ibom ibom0 = (ibom)object0;
        ((ggtj)ctge.a.h()).B("Connectivity: %s", boolean0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            ConnectivityModule.providesConnectivityStatusFlow.1.networkCallback.1 connectivityModule$providesConnectivityStatusFlow$1$networkCallback$10 = new ConnectivityModule.providesConnectivityStatusFlow.1.networkCallback.1(ichm0);
            this.b.registerDefaultNetworkCallback(connectivityModule$providesConnectivityStatusFlow$1$networkCallback$10);
            ctgc ctgc0 = new ctgc(this.b, connectivityModule$providesConnectivityStatusFlow$1$networkCallback$10);
            this.a = 1;
            if(ichl.b(ichm0, ctgc0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

