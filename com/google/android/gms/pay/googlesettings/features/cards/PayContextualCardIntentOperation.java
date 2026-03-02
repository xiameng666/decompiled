package com.google.android.gms.pay.googlesettings.features.cards;

import android.accounts.Account;
import azts;
import bbcu;
import bbdi;
import bboh;
import ccrn;
import ccrp;
import ccrr;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.IntentSource;
import dmkl;
import dnqf;
import dnqi;
import dnqj;
import dqew;
import edse;
import ggtj;
import hwjs;
import ibrt;
import ibts;
import ibuq;

public final class PayContextualCardIntentOperation extends ccrr {
    public edse a;
    public ibrt b;
    public IntentSource d;
    public dmkl e;
    private static final bboh f;
    private final ibts g;

    static {
        PayContextualCardIntentOperation.f = bboh.b("Pay", bbcu.cZ);
    }

    public PayContextualCardIntentOperation() {
        this(dnqj.a);
    }

    public PayContextualCardIntentOperation(ibts ibts0) {
        ibuq.f(ibts0, "isManagedProfileImpl");
        super(bbdi.av);
        this.g = ibts0;
    }

    @Override  // ccrr
    public final ccrn a(ccrp ccrp0) {
        IntentSource intentSource1;
        Account account0 = ccrp0.a;
        if(account0 == null) {
            ((ggtj)PayContextualCardIntentOperation.f.j()).x("Cannot create contextual card: no active account.");
            return ccrn.e;
        }
        if(!((Boolean)this.g.a(this)).booleanValue()) {
            new dnqf().inject(this);
            dmkl dmkl0 = null;
            azts azts0 = new azts(AppContextProvider.a(), null);
            ibrt ibrt0 = this.e();
            IntentSource intentSource0 = this.d;
            if(intentSource0 == null) {
                ibuq.j("intentSource");
                intentSource1 = null;
            }
            else {
                intentSource1 = intentSource0;
            }
            dmkl dmkl1 = this.e;
            if(dmkl1 == null) {
                ibuq.j("deviceUtil");
            }
            else {
                dmkl0 = dmkl1;
            }
            dqew dqew0 = new dqew(ibrt0, account0, azts0, intentSource1, dmkl0, this.d());
            return new dnqi(this, this.d(), account0, this.e(), dqew0);
        }
        ((ggtj)PayContextualCardIntentOperation.f.j()).x("Cannot create contextual card: managed profile.");
        return ccrn.e;
    }

    @Override  // ccql
    protected final boolean b() {
        return hwjs.a.b().b();
    }

    public final edse d() {
        edse edse0 = this.a;
        if(edse0 != null) {
            return edse0;
        }
        ibuq.j("walletInstallManager");
        return null;
    }

    public final ibrt e() {
        ibrt ibrt0 = this.b;
        if(ibrt0 != null) {
            return ibrt0;
        }
        ibuq.j("defaultContext");
        return null;
    }
}

