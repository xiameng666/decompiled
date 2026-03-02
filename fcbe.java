import android.view.ViewGroup;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;

public final class fcbe extends gcxx {
    private final gdew ay;

    public fcbe() {
        this.ay = new gdew();
    }

    @Override  // gcxx
    protected final gcwg N(geui geui0) {
        return gcwf.S(geui0, this.bU, this.cM());
    }

    @Override  // gcxx
    public final SummaryExpanderWrapper Q(gfep gfep0, ViewGroup viewGroup0) {
        return fbey.b(gfep0, viewGroup0, this, this, false);
    }

    @Override  // gcxx
    protected final boolean R() {
        return true;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ay;
    }
}

