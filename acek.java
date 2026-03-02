import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;

public final class acek extends ScrollView {
    public tk a;
    public final ArrayList b;
    public final LinearLayout c;
    public final acej d;
    private final int e;
    private boolean f;
    private boolean g;
    private int h;

    public acek(Context context0) {
        super(context0);
        this.b = new ArrayList();
        this.setVerticalScrollBarEnabled(false);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(new int[]{0x1010031});
        this.setBackgroundColor(typedArray0.getColor(0, -1));
        typedArray0.recycle();
        this.setVisibility(8);
        LinearLayout linearLayout0 = new LinearLayout(context0);
        this.c = linearLayout0;
        linearLayout0.setOrientation(1);
        this.addView(linearLayout0, new FrameLayout.LayoutParams(-1, -2));
        this.d = new acej(this);
        this.e = context0.getResources().getDimensionPixelSize(0x7F07014C);  // dimen:appinvite_overscroll_resistance
    }

    public final void a() {
        LinearLayout linearLayout0 = this.c;
        linearLayout0.removeAllViews();
        ArrayList arrayList0 = this.b;
        arrayList0.clear();
        for(int v = 0; v < this.a.b(); ++v) {
            uq uq0 = this.a.o(this, this.a.dx(v));
            this.a.p(uq0, v);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = uq0.a.getLayoutParams();
            linearLayout0.addView(uq0.a, viewGroup$LayoutParams0);
            arrayList0.add(uq0);
        }
    }

    @Override  // android.view.View
    public final boolean canScrollVertically(int v) {
        return true;
    }

    @Override  // android.widget.ScrollView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.f = false;
            this.g = this.getHeight() + this.getScrollY() >= this.c.getHeight();
            this.h = 0;
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.widget.ScrollView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.f && this.getVisibility() != 8 || !(this.getParent() instanceof acel)) {
            boolean z = super.onTouchEvent(motionEvent0);
            if(this.f && (this.getParent() instanceof acel)) {
                MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
                motionEvent1.setAction(0);
                return ((acel)this.getParent()).c(motionEvent1);
            }
            return z;
        }
        return ((acel)this.getParent()).c(motionEvent0);
    }

    @Override  // android.view.View
    protected final boolean overScrollBy(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, boolean z) {
        if(z && (this.getParent() instanceof acel)) {
            if(v1 < 0) {
                this.g = false;
                this.h = 0;
                if(v1 + v3 < v7) {
                    this.f = true;
                    return super.overScrollBy(v, v1, v2, v3, v4, v5, v6, v7, z);
                }
            }
            else {
                int v8 = v1 + v3 - (v5 + v7);
                if(v8 > 0) {
                    int v9 = this.h + v8;
                    this.h = v9;
                    if(this.g || v9 > this.e) {
                        ((acel)this.getParent()).g.I(false);
                        this.f = true;
                    }
                }
            }
        }
        return super.overScrollBy(v, v1, v2, v3, v4, v5, v6, v7, z);
    }
}

