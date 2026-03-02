import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import j..util.Objects;

public final class eqpn implements DialogInterface.OnClickListener {
    final TargetChimeraActivity a;

    public eqpn(TargetChimeraActivity targetChimeraActivity0) {
        Objects.requireNonNull(targetChimeraActivity0);
        this.a = targetChimeraActivity0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        TargetChimeraActivity targetChimeraActivity0 = this.a;
        targetChimeraActivity0.r = false;
        if(v == -1) {
            TargetChimeraActivity.h.d("Try again requested", new Object[0]);
            targetChimeraActivity0.l();
            return;
        }
        targetChimeraActivity0.s();
    }
}

