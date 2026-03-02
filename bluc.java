import com.google.android.gms.fido.authenticator.ui.AuthenticatorChimeraActivity;
import com.google.android.gms.location.LocationSettingsRequest;

public final class bluc implements lqj {
    public final AuthenticatorChimeraActivity a;

    public bluc(AuthenticatorChimeraActivity authenticatorChimeraActivity0) {
        this.a = authenticatorChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            blwd blwd0 = this.a.k();
            cmog cmog0 = new cmog();
            cmog0.c();
            LocationSettingsRequest locationSettingsRequest0 = cmog0.a();
            gmbu.t(fhra.b(new azts(blwd0.requireContext(), null).af(locationSettingsRequest0)), new blwc(blwd0), new gmaq());
        }
    }
}

