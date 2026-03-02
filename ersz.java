import java.util.NoSuchElementException;

public final class ersz {
    private final ersw a;
    private final ibnf b;

    public ersz(ersw ersw0, ibnf ibnf0) {
        ibuq.f(ibnf0, "spatulaSettingsStorageOperations");
        super();
        this.a = ersw0;
        this.b = ibnf0;
    }

    public static Object a(ersz ersz0, String s, ibrl ibrl0) {
        Object object2;
        ersy ersy0;
        if((ibrl0 instanceof ersy)) {
            ersy0 = (ersy)ibrl0;
            int v = ersy0.c;
            if((v & 0x80000000) == 0) {
                ersy0 = new ersy(ersz0, ibrl0);
            }
            else {
                ersy0.c = v - 0x80000000;
            }
        }
        else {
            ersy0 = new ersy(ersz0, ibrl0);
        }
        Object object0 = ersy0.a;
        Object object1 = ibrx.a;
        switch(ersy0.c) {
            case 0: {
                ibnx.b(object0);
                if(ibzk.D(s)) {
                    return ibnx.a(new IllegalArgumentException("Account Name cannot be null or blank"));
                }
                erua erua0 = (erua)ersz0.b.get();
                ersy0.d = ersz0;
                ersy0.e = s;
                ersy0.c = 1;
                object2 = erua0.a(s, ersy0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_27;
            }
            case 1: {
                s = ersy0.e;
                ersz0 = ersy0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_27:
                Throwable throwable0 = ibnw.a(object2);
                if(throwable0 != null) {
                    if((throwable0 instanceof NoSuchElementException)) {
                        ersy0.d = null;
                        ersy0.e = null;
                        ersy0.c = 2;
                        Object object3 = ersw.a(ersz0.a, s, ersy0);
                        return object3 == object1 ? object1 : object3;
                    }
                    return ibnx.a(new eruy(throwable0));
                }
                return object2;
            }
            case 2: {
                ibnx.b(object0);
                return ((ibnw)object0).a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

