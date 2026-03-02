import android.app.backup.BackupManagerMonitor;
import android.os.Bundle;
import j..util.Objects;
import java.util.ArrayList;

final class asfo extends BackupManagerMonitor {
    final asfp a;

    public asfo(asfp asfp0) {
        Objects.requireNonNull(asfp0);
        this.a = asfp0;
        super();
    }

    public final void onEvent(Bundle bundle0) {
        asfp.a.j("Backup monitor event", new Object[0]);
        hkye hkye0 = aqqm.a(bundle0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hkye0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hkye0));
        if(((hkxz)hftp0) == null) {
            asfu.a.f("Error logging monitor event", new Object[0]);
            return;
        }
        asfp asfp0 = this.a;
        String s = ((hkye)((hkxz)hftp0).b_message).f;
        if((((hkye)((hkxz)hftp0).b_message).b & 8) == 0) {
            s = "MISC_MONITOR_EVENTS";
        }
        asfu asfu0 = asfp0.f;
        asft asft0 = asfu0.a(s);
        if(!((hkxz)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hkxz)hftp0))).ensureMutable();
        }
        hkye hkye1 = (hkye)((hkxz)hftp0).b_message;
        hkye1.b &= -9;
        hkye1.f = hkye.a.f;
        hkye hkye2 = (hkye)((ProtoLiteBuilder)(((hkxz)hftp0))).N_build();
        if(asft0.b == null) {
            asft0.b = new ArrayList();
        }
        asft0.b.add(hkye2);
        asfu0.b.put(s, asft0);
    }
}

