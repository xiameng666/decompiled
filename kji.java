import android.os.CancellationSignal;

public final class kji implements ibts {
    final CancellationSignal a;

    public kji(CancellationSignal cancellationSignal0) {
        this.a = cancellationSignal0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.a.cancel();
        return ibom.a;
    }
}

