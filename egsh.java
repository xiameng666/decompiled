import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;

public final class egsh implements lqj {
    public final egsq a;

    public egsh(egsq egsq0) {
        this.a = egsq0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        egsq egsq0 = this.a;
        egsq0.ai.setVisibility(0);
        if(!((evql)object0).n()) {
            egsq0.G(5, ((evql)object0));
            egsq0.am.setVisibility(8);
            return;
        }
        BackupAndSyncSuggestion backupAndSyncSuggestion0 = (BackupAndSyncSuggestion)((evql)object0).j();
        if(egsq0.ar) {
            int v = backupAndSyncSuggestion0.a + backupAndSyncSuggestion0.b;
            if(v <= 0) {
                egsq0.am.setVisibility(8);
                return;
            }
            egsq0.am.setVisibility(0);
            egsq0.am.setText(egsq0.getContext().getResources().getQuantityString(0x7F13003E, v, new Object[]{v}));  // plurals:people_backup_sync_v2_contacts_not_backed_up
            return;
        }
        int v1 = backupAndSyncSuggestion0.a;
        egvc egvc0 = egsq0.av;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqr)hftv0).c = 4;
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
        giqr giqr0 = (giqr)hftp0.b_message;
        giqr0.b |= 8;
        giqr0.f = v1;
        egvc0.d(5, ((giqr)hftp0.N_build()), egxj.g(egsq0.b));
        if(v1 <= 0) {
            egsq0.am.setVisibility(8);
            return;
        }
        egsq0.am.setVisibility(0);
        egsq0.am.setText(egsq0.getContext().getResources().getQuantityString(0x7F13003B, v1, new Object[]{v1}));  // plurals:people_backup_sync_contacts_not_backed_up
    }
}

