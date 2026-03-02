import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcny implements glzn {
    public final boolean a;

    public fcny(boolean z) {
        this.a = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        BackupSettingsListenerChimeraService.a.n("Failed to complete task: isBackupEnabled", ((Throwable)object0), new Object[0]);
        if(this.a) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexn.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fexn)hftp0.b_message).d = 1;
            ((fexn)hftp0.b_message).b |= 2;
            return gmbu.i(((fexn)hftp0.N_build()).toBytesArray());
        }
        return gmbu.h(((Throwable)object0));
    }
}

