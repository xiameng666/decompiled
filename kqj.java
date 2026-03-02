import android.os.CancellationSignal;

public final class kqj implements evqc {
    public final krd a;
    public final CancellationSignal b;

    public kqj(krd krd0, CancellationSignal cancellationSignal0) {
        this.a = krd0;
        this.b = cancellationSignal0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        knt.a(this.b, new kqr(this.a, knn.a((!(exception0 instanceof aztb) || !kno.b.contains(Integer.valueOf(((aztb)exception0).b())) ? "CREATE_UNKNOWN" : "CREATE_INTERRUPTED"), "During create public key credential, fido registration failure: " + exception0.getMessage())));
    }
}

