import android.widget.EditText;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.significantplaces.settings.PlacePickerToolbarChimeraActivity;

public final class epkh implements ibts {
    public final PlacePickerToolbarChimeraActivity a;

    public epkh(PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity0) {
        this.a = placePickerToolbarChimeraActivity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity0 = this.a;
        epjk epjk0 = placePickerToolbarChimeraActivity0.m;
        cpnp cpnp0 = null;
        if(epjk0 == null) {
            ibuq.j("placePickerFragment");
            epjk0 = null;
        }
        epjk0.z();
        EditText editText0 = placePickerToolbarChimeraActivity0.n;
        if(editText0 == null) {
            ibuq.j("editText");
            editText0 = null;
        }
        editText0.clearFocus();
        EditText editText1 = placePickerToolbarChimeraActivity0.n;
        if(editText1 == null) {
            ibuq.j("editText");
            editText1 = null;
        }
        editText1.setText(((epng)object0).f);
        epjk epjk1 = placePickerToolbarChimeraActivity0.m;
        if(epjk1 == null) {
            ibuq.j("placePickerFragment");
            epjk1 = null;
        }
        epjk1.y();
        cpnp cpnp1 = placePickerToolbarChimeraActivity0.j;
        if(cpnp1 == null) {
            ibuq.j("map");
        }
        else {
            cpnp0 = cpnp1;
        }
        hjij hjij0 = ((epng)object0).d;
        if(hjij0 == null) {
            hjij0 = hjij.a;
        }
        double f = hjij0.b;
        hjij hjij1 = ((epng)object0).d;
        if(hjij1 == null) {
            hjij1 = hjij.a;
        }
        cpnp0.i(cpnj.b(new LatLng(f, hjij1.c), 17.0f));
        return ibom.a;
    }
}

