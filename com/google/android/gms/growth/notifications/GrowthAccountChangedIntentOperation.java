package com.google.android.gms.growth.notifications;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import acse;
import acso;
import adqe;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import bbcu;
import bbnp;
import bboh;
import bvqt;
import bvrf;
import bvrk;
import bvse;
import bweg;
import com.google.android.chimera.IntentOperation;
import dagger.internal.Preconditions;
import ggaf;
import ggtj;
import gqxz;
import gqyb;
import htwv;
import j..util.Collection.-EL;
import j..util.Objects;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

public class GrowthAccountChangedIntentOperation extends IntentOperation {
    bvrf a;
    private static final bboh b;

    static {
        GrowthAccountChangedIntentOperation.b = bboh.b("GrowthNotifications", bbcu.ci);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bvrk bvrk0 = new bvrk();
        bvrk0.b(bvqt.f());
        bvrf bvrf0 = bvrk0.a().a.b();
        Preconditions.e(bvrf0);
        this.a = bvrf0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(htwv.a.b().j()) {
            if(intent0 != null && Objects.equals(intent0.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                Context context0 = this.getApplicationContext();
                for(Object object0: adqe.a(intent0)) {
                    bvrf bvrf0 = this.a;
                    String s = ((Account)object0).name;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxz.a).v_newBuilder();
                    String s1 = bweg.c(context0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqxz gqxz0 = (gqxz)hftp0.b_message;
                    s1.getClass();
                    int v = 4;
                    gqxz0.b |= 4;
                    gqxz0.e = s1;
                    String s2 = ((Account)object0).name;
                    try {
                        int v1 = Collections.frequency(((Collection)Collection.-EL.stream(acso.i(context0, 0, s2)).map(new bvse()).collect(ggaf.a)), Integer.valueOf(1));
                        if(v1 == 1) {
                            v = 2;
                        }
                        else if(v1 > 1) {
                            v = 3;
                        }
                        else {
                            ((ggtj)GrowthAccountChangedIntentOperation.b.j()).z("Invalid number of \'account added\' events (%d) found in history while handling an account added intent.", v1);
                        }
                    }
                    catch(acse | IOException exception0) {
                        a.ae(GrowthAccountChangedIntentOperation.b.i(), "Runtime exception encountered while handling account change intent in Growth module.", exception0);
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gqxz)hftp0.b_message).c = v - 1;
                    ((gqxz)hftp0.b_message).b |= 1;
                    boolean z = bbnp.j(context0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqxz gqxz1 = (gqxz)hftp0.b_message;
                    gqxz1.b |= 2;
                    gqxz1.d = z;
                    gqxz gqxz2 = (gqxz)hftp0.N_build();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqyb.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((gqyb)hftv0).d = 23;
                    ((gqyb)hftv0).b |= 2;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gqyb gqyb0 = (gqyb)hftp1.b_message;
                    gqxz2.getClass();
                    gqyb0.g = gqxz2;
                    gqyb0.b |= 0x20;
                    bvrf0.b(s, 0, hftp1);
                }
                return;
            }
            ((ggtj)GrowthAccountChangedIntentOperation.b.i()).B("Unsupported intent action: %s", (intent0 == null ? "null" : intent0.getAction()));
        }
    }
}

