import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.significantplaces.settings.ConfirmPlaceChimeraActivity;

public final class epin implements DialogInterface.OnClickListener {
    public final ConfirmPlaceChimeraActivity a;

    public epin(ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity0) {
        this.a = confirmPlaceChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        ibuq.f(dialogInterface0, "<unused var>");
        epil.b(this.a);
    }
}

