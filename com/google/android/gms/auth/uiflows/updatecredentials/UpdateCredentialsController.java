package com.google.android.gms.auth.uiflows.updatecredentials;

import acvl;
import adga;
import ajcn;
import ajco;
import ajcs;
import amct;
import amcx;
import amex;
import amfb;
import amir;
import amjo;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bagx;
import com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;

public class UpdateCredentialsController implements Controller {
    public static final Parcelable.Creator CREATOR;
    private static final ajcn a;
    private final Context b;
    private final ajcs c;
    private final AccountAuthenticatorResponse d;
    private final Account e;
    private String f;
    private String g;
    private final boolean h;
    private final bagx i;
    private final boolean j;
    private String k;

    static {
        UpdateCredentialsController.a = new ajcn("token_handle");
        UpdateCredentialsController.CREATOR = new amjo();
    }

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse0, Account account0, bagx bagx0, boolean z) {
        this(accountAuthenticatorResponse0, account0, false, bagx0, z, null, null, null);
    }

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse0, Account account0, boolean z, bagx bagx0, boolean z1, String s, String s1, String s2) {
        ajcs ajcs0 = new ajcs(AppContextProvider.a());
        super();
        this.b = AppContextProvider.a();
        this.c = ajcs0;
        this.d = accountAuthenticatorResponse0;
        this.e = account0;
        this.h = z;
        this.i = bagx0;
        this.j = z1;
        this.g = s;
        this.f = s1;
        this.k = s2;
    }

    @Override  // com.google.android.gms.auth.uiflows.controller.Controller
    public final amex a(amfb amfb0) {
        if(amfb0 == null) {
            if(!this.c.a()) {
                amct amct0 = new amct(this.h, false, 0, "Unavailable because the device is offline", "You don\'t have a network connection. \n\nThis could be a temporary problem. Try again or connect to another Wi-Fi network.", this.i);
                return new amex(1001, amcx.d.a(this.b, amct0), 0, null, -1, -1);
            }
            acvl acvl0 = (acvl)acvl.a.b();
            Account account0 = this.e;
            if(TextUtils.isEmpty(acvl0.i(account0))) {
                amir amir0 = new amir(this.b, 3);
                amir0.a = account0.name;
                amir0.b = account0.type;
                amir0.b(this.i);
                String s = amir0.a();
                return new amex(10, MinuteMaidChimeraActivity.q(this.b, account0, this.h, this.i, s), 0, null, -1, -1);
            }
            amir amir1 = new amir(this.b, 4);
            amir1.a = account0.name;
            amir1.b = account0.type;
            amir1.b(this.i);
            String s1 = amir1.a();
            return new amex(10, MinuteMaidChimeraActivity.r(this.b, account0, this.h, this.i, s1), 0, null, -1, -1);
        }
        int v = amfb0.a;
        switch(v) {
            case 10: {
                int v1 = amfb0.b;
                switch(v1) {
                    case -1: {
                        ajco ajco0 = new ajco(amfb0.c.getExtras());
                        this.g = (String)ajco0.a(MinuteMaidChimeraActivity.h);
                        String s2 = (String)ajco0.a(MinuteMaidChimeraActivity.j);
                        Account account1 = this.e;
                        if(account1 != null && !TextUtils.isEmpty(s2) && !account1.name.equalsIgnoreCase(s2)) {
                            adga.w(7);
                        }
                        if(this.j) {
                            this.f = (String)ajco0.a(MinuteMaidChimeraActivity.k);
                            String s3 = this.g;
                            Bundle bundle0 = new Bundle();
                            bundle0.putBoolean(FinishSessionChimeraActivity.k.a, this.h);
                            Bundle bundle1 = this.i.a();
                            bundle0.putParcelable(FinishSessionChimeraActivity.l.a, bundle1);
                            bundle0.putString(FinishSessionChimeraActivity.m.a, s3);
                            bundle0.putParcelable(FinishSessionChimeraActivity.q.a, account1);
                            bundle0.putString(FinishSessionChimeraActivity.i.a, "finish_update_credentials_session_type");
                            Bundle bundle2 = new Bundle();
                            bundle2.putBundle("accountSessionBundle", bundle0);
                            bundle2.putString("password", this.f);
                            Intent intent0 = new Intent().putExtras(bundle2);
                            AccountAuthenticatorResponse accountAuthenticatorResponse0 = this.d;
                            if(accountAuthenticatorResponse0 != null) {
                                accountAuthenticatorResponse0.onResult(bundle2);
                            }
                            return new amex(0, null, -1, intent0, -1, -1);
                        }
                        return new amex(20, UpdateCredentialsChimeraActivity.k(this.b, account1, this.g, false, this.i), 0, null, 0, 0);
                    }
                    case 0: {
                        return this.c(4, "user canceled");
                    }
                    default: {
                        if(v1 != 2) {
                            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", v, ((int)amfb0.b)));
                        }
                        return this.c(5, "something went wrong");
                    }
                }
            }
            case 20: {
                switch(amfb0.b) {
                    case -1: {
                        Intent intent1 = amfb0.c;
                        if(intent1 != null) {
                            this.k = (String)new ajco(intent1.getExtras()).a(UpdateCredentialsController.a);
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("authAccount", this.e.name);
                        bundle3.putString("accountType", this.e.type);
                        String s4 = this.k;
                        if(s4 != null) {
                            bundle3.putString("accountStatusToken", s4);
                        }
                        AccountAuthenticatorResponse accountAuthenticatorResponse1 = this.d;
                        if(accountAuthenticatorResponse1 != null) {
                            accountAuthenticatorResponse1.onResult(bundle3);
                        }
                        return new amex(0, null, -1, new Intent().putExtras(bundle3), -1, -1);
                    }
                    case 0: {
                        return this.c(5, "something went wrong");
                    }
                    default: {
                        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", v, ((int)amfb0.b)));
                    }
                }
            }
            case 1001: {
                return this.c(3, "no network");
            }
            default: {
                throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", v, ((int)amfb0.b)));
            }
        }
    }

    @Override  // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "UpdateCredentialsController";
    }

    private final amex c(int v, String s) {
        Intent intent0 = new Intent().putExtra("errorCode", v).putExtra("errorMessage", s);
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = this.d;
        if(accountAuthenticatorResponse0 != null) {
            accountAuthenticatorResponse0.onError(v, s);
        }
        return new amex(0, null, 0, intent0, -1, -1);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.d, 0);
        parcel0.writeParcelable(this.e, 0);
        parcel0.writeByte(((byte)this.h));
        parcel0.writeParcelable(this.i.a(), 0);
        parcel0.writeByte(((byte)this.j));
        parcel0.writeString(this.g);
        parcel0.writeString(this.f);
        parcel0.writeString(this.k);
    }
}

