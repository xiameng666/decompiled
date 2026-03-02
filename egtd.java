import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

public final class egtd implements evqc {
    public final ContactsSyncCoreChimeraActivity a;

    public egtd(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity0) {
        this.a = contactsSyncCoreChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqr)hftv0).c = 3;
        ((giqr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqr)hftp0.b_message).d = 2;
        ((giqr)hftp0.b_message).b |= 2;
        giqr giqr0 = (giqr)hftp0.N_build();
        this.a.m.d(2, giqr0, null);
        a.ae(ContactsSyncCoreChimeraActivity.j.i(), "BackupClient failure", exception0);
        this.a.k.f();
    }
}

