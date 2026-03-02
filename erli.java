import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class erli implements DialogInterface.OnClickListener {
    public final erlr a;

    public erli(erlr erlr0) {
        this.a = erlr0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.b.D();
    }
}

