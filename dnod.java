import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnod implements View.OnClickListener {
    public final dnoj a;

    public dnod(dnoj dnoj0) {
        this.a = dnoj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dmqi dmqi0 = new dmqi();
        dmqi0.e(14);
        Intent intent0 = dmqi0.c();
        this.a.g.d(hami.b);
        this.a.e.startActivity(intent0);
    }
}

