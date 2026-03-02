import android.app.Notification.Builder;
import android.app.Notification.ProgressStyle;
import android.app.Notification.Style;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

public final class jvf extends jvg {
    public List a;
    public List b;
    public int c;
    public boolean d;
    public IconCompat e;
    private boolean f;
    private IconCompat k;
    private IconCompat l;

    public jvf() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = 0;
        this.d = true;
    }

    @Override  // jvg
    protected final String a() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override  // jvg
    protected final void b(Bundle bundle0) {
        super.b(bundle0);
        bundle0.remove("android.progressSegments");
        bundle0.remove("android.progress");
        bundle0.remove("android.styledByProgress");
        bundle0.remove("android.progressTrackerIcon");
        bundle0.remove("android.progressStartIcon");
        bundle0.remove("android.progressEndIcon");
        bundle0.remove("android.progressPoints");
        bundle0.remove("android.progressIndeterminate");
    }

    @Override  // jvg
    protected final void c(Bundle bundle0) {
        super.c(bundle0);
        ArrayList arrayList0 = jyt.b(bundle0, "android.progressSegments", Bundle.class);
        ArrayList arrayList1 = new ArrayList();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(int v = 0; v < arrayList0.size(); ++v) {
                Bundle bundle1 = (Bundle)arrayList0.get(v);
                int v1 = bundle1.getInt("length");
                if(v1 > 0) {
                    int v2 = bundle1.getInt("id");
                    int v3 = bundle1.getInt("colorInt", 0);
                    jve jve0 = new jve(v1);
                    jve0.b = v2;
                    jve0.c = v3;
                    arrayList1.add(jve0);
                }
            }
        }
        this.a = arrayList1;
        this.c = bundle0.getInt("android.progress", 0);
        this.f = bundle0.getBoolean("android.progressIndeterminate", false);
        this.d = bundle0.getBoolean("android.styledByProgress", true);
        ArrayList arrayList2 = jyt.b(bundle0, "android.progressPoints", Bundle.class);
        ArrayList arrayList3 = new ArrayList();
        if(arrayList2 != null && !arrayList2.isEmpty()) {
            for(int v4 = 0; v4 < arrayList2.size(); ++v4) {
                Bundle bundle2 = (Bundle)arrayList2.get(v4);
                int v5 = bundle2.getInt("position");
                if(v5 >= 0) {
                    int v6 = bundle2.getInt("id");
                    int v7 = bundle2.getInt("colorInt", 0);
                    jvd jvd0 = new jvd(v5);
                    jvd0.b = v6;
                    jvd0.c = v7;
                    arrayList3.add(jvd0);
                }
            }
        }
        this.b = arrayList3;
        this.e = jvf.h(((Parcelable)jyt.a(bundle0, "android.progressTrackerIcon", Icon.class)));
        this.k = jvf.h(((Parcelable)jyt.a(bundle0, "android.progressStartIcon", Icon.class)));
        this.l = jvf.h(((Parcelable)jyt.a(bundle0, "android.progressEndIcon", Icon.class)));
    }

    @Override  // jvg
    public final void d(jvl jvl0) {
        Notification.Builder notification$Builder0 = jvl0.a;
        if(Build.VERSION.SDK_INT >= 36) {
            Notification.ProgressStyle notification$ProgressStyle0 = new Notification.ProgressStyle();
            jvc.h(notification$ProgressStyle0, this.d);
            jvc.a(notification$ProgressStyle0, this.c);
            jvc.c(notification$ProgressStyle0, this.f);
            Icon icon0 = null;
            jvc.f(notification$ProgressStyle0, (this.k == null ? null : jxw.c(this.k)));
            jvc.b(notification$ProgressStyle0, (this.l == null ? null : jxw.c(this.l)));
            IconCompat iconCompat0 = this.e;
            if(iconCompat0 != null) {
                icon0 = jxw.c(iconCompat0);
            }
            jvc.g(notification$ProgressStyle0, icon0);
            jvc.d(notification$ProgressStyle0, this.b);
            jvc.e(notification$ProgressStyle0, this.a);
            notification$Builder0.setStyle(((Notification.Style)notification$ProgressStyle0));
            return;
        }
        int v = this.g();
        notification$Builder0.setProgress(v, Math.min(this.c, v), this.f);
    }

    public final int g() {
        List list0 = this.a;
        if(list0 != null && !list0.isEmpty()) {
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; v < list0.size(); ++v) {
                int v3 = ((jve)list0.get(v)).a;
                if(v3 > 0) {
                    long v4 = ((long)v2) + ((long)v3);
                    v2 = (int)v4;
                    if(v4 == ((long)v2)) {
                        ++v1;
                        continue;
                    }
                    try {
                        throw new ArithmeticException();
                    }
                    catch(ArithmeticException unused_ex) {
                        return 100;
                    }
                }
            }
            return v1 == 0 ? 100 : v2;
        }
        return 100;
    }

    private static IconCompat h(Parcelable parcelable0) {
        if(parcelable0 != null) {
            if((parcelable0 instanceof Icon)) {
                return jxw.b(((Icon)parcelable0));
            }
            return (parcelable0 instanceof Bitmap) ? IconCompat.g(((Bitmap)parcelable0)) : null;
        }
        return null;
    }

    @Override  // jvg
    public final void k(Bundle bundle0) {
        super.k(bundle0);
        if(Build.VERSION.SDK_INT < 36) {
            List list0 = this.a;
            ArrayList arrayList0 = new ArrayList();
            if(list0 != null && !list0.isEmpty()) {
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    jve jve0 = (jve)list0.get(v1);
                    int v2 = jve0.a;
                    if(v2 > 0) {
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("length", v2);
                        bundle1.putInt("id", jve0.b);
                        bundle1.putInt("colorInt", jve0.c);
                        arrayList0.add(bundle1);
                    }
                }
            }
            bundle0.putParcelableArrayList("android.progressSegments", arrayList0);
            List list1 = this.b;
            ArrayList arrayList1 = new ArrayList();
            if(list1 != null && !list1.isEmpty()) {
                for(int v = 0; v < list1.size(); ++v) {
                    jvd jvd0 = (jvd)list1.get(v);
                    int v3 = jvd0.a;
                    if(v3 >= 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("position", v3);
                        bundle2.putInt("id", jvd0.b);
                        bundle2.putInt("colorInt", jvd0.c);
                        arrayList1.add(bundle2);
                    }
                }
            }
            bundle0.putParcelableArrayList("android.progressPoints", arrayList1);
            bundle0.putInt("android.progress", this.c);
            bundle0.putBoolean("android.progressIndeterminate", this.f);
            bundle0.putInt("android.progressMax", this.g());
            bundle0.putBoolean("android.styledByProgress", this.d);
            if((this.g == null ? null : this.g.a) != null) {
                IconCompat iconCompat0 = this.e;
                if(iconCompat0 == null) {
                    bundle0.remove("android.progressTrackerIcon");
                }
                else {
                    bundle0.putParcelable("android.progressTrackerIcon", jxw.c(iconCompat0));
                }
                IconCompat iconCompat1 = this.k;
                if(iconCompat1 == null) {
                    bundle0.remove("android.progressStartIcon");
                }
                else {
                    bundle0.putParcelable("android.progressStartIcon", jxw.c(iconCompat1));
                }
                IconCompat iconCompat2 = this.l;
                if(iconCompat2 != null) {
                    bundle0.putParcelable("android.progressEndIcon", jxw.c(iconCompat2));
                    return;
                }
                bundle0.remove("android.progressEndIcon");
            }
        }
    }
}

