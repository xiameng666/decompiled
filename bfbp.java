import android.view.View;

public final class bfbp extends uq implements bfbs {
    public static final int t;
    private final bfbg u;

    public bfbp(View view0, bfbg bfbg0) {
        ibuq.f(view0, "itemView");
        super(view0);
        this.u = bfbg0;
    }

    @Override  // bfbs
    public final void D(gqlt gqlt0, bfbt bfbt0) {
        ibuq.f(gqlt0, "affiliatedGroup");
        this.u.a(gqlt0);
        bfbo bfbo0 = new bfbo(bfbt0, gqlt0);
        this.a.setOnClickListener(bfbo0);
    }
}

