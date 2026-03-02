import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class doji extends tk {
    public final dokz a;
    public View e;
    private boolean f;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public doji(dokz dokz0) {
        this.a = dokz0;
        this.f = true;
    }

    @Override  // tk
    public final int b() {
        return this.f ? 1 : 0;
    }

    @Override  // tk
    public final int dx(int v) {
        return 14;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0DCF, viewGroup0, false);  // layout:wallet_tip_button
        this.e = view0;
        view0.setOnClickListener(new dojh(this));
        return new uq(this.e);
    }

    public final void f() {
        boolean z = this.f;
        this.f = false;
        if(z) {
            this.y(0);
        }
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
    }

    public final void n() {
        boolean z = this.f;
        this.f = true;
        if(!z) {
            this.s(0);
        }
    }
}

