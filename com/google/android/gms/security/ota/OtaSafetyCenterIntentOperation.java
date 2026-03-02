package com.google.android.gms.security.ota;

import a;
import android.app.admin.DevicePolicyManager;
import android.app.admin.SystemUpdateInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.safetycenter.SafetyCenterManager;
import android.safetycenter.SafetyEvent.Builder;
import android.safetycenter.SafetyEvent;
import android.safetycenter.SafetySourceData.Builder;
import android.safetycenter.SafetySourceData;
import android.safetycenter.SafetySourceErrorDetails;
import android.safetycenter.SafetySourceIssue.Action.Builder;
import android.safetycenter.SafetySourceIssue.Builder;
import android.safetycenter.SafetySourceStatus.Builder;
import android.text.format.DateFormat;
import bbcu;
import bboh;
import bbqa;
import com.google.android.chimera.IntentOperation;
import elhn;
import elho;
import gged_interceptors;
import ggtj;
import hxvt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import jys;

public final class OtaSafetyCenterIntentOperation extends IntentOperation {
    private static final String a = "OtaSafetyCenterIntentOperation";
    private static final bboh b;
    private Context c;
    private elho d;
    private SafetyCenterManager e;

    static {
        OtaSafetyCenterIntentOperation.b = bboh.b("OtaSafetyCenterIntentOperation", bbcu.dX);
    }

    private static boolean a() {
        return hxvt.a.c().f() && jys.d();
    }

    private static final int b(Date date0) {
        long v = new Date().getTime() - date0.getTime();
        return v > 0L ? ((int)TimeUnit.DAYS.convert(v, TimeUnit.MILLISECONDS)) : -1;
    }

    private static final Date c() {
        String s = Build.VERSION.SECURITY_PATCH;
        if(s != null) {
            try {
                SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)SimpleDateFormat.getDateInstance();
                simpleDateFormat0.applyPattern("yyyy-MM-dd");
                return simpleDateFormat0.parse(s);
            }
            catch(ParseException parseException0) {
                throw new elhn(parseException0);
            }
        }
        throw new elhn();
    }

    private static final SafetyEvent d(String s) {
        return new SafetyEvent.Builder(200).setRefreshBroadcastId(s).build();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context context0 = this.getApplicationContext();
        this.c = context0;
        this.d = new elho(context0);
        if(bbqa.c()) {
            this.e = (SafetyCenterManager)context0.getSystemService(SafetyCenterManager.class);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        SafetySourceData safetySourceData0;
        if(bbqa.c() && intent0 != null && intent0.getAction() != null && (this.e != null && this.e.isSafetyCenterEnabled())) {
            if("android.safetycenter.action.REFRESH_SAFETY_SOURCES".equals(intent0.getAction())) {
                String[] arr_s = intent0.getStringArrayExtra("android.safetycenter.extra.REFRESH_SAFETY_SOURCE_IDS");
                if(arr_s != null && arr_s.length != 0 && gged_interceptors.k(arr_s).contains("GoogleSecurityUpdates")) {
                    int v = 200;
                    String s = intent0.getStringExtra("android.safetycenter.extra.REFRESH_SAFETY_SOURCES_BROADCAST_ID");
                    try {
                        if(OtaSafetyCenterIntentOperation.a()) {
                            try {
                                SystemUpdateInfo systemUpdateInfo0 = null;
                                systemUpdateInfo0 = ((DevicePolicyManager)this.c.getSystemService(DevicePolicyManager.class)).getPendingSystemUpdate(null);
                            }
                            catch(NullPointerException nullPointerException0) {
                                a.ae(OtaSafetyCenterIntentOperation.b.j(), "Unable to fetch pending system update for Safety Center", nullPointerException0);
                            }
                            if(systemUpdateInfo0 != null) {
                                elho elho0 = this.d;
                                if(((long)OtaSafetyCenterIntentOperation.b(new Date(systemUpdateInfo0.getReceivedTime()))) > (systemUpdateInfo0.getSecurityPatchState() == 1 ? hxvt.a.c().a() : hxvt.a.c().d())) {
                                    v = 300;
                                }
                                safetySourceData0 = new SafetySourceData.Builder().setStatus(new SafetySourceStatus.Builder("Security update", "Update available", v).build()).addIssue(new SafetySourceIssue.Builder("SecurityUpdateAvailableIssue", "Update available", "An update is available for your device", v, "SecurityUpdateAvailableIssueType").addAction(new SafetySourceIssue.Action.Builder("OpenSecurityUpdateSettingsAction", "Update your device", elho0.a()).build()).setIssueCategory(100).build()).build();
                                goto label_34;
                            }
                            goto label_18;
                        }
                        else {
                        label_18:
                            Date date0 = OtaSafetyCenterIntentOperation.c();
                            int v1 = OtaSafetyCenterIntentOperation.b(date0);
                            if(((long)v1) > hxvt.b()) {
                                safetySourceData0 = this.d.b(v1);
                            }
                            else if(!OtaSafetyCenterIntentOperation.a() && ((long)v1) > hxvt.a.c().b()) {
                                safetySourceData0 = this.d.b(v1);
                            }
                            else {
                                elho elho1 = this.d;
                                String s1 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "dMMMMyyyy"), Locale.getDefault()).format(date0);
                                safetySourceData0 = new SafetySourceData.Builder().setStatus(new SafetySourceStatus.Builder("Security update", elho1.a.getString(0x7F1529B0, new Object[]{s1}), 200).build()).build();  // string:safety_center_gota_update_from_date_settings_entry_body "Update from %1$s"
                            }
                        }
                    }
                    catch(elhn elhn0) {
                        a.ae(OtaSafetyCenterIntentOperation.b.i(), "Unable to build OTA (Security updates) safety source data", elhn0);
                        this.e.reportSafetySourceError("GoogleSecurityUpdates", new SafetySourceErrorDetails(OtaSafetyCenterIntentOperation.d(s)));
                        return;
                    }
                label_34:
                    this.e.setSafetySourceData("GoogleSecurityUpdates", safetySourceData0, OtaSafetyCenterIntentOperation.d(s));
                }
            }
            else {
                ((ggtj)OtaSafetyCenterIntentOperation.b.j()).B("onHandleIntent called with an unexpected intent action: %s", intent0.getAction());
            }
        }
    }
}

