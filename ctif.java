import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import java.util.ArrayList;
import java.util.List;

public final class ctif implements ctho {
    private static final Intent a;
    private final PackageManager b;
    private final ctlj c;
    private final String d;
    private final String e;
    private final icnl f;

    static {
        Intent intent0 = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
        ibuq.e(intent0, "addCategory(...)");
        ctif.a = intent0;
    }

    public ctif(PackageManager packageManager0, ctlj ctlj0) {
        ibuq.f(packageManager0, "packageManager");
        ibuq.f(ctlj0, "exoController");
        super();
        this.b = packageManager0;
        this.c = ctlj0;
        this.d = "local";
        this.e = "Local Device";
        List list0 = packageManager0.queryIntentActivities(ctif.a, 0);
        ibuq.e(list0, "queryIntentActivities(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((ResolveInfo)object0).activityInfo.packageName);
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object1: arrayList0) {
            ApplicationInfo applicationInfo0 = this.b.getApplicationInfo(((String)object1), 0x20000);
            ibuq.e(applicationInfo0, "getApplicationInfo(...)");
            ctzq ctzq0 = ctzp.a(((ProtoLiteMessage)ctza.a).v_newBuilder());
            ibuq.c(((String)object1));
            ctzq0.b(((String)object1));
            ctzq0.c(this.b.getApplicationLabel(applicationInfo0).toString());
            arrayList1.add(ctzq0.a());
        }
        this.f = icnm.a(arrayList1);
    }

    @Override  // ctho
    public final Object a(String s, ibrl ibrl0) {
        Drawable drawable0 = this.b.getApplicationIcon(s);
        ibuq.e(drawable0, "getApplicationIcon(...)");
        Object object0 = Icon.createWithBitmap(jxv.b(drawable0, 0, 0, 7));
        ibuq.e(object0, "createWithBitmap(...)");
        return object0;
    }

    @Override  // ctho
    public final String b() {
        return this.e;
    }

    @Override  // ctho
    public final String c() {
        return this.d;
    }

    @Override  // ctho
    public final icig d(icig icig0) {
        ibuq.f(icig0, "messages");
        return this.c.a(this.d, icig0);
    }

    @Override  // ctho
    public final icig e() {
        return this.f;
    }
}

