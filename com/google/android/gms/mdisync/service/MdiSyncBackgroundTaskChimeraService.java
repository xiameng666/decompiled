package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import cqek;
import cqfl;
import cqfn;
import cqgt;
import cqgx;
import cqgy;
import cqgz;
import gful_cronetEngineProvider;
import gfus;
import ggtl;
import hvem;
import java.util.List;
import java.util.Map;

public class MdiSyncBackgroundTaskChimeraService extends GmsTaskChimeraService {
    public static final int a;
    private static final ggtl b;
    private final gful_cronetEngineProvider c;

    static {
        MdiSyncBackgroundTaskChimeraService.b = cqek.b();
    }

    public MdiSyncBackgroundTaskChimeraService() {
        this(((gful_cronetEngineProvider)new cqfl()));
    }

    public MdiSyncBackgroundTaskChimeraService(gful_cronetEngineProvider gful0) {
        this.c = gfus.a(gful0);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        int v3;
        Object object0;
        cqgy cqgy0;
        cqgx cqgx0;
        if(!hvem.g()) {
            MdiSyncBackgroundTaskChimeraService.b.h().ar(7093).B("Disabled - skipping handling of task \'%s\'.", cllr0.a);
            return 2;
        }
        cqfn cqfn0 = (cqfn)this.c.mr();
        String s = cllr0.a;
        cqfn.a.h().ar(7094).B("Dispatching task \'%s\'...", s);
        int v = s.lastIndexOf(0x5F);
        boolean z = false;
        if(v != -1) {
            try {
                cqgx0 = cqgx.b(Integer.parseInt(s.substring(0, v)));
                if(cqgx0 == null) {
                    goto label_13;
                }
                goto label_14;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
    label_13:
        cqgx0 = cqgx.a;
    label_14:
        if(cqgx0 == cqgx.a) {
            object0 = null;
        }
        else {
            cqgy[] arr_cqgy = cqgy.values();
            for(int v1 = 0; true; ++v1) {
                cqgy0 = null;
                if(v1 >= arr_cqgy.length) {
                    break;
                }
                cqgy cqgy1 = arr_cqgy[v1];
                if(s.endsWith(cqgy1.c)) {
                    cqgy0 = cqgy1;
                    break;
                }
            }
            object0 = cqgy0 == null ? null : new cqgz(cqgx0, cqgy0);
        }
        if(object0 == null) {
            cqek.a().j().p(((int)hvem.b())).ar(7100).B("Invalid task tag \'%s\'!", s);
            return 2;
        }
        cqgx cqgx1 = object0.a;
        cqgt cqgt0 = (cqgt)cqfn0.b.get(cqgx1);
        if(cqgt0 == null) {
            v3 = 0;
        }
        else {
            cqfn.a.h().ar(7098).B("Running singleton-scoped task \'%s\'...", object0);
            int v2 = cqfn.a(0, cqfn0.b(((cqgz)object0), cqgt0, null));
            cqfn.a.h().ar(7099).P("Singleton-scoped task \'%s\' finished with result \'%d\'!", object0, v2);
            v3 = v2;
            z = true;
        }
        for(Object object1: ((List)cqfn0.d.mr())) {
            Account account0 = (Account)object1;
            cqgt cqgt1 = (cqgt)((Map)cqfn0.c.apply(account0)).get(cqgx1);
            if(cqgt1 != null) {
                cqfn.a.h().ar(7097).B("Running account-scoped task \'%s\'...", object0);
                v3 = cqfn.a(v3, cqfn0.b(((cqgz)object0), cqgt1, account0));
                z = true;
            }
        }
        if(!z) {
            cqek.a().j().p(((int)hvem.b())).ar(7096).B("Task \'%s\' has no registered task handlers!", object0);
            return 2;
        }
        cqfn.a.h().ar(7095).P("Task \'%s\' finished with result \'%d\'!", object0, v3);
        return v3;
    }
}

