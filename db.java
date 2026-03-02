import android.app.Dialog;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

final class db implements DialogInterface.OnDismissListener {
    final de a;

    public db(de de0) {
        this.a = de0;
        super();
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        de de0 = this.a;
        Dialog dialog0 = de0.c;
        if(dialog0 != null) {
            de0.onDismiss(dialog0);
        }
    }
}

