package com.google.android.gms.usagereporting.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import bbcu;
import bbdg;
import bboh;
import bbrx;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import faij;
import fakq;
import ffue;
import xni;

@GmsCoreVeId(0x3FEA4)
public class UsageReportingChimeraActivity extends xni implements View.OnClickListener, bbrx {
    private faij j;

    static {
        bboh.b("UsageReportingActivity", bbcu.ab);
    }

    @Override  // bbrx
    public final void a(boolean z) {
        new UsageReportingOptInOptions((z ? 1 : 2));
        throw null;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        view0.getClass();
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.ih);
        super.onCreate(bundle0);
        this.getApplicationContext();
        this.startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.usagereporting.settings.CollapseUsageReportingActivity"));
        this.finish();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F100043, menu0);  // menu:usage_reporting_settings_menu
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B1FD7: {  // id:settings_help
                Uri uri0 = ffue.a(this);
                this.startActivity(new Intent("android.intent.action.VIEW").setData(uri0));
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // xni
    public final void onStart() {
        super.onStart();
        this.j = new fakq(this);
        throw null;
    }

    @Override  // xni
    public final void onStop() {
        if(this.j != null) {
            throw null;
        }
        super.onStop();
    }
}

