package com.google.android.gms.mdi.download.ui;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import azts;
import azzc;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cpuw;
import cpyi;
import cpyj;
import cpyk;
import cpys;
import cpyt;
import java.util.ArrayList;
import xni;

@GmsCoreVeId(0x3FB6E)
public class DebugUiChimeraActivity extends xni {
    public ArrayAdapter j;

    public final void a() {
        azts azts0 = new azts(this, null, null);
        azzc azzc0 = new azzc();
        azzc0.d = 303;
        azzc0.a = new cpuw(azts0);
        azts0.iG(azzc0.a()).b(new cpys(this));
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0E056B);  // layout:mdd_debug_activity
        this.setTitle(0x7F15182C);  // string:mdd_debug_ui_title "MDD Debug"
        ((Button)this.findViewById(0x7F0B1E28)).setOnClickListener(new cpyi(this));  // id:refresh_file_group_list
        ((Button)this.findViewById(0x7F0B10C7)).setOnClickListener(new cpyj(this));  // id:delete_all_downloaded_files
        ((Button)this.findViewById(0x7F0B235B)).setOnClickListener(new cpyk(this));  // id:trigger_download
        ListView listView0 = (ListView)this.findViewById(0x7F0B13D0);  // id:file_group_list
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, 0x1090003, new ArrayList());
        this.j = arrayAdapter0;
        listView0.setAdapter(arrayAdapter0);
        this.a();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        cpyt cpyt0 = new cpyt(this);
        menu0.add(0, 1, 0, "Trigger Maintenance Task").setOnMenuItemClickListener(cpyt0);
        return super.onCreateOptionsMenu(menu0);
    }
}

