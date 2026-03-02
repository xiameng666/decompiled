import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.fido.fido2.ui.hybrid.LinkedDevicesSettingsChimeraActivity;

public final class bmwv implements DialogInterface.OnClickListener {
    public final LinkedDevicesSettingsChimeraActivity a;

    public bmwv(LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity0) {
        this.a = linkedDevicesSettingsChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        bmwu bmwu0 = new bmwu(this.a);
        this.a.i.execute(bmwu0);
    }
}

