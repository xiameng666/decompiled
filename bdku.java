import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

public final class bdku extends bdok {
    public bfnm a;
    private final ibnn ag;
    public static final int b;
    private static final bboh c;
    private bfnb d;

    static {
        bdku.c = bboh.b("ExportCrdConfFragment", bbcu.cX);
    }

    public bdku() {
        bdki bdki0 = new bdki(this);
        bdkq bdkq0 = new bdkq(new bdkp(this));
        ibnn ibnn0 = ibno.a(ibnp.c, bdkq0);
        ibuk ibuk0 = new ibuk(bdla.class);
        bdkr bdkr0 = new bdkr(ibnn0);
        bdks bdks0 = new bdks(bdki0);
        this.ag = new lsd(ibuk0, bdkr0, new bdkt(this, ibnn0), bdks0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        bfnm bfnm0 = this.a;
        if(bfnm0 == null) {
            ibuq.j("biometricAuthentication");
            bfnm0 = null;
        }
        this.d = bfnm0.a(new bdke(this));
        if(!hsag.c()) {
            ((ggtj)bdku.c.j()).x("This feature is disabled");
            xob xob0 = (xob)this.requireContext();
            xob0.finish();
            return new FrameLayout(xob0);
        }
        this.y().e.g(this.getViewLifecycleOwner(), new bdko(new bdkj(this)));
        acp acp0 = this.registerForActivityResult(new adu(), new bdkf(this));
        this.y().f.g(this.getViewLifecycleOwner(), new bdko(new bdkg(acp0)));
        this.y().g.g(this.getViewLifecycleOwner(), new bdko(new bdkh(this)));
        return lmh.a(this, new gze(-302404782, true, new bdkn(this)));
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

    public final bdla y() {
        return (bdla)this.ag.a();
    }

    public final void z() {
        Toast.makeText(this.requireContext(), 0x7F1508E3, 1).show();  // string:common_something_went_wrong "Something went wrong"
        xni xni0 = (xni)this.requireContext();
        xni0.setResult(0);
        xni0.finish();
    }
}

