import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public final class bdmb extends bdol {
    public beug a;
    private final ibnn ag;
    public bfom b;
    public acp c;
    private bfnb d;

    public bdmb() {
        bdlx bdlx0 = new bdlx(new bdlw(this));
        ibnn ibnn0 = ibno.a(ibnp.c, bdlx0);
        ibuk ibuk0 = new ibuk(bdmg.class);
        bdly bdly0 = new bdly(ibnn0);
        bdlz bdlz0 = new bdlz(ibnn0);
        this.ag = new lsd(ibuk0, bdly0, new bdma(this, ibnn0), bdlz0);
    }

    public final void A(Uri uri0) {
        try {
            new ank().a().a(this.requireContext(), uri0);
        }
        catch(ActivityNotFoundException unused_ex) {
            Toast.makeText(this.requireContext(), 0x7F1526DC, 1).show();  // string:pwm_generic_error "Something went wrong."
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.c = this.registerForActivityResult(new adf(), new bdli(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        bfom bfom0 = this.b;
        if(bfom0 == null) {
            ibuq.j("screenLockAuthentication");
            bfom0 = null;
        }
        this.d = bfom0.a("resume", new bdle(this));
        acp acp0 = this.registerForActivityResult(new adu(), new bdlf(this));
        this.y().h.g(this.getViewLifecycleOwner(), new bdlv(new bdlg(acp0)));
        this.y().j.g(this.getViewLifecycleOwner(), new bdlv(new bdlj(this)));
        this.y().k.g(this.getViewLifecycleOwner(), new bdlv(new bdlh(this)));
        return lmh.a(this, new gze(0xFCADC046, true, new bdlu(this)));
    }

    @Override  // du
    public final void onResume() {
        bfnb bfnb0 = this.d;
        if(bfnb0 == null) {
            ibuq.j("resumeScreenLockAuthenticationLauncher");
            bfnb0 = null;
        }
        bfnb0.a();
        super.onResume();
    }

    public final bdmg y() {
        return (bdmg)this.ag.a();
    }

    public final beug z() {
        beug beug0 = this.a;
        if(beug0 != null) {
            return beug0;
        }
        ibuq.j("navigationController");
        return null;
    }
}

