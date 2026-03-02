import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcnu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        BackupSettingsListenerChimeraService.a.h("refreshBackupStatus successfully completed", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbo ffbo0 = (ffbo)hftp0.b_message;
        ((fext)object0).getClass();
        ffbo0.c = (fext)object0;
        ffbo0.b |= 1;
        return ((ffbo)hftp0.N_build()).toBytesArray();
    }
}

