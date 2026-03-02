import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class fmrt extends lh {
    public static final int e;
    public Drawable f;
    private boolean g;

    static {
        fmrt.e = new Random().nextInt();
    }

    public fmrt(lp lp0) {
        kz kz0 = new kz(new fmrr(lp0));
        kz0.a = new gmct(flbh.b().a);
        super(kz0.a());
        this.f = null;
        this.g = true;
    }

    protected abstract uq G(ViewGroup arg1, int arg2);

    protected abstract void H(uq arg1, int arg2);

    public final void I() {
        synchronized(this) {
            this.g = false;
        }
    }

    @Override  // tk
    public final int dx(int v) {
        return this.c(v) == null ? fmrt.e : this.n(v);
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        if(v == fmrt.e) {
            ImageView imageView0 = new ImageView(viewGroup0.getContext());
            Drawable drawable0 = this.f;
            if(drawable0 != null) {
                imageView0.setImageDrawable(drawable0);
            }
            imageView0.setScaleType(ImageView.ScaleType.CENTER);
            imageView0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView0.setImportantForAccessibility(2);
            LinearLayout linearLayout0 = new LinearLayout(viewGroup0.getContext());
            linearLayout0.setOrientation(1);
            linearLayout0.setGravity(1);
            linearLayout0.addView(imageView0);
            int v1 = fmro.a(viewGroup0.getContext(), 10.0f);
            linearLayout0.setPadding(v1, v1, v1, v1);
            linearLayout0.setLayoutParams(new ty(-1, -2));
            return new fmrs(linearLayout0);
        }
        return new fmrs(this.G(viewGroup0, v));
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        uq uq1 = ((fmrs)uq0).t;
        if(uq1 != null && this.c(v) != null) {
            View view0 = uq1.a;
            if((view0 instanceof fmsc)) {
                ((fmsc)view0).b();
            }
            this.H(uq1, v);
        }
    }

    @Override  // lh
    public void jQ(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            synchronized(this) {
                if(this.g) {
                    ArrayList arrayList0 = new ArrayList(list0);
                    arrayList0.add(null);
                    list0 = arrayList0;
                }
            }
            super.jQ(list0);
            return;
        }
        super.jQ(null);
    }

    protected int n(int v) {
        throw null;
    }
}

