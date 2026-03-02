import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.significantplaces.settings.StalePlacesNoticeChimeraActivity;

public final class epkq implements DialogInterface.OnClickListener {
    public final StalePlacesNoticeChimeraActivity a;

    public epkq(StalePlacesNoticeChimeraActivity stalePlacesNoticeChimeraActivity0) {
        this.a = stalePlacesNoticeChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        epil.a();
        StalePlacesNoticeChimeraActivity stalePlacesNoticeChimeraActivity0 = this.a;
        if(sku.a(stalePlacesNoticeChimeraActivity0)) {
            stalePlacesNoticeChimeraActivity0.startActivity(new Intent().setClassName(stalePlacesNoticeChimeraActivity0, "com.google.android.gms.significantplaces.settings.SuggestionListToolbarActivity"));
        }
        else {
            stalePlacesNoticeChimeraActivity0.startActivity(new Intent().setClassName(stalePlacesNoticeChimeraActivity0, "com.google.android.gms.significantplaces.settings.SuggestionListActivity"));
        }
        epil.b(stalePlacesNoticeChimeraActivity0);
    }
}

