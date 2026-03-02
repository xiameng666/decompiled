import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;

public final class ank {
    public final Intent a;
    public SparseArray b;
    public Bundle c;
    private final amw d;
    private ActivityOptions e;
    private int f;

    public ank() {
        this.a = new Intent("android.intent.action.VIEW");
        this.d = new amw();
        this.f = 0;
    }

    public ank(ann ann0) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        this.a = intent0;
        this.d = new amw();
        this.f = 0;
        if(ann0 != null) {
            intent0.setPackage(ann0.a.getPackageName());
            this.e(ann0.b);
        }
    }

    public final anl a() {
        Intent intent0 = this.a;
        Bundle bundle0 = null;
        if(!intent0.hasExtra("android.support.customtabs.extra.SESSION")) {
            this.e(null);
        }
        intent0.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent0.putExtras(this.d.a().a());
        Bundle bundle1 = this.c;
        if(bundle1 != null) {
            intent0.putExtras(bundle1);
        }
        if(this.b != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.b);
            intent0.putExtras(bundle2);
        }
        intent0.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
        LocaleList localeList0 = LocaleList.getAdjustedDefault();
        String s = localeList0.size() <= 0 ? null : localeList0.get(0).toLanguageTag();
        if(!TextUtils.isEmpty(s)) {
            Bundle bundle3 = intent0.hasExtra("com.android.browser.headers") ? intent0.getBundleExtra("com.android.browser.headers") : new Bundle();
            if(!bundle3.containsKey("Accept-Language")) {
                bundle3.putString("Accept-Language", s);
                intent0.putExtra("com.android.browser.headers", bundle3);
            }
        }
        if(Build.VERSION.SDK_INT >= 34) {
            if(this.e == null) {
                this.e = ActivityOptions.makeBasic();
            }
            this.e.setShareIdentityEnabled(false);
        }
        if(Build.VERSION.SDK_INT >= 36) {
            if(this.e == null) {
                this.e = ActivityOptions.makeBasic();
            }
            int v = intent0.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false) ^ 1;
            this.e.setAllowPassThroughOnTouchOutside(((boolean)v));
        }
        ActivityOptions activityOptions0 = this.e;
        if(activityOptions0 != null) {
            bundle0 = activityOptions0.toBundle();
        }
        return new anl(intent0, bundle0);
    }

    public final void b() {
        this.f = 2;
        this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
    }

    public final void c() {
        this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    @Deprecated
    public final void d(int v) {
        this.d.b(v);
    }

    private final void e(IBinder iBinder0) {
        Bundle bundle0 = new Bundle();
        bundle0.putBinder("android.support.customtabs.extra.SESSION", iBinder0);
        this.a.putExtras(bundle0);
    }
}

