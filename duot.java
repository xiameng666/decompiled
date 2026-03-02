import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class duot implements View.OnClickListener {
    public final Context a;

    public duot(Context context0) {
        this.a = context0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(hwpi.d())).addFlags(0x10000000);
        this.a.startActivity(intent0);
    }
}

