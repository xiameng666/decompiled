import android.os.PersistableBundle;
import android.os.Process;
import com.android.onboarding.pending.PendingContract.ErasedTask;
import com.android.onboarding.pending.PendingTaskContract;
import com.android.onboarding.utils.persistable.PersistableIntent;

final class rlf implements rla {
    final rlj a;
    private final sdg b;
    private final rna c;
    private final ibts d;
    private final ibts e;
    private final ibzw f;
    private final ibts g;
    private final ibtx h;
    private final ibtw i;

    public rlf(rlj rlj0, sdg sdg0, rna rna0, ibts ibts0, ibts ibts1, ibzw ibzw0, ibts ibts2, ibtx ibtx0, ibtw ibtw0) {
        ibuq.f(rna0, "resultDecoder");
        this.a = rlj0;
        super();
        this.b = sdg0;
        this.c = rna0;
        this.d = ibts0;
        this.e = ibts1;
        this.f = ibzw0;
        this.g = ibts2;
        this.h = ibtx0;
        this.i = ibtw0;
    }

    @Override  // rla
    public final rkx a(scz scz0, Object object0) {
        ibuq.f(scz0, "session");
        Object object1 = this.e.a(object0);
        boolean z = ((Boolean)this.d.a(object0)).booleanValue();
        PersistableBundle persistableBundle0 = scz0.a();
        PersistableIntent persistableIntent0 = ((rvp)this.a.k()).q();
        Object object2 = this.g.a(object1);
        int v = Process.myUserHandle().getIdentifier();
        int v1 = ((PendingTaskContract)object1).d.getInt("com.android.onboarding.pending.TARGET_USER_ID", v);
        return this.i == null ? new rkw(z, new rmd(persistableBundle0, ((PendingContract.ErasedTask)object1), this.a, persistableIntent0, ((roo)object2), this.f, this.a.f, false, v1)) : new rkw(z, new rmd(persistableBundle0, ((PendingContract.ErasedTask)object1), this.a, persistableIntent0, ((roo)object2), this.f, this.a.f, true, v1));
    }

    public final Object b(PersistableBundle persistableBundle0, PersistableBundle persistableBundle1, Boolean boolean0, ibrl ibrl0) {
        rle rle0;
        if((ibrl0 instanceof rle)) {
            rle0 = (rle)ibrl0;
            int v = rle0.c;
            if((v & 0x80000000) == 0) {
                rle0 = new rle(this, ibrl0);
            }
            else {
                rle0.c = v - 0x80000000;
            }
        }
        else {
            rle0 = new rle(this, ibrl0);
        }
        Object object0 = rle0.a;
        Object object1 = ibrx.a;
        switch(rle0.c) {
            case 0: {
                ibnx.b(object0);
                Object object2 = sdf.a(this.b, persistableBundle0);
                if(object2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if(!ibuq.m(boolean0, Boolean.valueOf(true))) {
                    goto label_23;
                }
                ibtw ibtw0 = this.i;
                if(ibtw0 == null) {
                    throw new IllegalStateException("No failure callback defined");
                }
                rle0.c = 1;
                object0 = ibtw0.a(((scz)object2), rle0);
                if(object0 == object1) {
                    return object1;
                label_23:
                    Object object3 = this.c.fm(persistableBundle1);
                    rle0.c = 2;
                    Object object4 = this.h.a(((scz)object2), object3, rle0);
                    return object4 == object1 ? object1 : object4;
                }
                goto label_29;
            }
            case 1: {
                ibnx.b(object0);
            label_29:
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

