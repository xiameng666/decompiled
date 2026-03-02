import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eztc {
    private static final bboh a;

    static {
        eztc.a = bboh.d();
    }

    public static hfcg a(ContextData contextData0) {
        if(contextData0 != null) {
            byte[] arr_b = contextData0.o();
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfcg.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hfcg)hftv0;
        }
        return null;
    }

    public static final bcsm b(azts azts0) {
        bcso bcso0 = new bcso();
        bcso0.b(10002);
        bcso0.d(2);
        ContextDataFilterImpl contextDataFilterImpl0 = bcso0.a();
        try {
            bcvo bcvo0 = new bcvo(azts0.D, contextDataFilterImpl0);
            azts0.D.c(bcvo0);
            return ((bctp)((azui)evrg.o(batf.a(bcvo0, new azui()), hzdj.b(), TimeUnit.MILLISECONDS)).a).b();
        }
        catch(ExecutionException | TimeoutException | InterruptedException exception0) {
            a.ae(eztc.a.i(), "Failure reading udc context", exception0);
            return null;
        }
    }
}

