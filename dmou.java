import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public final class dmou {
    public final dmpj a;
    private final cchj b;
    private final dmlf c;
    private final azts d;

    public dmou(cchj cchj0, azts azts0, dmlf dmlf0) {
        this.b = cchj0;
        this.d = azts0;
        this.c = dmlf0;
        this.a = new dmpj(azts0, dmlf0);
    }

    public final Object a(ibrl ibrl0) {
        Object object3;
        dmot dmot0;
        if((ibrl0 instanceof dmot)) {
            dmot0 = (dmot)ibrl0;
            int v = dmot0.d;
            if((v & 0x80000000) == 0) {
                dmot0 = new dmot(this, ibrl0);
            }
            else {
                dmot0.d = v - 0x80000000;
            }
        }
        else {
            dmot0 = new dmot(this, ibrl0);
        }
        Object object0 = dmot0.b;
        Object object1 = ibrx.a;
        switch(dmot0.d) {
            case 0: {
                ibnx.b(object0);
                Account[] arr_account = this.b.o();
                if(arr_account == null) {
                    return ibps.a;
                }
                Object object2 = new ArrayList();
                if(hwkz.d() && hwkz.c()) {
                    dmot0.a = object2;
                    dmot0.d = 1;
                    object0 = this.a.a(arr_account, dmot0);
                    if(object0 != object1) {
                        object3 = object2;
                        break;
                    }
                    return object1;
                }
                return object2;
            }
            case 1: {
                object3 = dmot0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((List)object3).addAll(((List)object0));
        return object3;
    }
}

