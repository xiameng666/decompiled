import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class doic extends tk implements lqj {
    public boolean a;
    public boolean e;
    public final dokz f;
    public final doga g;
    public boolean h;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public doic(doga doga0, dokz dokz0) {
        this.g = doga0;
        this.f = dokz0;
    }

    @Override  // tk
    public final int b() {
        return !this.a || !this.e ? 0 : 1;
    }

    @Override  // tk
    public final int dx(int v) {
        return 5;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0354, viewGroup0, false);  // layout:expired_passes_button
        view0.setOnClickListener(new doia(this));
        return new uq(view0);
    }

    public final lo f(boolean z, boolean z1) {
        return lt.a(new doib(this, z, z1));
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
    }

    @Override  // lqj
    public final void jS(Object object0) {
        boolean z = ((dofl)object0).c != null && !((dofl)object0).a.isEmpty() || ((dofl)object0).a.size() > 2 || this.h;
        lo lo0 = this.f(((dofl)object0).b, z);
        this.a = ((dofl)object0).b;
        this.e = z;
        lo0.c(this);
    }
}

