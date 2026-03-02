import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

public final class py extends sn implements qa {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final AppCompatSpinner d;
    private int s;

    public py(AppCompatSpinner appCompatSpinner0, Context context0, AttributeSet attributeSet0, int v) {
        this.d = appCompatSpinner0;
        super(context0, attributeSet0, v);
        this.c = new Rect();
        this.l = appCompatSpinner0;
        this.y();
        this.m = new pv(this);
    }

    @Override  // qa
    public final CharSequence d() {
        return this.a;
    }

    @Override  // sn, qa
    public final void e(ListAdapter listAdapter0) {
        super.e(listAdapter0);
        this.b = listAdapter0;
    }

    @Override  // qa
    public final void h(int v) {
        this.s = v;
    }

    @Override  // qa
    public final void i(CharSequence charSequence0) {
        this.a = charSequence0;
    }

    @Override  // qa
    public final void k(int v, int v1) {
        boolean z = this.x();
        this.n();
        this.w();
        super.v();
        rl rl0 = this.e;
        rl0.setChoiceMode(1);
        rl0.setTextDirection(v);
        rl0.setTextAlignment(v1);
        AppCompatSpinner appCompatSpinner0 = this.d;
        int v2 = appCompatSpinner0.getSelectedItemPosition();
        rl rl1 = this.e;
        if(this.x() && rl1 != null) {
            rl1.a = false;
            rl1.setSelection(v2);
            if(rl1.getChoiceMode() != 0) {
                rl1.setItemChecked(v2, true);
            }
        }
        if(!z) {
            ViewTreeObserver viewTreeObserver0 = appCompatSpinner0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                pw pw0 = new pw(this);
                viewTreeObserver0.addOnGlobalLayoutListener(pw0);
                this.t(new px(this, pw0));
            }
        }
    }

    final void n() {
        int v;
        Drawable drawable0 = this.c();
        if(drawable0 == null) {
            this.d.d.right = 0;
            this.d.d.left = 0;
            v = 0;
        }
        else {
            Rect rect0 = this.d.d;
            drawable0.getPadding(rect0);
            v = xe.a(this.d) ? rect0.right : -rect0.left;
        }
        AppCompatSpinner appCompatSpinner0 = this.d;
        int v1 = appCompatSpinner0.getPaddingLeft();
        int v2 = appCompatSpinner0.getPaddingRight();
        int v3 = appCompatSpinner0.getWidth();
        int v4 = appCompatSpinner0.c;
        if(v4 == -2) {
            int v5 = appCompatSpinner0.oa(((SpinnerAdapter)this.b), this.c());
            int v6 = appCompatSpinner0.getContext().getResources().getDisplayMetrics().widthPixels - appCompatSpinner0.d.left - appCompatSpinner0.d.right;
            if(v5 > v6) {
                v5 = v6;
            }
            this.r(Math.max(v5, v3 - v1 - v2));
        }
        else if(v4 == -1) {
            this.r(v3 - v1 - v2);
        }
        else {
            this.r(v4);
        }
        this.g = xe.a(appCompatSpinner0) ? v + (v3 - v2 - this.f - this.s) : v + (v1 + this.s);
    }
}

