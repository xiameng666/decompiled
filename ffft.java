import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ffft {
    public final Map a;
    public final boolean b;
    public final fdpl c;
    public final boolean d;
    public final int e;
    public volatile boolean f;
    private final Context g;
    private final Set h;
    private final fffp i;

    public ffft(Context context0, fffp fffp0, fdpl fdpl0) {
        this.h = new HashSet();
        this.a = new HashMap();
        this.g = context0;
        this.c = fdpl0;
        this.i = fffp0;
        Intent intent0 = new Intent("com.google.android.gms.wearable.BIND_LISTENER").setPackage(fdpl0.c);
        List list0 = context0.getPackageManager().queryIntentServices(intent0, 0);
        if(list0 != null) {
            for(Object object0: list0) {
                fffu fffu0 = this.c(((ResolveInfo)object0).serviceInfo.name, fffp0, null);
                this.h.add(fffu0);
            }
        }
        this.d = ffms.a.a(fdpl0.b);
        this.e = 36;
        this.b = ffgm.n(context0, fdpl0.c, this.d);
        this.f = bbna.e(context0, fdpl0.c);
    }

    public final Set a(Intent intent0) {
        if(intent0 == null) {
            return this.h;
        }
        Set set0 = new HashSet(this.h);
        Intent intent1 = intent0.getPackage() == null ? new Intent(intent0).setPackage(this.c.c) : intent0;
        List list0 = this.g.getPackageManager().queryIntentServices(intent1, 0);
        if(list0 != null) {
            for(Object object0: list0) {
                set0.add(this.c(((ResolveInfo)object0).serviceInfo.name, this.i, intent0));
            }
        }
        return set0;
    }

    public final void b(Context context0) {
        Map map0 = this.a;
        synchronized(map0) {
            for(Object object0: map0.values()) {
                fffu fffu0 = (fffu)object0;
                if(hzzu.a.b().c()) {
                    fffp fffp0 = this.i;
                    if(!fffp0.c) {
                        fffp0.b(fffu0, 4).sendToTarget();
                        continue;
                    }
                }
                fffu0.e(context0);
            }
        }
    }

    private final fffu c(String s, fffp fffp0, Intent intent0) {
        fffu fffu0;
        Map map0 = this.a;
        synchronized(map0) {
            fffu0 = (fffu)map0.get(s);
            if(fffu0 == null) {
                fffu0 = new fffu(this, s, fffp0);
                map0.put(s, fffu0);
            }
            if(intent0 != null && intent0.getAction() != null && fffu0.i == null) {
                String s1 = intent0.getAction();
                if(fffu.a.contains(s1)) {
                    fffu0.i = new Intent(intent0);
                    fffu0.i.setComponent(fffu0.e);
                }
            }
        }
        return fffu0;
    }
}

