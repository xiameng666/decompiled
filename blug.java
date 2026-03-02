import android.os.CancellationSignal.OnCancelListener;

public final class blug implements CancellationSignal.OnCancelListener {
    public final blui a;

    public blug(blui blui0) {
        this.a = blui0;
    }

    @Override  // android.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        ((ggtj)blui.a.h()).x("Authentication cancelled.");
        this.a.b.c.ii(new blux(16));
    }
}

