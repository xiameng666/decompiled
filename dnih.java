import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnih implements View.OnClickListener {
    public final dnjs a;
    public final String b;

    public dnih(dnjs dnjs0, String s) {
        this.a = dnjs0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(this.b));
        this.a.e.startActivity(intent0);
    }
}

