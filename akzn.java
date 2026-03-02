import android.util.SparseArray;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class akzn {
    public static final baun a;
    public final Map b;
    public final Object c;
    public String d;
    private static akzn e;
    private final Set f;
    private final aliu g;

    static {
        akzn.a = new baun("ProximityAuth", new String[]{"RemoteDeviceRegistry"});
    }

    public akzn() {
        this.b = new LinkedHashMap();
        this.c = new Object();
        this.f = new HashSet();
        this.g = new aliu();
        gmbu.t(new bblp(1, 10).e(new akzj()), new akzk(this), gmap.a);
    }

    public final int a() {
        int v1;
        synchronized(this.c) {
            v1 = 0;
            for(Object object1: this.b.values()) {
                for(Object object2: ((akzm)object1).c.values()) {
                    v1 |= (int)(((Integer)object2));
                }
            }
        }
        return v1;
    }

    public final RemoteDevice b(String s) {
        akzm akzm0;
        synchronized(this.c) {
            akzm0 = (akzm)this.b.get(s);
            if(akzm0 == null) {
                return null;
            }
        }
        return akzm0.a;
    }

    public static akzn c() {
        synchronized(akzn.class) {
            if(akzn.e == null) {
                akzn.e = new akzn();
            }
        }
        return akzn.e;
    }

    public final akzu d(String s, int v) {
        akzm akzm0;
        synchronized(this.c) {
            akzm0 = (akzm)this.b.get(s);
            if(akzm0 == null) {
                return null;
            }
        }
        return (akzu)akzm0.d.get(v, null);
    }

    public final List e() {
        List list0;
        synchronized(this.c) {
            Map map0 = this.b;
            list0 = new ArrayList(map0.size());
            for(Object object1: map0.keySet()) {
                list0.add(((akzm)map0.get(((String)object1))).a);
            }
        }
        return list0;
    }

    public final Set f(String s) {
        Set set0;
        synchronized(this.c) {
            akzm akzm0 = (akzm)this.b.get(s);
            if(akzm0 == null) {
                return new HashSet();
            }
            set0 = new HashSet();
            for(Object object1: akzm0.c.entrySet()) {
                set0.add(new Role(((String)((Map.Entry)object1).getKey()), ((int)(((Integer)((Map.Entry)object1).getValue())))));
            }
        }
        return set0;
    }

    public final void g(RemoteDevice remoteDevice0, Role role0) {
        int v = role0.c;
        batl.l(Role.f(v));
        synchronized(this.c) {
            String s = remoteDevice0.b;
            Map map0 = this.b;
            if(!map0.containsKey(s)) {
                map0.put(s, new akzm(remoteDevice0));
            }
            akzm akzm0 = (akzm)map0.get(s);
            akzm0.a = remoteDevice0;
            Map map1 = akzm0.c;
            String s1 = role0.b;
            Integer integer0 = (Integer)map1.get(s1);
            if(integer0 == null) {
                integer0 = (int)0;
            }
            int v2 = ((int)integer0) & v ^ v;
            map1.put(s1, Integer.valueOf(v | ((int)integer0)));
            akzn.a.h("Registered device ID %s, entry=%s", new Object[]{remoteDevice0.b(), akzm0});
        }
        if(v2 > 0) {
            for(Object object1: this.f) {
                ((akzl)object1).a();
            }
            aliu aliu0 = this.g;
            if(hpzi.g()) {
                if(Role.c(v2)) {
                    aliu0.b("register_ble_peripheral_background_device_count");
                }
                if(Role.d(v2)) {
                    aliu0.b("register_ble_peripheral_foreground_device_count");
                }
                aliu0.c();
            }
        }
    }

    public final void h(String s, Role role0) {
        int v = role0.c;
        batl.l(Role.f(v));
        Object object0 = this.c;
        String s1 = role0.b;
        synchronized(object0) {
            Map map0 = this.b;
            akzm akzm0 = (akzm)map0.get(s);
            if(akzm0 == null) {
                akzn.a.m("Can\'t find entry for device ID %s", new Object[]{akwe.a(s)});
                return;
            }
            Map map1 = akzm0.c;
            Integer integer0 = (Integer)map1.get(s1);
            if(integer0 == null) {
                akzn.a.m("No connection modes found for feature %s on device with ID %s", new Object[]{s1, akwe.a(s)});
                return;
            }
            int v2 = v & ((int)integer0);
            int v3 = ((int)integer0) - v2;
            Integer integer1 = v3;
            integer1.getClass();
            if(v3 == 0) {
                map1.remove(s1);
                if(map1.isEmpty()) {
                    map0.remove(s);
                }
            }
            else {
                map1.put(s1, integer1);
            }
            int v5 = 0;
            for(Object object1: map1.keySet()) {
                v5 |= (int)(((Integer)map1.get(((String)object1))));
            }
            for(int v4 = 0; true; ++v4) {
                SparseArray sparseArray0 = akzm0.d;
                if(v4 >= sparseArray0.size()) {
                    break;
                }
                int v6 = sparseArray0.keyAt(v4);
                if(!Role.g(v5, v6)) {
                    akzu akzu0 = (akzu)sparseArray0.get(v6);
                    if(akzu0.b() != 0) {
                        akzu0.g();
                    }
                }
            }
            akzn.a.h("Unregistered device with ID %s for role %s", new Object[]{akwe.a(s), role0});
        }
        if(v2 > 0) {
            for(Object object2: this.f) {
                ((akzl)object2).b();
            }
        }
    }

    public final boolean i(String s, int v) {
        boolean z;
        synchronized(this.c) {
            akzm akzm0 = (akzm)this.b.get(s);
            z = false;
            if(akzm0 == null) {
                return false;
            }
            akzu akzu0 = (akzu)akzm0.d.get(v);
            if(akzu0 != null && akzu0.b() == 3) {
                z = true;
            }
        }
        return z;
    }
}

