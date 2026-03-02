import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.setupwizardlib.items.AbstractItem;

@Deprecated
public final class sma extends tk implements slu {
    public final slv a;
    public bhlj e;

    public sma(slv slv0) {
        this.a = slv0;
        slv0.f(this);
    }

    @Override  // tk
    public final int b() {
        return this.a.a();
    }

    @Override  // slu
    public final void c(slv slv0, int v, int v1) {
        this.w(v, v1);
    }

    @Override  // tk
    public final int dx(int v) {
        return this.f(v).i();
    }

    @Override  // tk
    public final long dy(int v) {
        slt slt0 = this.f(v);
        if((slt0 instanceof AbstractItem)) {
            int v1 = ((AbstractItem)slt0).a;
            return v1 <= 0 ? -1L : ((long)v1);
        }
        return -1L;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        uq uq0 = new slx(view0);
        if(!"noBackground".equals(view0.getTag())) {
            TypedArray typedArray0 = viewGroup0.getContext().obtainStyledAttributes(slr.n);
            Drawable drawable0 = typedArray0.getDrawable(1);
            if(drawable0 == null) {
                drawable0 = typedArray0.getDrawable(2);
            }
            Drawable drawable1 = view0.getBackground();
            if(drawable1 == null) {
                drawable1 = typedArray0.getDrawable(0);
            }
            if(drawable0 != null && drawable1 != null) {
                view0.setBackgroundDrawable(new slz(new Drawable[]{drawable1, drawable0}));
            }
            else {
                Log.e("RecyclerItemAdapter", a.Q(drawable1, drawable0, "Cannot resolve required attributes. selectableItemBackground=", " background="));
            }
            typedArray0.recycle();
        }
        view0.setOnClickListener(new sly(this, ((slx)uq0)));
        return uq0;
    }

    public final slt f(int v) {
        return this.a.b(v);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        slx slx0 = (slx)uq0;
        slt slt0 = this.f(v);
        boolean z = slt0.l();
        slx0.t = z;
        View view0 = slx0.a;
        view0.setClickable(z);
        view0.setEnabled(z);
        view0.setFocusable(z);
        slx0.u = slt0;
        slt0.k(view0);
    }

    @Override  // slu
    public final void i(slv slv0, int v) {
        this.u(v, 1);
    }

    @Override  // slu
    public final void k(slv slv0, int v) {
        this.x(v, 1);
    }
}

