import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.significantplaces.settings.PlacePickerChimeraActivity;

public final class epjl implements cpnm {
    public final PlacePickerChimeraActivity a;

    public epjl(PlacePickerChimeraActivity placePickerChimeraActivity0) {
        this.a = placePickerChimeraActivity0;
    }

    @Override  // cpnm
    public final void a(int v) {
        PlacePickerChimeraActivity placePickerChimeraActivity0 = this.a;
        if(v == 1) {
            placePickerChimeraActivity0.g(false);
        }
        EditText editText0 = placePickerChimeraActivity0.n;
        epjk epjk0 = null;
        if(editText0 == null) {
            ibuq.j("editText");
            editText0 = null;
        }
        if(editText0.hasFocus()) {
            EditText editText1 = placePickerChimeraActivity0.n;
            if(editText1 == null) {
                ibuq.j("editText");
                editText1 = null;
            }
            editText1.clearFocus();
            Object object0 = placePickerChimeraActivity0.getSystemService("input_method");
            ibuq.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            EditText editText2 = placePickerChimeraActivity0.n;
            if(editText2 == null) {
                ibuq.j("editText");
                editText2 = null;
            }
            ((InputMethodManager)object0).hideSoftInputFromWindow(editText2.getWindowToken(), 0);
            epjk epjk1 = placePickerChimeraActivity0.m;
            if(epjk1 == null) {
                ibuq.j("placePickerFragment");
                epjk1 = null;
            }
            epjk1.y();
            epjk epjk2 = placePickerChimeraActivity0.m;
            if(epjk2 == null) {
                ibuq.j("placePickerFragment");
            }
            else {
                epjk0 = epjk2;
            }
            epjk0.z();
        }
    }
}

