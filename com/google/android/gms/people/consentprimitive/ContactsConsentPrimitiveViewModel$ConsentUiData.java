package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcelable;
import efya;
import ggdy;
import gged_interceptors;
import gjfl;
import hwyf;

public abstract class ContactsConsentPrimitiveViewModel.ConsentUiData implements Parcelable {
    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract Account f();

    public abstract ContactsConsentData g();

    public abstract efya h();

    public abstract ContactsConsentsConfig i();

    public abstract gged_interceptors j();

    public abstract gjfl k();

    public abstract gjfl l();

    public abstract boolean m();

    public abstract boolean n();

    public static efya o() {
        efya efya0 = new efya();
        efya0.e(gjfl.a);
        efya0.h(0);
        efya0.j(false);
        efya0.k(false);
        efya0.b(0);
        efya0.l(0);
        efya0.f(0);
        efya0.m(0);
        efya0.g(gjfl.b);
        efya0.i(gged_interceptors.l(gjfl.g));
        return efya0;
    }

    public static gged_interceptors p(ContactsConsentData contactsConsentData0, ContactsConsentsConfig contactsConsentsConfig0, Account account0) {
        ggdy ggdy0 = new ggdy();
        if(hwyf.c()) {
            ggdy0.i(gjfl.d);
        }
        if(hwyf.e()) {
            ggdy0.i(gjfl.e);
        }
        if(hwyf.f() && contactsConsentsConfig0.c && contactsConsentData0.l(account0)) {
            ggdy0.i(gjfl.f);
        }
        ggdy0.i(gjfl.g);
        return ggdy0.h();
    }

    public final int q(int v, boolean z) {
        if(this.a() == 1) {
            return z ? 2 : 1;
        }
        if(v == 1) {
            return 2;
        }
        switch(v) {
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            default: {
                return 1;
            }
        }
    }
}

