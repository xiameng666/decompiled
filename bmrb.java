import android.os.CancellationSignal.OnCancelListener;

public final class bmrb implements CancellationSignal.OnCancelListener {
    public final bmrf a;

    public bmrb(bmrf bmrf0) {
        this.a = bmrf0;
    }

    @Override  // android.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        bmrf.a.b(this.a.c, blgt.B);
        this.a.b.a(new bmbz("The lock screen verification flow was cancelled"));
    }
}

