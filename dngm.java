import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dngm implements View.OnClickListener {
    public final dnhi a;

    public dngm(dnhi dnhi0) {
        this.a = dnhi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(hwjj.d()));
        this.a.a.startActivity(intent0);
    }
}

