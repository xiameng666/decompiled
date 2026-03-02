import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class eysj implements DialogInterface.OnClickListener {
    public final eysx a;

    public eysj(eysx eysx0) {
        this.a = eysx0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        dialogInterface0.dismiss();
        ibth ibth0 = this.a.d;
        if(ibth0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ibth0.a();
    }
}

