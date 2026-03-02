import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class eqop implements View.OnClickListener {
    public final eqor a;
    public final int b;

    public eqop(eqor eqor0, int v) {
        this.a = eqor0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.c(this.b, Bundle.EMPTY);
    }
}

