import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnid implements View.OnClickListener {
    public final dnjs a;
    public final Uri b;

    public dnid(dnjs dnjs0, Uri uri0) {
        this.a = dnjs0;
        this.b = uri0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.i.d(hami.D);
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(this.b);
        this.a.e.startActivity(intent0);
    }
}

