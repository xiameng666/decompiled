import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

public final class bevy {
    private static final bboh a;
    private final bcyv b;
    private final Context c;
    private final bdzt d;
    private final aysr e;

    static {
        bevy.a = bboh.b("PasswordChangesSubscriber", bbcu.cX);
    }

    public bevy(bcyv bcyv0, bdzt bdzt0, aysr aysr0, Context context0) {
        this.b = bcyv0;
        this.d = bdzt0;
        this.e = aysr0;
        this.c = context0;
    }

    public final Object a(evql evql0, ibrl ibrl0) {
        bevw bevw0;
        if((ibrl0 instanceof bevw)) {
            bevw0 = (bevw)ibrl0;
            int v = bevw0.c;
            if((v & 0x80000000) == 0) {
                bevw0 = new bevw(this, ibrl0);
            }
            else {
                bevw0.c = v - 0x80000000;
            }
        }
        else {
            bevw0 = new bevw(this, ibrl0);
        }
        Object object0 = bevw0.a;
        Object object1 = ibrx.a;
        switch(bevw0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bevw0.c = 1;
                    if(ictn.b(evql0, bevw0) == object1) {
                        return object1;
                    label_17:
                        ibnx.b(object0);
                        return ibom.a;
                    }
                    return ibom.a;
                }
                catch(aztb aztb0) {
                    break;
                }
                catch(CancellationException cancellationException0) {
                    a.ae(bevy.a.j(), "Subscribing for password updates cancelled.", cancellationException0);
                    return ibom.a;
                }
            }
            case 1: {
                goto label_17;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bevy.a.j(), "Subscribing for password updates failed.", aztb0);
        return ibom.a;
    }

    public static Object b(bevy bevy0, ibrl ibrl0) {
        Object object3;
        bevy bevy1;
        Object object2;
        bevx bevx0;
        if((ibrl0 instanceof bevx)) {
            bevx0 = (bevx)ibrl0;
            int v = bevx0.e;
            if((v & 0x80000000) == 0) {
                bevx0 = new bevx(bevy0, ibrl0);
            }
            else {
                bevx0.e = v - 0x80000000;
            }
        }
        else {
            bevx0 = new bevx(bevy0, ibrl0);
        }
        Object object0 = bevx0.c;
        Object object1 = ibrx.a;
        switch(bevx0.e) {
            case 0: {
                ibnx.b(object0);
                Intent intent0 = IntentOperation.getStartIntent(bevy0.c, "com.google.android.gms.credential.manager.operations.PasswordChangesIntentOperation", "com.google.android.gms.credential.manager.operations.PASSWORDS_UPDATED");
                if(intent0 == null) {
                    object2 = null;
                }
                else {
                    intent0.putExtra("component_name", "credential_manager");
                    object2 = intent0;
                }
                if(object2 != null) {
                    bevy1 = bevy0;
                    object3 = bevy0.b.a().iterator();
                    goto label_28;
                }
                return ibom.a;
            }
            case 1: {
                object3 = bevx0.b;
                object2 = bevx0.a;
                bevy1 = bevx0.f;
                ibnx.b(object0);
            label_28:
                while(((Iterator)object3).hasNext()) {
                    Object object4 = ((Iterator)object3).next();
                    evql evql0 = bevy1.d.a(((String)object4)).g(((Intent)object2));
                    bevx0.f = bevy1;
                    bevx0.a = object2;
                    bevx0.b = object3;
                    bevx0.e = 1;
                    if(bevy1.a(evql0, bevx0) == object1) {
                        return object1;
                    }
                }
                evql evql1 = bevy1.e.g(((Intent)object2));
                bevx0.f = null;
                bevx0.a = null;
                bevx0.b = null;
                bevx0.e = 2;
                return bevy1.a(evql1, bevx0) == object1 ? object1 : ibom.a;
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

