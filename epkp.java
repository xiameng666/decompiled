import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.significantplaces.settings.StalePlacesNoticeChimeraActivity;

public final class epkp implements DialogInterface.OnClickListener {
    public final StalePlacesNoticeChimeraActivity a;

    public epkp(StalePlacesNoticeChimeraActivity stalePlacesNoticeChimeraActivity0) {
        this.a = stalePlacesNoticeChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        epil.b(this.a);
    }
}

