import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public final class crbs {
    public static volatile crbs a;
    public final String b;
    protected final ExecutorService c;
    public boolean d;
    public volatile crba e;

    public crbs(Context context0) {
        this.b = "FA";
        this.c = clhl.b.c(new crbi(this), clhr.a);
        new ArrayList();
        try {
            if(crnr.a(context0, crkl.a(context0)) != null) {
                goto label_5;
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        goto label_10;
        try {
        label_5:
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, this.getClass().getClassLoader());
        }
        catch(ClassNotFoundException unused_ex) {
            this.d = true;
            Log.w(this.b, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
            return;
        }
    label_10:
        this.b(new crbf(this, context0));
        Application application0 = (Application)context0.getApplicationContext();
        if(application0 == null) {
            Log.w(this.b, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application0.registerActivityLifecycleCallbacks(new crbr(this));
    }

    public final void a(Exception exception0, boolean z, boolean z1) {
        this.d |= (int)z;
        if(((int)z) != 0) {
            Log.w(this.b, "Data collection startup failed. No data will be collected.", exception0);
            return;
        }
        if(z1) {
            this.b(new crbh(this, exception0));
        }
        Log.w(this.b, "Error with data collection. Data lost.", exception0);
    }

    public final void b(crbj crbj0) {
        this.c.execute(crbj0);
    }
}

