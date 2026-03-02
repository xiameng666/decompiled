import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.significantplaces.settings.DeletePlaceChimeraActivity;

public final class epiv implements DialogInterface.OnClickListener {
    public final DeletePlaceChimeraActivity a;

    public epiv(DeletePlaceChimeraActivity deletePlaceChimeraActivity0) {
        this.a = deletePlaceChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        ibuq.f(dialogInterface0, "dialog");
        epil.b(this.a);
    }
}

