import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class aceu extends RecyclerView {
    protected acel ac;
    public uc ad;
    public final Thread ae;
    public boolean af;
    public aces ag;
    public int ah;
    private acew ai;
    private int aj;

    public aceu(Context context0) {
        super(context0);
        this.O = new acet(this);
        this.aj = 0;
        this.ae = Thread.currentThread();
    }

    public final void a(int v) {
        if(v != this.aj && this.ad != null) {
            this.aj = v;
        }
    }

    public final void aK() {
        aces aces0 = this.ag;
        if(aces0 == null) {
            aces aces1 = new aces(this.ac, this);
            this.ag = aces1;
            aces1.d(this.ah);
            this.ag.m();
        }
        else {
            aces0.m();
        }
        aces aces2 = this.ag;
        if(aces2 != null) {
            aces2.h();
        }
    }

    @Override  // android.support.v7.widget.RecyclerView
    public final void an(tk tk0) {
        super.an(tk0);
        if(this.getParent() != null && this.ai == null) {
            acew acew0 = new acew(this);
            this.ai = acew0;
            tk0.A(acew0);
        }
    }

    @Override  // android.view.View
    public final int getVerticalScrollbarWidth() {
        return this.ag == null || !this.ag.j() ? super.getVerticalScrollbarWidth() : Math.max(super.getVerticalScrollbarWidth(), this.ag.a);
    }

    @Override  // android.support.v7.widget.RecyclerView
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.m != null && this.ai == null) {
            this.ai = new acew(this);
            this.m.A(this.ai);
        }
    }

    @Override  // android.support.v7.widget.RecyclerView
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tk tk0 = this.m;
        if(tk0 != null) {
            acew acew0 = this.ai;
            if(acew0 != null) {
                tk0.D(acew0);
                this.ai = null;
            }
        }
    }

    @Override  // android.support.v7.widget.RecyclerView
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        aces aces0 = this.ag;
        if(aces0 != null && this.m != null) {
            int v4 = this.getChildCount();
            int v5 = this.m.b();
            if(aces0.g != v5 || aces0.h != v4) {
                aces0.g = v5;
                aces0.h = v4;
                if(v5 - v4 > 0 && aces0.d != 2) {
                    View view0 = aces0.i.getChildAt(0);
                    aces0.g(aces0.a(aces0.i.c(view0), v4, v5));
                }
                aces0.i(v4, v5);
            }
        }
    }

    @Override  // android.view.View
    public final void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        aces aces0 = this.ag;
        if(aces0 != null) {
            aces0.e(this.getVerticalScrollbarPosition());
        }
    }

    @Override  // android.support.v7.widget.RecyclerView
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        aces aces0 = this.ag;
        if(aces0 != null) {
            aces0.h();
        }
    }

    @Override  // android.view.View
    public final void setScrollBarStyle(int v) {
        super.setScrollBarStyle(v);
        aces aces0 = this.ag;
        if(aces0 != null && aces0.f != v) {
            aces0.f = v;
            aces0.h();
        }
    }

    @Override  // android.view.View
    public final void setVerticalScrollbarPosition(int v) {
        super.setVerticalScrollbarPosition(v);
        aces aces0 = this.ag;
        if(aces0 != null) {
            aces0.e(v);
        }
    }
}

