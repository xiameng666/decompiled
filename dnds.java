import android.view.View.OnClickListener;

public final class dnds implements ibth {
    public final dndv a;
    public final dndu b;

    public dnds(dndv dndv0, dndu dndu0) {
        this.a = dndv0;
        this.b = dndu0;
    }

    @Override  // ibth
    public final Object a() {
        View.OnClickListener view$OnClickListener0 = this.a.g;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this.b.a);
        }
        return ibom.a;
    }
}

