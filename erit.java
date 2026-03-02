import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import j..util.Objects;

public final class erit implements DialogInterface.OnDismissListener {
    final eriw a;

    public erit(eriw eriw0) {
        Objects.requireNonNull(eriw0);
        this.a = eriw0;
        super();
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        this.a.c = null;
    }
}

