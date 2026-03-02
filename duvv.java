import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;

public final class duvv implements DialogInterface.OnClickListener {
    public final duwt a;
    public final gtxg b;

    public duvv(duwt duwt0, gtxg gtxg0) {
        this.a = duwt0;
        this.b = gtxg0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Intent intent0 = dlnf.U(this.b.b).addFlags(0x4000000);
        ibuq.e(intent0, "addFlags(...)");
        this.a.startActivity(intent0);
        this.a.ar();
    }
}

