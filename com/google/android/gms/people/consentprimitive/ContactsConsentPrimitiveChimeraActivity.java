package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import bauc;
import bbdg;
import bbmn;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import efux;
import efvc;
import efvd;
import efxf;
import efxy;
import efya;
import efyb;
import efyc;
import efyd;
import efyj;
import gfqx;
import gfsx;
import ggfp;
import gjfl;
import gjfn;
import glzd;
import gmbt;
import gmbu;
import gmcd;
import hwyf;
import j..util.Objects;
import java.util.List;
import lrf;
import lso;
import xob;

@GmsCoreVeId(0x3FBC9)
public class ContactsConsentPrimitiveChimeraActivity extends xob {
    public efyc j;

    public final void a() {
        TypedValue typedValue0 = new TypedValue();
        this.getTheme().resolveAttribute(0x1010031, typedValue0, true);
        this.findViewById(0x7F0B1E9F).setBackgroundColor(this.getColor(typedValue0.resourceId));  // id:root
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        gmcd gmcd0;
        gfsx gfsx0;
        ccmq.a().a(bbdg.eR);
        super.onCreate(bundle0);
        if(!hwyf.d()) {
            this.finish();
            return;
        }
        this.setTheme(0x7F160308);  // style:ContactsPrimitiveActivityNoUiTheme
        this.setContentView(0x7F0E0239);  // layout:consent_primitive_activity
        int v = 3;
        GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest0 = new GetBackupSyncSuggestionRequest(8, 3);
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest1 = (GetBackupSyncSuggestionRequest)bauc.b(intent0, "sheepdogRequest", GetBackupSyncSuggestionRequest.CREATOR);
            if(getBackupSyncSuggestionRequest1 != null) {
                getBackupSyncSuggestionRequest0 = getBackupSyncSuggestionRequest1;
            }
        }
        efyc efyc0 = (efyc)new lso(this, new efyd(this, this, getBackupSyncSuggestionRequest0)).a(efyc.class);
        this.j = efyc0;
        int v1 = gjfn.a(this.getIntent().getIntExtra("referrer", 0));
        efyc0.i = v1;
        if(v1 == 0) {
            efyc0.i = 1;
        }
        efyc efyc1 = this.j;
        ContactsConsentsStatus contactsConsentsStatus0 = (ContactsConsentsStatus)bauc.b(this.getIntent(), "status", new efyj());
        lrf lrf0 = efyc1.b;
        if(!lrf0.a.a.containsKey("ui-data")) {
            if(contactsConsentsStatus0 == null) {
                gmcd0 = gmbu.i(bbmn.h(efyc1.g, "com.google.android.gms"));
            }
            else {
                ContactsConsentsConfig contactsConsentsConfig0 = contactsConsentsStatus0.c;
                Account account0 = contactsConsentsConfig0.d;
                if(account0 == null) {
                    gfsx0 = gfqx.a;
                    goto label_61;
                }
                else {
                    List list0 = contactsConsentsConfig0.h;
                    efux efux0 = ContactsConsentData.i();
                    efux0.d(list0);
                    efux0.e(contactsConsentsStatus0.a.a);
                    efux0.f(contactsConsentsStatus0.a.b);
                    efux0.c(contactsConsentsStatus0.a.c);
                    ggfp ggfp0 = ggfp.G(contactsConsentsStatus0.a.a());
                    if(efux0.c != null) {
                        throw new IllegalStateException("Cannot set dcEligibleAndDisabledAccounts after calling dcEligibleAndDisabledAccountsBuilder()");
                    }
                    efux0.d = ggfp.G(ggfp0);
                    efux0.g(0);
                    ContactsConsentsDetailedStatus contactsConsentsDetailedStatus0 = contactsConsentsStatus0.b;
                    if(contactsConsentsDetailedStatus0 != null) {
                        efux0.g(contactsConsentsDetailedStatus0.a);
                        for(Object object0: list0) {
                            efux0.b(((Account)object0), contactsConsentsDetailedStatus0.b.getInt(((Account)object0).name, 0));
                        }
                    }
                    ContactsConsentData contactsConsentData0 = efux0.a();
                    efya efya0 = ContactsConsentPrimitiveViewModel.ConsentUiData.o();
                    efya0.a = account0;
                    efya0.b(((int)contactsConsentsConfig0.i));
                    efya0.c(contactsConsentsConfig0);
                    efya0.d(contactsConsentData0);
                    efya0.e(gjfl.b);
                    efya0.f((contactsConsentData0.k(account0) ? 3 : 0));
                    if(!((.AutoValue_ContactsConsentData)contactsConsentData0).c) {
                        v = 0;
                    }
                    efya0.l(v);
                    efya0.i(ContactsConsentPrimitiveViewModel.ConsentUiData.p(contactsConsentData0, contactsConsentsConfig0, account0));
                    gfsx0 = gfsx.m(efya0.a());
                label_61:
                    if(gfsx0.i()) {
                        lrf0.a("ui-data").l(gfsx0.d());
                    }
                    else {
                        efyb efyb0 = new efyb(2, null);
                        efyc1.f.ii(efyb0);
                    }
                    gmcd0 = gmbu.i(contactsConsentsStatus0.a.b());
                }
            }
            gmbt gmbt0 = gmbt.h(gmcd0);
            Objects.requireNonNull(efyc1.h);
            gmbu.t(glzd.g(gmbt0, new efxf(efyc1.h), efyc1.d), new efxy(efyc1, contactsConsentsStatus0), efyc1.d);
        }
        this.j.a().g(this, new efvc(this));
        this.j.f.g(this, new efvd(this));
    }
}

