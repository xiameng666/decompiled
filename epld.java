import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;

public final class epld implements ohj {
    public final eplj a;

    public epld(eplj eplj0) {
        this.a = eplj0;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        epil.a();
        eplj eplj0 = this.a;
        Context context0 = null;
        if(sku.a(eplj0.requireContext())) {
            acp acp0 = eplj0.ag;
            if(acp0 == null) {
                ibuq.j("placePickerLauncher");
                acp0 = null;
            }
            Intent intent0 = new Intent();
            Context context1 = eplj0.d;
            if(context1 == null) {
                ibuq.j("context");
            }
            else {
                context0 = context1;
            }
            Intent intent1 = intent0.setClassName(context0, "com.google.android.gms.significantplaces.settings.PlacePickerToolbarActivity");
            ibuq.e(intent1, "setClassName(...)");
            acp0.b(intent1);
            return true;
        }
        acp acp1 = eplj0.ag;
        if(acp1 == null) {
            ibuq.j("placePickerLauncher");
            acp1 = null;
        }
        Intent intent2 = new Intent();
        Context context2 = eplj0.d;
        if(context2 == null) {
            ibuq.j("context");
        }
        else {
            context0 = context2;
        }
        Intent intent3 = intent2.setClassName(context0, "com.google.android.gms.significantplaces.settings.PlacePickerActivity");
        ibuq.e(intent3, "setClassName(...)");
        acp1.b(intent3);
        return true;
    }
}

