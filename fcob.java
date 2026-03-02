import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcob implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        BackupSettingsListenerChimeraService.a.h("fetchBackupStorageQuota successfully completed", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezn fezn0 = (fezn)hftp0.b_message;
        ((fexu)object0).getClass();
        fezn0.c = (fexu)object0;
        fezn0.b |= 1;
        return ((fezn)hftp0.N_build()).toBytesArray();
    }
}

