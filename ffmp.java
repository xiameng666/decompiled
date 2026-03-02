import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

public final class ffmp {
    private final Context a;
    private final bayo b;
    private juo c;

    public ffmp(Context context0) {
        this.a = context0;
        this.b = bayo.a(context0);
    }

    public final void a(juh juh0, int v, int v1, gfsx gfsx0, String s, boolean z) {
        Context context0 = this.a;
        CharSequence charSequence0 = context0.getResources().getText(v);
        CharSequence charSequence1 = context0.getResources().getText(v1);
        if(Log.isLoggable("WearNotification", 3)) {
            Log.d("WearNotification", "Showing notification: " + charSequence0);
        }
        juo juo0 = this.d();
        this.c = juo0;
        juo0.D(charSequence0);
        this.c.k(charSequence1);
        if(gfsx0.i()) {
            juo juo1 = this.c;
            juk juk0 = new juk();
            Resources resources0 = context0.getResources();
            Integer integer0 = (Integer)gfsx0.d();
            juk0.e(resources0.getText(0x7F153633));  // string:wearable_emulator_oem_companion_not_found_body_expanded "The emulator has 
                                                     // successfully connected but you need a different companion app to configure it."
            juo1.v(juk0);
        }
        this.c.y(juh0);
        this.c.y = true;
        this.c.K(z);
        Notification notification0 = this.c.a();
        this.b.e(s, 0, notification0);
    }

    public final void b(PendingIntent pendingIntent0, int v, int v1, gfsx gfsx0, String s, boolean z) {
        Context context0 = this.a;
        String s1 = context0.getResources().getText(v).toString();
        String s2 = context0.getResources().getText(v1).toString();
        if(gfsx0.i()) {
            juo juo0 = this.c;
            juk juk0 = new juk();
            Resources resources0 = context0.getResources();
            Integer integer0 = (Integer)gfsx0.d();
            juk0.e(resources0.getText(0x7F153633));  // string:wearable_emulator_oem_companion_not_found_body_expanded "The emulator has 
                                                     // successfully connected but you need a different companion app to configure it."
            juo0.v(juk0);
        }
        this.c(pendingIntent0, s1, s2, s, z, null);
    }

    public final void c(PendingIntent pendingIntent0, String s, String s1, String s2, boolean z, Boolean boolean0) {
        if(Log.isLoggable("WearNotification", 3)) {
            Log.d("WearNotification", "Showing notification: " + s);
        }
        juo juo0 = this.d();
        this.c = juo0;
        juo0.D(s);
        this.c.k(s1);
        this.c.h = pendingIntent0;
        this.c.y = true;
        this.c.K(z);
        if(boolean0 != null) {
            this.c.h(true);
        }
        Notification notification0 = this.c.a();
        this.b.e(s2, 0, notification0);
    }

    private final juo d() {
        int v = avyq.a(this.a, 0x7F080E31);
        juo juo0 = new juo(this.a);
        juo0.s(v);
        return juo0;
    }
}

