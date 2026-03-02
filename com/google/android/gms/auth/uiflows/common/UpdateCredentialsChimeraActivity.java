package com.google.android.gms.auth.uiflows.common;

import adhx;
import ajcn;
import ajco;
import amef;
import amek;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import bagx;
import baun;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import luo;
import lup;
import lvb;

@GmsCoreVeId(257098)
public class UpdateCredentialsChimeraActivity extends amef implements luo {
    public static final ajcn h;
    public static final ajcn i;
    private static final baun j;
    private static final ajcn k;
    private static final ajcn l;

    static {
        UpdateCredentialsChimeraActivity.j = new baun("Auth", new String[]{"UpdateCredentialsActivity"});
        UpdateCredentialsChimeraActivity.k = new ajcn("account_type");
        UpdateCredentialsChimeraActivity.l = new ajcn("auth_code");
        UpdateCredentialsChimeraActivity.h = new ajcn("token_handle");
        UpdateCredentialsChimeraActivity.i = new ajcn("succeeded");
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        return new amek(this, ((Account)this.x().a(UpdateCredentialsChimeraActivity.k)), ((String)this.x().a(UpdateCredentialsChimeraActivity.l)), this.y().c);
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        Account account0 = (Account)this.x().a(UpdateCredentialsChimeraActivity.k);
        if(((Bundle)object0) != null && ((Bundle)object0).getBoolean(UpdateCredentialsChimeraActivity.i.a)) {
            UpdateCredentialsChimeraActivity.j.h("Updated credentials for account: " + baun.q(account0), new Object[0]);
            this.gN(-1, new Intent().putExtras(((Bundle)object0)));
            return;
        }
        UpdateCredentialsChimeraActivity.j.m("Failed to update credentials for account: " + baun.q(account0), new Object[0]);
        this.gN(0, null);
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }

    @Override  // amdx
    protected final String gQ() {
        return "UpdateCredentialsActivity";
    }

    @Override  // amdx
    protected final void gR() {
        if(adhx.a.a(this)) {
            this.setTheme(0x7F160F92);  // style:TvMinuteMaidOpaque
            return;
        }
        super.gR();
    }

    public static Intent k(Context context0, Account account0, String s, boolean z, bagx bagx0) {
        Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.auth.uiflows.common.UpdateCredentialsActivity");
        ajco ajco0 = amef.C(bagx0, z);
        ajco0.d(UpdateCredentialsChimeraActivity.k, account0);
        ajco0.d(UpdateCredentialsChimeraActivity.l, s);
        return intent0.putExtras(ajco0.a);
    }

    @Override  // amef
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(adhx.a.a(this)) {
            this.setContentView(LayoutInflater.from(this).inflate(0x7F0E013E, null));  // layout:auth_tv_suw_glif_activity
        }
        lup.a(this).c(0, null, this);
    }
}

