import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnhs implements View.OnClickListener {
    public final dnhu a;
    public final hkir b;

    public dnhs(dnhu dnhu0, hkir hkir0) {
        this.a = dnhu0;
        this.b = hkir0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.e.d(hami.z);
        etbu etbu0 = new etbu();
        etbu0.a(this.b.c);
        etbu0.c(4);
        etbu0.g(2);
        etbu0.j(this.a.f.a());
        Activity activity0 = ((xob)this.a.a.requireContext()).getContainerActivity();
        this.a.h.cW(activity0, 301, etbu0);
    }
}

