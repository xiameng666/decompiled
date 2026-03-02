import android.view.View.OnClickListener;
import android.view.View;

public final class doia implements View.OnClickListener {
    public final doic a;

    public doia(doic doic0) {
        this.a = doic0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        xob xob0 = (xob)this.a.f.getContext();
        if(xob0 != null) {
            xob0.startActivity(dlnf.bw(xob0));
        }
    }
}

