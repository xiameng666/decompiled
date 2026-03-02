import android.accounts.Account;
import j..util.Map.-EL;
import java.util.Map;

public final class dczz implements icih {
    final icih a;
    final ddag b;

    public dczz(icih icih0, ddag ddag0) {
        this.a = icih0;
        this.b = ddag0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object5;
        Object object4;
        dczy dczy0;
        if((ibrl0 instanceof dczy)) {
            dczy0 = (dczy)ibrl0;
            int v = dczy0.b;
            if((v & 0x80000000) == 0) {
                dczy0 = new dczy(this, ibrl0);
            }
            else {
                dczy0.b = v - 0x80000000;
            }
        }
        else {
            dczy0 = new dczy(this, ibrl0);
        }
        Object object1 = dczy0.a;
        Object object2 = ibrx.a;
        switch(dczy0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                dczy0.c = icih0;
                dczy0.e = (Account)object0;
                dczy0.b = 1;
                Object object3 = this.b.m.c(dczy0);
                if(object3 != object2) {
                    object1 = object3;
                    object4 = (Account)object0;
                    object5 = icih0;
                    goto label_27;
                }
                return object2;
            }
            case 1: {
                object4 = dczy0.e;
                object5 = dczy0.c;
                ibnx.b(object1);
            label_27:
                String s = object4 == null ? null : ((Account)object4).name;
                Boolean boolean0 = Boolean.valueOf(false);
                if(s == null) {
                    s = "";
                }
                Object object6 = Map.-EL.getOrDefault(((Map)object1), s, boolean0);
                dczy0.c = null;
                dczy0.e = null;
                dczy0.b = 2;
                return ((icih)object5).a(object6, dczy0) != object2 ? ibom.a : object2;
            }
            case 2: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

