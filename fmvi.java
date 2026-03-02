import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class fmvi implements DialogInterface.OnClickListener {
    public final fmvn a;

    public fmvi(fmvn fmvn0) {
        this.a = fmvn0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.a.b();
    }
}

