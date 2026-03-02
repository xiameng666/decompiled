import android.view.View.OnClickListener;
import android.view.View;

public final class dogm implements View.OnClickListener {
    public final dogp a;
    public final edkr b;

    public dogm(dogp dogp0, edkr edkr0) {
        this.a = dogp0;
        this.b = edkr0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dogp dogp0 = this.a;
        xob xob0 = (xob)dogp0.a.getContext();
        if(xob0 == null) {
            return;
        }
        fhvv fhvv0 = fhvv.d();
        dogp0.e.a(fhvv0, view0);
        xob0.startActivity(dlnf.bd(xob0, this.b.c, dlnd.a));
    }
}

