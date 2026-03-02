import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class dnla extends lh {
    public dnla() {
        super(new dnkz());
    }

    @Override  // tk
    public final int dx(int v) {
        dnky dnky0 = (dnky)this.c(v);
        return 0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v != 0) {
            throw new IllegalArgumentException("Unsupported card reward type: " + v);
        }
        View view0 = layoutInflater0.inflate(0x7F0E0A0B, viewGroup0, false);  // layout:standard_card_reward
        ibuq.e(view0, "inflate(...)");
        return new dnmt(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
        dnky dnky0 = (dnky)this.c(v);
        ibuq.f(uq0, "viewHolder");
        if(!(uq0 instanceof dnmt)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String s = dnky0.a.b;
        ibuq.e(s, "getDescription(...)");
        String s1 = dnky0.a.c;
        ibuq.e(s1, "getRestrictionsDescription(...)");
        fuat fuat0 = new fuat(new fryu(s), new fryu(s1), null, null, 0, null, null, null, null, false, false, false, null, false, 0x3FFC);
        ((dnmt)uq0).t.h(fuat0);
    }
}

