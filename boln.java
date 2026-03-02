import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class boln implements DialogInterface.OnClickListener {
    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        dialogInterface0.dismiss();
    }
}

