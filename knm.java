import android.os.CancellationSignal;
import android.util.Log;

public final class knm {
    public static final boolean a(CancellationSignal cancellationSignal0) {
        if(cancellationSignal0 == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
        }
        else if(cancellationSignal0.isCanceled()) {
            Log.i("PlayServicesImpl", "the flow has been canceled");
            return true;
        }
        return false;
    }

    public static final boolean b(kka kka0) {
        ibuq.f(kka0, "request");
        for(Object object0: kka0.a) {
            if((((kjn)object0) instanceof fhsc)) {
                return true;
            }
        }
        return false;
    }

    public static final void c(CancellationSignal cancellationSignal0, ibth ibth0) {
        if(!knm.a(cancellationSignal0)) {
            ibth0.a();
        }
    }
}

