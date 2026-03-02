import android.view.View;

final class tu implements wy {
    final tx a;

    public tu(tx tx0) {
        this.a = tx0;
        super();
    }

    @Override  // wy
    public final int a(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bB(view0) + ty0.rightMargin;
    }

    @Override  // wy
    public final int b(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bA(view0) - ty0.leftMargin;
    }

    @Override  // wy
    public final int c() {
        return this.a.G - this.a.getPaddingRight();
    }

    @Override  // wy
    public final int d() {
        return this.a.getPaddingLeft();
    }

    @Override  // wy
    public final View e(int v) {
        return this.a.az(v);
    }
}

