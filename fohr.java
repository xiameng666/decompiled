import android.view.View.OnClickListener;
import android.view.View;

public final class fohr implements View.OnClickListener {
    public final foil a;

    public fohr(foil foil0) {
        this.a = foil0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        foil foil0 = this.a;
        foig foig0 = foil0.an;
        if(foig0 != null) {
            fhvt fhvt0 = new fhvt(gltz.e);
            foig0.d.f(fhvt0, view0);
        }
        foil0.dismiss();
    }
}

