import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class bwqx {
    public final Context a;
    public final bxax b;
    public final bwts c;

    public bwqx(Context context0, bxax bxax0, bwts bwts0) {
        this.a = context0;
        this.b = bxax0;
        this.c = bwts0;
    }

    public static Intent a(String s) {
        return bwqx.f().setPackage(s);
    }

    public static Set b(Context context0) {
        Set set0 = new HashSet();
        Intent intent0 = bwqx.f();
        for(Object object0: bwqx.g(context0.getPackageManager().queryIntentServices(intent0, 0))) {
            ResolveInfo resolveInfo0 = (ResolveInfo)object0;
            if(resolveInfo0 == null) {
                bwne.s("Missing resolveInfo");
            }
            else {
                ServiceInfo serviceInfo0 = resolveInfo0.serviceInfo;
                if(serviceInfo0 == null) {
                    bwne.s("Missing serviceInfo");
                }
                else {
                    String s = serviceInfo0.packageName;
                    if(s == null) {
                        bwne.s("Missing packageName");
                    }
                    else {
                        set0.add(s);
                    }
                }
            }
        }
        for(Object object1: bwqx.g(context0.getPackageManager().queryBroadcastReceivers(intent0, 0))) {
            ResolveInfo resolveInfo1 = (ResolveInfo)object1;
            if(resolveInfo1 == null) {
                bwne.s("Missing resolveInfo");
            }
            else {
                ActivityInfo activityInfo0 = resolveInfo1.activityInfo;
                if(activityInfo0 == null) {
                    bwne.s("Missing activityInfo");
                }
                else {
                    String s1 = activityInfo0.packageName;
                    if(s1 == null) {
                        bwne.s("Missing packageName");
                    }
                    else {
                        set0.add(s1);
                    }
                }
            }
        }
        set0.add("com.google.android.gms");
        return set0;
    }

    public static boolean c(Context context0, Intent intent0) {
        return !bwqx.g(context0.getPackageManager().queryBroadcastReceivers(intent0, 0)).isEmpty();
    }

    public static boolean d(Context context0, Intent intent0) {
        return !bwqx.g(context0.getPackageManager().queryIntentServices(intent0, 0)).isEmpty();
    }

    public final boolean e(String s, long v, glrw glrw0, boolean z) {
        glru glru0;
        Context context0;
        try {
            context0 = this.a;
            if(bbna.e(context0, s)) {
                glru0 = glru.d;
            }
            else if(context0.getPackageManager().getPackageInfo(s, 0).applicationInfo.enabled) {
                goto label_9;
            }
            else {
                glru0 = glru.e;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            glru0 = glru.f;
        }
        goto label_49;
    label_9:
        if(bwtj.d(context0, s)) {
            int v1 = z || this.b.d(s) == 0L ? 1 : 2;
            Intent intent0 = bwqx.a(s);
            intent0.putExtra("com.google.firebase.appindexing.extra.REASON", v1);
            if("com.google.android.gms".equals(s)) {
                try {
                    context0.sendBroadcast(intent0);
                }
                catch(RuntimeException unused_ex) {
                    huax.h();
                    bwne.x();
                }
                goto label_40;
            }
            else {
                Context context1 = this.a;
                if(bwqx.c(context1, intent0)) {
                    try {
                        context1.sendBroadcast(intent0);
                        glru0 = glru.k;
                    }
                    catch(RuntimeException unused_ex) {
                        huax.h();
                        bwne.x();
                        goto label_28;
                    }
                }
                else {
                label_28:
                    if(hubu.a.b().m()) {
                        try {
                            this.a.getPackageManager().getPackageInfo(s, 0);
                        }
                        catch(PackageManager.NameNotFoundException unused_ex) {
                            huax.h();
                            bwne.x();
                            glru0 = glru.f;
                            goto label_49;
                        }
                        glru0 = glru.j;
                    }
                    else {
                        try {
                            if(this.a.startService(intent0) == null) {
                                glru0 = glru.g;
                            }
                            else {
                            label_40:
                                glru0 = glru.b;
                            }
                        }
                        catch(SecurityException unused_ex) {
                            glru0 = glru.h;
                        }
                        catch(IllegalStateException unused_ex) {
                            glru0 = glru.j;
                        }
                        catch(RuntimeException unused_ex) {
                            huax.h();
                            bwne.x();
                            glru0 = glru.l;
                        }
                    }
                }
            }
        }
        else {
            glru0 = glru.c;
        }
    label_49:
        bwne.c("Sending UPDATE_INDEX: package=%s source=%s result=%s", new Object[]{s, glrw0, glru0});
        this.c.f(s, glrw0, glru0);
        if(glru0 != glru.b && glru0 != glru.k) {
            return false;
        }
        bxax bxax0 = this.b;
        synchronized(bxax0.h) {
            bwpo bwpo0 = bxax0.l(s);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)bwpo0));
            ProtoLiteMessage hftv0 = hftp0.b_message;
            if(v != ((bwpo)hftv0).n) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpo bwpo1 = (bwpo)hftp0.b_message;
                bwpo1.b |= 0x800;
                bwpo1.n = v;
                bxax0.A(s, ((bwpo)hftp0.N_build()));
            }
        }
        return true;
    }

    private static Intent f() {
        return new Intent().setAction("com.google.firebase.appindexing.UPDATE_INDEX");
    }

    private static List g(List list0) {
        return list0 == null ? Collections.EMPTY_LIST : list0;
    }
}

