import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcoe implements glzn {
    public final boolean a;

    public fcoe(boolean z) {
        this.a = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        BackupSettingsListenerChimeraService.a.n("Failed to complete task: fetchBackupStats", ((Throwable)object0), new Object[0]);
        if(this.a) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezl.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fezl)hftp0.b_message).d = 1;
            ((fezl)hftp0.b_message).b |= 2;
            return gmbu.i(((fezl)hftp0.N_build()).toBytesArray());
        }
        return gmbu.h(((Throwable)object0));
    }
}

