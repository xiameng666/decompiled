import android.view.View.OnClickListener;
import android.view.View;

public final class bfzq implements View.OnClickListener {
    public final bgad a;

    public bfzq(bgad bgad0) {
        this.a = bgad0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        beug beug0 = this.a.a;
        if(beug0 == null) {
            ibuq.j("navigationController");
            beug0 = null;
        }
        beug0.a();
    }
}

