import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class cbrx implements DialogInterface.OnClickListener {
    public final ibth a;

    public cbrx(ibth ibth0) {
        this.a = ibth0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        dialogInterface0.dismiss();
        this.a.a();
    }
}

