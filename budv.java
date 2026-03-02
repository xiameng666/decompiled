import android.accounts.Account;
import j..time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class budv {
    public static Object a(buea buea0, List list0, ibrl ibrl0) {
        Object object2;
        buea buea1;
        budw budw0;
        if((ibrl0 instanceof budw)) {
            budw0 = (budw)ibrl0;
            int v = budw0.c;
            if((v & 0x80000000) == 0) {
                budw0 = new budw(buea0, ibrl0);
            }
            else {
                budw0.c = v - 0x80000000;
            }
        }
        else {
            budw0 = new budw(buea0, ibrl0);
        }
        Object object0 = budw0.b;
        Object object1 = ibrx.a;
        switch(budw0.c) {
            case 0: {
                ibnx.b(object0);
                buea1 = buea0;
                object2 = list0.iterator();
                break;
            }
            case 1: {
                object2 = budw0.a;
                buea1 = budw0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            String s = ((Account)object3).name;
            ibuq.e(s, "name");
            budw0.e = (buer)buea1;
            budw0.a = object2;
            budw0.c = 1;
            buei buei0 = new buei(s);
            if(oqj.d(((buer)buea1).a, false, true, buei0, budw0) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }

    public static Object b(buea buea0, String s, budu budu0, buds buds0, ibrl ibrl0) {
        budx budx0;
        if((ibrl0 instanceof budx)) {
            budx0 = (budx)ibrl0;
            int v = budx0.c;
            if((v & 0x80000000) == 0) {
                budx0 = new budx(buea0, ibrl0);
            }
            else {
                budx0.c = v - 0x80000000;
            }
        }
        else {
            budx0 = new budx(buea0, ibrl0);
        }
        Object object0 = budx0.b;
        Object object1 = ibrx.a;
        switch(budx0.c) {
            case 0: {
                ibnx.b(object0);
                budx0.a = buea0;
                budx0.d = s;
                budx0.e = budu0;
                budx0.f = buds0;
                budx0.c = 1;
                buel buel0 = new buel(s, budu0, buds0);
                object0 = oqj.d(((buer)buea0).a, true, false, buel0, budx0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_28;
            }
            case 1: {
                buds0 = budx0.f;
                budu0 = budx0.e;
                s = budx0.d;
                buea0 = (buea)budx0.a;
                ibnx.b(object0);
            label_28:
                if(((buew)object0) == null) {
                    Object object2 = new buew(s, budu0, buds0, 0xF1);
                    budx0.a = object2;
                    budx0.d = null;
                    budx0.e = null;
                    budx0.f = null;
                    budx0.c = 2;
                    return buea0.c(((buew)object2), budx0) == object1 ? object1 : object2;
                }
                return (buew)object0;
            }
            case 2: {
                Object object3 = (buew)budx0.a;
                ibnx.b(object0);
                return object3;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static Object c(buea buea0, Map map0, ibrl ibrl0) {
        Object object2;
        buea buea1;
        budy budy0;
        if((ibrl0 instanceof budy)) {
            budy0 = (budy)ibrl0;
            int v = budy0.c;
            if((v & 0x80000000) == 0) {
                budy0 = new budy(buea0, ibrl0);
            }
            else {
                budy0.c = v - 0x80000000;
            }
        }
        else {
            budy0 = new budy(buea0, ibrl0);
        }
        Object object0 = budy0.b;
        Object object1 = ibrx.a;
        switch(budy0.c) {
            case 0: {
                ibnx.b(object0);
                buea1 = buea0;
                object2 = map0.entrySet().iterator();
                break;
            }
            case 1: {
                object2 = budy0.a;
                buea1 = budy0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            Account account0 = (Account)((Map.Entry)object3).getKey();
            Account account1 = (Account)((Map.Entry)object3).getValue();
            String s = account0.name;
            ibuq.e(s, "name");
            String s1 = account1.name;
            ibuq.e(s1, "name");
            budy0.e = (buer)buea1;
            budy0.a = object2;
            budy0.c = 1;
            buek buek0 = new buek(s1, s);
            if(oqj.d(((buer)buea1).a, false, true, buek0, budy0) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }

    public static Object d(buea buea0, String s, budu budu0, buds buds0, ibrl ibrl0) {
        buds buds1;
        buea buea1;
        budz budz0;
        if((ibrl0 instanceof budz)) {
            budz0 = (budz)ibrl0;
            int v = budz0.b;
            if((v & 0x80000000) == 0) {
                budz0 = new budz(buea0, ibrl0);
            }
            else {
                budz0.b = v - 0x80000000;
            }
        }
        else {
            budz0 = new budz(buea0, ibrl0);
        }
        Object object0 = budz0.a;
        Object object1 = ibrx.a;
        switch(budz0.b) {
            case 0: {
                ibnx.b(object0);
                budz0.f = (buer)buea0;
                budz0.c = s;
                budz0.d = buds0;
                budz0.b = 1;
                bueo bueo0 = new bueo(s, budu0);
                if(oqj.d(((buer)buea0).a, false, true, bueo0, budz0) != object1) {
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                buds0 = budz0.d;
                s = budz0.c;
                buea0 = budz0.f;
                ibnx.b(object0);
            label_25:
                budz0.f = (buer)buea0;
                budz0.c = s;
                budz0.d = buds0;
                budz0.b = 2;
                bueh bueh0 = new bueh(s, buds0);
                if(oqj.d(((buer)buea0).a, false, true, bueh0, budz0) != object1) {
                    buea1 = buea0;
                    buds1 = buds0;
                    goto label_38;
                }
                return object1;
            }
            case 2: {
                buds1 = budz0.d;
                s = budz0.c;
                buea1 = budz0.f;
                ibnx.b(object0);
            label_38:
                budz0.f = null;
                budz0.c = null;
                budz0.d = null;
                budz0.b = 3;
                buef buef0 = new buef(Instant.MAX, s, buds1);
                return oqj.d(((buer)buea1).a, false, true, buef0, budz0) != object1 ? ibom.a : object1;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

