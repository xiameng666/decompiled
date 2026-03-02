import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class ermz implements DialogInterface.OnClickListener {
    public final erna a;

    public ermz(erna erna0) {
        this.a = erna0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.kE();
        dialogInterface0.dismiss();
    }
}

