import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;

public final class fvwl implements View.OnClickListener {
    public final Context a;
    public final EAlertUxArgs b;

    public fvwl(Context context0, EAlertUxArgs eAlertUxArgs0) {
        this.a = context0;
        this.b = eAlertUxArgs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fxmt.b().a(this.b.h, this.b.i, this.b.k, 5);
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/search").buildUpon().appendQueryParameter("query", "earthquake near me").appendQueryParameter("ved", "1t:99102").appendQueryParameter("wbsk", "1").build());
        this.a.startActivity(intent0);
    }
}

