package com.google.android.gms.growth.featuredrops.googlesettings.features.cards;

import ProtoLiteMessage;
import a;
import android.accounts.Account;
import bbcu;
import bbdi;
import bbnp;
import bboh;
import bvnv;
import bvnz;
import bvob;
import bvoc;
import ccom;
import ccon;
import ccrn;
import ccrp;
import ccrr;
import cmfb;
import ggtj;
import hfsl;
import hfsm;
import hftc;
import hfur;
import hfvu;
import hfwc;
import hfwr;
import htwh;
import ibuq;
import java.io.IOException;

public final class FeatureDropsContextualCardIntentOperation extends ccrr {
    public static final bboh a;
    public bvob b;

    static {
        FeatureDropsContextualCardIntentOperation.a = bboh.b("FeatureDrops", bbcu.eN);
    }

    public FeatureDropsContextualCardIntentOperation() {
        super(bbdi.t);
    }

    @Override  // ccrr
    public final ccrn a(ccrp ccrp0) {
        if(!bbnp.j(this)) {
            Account account0 = ccrp0.a;
            if(account0 == null) {
                ((ggtj)FeatureDropsContextualCardIntentOperation.a.j()).x("Cannot create contextual card: no active account.");
                return ccrn.e;
            }
            bvoc.a().androidInjector().inject(this);
            bvob bvob0 = this.b;
            cmfb cmfb0 = null;
            if(bvob0 == null) {
                ibuq.j("cardFetcherFactory");
                bvob0 = null;
            }
            String s = account0.name;
            ibuq.e(s, "name");
            ccon ccon0 = ccrp0.b;
            if(ccon0 != null && ((ccon0.b == 2 ? ((ccom)ccon0.c) : ccom.a).b & 1 & (ccon0.b == 2 ? 1 : 0)) != 0) {
                try {
                    hfsl hfsl0 = (ccon0.b == 2 ? ((ccom)ccon0.c) : ccom.a).c.k();
                    ProtoLiteMessage hftv0 = ((ProtoLiteMessage)cmfb.a).x_newMutableInstance();
                    try {
                        hfwc hfwc0 = hfvu.a.c(hftv0);
                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                        hfwc0.g(hftv0);
                    }
                    catch(hfur hfur1) {
                        if(hfur1.b) {
                            hfur1 = new hfur(hfur1);
                        }
                        hfur1.a = hftv0;
                        throw hfur1;
                    }
                    catch(hfwr hfwr0) {
                        hfur hfur2 = hfwr0.a();
                        hfur2.a = hftv0;
                        throw hfur2;
                    }
                    catch(IOException iOException0) {
                        if((iOException0.getCause() instanceof hfur)) {
                            throw (hfur)iOException0.getCause();
                        }
                        hfur hfur3 = new hfur(iOException0);
                        hfur3.a = hftv0;
                        throw hfur3;
                    }
                    catch(RuntimeException runtimeException0) {
                        if((runtimeException0.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException0.getCause();
                        }
                        throw runtimeException0;
                    }
                    try {
                        hfsl0.z(0);
                    }
                    catch(hfur hfur4) {
                        hfur4.a = hftv0;
                        throw hfur4;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    cmfb0 = (cmfb)hftv0;
                    return new bvnz(((bvnv)bvob0.a.a).a(), s, cmfb0);
                }
                catch(hfur hfur0) {
                    a.ae(FeatureDropsContextualCardIntentOperation.a.j(), "Failed to deserialize UTM parameters.", hfur0);
                }
            }
            return new bvnz(((bvnv)bvob0.a.a).a(), s, cmfb0);
        }
        return ccrn.e;
    }

    @Override  // ccql
    protected final boolean b() {
        return !htwh.a.b().r();
    }
}

