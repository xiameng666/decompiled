import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class fmqv implements DialogInterface.OnClickListener {
    public final fmqz a;

    public fmqv(fmqz fmqz0) {
        this.a = fmqz0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.c.c.a(this.a.c.d);
    }
}

