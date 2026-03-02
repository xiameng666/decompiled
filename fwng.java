import android.net.ConnectivityManager;
import android.net.NetworkRequest.Builder;
import com.google.android.gms.libs.location.validation.platform.ContextKt__Context_androidKt.registerNetworkCallback.networkCallback.1;
import jeb.synthetic.FIN;

public final class fwng implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        cngm cngm0 = (cngm)object0;
        Object object1 = cngm0.a;
        __monitor_enter(object1);
        int v = FIN.finallyOpen$NT();
        cngm0.o = true;
        cndx cndx0 = cngm0.f;
        if(!cndx0.a) {
            cndx0.a = true;
            if(bbqa.d() && ((cnel)cndx0).d()) {
                cnej cnej0 = new cnej(((cnel)cndx0));
                Object object2 = ((cnel)cndx0).b.getSystemService("connectivity");
                ibuq.d(object2, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ContextKt__Context_androidKt.registerNetworkCallback.networkCallback.1 contextKt__Context_androidKt$registerNetworkCallback$networkCallback$10 = new ContextKt__Context_androidKt.registerNetworkCallback.networkCallback.1(((cnel)cndx0).b, cnej0);
                ((ConnectivityManager)object2).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), contextKt__Context_androidKt$registerNetworkCallback$networkCallback$10);
            }
            cngm0.l.f(cngm0, cngm0.i);
            cngm0.h.h(cngm0);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}

