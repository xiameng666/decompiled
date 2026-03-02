import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.MaterialToolbar;

public final class bezc extends bfay {
    public beug a;
    public bfom b;
    public bfnb c;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        bfom bfom0 = this.b;
        if(bfom0 == null) {
            ibuq.j("screenLockAuthentication");
            bfom0 = null;
        }
        this.c = bfom0.a("resumeImport", new beza(this));
        View view0 = layoutInflater0.inflate(0x7F0E0868, viewGroup0, false);  // layout:pwm_import_screen
        View view1 = view0.findViewById(0x7F0B16F9);  // id:import_screen_toolbar
        ibuq.e(view1, "findViewById(...)");
        ((MaterialToolbar)view1).x(new bezb(this));
        if(hsam.f()) {
            ((LinearLayout)view0.findViewById(0x7F0B16F8)).setFitsSystemWindows(true);  // id:import_fragment_container
        }
        ibuq.c(view0);
        return view0;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        bfnb bfnb0 = this.c;
        if(bfnb0 == null) {
            ibuq.j("resumeScreenLockAuthenticationLauncher");
            bfnb0 = null;
        }
        bfnb0.a();
    }

    public final beug y() {
        beug beug0 = this.a;
        if(beug0 != null) {
            return beug0;
        }
        ibuq.j("navigationController");
        return null;
    }
}

