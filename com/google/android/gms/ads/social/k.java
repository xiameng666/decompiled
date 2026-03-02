package com.google.android.gms.ads.social;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.config.s;
import gfsi;
import gmik;
import gmil;
import gmim;
import hopm;
import java.util.ArrayList;

public final class k implements gfsi {
    public final GmsDoritosProvider a;
    public final String b;

    public k(GmsDoritosProvider gmsDoritosProvider0, String s) {
        this.a = gmsDoritosProvider0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        GmsDoritosProvider gmsDoritosProvider0 = this.a;
        e e0 = gmsDoritosProvider0.c;
        e0.b();
        a a0 = !hopm.j() || !u.b(gmsDoritosProvider0.a, this.b) ? a.a : a.b;
        Account[] arr_account = gmsDoritosProvider0.b.d();
        ArrayList arrayList0 = new ArrayList();
        if((((Boolean)s.aP.g()).booleanValue() || hopm.j()) && gmsDoritosProvider0.d.b(arr_account)) {
            e0.c();
        }
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(!TextUtils.isEmpty(account0.name)) {
                String s = gmsDoritosProvider0.d.a(account0.name, a0);
                if(!TextUtils.isEmpty(s)) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmil.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gmil gmil0 = (gmil)hftp0.b_message;
                    s.getClass();
                    gmil0.b |= 1;
                    gmil0.c = s;
                    if(account0.name.equals(((String)object0))) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gmil.c(((gmil)hftp0.b_message));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gmil.b(((gmil)hftp0.b_message));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gmil gmil1 = (gmil)hftp0.b_message;
                        gmil1.b |= 8;
                        gmil1.d = true;
                    }
                    arrayList0.add(((gmil)hftp0.N_build()));
                }
            }
        }
        gmik gmik0 = (gmik)((ProtoLiteMessage)gmim.a).v_newBuilder();
        gmik0.a(arrayList0);
        return Base64.encodeToString(((gmim)((ProtoLiteBuilder)gmik0).N_build()).toBytesArray(), 10);
    }
}

