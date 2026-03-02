import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;

public final class fcnx implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        BackupSettingsListenerChimeraService.a.h("isBackupEnabled successfully completed", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexn.a).v_newBuilder();
        boolean z = ((Boolean)object0).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexn fexn0 = (fexn)hftp0.b_message;
        fexn0.b |= 1;
        fexn0.c = z;
        return ((fexn)hftp0.N_build()).toBytesArray();
    }
}

