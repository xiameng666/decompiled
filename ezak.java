import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.Iterator;
import java.util.List;

public final class ezak {
    public final bboh a;
    private final fcfe b;
    private final fcfg c;

    public ezak(fcfe fcfe0, fcfg fcfg0, bboh bboh0) {
        this.b = fcfe0;
        this.c = fcfg0;
        this.a = bboh0;
    }

    public final Object a(exnd exnd0, ibrl ibrl0) {
        Object object2;
        exnd exnd1;
        ezaj ezaj0;
        if((ibrl0 instanceof ezaj)) {
            ezaj0 = (ezaj)ibrl0;
            int v = ezaj0.d;
            if((v & 0x80000000) == 0) {
                ezaj0 = new ezaj(this, ibrl0);
            }
            else {
                ezaj0.d = v - 0x80000000;
            }
        }
        else {
            ezaj0 = new ezaj(this, ibrl0);
        }
        Object object0 = ezaj0.b;
        Object object1 = ibrx.a;
        switch(ezaj0.d) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.f();
                ezaj0.e = exnd0;
                ezaj0.d = 1;
                object0 = ictn.b(evql0, ezaj0);
                if(object0 == object1) {
                    return object1;
                }
                exnd1 = exnd0;
                object2 = ((List)object0).iterator();
                break;
            }
            case 1: {
                exnd0 = ezaj0.e;
                ibnx.b(object0);
                exnd1 = exnd0;
                object2 = ((List)object0).iterator();
                break;
            }
            case 2: {
                object2 = ezaj0.a;
                exnd1 = ezaj0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            ((ggtj)this.a.h()).B("forwarding remote command to reachable nodes. id:%s", ((NodeParcelable)object3).a);
            ibuq.e(((NodeParcelable)object3).a, "getId(...)");
            ezaj0.e = exnd1;
            ezaj0.a = object2;
            ezaj0.d = 2;
            byte[] arr_b = exnd1.toBytesArray();
            MessageOptions messageOptions0 = new MessageOptions(1);
            evql evql1 = this.b.j(((NodeParcelable)object3).a, "/activeunlock/remotecommand", arr_b, messageOptions0);
            evql1.A(new ezai(this));
            Object object4 = ictn.b(evql1, ezaj0);
            if(object4 != object1) {
                object4 = ibom.a;
            }
            if(object4 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

