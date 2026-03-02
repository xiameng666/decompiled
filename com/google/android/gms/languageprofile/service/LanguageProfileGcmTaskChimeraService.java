package com.google.android.gms.languageprofile.service;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import babh;
import bbcu;
import bbdg;
import bboh;
import cbwh;
import cbwx;
import cbxc;
import cbxp;
import cbxq;
import cbxr;
import cbxs;
import cbxt;
import cbyd;
import cbyf;
import cbyl;
import cbyn;
import ccmg;
import ccmp;
import cljp;
import cllr;
import cmar;
import cmbm;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import fktu;
import gfsx;
import ggia;
import ggtj;
import gqhu;
import gqhv;
import huln;
import java.util.List;

public class LanguageProfileGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final int a;
    private static final bboh b;

    static {
        LanguageProfileGcmTaskChimeraService.b = bboh.b("LPGcmTaskChimeraService", bbcu.ct);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmp ccmp0;
        int v = 0;
        if(huln.e()) {
            if(babh.b()) {
                AppContextProvider.a();
                ccmp0 = new ccmp();
            }
            else {
                ccmp0 = null;
            }
            fktu fktu0 = cbwx.a().a(cllr0.a);
            cbwh cbwh0 = (cbwh)fktu0.a;
            switch(cbwh0.ordinal()) {
                case 1: {
                    int v1 = fktu0.b;
                    if(v1 == 3) {
                        LanguageProfileGcmTaskChimeraService.e(ccmp0, bbdg.fN);
                        List list0 = ggia.h(cbxc.c(), new cbxt());
                        gqhu gqhu0 = (gqhu)((ProtoLiteMessage)gqhv.a).v_newBuilder();
                        gqhu0.a(list0);
                        String s = huln.d();
                        if(!gqhu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gqhu0).ensureMutable();
                        }
                        ((gqhv)gqhu0.b_message).c = s;
                        if(!gqhu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gqhu0).ensureMutable();
                        }
                        gqhv.c(((gqhv)gqhu0.b_message));
                        gqhv gqhv0 = (gqhv)((ProtoLiteBuilder)gqhu0).N_build();
                        cbyf cbyf0 = cbyf.a();
                        gfsx gfsx0 = cbxc.b();
                        if(gfsx0.i()) {
                            if(huln.a.c().m()) {
                                Account[] arr_account = (Account[])gfsx0.d();
                                while(v < arr_account.length) {
                                    cbyf0.q(arr_account[v].name, gqhv0, gqhv0.c);
                                    ++v;
                                }
                            }
                            else {
                                Account[] arr_account1 = (Account[])gfsx0.d();
                                while(v < arr_account1.length) {
                                    cbyf0.p(arr_account1[v], gqhv0);
                                    ++v;
                                }
                            }
                        }
                        v = 1;
                    }
                    else if(v1 == 2) {
                        LanguageProfileGcmTaskChimeraService.e(ccmp0, bbdg.fO);
                    }
                    cmbm cmbm0 = cbwx.c();
                    return cmbm0.n(cmbm0.a(fktu0, new cbyd(cbyf.a(), ((boolean)v)), cbwx.b()));
                }
                case 2: {
                    LanguageProfileGcmTaskChimeraService.e(ccmp0, bbdg.fP);
                    cmbm cmbm1 = cbwx.c();
                    return cmbm1.n(cmbm1.a(fktu0, new cbyl(cbyn.a()), cbwx.b()));
                }
                case 3: {
                    int v2 = fktu0.b;
                    if(v2 == 3) {
                        LanguageProfileGcmTaskChimeraService.e(ccmp0, bbdg.fQ);
                    }
                    else if(v2 == 2) {
                        LanguageProfileGcmTaskChimeraService.e(ccmp0, bbdg.fR);
                    }
                    cmar cmar0 = cbwx.c().l(cbwh0);
                    return cmar0.a(cmar0.b(new cbxq(), v2, cbwx.b()), v2);
                }
                case 4: {
                    LanguageProfileGcmTaskChimeraService.e(ccmp0, bbdg.fS);
                    cmar cmar1 = cbwx.c().l(cbwh0);
                    return cmar1.a(cmar1.b(new cbxs(), fktu0.b, cbwx.b()), fktu0.b);
                }
                case 5: {
                    cmar cmar2 = cbwx.c().l(cbwh0);
                    return cmar2.a(cmar2.b(new cbxp(), fktu0.b, cbwx.b()), fktu0.b);
                }
                case 6: {
                    cmar cmar3 = cbwx.c().l(cbwh0);
                    return cmar3.a(cmar3.b(new cbxr(), fktu0.b, cbwx.b()), fktu0.b);
                }
                default: {
                    return 0;
                }
            }
        }
        return 0;
    }

    static void d(cljp cljp0, cmbm cmbm0) {
        if(huln.e()) {
            ((ggtj)LanguageProfileGcmTaskChimeraService.b.h()).x("Scheduling sync task.");
            cmbm0.j();
            return;
        }
        ((ggtj)LanguageProfileGcmTaskChimeraService.b.h()).x("Unscheduling sync tasks.");
        cljp0.d("languageprofile.StoreLanguageSettingsByClientIdPeriodicTask", "com.google.android.gms.languageprofile.GcmTaskService");
        cljp0.d("languageprofile.SyncPeriodicUploadTask", "com.google.android.gms.languageprofile.GcmTaskService");
        cljp0.d("languageprofile.SyncPeriodicWipeoutTask", "com.google.android.gms.languageprofile.GcmTaskService");
        cljp0.d("languageprofile.CleanupPeriodicTask", "com.google.android.gms.languageprofile.GcmTaskService");
    }

    private static void e(ccmg ccmg0, bbdg bbdg0) {
        if(ccmg0 != null) {
            ccmg0.a(bbdg0);
        }
    }
}

