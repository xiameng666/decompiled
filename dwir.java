import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public final class dwir implements View.OnClickListener {
    public final dwix a;

    public dwir(dwix dwix0) {
        this.a = dwix0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.G();
        fhvw fhvw0 = this.a.D();
        fhvv fhvv0 = fhvv.d();
        Button button0 = this.a.aj;
        if(button0 == null) {
            ibuq.j("cancelButton");
            button0 = null;
        }
        fhvw0.a(fhvv0, button0);
    }
}

