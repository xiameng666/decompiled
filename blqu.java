import android.os.CancellationSignal.OnCancelListener;

public final class blqu implements CancellationSignal.OnCancelListener {
    public final bnaj a;
    public final bnae b;
    public final blrs c;

    public blqu(bnaj bnaj0, bnae bnae0, blrs blrs0) {
        this.a = bnaj0;
        this.b = bnae0;
        this.c = blrs0;
    }

    @Override  // android.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        this.a.b(this.b, blgt.B);
        bmbz bmbz0 = new bmbz("The flow was cancelled");
        this.c.a(bmbz0);
    }
}

