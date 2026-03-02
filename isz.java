import android.os.CancellationSignal;

final class isz extends ibur implements ibts {
    final CancellationSignal a;

    public isz(CancellationSignal cancellationSignal0) {
        this.a = cancellationSignal0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((Throwable)object0) != null) {
            this.a.cancel();
        }
        return ibom.a;
    }
}

