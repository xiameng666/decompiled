import android.os.Bundle;
import com.google.android.gms.significantplaces.settings.TrustedPlacesListChimeraActivity;

public final class eplw extends ali {
    final TrustedPlacesListChimeraActivity a;
    final Bundle b;

    public eplw(TrustedPlacesListChimeraActivity trustedPlacesListChimeraActivity0, Bundle bundle0) {
        this.a = trustedPlacesListChimeraActivity0;
        this.b = bundle0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        ibuq.f(charSequence0, "errString");
        epil.b(this.a);
    }

    @Override  // ali
    public final void c(alj alj0) {
        if(this.b == null) {
            ca ca0 = new ca(this.a.getSupportFragmentManager());
            ca0.G(0x7F0B0FE4, new epmi());  // id:content_frame
            ca0.a();
        }
    }
}

