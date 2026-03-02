import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class erdv implements DialogInterface.OnClickListener {
    public final ered a;

    public erdv(ered ered0) {
        this.a = ered0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        ered.d.d("Mandatory Biometrics canceled by user", new Object[0]);
        this.a.ag.C(1);
    }
}

