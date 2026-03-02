package com.google.android.gms.nearby.fastpair.sass.device.connection.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import clht;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cutr;
import cyjh;
import cypf;
import cypg;
import gfuy;
import ggtj;
import hvpg;
import xob;

@GmsCoreVeId(261010)
public class SassProcessChimeraActivity extends xob {
    private BroadcastReceiver j;
    private AudioManager k;
    private final Handler l;
    private AudioDeviceCallback m;

    public SassProcessChimeraActivity() {
        this.l = new clht(Looper.getMainLooper());
    }

    public final boolean a() {
        if(!this.getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
            return false;
        }
        AudioDeviceInfo[] arr_audioDeviceInfo = this.c().getDevices(2);
        for(int v = 0; v < arr_audioDeviceInfo.length; ++v) {
            if(arr_audioDeviceInfo[v].getType() == 8) {
                return true;
            }
        }
        return false;
    }

    public static final void b(Context context0) {
        ((ggtj)cyjh.a.d().ar(0x1F2E)).x("SassProcessChimeraActivity: Call bt settings.");
        Intent intent0 = new Intent("android.settings.BLUETOOTH_SETTINGS");
        intent0.putExtra("EXTRA_CONNECTION_ONLY", true);
        intent0.putExtra("EXTRA_CLOSE_ON_CONNECT", true);
        intent0.putExtra("EXTRA_IGNORE_SASS", true);
        intent0.putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
        intent0.addFlags(0x10008000);
        context0.startActivity(intent0);
    }

    private final AudioManager c() {
        if(this.k == null) {
            this.k = (AudioManager)this.getSystemService(AudioManager.class);
        }
        return this.k;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(this.a()) {
            ((ggtj)cyjh.a.d().ar(0x1F30)).x("SassProcessChimeraActivity: Bt headset connected already. Finish activity.");
            if(this.isFinishing()) {
                return;
            }
            this.finish();
            return;
        }
        AudioDeviceAttributes audioDeviceAttributes0 = this.c().getMutingExpectedDevice();
        if(audioDeviceAttributes0 == null) {
            SassProcessChimeraActivity.b(this);
            if(!this.isFinishing()) {
                this.finish();
            }
            return;
        }
        cutr.d(this, new Intent("com.google.android.gms.nearby.fastpair.sass.device.ACTION_CONNECTING_UI_LAUNCHING"));
        this.setContentView(0x7F0E0372);  // layout:fast_pair_sass_connecting
        ((TextView)this.findViewById(0x7F0B2289)).setText(audioDeviceAttributes0.getName());  // id:text_subtitle
        this.m = new cypg(this);
        AudioManager audioManager0 = this.c();
        AudioDeviceCallback audioDeviceCallback0 = this.m;
        gfuy.e(audioDeviceCallback0);
        audioManager0.registerAudioDeviceCallback(audioDeviceCallback0, null);
        cypf cypf0 = new cypf(this);
        long v = hvpg.a.aY().eR();
        this.l.postDelayed(cypf0, v);
        SassProcessChimeraActivity.2 sassProcessChimeraActivity$20 = new SassProcessChimeraActivity.2(this);
        this.j = sassProcessChimeraActivity$20;
        cutr.b(this, sassProcessChimeraActivity$20, new IntentFilter("com.google.android.gms.nearby.fastpair.sass.device.ACTION_WEAR_OS_CONNECTING_UI_DISMISS"));
    }

    @Override  // xoi
    protected final void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver0 = this.j;
        if(broadcastReceiver0 != null) {
            cutr.f(this, broadcastReceiver0);
        }
        if(this.m != null) {
            AudioManager audioManager0 = this.c();
            AudioDeviceCallback audioDeviceCallback0 = this.m;
            gfuy.e(audioDeviceCallback0);
            audioManager0.unregisterAudioDeviceCallback(audioDeviceCallback0);
        }
    }
}

