import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import j..util.Objects;

public final class eqpm implements DialogInterface.OnClickListener {
    final TargetChimeraActivity a;

    public eqpm(TargetChimeraActivity targetChimeraActivity0) {
        Objects.requireNonNull(targetChimeraActivity0);
        this.a = targetChimeraActivity0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(v == -1) {
            TargetChimeraActivity.h.d("User quit setup", new Object[0]);
            this.a.l();
        }
    }
}

