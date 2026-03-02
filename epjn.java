import androidx.activity.result.ActivityResult;
import com.google.android.gms.significantplaces.settings.PlacePickerChimeraActivity;

public final class epjn implements acn {
    public final PlacePickerChimeraActivity a;

    public epjn(PlacePickerChimeraActivity placePickerChimeraActivity0) {
        this.a = placePickerChimeraActivity0;
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

