package com.google.android.gms.auth.aang.impl.deviceaccount;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import acse;
import adci;
import adga;
import adri;
import aktc;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import batl;
import bboh;
import cljp;
import clkn;
import clko;
import cllr;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import ggtj;
import hoyp;
import iapl;
import java.io.IOException;

public class DeviceAccountDeletionTaskService extends GmsTaskBoundService {
    public static final int a;
    private static final bboh b;

    static {
        DeviceAccountDeletionTaskService.b = adga.a("DeviceAccountDeletionTaskService");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        adri adri1;
        Bundle bundle0 = cllr0.b;
        if(bundle0 == null) {
            ((ggtj)DeviceAccountDeletionTaskService.b.j()).x("Failing task because there are no extras.");
            return 2;
        }
        int v = DeviceAccountDeletionTaskService.d(bundle0);
        if(v == -1) {
            ((ggtj)DeviceAccountDeletionTaskService.b.j()).x("Failing task because there is no UserHandle ID included in the extras Bundle.");
            return 2;
        }
        String s = cllr0.a;
        switch(DeviceAccountDeletionTaskService.f(s)) {
            case "TASK_DELETE_DEVICE_ACCOUNT": {
                if(hoyp.e()) {
                    String s1 = bundle0.getString("EXTRA_IDDID");
                    String s2 = bundle0.getString("EXTRA_DELETION_BEARER_TOKEN");
                    if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)adri.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s1.getClass();
                        ((adri)hftv0).b = s1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        adri adri0 = (adri)hftp0.b_message;
                        s2.getClass();
                        adri0.c = s2;
                        adri1 = (adri)hftp0.N_build();
                        goto label_32;
                    }
                    ((ggtj)DeviceAccountDeletionTaskService.b.j()).x("Empty iddid or deletion bearer token. Failing task.");
                    return 2;
                }
                else {
                    adri1 = null;
                }
            label_32:
                aktc aktc0 = new aktc(AppContextProvider.a());
                try {
                    adci adci0 = (adci)adci.a.b();
                    Integer integer0 = v;
                    if(adri1 == null) {
                        adri1 = adci0.a(integer0);
                    }
                    if(adci0.c(aktc0, adri1) != null) {
                        integer0.getClass();
                        batl.s(adri1);
                        adci0.e(v, adri1);
                        ((ggtj)adci.b.h()).B("Deleted device account for user %d", integer0);
                    }
                    return 0;
                }
                catch(IOException iOException0) {
                    ((ggtj)((ggtj)DeviceAccountDeletionTaskService.b.j()).s(iOException0)).z("Error retrieving device account deletion data for user %d.", v);
                }
                catch(iapl | acse exception0) {
                    ((ggtj)((ggtj)DeviceAccountDeletionTaskService.b.j()).s(exception0)).z("Failed to delete device account for user %d.", v);
                }
                finally {
                    aktc0.b();
                }
                return 1;
            }
            case "TASK_STORE_DEVICE_ACCOUNT_DELETION_DATA": {
                String s3 = bundle0.getString("EXTRA_IDDID");
                String s4 = bundle0.getString("EXTRA_DELETION_BEARER_TOKEN");
                if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4)) {
                    try {
                        ((adci)adci.a.b()).f(v, s3, s4);
                        return 0;
                    }
                    catch(IOException iOException1) {
                        ((ggtj)((ggtj)DeviceAccountDeletionTaskService.b.j()).s(iOException1)).z("Error storing device account deletion data for user %d.", v);
                        return 1;
                    }
                }
                ((ggtj)DeviceAccountDeletionTaskService.b.j()).x("Cannot store device deletion data. IdDID and/or token is empty.");
                return 2;
            }
            default: {
                ((ggtj)DeviceAccountDeletionTaskService.b.j()).B("Unknown tag=%s", DeviceAccountDeletionTaskService.f(s));
                return 2;
            }
        }
    }

    public static int d(Bundle bundle0) {
        return bundle0 == null ? -1 : bundle0.getInt("android.intent.extra.user_handle", -1);
    }

    public static String e(String s, int v) {
        return TextUtils.concat(new CharSequence[]{s, "#USER", String.valueOf(v)}).toString();
    }

    public static String f(String s) {
        int v = s.lastIndexOf("#USER");
        return v == -1 ? s : s.substring(0, v);
    }

    public static void g(Context context0, int v) {
        if(v == -1) {
            ((ggtj)DeviceAccountDeletionTaskService.b.j()).z("Trying to schedule DeleteDeviceAccount task with invalid user ID %d", -1);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putInt("android.intent.extra.user_handle", v);
        if(hoyp.e()) {
            try {
                adri adri0 = ((adci)adci.a.b()).a(Integer.valueOf(v));
                if(adri0 == null) {
                    ((ggtj)DeviceAccountDeletionTaskService.b.j()).z("No deletion data found for user %d", v);
                    return;
                }
                bundle0.putString("EXTRA_IDDID", adri0.b);
                bundle0.putString("EXTRA_DELETION_BEARER_TOKEN", adri0.c);
            }
            catch(IOException iOException0) {
                a.ae(DeviceAccountDeletionTaskService.b.j(), "Error getting deletion data", iOException0);
                return;
            }
        }
        clkn clkn0 = new clkn();
        clkn0.t(DeviceAccountDeletionTaskService.e("TASK_DELETE_DEVICE_ACCOUNT", v));
        clkn0.e(hoyp.c(), hoyp.b());
        clkn0.p = true;
        clkn0.u = bundle0;
        clkn0.v(2);
        clkn0.w(DeviceAccountDeletionTaskService.class.getName());
        clkn0.g(0);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

