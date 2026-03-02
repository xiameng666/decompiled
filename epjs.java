import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.significantplaces.settings.PlacePickerChimeraActivity;

public final class epjs implements ibts {
    public final PlacePickerChimeraActivity a;

    public epjs(PlacePickerChimeraActivity placePickerChimeraActivity0) {
        this.a = placePickerChimeraActivity0;
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

