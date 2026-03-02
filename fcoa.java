import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcoa implements glzn {
    public final fezb a;

    public fcoa(fezb fezb0) {
        this.a = fezb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        BackupSettingsListenerChimeraService.a.n("Failed to complete task: disableBackup", ((Throwable)object0), new Object[0]);
        if(this.a.d) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fezc)hftp0.b_message).c = 1;
            ((fezc)hftp0.b_message).b |= 1;
            return gmbu.i(((fezc)hftp0.N_build()).toBytesArray());
        }
        return gmbu.h(((Throwable)object0));
    }
}

