package com.google.android.gms.smartdevice.quickstart.ui;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bagr;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import erch;
import erci;
import erqc;
import fgss;
import hpbc;
import hyis;
import xnj;

@GmsCoreVeId(0x3FDAF)
public final class QuickStartHalfSheetChimeraActivity extends xnj {
    public fgss h;
    private static final erqc i;

    static {
        QuickStartHalfSheetChimeraActivity.i = new erqc(new String[]{"QuickStartHalfSheetChimeraActivity"});
    }

    @Override  // xnj
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!hyis.a.k().K()) {
            QuickStartHalfSheetChimeraActivity.i.m("Activity is not enabled", new Object[0]);
            this.finish();
            return;
        }
        if(hpbc.c()) {
            bagr.a(this);
        }
        this.setContentView(0x7F0E09E0);  // layout:smartdevice_fast_pair_two_button_half_sheet
        String s = this.getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID");
        QuickStartHalfSheetChimeraActivity.i.d("Showing QuickStart half-sheet dialog for %s", new Object[]{s});
        this.h = fgss.b(this.getContainerActivity(), this.c, s, false);
        String s1 = this.getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_NAME");
        String s2 = s1 == null ? "Set up your device" : this.getString(0x7F152E86, new Object[]{s1});  // string:smartdevice_half_sheet_title "Set up your %s"
        ((TextView)this.findViewById(0x7F0B1645)).setText(s2);  // id:half_sheet_title_textview
        this.setTitle(s2);
        ((TextView)this.findViewById(0x7F0B1644)).setText(0x7F152E85);  // id:half_sheet_subtitle_textview
        byte[] arr_b = this.getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_IMAGE");
        if(arr_b != null) {
            ImageView imageView0 = (ImageView)this.findViewById(0x7F0B1643);  // id:half_sheet_device_imageview
            try {
                imageView0.setImageBitmap(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                QuickStartHalfSheetChimeraActivity.i.n("Failed to decode device image", outOfMemoryError0, new Object[0]);
            }
        }
        Button button0 = (Button)this.findViewById(0x7F0B1641);  // id:half_sheet_button
        button0.setText(0x7F152E83);  // string:smartdevice_half_sheet_button_text_short "Set up"
        button0.setOnClickListener(new erch(this));
        Button button1 = (Button)this.findViewById(0x7F0B1642);  // id:half_sheet_button_secondary
        button1.setText(0x7F15081F);  // string:common_dismiss "Dismiss"
        button1.setOnClickListener(new erci(this));
    }
}

