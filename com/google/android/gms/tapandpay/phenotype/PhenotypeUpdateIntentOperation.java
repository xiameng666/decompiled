package com.google.android.gms.tapandpay.phenotype;

import a;
import android.content.ComponentName;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import esgc;
import espm;
import eswo;
import esyj;
import etrm;
import etts;
import fphq;
import fpib;
import ggtj;
import hysx;
import jys;

public class PhenotypeUpdateIntentOperation extends esgc {
    @Override  // esgc
    protected final void a(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.gms.phenotype.COMMITTED".equals(s)) {
            if("com.google.android.gms.phenotype.com.google.android.gms.tapandpay.COMMITTED".equals(s)) {
            label_5:
                fphq fphq0 = fphq.a(this.getContentResolver(), fpib.a("com.google.android.gms.tapandpay"), new etrm());
                if(fphq0 != null) {
                    fphq0.c();
                }
                espm.a(this);
                esyj.a().i(this, "Phenotype update");
                etts.a().b("Phenotype update");
                eswo.c(this);
                if(jys.d() && !hysx.d().b.isEmpty()) {
                    NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(this);
                    if(nfcAdapter0 != null) {
                        CardEmulation cardEmulation0 = CardEmulation.getInstance(nfcAdapter0);
                        ComponentName componentName0 = new ComponentName(this, "com.google.android.gms.tapandpay.hce.service.TpHceService");
                        for(Object object0: hysx.d().b) {
                            String s1 = (String)object0;
                            try {
                                cardEmulation0.removePollingLoopPatternFilterForService(componentName0, s1);
                                ((ggtj)eswo.b.h()).B("Successfully removed polling loop pattern %s", s1);
                            }
                            catch(IllegalArgumentException illegalArgumentException0) {
                                a.e(eswo.b.i(), "Failed to remove polling loop pattern %s", s1, illegalArgumentException0);
                            }
                        }
                    }
                }
                if(jys.d() && hysx.i()) {
                    hysx hysx0 = hysx.a;
                    if(hysx0.f().n()) {
                        NfcAdapter nfcAdapter1 = NfcAdapter.getDefaultAdapter(this);
                        if(nfcAdapter1 != null && nfcAdapter1.isObserveModeSupported()) {
                            CardEmulation cardEmulation1 = CardEmulation.getInstance(nfcAdapter1);
                            ComponentName componentName1 = new ComponentName(this, "com.google.android.gms.tapandpay.hce.service.TpHceService");
                            for(Object object1: hysx0.f().i().b) {
                                String s2 = (String)object1;
                                try {
                                    cardEmulation1.registerPollingLoopPatternFilterForService(componentName1, s2, true);
                                    ((ggtj)eswo.b.h()).B("Successfully registered polling loop pattern %s", s2);
                                }
                                catch(IllegalArgumentException illegalArgumentException1) {
                                    a.e(eswo.b.i(), "Failed to register polling loop pattern %s", s2, illegalArgumentException1);
                                }
                            }
                        }
                    }
                }
            }
        }
        else if("com.google.android.gms.tapandpay".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            goto label_5;
        }
    }
}

