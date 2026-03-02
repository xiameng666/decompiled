import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.button.MaterialButton;

public final class bvvq implements View.OnClickListener {
    public final bvvt a;
    public final MaterialButton b;

    public bvvq(bvvt bvvt0, MaterialButton materialButton0) {
        this.a = bvvt0;
        this.b = materialButton0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bvvt bvvt0 = this.a;
        fhvw fhvw0 = bvvt0.t;
        if(fhvw0 == null) {
            ibuq.j("interactionLogger");
            fhvw0 = null;
        }
        fhvw0.a(fhvv.d(), this.b);
        bvvt0.z = null;
        bvvt0.A = bwdo.a;
        if(bvvt0.r(true)) {
            bvvt0.y();
        }
    }
}

