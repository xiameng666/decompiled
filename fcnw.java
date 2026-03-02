import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcnw implements glzn {
    public final fezf a;

    public fcnw(fezf fezf0) {
        this.a = fezf0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        BackupSettingsListenerChimeraService.a.n("Failed to complete task: enableBackup", ((Throwable)object0), new Object[0]);
        if(this.a.f) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezg.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fezg)hftp0.b_message).c = 1;
            ((fezg)hftp0.b_message).b |= 1;
            return gmbu.i(((fezg)hftp0.N_build()).toBytesArray());
        }
        return gmbu.h(((Throwable)object0));
    }
}

