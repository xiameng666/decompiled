package com.google.android.gms.ads.social;

import acse;
import acso;
import android.accounts.Account;
import android.text.TextUtils;
import gfsi;
import java.io.IOException;

public final class g implements gfsi {
    public final i a;

    public g(i i0) {
        this.a = i0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = (String)object0;
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        i i0 = this.a;
        Account[] arr_account = i0.d();
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            try {
                if(s.equals(acso.e(i0.a, account0.name))) {
                    return account0.name;
                }
            }
            catch(IOException | acse unused_ex) {
            }
        }
        return "";
    }
}

