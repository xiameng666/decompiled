import com.google.android.setupdesign.GlifLayout;

public class arrx extends du {
    public String a;

    public final void A(String s) {
        this.a = s;
        if(this.isAdded()) {
            this.y();
        }
    }

    public final void B(GlifLayout glifLayout0, int v) {
        glifLayout0.L(v);
        ((xob)this.getContext()).setTitle(v);
        this.z();
    }

    public final void C(GlifLayout glifLayout0, CharSequence charSequence0) {
        glifLayout0.b(charSequence0);
        ((xob)this.getContext()).setTitle(charSequence0);
        this.z();
    }

    protected void y() {
    }

    private final void z() {
        ((xob)this.getContext()).getWindow().getDecorView().sendAccessibilityEvent(0x20);
    }
}

