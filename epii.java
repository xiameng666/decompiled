import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class epii implements DialogInterface.OnCancelListener {
    public final epij a;

    public epii(epij epij0) {
        this.a = epij0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        epil.b(this.a);
    }
}

