package com.google.android.gms.accountsettings.operations;

import aasx;
import aawb;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import baun;
import bbmn;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import java.util.ArrayList;
import oqj;
import oqr;
import zgx;
import zkl;
import zkp;
import zkw;

public class AccountChangedIntentOperation extends aawb {
    static final baun a;
    public Context b;
    public RepositoryDatabase c;

    static {
        AccountChangedIntentOperation.a = new baun("AccountSettings", new String[]{"AcctChgOp"});
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((aasx)zgx.a(aasx.class, this.f)).a(this);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        baun baun0 = AccountChangedIntentOperation.a;
        baun0.j("Handle intent-operations: %s", new Object[]{intent0});
        if(intent0 != null && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent0.getAction())) {
            baun0.j("Remove data for obsolete accounts", new Object[0]);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: bbmn.h(this.b, "com.google.android.gms")) {
                arrayList0.add(((Account)object0).name);
            }
            RepositoryDatabase repositoryDatabase0 = this.c;
            zkl zkl0 = repositoryDatabase0.w();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("DELETE FROM resource_info WHERE accountName NOT IN (");
            oqr.a(stringBuilder0, arrayList0.size());
            stringBuilder0.append(")");
            oqj.b(((zkw)zkl0).a, false, true, new zkp(stringBuilder0.toString(), arrayList0));
            if(arrayList0.isEmpty()) {
                repositoryDatabase0.u().b();
            }
        }
    }
}

