public final class ersw {
    private final ibnf a;

    public ersw(ibnf ibnf0) {
        this.a = ibnf0;
    }

    public static Object a(ersw ersw0, String s, ibrl ibrl0) {
        ersv ersv0;
        if((ibrl0 instanceof ersv)) {
            ersv0 = (ersv)ibrl0;
            int v = ersv0.c;
            if((v & 0x80000000) == 0) {
                ersv0 = new ersv(ersw0, ibrl0);
            }
            else {
                ersv0.c = v - 0x80000000;
            }
        }
        else {
            ersv0 = new ersv(ersw0, ibrl0);
        }
        Object object0 = ersv0.a;
        Object object1 = ibrx.a;
        switch(ersv0.c) {
            case 0: {
                ibnx.b(object0);
                if(ibzk.D(s)) {
                    return ibnx.a(new IllegalArgumentException("Account Name cannot be null or blank"));
                }
                ersf ersf0 = ((ersg)ersw0.a).a();
                ersv0.c = 1;
                Object object2 = ersf0.a(s, gqkb.a.a, ersv0);
                return object2 == object1 ? object1 : object2;
            }
            case 1: {
                ibnx.b(object0);
                return ((ibnw)object0).a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

