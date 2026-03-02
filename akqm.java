import android.accounts.Account;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;

public final class akqm implements lqj {
    public final akqo a;
    public final Application b;

    public akqm(akqo akqo0, Application application0) {
        this.a = akqo0;
        this.b = application0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Bundle bundle1;
        if(((Account)object0) != null) {
            Application application0 = this.b;
            String s = ((Account)object0).name;
            ibuq.f(application0, "context");
            ibuq.f(s, "accountName");
            Bundle bundle0 = new Bundle();
            Object object1 = null;
            try {
                Uri uri0 = new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.account").appendPath("getAccountFeature").build();
                bundle1 = application0.getContentResolver().call(uri0, "getAccountFeature", s, bundle0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.ae(akqp.a.j(), "Fail to get config from account provider", illegalArgumentException0);
                bundle1 = null;
            }
            if(bundle1 != null) {
                Bitmap bitmap0 = (Bitmap)bundle1.getParcelable(s);
                if(bitmap0 != null) {
                    Resources resources0 = application0.getResources();
                    ibuq.e(resources0, "getResources(...)");
                    object1 = new BitmapDrawable(resources0, bitmap0);
                }
            }
            this.a.b.l(object1);
        }
    }
}

