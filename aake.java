import android.view.View.OnClickListener;
import android.view.View;

public final class aake implements View.OnClickListener {
    public final aakt a;

    public aake(aakt aakt0) {
        this.a = aakt0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aarm aarm0 = this.a.z();
        gsak gsak0 = (gsak)aarm0.d.ij();
        if(gsak0 != null && (gsak0.b & 0x80) != 0 && ((gsak0.g == null ? grwp.a : gsak0.g).b & 1) != 0) {
            grwp grwp0 = gsak0.g == null ? grwp.a : gsak0.g;
            grxw grxw0 = grwp0.c == null ? grxw.a : grwp0.c;
            ibuq.e(grxw0, "getTarget(...)");
            aarm0.b(grxw0);
        }
    }
}

