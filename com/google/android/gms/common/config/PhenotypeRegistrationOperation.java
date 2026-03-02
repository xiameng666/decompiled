package com.google.android.gms.common.config;

import ProtoLiteMessage;
import a;
import android.content.Intent;
import bajy;
import bbcu;
import bbmt;
import bboh;
import brxa;
import bzs;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.RegistrationInfo;
import einq;
import evql;
import evrg;
import ggtj;
import hftc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PhenotypeRegistrationOperation extends IntentOperation {
    einq a;
    private static final bboh b;
    private static final String[] c;

    static {
        PhenotypeRegistrationOperation.b = bboh.b("PhenotypeRegOp", bbcu.dH);
        PhenotypeRegistrationOperation.c = new String[]{"com.google.android.chimera.MODULE_CONFIGURATION_CHANGED", "com.google.android.gms.phenotype.DAILY_CHECKIN", "android.intent.action.BOOT_COMPLETED"};
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new einq(this);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Iterator iterator1;
        List list0;
        if(intent0 != null) {
            String s = intent0.getAction();
            if(bbmt.e(PhenotypeRegistrationOperation.c, s)) {
                try {
                    Collection collection0 = ModuleManager.get(this).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto");
                    bzs bzs0 = new bzs();
                    Iterator iterator0 = collection0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            if(!bzs0.containsKey("com.google.android.gms") && "com.google.android.gms".equals("com.google.android.gms")) {
                                ((ggtj)PhenotypeRegistrationOperation.b.i()).x("Core gms application properties were not set in phenotype registration.");
                            }
                            ArrayList arrayList0 = new ArrayList(bzs0.d_num);
                            for(int v = 0; v < bzs0.d_num; ++v) {
                                arrayList0.add(((RegistrationInfo)bzs0.i(v)));
                            }
                            evql evql0 = this.a.k(((RegistrationInfo[])arrayList0.toArray(new RegistrationInfo[arrayList0.size()])));
                            try {
                                evrg.n(evql0);
                            }
                            catch(InterruptedException interruptedException0) {
                                a.ae(PhenotypeRegistrationOperation.b.j(), "Phenotype bulk registration failed", interruptedException0);
                            }
                            catch(ExecutionException executionException0) {
                                a.ae(PhenotypeRegistrationOperation.b.i(), "Phenotype bulk registration failed", executionException0);
                            }
                            return;
                        }
                        Object object0 = iterator0.next();
                        ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                        try {
                            byte[] arr_b = moduleManager$ModuleInfo0.getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto");
                            if(arr_b == null) {
                                ((ggtj)PhenotypeRegistrationOperation.b.i()).B("Failed to read metadata for %s", moduleManager$ModuleInfo0.moduleId);
                                continue;
                            }
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)brxa.a), arr_b, 0, arr_b.length, hftc.a);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            list0 = bajy.c(this, ((brxa)hftv0), moduleManager$ModuleInfo0.moduleVersion);
                        }
                        catch(IOException | RuntimeException exception0) {
                            ((ggtj)PhenotypeRegistrationOperation.b.i()).R("Failed to build phenotype registration for %s:%s", moduleManager$ModuleInfo0.moduleId, exception0.getMessage());
                            continue;
                        }
                        iterator1 = list0.iterator();
                    label_38:
                        if(iterator1.hasNext()) {
                            break;
                        }
                    }
                    Object object1 = iterator1.next();
                    RegistrationInfo registrationInfo0 = (RegistrationInfo)object1;
                    String s1 = registrationInfo0.c;
                    if(bzs0.containsKey(s1)) {
                        "com.google.android.gms".equals(s1);
                        goto label_38;
                    }
                    bzs0.put(s1, registrationInfo0);
                    goto label_38;
                }
                catch(InvalidConfigException invalidConfigException0) {
                    a.ae(PhenotypeRegistrationOperation.b.i(), "Failed to load module configuration", invalidConfigException0);
                    return;
                }
            }
        }
        ((ggtj)PhenotypeRegistrationOperation.b.i()).x("Invalid intent");
    }
}

