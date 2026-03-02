import android.view.View.OnClickListener;
import android.view.View;

public final class ekkm implements View.OnClickListener {
    public final ekku a;
    public final uq b;
    public final ejyy c;

    public ekkm(ekku ekku0, uq uq0, ejyy ejyy0) {
        this.a = ekku0;
        this.b = uq0;
        this.c = ejyy0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        byte[] arr_b = this.c.k.toBytesArray();
        this.a.J(this.b, arr_b, 3);
    }
}

