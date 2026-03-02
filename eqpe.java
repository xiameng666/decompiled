import android.content.Context;
import android.os.Bundle;

public abstract class eqpe implements eqos {
    private final boolean a;
    private final Context b;
    public final fm d;

    protected eqpe(Context context0, fm fm0) {
        this.b = context0;
        this.d = fm0;
        this.a = hoxb.d() && gaec.B(context0);
    }

    public abstract int a();

    public void e() {
        this.d.U();
    }

    public abstract void f(Bundle arg1);

    public boolean g() {
        return this.d.b() > 0;
    }

    public abstract boolean h(int arg1);

    public abstract void i();

    protected final void j(du du0) {
        ca ca0 = new ca(this.d);
        if(!erpa.b(this.b)) {
            if(this.a) {
                ca0.B(0x7F0100D4, 0x7F0100D5, 0x7F0100D2, 0x7F0100D3);  // anim:sud_slide_next_in
            }
            else {
                ca0.B(0x7F0100C2, 0x7F0100C3, 0x7F0100B8, 0x7F0100B9);  // anim:slide_next_in
            }
        }
        ca0.G(0x7F0B14C5, du0);  // id:fragment_container
        ca0.w("instruction");
        ca0.a();
    }
}

