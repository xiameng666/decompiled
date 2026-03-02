import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class duel implements DialogInterface.OnCancelListener {
    public final duew a;

    public duel(duew duew0) {
        this.a = duew0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.a.b.c();
    }
}

