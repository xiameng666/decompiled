import androidx.activity.result.ActivityResult;
import com.google.android.gms.significantplaces.settings.PlacePickerToolbarChimeraActivity;

public final class epke implements acn {
    public final PlacePickerToolbarChimeraActivity a;

    public epke(PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity0) {
        this.a = placePickerToolbarChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        if(((ActivityResult)object0).a == -1) {
            this.a.setResult(-1);
            epil.b(this.a);
        }
    }
}

