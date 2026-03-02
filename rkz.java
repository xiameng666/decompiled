import android.content.Context;
import android.os.PersistableBundle;
import androidx.activity.result.ActivityResult;
import com.android.onboarding.pending.PendingContract.ErasedActivity;
import com.android.onboarding.utils.persistable.PersistableIntent;

final class rkz implements rla {
    final rlj a;
    private final sdg b;
    private final rjr c;
    private final ibzw d;
    private final ibtx e;

    public rkz(rlj rlj0, sdg sdg0, rjr rjr0, ibzw ibzw0, ibtx ibtx0) {
        ibuq.f(rjr0, "contract");
        this.a = rlj0;
        super();
        this.b = sdg0;
        this.c = rjr0;
        this.d = ibzw0;
        this.e = ibtx0;
    }

    @Override  // rla
    public final rkx a(scz scz0, Object object0) {
        ibuq.f(scz0, "session");
        PersistableBundle persistableBundle0 = scz0.a();
        Context context0 = this.a.g();
        PendingContract.ErasedActivity pendingContract$ErasedActivity0 = this.c.i(context0, object0);
        PersistableIntent persistableIntent0 = ((rvp)this.a.k()).q();
        int v = rri.a();
        rly rly0 = new rly(persistableBundle0, pendingContract$ErasedActivity0, this.a, persistableIntent0, this.d, this.a.f, false, v);
        return new rkv(this.c instanceof rko, rly0);
    }

    public final Object b(PersistableBundle persistableBundle0, ActivityResult activityResult0, Boolean boolean0, ibrl ibrl0) {
        rky rky0;
        if((ibrl0 instanceof rky)) {
            rky0 = (rky)ibrl0;
            int v = rky0.c;
            if((v & 0x80000000) == 0) {
                rky0 = new rky(this, ibrl0);
            }
            else {
                rky0.c = v - 0x80000000;
            }
        }
        else {
            rky0 = new rky(this, ibrl0);
        }
        Object object0 = rky0.a;
        Object object1 = ibrx.a;
        switch(rky0.c) {
            case 0: {
                ibnx.b(object0);
                Object object2 = this.b.c(persistableBundle0);
                if(object2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if(ibuq.m(boolean0, Boolean.valueOf(true))) {
                    throw new IllegalStateException("No failure callback defined");
                }
                Object object3 = this.c.b.fm(activityResult0);
                rky0.c = 2;
                Object object4 = this.e.a(((scz)object2), object3, rky0);
                return object4 == object1 ? object1 : object4;
            }
            case 1: {
                ibnx.b(object0);
                if(((rkx)object0) != null) {
                    return (rkx)object0;
                }
                throw new IllegalStateException("No failure callback defined");
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

