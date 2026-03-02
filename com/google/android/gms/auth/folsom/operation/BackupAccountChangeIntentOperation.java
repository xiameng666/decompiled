package com.google.android.gms.auth.folsom.operation;

import a;
import ajvt;
import ajxc;
import akbi;
import akbl;
import akbm;
import akbn;
import akbo;
import akdv;
import akea;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import baun;
import bbdg;
import cchj;
import ccmq;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import hpuq;
import hput;
import hpvi;

public class BackupAccountChangeIntentOperation extends IntentOperation {
    private static final baun a;

    static {
        BackupAccountChangeIntentOperation.a = akea.a("BackupAccountChangeIntentOperation");
    }

    public BackupAccountChangeIntentOperation() {
    }

    public BackupAccountChangeIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        long v2;
        ccmq.a().a(bbdg.mM);
        if(!"com.google.android.gms.backup.BackupAccountChanged".equals(intent0.getAction())) {
            Object[] arr_object = {intent0.getAction()};
            BackupAccountChangeIntentOperation.a.d("Unexpected action, ignoring: %s", arr_object);
            return;
        }
        if(!akdv.b) {
            BackupAccountChangeIntentOperation.a.h("Build is lower than P. No need to handle action [%s]", new Object[]{"com.google.android.gms.backup.BackupAccountChanged"});
            return;
        }
        if(hpuq.c()) {
            ajvt.e(this, 3);
        }
        Account[] arr_account = cchj.b(AppContextProvider.a()).p("com.google");
        int v = 0;
        while(v < arr_account.length) {
            Account account0 = arr_account[v];
            akbm akbm0 = new akbm();
            akbm0.a = account0;
            akbm0.b = akbn.h;
            akbo akbo0 = akbm0.a();
            try {
                akbl akbl0 = new akbl(akbo0);
                if(!hpvi.c()) {
                    ajxc ajxc0 = akbl0.c("chromesync");
                    Long long0 = (Long)ajxc0.j.get("chromesync");
                    if((long0 == null ? 0L : ((long)long0)) != 0L) {
                        akbl0.F(ajxc0);
                        goto label_52;
                    }
                }
                if(hput.a.c().L()) {
                    FolsomGcmTaskChimeraService.g(AppContextProvider.a(), akbl0.e.name);
                }
                else {
                    try {
                        ajxc ajxc1 = akbl0.c("chromesync");
                        if(akbl.y("chromesync")) {
                            Long long1 = (Long)ajxc1.i.get("chromesync");
                            long v1 = long1 == null ? 0L : ((long)long1);
                            Account account1 = akbl0.e;
                            boolean z = akbl0.h.d(account1);
                            if(z && v1 == 0L) {
                                if(!akbl0.c.y(account1.name, "chromesync") && !akbl0.c.A(account1.name)) {
                                    v1 = 0L;
                                }
                                else {
                                    goto label_51;
                                }
                            }
                            if(v1 != 0L) {
                                Boolean boolean0 = (Boolean)ajxc1.k.get("chromesync");
                                if(z == (boolean0 == null ? false : boolean0.booleanValue())) {
                                    goto label_40;
                                }
                                goto label_51;
                            }
                        label_40:
                            Long long2 = (Long)ajxc1.j.get("chromesync");
                            if(long2 == null) {
                                goto label_47;
                            }
                            else {
                                v2 = (long)long2;
                            }
                            goto label_48;
                        }
                    }
                    catch(akbi akbi0) {
                        a.ae(akbl.b.j(), "Error during shouldSyncSecurityDomainMembersAndMetadata call.", akbi0);
                    }
                    goto label_52;
                label_47:
                    v2 = 0L;
                label_48:
                    if(v2 == 0L) {
                        FolsomGcmTaskChimeraService.g(AppContextProvider.a(), akbl0.e.name);
                        goto label_52;
                    label_51:
                        FolsomGcmTaskChimeraService.g(AppContextProvider.a(), akbl0.e.name);
                    }
                }
            }
            catch(akbi unused_ex) {
            }
        label_52:
            ++v;
        }
    }
}

