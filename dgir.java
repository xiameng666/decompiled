import android.content.BroadcastReceiver;
import android.content.Context;

public final class dgir {
    public final Context a;
    public final String b;

    public dgir(Context context0, String s) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = s;
    }

    public final Object a(ibts ibts0, ibrl ibrl0) {
        ibvd ibvd1;
        ibts ibts1;
        dgip dgip0;
        if((ibrl0 instanceof dgip)) {
            dgip0 = (dgip)ibrl0;
            int v = dgip0.c;
            if((v & 0x80000000) == 0) {
                dgip0 = new dgip(this, ibrl0);
            }
            else {
                dgip0.c = v - 0x80000000;
            }
        }
        else {
            dgip0 = new dgip(this, ibrl0);
        }
        Object object0 = dgip0.a;
        Object object1 = ibrx.a;
        switch(dgip0.c) {
            case 0: {
                ibnx.b(object0);
                ibvd ibvd0 = new ibvd();
                long v1 = hvqs.ac();
                dgiq dgiq0 = new dgiq(ibvd0, this, null);
                dgip0.e = (dgit)ibts0;
                dgip0.d = ibvd0;
                dgip0.c = 1;
                Object object2 = icfo.c(v1, dgiq0, dgip0);
                if(object2 != object1) {
                    ibts1 = ibts0;
                    ibvd1 = ibvd0;
                    object0 = object2;
                    goto label_29;
                }
                return object1;
            }
            case 1: {
                ibvd1 = dgip0.d;
                ibts1 = dgip0.e;
                ibnx.b(object0);
            label_29:
                cutr.f(this.a, ((BroadcastReceiver)ibvd1.a));
                if(((ibom)object0) == null) {
                    dcvz.a.e().h("Waiting for App installation (%s), timed out.", this.b);
                    return ibom.a;
                }
                dgip0.e = null;
                dgip0.d = null;
                dgip0.c = 2;
                return ibts1.a(dgip0) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

