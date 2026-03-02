package com.google.android.gms.statementservice;

import a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.verify.domain.DomainVerificationRequest;
import android.os.Bundle;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import com.google.android.chimera.IntentOperation;
import eryo;
import eryp;
import eryq;
import eryr;
import eryu;
import eryx;
import ggtj;
import hykw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class DomainVerificationIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        DomainVerificationIntentOperation.a = bboh.b("AppLinksIntentOperation", bbcu.dU);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ArrayList arrayList0;
        ccmq.a().a(bbdg.bS);
        String s = intent0.getAction();
        if(s != null && s.equals("android.intent.action.DOMAINS_NEED_VERIFICATION")) {
            Context context0 = this.getApplicationContext();
            if(hykw.c()) {
                ((ggtj)DomainVerificationIntentOperation.a.h()).x("Verifying requested domains");
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 != null && bundle0.containsKey("android.content.pm.verify.domain.extra.VERIFICATION_REQUEST")) {
                    DomainVerificationRequest domainVerificationRequest0 = (DomainVerificationRequest)bundle0.getParcelable("android.content.pm.verify.domain.extra.VERIFICATION_REQUEST");
                    arrayList0 = domainVerificationRequest0 != null && domainVerificationRequest0.getPackageNames() != null ? new ArrayList(domainVerificationRequest0.getPackageNames()) : new ArrayList();
                }
                else {
                    arrayList0 = new ArrayList();
                }
                eryq eryq0 = new eryq(context0);
                List list0 = eryr.c(arrayList0, eryq0);
                new eryo(this.getApplicationContext()).b(list0);
                if(hykw.d() && hykw.d()) {
                    if(!hykw.d()) {
                        ((ggtj)eryp.a.h()).z("Skipping %d input requests (flag disabled)", list0.size());
                        return;
                    }
                    ((ggtj)eryp.a.h()).z("Processing %d input requests", list0.size());
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: list0) {
                        eryx eryx0 = (eryx)object0;
                        String s1 = eryx0.b;
                        try {
                            List list1 = eryu.f(s1, context0);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            a.e(eryp.a.i(), "Could not find package to verify: %s", packageManager$NameNotFoundException0.getMessage(), packageManager$NameNotFoundException0);
                            goto label_43;
                        }
                        if(list1.contains("F9:A8:F7:5A:7F:0B:5D:2C:CA:E8:C2:B5:70:85:56:40:E7:09:99:55:58:CD:97:06:AF:74:B8:4E:68:96:2F:AA")) {
                            HashSet hashSet0 = new HashSet(eryx0.d);
                            int v = eryo.a(eryx0.c, hashSet0, 1, eryx0.b, eryq0);
                            if(v == -1) {
                                ((ggtj)eryp.a.j()).B("No hosts specified for %s", s1);
                            }
                            else {
                                if(v == 0) {
                                    continue;
                                }
                                ((ggtj)eryp.a.i()).x("Failed to notify DomainManager");
                                if(v != 0) {
                                    goto label_43;
                                }
                                continue;
                            }
                        }
                    label_43:
                        arrayList1.add(eryx0);
                    }
                    ((ggtj)eryp.a.h()).z("Returning %d non-WebAPK requests", arrayList1.size());
                }
            }
            else {
                ((ggtj)DomainVerificationIntentOperation.a.j()).x("SC+ verification of app links not yet enabled");
            }
        }
    }
}

