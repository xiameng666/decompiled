import android.view.View.OnClickListener;

public final class dnko implements ibth {
    public final View.OnClickListener a;
    public final dnkt b;

    public dnko(View.OnClickListener view$OnClickListener0, dnkt dnkt0) {
        this.a = view$OnClickListener0;
        this.b = dnkt0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

