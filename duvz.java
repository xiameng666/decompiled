import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;

public final class duvz implements DialogInterface.OnClickListener {
    public final duwt a;
    public final gtxg b;

    public duvz(duwt duwt0, gtxg gtxg0) {
        this.a = duwt0;
        this.b = gtxg0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Intent intent0 = dlnf.T(this.b.b, this.a.requireContext());
        this.a.startActivity(intent0);
        this.a.ar();
    }
}

