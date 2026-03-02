import android.view.View;

final class tv implements wy {
    final tx a;

    public tv(tx tx0) {
        this.a = tx0;
        super();
    }

    @Override  // wy
    public final int a(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bz(view0) + ty0.bottomMargin;
    }

    @Override  // wy
    public final int b(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        return tx.bC(view0) - ty0.topMargin;
    }

    @Override  // wy
    public final int c() {
        return this.a.H - this.a.getPaddingBottom();
    }

    @Override  // wy
    public final int d() {
        return this.a.getPaddingTop();
    }

    @Override  // wy
    public final View e(int v) {
        return this.a.az(v);
    }
}

