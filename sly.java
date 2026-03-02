import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class sly implements View.OnClickListener {
    final slx a;
    final sma b;

    public sly(sma sma0, slx slx0) {
        this.a = slx0;
        Objects.requireNonNull(sma0);
        this.b = sma0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        slt slt0 = this.a.u;
        bhlj bhlj0 = this.b.e;
        if(bhlj0 != null && slt0 != null && slt0.l()) {
            bhlj0.a.E(slt0);
        }
    }
}

