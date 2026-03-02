import android.os.CancellationSignal;

public final class kqa implements evqc {
    public final kqe a;
    public final CancellationSignal b;

    public kqa(kqe kqe0, CancellationSignal cancellationSignal0) {
        this.a = kqe0;
        this.b = cancellationSignal0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        knt.a(this.b, new kpx(this.a, knn.a((!(exception0 instanceof aztb) || !kno.b.contains(Integer.valueOf(((aztb)exception0).b())) ? "CREATE_UNKNOWN" : "CREATE_INTERRUPTED"), "During save password, found password failure response from one tap " + exception0.getMessage())));
    }
}

