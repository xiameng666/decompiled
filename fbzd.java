import android.view.ViewGroup;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;

public final class fbzd {
    public gfep a;
    public gdew b;
    private final boolean c;
    private ViewGroup d;
    private SummaryExpanderWrapper e;

    public fbzd(fbze fbze0) {
        this.c = fbze0.a;
        this.a = fbze0.b;
        this.d = fbze0.c;
        this.e = fbze0.d;
        this.b = fbze0.e;
    }

    final fbze a() {
        return new fbze(this.c, this.a, this.d, this.e, this.b);
    }

    final void b(ViewGroup viewGroup0) {
        if((viewGroup0 instanceof SummaryExpanderWrapper)) {
            this.e = (SummaryExpanderWrapper)viewGroup0;
            this.d = ((SummaryExpanderWrapper)viewGroup0).e;
            return;
        }
        this.d = viewGroup0;
    }
}

