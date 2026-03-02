import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class blqt implements DialogInterface.OnClickListener {
    public final bnaj a;
    public final bnae b;
    public final blrs c;

    public blqt(bnaj bnaj0, bnae bnae0, blrs blrs0) {
        this.a = bnaj0;
        this.b = bnae0;
        this.c = blrs0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.b(this.b, blgt.B);
        bmbz bmbz0 = new bmbz("The flow was cancelled");
        this.c.a(bmbz0);
    }
}

