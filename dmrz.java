import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmrz implements View.OnClickListener {
    public final dmsn a;
    public final hkgs b;
    public final xob c;
    public final String d;

    public dmrz(dmsn dmsn0, hkgs hkgs0, xob xob0, String s) {
        this.a = dmsn0;
        this.b = hkgs0;
        this.c = xob0;
        this.d = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.g.d(hami.Y);
        Intent intent0 = frxe.a(view0.getContext(), (this.b.h == null ? hjqa.a : this.b.h).e, (this.b.g == null ? hjwp.a : this.b.g).c, null, (this.b.g == null ? hjwp.a : this.b.g).d);
        evql evql0 = this.a.a(this.c, this.d);
        dmsi dmsi0 = new dmsi(view0, intent0);
        evql0.x(this.c, dmsi0);
    }
}

