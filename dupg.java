import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;

public final class dupg implements DialogInterface.OnClickListener {
    public final duqg a;
    public final gtxg b;

    public dupg(duqg duqg0, gtxg gtxg0) {
        this.a = duqg0;
        this.b = gtxg0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Intent intent0 = dlnf.U(this.b.b).addFlags(0x4000000);
        this.a.startActivity(intent0);
    }
}

