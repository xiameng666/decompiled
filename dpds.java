import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Intent;
import java.util.Map;

public final class dpds {
    public final xni a;
    private final Map b;
    private final KeyguardManager c;
    private final etgl d;

    public dpds(xni xni0, Map map0, etgl etgl0, KeyguardManager keyguardManager0) {
        this.a = xni0;
        this.b = map0;
        this.d = etgl0;
        this.c = keyguardManager0;
    }

    public final Object a(Intent intent0, Account account0, ibrl ibrl0) {
        Object object7;
        Object object6;
        Object object2;
        dpdq dpdq0;
        if((ibrl0 instanceof dpdq)) {
            dpdq0 = (dpdq)ibrl0;
            int v = dpdq0.e;
            if((v & 0x80000000) == 0) {
                dpdq0 = new dpdq(this, ibrl0);
            }
            else {
                dpdq0.e = v - 0x80000000;
            }
        }
        else {
            dpdq0 = new dpdq(this, ibrl0);
        }
        Object object0 = dpdq0.c;
        Object object1 = ibrx.a;
        switch(dpdq0.e) {
            case 0: {
                ibnx.b(object0);
                if(hwwt.a.b().a() && ibuq.m(intent0.getAction(), "com.google.android.gms.pay.homescreen.VIEW_HOME") && edky.b(this.c)) {
                    evql evql0 = this.d.cE();
                    dpdq0.a = intent0;
                    dpdq0.b = account0;
                    dpdq0.e = 1;
                    object2 = fsdk.a(evql0, dpdq0);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_28;
                }
                goto label_35;
            }
            case 1: {
                Object object3 = dpdq0.b;
                Object object4 = dpdq0.a;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                account0 = object3;
                intent0 = object4;
            label_28:
                Boolean boolean0 = Boolean.valueOf(false);
                if((object2 instanceof ibnv)) {
                    object2 = boolean0;
                }
                if(!((Boolean)object2).booleanValue()) {
                    Object object5 = dlnf.B(this.a);
                    ibuq.c(object5);
                    return object5;
                }
            label_35:
                if(intent0.getBooleanExtra("WAS_ALREADY_REDIRECTED", false)) {
                    return intent0;
                }
                String s = intent0.getAction();
                dpdj dpdj0 = (dpdj)this.b.get(s);
                object6 = null;
                if(dpdj0 != null) {
                    dpdq0.a = intent0;
                    dpdq0.b = null;
                    dpdq0.e = 2;
                    object0 = dpdj0.a(intent0, account0, dpdq0);
                    if(object0 != object1) {
                        object7 = intent0;
                        object6 = (Intent)object0;
                        intent0 = object7;
                        return object6 == null ? intent0 : object6;
                    }
                    return object1;
                }
                return object6 == null ? intent0 : object6;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object7 = dpdq0.a;
        ibnx.b(object0);
        object6 = (Intent)object0;
        intent0 = object7;
        return object6 == null ? intent0 : object6;
    }
}

