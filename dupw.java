import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class dupw implements DialogInterface.OnClickListener {
    public final duqg a;
    public final gtxg b;

    public dupw(duqg duqg0, gtxg gtxg0) {
        this.a = duqg0;
        this.b = gtxg0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.I(this.b.b);
    }
}

