package com.google.android.gms.icing.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import bbdg;
import bwts;
import bxch;
import bxck;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import huar;
import jua;
import xni;

@GmsCoreVeId(0x3F6B5)
public class IcingManageSpaceChimeraActivity extends xni implements AdapterView.OnItemClickListener {
    public View j;
    public View k;
    public TextView l;
    public ListView m;
    public TextView n;
    private bxch o;

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.no);
        super.onCreate(bundle0);
        this.setContentView(0x7F0E04D4);  // layout:icing_manage_space_activity
        this.j = this.findViewById(0x7F0B1891);  // id:main_view
        this.k = this.findViewById(0x7F0B16B5);  // id:icing_progress_bar
        this.l = (TextView)this.findViewById(0x7F0B2304);  // id:total_size_text
        ListView listView0 = (ListView)this.findViewById(0x7F0B0BDE);  // id:apps_list
        this.m = listView0;
        listView0.setOnItemClickListener(this);
        TextView textView0 = (TextView)this.findViewById(0x7F0B1207);  // id:empty_list_view
        this.n = textView0;
        this.m.setEmptyView(textView0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F10001C, menu0);  // menu:icing_manage_settings_menu
        return true;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        bxck bxck0 = (bxck)this.m.getAdapter();
        if(bxck0 != null && v >= 0 && v < bxck0.getCount()) {
            String s = bxck0.a(v).a;
            Intent intent0 = new Intent();
            intent0.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent0.setData(Uri.fromParts("package", s, null));
            this.startActivity(intent0);
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                jua.e(this.getContainerActivity());
                return true;
            }
            case 0x7F0B16B6: {  // id:icing_settings_help
                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(huar.a.d().B())));
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // xoi
    protected final void onPause() {
        bxch bxch0 = this.o;
        if(bxch0 != null) {
            bxch0.cancel(true);
            this.o = null;
        }
        super.onPause();
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        bxch bxch0 = new bxch(this);
        this.o = bxch0;
        bxch0.execute(new Void[0]);
        new bwts(this.getApplicationContext()).p(8004);
    }
}

