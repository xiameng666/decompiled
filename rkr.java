import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingContract.Activity;
import com.android.onboarding.pending.PendingContract.ErasedActivity;

final class rkr implements sdg {
    private final sdg a;

    public rkr(sdg sdg0) {
        ibuq.f(sdg0, "deserializer");
        super();
        this.a = sdg0;
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    public final rkx d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("resultType");
        if(s != null) {
            switch(s) {
                case "result": {
                    ibuq.f(this.a, "deserializer");
                    return (rkx)new rks(this.a).c(persistableBundle0);
                }
                case "startActivity": {
                    ibuq.f(persistableBundle0, "persistableBundle");
                    if(!ibuq.m(persistableBundle0.getString("resultType"), "startActivity")) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    Object object1 = sdn.a(persistableBundle0, "contract", PendingContract.Activity.b);
                    if(object1 != null) {
                        return new rku(((PendingContract.ErasedActivity)object1));
                    }
                    throw new IllegalArgumentException("Missing activity");
                }
                case "startActivityForResult": {
                    ibuq.f(persistableBundle0, "persistableBundle");
                    if(!ibuq.m(persistableBundle0.getString("resultType"), "startActivityForResult")) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    boolean z1 = rjc.a(persistableBundle0, "orchestrated");
                    Object object2 = sdn.a(persistableBundle0, "contract", rlv.a);
                    if(object2 != null) {
                        return new rkv(z1, ((rlv)object2));
                    }
                    throw new IllegalArgumentException("Missing activity");
                }
                case "startTaskForResult": {
                    ibuq.f(persistableBundle0, "persistableBundle");
                    if(!ibuq.m(persistableBundle0.getString("resultType"), "startTaskForResult")) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    boolean z = rjc.a(persistableBundle0, "orchestrated");
                    Object object0 = sdn.a(persistableBundle0, "contract", rmb.a);
                    if(object0 != null) {
                        return new rkw(z, ((rmb)object0));
                    }
                    throw new IllegalArgumentException("Missing task");
                }
            }
        }
        sct.e("OrchestratedResult", "No resultType extra - assuming raw result type.");
        return new rkt(((scz)this.a.c(persistableBundle0)));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

