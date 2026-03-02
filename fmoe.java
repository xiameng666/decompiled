import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

class fmoe extends uq {
    final FrameLayout w;

    public fmoe(View view0) {
        super(new FrameLayout(view0.getContext()));
        FrameLayout frameLayout0 = (FrameLayout)this.a;
        this.w = frameLayout0;
        frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout0.addView(view0);
    }
}

