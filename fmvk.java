import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class fmvk implements DialogInterface.OnDismissListener {
    public final fmvn a;

    public fmvk(fmvn fmvn0) {
        this.a = fmvn0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        this.a.a.a();
    }
}

