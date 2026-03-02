import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.significantplaces.settings.PlacePickerToolbarChimeraActivity;

public final class epkc implements ibts {
    public final PlacePickerToolbarChimeraActivity a;

    public epkc(PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity0) {
        this.a = placePickerToolbarChimeraActivity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((Location)object0) != null) {
            cpnp cpnp0 = this.a.j;
            if(cpnp0 == null) {
                ibuq.j("map");
                cpnp0 = null;
            }
            cpnp0.i(cpnj.b(new LatLng(((Location)object0).getLatitude(), ((Location)object0).getLongitude()), 17.0f));
        }
        return ibom.a;
    }
}

