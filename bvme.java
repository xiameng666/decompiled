import android.os.SystemClock;
import java.util.List;

final class bvme implements bvly {
    private final bvly a;
    private final String b;
    private final bboh c;

    public bvme(bvly bvly0) {
        this.a = bvly0;
        this.b = "local tab ordering rules";
        this.c = bboh.b("SettingsTabOrderRule", bbcu.fK);
    }

    @Override  // bvly
    public final Object a(String s, ibrl ibrl0) {
        long v2;
        bvmd bvmd0;
        if((ibrl0 instanceof bvmd)) {
            bvmd0 = (bvmd)ibrl0;
            int v = bvmd0.d;
            if((v & 0x80000000) == 0) {
                bvmd0 = new bvmd(this, ibrl0);
            }
            else {
                bvmd0.d = v - 0x80000000;
            }
        }
        else {
            bvmd0 = new bvmd(this, ibrl0);
        }
        Object object0 = bvmd0.b;
        Object object1 = ibrx.a;
        switch(bvmd0.d) {
            case 0: {
                ibnx.b(object0);
                long v1 = SystemClock.elapsedRealtime();
                bvmd0.a = v1;
                bvmd0.d = 1;
                bvlz bvlz0 = new bvlz(((bvma)this.a), s, null);
                object0 = icbd.a(((bvma)this.a).b, bvlz0, bvmd0);
                if(object0 != object1) {
                    v2 = v1;
                    break;
                }
                return object1;
            }
            case 1: {
                v2 = bvmd0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ccpf ccpf0 = new ccpf(((List)object0), SystemClock.elapsedRealtime() - v2);
        ((ggtj)this.c.h()).Q("Loaded %s settings tabs ordering rules (took %d ms).", this.b, ccpf0.b);
        return (List)ccpf0.a;
    }
}

