import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcod implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        BackupSettingsListenerChimeraService.a.h("fetchBackupStats successfully completed", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezl fezl0 = (fezl)hftp0.b_message;
        ((fexq)object0).getClass();
        fezl0.c = (fexq)object0;
        fezl0.b |= 1;
        return ((fezl)hftp0.N_build()).toBytesArray();
    }
}

