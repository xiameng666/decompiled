import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;

public final class fmmv extends FrameLayout {
    View a;

    public fmmv(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
    }

    public final void a(fmlp fmlp0) {
        View view0 = new View(this.getContext());
        this.a = view0;
        view0.setBackgroundColor((iaea.j() ? fyho.b(this, 0x7F04030A) : fmlp0.a));  // attr:colorOutlineVariant
        this.a.setLayoutParams(new LinearLayout.LayoutParams(-1, fmro.a(this.getContext(), fmlp0.b)));
        this.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.addView(this.a);
    }
}

