import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class ayv implements bks {
    public final Object a;
    public final List b;
    public Map c;
    public Set d;
    public final List e;
    public int f;
    private final awt g;

    public ayv(awt awt0) {
        this.a = new Object();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = 0;
        this.g = awt0;
        this.b = new ArrayList();
        try {
            this.a(Arrays.asList(awt0.f()));
        }
        catch(awl | bjg exception0) {
            bcs.b("Camera2CameraCoordinator", "Failed to get concurrent camera ids", exception0);
        }
    }

    @Override  // bks
    public final void a(List list0) {
        HashMap hashMap0 = new HashMap();
        HashSet hashSet0 = new HashSet();
        try {
            awt awt0 = this.g;
            for(Object object0: awt0.a.c()) {
                Set set0 = (Set)object0;
                if(list0.containsAll(set0)) {
                    ArrayList arrayList0 = new ArrayList(set0);
                    if(arrayList0.size() >= 2) {
                        String s = (String)arrayList0.get(0);
                        String s1 = (String)arrayList0.get(1);
                        try {
                            if(!asx.a(awt0, s) || !asx.a(awt0, s1)) {
                                continue;
                            }
                            hashSet0.add(new HashSet(Arrays.asList(new String[]{s, s1})));
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            ((List)hashMap0.get(s)).add(s1);
                            if(!hashMap0.containsKey(s1)) {
                                hashMap0.put(s1, new ArrayList());
                            }
                            ((List)hashMap0.get(s1)).add(s);
                        }
                        catch(bcr unused_ex) {
                            bcs.h("Camera2CameraCoordinator");
                        }
                    }
                }
            }
        }
        catch(awl awl0) {
            throw new bjg("Failed to retrieve concurrent camera id info.", awl0);
        }
        synchronized(this.a) {
            this.c = hashMap0;
            this.d = hashSet0;
            Objects.toString(this.c);
            bcs.h("Camera2CameraCoordinator");
        }
    }

    public final void b() {
        synchronized(this.a) {
        }
    }

    public final void c(String s) {
        synchronized(this.a) {
            if(!this.c.containsKey(s)) {
                return;
            }
            List list0 = (List)this.c.get(s);
            if(list0 == null) {
                return;
            }
            for(Object object1: list0) {
                String s1 = (String)object1;
                for(Object object2: this.e) {
                    azz azz0 = (azz)object2;
                    if(!(azz0 instanceof asj)) {
                        bik bik0 = ((bik)azz0).f();
                        kay.b(bik0 instanceof aqj, "CameraInfo doesn\'t contain Camera2 implementation.");
                        azd azd0 = ((aqj)bik0).c;
                        if((azz0 instanceof bhi)) {
                            bmc bmc0 = ((bhi)azz0).a;
                            if(bmc0 != null) {
                                bmc0.k();
                                azd0 = new azd(azd0.a);
                            }
                        }
                        if(!s1.equals(azd0.a.a)) {
                            continue;
                        }
                        return;
                    }
                    asj asj0 = (asj)azz0;
                    throw null;
                }
            }
        }
    }
}

