import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Objects;

public final class bybb implements byax {
    public bybh a;
    public final icnl b;
    private final icnj c;

    public bybb() {
        icnl icnl0 = icnm.a(null);
        this.b = icnl0;
        this.c = icnl0;
    }

    @Override  // byax
    public final Object a(Intent intent0, Context context0, ibrl ibrl0) {
        byba byba0;
        if((ibrl0 instanceof byba)) {
            byba0 = (byba)ibrl0;
            int v = byba0.c;
            if((v & 0x80000000) == 0) {
                byba0 = new byba(this, ibrl0);
            }
            else {
                byba0.c = v - 0x80000000;
            }
        }
        else {
            byba0 = new byba(this, ibrl0);
        }
        Object object0 = byba0.a;
        Object object1 = ibrx.a;
        switch(byba0.c) {
            case 0: {
                ibnx.b(object0);
                byba0.c = 1;
                object0 = bybg.c(intent0, context0, new bxql(context0), byba0);
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
        byag byag0 = (byag)((ibns)object0).a;
        this.a = (bybh)((ibns)object0).b;
        ibuq.f(byag0, "request");
        if((byag0 instanceof byaf)) {
            Log.e("CredentialSelector", "Received invalid request");
            this.b.g(byag0);
            return ibom.a;
        }
        if(!(byag0 instanceof byae) && !(byag0 instanceof byad)) {
            if(!(byag0 instanceof byab) && !(byag0 instanceof byac)) {
                throw new ibnq();
            }
            Log.e("CredentialSelector", "Received unexpected cancel or close request");
            byaf byaf0 = new byaf(byag0.b);
            this.b.g(byaf0);
            return ibom.a;
        }
        this.b.g(byag0);
        return ibom.a;
    }

    @Override  // byax
    public final icnj b() {
        return this.c;
    }

    public final Intent c(bxzw bxzw0) {
        klg klg0;
        kls kls0;
        byag byag0 = (byag)this.b.b();
        if((byag0 instanceof byae)) {
            switch(bxzw0.a) {
                case 0: {
                    kls0 = new kls("No credentials available");
                    break;
                }
                case 1: {
                    kls0 = new klk("User cancelled the selector");
                    break;
                }
                default: {
                    kls0 = new klo("The UI was interrupted - please try again.");
                }
            }
            Intent intent0 = new Intent();
            kwr.g(intent0, kls0);
            return intent0;
        }
        if((byag0 instanceof byad)) {
            switch(bxzw0.a) {
                case 0: {
                    klg0 = new klg("No create options available.");
                    break;
                }
                case 1: {
                    klg0 = new klb("User cancelled the selector");
                    break;
                }
                default: {
                    klg0 = new klf("The UI was interrupted - please try again.");
                }
            }
            Intent intent1 = new Intent();
            kwr.e(intent1, klg0);
            return intent1;
        }
        Class class0 = this.c.getClass();
        Objects.toString(class0);
        Log.e("CredentialSelector", "Unexpected type of request: " + class0);
        return null;
    }
}

