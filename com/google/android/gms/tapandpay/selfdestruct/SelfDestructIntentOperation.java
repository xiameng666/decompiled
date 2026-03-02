package com.google.android.gms.tapandpay.selfdestruct;

import a;
import android.content.Intent;
import batl;
import bbcu;
import bboh;
import cjuh;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import eset;
import esfh;
import esgc;
import esge;
import esgi;
import eshj;
import etmo;
import etor;
import etvv;
import ggtj;
import gtmt;
import java.util.Iterator;

public class SelfDestructIntentOperation extends esgc {
    private static final bboh a;

    static {
        SelfDestructIntentOperation.a = bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // esgc
    protected final void a(Intent intent0) {
        try {
            etvv.a(this);
            if(esfh.b(this)) {
                ((ggtj)SelfDestructIntentOperation.a.j()).x("Self-destruct fired with a secure keyguard.  Clearing notification but not keys");
                etmo.g();
                return;
            }
            ((ggtj)SelfDestructIntentOperation.a.j()).x("Self-destructing, clearing tokens");
            etmo.e();
            etmo.c();
            etmo.d();
            String s = esge.d();
            Iterator iterator0 = eset.n(this, s).iterator();
            while(true) {
            label_11:
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                etor etor0 = etor.f(new esgi(((AccountInfo)object0), s, this));
                CardInfo[] arr_cardInfo = etor0.e().a;
                batl.s(arr_cardInfo);
                for(int v = 0; v < arr_cardInfo.length; ++v) {
                    etor0.q(arr_cardInfo[v].a, gtmt.d);
                }
            }
        }
        catch(eshj | cjuh exception0) {
            a.ae(SelfDestructIntentOperation.a.j(), "Error self destructing", exception0);
            return;
        }
        goto label_11;
    }
}

