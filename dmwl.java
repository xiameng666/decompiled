import android.view.View;

final class dmwl implements evpz {
    final dmwr a;

    public dmwl(dmwr dmwr0) {
        this.a = dmwr0;
        super();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        dmwr dmwr0 = this.a;
        View view0 = dmwr0.ap;
        if(view0 == null) {
            ibuq.j("spinner");
            view0 = null;
        }
        view0.setVisibility(8);
        dmwr0.I();
        if(evql0.n()) {
            dmwr0.G();
        }
    }
}

