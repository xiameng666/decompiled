import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class duoi implements View.OnClickListener {
    public final Uri a;
    public final Context b;

    public duoi(Uri uri0, Context context0) {
        this.a = uri0;
        this.b = context0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", this.a).addFlags(0x10000000);
        this.b.startActivity(intent0);
    }
}

