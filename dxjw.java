import android.app.Activity;

public final class dxjw implements ibth {
    public final dxkh a;
    public final String b;
    public final dxkb c;

    public dxjw(dxkh dxkh0, String s, dxkb dxkb0) {
        this.a = dxkh0;
        this.b = s;
        this.c = dxkb0;
    }

    @Override  // ibth
    public final Object a() {
        Activity activity0 = ((xob)this.a.e.requireContext()).getContainerActivity();
        this.a.f.e(this.b, activity0).A(new dxjx(this.c));
        return ibom.a;
    }
}

