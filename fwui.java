import android.os.Build;
import android.os.RemoteException;
import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionProvider;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

@Deprecated
public final class fwui implements fwyt {
    public static final Map a;
    public static final Map b;
    public final fwzp c;
    private static fwus d;
    private static final List e;
    private ActivityRecognitionProvider f;
    private final fwuh g;
    private boolean h;
    private Boolean i;
    private final fvwz j;
    private final Map k;

    static {
        fwui.e = Arrays.asList(new String[]{"angler", "bullhead", "marlin", "sailfish", "swordfish"});
        HashMap hashMap0 = new HashMap();
        fwui.a = hashMap0;
        Integer integer0 = (int)0;
        hashMap0.put("android.activity_recognition.in_vehicle", integer0);
        Integer integer1 = (int)1;
        hashMap0.put("android.activity_recognition.on_bicycle", integer1);
        hashMap0.put("android.activity_recognition.still", Integer.valueOf(3));
        hashMap0.put("android.activity_recognition.tilting", Integer.valueOf(5));
        hashMap0.put("android.activity_recognition.walking", Integer.valueOf(7));
        hashMap0.put("android.activity_recognition.running", Integer.valueOf(8));
        HashMap hashMap1 = new HashMap();
        fwui.b = hashMap1;
        hashMap1.put(integer1, integer0);
        hashMap1.put(Integer.valueOf(2), integer1);
    }

    public fwui(fwzp fwzp0, fvwz fvwz0) {
        this.f = null;
        this.g = new fwuh(this);
        this.h = false;
        this.k = new TreeMap(ActivityTransitionRequest.a);
        this.c = fwzp0;
        this.j = fvwz0;
    }

    @Override  // fwyt
    public final int a() {
        return -1;
    }

    public static fwus b() {
        synchronized(fwui.class) {
            if(fwui.d == null) {
                fwus fwus0 = fwwn.h().b();
                fwui.d = fwus0;
                fwus0.getClass();
            }
        }
        return fwui.d;
    }

    @Override  // fwyt
    public final void c(fwyn fwyn0) {
        if(!huou.f()) {
            List list0 = this.g.a;
            if(!list0.contains(fwyn0)) {
                list0.add(fwyn0);
            }
        }
    }

