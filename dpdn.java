import android.accounts.Account;
import android.content.Intent;

public final class dpdn implements dpdj {
    final edtd a;
    final dqfa b;
    final dqap c;
    final eedh d;

    public dpdn(edtd edtd0, dqfa dqfa0, dqap dqap0, eedh eedh0) {
        this.a = edtd0;
        this.b = dqfa0;
        this.c = dqap0;
        this.d = eedh0;
        super();
    }

    @Override  // dpdj
    public final Object a(Intent intent0, Account account0, ibrl ibrl0) {
        Object object4;
        int v1;
        dpdm dpdm0;
        if((ibrl0 instanceof dpdm)) {
            dpdm0 = (dpdm)ibrl0;
            int v = dpdm0.e;
            if((v & 0x80000000) == 0) {
                dpdm0 = new dpdm(this, ibrl0);
            }
            else {
                dpdm0.e = v - 0x80000000;
            }
        }
        else {
            dpdm0 = new dpdm(this, ibrl0);
        }
        Object object0 = dpdm0.c;
        Object object1 = ibrx.a;
        Integer integer0 = null;
        switch(dpdm0.e) {
            case 0: {
                ibnx.b(object0);
                dpdm0.a = intent0;
                dpdm0.b = account0;
                dpdm0.e = 1;
                object0 = edte.a(intent0, ((edtf)this.a).b, ((edtf)this.a).c);
                if(object0 == object1) {
                    return object1;
                }
                goto label_24;
            }
            case 1: {
                account0 = dpdm0.b;
                intent0 = dpdm0.a;
                ibnx.b(object0);
            label_24:
                if(dpdp.a(((Intent)object0))) {
                    return (Intent)object0;
                }
                dpdm0.a = intent0;
                dpdm0.b = account0;
                dpdm0.e = 2;
                object0 = dqfa.c(this.b, intent0, account0, dpdm0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_37;
            }
            case 2: {
                Object object2 = dpdm0.b;
                Object object3 = dpdm0.a;
                ibnx.b(object0);
                account0 = object2;
                intent0 = object3;
            label_37:
                if(dpdp.a(((Intent)object0))) {
                    return (Intent)object0;
                }
                dpdm0.a = intent0;
                dpdm0.b = null;
                dpdm0.e = 3;
                object0 = dqap.a(this.c, intent0, account0, dpdm0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_47;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        intent0 = dpdm0.a;
        ibnx.b(object0);
    label_47:
        if(dpdp.a(((Intent)object0))) {
            return (Intent)object0;
        }
        ibuq.f(intent0, "intent");
        if(this.d.a.a) {
            ibuq.f(intent0, "<this>");
            Integer integer1 = ednm.a(intent0);
            if(integer1.intValue() != 0) {
                integer0 = integer1;
            }
            if(integer0 == null) {
                Integer integer2 = ednm.c(intent0);
                v1 = integer2 == null ? 0 : ((int)integer2);
            }
            else {
                v1 = (int)integer0;
            }
            object4 = edvk.b(true, v1);
            ((Intent)object4).putExtra("IS_REDIRECT", true);
            ((Intent)object4).putExtra("ORIGINAL_INTENT", intent0);
            ibuq.c(object4);
        }
        else {
            object4 = intent0;
        }
        return dpdp.a(((Intent)object4)) ? object4 : intent0;
    }
}

