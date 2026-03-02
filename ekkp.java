import android.view.View.OnClickListener;
import android.view.View;

public final class ekkp implements View.OnClickListener {
    public final ekku a;
    public final uq b;

    public ekkp(ekku ekku0, uq uq0) {
        this.a = ekku0;
        this.b = uq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ekku ekku0 = this.a;
        if(ekku0.a.e) {
            return;
        }
        ekku0.H(this.b, false);
    }
}

