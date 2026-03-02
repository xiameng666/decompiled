import android.content.Context;
import android.content.Intent;
import com.google.android.gms.googleone.StorageManagementIntentRequest;

public final class asoc {
    private final Context a;
    private final buav b;

    public asoc(Context context0, buav buav0) {
        this.a = context0;
        this.b = buav0;
    }

    public final Object a(asoh asoh0, ibrl ibrl0) {
        asoa asoa0;
        if((ibrl0 instanceof asoa)) {
            asoa0 = (asoa)ibrl0;
            int v = asoa0.c;
            if((v & 0x80000000) == 0) {
                asoa0 = new asoa(this, ibrl0);
            }
            else {
                asoa0.c = v - 0x80000000;
            }
        }
        else {
            asoa0 = new asoa(this, ibrl0);
        }
        Object object0 = asoa0.a;
        Object object1 = ibrx.a;
        switch(asoa0.c) {
            case 0: {
                ibnx.b(object0);
                asoa0.d = asoh0;
                asoa0.c = 1;
                object0 = this.b(asoh0.a, asoa0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                asoh0 = asoa0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        boolean z = false;
        ccnb ccnb0 = null;
        if(asoh0.a()) {
            if(asoh0.b == asoi.a && asoh0.c == asoi.b) {
                z = true;
            }
            if(z) {
                ccnb0 = hqlb.i() ? "photos_v2" : "photos";
            }
            ccnb0 = new ccnb("Manage backup", new ccmw(aqzc.h(((String)ccnb0)), (z ? cmeu.t : cmeu.s)));
        }
        return ccnb0 == null ? new ccne(((ccnb)object0)) : new ccnc(((ccnb)object0), ccnb0);
    }

    public final Object b(String s, ibrl ibrl0) {
        String s1;
        asob asob0;
        if((ibrl0 instanceof asob)) {
            asob0 = (asob)ibrl0;
            int v = asob0.c;
            if((v & 0x80000000) == 0) {
                asob0 = new asob(this, ibrl0);
            }
            else {
                asob0.c = v - 0x80000000;
            }
        }
        else {
            asob0 = new asob(this, ibrl0);
        }
        Object object0 = asob0.a;
        Object object1 = ibrx.a;
        switch(asob0.c) {
            case 0: {
                ibnx.b(object0);
                StorageManagementIntentRequest storageManagementIntentRequest0 = new StorageManagementIntentRequest(s, "BACKUP_CONTEXTUAL_CARD", "GMSCORE", "");
                evql evql0 = this.b.b(storageManagementIntentRequest0);
                asob0.d = "Manage storage";
                asob0.c = 1;
                Object object2 = ictn.b(evql0, asob0);
                if(object2 != object1) {
                    object0 = object2;
                    s1 = "Manage storage";
                    break;
                }
                return object1;
            }
            case 1: {
                s1 = asob0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return new ccnb(s1, new ccmw(((Intent)object0), cmeu.u));
    }
}

