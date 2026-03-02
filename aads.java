import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;

public final class aads extends aadr {
    private final gruz c;
    private final aatb d;
    private final du e;
    private final baun f;

    public aads(gruz gruz0, aatb aatb0, du du0, baun baun0, aahq aahq0, aaej aaej0) {
        super(aahq0, aaej0);
        this.c = gruz0;
        this.d = aatb0;
        this.e = du0;
        this.f = baun0;
    }

    @Override  // aady
    public final void a() {
        gsae gsae0;
        gruz gruz0 = this.c;
        String s = gruz0.c;
        if((gruz0.b & 2) == 0) {
            gsae0 = null;
        }
        else {
            gsae0 = gruz0.d;
            if(gsae0 == null) {
                gsae0 = gsae.a;
            }
        }
        String s1 = ccht.b(s, gsae0);
        if(s1 == null) {
            this.a.a(new IllegalArgumentException("No URL"));
            return;
        }
        if(bbpr.c(AppContextProvider.a())) {
            try {
                boolean z = gruz0.e;
                aatb aatb0 = this.d;
                Uri uri0 = Uri.parse(s1);
                Uri.Builder uri$Builder0 = uri0.buildUpon();
                if(uri0.getQueryParameter("hl") == null) {
                    uri$Builder0.appendQueryParameter("hl", aaus.a());
                }
                if(z) {
                    uri$Builder0 = Uri.parse(hojn.i()).buildUpon().appendQueryParameter("hl", aaus.a()).appendQueryParameter("continue", uri$Builder0.build().toString());
                    if(aaua.c(aatb0)) {
                        uri$Builder0.appendQueryParameter("Email", aatb0.b);
                    }
                }
                Uri uri1 = uri$Builder0.build();
                xob xob0 = (xob)this.e.requireContext();
                ActivityOptions activityOptions0 = ActivityOptions.makeSceneTransitionAnimation(xob0.getContainerActivity(), new Pair[0]);
                Context context0 = this.e.requireContext();
                Bundle bundle0 = new Bundle();
                bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
                bundle0.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", cchs.a(context0, 0x1010031, 0x7F060814));  // color:google_white
                bundle0.putString("com.android.browser.application_id", "com.google.android.gms");
                xob0.startActivityForResult(new Intent("android.intent.action.VIEW", uri1).putExtras(bundle0), 2, activityOptions0.toBundle());
                this.b.a(true);
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                this.f.e("Error starting browser", activityNotFoundException0, new Object[0]);
                this.a.a(activityNotFoundException0);
            }
            return;
        }
        this.a.a(new iapl(iapk.f));
    }
}

