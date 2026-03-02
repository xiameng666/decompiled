package com.google.android.location.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bbdg;
import ccmq;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import fxwv;
import fxwx;
import fxwy;
import fxwz;
import fxxa;
import fxxb;
import fxxc;
import fxxd;
import fxxe;
import gged_interceptors;
import huqb;
import xni;

@GmsCoreVeId(0x3FAF2)
public class EAlertGoogleSettingDebugChimeraActivity extends xni {
    public Context j;

    public final Intent a(EAlertUxArgs eAlertUxArgs0) {
        Intent intent0 = IntentOperation.getStartIntent(this.j, "com.google.android.location.settings.EAlertGoogleSettingAlertIntentOperation", "com.google.android.gms.location.EALERT_GOOGLE_SETTING_DEBUG");
        intent0.putExtra("EALERT_TAKE_ACTION_ARGS", eAlertUxArgs0);
        return intent0;
    }

    public static EAlertUxArgs g(int v, int v1, boolean z) {
        return new EAlertUxArgs(0x5EB3805DL, new LatLng(35.195, -119.014), 5.6f, new LatLng(37.356891, -122.015399), 41.244, gged_interceptors.t(new LatLng(35.742585, -119.753327), new LatLng(35.746564, -119.361161), new LatLng(35.826096, -118.846443), new LatLng(35.555364, -118.459179), new LatLng(35.375694, -118.260255), new LatLng(35.263003, -118.5396), new LatLng(35.080621, -118.736953), new LatLng(34.994799, -119.067459), new LatLng(35.106504, -119.344765)), true, "Test Ealert", 0x5EB3805DL, 180000L, v, gged_interceptors.t(new LatLng(35.884361, -119.858664), new LatLng(36.151141, -119.353392), new LatLng(35.97245, -118.221141), new LatLng(35.074946, -117.948517), new LatLng(34.74665, -118.676569), new LatLng(34.740596, -119.30427), new LatLng(34.926066, -119.72459), new LatLng(35.131208, -119.901096), new LatLng(35.30377, -119.937937)), 2, v1, "Test Region", z, false, false);
    }

    public static final EAlertUxArgs l(int v, long v1) {
        return new EAlertUxArgs(0L, null, 0.0f, new LatLng(37.356891, -122.015399), 0.0, null, true, "Test ARW Ealert", 0x5EB3805DL, v1, v, null, 0, 0, "Test ARW Region", false, false, false);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.jj);
        super.onCreate(bundle0);
        if(huqb.Q()) {
            this.j = this;
            this.setContentView(0x7F0E0306);  // layout:ealert_google_setting_debug
            View view0 = this.findViewById(0x7F0B10B7);  // id:debug_buttons_scroll_view
            View view1 = view0.getRootView().findViewById(0x7F0B0AC2);  // id:action_bar_container
            view1.getViewTreeObserver().addOnGlobalLayoutListener(new fxxe(this, view1, view0));
            this.getWindow().getDecorView().setOnApplyWindowInsetsListener(new fxwy());
            this.findViewById(0x7F0B0D6F).setOnClickListener(new fxwv(this, 1));  // id:btn_take_action
            this.findViewById(0x7F0B0D71).setOnClickListener(new fxwv(this, 2));  // id:btn_take_action_expect_shaking
            View view2 = this.findViewById(0x7F0B0D70);  // id:btn_take_action_delay
            view2.setOnClickListener(new fxwz(this, view2));
            this.findViewById(0x7F0B0D54).setOnClickListener(new fxwx(this, 4, false));  // id:btn_eew_nearby_alert
            this.findViewById(0x7F0B0D55).setOnClickListener(new fxwx(this, 4, true));  // id:btn_eew_nearby_notification
            this.findViewById(0x7F0B0D56).setOnClickListener(new fxwx(this, 3, false));  // id:btn_eew_occurred_notification
            this.findViewById(0x7F0B0D53).setOnClickListener(new fxwx(this, 6, false));  // id:btn_eew_followup_qualified_notification
            this.findViewById(0x7F0B0D52).setOnClickListener(new fxwx(this, 7, false));  // id:btn_eew_followup_false_notification
            this.findViewById(0x7F0B0D41).setOnClickListener(new fxxa(this));  // id:btn_arw_alert_notification
            this.findViewById(0x7F0B0D42).setOnClickListener(new fxxb(this));  // id:btn_arw_all_clear_notification
            this.findViewById(0x7F0B0D43).setOnClickListener(new fxxc(this));  // id:btn_arw_artillery_alert_notification
            this.findViewById(0x7F0B0D44).setOnClickListener(new fxxd(this));  // id:btn_arw_artillery_all_clear_notification
        }
    }
}

