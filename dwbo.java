import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public final class dwbo implements View.OnClickListener {
    public final dwby a;

    public dwbo(dwby dwby0) {
        this.a = dwby0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dwby dwby0 = this.a;
        fhvw fhvw0 = dwby0.D();
        fhvv fhvv0 = fhvv.d();
        Button button0 = dwby0.ap;
        if(button0 == null) {
            ibuq.j("secondaryButton");
            button0 = null;
        }
        fhvw0.a(fhvv0, button0);
        dwby0.N();
    }
}

