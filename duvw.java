import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class duvw implements DialogInterface.OnClickListener {
    public final duwt a;
    public final gtxg b;

    public duvw(duwt duwt0, gtxg gtxg0) {
        this.a = duwt0;
        this.b = gtxg0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        duwt.B(this.a, null, this.b.b, 1);
    }
}

