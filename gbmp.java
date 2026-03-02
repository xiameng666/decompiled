import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;

public final class gbmp extends LinearLayout {
    public View a;
    public ViewGroup b;
    Drawable c;
    int d;
    public int e;

    public gbmp(Context context0) {
        super(context0);
        this.d = 0;
        this.e = 0;
        this.setOrientation(1);
    }

    final void a() {
        int v = this.getPaddingStart();
        int v1 = this.getPaddingTop();
        int v2 = this.getPaddingEnd();
        int v3 = this.getPaddingBottom();
        super.setBackground((this.c == null ? null : new InsetDrawable(this.c, 0, this.d, 0, 0)));
        this.setPaddingRelative(v, v1, v2, v3);
        gaxl.a();
        ViewGroup viewGroup0 = this.b;
        if(viewGroup0 != null) {
            viewGroup0.setPaddingRelative(viewGroup0.getPaddingStart(), this.b.getPaddingTop() - this.d, this.b.getPaddingEnd(), this.b.getPaddingBottom());
        }
    }

    public final void b() {
        View view0 = this.a;
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams0) : new LinearLayout.LayoutParams(-2, -2);
            linearLayout$LayoutParams0.setMarginStart(this.e);
            View view1 = this.a;
            gftb.check(view1);
            view1.setLayoutParams(linearLayout$LayoutParams0);
        }
    }

    @Override  // android.widget.LinearLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.a != null && this.d != this.a.getHeight() / 2) {
            this.d = this.a.getHeight() / 2;
            this.a();
        }
    }

    @Override  // android.view.View
    public final void setBackground(Drawable drawable0) {
        this.c = drawable0;
        this.a();
    }
}

