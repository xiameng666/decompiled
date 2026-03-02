import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fcgs implements Predicate {
    public final BackupOptInChimeraActivity a;

    public fcgs(BackupOptInChimeraActivity backupOptInChimeraActivity0) {
        this.a = backupOptInChimeraActivity0;
    }

    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        String s = ((fexs)object0).c;
        String s1 = this.a.r;
        gftb.check(s1);
        return gfqz.e(s, s1);
    }
}

