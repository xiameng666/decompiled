import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.significantplaces.settings.ConfirmPlaceChimeraActivity;

public final class epiq implements DialogInterface.OnCancelListener {
    public final ConfirmPlaceChimeraActivity a;

    public epiq(ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity0) {
        this.a = confirmPlaceChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        epil.b(this.a);
    }
}

