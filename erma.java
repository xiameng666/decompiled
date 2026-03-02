import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class erma implements View.OnClickListener {
    public final ermb a;

    public erma(ermb ermb0) {
        this.a = ermb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.c(this.a.a, Bundle.EMPTY);
    }
}

