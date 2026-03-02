import android.view.View.OnFocusChangeListener;
import android.view.View;
import com.google.android.gms.significantplaces.settings.PlacePickerToolbarChimeraActivity;

public final class epki implements View.OnFocusChangeListener {
    public final PlacePickerToolbarChimeraActivity a;

    public epki(PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity0) {
        this.a = placePickerToolbarChimeraActivity0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        if(z) {
            epjk epjk0 = this.a.m;
            if(epjk0 == null) {
                ibuq.j("placePickerFragment");
                epjk0 = null;
            }
            epjk0.A();
        }
    }
}

