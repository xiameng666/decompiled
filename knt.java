import android.os.CancellationSignal;

public final class knt {
    public static final void a(CancellationSignal cancellationSignal0, ibth ibth0) {
        ibuq.f(ibth0, "onResultOrException");
        if(knm.a(cancellationSignal0)) {
            return;
        }
        ibth0.a();
    }

    public static final String b(int v) {
        return a.f(v, "activity with result code: ", " indicating not RESULT_OK");
    }

    public static final boolean c(int v, ibtw ibtw0, ibts ibts0, CancellationSignal cancellationSignal0) {
        if(v != -1) {
            ibvd ibvd0 = new ibvd();
            ibvd0.a = new klq(knt.b(v));
            if(v == 0) {
                ibvd0.a = new klk("activity is cancelled by the user.");
            }
            ibtw0.a(cancellationSignal0, new kns(ibts0, ibvd0));
            return true;
        }
        return false;
    }
}

