import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class duek implements DialogInterface.OnDismissListener {
    public final duew a;

    public duek(duew duew0) {
        this.a = duew0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        duew duew0 = this.a;
        duew0.b.c();
        if(!duew0.aQ.i()) {
            duew0.ai.n();
        }
    }
}

