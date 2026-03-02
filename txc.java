import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.GeneratedAppGlideModule;
import j..util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class txc implements ComponentCallbacks2 {
    public final udm a;
    public final uek b;
    public final txj c;
    public final unr d;
    public final List e;
    public final ues f;
    public final uni g;
    private static volatile txc h;
    private static volatile boolean i;
    private final ufj j;

    public txc(Context context0, udm udm0, ufj ufj0, uek uek0, ues ues0, unr unr0, uni uni0, Map map0, List list0, List list1, txl txl0) {
        this.e = new ArrayList();
        this.a = udm0;
        this.b = uek0;
        this.f = ues0;
        this.j = ufj0;
        this.d = unr0;
        this.g = uni0;
        this.c = new txj(context0, ues0, new txu(this, list1), new upj(), map0, list0, udm0, txl0);
    }

    public final Context a() {
        return this.c.getBaseContext();
    }

    public static txc b(Context context0) {
        if(txc.h == null) {
            GeneratedAppGlideModule generatedAppGlideModule0 = txc.g(context0.getApplicationContext());
            Class class0 = txc.class;
            synchronized(class0) {
                if(txc.h == null) {
                    if(txc.i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    txc.i = true;
                    try {
                        txi txi0 = new txi();
                        Context context1 = context0.getApplicationContext();
                        ArrayList arrayList0 = new ArrayList();
                        try {
                            ApplicationInfo applicationInfo0 = context1.getPackageManager().getApplicationInfo("com.google.android.gms", 0x80);
                            if(applicationInfo0 != null && applicationInfo0.metaData != null) {
                                Iterator iterator0 = applicationInfo0.metaData.keySet().iterator();
                                while(true) {
                                    if(!iterator0.hasNext()) {
                                        goto label_25;
                                    }
                                    Object object0 = iterator0.next();
                                    String s = (String)object0;
                                    if("GlideModule".equals(applicationInfo0.metaData.get(s))) {
                                        arrayList0.add(uof.a(s));
                                    }
                                }
                            }
                            else {
                                goto label_25;
                            }
                            goto label_33;
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            if(!Log.isLoggable("ManifestParser", 6)) {
                                goto label_25;
                            }
                            Log.e("ManifestParser", "Failed to parse glide modules", packageManager$NameNotFoundException0);
                        }
                    label_25:
                        if(generatedAppGlideModule0 != null && !new HashSet().isEmpty()) {
                            HashSet hashSet0 = new HashSet();
                            Iterator iterator1 = arrayList0.iterator();
                            while(iterator1.hasNext()) {
                                Object object1 = iterator1.next();
                                if(hashSet0.contains(((uod)object1).getClass())) {
                                    iterator1.remove();
                                }
                            }
                        }
                    label_33:
                        for(Object object2: arrayList0) {
                            ((uod)object2).a();
                        }
                        if(txi0.f == null) {
                            ufq ufq0 = new ufq(false);
                            ufq0.b(ufv.a());
                            ufq0.a = "source";
                            txi0.f = ufq0.a();
                        }
                        if(txi0.g == null) {
                            ufq ufq1 = new ufq(true);
                            ufq1.b(1);
                            ufq1.a = "disk-cache";
                            txi0.g = ufq1.a();
                        }
                        if(txi0.i == null) {
                            int v2 = ufv.a() < 4 ? 1 : 2;
                            ufq ufq2 = new ufq(true);
                            ufq2.b(v2);
                            ufq2.a = "animation";
                            txi0.i = ufq2.a();
                        }
                        if(txi0.h == null) {
                            txi0.h = new ufm(new ufk(context1));
                        }
                        if(txi0.m == null) {
                            txi0.m = new uni();
                        }
                        if(txi0.d == null) {
                            int v3 = txi0.h.a;
                            txi0.d = v3 > 0 ? new uet(((long)v3)) : new uel();
                        }
                        if(txi0.k == null) {
                            txi0.k = new ues(txi0.h.c);
                        }
                        if(txi0.e == null) {
                            txi0.e = new ufi(((long)txi0.h.b));
                        }
                        if(txi0.l == null) {
                            txi0.l = new uff(context1);
                        }
                        if(txi0.c == null) {
                            ufj ufj0 = txi0.e;
                            uff uff0 = txi0.l;
                            ufv ufv0 = txi0.g;
                            ufv ufv1 = txi0.f;
                            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                            SynchronousQueue synchronousQueue0 = new SynchronousQueue();
                            ufu ufu0 = new ufu(new ufs(), "source-unlimited", false);
                            txi0.c = new udm(ufj0, uff0, ufv0, ufv1, new ufv(new ThreadPoolExecutor(0, 0x7FFFFFFF, ufv.a, timeUnit0, synchronousQueue0, ufu0)), txi0.i);
                        }
                        List list0 = txi0.j;
                        txi0.j = list0 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list0);
                        txl txl0 = new txl(txi0.b);
                        unr unr0 = new unr();
                        txc txc0 = new txc(context1, txi0.c, txi0.e, txi0.d, txi0.k, unr0, txi0.m, txi0.a, txi0.j, arrayList0, txl0);
                        context1.registerComponentCallbacks(txc0);
                        txc.h = txc0;
                    }
                    finally {
                        txc.i = false;
                    }
                    return txc.h;
                }
            }
            return txc.h;
        }
        return txc.h;
    }

    public final txt c() {
        return this.c.a();
    }

    public static tyb d(Context context0) {
        return txc.f(context0).b(context0);
    }

    public static tyb e(View view0) {
        unr unr0 = txc.f(view0.getContext());
        if(uqq.k()) {
            return unr0.b(view0.getContext().getApplicationContext());
        }
        uqo.f(view0);
        uqo.e(view0.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activity0 = unr.a(view0.getContext());
        if(activity0 == null) {
            return unr0.b(view0.getContext().getApplicationContext());
        }
        if((activity0 instanceof ea)) {
            bxd bxd0 = unr0.a;
            bxd0.clear();
            unr.e(((ea)activity0).getSupportFragmentManager().o(), bxd0);
            View view1 = ((ea)activity0).findViewById(0x1020002);
            du du0 = null;
            while(!view0.equals(view1)) {
                du0 = (du)bxd0.get(view0);
                if(du0 != null || !(view0.getParent() instanceof View)) {
                    break;
                }
                view0 = (View)view0.getParent();
            }
            bxd0.clear();
            return du0 == null ? unr0.d(((ea)activity0)) : unr0.c(du0);
        }
        return unr0.b(view0.getContext().getApplicationContext());
    }

    public static unr f(Context context0) {
        uqo.e(context0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return txc.b(context0).d;
    }

    private static GeneratedAppGlideModule g(Context context0) {
        try {
            return (GeneratedAppGlideModule)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context0.getApplicationContext());
        }
        catch(ClassNotFoundException unused_ex) {
            if(!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        }
        catch(InstantiationException instantiationException0) {
            txc.h(instantiationException0);
            return null;
        }
        catch(IllegalAccessException illegalAccessException0) {
            txc.h(illegalAccessException0);
            return null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            txc.h(noSuchMethodException0);
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            txc.h(invocationTargetException0);
            return null;
        }
    }

    private static void h(Exception exception0) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exception0);
    }

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
        uqq.h();
        this.j.e();
        this.b.c();
        this.f.b();
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        uqq.h();
        List list0 = this.e;
        synchronized(list0) {
            for(Object object0: list0) {
                tyb tyb0 = (tyb)object0;
            }
        }
        ufj ufj0 = this.j;
        if(v >= 40) {
            ((uql)ufj0).e();
        }
        else if(v >= 20) {
            ((uql)ufj0).j(((uql)ufj0).f() / 2L);
        }
        else if(v == 15) {
            v = 15;
            ((uql)ufj0).j(((uql)ufj0).f() / 2L);
        }
        this.b.e(v);
        this.f.d(v);
    }
}

