import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class fbyz implements DialogInterface.OnClickListener {
    public final fbzb a;

    public fbyz(fbzb fbzb0) {
        this.a = fbzb0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        fbyx fbyx0 = this.a.e;
        if(fbyx0 != null) {
            fbyx0.L();
        }
    }
}

