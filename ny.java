import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;

public abstract class ny extends ViewGroup {
    protected final nx a;
    public final Context b;
    public ActionMenuView c;
    public oo d;
    public int e;
    protected kfs f;
    private boolean g;
    private boolean h;

    ny(Context context0) {
        this(context0, null);
    }

    public ny(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ny(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new nx(this);
        TypedValue typedValue0 = new TypedValue();
        if(context0.getTheme().resolveAttribute(0x7F040076, typedValue0, true) && typedValue0.resourceId != 0) {  // attr:actionBarPopupTheme
            this.b = new ContextThemeWrapper(context0, typedValue0.resourceId);
            return;
        }
        this.b = context0;
    }

    public static int a(int v, int v1, boolean z) {
        return z ? v - v1 : v + v1;
    }

    public final kfs b(int v, long v1) {
        kfs kfs0 = this.f;
        if(kfs0 != null) {
            kfs0.a();
        }
        if(v == 0) {
            if(this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            kfs kfs1 = kfe.c(this);
            kfs1.c(1.0f);
            kfs1.f(v1);
            this.a.d(kfs1, 0);
            kfs1.h(this.a);
            return kfs1;
        }
        kfs kfs2 = kfe.c(this);
        kfs2.c(0.0f);
        kfs2.f(v1);
        this.a.d(kfs2, v);
        kfs2.h(this.a);
        return kfs2;
    }

    public void d(int v) {
        throw null;
    }

    static void e(ny ny0) {
        ny0.super.setVisibility(0);
    }

    public static final int f(View view0, int v, int v1) {
        view0.measure(View.MeasureSpec.makeMeasureSpec(v, 0x80000000), v1);
        return Math.max(0, v - view0.getMeasuredWidth());
    }

    public static final int g(View view0, int v, int v1, int v2, boolean z) {
        int v3 = view0.getMeasuredWidth();
        int v4 = view0.getMeasuredHeight();
        int v5 = v1 + (v2 - v4) / 2;
        int v6 = v4 + v5;
        if(z) {
            view0.layout(v - v3, v5, v, v6);
            return -v3;
        }
        view0.layout(v, v5, v + v3, v6);
        return v3;
    }

    @Override  // android.view.View
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, ku.a, 0x7F04007D, 0);  // attr:actionBarStyle
        this.d(typedArray0.getLayoutDimension(18, 0));
        typedArray0.recycle();
        oo oo0 = this.d;
        if(oo0 != null) {
            oo0.k = lx.a(oo0.b);
            na na0 = oo0.c;
            if(na0 != null) {
                na0.n(true);
            }
        }
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = 9;
        if(v == 9) {
            this.h = false;
            v = 9;
        }
        if(this.h) {
            v1 = v;
        }
        else {
            boolean z = super.onHoverEvent(motionEvent0);
            if(v != 9) {
                v1 = v;
            }
            else if(!z) {
                this.h = true;
            }
        }
        if(v1 == 3 || v1 == 10) {
            this.h = false;
        }
        return true;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.g = false;
            v = 0;
        }
        if(!this.g) {
            boolean z = super.onTouchEvent(motionEvent0);
            if(v == 0) {
                if(!z) {
                    this.g = true;
                }
                v = 0;
            }
        }
        if(v == 1 || v == 3) {
            this.g = false;
        }
        return true;
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        if(v != this.getVisibility()) {
            kfs kfs0 = this.f;
            if(kfs0 != null) {
                kfs0.a();
            }
            super.setVisibility(v);
        }
    }
}

