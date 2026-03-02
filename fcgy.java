import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import j..util.Collection.-EL;
import j..util.stream.Stream;
import java.util.List;

public final class fcgy implements evqf {
    public final BackupOptInChimeraActivity a;

    public fcgy(BackupOptInChimeraActivity backupOptInChimeraActivity0) {
        this.a = backupOptInChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Stream stream0 = Collection.-EL.stream(((List)object0));
        BackupOptInChimeraActivity backupOptInChimeraActivity0 = this.a;
        if(!stream0.anyMatch(new fcha(backupOptInChimeraActivity0))) {
            BackupOptInChimeraActivity.j.f("Supplied nodeId is not connected to this device", new Object[0]);
            fcgr.b(backupOptInChimeraActivity0, 0x7F1508E3, backupOptInChimeraActivity0.w);  // string:common_something_went_wrong "Something went wrong"
            return;
        }
        BackupOptInChimeraActivity.j.j("Connected to supplied nodeId, fetching accounts from the watch", new Object[0]);
        evql evql0 = backupOptInChimeraActivity0.s.g(backupOptInChimeraActivity0.q);
        evql0.b(new fchb(backupOptInChimeraActivity0));
        evql0.A(new fchc(backupOptInChimeraActivity0));
    }
}

