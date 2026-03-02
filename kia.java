import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class kia {
    public final View a;
    public final ArrayList b;
    public jxn c;
    public jxn d;
    public int e;

    public kia(ViewGroup viewGroup0) {
        this.b = new ArrayList();
        this.c = jxn.a;
        this.d = jxn.a;
        Drawable drawable0 = viewGroup0.getBackground();
        this.e = (drawable0 instanceof ColorDrawable) ? ((ColorDrawable)drawable0).getColor() : 0;
        khy khy0 = new khy(this, viewGroup0.getContext(), viewGroup0);
        this.a = khy0;
        khy0.setVisibility(8);
        khy0.setWillNotDraw(true);
        kex.b(khy0, new khw(this));
        kfz.a(khy0, new khz(this));
        viewGroup0.addView(khy0, 0);
    }

    public static final jxn a(kgq kgq0) {
        return jxn.d(kgq0.f(0x207), kgq0.f(0x40));
    }
}

