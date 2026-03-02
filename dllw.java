import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class dllw {
    private static final bboh a;
    private final Context b;
    private final etgl c;

    static {
        dllw.a = bboh.b("Pay", bbcu.cZ);
    }

    public dllw(Context context0, etgl etgl0) {
        this.b = context0;
        this.c = etgl0;
    }

    public static Object a(dllw dllw0, ibrl ibrl0) {
        String s;
        Object object2;
        dllu dllu0;
        if((ibrl0 instanceof dllu)) {
            dllu0 = (dllu)ibrl0;
            int v = dllu0.c;
            if((v & 0x80000000) == 0) {
                dllu0 = new dllu(dllw0, ibrl0);
            }
            else {
                dllu0.c = v - 0x80000000;
            }
        }
        else {
            dllu0 = new dllu(dllw0, ibrl0);
        }
        Object object0 = dllu0.a;
        Object object1 = ibrx.a;
        switch(dllu0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = dllw0.c.j();
                dllu0.d = dllw0;
                dllu0.c = 1;
                object2 = fsdk.a(evql0, dllu0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_23;
            }
            case 1: {
                dllw0 = dllu0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_23:
                if(!(object2 instanceof ibnv)) {
                    Object object3 = ((AccountInfo)object2) == null ? null : dllw0.c(((AccountInfo)object2));
                    if(object3 == null) {
                        String[] arr_s = bbmn.y(bbmn.h(dllw0.b, "com.google.android.gms"));
                        if(arr_s.length == 0) {
                            ((ggtj)dllw.a.h()).x("No available google accounts found on device.");
                            s = null;
                        }
                        else {
                            s = arr_s[0];
                        }
                        if(s == null) {
                            return null;
                        }
                        dllu0.d = null;
                        dllu0.c = 2;
                        Object object4 = dllw0.b(s, dllu0);
                        return object4 == object1 ? object1 : object4;
                    }
                    return object3;
                }
                a.ae(dllw.a.j(), "Error occurred while trying to get active account.", ibnw.a(object2));
                return null;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(String s, ibrl ibrl0) {
        Object object3;
        Object object2;
        dllv dllv0;
        if((ibrl0 instanceof dllv)) {
            dllv0 = (dllv)ibrl0;
            int v = dllv0.c;
            if((v & 0x80000000) == 0) {
                dllv0 = new dllv(this, ibrl0);
            }
            else {
                dllv0.c = v - 0x80000000;
            }
        }
        else {
            dllv0 = new dllv(this, ibrl0);
        }
        Object object0 = dllv0.a;
        Object object1 = ibrx.a;
        switch(dllv0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.cQ(s);
                dllv0.c = 1;
                object2 = fsdk.a(evql0, dllv0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_21:
                if((object2 instanceof ibnv)) {
                    a.ae(dllw.a.j(), "Error occurred while trying to set active account on device.", ibnw.a(object2));
                    return null;
                }
                evql evql1 = this.c.j();
                dllv0.c = 2;
                object3 = fsdk.a(evql1, dllv0);
                if(object3 == object1) {
                    return object1;
                }
                goto label_31;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        object3 = ((ibnw)object0).a;
    label_31:
        if((object3 instanceof ibnv)) {
            a.ae(dllw.a.j(), "Error occurred while trying to get active account.", ibnw.a(object3));
        }
        if((object3 instanceof ibnv)) {
            object3 = null;
        }
        return ((AccountInfo)object3) != null ? this.c(((AccountInfo)object3)) : null;
    }

    private final Account c(AccountInfo accountInfo0) {
        return new Account(accountInfo0.b, "com.google");
    }
}

