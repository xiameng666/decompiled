import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.Locale;

public final class buni implements View.OnClickListener {
    public final bunj a;

    public buni(bunj bunj0) {
        this.a = bunj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bunj bunj0 = this.a;
        View view1 = bunj0.h;
        Intent intent0 = view1.getContext().getPackageManager().getLaunchIntentForPackage("com.google.android.apps.nbu.files");
        if(intent0 == null) {
            Uri uri0 = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", "com.google.android.apps.nbu.files").appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).build();
            Intent intent1 = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setFlags(0x10000000).setData(uri0);
            if(!gfta.c(bunj0.n)) {
                bune.b(view1, intent1, bunj0.n);
            }
        }
        else if(!gfta.c(bunj0.m)) {
            bune.b(view1, intent0, bunj0.m);
        }
    }
}

