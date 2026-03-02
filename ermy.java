import android.view.View.OnClickListener;
import android.view.View;

public final class ermy implements View.OnClickListener {
    public final ernb a;
    public final erna b;

    public ermy(ernb ernb0, erna erna0) {
        this.a = ernb0;
        this.b = erna0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ernb ernb0 = this.a;
        erna erna0 = this.b;
        if(ernb0.a) {
            erna0.kE();
            return;
        }
        ernb0.z(erna0);
    }
}

