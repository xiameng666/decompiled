import android.app.Notification.BigTextStyle;
import android.os.Bundle;

public final class juk extends jvg {
    private CharSequence a;

    @Override  // jvg
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override  // jvg
    protected final void b(Bundle bundle0) {
        super.b(bundle0);
        bundle0.remove("android.bigText");
    }

    @Override  // jvg
    protected final void c(Bundle bundle0) {
        super.c(bundle0);
        this.a = bundle0.getCharSequence("android.bigText");
    }

    @Override  // jvg
    public final void d(jvl jvl0) {
        Notification.BigTextStyle notification$BigTextStyle0 = new Notification.BigTextStyle(jvl0.a).setBigContentTitle(this.h).bigText(this.a);
        if(this.j) {
            notification$BigTextStyle0.setSummaryText(this.i);
        }
    }

    public final void e(CharSequence charSequence0) {
        this.a = juo.c(charSequence0);
    }

    public final void f(CharSequence charSequence0) {
        this.h = juo.c(charSequence0);
    }
}

