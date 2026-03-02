import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

public final class buvc implements buus {
    public final ibth a;
    public static final int b;
    private final Context c;
    private final lap d;
    private final icig e;

    static {
        bboh.b("SelectedAccountRepository", bbcu.fK);
    }

    public buvc(Context context0, lap lap0) {
        ibuq.f(context0, "context");
        ibuq.f(lap0, "selectedAccountDataStore");
        buut buut0 = new buut(context0);
        ibuq.f(context0, "context");
        ibuq.f(lap0, "selectedAccountDataStore");
        super();
        this.c = context0;
        this.a = buut0;
        this.d = lap0;
        this.e = new buuz(lap0.b());
    }

    @Override  // buus
    public final Object a(String s, ibrl ibrl0) {
        buva buva0;
        if((ibrl0 instanceof buva)) {
            buva0 = (buva)ibrl0;
            int v = buva0.c;
            if((v & 0x80000000) == 0) {
                buva0 = new buva(this, ibrl0);
            }
            else {
                buva0.c = v - 0x80000000;
            }
        }
        else {
            buva0 = new buva(this, ibrl0);
        }
        Object object0 = buva0.a;
        Object object1 = ibrx.a;
        switch(buva0.c) {
            case 0: {
                ibnx.b(object0);
                buvb buvb0 = new buvb(s, null);
                buva0.c = 1;
                if(this.d.a(buvb0, buva0) == object1) {
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
        if(htva.a.b().p()) {
            Intent intent0 = new Intent("com.google.android.gms.googlesettings.account.SELECTED_ACCOUNT_UPDATE");
            IntentOperation.startIntentOperations(this.c, intent0);
        }
        return ibom.a;
    }

    @Override  // buus
    public final icig b() {
        return new buuw(this.e, this);
    }
}

