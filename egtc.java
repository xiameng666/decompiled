import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

public final class egtc implements evqf {
    public final ContactsSyncCoreChimeraActivity a;

    public egtc(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity0) {
        this.a = contactsSyncCoreChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        int v = egvc.c(((BackupAndSyncOptInState)object0));
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
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giqr)hftv1).d = 1;
        ((giqr)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity0 = this.a;
        ((giqr)hftp0.b_message).e = v - 1;
        ((giqr)hftp0.b_message).b |= 4;
        giqr giqr0 = (giqr)hftp0.N_build();
        contactsSyncCoreChimeraActivity0.m.d(2, giqr0, null);
        if(egxj.o(((BackupAndSyncOptInState)object0))) {
            contactsSyncCoreChimeraActivity0.k.f();
            return;
        }
        if(egxj.p(((BackupAndSyncOptInState)object0))) {
            contactsSyncCoreChimeraActivity0.k.h();
            return;
        }
        contactsSyncCoreChimeraActivity0.k.g();
    }
}

