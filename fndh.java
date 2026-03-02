import android.content.Context;

public final class fndh {
    public final azts a;

    public fndh(Context context0, azts azts0) {
        ibuq.f(context0, "context");
        super();
        this.a = azts0;
    }

    public static Object a(fndh fndh0, bhbp bhbp0, ibrl ibrl0) {
        fndf fndf0;
        if((ibrl0 instanceof fndf)) {
            fndf0 = (fndf)ibrl0;
            int v = fndf0.c;
            if((v & 0x80000000) == 0) {
                fndf0 = new fndf(fndh0, ibrl0);
            }
            else {
                fndf0.c = v - 0x80000000;
            }
        }
        else {
            fndf0 = new fndf(fndh0, ibrl0);
        }
        Object object0 = fndf0.a;
        Object object1 = ibrx.a;
        switch(fndf0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    fndg fndg0 = new fndg(fndh0, bhbp0, null);
                    fndf0.d = bhbp0;
                    fndf0.c = 1;
                    object0 = icfo.a(10000L, fndg0, fndf0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        bhbp0 = fndf0.d;
                        ibnx.b(object0);
                    }
                    return (fndi)object0;
                }
                catch(Exception exception0) {
                    break;
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        sct.e("GmsCuiAdvise", "Failed to advise end of CUI " + bhbp0 + " with exception " + exception0.getMessage());
        if((exception0 instanceof icfl)) {
            return fndi.c;
        }
        if((exception0 instanceof SecurityException)) {
            return fndi.b;
        }
        return !(exception0 instanceof aztb) || ((aztb)exception0).b() != 17 ? fndi.d : fndi.e;
    }
}

