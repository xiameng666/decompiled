import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;

public final class smu extends tk {
    public View a;
    private final tk e;
    private final tm f;

    public smu(tk tk0) {
        smt smt0 = new smt(this);
        this.f = smt0;
        this.e = tk0;
        tk0.A(smt0);
        this.B(tk0.c);
    }

    @Override  // tk
    public final int b() {
        int v = this.e.b();
        return this.a == null ? v : v + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        if(this.a != null) {
            --v;
        }
        return v >= 0 ? this.e.dx(v) : 0x7FFFFFFF;
    }

    @Override  // tk
    public final long dy(int v) {
        if(this.a != null) {
            --v;
        }
        return v >= 0 ? this.e.dy(v) : 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        if(v == 0x7FFFFFFF) {
            FrameLayout frameLayout0 = new FrameLayout(viewGroup0.getContext());
            frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return new smv(frameLayout0);
        }
        return this.e.dz(viewGroup0, v);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        View view0 = this.a;
        if(view0 != null) {
            --v;
        }
        if((uq0 instanceof smv)) {
            if(view0 == null) {
                throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
            }
            if(view0.getParent() != null) {
                ((ViewGroup)this.a.getParent()).removeView(this.a);
            }
            ((FrameLayout)uq0.a).addView(this.a);
            return;
        }
        this.e.h(uq0, v);
    }
}

