import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dngu implements View.OnClickListener {
    public final dnhi a;
    public final String b;

    public dngu(dnhi dnhi0, String s) {
        this.a = dnhi0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(this.b));
        this.a.a.startActivity(intent0);
    }
}

