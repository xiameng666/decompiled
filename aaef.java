import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class aaef implements DialogInterface.OnCancelListener {
    public final aaei a;

    public aaef(aaei aaei0) {
        this.a = aaei0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.a.b.a(false);
    }
}

