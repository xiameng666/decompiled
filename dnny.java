import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnny implements View.OnClickListener {
    public final dnoj a;

    public dnny(dnoj dnoj0) {
        this.a = dnoj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Context context0 = this.a.e.requireContext();
        this.a.g.d(hami.f);
        fhvv fhvv0 = fhvv.d();
        this.a.h.a(fhvv0, view0);
        this.a.e.startActivity(dlnf.by(context0, this.a.f, Boolean.valueOf(false), gjil.c));
    }
}

