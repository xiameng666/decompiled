import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnit implements View.OnClickListener {
    public final dnjs a;
    public final dxev b;

    public dnit(dnjs dnjs0, dxev dxev0) {
        this.a = dnjs0;
        this.b = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dmqj dmqj0 = new dmqj();
        dmqj0.d(this.a.l);
        hkhr hkhr0 = this.b.c == null ? hkhr.b : this.b.c;
        dmqj0.i((hkhr0.e == null ? hjqn.a : hkhr0.e).b);
        hkhr hkhr1 = this.b.c == null ? hkhr.b : this.b.c;
        dmqj0.h((hkhr1.e == null ? hjqn.a : hkhr1.e).c);
        Intent intent0 = dmqj0.c();
        this.a.e.startActivity(intent0);
    }
}

