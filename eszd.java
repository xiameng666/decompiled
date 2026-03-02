import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class eszd implements View.OnClickListener {
    public final xob a;
    public final Intent b;

    public eszd(xob xob0, Intent intent0) {
        this.a = xob0;
        this.b = intent0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.startActivity(this.b);
    }
}

