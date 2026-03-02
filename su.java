import android.graphics.Rect;
import android.view.View;

public final class su extends sw {
    public su(tx tx0) {
        super(tx0);
    }

    @Override  // sw
    public final int a(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bB(view0) + ty0.rightMargin;
    }

    @Override  // sw
    public final int b(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bj(view0) + ty0.leftMargin + ty0.rightMargin;
    }

    @Override  // sw
    public final int c(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bi(view0) + ty0.topMargin + ty0.bottomMargin;
    }

    @Override  // sw
    public final int d(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bA(view0) - ty0.leftMargin;
    }

    @Override  // sw
    public final int e() {
        return this.a.G;
    }

    @Override  // sw
    public final int f() {
        return this.a.G - this.a.getPaddingRight();
    }

    @Override  // sw
    public final int g() {
        return this.a.getPaddingRight();
    }

    @Override  // sw
    public final int h() {
        return this.a.E;
    }

    @Override  // sw
    public final int i() {
        return this.a.F;
    }

    @Override  // sw
    public final int j() {
        return this.a.getPaddingLeft();
    }

    @Override  // sw
    public final int k() {
        tx tx0 = this.a;
        return tx0.G - tx0.getPaddingLeft() - tx0.getPaddingRight();
    }

    @Override  // sw
    public final int l(View view0) {
        Rect rect0 = this.c;
        this.a.bo(view0, rect0);
        return rect0.right;
    }

    @Override  // sw
    public final int m(View view0) {
        Rect rect0 = this.c;
        this.a.bo(view0, rect0);
        return rect0.left;
    }

    @Override  // sw
    public final void n(int v) {
        this.a.aJ(v);
    }
}

