import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.List;

public final class bdxu {
    public final beih a;
    public final begp b;
    public final icig c;
    public final icig d;

    public bdxu(beli beli0, beih beih0, begp begp0) {
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(begp0, "passkeyDataRepository");
        super();
        this.a = beih0;
        this.b = begp0;
        bdxn bdxn0 = new bdxn(lox.b(beli0.a()));
        this.c = new icmj(bdxn0, new bdxq(lox.b(beih0.l)), new bdxh(null));
        this.d = new bdxt(bdxn0);
    }

    static Object a(bdxu bdxu0, ibrl ibrl0) {
        evql evql1;
        Object object1;
        Object object0;
        bdxk bdxk0;
        if((ibrl0 instanceof bdxk)) {
            bdxk0 = (bdxk)ibrl0;
            int v = bdxk0.c;
            if((v & 0x80000000) == 0) {
                bdxk0 = new bdxk(bdxu0, ibrl0);
            }
            else {
                bdxk0.c = v - 0x80000000;
            }
        }
        else {
            bdxk0 = new bdxk(bdxu0, ibrl0);
        }
        try {
            object0 = bdxk0.a;
            object1 = ibrx.a;
            switch(bdxk0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_24;
                }
                case 2: {
                    goto label_41;
                }
            }
        }
        catch(aztb unused_ex) {
            return Boolean.valueOf(false);
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{axyd.g};
            azzc0.d = 913;
            azzc0.a = new aytc();
            azzd azzd0 = azzc0.a();
            evql evql0 = bdxu0.a.s.jn(azzd0);
            bdxk0.d = bdxu0;
            bdxk0.c = 1;
            if(ictn.b(evql0, bdxk0) != object1) {
                goto label_26;
            label_24:
                bdxu0 = bdxk0.d;
                ibnx.b(object0);
            label_26:
                begp begp0 = bdxu0.b;
                if(begp0.c) {
                    evql1 = evrg.d(null);
                }
                else {
                    azzc azzc1 = new azzc();
                    azzc1.c = new Feature[]{axyd.g};
                    azzc1.d = 913;
                    azzc1.a = new aytd();
                    azzd azzd1 = azzc1.a();
                    evql1 = begp0.j.jn(azzd1);
                }
                bdxk0.d = null;
                bdxk0.c = 2;
                if(ictn.b(evql1, bdxk0) != object1) {
                    return Boolean.valueOf(true);
                }
            }
            return object1;
        label_41:
            ibnx.b(object0);
            return Boolean.valueOf(true);
        }
        catch(aztb unused_ex) {
            return Boolean.valueOf(false);
        }
    }

    public static final bdye b(List list0, ibts ibts0) {
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        int v1 = 0;
        for(Object object0: list0) {
            gqlt gqlt0 = (gqlt)object0;
            ggqk ggqk0 = gqlt0.c.E();
            ibuq.e(ggqk0, "iterator(...)");
            boolean z = false;
            while(ggqk0.hasNext()) {
                bedg bedg0 = (bedg)ibpo.T(((gqmd)ggqk0.next()).c());
                if(bedg0 != null && ((Boolean)ibts0.a(bedg0)).booleanValue()) {
                    ++v1;
                    z = true;
                }
            }
            if(!z) {
            }
            else if(arrayList0.size() < 2) {
                arrayList0.add(gqlt0.b.c);
            }
            else {
                ++v;
            }
        }
        if(arrayList0.isEmpty()) {
            return new bdye(v1, bdyh.a);
        }
        return v == 0 ? new bdye(v1, new bdyf(arrayList0)) : new bdye(v1, new bdyg(arrayList0));
    }
}

