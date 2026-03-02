package com.google.android.location.ealert.ux;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import bayn;
import bbdg;
import ca;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import du;
import evuh;
import fcfe;
import fcfo;
import fm;
import fvvw;
import fvwf;
import fvwj;
import fxmp;
import huqb;
import xni;

@GmsCoreVeId(0x3FAF3)
public class EAlertSafetyInfoChimeraActivity extends xni {
    public fvwf j;
    Bundle k;
    private fm l;
    private fcfe m;

    private final void a(du du0, String s) {
        if(du0 != null) {
            fm fm0 = this.l;
            if(fm0 != null) {
                ca ca0 = new ca(fm0);
                Bundle bundle0 = this.k;
                if(bundle0 != null) {
                    du0.setArguments(bundle0);
                }
                ca0.z(0x1020002, du0, s);
                ca0.a();
                return;
            }
        }
        Log.w("EAlertSafetyInfoAct", "null fragment or fragmentmanager, can\'t do the fragment transaction");
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.jj);
        super.onCreate(bundle0);
        if(this.l == null) {
            this.l = this.getSupportFragmentManager();
        }
        this.m = fcfo.d(this);
        this.setContentView(0x7F0E030A);  // layout:ealert_safety_info_container
        if(huqb.a.s().aU()) {
            MediaPlayer mediaPlayer0 = MediaPlayer.create(this, 0x7F140013);  // raw:be_aware_alert_sound
            if(mediaPlayer0 != null) {
                mediaPlayer0.release();
            }
        }
        Bundle bundle1 = this.getIntent().getExtras();
        this.k = bundle1;
        if(bundle1 != null) {
            String s = bundle1.getString("EALERT_UX_EXTRA");
            if(TextUtils.isEmpty(s)) {
                Log.w("EAlertSafetyInfoAct", "Calling safety info without specifying EALERT_UX_EXTRA");
                return;
            }
            EAlertUxArgs eAlertUxArgs0 = fxmp.b(this.k);
            fvwf fvwf0 = (fvwf)this.getSupportFragmentManager().h("EAlertTakeActionFragment");
            this.j = fvwf0;
            if(fvwf0 == null) {
                this.j = new fvwf();
            }
            switch(s) {
                case "EALERT_DEMO": {
                    this.a(this.j, "EAlertTakeActionFragmentDemo");
                    return;
                }
                case "EALERT_DISPLAY": {
                    if(eAlertUxArgs0 == null) {
                        Log.w("EAlertSafetyInfoAct", "Trying to show take action alert without shake related info.");
                        return;
                    }
                    int v = eAlertUxArgs0.k;
                    if(v != 5) {
                        Log.w("EAlertSafetyInfoAct", "Unknown ui " + v);
                        return;
                    }
                    this.a(this.j, "EAlertTakeActionFragment");
                    bayn bayn0 = bayn.f(this);
                    if(bayn0 != null) {
                        bayn0.o("BmGrzDxTRr6j7/D96FBC/Q", 0, evuh.bd);
                        return;
                    }
                    return;
                }
                case "EALERT_SAFETY_RT": {
                    break;
                }
                default: {
                    Log.w("EAlertSafetyInfoAct", "EALERT_UX_EXTRA bundle extra got unrecognized valued: " + s);
                    return;
                }
            }
            if(eAlertUxArgs0 != null) {
                this.a(new fvwj(), "EAlertTakeActionSafetyInfoFragment");
                return;
            }
            Log.w("EAlertSafetyInfoAct", "Trying to show take action info page without shake related info.");
        }
    }

    @Override  // xni
    public final void onDestroy() {
        if(huqb.P()) {
            this.m.m(new fvvw(this));
        }
        fvwf fvwf0 = this.j;
        if(fvwf0 != null) {
            fvwf0.onDestroy();
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(huqb.a.s().aR() && this.j.isVisible() && (v == 24 || v == 25)) {
            this.j.z(false);
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.finishAndRemoveTask();
            return true;
        }
        return false;
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(huqb.P()) {
            this.m.l(new fvvw(this), Uri.parse("wear://*/ealert_mute_alarm"));
        }
    }
}

