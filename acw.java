import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class acw {
    private final Map a;
    public final Map b;
    public final List c;
    public final transient Map d;
    public final Map e;
    public final Bundle f;
    private final Map g;

    public acw() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.c = new ArrayList();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new Bundle();
    }

    public abstract void a(int arg1, adc arg2, Object arg3);

    public final acp b(String s, adc adc0, acn acn0) {
        ibuq.f(s, "key");
        this.j(s);
        acs acs0 = new acs(acn0, adc0);
        this.d.put(s, acs0);
        Map map0 = this.e;
        if(map0.containsKey(s)) {
            Object object0 = map0.get(s);
            map0.remove(s);
            acn0.jN(object0);
        }
        Bundle bundle0 = this.f;
        ActivityResult activityResult0 = (ActivityResult)jyt.a(bundle0, s, ActivityResult.class);
        if(activityResult0 != null) {
            bundle0.remove(s);
            acn0.jN(adc0.b(activityResult0.a, activityResult0.b));
        }
        return new acv(this, s, adc0);
    }

    public final acp c(String s, lps lps0, adc adc0, acn acn0) {
        ibuq.f(adc0, "contract");
        ibuq.f(acn0, "callback");
        lpg lpg0 = lps0.getLifecycle();
        if(lpg0.a().a(lpf.d)) {
            throw new IllegalStateException("LifecycleOwner " + lps0 + " is attempting to register while current state is " + lpg0.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        this.j(s);
        Map map0 = this.g;
        act act0 = (act)map0.get(s);
        if(act0 == null) {
            act0 = new act(lpg0);
        }
        acq acq0 = new acq(this, s, acn0, adc0);
        act0.a.c(acq0);
        act0.b.add(acq0);
        map0.put(s, act0);
        return new acu(this, s, adc0);
    }

    public final void d(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList arrayList1 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if(arrayList1 != null && arrayList0 != null) {
            ArrayList arrayList2 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if(arrayList2 != null) {
                this.c.addAll(arrayList2);
            }
            Bundle bundle1 = bundle0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if(bundle1 != null) {
                this.f.putAll(bundle1);
            }
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = (String)arrayList1.get(v1);
                Map map0 = this.b;
                if(map0.containsKey(s)) {
                    Integer integer0 = (Integer)map0.remove(s);
                    if(!this.f.containsKey(s)) {
                        ibvh.c(this.a).remove(integer0);
                    }
                }
                Object object0 = arrayList0.get(v1);
                ibuq.e(object0, "get(...)");
                int v2 = ((Number)object0).intValue();
                Object object1 = arrayList1.get(v1);
                ibuq.e(object1, "get(...)");
                this.i(v2, ((String)object1));
            }
        }
    }

    public final void e(Bundle bundle0) {
        bundle0.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.values()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.keySet()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.c));
        bundle0.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f));
    }

    public final void f(String s) {
        ibuq.f(s, "key");
        if(!this.c.contains(s)) {
            Integer integer0 = (Integer)this.b.remove(s);
            if(integer0 != null) {
                this.a.remove(integer0);
            }
        }
        this.d.remove(s);
        Map map0 = this.e;
        if(map0.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + map0.get(s));
            map0.remove(s);
        }
        Bundle bundle0 = this.f;
        if(bundle0.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + ((ActivityResult)jyt.a(bundle0, s, ActivityResult.class)));
            bundle0.remove(s);
        }
        Map map1 = this.g;
        act act0 = (act)map1.get(s);
        if(act0 != null) {
            List list0 = act0.b;
            for(Object object0: list0) {
                act0.a.d(((lpp)object0));
            }
            list0.clear();
            map1.remove(s);
        }
    }

    public final boolean g(int v, int v1, Intent intent0) {
        String s = (String)this.a.get(Integer.valueOf(v));
        if(s == null) {
            return false;
        }
        acs acs0 = (acs)this.d.get(s);
        if((acs0 == null ? null : acs0.a) != null) {
            List list0 = this.c;
            if(list0.contains(s)) {
                Object object0 = acs0.b.b(v1, intent0);
                acs0.a.jN(object0);
                list0.remove(s);
                return true;
            }
        }
        this.e.remove(s);
        ActivityResult activityResult0 = new ActivityResult(v1, intent0);
        this.f.putParcelable(s, activityResult0);
        return true;
    }

    public final void h(int v, Object object0) {
        String s = (String)this.a.get(Integer.valueOf(v));
        if(s != null) {
            acs acs0 = (acs)this.d.get(s);
            if((acs0 == null ? null : acs0.a) == null) {
                goto label_9;
            }
            acn acn0 = acs0.a;
            ibuq.d(acn0, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
            if(this.c.remove(s)) {
                acn0.jN(object0);
                return;
            label_9:
                this.f.remove(s);
                this.e.put(s, object0);
            }
        }
    }

    private final void i(int v, String s) {
        Integer integer0 = v;
        this.a.put(integer0, s);
        this.b.put(s, integer0);
    }

    private final void j(String s) {
        if(((Integer)this.b.get(s)) == null) {
            Iterator iterator0 = ibxv.e(new acr()).a();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Number number0 = (Number)object0;
                int v = number0.intValue();
                if(!this.a.containsKey(Integer.valueOf(v))) {
                    this.i(number0.intValue(), s);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }
}

