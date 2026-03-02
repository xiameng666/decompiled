import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.view.View;

public final class dvtu implements View.OnClickListener {
    public final dvub a;
    public final DialogInterface b;

    public dvtu(dvub dvub0, DialogInterface dialogInterface0) {
        this.a = dvub0;
        this.b = dialogInterface0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ah.onDismiss(this.b);
    }
}

