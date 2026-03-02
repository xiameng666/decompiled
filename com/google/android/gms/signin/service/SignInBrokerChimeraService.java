package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import azql;
import batl;
import baun;
import bbsr;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import epps;
import epul;
import epvc;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SignInBrokerChimeraService extends cjtg {
    private static final baun a;

    static {
        SignInBrokerChimeraService.a = epul.b("SignInBrokerService");
    }

    public SignInBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s2;
        String s = getServiceRequest0.f;
        batl.s(getServiceRequest0.h);
        HashSet hashSet0 = new HashSet(Arrays.asList(getServiceRequest0.h));
        int v = Binder.getCallingUid();
        Bundle bundle0 = getServiceRequest0.i;
        ClassLoader classLoader0 = BinderWrapper.class.getClassLoader();
        batl.s(classLoader0);
        bundle0.setClassLoader(classLoader0);
        String s1 = bundle0.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if(TextUtils.isEmpty(s1)) {
            s2 = s;
        }
        else {
            if(azql.c(this).i(v)) {
                try {
                    v = bbsr.b(this).e(s1, 0).applicationInfo.uid;
                    s2 = s1;
                    goto label_21;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    SignInBrokerChimeraService.a.f("Bad package name: " + s1, new Object[0]);
                    cjtn0.a(10, null);
                    return;
                }
            }
            SignInBrokerChimeraService.a.f("Caller is not a Google app!", new Object[0]);
            cjtn0.a(10, null);
            return;
        }
    label_21:
        epvc epvc0 = new epvc(this, s2, hashSet0, v, ((Account)bundle0.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount")), epps.a(bundle0).b(), this.l());
        Account account0 = getServiceRequest0.a();
        if(account0 != null) {
            epvc0.q(account0, hashSet0);
        }
        cjtn0.c(epvc0);
    }
}