    @Override  // fwyt
    public final void d() {
        if(huou.f()) {
            this.h = false;
            return;
        }
        if(huou.d()) {
            huou.d();
            return;
        }
        this.j.g(65);
        ActivityRecognitionProvider activityRecognitionProvider0 = this.f;
        if(activityRecognitionProvider0 != null) {
            if(this.h) {
                activityRecognitionProvider0.unregisterSink(this.g);
                this.h = false;
            }
            this.k.clear();
            for(Object object0: fwui.a.keySet()) {
                String s = (String)object0;
                for(Object object1: fwui.b.keySet()) {
                    int v = (int)(((Integer)object1));
                    try {
                        this.f.disableActivityEvent(s, v);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
            }
        }
    }

    @Override  // fwyt
    public final void e(Boolean boolean0, Boolean boolean1) {
    }

    @Override  // fwyt
    public final boolean f() {
        if(!huou.f()) {
            Boolean boolean0 = this.i;
            if(boolean0 != null) {
                return boolean0.booleanValue();
            }
            if(humf.a.b().e() && fwui.e.contains(Build.DEVICE)) {
                if(this.f != null) {
                    goto label_9;
                }
                ActivityRecognitionProvider activityRecognitionProvider0 = fwui.b().b();
                this.f = activityRecognitionProvider0;
                if(activityRecognitionProvider0 != null) {
                    try {
                    label_9:
                        for(Object object0: fwui.a.keySet()) {
                            if(!this.f.isActivitySupported(((String)object0))) {
                                this.i = Boolean.valueOf(false);
                                return false;
                            }
                        }
                        this.i = Boolean.valueOf(true);
                        return true;
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
            }
        }
        return false;
    }

    @Override  // fwyt
    public final boolean g(fwyo fwyo0) {
        if(!huou.f()) {
            ActivityRecognitionProvider activityRecognitionProvider0 = this.f;
            if(activityRecognitionProvider0 != null) {
                if(this.h) {
                    boolean z = this.m(fwyo0);
                    this.h = z;
                    return z;
                }
                activityRecognitionProvider0.registerSink(this.g);
                this.k.clear();
                if(this.m(fwyo0)) {
                    this.j.g(0x40);
                    this.h = true;
                    return true;
                }
            }
        }
        this.h = false;
        return false;
    }

    @Override  // fwyt
    public final boolean h() {
        return huou.f() ? false : this.h;
    }

    @Override  // fwyt
    public final boolean i() {
        return true;
    }

    @Override  // fwyt
    public final void j() {
        if(!huou.f()) {
            if(humr.a.f().t()) {
                ActivityChangedEvent activityChangedEvent0 = new ActivityChangedEvent(Collections.EMPTY_LIST);
                this.g.onActivityChanged(activityChangedEvent0);
                return;
            }
            try {
                this.f.flush();
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    private static final Integer k(int v) {
        for(Object object0: fwui.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((int)(((Integer)map$Entry0.getValue()))) == v) {
                return (Integer)map$Entry0.getKey();
            }
        }
        return null;
    }

    private static final String l(int v) {
        for(Object object0: fwui.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((int)(((Integer)map$Entry0.getValue()))) == v) {
                return (String)map$Entry0.getKey();
            }
        }
        return null;
    }

    private final boolean m(fwyo fwyo0) {
        TreeMap treeMap0 = new TreeMap(ActivityTransitionRequest.a);
        int[] arr_v = fwyt.n;
        for(int v = 0; v < 6; ++v) {
            if(fwui.a.containsValue(Integer.valueOf(arr_v[v]))) {
                for(int v1 = 0; v1 <= 1; ++v1) {
                    cmms cmms0 = new cmms();
                    cmms0.a = arr_v[v];
                    cmms0.b(v1);
                    ActivityTransition activityTransition0 = cmms0.a();
                    Map map0 = fwyo0.a;
                    if(map0 != null && map0.containsKey(activityTransition0)) {
                        treeMap0.put(activityTransition0, ((Integer)map0.get(activityTransition0)));
                    }
                    else {
                        treeMap0.put(activityTransition0, Integer.valueOf(0x7FFFFFFF));
                    }
                }
            }
        }
        if(!this.h) {
            return false;
        }
        Map map1 = this.k;
        if(map1.equals(treeMap0)) {
            return true;
        }
        map1.keySet().removeAll(treeMap0.keySet());
        if(!map1.isEmpty()) {
            for(Object object0: map1.keySet()) {
                String s = fwui.l(((ActivityTransition)object0).a);
                Integer integer0 = fwui.k(((ActivityTransition)object0).b);
                if(s != null && integer0 != null) {
                    goto label_33;
                }
                continue;
                try {
                label_33:
                    this.f.disableActivityEvent(s, integer0.intValue());
                }
                catch(RemoteException unused_ex) {
                    this.d();
                    return false;
                }
            }
        }
        map1.clear();
        map1.putAll(treeMap0);
        for(Object object1: map1.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            try {
                ActivityTransition activityTransition1 = (ActivityTransition)map$Entry0.getKey();
                String s1 = fwui.l(activityTransition1.a);
                Integer integer1 = fwui.k(activityTransition1.b);
                if(s1 != null && integer1 != null) {
                    long v2 = (long)(((int)(((Integer)map$Entry0.getValue()))));
                    if(this.f.enableActivityEvent(s1, integer1.intValue(), v2 * 1000000L)) {
                        continue;
                    }
                    this.d();
                    return false;
                }
                else {
                    map$Entry0.getKey();
                    continue;
                }
                break;
            }
            catch(RemoteException unused_ex) {
                this.d();
                return false;
            }
        }
        return true;
    }
}

