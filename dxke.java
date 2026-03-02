import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;

public final class dxke implements View.OnClickListener {
    public final dxkh a;
    public final String b;
    public final dxkg c;

    public dxke(dxkh dxkh0, String s, dxkg dxkg0) {
        this.a = dxkh0;
        this.b = s;
        this.c = dxkg0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = ((xob)this.a.e.requireContext()).getContainerActivity();
        this.a.f.e(this.b, activity0).A(new dxkf(this.c));
    }
}

