import com.google.android.gms.chromesync.zeroparty.CrossUserSharingPrivateKey;
import java.util.Iterator;

public final class bdbr {
    private final azts a;

    public bdbr(azts azts0) {
        this.a = azts0;
    }

    public static Object a(bdbr bdbr0, ibrl ibrl0) {
        bdbp bdbp0;
        if((ibrl0 instanceof bdbp)) {
            bdbp0 = (bdbp)ibrl0;
            int v = bdbp0.c;
            if((v & 0x80000000) == 0) {
                bdbp0 = new bdbp(bdbr0, ibrl0);
            }
            else {
                bdbp0.c = v - 0x80000000;
            }
        }
        else {
            bdbp0 = new bdbp(bdbr0, ibrl0);
        }
        Object object0 = bdbp0.a;
        Object object1 = ibrx.a;
        switch(bdbp0.c) {
            case 0: {
                ibnx.b(object0);
                bdbp0.c = 1;
                object0 = bdbr0.c(bdbp0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Iterator iterator0 = ((Iterable)object0).iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object2 = iterator0.next();
        if(iterator0.hasNext()) {
            for(int v1 = ((CrossUserSharingPrivateKey)object2).a; true; v1 = v1 >= v2 ? v1 : v2) {
                Object object3 = iterator0.next();
                int v2 = ((CrossUserSharingPrivateKey)object3).a;
                if(v1 < v2) {
                    object2 = object3;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
        return object2;
    }

    public static Object b(bdbr bdbr0, int v, ibrl ibrl0) {
        bdbq bdbq0;
        if((ibrl0 instanceof bdbq)) {
            bdbq0 = (bdbq)ibrl0;
            int v1 = bdbq0.d;
            if((v1 & 0x80000000) == 0) {
                bdbq0 = new bdbq(bdbr0, ibrl0);
            }
            else {
                bdbq0.d = v1 - 0x80000000;
            }
        }
        else {
            bdbq0 = new bdbq(bdbr0, ibrl0);
        }
        Object object0 = bdbq0.b;
        Object object1 = ibrx.a;
        switch(bdbq0.d) {
            case 0: {
                ibnx.b(object0);
                bdbq0.a = v;
                bdbq0.d = 1;
                object0 = bdbr0.c(bdbq0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v = bdbq0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        for(Object object2: ((Iterable)object0)) {
            if(((CrossUserSharingPrivateKey)object2).a == v) {
                return object2;
            }
        }
        return null;
    }

    private final Object c(ibrl ibrl0) {
        azzc azzc0 = new azzc();
        azzc0.d = 0x3F4;
        azzc0.a = new aytr();
        azzd azzd0 = azzc0.a();
        return ictn.b(this.a.iG(azzd0), ibrl0);
    }
}

