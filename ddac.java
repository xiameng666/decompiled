import android.accounts.Account;
import j..util.Map.-EL;
import java.util.Map;

public final class ddac implements icih {
    final icih a;
    final ddag b;

    public ddac(icih icih0, ddag ddag0) {
        this.a = icih0;
        this.b = ddag0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object5;
        Object object4;
        ddab ddab0;
        if((ibrl0 instanceof ddab)) {
            ddab0 = (ddab)ibrl0;
            int v = ddab0.b;
            if((v & 0x80000000) == 0) {
                ddab0 = new ddab(this, ibrl0);
            }
            else {
                ddab0.b = v - 0x80000000;
            }
        }
        else {
            ddab0 = new ddab(this, ibrl0);
        }
        Object object1 = ddab0.a;
        Object object2 = ibrx.a;
        switch(ddab0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                ddab0.c = icih0;
                ddab0.e = (Account)object0;
                ddab0.b = 1;
                Object object3 = this.b.m.b(ddab0);
                if(object3 != object2) {
                    object1 = object3;
                    object4 = (Account)object0;
                    object5 = icih0;
                    goto label_27;
                }
                return object2;
            }
            case 1: {
                object4 = ddab0.e;
                object5 = ddab0.c;
                ibnx.b(object1);
            label_27:
                String s = object4 == null ? null : ((Account)object4).name;
                Boolean boolean0 = Boolean.valueOf(false);
                if(s == null) {
                    s = "";
                }
                Object object6 = Map.-EL.getOrDefault(((Map)object1), s, boolean0);
                ddab0.c = null;
                ddab0.e = null;
                ddab0.b = 2;
                return ((icih)object5).a(object6, ddab0) != object2 ? ibom.a : object2;
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

