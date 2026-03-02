import android.content.Intent;

public final class bdkb {
    static Object a(bdkb bdkb0, ibrl ibrl0) {
        bdka bdka0;
        if((ibrl0 instanceof bdka)) {
            bdka0 = (bdka)ibrl0;
            int v = bdka0.c;
            if((v & 0x80000000) == 0) {
                bdka0 = new bdka(bdkb0, ibrl0);
            }
            else {
                bdka0.c = v - 0x80000000;
            }
        }
        else {
            bdka0 = new bdka(bdkb0, ibrl0);
        }
        Object object0 = bdka0.a;
        Object object1 = ibrx.a;
        switch(bdka0.c) {
            case 0: {
                ibnx.b(object0);
                bdka0.c = 1;
                return iccv.c(1000L, bdka0) == object1 ? object1 : new bdjy();
            }
            case 1: {
                ibnx.b(object0);
                return new bdjy();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final bdjv b(Intent intent0) {
        ibuq.f(intent0, "requestIntent");
        return new bdjv();
    }
}

