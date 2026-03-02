package com.google.android.gms.auth.account.be.legacy;

import acvl;
import acvo;
import adff;
import adge;
import adgf;
import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import azql;
import bbcu;
import bbdg;
import bboh;
import bbqt;
import bbsq;
import bbsr;
import cchj;
import ccmp;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import ggtj;
import howe;
import java.util.Locale;

public class AccountChimeraContentProvider extends ContentProvider {
    private final bboh a;
    private cchj b;
    private azql c;
    private static final adge d;

    static {
        AccountChimeraContentProvider.d = adgf.f(AppContextProvider.a());
    }

    public AccountChimeraContentProvider() {
        this.a = bboh.b("Auth", bbcu.cf);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Bundle call(String s, String s1, Bundle bundle0) {
        long v4;
        String s5;
        String s4;
        int v3;
        int v2;
        String s2;
        Bundle bundle1;
        int v = Binder.getCallingUid();
        long v1 = Binder.clearCallingIdentity();
        try {
            this.c.e(v);
            bundle1 = new Bundle();
            s2 = null;
            if("get_accounts".equals(s)) {
                bbsq bbsq0 = bbsr.b(this.getContext());
                String[] arr_s = bbsq0.k(v);
                if(arr_s != null && arr_s.length != 0) {
                    String s3 = arr_s[0];
                    if(arr_s.length == 1) {
                        v4 = v1;
                        s2 = s3;
                    }
                    else {
                        v2 = 0;
                        v3 = 0x7FFFFFFF;
                        s4 = s3;
                        while(true) {
                        label_14:
                            if(v2 >= arr_s.length) {
                                v4 = v1;
                                s2 = s4;
                                break;
                            }
                            s5 = arr_s[v2];
                            v4 = v1;
                            goto label_21;
                        }
                    }
                }
                else {
                    goto label_34;
                }
                goto label_35;
            }
            goto label_43;
        }
        catch(Throwable throwable0) {
            v4 = v1;
            Binder.restoreCallingIdentity(v4);
            throw throwable0;
        }
        try {
            try {
            label_21:
                if(bbsq0.d(s5, 0) != null && 36 < v3) {
                    s4 = s5;
                    v3 = 36;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            ++v2;
            v1 = v4;
            goto label_14;
        label_34:
            v4 = v1;
        label_35:
            if(howe.d() && bbqt.a()) {
                String s6 = bundle0.getString("callingActivity");
                AccountChimeraContentProvider.d.b(s2, s6);
                ((ggtj)this.a.j()).R("GetAccounts called on main thread from package: %s, callingActivity: %s", s2, bundle0.getString("callingActivity", ""));
            }
            bundle1.putParcelableArray("accounts", (((adff)adff.a.b()).f(v) ? this.b.p(s1) : this.b.q(s1, s2)));
            AppContextProvider.a();
            new ccmp().a(bbdg.lO);
            goto label_57;
        label_43:
            v4 = v1;
            if("clear_password".equals(s)) {
                Account account0 = (Account)bundle0.getParcelable("clear_password");
                Log.i("Auth", String.format(Locale.US, "[AccountChimeraContentProvider] Calling clearPassword on account by uid: %d", v));
                acvl acvl0 = (acvl)acvl.a.b();
                if(!acvl0.r(account0, null)) {
                    ((ggtj)acvl0.b.i()).x("Failed to clear LST in app data. Clearing password in AccountManager anyway.");
                    acvl0.c.h(account0);
                }
                ((acvo)acvl0.d.get()).a(account0);
                bundle1 = null;
                goto label_57;
            }
            goto label_59;
        }
        catch(Throwable throwable0) {
        }
        Binder.restoreCallingIdentity(v4);
        throw throwable0;
    label_57:
        Binder.restoreCallingIdentity(v4);
        return bundle1;
    label_59:
        Binder.restoreCallingIdentity(v4);
        throw new IllegalArgumentException(String.format("Unsupported method [%s]  or argument [%s] .", s, s1));
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        return "text/plain";
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        Context context0 = this.getContext();
        azql azql0 = azql.c(context0);
        this.b = cchj.b(context0);
        this.c = azql0;
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new UnsupportedOperationException();
    }
}

