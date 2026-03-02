import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

final class da implements DialogInterface.OnCancelListener {
    final de a;

    public da(de de0) {
        this.a = de0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        de de0 = this.a;
        Dialog dialog0 = de0.c;
        if(dialog0 != null) {
            de0.onCancel(dialog0);
        }
    }
}

