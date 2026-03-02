import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class erlz implements View.OnClickListener {
    public final ermb a;
    public final int b;

    public erlz(ermb ermb0, int v) {
        this.a = ermb0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.c(this.b, Bundle.EMPTY);
    }
}

