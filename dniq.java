import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dniq implements View.OnClickListener {
    public final dnjs a;

    public dniq(dnjs dnjs0) {
        this.a = dnjs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(hwjj.d()));
        this.a.e.startActivity(intent0);
    }
}

