import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnpi implements View.OnClickListener {
    public final dnpk a;
    public final dxev b;

    public dnpi(dnpk dnpk0, dxev dxev0) {
        this.a = dnpk0;
        this.b = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.x.d(hami.F);
        hkhr hkhr0 = this.b.c == null ? hkhr.b : this.b.c;
        hjqn hjqn0 = hkhr0.e == null ? hjqn.a : hkhr0.e;
        ibuq.e(hjqn0, "getGooglePaymentMethodId(...)");
        dmqk dmqk0 = new dmqk();
        dmqk0.d(this.a.y);
        dmqk0.i(hjqn0.b);
        dmqk0.h(hjqn0.c);
        Intent intent0 = dmqk0.c();
        ibuq.e(intent0, "build(...)");
        this.a.z.startActivityForResult(intent0, 1200);
    }
}

