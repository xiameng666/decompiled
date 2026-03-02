import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnim implements View.OnClickListener {
    public final dnjs a;
    public final String b;

    public dnim(dnjs dnjs0, String s) {
        this.a = dnjs0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.i.d(hami.y);
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(this.b));
        this.a.e.startActivity(intent0);
    }
}

