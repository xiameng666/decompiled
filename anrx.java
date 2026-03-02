import dagger.internal.Factory;
import java.util.HashMap;
import java.util.Map.Entry;

public final class anrx implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        HashMap hashMap0 = new HashMap();
        Boolean boolean0 = Boolean.valueOf(true);
        cmbp cmbp0 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "PredictionDataSync", "AutofillOneOff", ((gful_cronetEngineProvider)new gfur_Suppliers(boolean0)), ((gful_cronetEngineProvider)new anop()));
        hashMap0.put(amkc.b, cmbp0);
        if(hqda.e()) {
            cmbp cmbp1 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "ScreenshotProtoUploadPeriodic", "ScreenshotProtoUploadOneOff", ((gful_cronetEngineProvider)new gfur_Suppliers(boolean0)), ((gful_cronetEngineProvider)new annw()));
            hashMap0.put(amkc.d, cmbp1);
        }
        if(aqcf.f()) {
            cmbp cmbp2 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "PasswordLeakCheckPeriodic", "PasswordLeakCheckOneOff", ((gful_cronetEngineProvider)new gfur_Suppliers(boolean0)), ((gful_cronetEngineProvider)new anob()));
            hashMap0.put(amkc.e, cmbp2);
        }
        cmbp cmbp3 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "SettingsSyncPeriodic", "SettingsSyncOneOff", ((gful_cronetEngineProvider)new anoc()), ((gful_cronetEngineProvider)new anod()));
        hashMap0.put(amkc.f, cmbp3);
        cmbp cmbp4 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "FaviconFetchPeriodic", "FaviconFetchOneOff", ((gful_cronetEngineProvider)new anoe()), ((gful_cronetEngineProvider)new anof()));
        hashMap0.put(amkc.g, cmbp4);
        if(anor.a()) {
            cmbp cmbp5 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "CommonUsernamesFetchPeriodic", "CommonUsernamesFetchOneOff", ((gful_cronetEngineProvider)new anog()), ((gful_cronetEngineProvider)new anoh()));
            hashMap0.put(amkc.h, cmbp5);
        }
        cmbp cmbp6 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "FileUploadPeriodic", "FileUploadOneOff", ((gful_cronetEngineProvider)new gfur_Suppliers(boolean0)), ((gful_cronetEngineProvider)new anoj()));
        hashMap0.put(amkc.i, cmbp6);
        cmbp cmbp7 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "PasswordCreationTimeUpdatePeriodic", "PasswordCreationTimeUpdateOneOff", ((gful_cronetEngineProvider)new gfur_Suppliers(boolean0)), ((gful_cronetEngineProvider)new anoq()));
        hashMap0.put(amkc.j, cmbp7);
        if(hqal.s()) {
            cmbp cmbp8 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "ChromeSyncWalletSpecificsPeriodic", "ChromeSyncWalletSpecificsOneOff", ((gful_cronetEngineProvider)new annn()), ((gful_cronetEngineProvider)new anno()));
            hashMap0.put(amkc.k, cmbp8);
        }
        if(hqga.c()) {
            cmbp cmbp9 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "ChromeSyncWalletUsageSpecificsPeriodic", "ChromeSyncWalletUsageSpecificsOneOff", ((gful_cronetEngineProvider)new annp()), ((gful_cronetEngineProvider)new annq()));
            hashMap0.put(amkc.n, cmbp9);
        }
        if(hqep.l() && hqal.o()) {
            cmbp cmbp10 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "MoonlanderMddRefresh", "MoonlanderMddRefreshOneOff", ((gful_cronetEngineProvider)new annr()), ((gful_cronetEngineProvider)new anns()));
            hashMap0.put(amkc.l, cmbp10);
        }
        if(hqal.o()) {
            cmbp cmbp11 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "MoonlanderMddMaintenance", "MoonlanderMddMaintenanceOneOff", ((gful_cronetEngineProvider)new annt()), ((gful_cronetEngineProvider)new annu()));
            hashMap0.put(amkc.m, cmbp11);
        }
        if(hqge.c()) {
            cmbp cmbp12 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "WalletValuablesPeriodic", "WalletValuablesOneOff", ((gful_cronetEngineProvider)new annv()), ((gful_cronetEngineProvider)new anny()));
            hashMap0.put(amkc.o, cmbp12);
        }
        if(hqbf.i()) {
            cmbp cmbp13 = new cmbp("com.google.android.gms.autofill.events.AutofillGcmTaskService", false, "AccountMetadataUpdatePeriodic", "AccountMetadataUpdateOneOff", ((gful_cronetEngineProvider)new annz()), ((gful_cronetEngineProvider)new anoa()));
            hashMap0.put(amkc.p, cmbp13);
        }
        cmcf cmcf0 = new cmcf(amkc.a);
        for(Object object0: hashMap0.entrySet()) {
            cmcf0.b(((amkc)((Map.Entry)object0).getKey()), ((cmbp)((Map.Entry)object0).getValue()));
        }
        return cmcf0.a();
    }
}

