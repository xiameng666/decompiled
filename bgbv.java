import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bgbv extends bgey {
    public beug a;
    public bfnb ag;
    private final ibnn ah;
    public beda b;
    public bfom c;
    public bfnb d;

    public bgbv() {
        bgbr bgbr0 = new bgbr(new bgbq(this));
        ibnn ibnn0 = ibno.a(ibnp.c, bgbr0);
        ibuk ibuk0 = new ibuk(bgeu.class);
        bgbs bgbs0 = new bgbs(ibnn0);
        bgbt bgbt0 = new bgbt(ibnn0);
        this.ah = new lsd(ibuk0, bgbs0, new bgbu(this, ibnn0), bgbt0);
    }

    public final bgeu A() {
        return (bgeu)this.ah.a();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        beda beda0 = this.b;
        if(beda0 == null) {
            ibuq.j("visualElementViewBinder");
            beda0 = null;
        }
        beda0.b(0x31200);
        this.d = this.z().a("details", new bgbe(this));
        this.ag = this.z().a("movePasswords", new bgbf(this));
        this.A().h.g(this.getViewLifecycleOwner(), new bgbp(new bgbg(this)));
        return lmh.a(this, new gze(0x4090B235, true, new bgbo(this)));
    }

    public final beug y() {
        beug beug0 = this.a;
        if(beug0 != null) {
            return beug0;
        }
        ibuq.j("navigationController");
        return null;
    }

    public final bfom z() {
        bfom bfom0 = this.c;
        if(bfom0 != null) {
            return bfom0;
        }
        ibuq.j("screenLockAuthentication");
        return null;
    }
}

