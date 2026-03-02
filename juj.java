import android.app.Notification.BigPictureStyle;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

public final class juj extends jvg {
    public boolean a;
    private IconCompat b;
    private IconCompat c;
    private boolean d;

    @Override  // jvg
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override  // jvg
    protected final void b(Bundle bundle0) {
        super.b(bundle0);
        bundle0.remove("android.largeIcon.big");
        bundle0.remove("android.picture");
        bundle0.remove("android.pictureIcon");
        bundle0.remove("android.showBigPictureWhenCollapsed");
    }

    @Override  // jvg
    protected final void c(Bundle bundle0) {
        super.c(bundle0);
        if(bundle0.containsKey("android.largeIcon.big")) {
            this.c = juj.g(bundle0.getParcelable("android.largeIcon.big"));
            this.d = true;
        }
        Parcelable parcelable0 = bundle0.getParcelable("android.picture");
        this.b = parcelable0 == null ? juj.g(bundle0.getParcelable("android.pictureIcon")) : juj.g(parcelable0);
        this.a = bundle0.getBoolean("android.showBigPictureWhenCollapsed");
    }

    @Override  // jvg
    public final void d(jvl jvl0) {
        Notification.BigPictureStyle notification$BigPictureStyle0 = new Notification.BigPictureStyle(jvl0.a).setBigContentTitle(this.h);
        IconCompat iconCompat0 = this.b;
        if(iconCompat0 != null) {
            jui.a(notification$BigPictureStyle0, jxw.c(iconCompat0));
        }
        if(this.d) {
            IconCompat iconCompat1 = this.c;
            if(iconCompat1 == null) {
                notification$BigPictureStyle0.bigLargeIcon(null);
            }
            else {
                notification$BigPictureStyle0.bigLargeIcon(jxw.c(iconCompat1));
            }
        }
        if(this.j) {
            notification$BigPictureStyle0.setSummaryText(this.i);
        }
        jui.c(notification$BigPictureStyle0, this.a);
        jui.b(notification$BigPictureStyle0, null);
    }

    public final void e(Bitmap bitmap0) {
        this.b = IconCompat.g(bitmap0);
    }

    public final void f() {
        this.c = null;
        this.d = true;
    }

    private static IconCompat g(Parcelable parcelable0) {
        if(parcelable0 != null) {
            if((parcelable0 instanceof Icon)) {
                return jxw.b(((Icon)parcelable0));
            }
            return (parcelable0 instanceof Bitmap) ? IconCompat.g(((Bitmap)parcelable0)) : null;
        }
        return null;
    }
}

