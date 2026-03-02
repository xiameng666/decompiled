package com.google.android.gms.common.config;

import android.content.Intent;
import bajw;
import bbcu;
import bboh;
import bbpz;
import brww;
import brwz;
import bxe;
import bxf;
import cjmr;
import cjnd;
import com.google.android.chimera.IntentOperation;
import einq;
import ggfp;
import ggtj;
import hrtu;
import j..util.Objects;
import java.util.Set;

public class PhenotypeUpdateOperation extends IntentOperation {
    private static final bboh a;
    private bajw b;

    static {
        PhenotypeUpdateOperation.a = bboh.b("PhenotypeUpdateOp", bbcu.dH);
    }

    private final void a(brwz brwz0, Set set0) {
        int v = brwz0.i;
        if(brww.a(v) != 0 && brww.a(v) != 3) {
            if(brww.a(v) != 1 && brww.a(v) != 4 && !set0.contains(brwz0.c)) {
                Intent intent0 = new Intent(bbpz.f(brwz0.c));
                intent0.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", brwz0.c);
                IntentOperation.startIntentOperations(this, intent0);
                return;
            }
            String s = brwz0.c;
            Intent intent1 = new Intent("com.google.android.gms.phenotype.COMMITTED");
            intent1.setPackage("com.google.android.gms");
            intent1.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", s);
            IntentOperation.startIntentOperations(this, intent1);
            intent1.addFlags(0x40000000);
            this.sendBroadcast(intent1);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = new bajw(this, new einq(this));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && (Objects.equals(intent0.getAction(), "com.google.android.gms.phenotype.UPDATE") || Objects.equals(intent0.getAction(), "com.google.android.gms.phenotype.DAILY_CHECKIN"))) {
            ggfp ggfp0 = ggfp.G(hrtu.a.c().e().b);
            if(Objects.equals(intent0.getAction(), "com.google.android.gms.phenotype.DAILY_CHECKIN")) {
                if(((Boolean)cjnd.b.mr()).booleanValue()) {
                    cjnd.a().k(14);
                }
                bxe bxe0 = new bxe(((bxf)this.b.c()));
                while(bxe0.hasNext()) {
                    Object object0 = bxe0.next();
                    brwz brwz0 = (brwz)object0;
                    if(brww.a(brwz0.i) != 0 && brww.a(brwz0.i) != 3) {
                        this.a(brwz0, ggfp0);
                    }
                }
                return;
            }
            String s = intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if(((Boolean)cjnd.b.mr()).booleanValue()) {
                cjnd cjnd0 = cjnd.a();
                if(s != null && cjnd0.d.contains(s)) {
                    cjnd0.h(new cjmr(cjnd0, s));
                }
            }
            if(s == null) {
                ((ggtj)PhenotypeUpdateOperation.a.i()).x("Invalid Intent: missing EXTRA_PACKAGE_NAME.");
                return;
            }
            bajw bajw0 = this.b;
            brwz brwz1 = bajw0.a(s);
            if(brwz1 != null && bajw0.f(brwz1.c)) {
                brwz brwz2 = this.b.a(s);
                if(brwz2 == null) {
                    ((ggtj)PhenotypeUpdateOperation.a.i()).B("No RegistrationInfo found for package \'%s\'", s);
                    return;
                }
                this.a(brwz2, ggfp0);
            }
            return;
        }
        ((ggtj)PhenotypeUpdateOperation.a.i()).x("Invalid intent");
    }
}

