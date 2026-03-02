import android.view.View.OnClickListener;
import android.view.View;

public final class dnin implements View.OnClickListener {
    public final dnjs a;
    public final hkir b;
    public final dxev c;

    public dnin(dnjs dnjs0, hkir hkir0, dxev dxev0) {
        this.a = dnjs0;
        this.b = hkir0;
        this.c = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.b.c;
        ibuq.e(s, "getClientTokenId(...)");
        String s1 = (this.c.c == null ? hkhr.b : this.c.c).h;
        ibuq.e(s1, "getTitle(...)");
        this.a.H(s, s1);
    }
}

