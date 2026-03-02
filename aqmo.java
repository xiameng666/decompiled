import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Bundle;

public final class aqmo implements DialogInterface.OnClickListener {
    public final aqmq a;
    public final String b;

    public aqmo(aqmq aqmq0, String s) {
        this.a = aqmq0;
        this.b = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Bundle bundle0 = jyu.a(new ibns[]{new ibns("backup_dialog_tag", this.b)});
        llh.a(this.a.a, "backup_dialog_positive_button_clicked", bundle0);
    }
}

