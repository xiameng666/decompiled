import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class acdm implements View.OnClickListener {
    final acdn a;

    public acdm(acdn acdn0) {
        Objects.requireNonNull(acdn0);
        this.a = acdn0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        accn accn0 = (accn)this.a.f;
        accn0.I(true);
        acel acel0 = accn0.at;
        int v = accn0.au.W();
        acel0.a.al(v);
    }
}

