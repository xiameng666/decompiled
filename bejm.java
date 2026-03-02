import android.accounts.Account;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class bejm extends lsb {
    public final lrf a;
    public final AtomicBoolean b;
    public final lqi c;
    public final lqd d;
    private static final bboh e;
    private final betx f;

    static {
        bejm.e = bboh.b("AccountNameViewModel", bbcu.cX);
    }

    public bejm(lrf lrf0, betx betx0) {
        ibuq.f(lrf0, "state");
        super();
        this.a = lrf0;
        this.f = betx0;
        this.b = new AtomicBoolean(false);
        lqi lqi0 = new lqi();
        this.c = lqi0;
        this.d = lqi0;
    }

    public final Object a(ibrl ibrl0) {
        beji beji0;
        if((ibrl0 instanceof beji)) {
            beji0 = (beji)ibrl0;
            int v = beji0.c;
            if((v & 0x80000000) == 0) {
                beji0 = new beji(this, ibrl0);
            }
            else {
                beji0.c = v - 0x80000000;
            }
        }
        else {
            beji0 = new beji(this, ibrl0);
        }
        Object object0 = beji0.a;
        Object object1 = ibrx.a;
        switch(beji0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    beji0.c = 1;
                    object0 = this.f.b(beji0);
                    if(object0 == object1) {
                        return object1;
                    label_18:
                        ibnx.b(object0);
                    }
                    return (String)object0;
                }
                catch(IOException iOException0) {
                    break;
                }
            }
            case 1: {
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bejm.e.j(), "Reading from LastUsedAccountRepository has failed.", iOException0);
        return null;
    }

    public final Object b(String s, List list0, ibrl ibrl0) {
        bejj bejj0;
        if((ibrl0 instanceof bejj)) {
            bejj0 = (bejj)ibrl0;
            int v = bejj0.c;
            if((v & 0x80000000) == 0) {
                bejj0 = new bejj(this, ibrl0);
            }
            else {
                bejj0.c = v - 0x80000000;
            }
        }
        else {
            bejj0 = new bejj(this, ibrl0);
        }
        Object object0 = bejj0.a;
        Object object1 = ibrx.a;
        switch(bejj0.c) {
            case 0: {
                ibnx.b(object0);
                if(s != null && s.length() != 0) {
                    return s;
                }
                ibqm ibqm0 = new ibqm(null);
                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                for(Object object2: list0) {
                    String s1 = ((Account)object2).name;
                    ibuq.e(s1, "name");
                    arrayList0.add(s1);
                }
                ibqm0.addAll(arrayList0);
                ibqm0.add("pwm.constant.LocalAccount");
                List list1 = ibpo.a(ibqm0);
                bejj0.d = (ibqm)list1;
                bejj0.c = 1;
                object0 = this.a(bejj0);
                if(object0 != object1) {
                    return ((String)object0) == null || !list1.contains(((String)object0)) ? ((String)ibpo.R(list1)) : ((String)object0);
                }
                return object1;
            }
            case 1: {
                List list2 = bejj0.d;
                ibnx.b(object0);
                return ((String)object0) == null || !list2.contains(((String)object0)) ? ((String)ibpo.R(list2)) : ((String)object0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(String s, ibrl ibrl0) {
        bejk bejk0;
        if((ibrl0 instanceof bejk)) {
            bejk0 = (bejk)ibrl0;
            int v = bejk0.c;
            if((v & 0x80000000) == 0) {
                bejk0 = new bejk(this, ibrl0);
            }
            else {
                bejk0.c = v - 0x80000000;
            }
        }
        else {
            bejk0 = new bejk(this, ibrl0);
        }
        Object object0 = bejk0.a;
        Object object1 = ibrx.a;
        switch(bejk0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bejk0.c = 1;
                    betw betw0 = new betw(s, null);
                    Object object2 = this.f.a.a(betw0, bejk0);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                    if(object2 == object1) {
                        return object1;
                    label_21:
                        ibnx.b(object0);
                        return ibom.a;
                    }
                    return ibom.a;
                }
                catch(IOException iOException0) {
                    break;
                }
            }
            case 1: {
                goto label_21;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bejm.e.j(), "Writing to LastUsedAccountRepository has failed.", iOException0);
        return ibom.a;
    }
}

