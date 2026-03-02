import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Collection.-EL;
import j..util.Optional;
import j..util.stream.Stream;
import java.util.List;

public final class fcht implements evqf {
    public final BackupSettingsChimeraActivity a;

    public fcht(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Stream stream0 = Collection.-EL.stream(((List)object0));
        BackupSettingsChimeraActivity backupSettingsChimeraActivity0 = this.a;
        Optional optional0 = stream0.filter(new fcii(backupSettingsChimeraActivity0)).findFirst();
        if(optional0.isPresent()) {
            backupSettingsChimeraActivity0.s = ((NodeParcelable)optional0.get()).b;
            fcmc fcmc0 = backupSettingsChimeraActivity0.A;
            String s = backupSettingsChimeraActivity0.r;
            evqp evqp0 = new evqp();
            evrg.g(((gged_interceptors)Collection.-EL.stream(fcmc0.a.getBondedDevices()).map(new fcma(fcmc0, s, evqp0)).collect(ggaf.a))).b(new fcmb(evqp0));
            fchw fchw0 = new fchw(backupSettingsChimeraActivity0);
            evqp0.a.b(fchw0);
            fchx fchx0 = new fchx();
            evqp0.a.A(fchx0);
            fchy fchy0 = new fchy(backupSettingsChimeraActivity0);
            evqp0.a.z(fchy0);
            return;
        }
        BackupSettingsChimeraActivity.j.f("Supplied nodeId is not connected to this device", new Object[0]);
        fcgr.b(backupSettingsChimeraActivity0, 0x7F1508E3, backupSettingsChimeraActivity0.x);  // string:common_something_went_wrong "Something went wrong"
    }
}

