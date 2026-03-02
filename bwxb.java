import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
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
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.chimera.modules.icing.AppContextProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class bwxb {
    public static final int a;
    private static final QuerySpecification b;
    private static final String[] c;
    private static bwke d;
    private static Map e;

    static {
        abwe abwe0 = new abwe();
        abwe0.b();
        abwe0.e(new Section("package_name"));
        abwe0.e(new Section("class_name"));
        bwxb.b = abwe0.a();
        bwxb.c = new String[]{"apps"};
        bwxb.e = ggnf.a;
    }

    public static bwwz a(PackageManager packageManager0, ComponentName componentName0) {
        gged_interceptors gged0;
        PackageInfo packageInfo0;
        ResolveInfo resolveInfo0;
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.addCategory(bwxb.e());
        intent0.setComponent(componentName0);
        bwwz bwwz0 = null;
        try {
            List list0 = packageManager0.queryIntentActivities(intent0, 0);
            if(!list0.isEmpty()) {
                resolveInfo0 = (ResolveInfo)list0.get(0);
                packageInfo0 = packageManager0.getPackageInfo(resolveInfo0.activityInfo.packageName, 0);
                if(packageInfo0 != null) {
                    goto label_9;
                }
            }
            return bwwz0;
        }
        catch(Exception exception0) {
            bwzd.q("PackageManager.queryIntentActivities threw an exception %s for intent %s", exception0, intent0);
            return null;
        }
    label_9:
        bwwz0 = new bwwz();
        bwwz0.a = resolveInfo0.loadLabel(packageManager0).toString();
        bwwz0.c = componentName0;
        if(TextUtils.isEmpty(bwwz0.a)) {
            bwwz0.a = componentName0.getClassName();
        }
        String s = resolveInfo0.activityInfo.packageName;
        if(hubu.a.b().p()) {
            bwxb.i();
            bwkd bwkd0 = (bwkd)bwxb.e.get(s);
            if(bwkd0 != null) {
                String s1 = Locale.getDefault().getLanguage();
                for(Object object0: bwkd0.c) {
                    bwkc bwkc0 = (bwkc)object0;
                    if(!"*".equals(bwkc0.b) && !s1.equals(bwkc0.b)) {
                        continue;
                    }
                    bwzd.e("Supplied alternate names %s for package %s", Arrays.toString(bwkc0.c.toArray()), s);
                    gged0 = bwkc0.c;
                    goto label_29;
                }
            }
        }
        gged0 = ggna.a;
    label_29:
        bwwz0.g = gged0;
        String s2 = bwxb.d(packageManager0, resolveInfo0.activityInfo.applicationInfo, resolveInfo0.activityInfo.getIconResource());
        if(s2 == null) {
            s2 = "android.resource://android/drawable/sym_def_app_icon";
        }
        bwwz0.b = s2;
        bwwz0.d = packageInfo0.firstInstallTime;
        bwwz0.f = packageInfo0.lastUpdateTime;
        bwwz0.e = bwwt.a(componentName0);
        try {
            return bwwz0;
        }
        catch(Exception exception0) {
            bwzd.q("PackageManager.queryIntentActivities threw an exception %s for intent %s", exception0, intent0);
            return null;
        }
    }

    public static gged_interceptors b(Context context0, String s, bwts bwts0) {
        PackageInfo packageInfo0;
        ResolveInfo resolveInfo0;
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.addCategory(bwxb.e());
        intent0.setPackage(s);
        try {
            List list0 = context0.getPackageManager().queryIntentActivities(intent0, 0);
        }
        catch(RuntimeException runtimeException0) {
            bwzd.p("PackageManager.queryIntentActivities threw an exception: %s", runtimeException0);
            if(bwts0 != null) {
                bwts0.p(9002);
            }
            return ggna.a;
        }
        gged_interceptors gged0 = ggna.a;
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ComponentName componentName0 = new ComponentName(((ResolveInfo)object0).activityInfo.applicationInfo.packageName, ((ResolveInfo)object0).activityInfo.name);
            bwwz bwwz0 = bwxb.a(context0.getPackageManager(), componentName0);
            if(bwwz0 != null) {
                String s1 = bwwz0.a;
                if(s1 != null) {
                    ggdy0.i(new bwxa(componentName0, s1));
                }
            }
        }
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object1 = ggqk0.next();
            ComponentName componentName1 = new ComponentName(((ResolveInfo)object1).serviceInfo.applicationInfo.packageName, ((ResolveInfo)object1).serviceInfo.name);
            PackageManager packageManager0 = context0.getPackageManager();
            Intent intent1 = new Intent("android.media.browse.MediaBrowserService");
            intent1.setComponent(componentName1);
            bwwz bwwz1 = null;
            try {
                List list1 = packageManager0.queryIntentServices(intent1, 0);
                if(!list1.isEmpty()) {
                    resolveInfo0 = (ResolveInfo)list1.get(0);
                    packageInfo0 = packageManager0.getPackageInfo(resolveInfo0.serviceInfo.packageName, 0);
                    goto label_38;
                }
            }
            catch(RuntimeException | PackageManager.NameNotFoundException exception0) {
                bwzd.p("PackageManager.queryIntentServices threw an exception: %s", exception0);
            }
            goto label_51;
        label_38:
            if(packageInfo0 != null) {
                bwwz1 = new bwwz();
                bwwz1.a = resolveInfo0.loadLabel(packageManager0).toString();
                bwwz1.c = componentName1;
                if(TextUtils.isEmpty(bwwz1.a)) {
                    bwwz1.a = componentName1.getClassName();
                }
                String s2 = bwxb.d(packageManager0, resolveInfo0.serviceInfo.applicationInfo, resolveInfo0.serviceInfo.getIconResource());
                if(s2 == null) {
                    s2 = "android.resource://android/drawable/sym_def_app_icon";
                }
                bwwz1.b = s2;
                bwwz1.d = packageInfo0.firstInstallTime;
                bwwz1.f = packageInfo0.lastUpdateTime;
                bwwz1.e = bwwt.a(componentName1);
            }
        label_51:
            if(bwwz1 != null) {
                String s3 = bwwz1.a;
                if(s3 != null) {
                    ggdy0.i(new bwxa(componentName1, s3));
                }
            }
        }
        return ggdy0.h();
    }

    public static gged_interceptors c(Context context0, bwts bwts0) {
        return bwxb.b(context0, null, bwts0);
    }

    static String d(PackageManager packageManager0, ApplicationInfo applicationInfo0, int v) {
        if(v != 0) {
            Uri uri0 = bwxb.h(packageManager0, applicationInfo0, v);
            return uri0 == null ? null : uri0.toString();
        }
        return null;
    }

    static String e() {
        boolean z1;
        boolean z = false;
        int v = (int)huar.a.d().x();
        Object object0 = bxgf.a;
        __monitor_enter(object0);
        try {
            if(bxgf.b != v) {
                try {
                    switch(v) {
                        case 1: {
                            bxgf.c = false;
                            goto label_39;
                        }
                        case 2: {
                            z1 = ((UiModeManager)AppContextProvider.a().getSystemService("uimode")).getCurrentModeType() == 4;
                            break;
                        }
                        case 3: {
                            Context context0 = AppContextProvider.a();
                            try {
                                context0.getPackageManager().getPackageInfo("com.google.android.katniss", 0);
                                bxgf.c = true;
                                z = true;
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                                bxgf.c = false;
                            }
                            goto label_39;
                        }
                        case 4: {
                            PackageManager packageManager0 = AppContextProvider.a().getPackageManager();
                            z1 = packageManager0.hasSystemFeature("com.google.android.tv") || packageManager0.hasSystemFeature("android.hardware.type.television") || packageManager0.hasSystemFeature("android.software.leanback");
                            break;
                        }
                        default: {
                            bxgf.c = false;
                            goto label_39;
                        }
                    }
                    bxgf.c = z1;
                    z = z1;
                    goto label_39;
                }
                catch(Exception unused_ex) {
                }
                bxgf.c = false;
                bwne.x();
                try {
                    new bwts(AppContextProvider.a()).p(10005);
                }
                catch(Exception unused_ex) {
                    bwne.x();
                }
                goto label_32;
            }
            goto label_45;
        }
        catch(Throwable throwable0) {
            goto label_36;
        }
        try {
        label_32:
            bxgf.b = v;
            bwne.n("Using %s flags by method %d", (bxgf.c ? "TV" : "regular"), Integer.valueOf(v));
            goto label_45;
        label_36:
            bxgf.b = v;
            bwne.n("Using %s flags by method %d", (bxgf.c ? "TV" : "regular"), Integer.valueOf(v));
            throw throwable0;
        label_39:
            bxgf.b = v;
            bwne.n("Using %s flags by method %d", (z ? "TV" : "regular"), Integer.valueOf(v));
        }
        catch(Throwable throwable1) {
            __monitor_exit(object0);
            throw throwable1;
        }
    label_45:
        __monitor_exit(object0);
        return bxgf.c ? "android.intent.category.LEANBACK_LAUNCHER" : "android.intent.category.LAUNCHER";
    }

    public static List f(Iterable iterable0) {
        List list0 = new ArrayList();
        ggqk ggqk0 = ((gged_interceptors)iterable0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            list0.add(((bwxa)object0).a);
        }
        return list0;
    }

    // This method was un-flattened
    public static Set g(elfg elfg0, bwts bwts0) {
        SearchResults searchResults0;
        Set set0 = new HashSet(100);
        int v = 0;
        while(true) {
            try {
                searchResults0 = (SearchResults)evrg.o(elfg0.b("", "com.google.android.gms", bwxb.c, v, 100, bwxb.b), 5L, TimeUnit.SECONDS);
            }
            catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                bwts0.p(9002);
                return null;
            }
            abwv abwv0 = new abwv(searchResults0);
            while(abwv0.hasNext()) {
                abwu abwu0 = abwv0.a();
                String s = abwu0.c("package_name");
                String s1 = abwu0.c("class_name");
                String s2 = abwu0.c("name");
                if(s != null && s1 != null && s2 != null) {
                    set0.add(new bwxa(new ComponentName(s, s1), s2));
                }
            }
            if(searchResults0.g < 100) {
                return set0;
            }
            v += 100;
            elfg0 = elfg0;
        }
    }

    private static Uri h(PackageManager packageManager0, ApplicationInfo applicationInfo0, int v) {
        try {
            Resources resources0 = packageManager0.getResourcesForApplication(applicationInfo0);
            String s = applicationInfo0.packageName;
            String s1 = resources0.getResourcePackageName(v);
            String s2 = resources0.getResourceTypeName(v);
            if(!hubu.a.b().d()) {
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
            bwzd.g(("Resources not found for " + applicationInfo0.packageName));
            return null;
        }
        catch(Resources.NotFoundException unused_ex) {
            bwzd.g(("Resource not found: " + v + " in " + applicationInfo0.packageName));
            return null;
        }
    }

    private static void i() {
        synchronized(bwxb.class) {
            bwke bwke0 = hubg.a.j().v();
            if(!bata.b(bwxb.d, bwke0)) {
                bwxb.d = bwke0;
                HashMap hashMap0 = new HashMap();
                for(Object object0: bwke0.b) {
                    hashMap0.put(((bwkd)object0).b, ((bwkd)object0));
                }
                bwxb.e = hashMap0;
            }
        }
    }
}

