import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public final class dwiq implements View.OnClickListener {
    public final dwix a;

    public dwiq(dwix dwix0) {
        this.a = dwix0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.H();
        fhvw fhvw0 = this.a.D();
        fhvt fhvt0 = new fhvt(gltz.e);
        fhvt0.b(this.a.B());
        fhvv fhvv0 = fhvt0.a();
        Button button0 = this.a.ak;
        if(button0 == null) {
            ibuq.j("saveButton");
            button0 = null;
        }
        fhvw0.a(fhvv0, button0);
    }
}

