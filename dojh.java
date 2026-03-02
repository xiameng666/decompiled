import android.view.View.OnClickListener;
import android.view.View;

public final class dojh implements View.OnClickListener {
    public final doji a;

    public dojh(doji doji0) {
        this.a = doji0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        xob xob0 = (xob)this.a.a.getContext();
        if(xob0 != null) {
            xob0.startActivity(dlnf.bn(xob0));
        }
    }
}

