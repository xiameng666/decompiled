import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class erdk implements View.OnClickListener {
    public final erdp a;
    public final int b;

    public erdk(erdp erdp0, int v) {
        this.a = erdp0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.c(this.b, Bundle.EMPTY);
    }
}

