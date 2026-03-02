import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcoc implements glzn {
    public final fezm a;

    public fcoc(fezm fezm0) {
        this.a = fezm0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        BackupSettingsListenerChimeraService.a.n("Failed to complete task: fetchBackupStorageQuota", ((Throwable)object0), new Object[0]);
        if(this.a.d) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezn.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fezn)hftp0.b_message).d = 1;
            ((fezn)hftp0.b_message).b |= 2;
            return gmbu.i(((fezn)hftp0.N_build()).toBytesArray());
        }
        return gmbu.h(((Throwable)object0));
    }
}

