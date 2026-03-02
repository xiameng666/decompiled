import com.google.android.gms.wearable.backup.wear.RestoreWearListenerChimeraService;

public final class fcrn implements glzn {
    public final fezp a;

    public fcrn(fezp fezp0) {
        this.a = fezp0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        RestoreWearListenerChimeraService.a.n("Failed to complete get_devices", ((Throwable)object0), new Object[0]);
        if(this.a.d) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezs.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fezs)hftp0.b_message).d = ((((Throwable)object0) instanceof acse) ? 3 : 2) - 1;
            ((fezs)hftp0.b_message).b |= 1;
            return gmbu.i(((fezs)hftp0.N_build()).toBytesArray());
        }
        return gmbu.h(((Throwable)object0));
    }
}

