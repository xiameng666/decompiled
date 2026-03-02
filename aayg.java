import com.google.android.gms.actionlearner.ContextData;
import com.google.android.gms.common.Feature;

public final class aayg implements aztx, azty {
    public final azts a;

    public aayg(azts azts0) {
        this.a = azts0;
    }

    public final Object b(ibrl ibrl0) {
        aaye aaye0;
        if((ibrl0 instanceof aaye)) {
            aaye0 = (aaye)ibrl0;
            int v = aaye0.c;
            if((v & 0x80000000) == 0) {
                aaye0 = new aaye(this, ibrl0);
            }
            else {
                aaye0.c = v - 0x80000000;
            }
        }
        else {
            aaye0 = new aaye(this, ibrl0);
        }
        Object object0 = aaye0.a;
        Object object1 = ibrx.a;
        switch(aaye0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.a.js(null).h(new aayb(), new aayc());
                aaye0.c = 1;
                object0 = ictn.b(evql0, aaye0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public final Object c(ibts ibts0, ibrl ibrl0) {
        aayf aayf0;
        if((ibrl0 instanceof aayf)) {
            aayf0 = (aayf)ibrl0;
            int v = aayf0.c;
            if((v & 0x80000000) == 0) {
                aayf0 = new aayf(this, ibrl0);
            }
            else {
                aayf0.c = v - 0x80000000;
            }
        }
        else {
            aayf0 = new aayf(this, ibrl0);
        }
        Object object0 = aayf0.a;
        Object object1 = ibrx.a;
        switch(aayf0.c) {
            case 0: {
                ibnx.b(object0);
                aaxm aaxm0 = new aaxm();
                ibts0.a(aaxm0);
                ContextData contextData0 = new ContextData(aaxm0.a());
                evql evql0 = this.a.js(contextData0).h(new aayb(), new aayd());
                aayf0.c = 1;
                object0 = ictn.b(evql0, aayf0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return object0;
    }

    @Override  // aztx
    public final azux ga() {
        return this.a.A;
    }

    @Override  // azty
    public final Feature[] gm() {
        return this.a.gm();
    }
}

