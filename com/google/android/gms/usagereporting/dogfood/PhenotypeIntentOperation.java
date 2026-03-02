package com.google.android.gms.usagereporting.dogfood;

import android.content.Context;
import android.content.Intent;
import azui;
import bbcu;
import bboh;
import bbpz;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.usagereporting.AppContextProvider;
import evql;
import evrg;
import faih;
import faik;
import faim;
import faio;
import gftb;
import hzfe;
import hzfu;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PhenotypeIntentOperation extends IntentOperation {
    static final String a;
    private final Context b;
    private faim c;
    private faik d;

    static {
        bboh.b("PhenotypeIntentOperation", bbcu.ab);
        PhenotypeIntentOperation.a = bbpz.f("com.google.android.gms.usagereporting");
    }

    public PhenotypeIntentOperation() {
        this.b = AppContextProvider.a();
    }

    private final boolean a(Context context0) {
        if(this.d == null) {
            this.d = faih.a(context0);
        }
        evql evql0 = this.d.cp();
        try {
            evrg.o(evql0, hzfe.b(), TimeUnit.SECONDS);
            return evql0.n() && evql0.j() != null && ((azui)evql0.j()).q();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(Objects.equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.usagereporting") && Objects.equals(intent0.getAction(), PhenotypeIntentOperation.a) && hzfu.i()) {
            if(this.c == null) {
                faio faio0 = new faio(this.b);
                this.c = new faim(this.b, faio0);
            }
            if(!hzfu.h()) {
                faim faim1 = this.c;
                gftb.check(faim1);
                faim1.a();
            }
            else if(!this.a(this.b)) {
                faim faim0 = this.c;
                gftb.check(faim0);
                faim0.b();
            }
        }
    }
}

