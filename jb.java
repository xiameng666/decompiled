import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.LocaleList;

public final class jb implements Runnable {
    public final Context a;

    public jb(Context context0) {
        this.a = context0;
    }

    @Override
    public final void run() {
        jzd jzd0;
        if(Build.VERSION.SDK_INT >= 33) {
            Context context0 = this.a;
            ComponentName componentName0 = new ComponentName(context0, "android.support.v7.app.AppLocalesMetadataHolderService");
            if(context0.getPackageManager().getComponentEnabledSetting(componentName0) != 1) {
                if(Build.VERSION.SDK_INT >= 33) {
                    Object object0 = jg.e();
                    jzd0 = object0 == null ? jzd.a : jzd.e(((LocaleManager)object0).getApplicationLocales());
                }
                else {
                    jzd0 = jg.c;
                    if(jzd0 == null) {
                        jzd0 = jzd.a;
                    }
                }
                if(jzd0.h()) {
                    String s = jtw.a(context0);
                    Object object1 = context0.getSystemService("locale");
                    if(object1 != null) {
                        jc.a(object1, LocaleList.forLanguageTags(s));
                    }
                }
                context0.getPackageManager().setComponentEnabledSetting(componentName0, 1, 1);
            }
        }
        jg.e = true;
    }
}

