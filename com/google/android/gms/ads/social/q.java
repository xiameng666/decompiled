package com.google.android.gms.ads.social;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.config.s;
import gmik;
import gmil;
import gmim;
import hopm;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class q implements Callable {
    public final GmsDoritosProvider a;
    public final String b;
    public final a c;

    public q(GmsDoritosProvider gmsDoritosProvider0, String s, a a0) {
        this.a = gmsDoritosProvider0;
        this.b = s;
        this.c = a0;
    }

    @Override
    public final Object call() {
        GmsDoritosProvider gmsDoritosProvider0 = this.a;
        e e0 = gmsDoritosProvider0.c;
        e0.b();
        Account[] arr_account = gmsDoritosProvider0.b.d();
        String s = gmsDoritosProvider0.b.c(this.b);
        ArrayList arrayList0 = new ArrayList();
        if((((Boolean)s.aP.g()).booleanValue() || hopm.j()) && gmsDoritosProvider0.d.b(arr_account)) {
            e0.c();
        }
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(!TextUtils.isEmpty(account0.name)) {
                String s1 = gmsDoritosProvider0.d.a(account0.name, this.c);
                if(!TextUtils.isEmpty(s1)) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmil.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gmil gmil0 = (gmil)hftp0.b_message;
                    s1.getClass();
                    gmil0.b |= 1;
                    gmil0.c = s1;
                    if(account0.name.equals(s)) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gmil.c(((gmil)hftp0.b_message));
                    }
                    arrayList0.add(((gmil)hftp0.N_build()));
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            gmil gmil1 = (gmil)arrayList0.get(0);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gmil1).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gmil1));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gmil.b(((gmil)hftp1.b_message));
            arrayList0.set(0, ((gmil)hftp1.N_build()));
        }
        gmik gmik0 = (gmik)((ProtoLiteMessage)gmim.a).v_newBuilder();
        gmik0.a(arrayList0);
        return Base64.encodeToString(((gmim)((ProtoLiteBuilder)gmik0).N_build()).toBytesArray(), 10);
    }
}

