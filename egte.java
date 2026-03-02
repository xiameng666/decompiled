import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

public final class egte implements lqj {
    public final egtw a;

    public egte(egtw egtw0) {
        this.a = egtw0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        egtw egtw0 = this.a;
        ((giqr)hftp0.b_message).c = 3;
        ((giqr)hftp0.b_message).b |= 1;
        if(((evql)object0).n()) {
            egtw0.d.q();
            BackupAndSyncOptInState backupAndSyncOptInState0 = (BackupAndSyncOptInState)((evql)object0).j();
            if(hwzg.g() && hwzg.f() && backupAndSyncOptInState0 != null && backupAndSyncOptInState0.c == 3) {
                egtw0.d.n(3, new egts(egtw0));
            }
            else if(egxj.p(((BackupAndSyncOptInState)((evql)object0).j()))) {
                egtw0.d.n(3, new egtt(egtw0));
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqr)hftp0.b_message).d = 1;
            ((giqr)hftp0.b_message).b |= 2;
            int v = egvc.c(((BackupAndSyncOptInState)((evql)object0).j()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqr)hftp0.b_message).e = v - 1;
            ((giqr)hftp0.b_message).b |= 4;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqr)hftp0.b_message).d = 2;
            ((giqr)hftp0.b_message).b |= 2;
        }
        egtw0.av.d(3, ((giqr)hftp0.N_build()), egxj.g(egtw0.a));
    }
}

