import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;

public final class egsj implements lqj {
    public final egsq a;

    public egsj(egsq egsq0) {
        this.a = egsq0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        boolean z = ((evql)object0).n();
        egsq egsq0 = this.a;
        if(!z) {
            a.ae(egsq.a.i(), "Error loading backup state", ((evql)object0).i());
            egsq0.G(4, ((evql)object0));
            egsq0.F();
            egsq0.E();
            egsq0.A();
            egsq0.ai.setVisibility(0);
            return;
        }
        int v = egvc.c(((BackupAndSyncOptInState)((evql)object0).j()));
        egvc egvc0 = egsq0.av;
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
        ((giqr)hftp0.b_message).e = v - 1;
        ((giqr)hftp0.b_message).b |= 4;
        egvc0.d(5, ((giqr)hftp0.N_build()), egxj.g(egsq0.b));
        BackupAndSyncOptInState backupAndSyncOptInState0 = (BackupAndSyncOptInState)((evql)object0).j();
        if(egxj.o(backupAndSyncOptInState0)) {
            egsq0.E();
            egsq0.A();
            egsq0.ai.setVisibility(0);
            return;
        }
        egsq0.al = new ArrayList();
        String[] arr_s = backupAndSyncOptInState0.d;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            egsq0.al.add(egxj.a(arr_s[v1]));
        }
        boolean z1 = hwzg.g() ? egxj.n(backupAndSyncOptInState0, egsq0.ar) : egxj.m(backupAndSyncOptInState0);
        if(egsq0.at) {
            egsq0.ah.c(z1);
        }
        else {
            egsq0.ag.setChecked(z1);
        }
        if(!egsq0.ap) {
            egsq0.I(9, z1);
            egsq0.ap = true;
        }
        if(z1) {
            egsq0.c.a(backupAndSyncOptInState0.a).g(egsq0, new egsg(egsq0));
            if(!egsq0.am.getText().toString().equals("Contacts will start syncing soon")) {
                if(egsq0.ao) {
                    egsq0.an.k(egsq0);
                }
                egsq0.am.setVisibility(8);
            }
        }
        else {
            if(egsq0.ao) {
                egsq0.an.k(egsq0);
            }
            egsq0.an.g(egsq0, new egsh(egsq0));
            egsq0.A();
        }
        if(egsq0.as && egxj.n(backupAndSyncOptInState0, false) && hwzg.f() && hwzg.g()) {
            egxm egxm0 = new egxm();
            egxm0.setCancelable(false);
            egsq0.H(45);
            egxm0.showNow(egsq0.getChildFragmentManager(), "v1_to_v2_sheepdog_opt_in");
            egsq0.as = false;
        }
    }
}

