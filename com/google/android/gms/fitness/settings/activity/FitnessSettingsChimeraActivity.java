package com.google.android.gms.fitness.settings.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;
import bbdg;
import bbpr;
import brmv;
import brrv;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import dknn;
import gftb;
import hszi;

@GmsCoreVeId(0x3F3F2)
public class FitnessSettingsChimeraActivity extends brmv implements View.OnClickListener {
    static {
        brrv.a();
    }

    public FitnessSettingsChimeraActivity() {
        super(0x7F15082D);  // string:common_fitness_settings_title "Google Fit"
    }

    private final void g(int v) {
        if(!bbpr.c(this)) {
            Toast.makeText(this, 0x7F1508A2, 1).show();  // string:common_no_network "Unavailable because the device is offline"
            return;
        }
        int v1 = (int)hszi.a.b().b();
        int v2 = (int)hszi.a.b().a();
        String s = hszi.a.b().g();
        String s1 = LocaleList.getDefault().toLanguageTags();
        if(s1 != null) {
            s = Uri.parse(s).buildUpon().appendQueryParameter("hl", s1).build().toString();
        }
        String s2 = this.a();
        gftb.check(s2);
        Intent intent0 = dknn.b(s, s2, v1, v2);
        intent0.addFlags(0x18000000);
        this.startActivityForResult(intent0, v);
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 1: {
                break;
            }
            case 2: {
                v = 2;
                break;
            }
            default: {
                return;
            }
        }
        Intent intent1 = new Intent("com.google.android.gms.fitness.START_SYNC");
        intent1.setPackage("com.google.android.gms");
        intent1.putExtra("account", this.a());
        intent1.putExtra("sync_source", 4);
        intent1.putExtra("sync_server", true);
        this.sendBroadcast(intent1);
        if(v == 2) {
            this.finish();
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        int v = view0.getId();
        if(v == 0x7F0B0F8F) {  // id:connected_apps_and_devices
            this.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 412).putExtra("extra.accountName", this.a()), 3);
            return;
        }
        if(v == 0x7F0B1896) {  // id:manage_data_sources
            this.g(1);
        }
    }

    @Override  // brmv
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.af);
        super.onCreate(bundle0);
        if("com.google.android.gms.fitness.settings.DELETE_HISTORY".equals(this.getIntent().getAction())) {
            this.g(2);
            return;
        }
        this.setContentView(0x7F0E03B5);  // layout:fitness_settings
        View view0 = this.findViewById(0x7F0B0F8F);  // id:connected_apps_and_devices
        this.findViewById(0x7F0B1896).setOnClickListener(this);  // id:manage_data_sources
        view0.setVisibility(0);
        view0.setOnClickListener(this);
    }
}

