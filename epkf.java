import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.significantplaces.settings.PlacePickerToolbarChimeraActivity;

public final class epkf implements View.OnClickListener {
    public final PlacePickerToolbarChimeraActivity a;

    public epkf(PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity0) {
        this.a = placePickerToolbarChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity0 = this.a;
        cpnp cpnp0 = placePickerToolbarChimeraActivity0.j;
        if(cpnp0 == null) {
            ibuq.j("map");
            cpnp0 = null;
        }
        double f = cpnp0.d().a.a;
        cpnp cpnp1 = placePickerToolbarChimeraActivity0.j;
        if(cpnp1 == null) {
            ibuq.j("map");
            cpnp1 = null;
        }
        double f1 = cpnp1.d().a.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjij.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hjij)hftv0).b = f;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjij)hftp0.b_message).c = f1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        icbb.b(lpt.a(placePickerToolbarChimeraActivity0), null, null, new epkj(placePickerToolbarChimeraActivity0, ((hjij)hftv1), null), 3);
    }
}

