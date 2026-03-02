import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class beyl implements DialogInterface.OnClickListener {
    public final bfah a;

    public beyl(bfah bfah0) {
        this.a = bfah0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.u.l(Boolean.valueOf(false));
    }
}

