import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class fmqx implements DialogInterface.OnDismissListener {
    public final fmqz a;

    public fmqx(fmqz fmqz0) {
        this.a = fmqz0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        this.a.c.c.b();
    }
}

