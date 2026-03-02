import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.chimera.modules.ipa.AppContextProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class cajt {
    public static final bboh a;
    private static final QuerySpecification b;
    private static bwke c;
    private static Map d;

    static {
        cajt.a = bboh.b("GmscoreIpa", bbcu.ee);
        abwe abwe0 = new abwe();
        abwe0.b();
        abwe0.d();
        cajt.b = abwe0.a();
        cajt.d = ggnf.a;
    }

    static String a() {
        boolean z1;
        boolean z = false;
        int v = (int)huhz.a.h().B();
        Object object0 = cajv.b;
        __monitor_enter(object0);
        try {
            if(cajv.c != v) {
                try {
                    switch(v) {
                        case 1: {
                            cajv.d = false;
                            goto label_37;
                        }
                        case 2: {
                            z1 = ((UiModeManager)AppContextProvider.a().getSystemService("uimode")).getCurrentModeType() == 4;
                            break;
                        }
                        case 3: {
                            Context context0 = AppContextProvider.a();
                            try {
                                context0.getPackageManager().getPackageInfo("com.google.android.katniss", 0);
                                cajv.d = true;
                                z = true;
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                                cajv.d = false;
                            }
                            goto label_37;
                        }
                        case 4: {
                            PackageManager packageManager0 = AppContextProvider.a().getPackageManager();
                            z1 = packageManager0.hasSystemFeature("com.google.android.tv") || packageManager0.hasSystemFeature("android.hardware.type.television") || packageManager0.hasSystemFeature("android.software.leanback");
                            break;
                        }
                        default: {
                            cajv.d = false;
                            goto label_37;
                        }
                    }
                    cajv.d = z1;
                    z = z1;
                    goto label_37;
                }
                catch(Exception exception0) {
                }
                cajv.d = false;
                a.ae(cajv.a.i(), "Failure resolving TV device", exception0);
                goto label_30;
            }
            goto label_43;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        try {
        label_30:
            cajv.c = v;
            ((ggtj)cajv.a.h()).P("Using %s flags by method %d", (cajv.d ? "TV" : "regular"), v);
            goto label_43;
        label_34:
            cajv.c = v;
            ((ggtj)cajv.a.h()).P("Using %s flags by method %d", (cajv.d ? "TV" : "regular"), v);
            throw throwable0;
        label_37:
            cajv.c = v;
            ((ggtj)cajv.a.h()).P("Using %s flags by method %d", (z ? "TV" : "regular"), v);
        }
        catch(Throwable throwable1) {
            __monitor_exit(object0);
            throw throwable1;
        }
    label_43:
        __monitor_exit(object0);
        return cajv.d ? "android.intent.category.LEANBACK_LAUNCHER" : "android.intent.category.LAUNCHER";
    }

    public static String b(ComponentName componentName0) {
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.setComponent(componentName0);
        intent0.setPackage(componentName0.getPackageName());
        intent0.addCategory(cajt.a());
        if(huhz.a.h().Y()) {
            return intent0.toUri(1);
        }
        String s = intent0.toUri(2);
        return s.startsWith("android-app") ? s : String.format("android-app://%s#Intent;category=%s;launchFlags=0x10000000;component=%s;end", componentName0.getPackageName(), cajt.a(), componentName0.flattenToShortString());
    }

    // This method was un-flattened
    public static Set c(elfg elfg0) {
        Set set0 = ggog.i(100);
        int v = 0;
        try {
            while(true) {
                SearchResults searchResults0 = (SearchResults)evrg.o(elfg0.b("", "com.google.android.gms", new String[]{"internal.3p:MobileApplication"}, v, 100, cajt.b), huhz.a.h().h(), TimeUnit.SECONDS);
                if(searchResults0 == null || searchResults0.a()) {
                    cakj.a().c(28);
                    return null;
                }
                abwv abwv0 = new abwv(searchResults0);
                while(abwv0.hasNext()) {
                    String s = abwv0.a().d();
                    if(s != null) {
                        set0.add(s);
                    }
                }
                if(searchResults0.g < 100) {
                    break;
                }
                v += 100;
                elfg0 = elfg0;
            }
            return set0;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            if((exception0.getCause() instanceof aztb)) {
                ((ggtj)cajt.a.j()).B("Query failed: %s", (exception0.getCause() == null || exception0.getCause().getMessage() == null ? "" : exception0.getCause().getMessage()));
            }
            cakj.a().c(50);
            return null;
        }
    }

    public static gged_interceptors d(PackageManager packageManager0, String s) {
        cajj cajj0;
        String s4;
        ggfp ggfp0;
        PackageInfo packageInfo0;
        ResolveInfo resolveInfo0;
        List list1;
        Intent intent0 = new Intent("android.intent.action.MAIN", null);
        intent0.addCategory(cajt.a());
        intent0.setPackage(s);
        try {
            List list0 = packageManager0.queryIntentActivities(intent0, 0);
        }
        catch(RuntimeException runtimeException0) {
            a.ae(cajt.a.i(), "PackageManager.queryIntentActivities threw an exception", runtimeException0);
            cakj.a().c(30);
            return null;
        }
        try {
            list1 = packageManager0.getInstalledPackages(0);
        }
        catch(RuntimeException runtimeException1) {
            a.ae(cajt.a.i(), "PackageManager.queryIntentActivities threw an exception", runtimeException1);
            cakj.a().c(30);
            return null;
        }
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ComponentName componentName0 = new ComponentName(((ResolveInfo)object0).activityInfo.applicationInfo.packageName, ((ResolveInfo)object0).activityInfo.name);
            Intent intent1 = new Intent("android.intent.action.MAIN", null);
            intent1.addCategory(cajt.a());
            intent1.setComponent(componentName0);
            try {
                List list2 = packageManager0.queryIntentActivities(intent1, 0);
                if(!list2.isEmpty()) {
                    resolveInfo0 = (ResolveInfo)list2.get(0);
                    Iterator iterator1 = list1.iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            goto label_35;
                        }
                        Object object1 = iterator1.next();
                        packageInfo0 = (PackageInfo)object1;
                        if(!packageInfo0.packageName.equals(componentName0.getPackageName())) {
                            continue;
                        }
                        goto label_36;
                    }
                }
            }
            catch(Exception exception0) {
                ((ggtj)cajt.a.j()).R("PackageManager.queryIntentActivities threw an exception %s for intent %s", gfta.b(exception0.getMessage()), intent1);
            }
            goto label_72;
        label_35:
            packageInfo0 = null;
        label_36:
            if(packageInfo0 == null) {
            label_72:
                cajj0 = null;
            }
            else {
                String s1 = resolveInfo0.loadLabel(packageManager0).toString();
                if(TextUtils.isEmpty(s1)) {
                    s1 = componentName0.getClassName();
                }
                caji caji0 = new caji();
                caji0.a = s1;
                caji0.c = componentName0;
                String s2 = resolveInfo0.activityInfo.packageName;
                if(huhz.a.h().H()) {
                    cajt.g();
                    bwkd bwkd0 = (bwkd)cajt.d.get(s2);
                    if(bwkd0 != null) {
                        String s3 = Locale.getDefault().getLanguage();
                        for(Object object2: bwkd0.c) {
                            bwkc bwkc0 = (bwkc)object2;
                            if(!"*".equals(bwkc0.b) && !s3.equals(bwkc0.b)) {
                                continue;
                            }
                            bwkc0.c.toArray();
                            ggfp0 = ggfp.G(bwkc0.c);
                            goto label_58;
                        }
                    }
                }
                ggfp0 = ggnj.a;
            label_58:
                caji0.f = ggfp0;
                ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
                int v = activityInfo0.getIconResource();
                if(v != 0) {
                    Uri uri0 = cajt.f(packageManager0, activityInfo0.applicationInfo, v);
                    if(uri0 != null) {
                        s4 = uri0.toString();
                        goto label_67;
                    }
                }
                s4 = null;
            label_67:
                caji0.b = gfta.b(s4);
                caji0.d = cajt.b(componentName0);
                caji0.e = (long)packageInfo0.lastUpdateTime;
                cajj0 = new cajj(caji0);
            }
            if(cajj0 != null && cajj0.a()) {
                ggdy0.i(cajj0);
            }
        }
        return ggdy0.h();
    }

    public static gged_interceptors e(PackageManager packageManager0) {
        return cajt.d(packageManager0, null);
    }

    private static Uri f(PackageManager packageManager0, ApplicationInfo applicationInfo0, int v) {
        try {
            Resources resources0 = packageManager0.getResourcesForApplication(applicationInfo0);
            String s = applicationInfo0.packageName;
            String s1 = resources0.getResourcePackageName(v);
            String s2 = resources0.getResourceTypeName(v);
            if(!huhz.a.h().D()) {
                String s3 = resources0.getResourceEntryName(v);
                Uri.Builder uri$Builder0 = new Uri.Builder();
                uri$Builder0.scheme("android.resource");
                uri$Builder0.encodedAuthority(s);
                uri$Builder0.appendEncodedPath(s2);
                if(s.equals(s1)) {
                    uri$Builder0.appendEncodedPath(s3);
                }
                else {
                    uri$Builder0.appendEncodedPath(a.r(s3, s1, ":"));
                }
                return uri$Builder0.build();
            }
            Uri.Builder uri$Builder1 = new Uri.Builder();
            uri$Builder1.scheme("android.resource");
            uri$Builder1.encodedAuthority(s);
            uri$Builder1.appendEncodedPath(s2);
            if(s.equals(s1)) {
                uri$Builder1.appendEncodedPath(String.valueOf(v));
            }
            else {
                uri$Builder1.appendEncodedPath(a.g(v, s1, ":"));
            }
            return uri$Builder1.build();
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ((ggtj)cajt.a.i()).B("Resources not found for %s", applicationInfo0.packageName);
            return null;
        }
        catch(Resources.NotFoundException unused_ex) {
            ((ggtj)cajt.a.i()).H("Resource not found: %d in %s", v, applicationInfo0.packageName);
            return null;
        }
    }

    private static void g() {
        synchronized(cajt.class) {
            bwke bwke0 = huhz.a.h().C();
            if(!bata.b(cajt.c, bwke0)) {
                cajt.c = bwke0;
                HashMap hashMap0 = new HashMap();
                for(Object object0: bwke0.b) {
                    hashMap0.put(((bwkd)object0).b, ((bwkd)object0));
                }
                cajt.d = hashMap0;
            }
        }
    }
}

