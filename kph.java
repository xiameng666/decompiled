import android.os.CancellationSignal;

public final class kph implements evqc {
    public final kpq a;
    public final CancellationSignal b;

    public kph(kpq kpq0, CancellationSignal cancellationSignal0) {
        this.a = kpq0;
        this.b = cancellationSignal0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        knt.a(this.b, new kpj(this.a, knn.b((!(exception0 instanceof aztb) || !kno.b.contains(Integer.valueOf(((aztb)exception0).b())) ? "GET_NO_CREDENTIALS" : "GET_INTERRUPTED"), "During begin sign in, failure response from one tap: " + exception0.getMessage())));
    }
}

