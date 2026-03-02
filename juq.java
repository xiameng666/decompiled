import android.app.Notification.CallStyle;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;

public final class juq extends jvg {
    public PendingIntent a;
    public PendingIntent b;
    public PendingIntent c;
    public boolean d;
    public Integer e;
    public Integer f;
    private int k;
    private jvx l;
    private IconCompat m;
    private CharSequence n;

    @Override  // jvg
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override  // jvg
    protected final void c(Bundle bundle0) {
        super.c(bundle0);
        this.k = bundle0.getInt("android.callType");
        this.d = bundle0.getBoolean("android.callIsVideo");
        if(bundle0.containsKey("android.callPerson")) {
            this.l = jvv.b(((Person)bundle0.getParcelable("android.callPerson")));
        }
        else if(bundle0.containsKey("android.callPersonCompat")) {
            this.l = jvx.a(bundle0.getBundle("android.callPersonCompat"));
        }
        if(bundle0.containsKey("android.verificationIcon")) {
            this.m = jxw.b(((Icon)bundle0.getParcelable("android.verificationIcon")));
        }
        else if(bundle0.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.d(bundle0.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle0.getCharSequence("android.verificationText");
        this.a = (PendingIntent)bundle0.getParcelable("android.answerIntent");
        this.b = (PendingIntent)bundle0.getParcelable("android.declineIntent");
        this.c = (PendingIntent)bundle0.getParcelable("android.hangUpIntent");
        Integer integer0 = null;
        this.e = bundle0.containsKey("android.answerColor") ? bundle0.getInt("android.answerColor") : null;
        if(bundle0.containsKey("android.declineColor")) {
            integer0 = bundle0.getInt("android.declineColor");
        }
        this.f = integer0;
    }

    @Override  // jvg
    public final void d(jvl jvl0) {
        Notification.CallStyle notification$CallStyle0;
        switch(this.k) {
            case 1: {
                notification$CallStyle0 = jup.a(jvv.a(this.l), this.b, this.a);
                break;
            }
            case 2: {
                notification$CallStyle0 = jup.b(jvv.a(this.l), this.c);
                break;
            }
            case 3: {
                notification$CallStyle0 = jup.c(jvv.a(this.l), this.c, this.a);
                break;
            }
            default: {
                notification$CallStyle0 = null;
            }
        }
        if(notification$CallStyle0 != null) {
            notification$CallStyle0.setBuilder(jvl0.a);
            Integer integer0 = this.e;
            if(integer0 != null) {
                jup.d(notification$CallStyle0, integer0.intValue());
            }
            Integer integer1 = this.f;
            if(integer1 != null) {
                jup.e(notification$CallStyle0, integer1.intValue());
            }
            jup.h(notification$CallStyle0, this.n);
            IconCompat iconCompat0 = this.m;
            if(iconCompat0 != null) {
                jup.g(notification$CallStyle0, jxw.c(iconCompat0));
            }
            jup.f(notification$CallStyle0, this.d);
        }
    }

    public final juh e(int v, int v1, Integer integer0, int v2, PendingIntent pendingIntent0) {
        if(integer0 == null) {
            integer0 = this.g.a.getColor(v2);
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        spannableStringBuilder0.append(this.g.a.getResources().getString(v1));
        int v3 = spannableStringBuilder0.length();
        spannableStringBuilder0.setSpan(new ForegroundColorSpan(((int)integer0)), 0, v3, 18);
        juh juh0 = new juf(IconCompat.i(this.g.a, v), spannableStringBuilder0, pendingIntent0).a();
        juh0.a.putBoolean("key_action_priority", true);
        return juh0;
    }

    @Override  // jvg
    public final void k(Bundle bundle0) {
        super.k(bundle0);
        bundle0.putInt("android.callType", this.k);
        bundle0.putBoolean("android.callIsVideo", this.d);
        jvx jvx0 = this.l;
        if(jvx0 != null) {
            bundle0.putParcelable("android.callPerson", jvv.a(jvx0));
        }
        IconCompat iconCompat0 = this.m;
        if(iconCompat0 != null) {
            bundle0.putParcelable("android.verificationIcon", jxw.c(iconCompat0));
        }
        bundle0.putCharSequence("android.verificationText", this.n);
        bundle0.putParcelable("android.answerIntent", this.a);
        bundle0.putParcelable("android.declineIntent", this.b);
        bundle0.putParcelable("android.hangUpIntent", this.c);
        Integer integer0 = this.e;
        if(integer0 != null) {
            bundle0.putInt("android.answerColor", integer0.intValue());
        }
        Integer integer1 = this.f;
        if(integer1 != null) {
            bundle0.putInt("android.declineColor", integer1.intValue());
        }
    }
}

