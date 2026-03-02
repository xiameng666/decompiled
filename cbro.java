import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;

public final class cbro implements DialogInterface.OnClickListener {
    public final cbrs a;

    public cbro(cbrs cbrs0) {
        this.a = cbrs0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Intent intent0 = new Intent("android.app.action.SET_NEW_PASSWORD");
        this.a.b.b(intent0);
    }
}

