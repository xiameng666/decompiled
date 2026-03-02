import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class eyso implements DialogInterface.OnClickListener {
    public final eysx a;

    public eyso(eysx eysx0) {
        this.a = eysx0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.c.a();
    }
}

