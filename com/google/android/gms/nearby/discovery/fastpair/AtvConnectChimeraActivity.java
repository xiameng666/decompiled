package com.google.android.gms.nearby.discovery.fastpair;

import ProtoLiteMessage;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager.LayoutParams;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cwfa;
import cwnf;
import cxjs;
import ggtj;
import hftc;
import hfur;
import xob;

@GmsCoreVeId(261009)
public class AtvConnectChimeraActivity extends xob {
    private Drawable j;
    private cwnf k;

    @Override  // com.google.android.chimera.android.Activity
    public final void finish() {
        super.finish();
        this.overridePendingTransition(0, 0x7F01004D);  // anim:fast_pair_bottom_sheet_exit
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getWindow().setGravity(81);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        byte[] arr_b = this.getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.ATV_CONNECT");
        if(arr_b == null) {
            this.finish();
            return;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)cxjs.b), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(((cxjs)hftv0) != null) {
                cwfa.a.d().B("AtvConnectChimeraActivity: Check the passing info %s", ((cxjs)hftv0).e);
            }
        }
        catch(hfur hfur0) {
            ((ggtj)cwfa.a.g().s(hfur0)).x("AtvConnectChimeraActivity: Error happened when passing info");
        }
        Intent intent0 = this.getIntent();
        Bundle bundle1 = new Bundle();
        bundle1.putByteArray("com.google.android.gms.nearby.discovery.ATV_CONNECT", intent0.getByteArrayExtra("com.google.android.gms.nearby.discovery.ATV_CONNECT"));
        bundle1.putParcelable("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT", intent0.getParcelableExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT"));
        bundle1.putString("com.google.android.gms.nearby.discovery.HALF_SHEET_DESCRIPTION", intent0.getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_DESCRIPTION"));
        bundle1.putInt("com.google.android.gms.nearby.discovery.HALF_SHEET_ID", intent0.getIntExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ID", 0));
        bundle1.putString("EXTRA_PAIRING_TYPE", intent0.getStringExtra("EXTRA_PAIRING_TYPE"));
        if(bundle0 != null && bundle0.containsKey("ARG_FRAGMENT_STATE")) {
            bundle1.putSerializable("ARG_FRAGMENT_STATE", bundle0.getSerializable("ARG_FRAGMENT_STATE"));
        }
        cwnf cwnf0 = new cwnf();
        cwnf0.setArguments(bundle1);
        this.k = cwnf0;
        this.setContentView(0x7F0E0366);  // layout:fast_pair_bottom_sheet
        this.overridePendingTransition(0x7F01004C, 0);  // anim:fast_pair_bottom_sheet_enter
        this.j = this.getResources().getDrawable(0x7F080280);  // drawable:bottom_sheet_bg
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v = displayMetrics0.widthPixels;
        int v1 = displayMetrics0.heightPixels;
        int v2 = this.getResources().getDimensionPixelSize(0x7F0702C8);  // dimen:bottom_sheet_dialog_height
        int v3 = this.getResources().getDimensionPixelSize(0x7F0702CD);  // dimen:bottom_sheet_margin
        int v4 = this.getResources().getDimensionPixelSize(0x7F0702CC);  // dimen:bottom_sheet_elevation
        WindowManager.LayoutParams windowManager$LayoutParams0 = this.getWindow().getAttributes();
        windowManager$LayoutParams0.width = v - (v3 + v3);
        windowManager$LayoutParams0.height = v2;
        windowManager$LayoutParams0.gravity = 81;
        windowManager$LayoutParams0.horizontalMargin = 0.0f;
        windowManager$LayoutParams0.verticalMargin = ((float)v3) / ((float)v1);
        windowManager$LayoutParams0.format = -2;
        windowManager$LayoutParams0.type = 2008;
        windowManager$LayoutParams0.flags |= 0x80;
        windowManager$LayoutParams0.flags |= 0x1000000;
        this.getWindow().setAttributes(windowManager$LayoutParams0);
        this.getWindow().setBackgroundDrawable(this.j);
        this.getWindow().setElevation(((float)v4));
        if(this.k != null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.G(0x7F0B14C5, this.k);  // id:fragment_container
            ca0.a();
        }
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        cwnf cwnf0 = this.k;
        if(cwnf0 != null) {
            cwnf0.onSaveInstanceState(bundle0);
        }
    }
}

