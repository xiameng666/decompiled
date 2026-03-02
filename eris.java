import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import j..util.Objects;

public final class eris implements DialogInterface.OnClickListener {
    final eriw a;

    public eris(eriw eriw0) {
        Objects.requireNonNull(eriw0);
        this.a = eriw0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(v == -1) {
            this.a.d.e();
            return;
        }
        dialogInterface0.dismiss();
    }
}

