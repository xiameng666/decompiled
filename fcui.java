import android.view.View;

public final class fcui implements evpz {
    public final View a;
    public final View b;

    public fcui(View view0, View view1) {
        this.a = view0;
        this.b = view1;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        int v = 0;
        boolean z = evql0.n() && !((Boolean)evql0.j()).booleanValue();
        View view0 = this.b;
        this.a.setEnabled(z);
        if(z) {
            v = 8;
        }
        view0.setVisibility(v);
    }
}

