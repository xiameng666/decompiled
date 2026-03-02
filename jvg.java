import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.Notification.InboxStyle;
import android.app.Notification.MessagingStyle;
import android.app.Notification.ProgressStyle;
import android.app.Notification;
import android.os.Build.VERSION;
import android.os.Bundle;

public class jvg {
    protected juo g;
    public CharSequence h;
    public CharSequence i;
    public boolean j;

    public jvg() {
        this.j = false;
    }

    protected String a() {
        return null;
    }

    protected void b(Bundle bundle0) {
        bundle0.remove("android.summaryText");
        bundle0.remove("android.title.big");
        bundle0.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    protected void c(Bundle bundle0) {
        if(bundle0.containsKey("android.summaryText")) {
            this.i = bundle0.getCharSequence("android.summaryText");
            this.j = true;
        }
        this.h = bundle0.getCharSequence("android.title.big");
    }

    public void d(jvl jvl0) {
        throw null;
    }

    public static jvg j(Notification notification0) {
        jvg jvg0;
        Bundle bundle0 = notification0.extras;
        if(bundle0 == null) {
            return null;
        }
        String s = bundle0.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
        if(s == null) {
            jvg0 = null;
        }
        else {
            switch(s) {
                case "androidx.core.app.NotificationCompat$BigPictureStyle": {
                    jvg0 = new juj();
                    break;
                }
                case "androidx.core.app.NotificationCompat$BigTextStyle": {
                    jvg0 = new juk();
                    break;
                }
                case "androidx.core.app.NotificationCompat$CallStyle": {
                    jvg0 = new juq();
                    break;
                }
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle": {
                    jvg0 = new jus();
                    break;
                }
                case "androidx.core.app.NotificationCompat$InboxStyle": {
                    jvg0 = new juu();
                    break;
                }
                case "androidx.core.app.NotificationCompat$MessagingStyle": {
                    jvg0 = new jvb();
                    break;
                }
                case "androidx.core.app.NotificationCompat$ProgressStyle": {
                    jvg0 = new jvf();
                    break;
                }
                default: {
                    jvg0 = null;
                }
            }
        }
        if(jvg0 == null) {
            if(bundle0.containsKey("android.selfDisplayName") || bundle0.containsKey("android.messagingStyleUser")) {
                jvg0 = new jvb();
            }
            else if(bundle0.containsKey("android.picture") || bundle0.containsKey("android.pictureIcon")) {
                jvg0 = new juj();
            }
            else if(bundle0.containsKey("android.bigText")) {
                jvg0 = new juk();
            }
            else if(bundle0.containsKey("android.textLines")) {
                jvg0 = new juu();
            }
            else if(bundle0.containsKey("android.callType")) {
                jvg0 = new juq();
            }
            else if(!bundle0.containsKey("android.progressSegments") && !bundle0.containsKey("android.progressPoints")) {
                String s1 = bundle0.getString("android.template");
                if(s1 == null) {
                    jvg0 = null;
                }
                else if(s1.equals(Notification.BigPictureStyle.class.getName())) {
                    jvg0 = new juj();
                }
                else if(s1.equals(Notification.BigTextStyle.class.getName())) {
                    jvg0 = new juk();
                }
                else if(s1.equals(Notification.InboxStyle.class.getName())) {
                    jvg0 = new juu();
                }
                else if(Build.VERSION.SDK_INT >= 36 && s1.equals(Notification.ProgressStyle.class.getName())) {
                    jvg0 = new jvf();
                }
                else if(s1.equals(Notification.MessagingStyle.class.getName())) {
                    jvg0 = new jvb();
                }
                else if(s1.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                    jvg0 = new jus();
                }
                else {
                    jvg0 = null;
                }
            }
            else {
                jvg0 = new jvf();
            }
        }
        if(jvg0 == null) {
            return null;
        }
        try {
            jvg0.c(bundle0);
            return jvg0;
        }
        catch(ClassCastException unused_ex) {
            return null;
        }
    }

    public void k(Bundle bundle0) {
        if(this.j) {
            bundle0.putCharSequence("android.summaryText", this.i);
        }
        CharSequence charSequence0 = this.h;
        if(charSequence0 != null) {
            bundle0.putCharSequence("android.title.big", charSequence0);
        }
        String s = this.a();
        if(s != null) {
            bundle0.putString("androidx.core.app.extra.COMPAT_TEMPLATE", s);
        }
    }

    public void l() {
    }
}

