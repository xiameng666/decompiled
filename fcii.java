import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fcii implements Predicate {
    public final BackupSettingsChimeraActivity a;

    public fcii(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
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
        return ((NodeParcelable)object0).a.equals(this.a.r);
    }
}

