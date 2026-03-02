package com.google.android.gms.blindauth.services;

import acsq;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import atpx;
import atqa;
import atqc;
import bbcu;
import bboh;
import cclw;
import ccmg;
import ccmp;
import ceaf;
import cjmf;
import com.google.android.gms.chimera.modules.blindauth.AppContextProvider;
import evql;
import gphs;
import hqnj;
import ibnx;
import ibpg;
import ibrl;
import ibrx;
import ibuq;
import icck;
import iccl;
import ictn;
import ifvu;

public final class BlindauthApiService extends atqc {
    public static final bboh a;
    public atqa b;
    public final icck c;
    public final ceaf d;
    public final ccmg e;
    public acsq f;

    static {
        BlindauthApiService.a = bboh.b("BlindauthApiService", bbcu.fW);
    }

    public BlindauthApiService() {
        this.c = iccl.b(cclw.c);
        this.d = ceaf.v();
        AppContextProvider.a();
        this.e = new ccmp();
    }

    public final atqa a() {
        atqa atqa0 = this.b;
        if(atqa0 != null) {
            return atqa0;
        }
        ibuq.j("phosphorClient");
        return null;
    }

    public final Object b(ibrl ibrl0) {
        atpx atpx0;
        if((ibrl0 instanceof atpx)) {
            atpx0 = (atpx)ibrl0;
            int v = atpx0.c;
            if((v & 0x80000000) == 0) {
                atpx0 = new atpx(this, ibrl0);
            }
            else {
                atpx0.c = v - 0x80000000;
            }
        }
        else {
            atpx0 = new atpx(this, ibrl0);
        }
        Object object0 = atpx0.a;
        Object object1 = ibrx.a;
        switch(atpx0.c) {
            case 0: {
                ibnx.b(object0);
                acsq acsq0 = this.f;
                if(acsq0 == null) {
                    ibuq.j("googleAuthUtilWrapper");
                    acsq0 = null;
                }
                evql evql0 = acsq0.a();
                atpx0.c = 1;
                object0 = ictn.b(evql0, atpx0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(((Account[])object0));
        Account account0 = (Account)ibpg.E(((Account[])object0));
        return account0 == null ? null : new gphs(account0.name, "google");
    }

    public static final boolean c(Context context0, String s) {
        return cjmf.a(context0, "android.permission.INTERNET", Binder.getCallingPid(), Binder.getCallingUid(), s) == 0;
    }

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        return hqnj.e() ? new ifvu(this) : null;
    }

    @Override  // atqc
    public final void onCreate() {
        if(hqnj.e()) {
            this.f();
        }
    }
}

