package com.google.android.gms.ads.identifier.util;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.adservices.common.AdServicesCommonManager;
import android.adservices.common.UpdateAdIdRequest.Builder;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.ads.identifier.log.a;
import gldi;
import gldm;
import glil;
import glim;
import gmbu;
import gmcd;
import j..util.Objects;
import java.util.concurrent.Executor;
import jqy;

public final class d {
    public static boolean a(String s) {
        return Objects.equals(s, "com.google.android.adservices.api") || Objects.equals(s, "com.android.adservices.api");
    }

    public static boolean b(String s) {
        return Objects.equals(s, "com.google.android.ext.adservices.api") || Objects.equals(s, "com.android.ext.adservices.api");
    }

    public static boolean c(String s) {
        return Objects.equals(s, "com.google.android.ext.services") || Objects.equals(s, "com.android.ext.services");
    }

    public static final AdServicesCommonManager d(Context context0) {
        try {
            return Build.VERSION.SDK_INT < 33 ? AdServicesCommonManager.get(context0) : ((AdServicesCommonManager)context0.getSystemService(AdServicesCommonManager.class));
        }
        catch(NoClassDefFoundError unused_ex) {
            Log.e("AdservicesUtils", "Couldn\'t find Common Manager.");
            return null;
        }
    }

    public final void e(Context context0, String s, boolean z, Executor executor0) {
        gmcd gmcd0;
        long v;
        try {
            v = System.currentTimeMillis();
            AdServicesCommonManager adServicesCommonManager0 = d.d(context0);
            if(adServicesCommonManager0 == null) {
                Log.e("AdservicesUtils", "adServicesCommonManager is null");
                gmcd0 = gmbu.i(Boolean.valueOf(false));
            }
            else {
                gmcd0 = jqy.a(new b(this, adServicesCommonManager0, new UpdateAdIdRequest.Builder(s).setLimitAdTrackingEnabled(z).build(), executor0));
            }
            long v1 = System.currentTimeMillis();
            if(((Boolean)gmcd0.get()).booleanValue()) {
                glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gldm)hftv0).b |= 1;
                ((gldm)hftv0).e = v;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gldm)hftv1).b |= 2;
                ((gldm)hftv1).f = v1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gldm)hftp0.b_message).g = 1;
                ((gldm)hftp0.b_message).b |= 4;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gldi.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gldi)hftp1.b_message).f = 2;
                ((gldi)hftp1.b_message).b |= 8;
                gldi gldi0 = (gldi)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gldm gldm0 = (gldm)hftp0.b_message;
                gldi0.getClass();
                gldm0.d = gldi0;
                gldm0.c = 4;
                glil0.s(hftp0);
                a.a(((glim)((ProtoLiteBuilder)glil0).N_build()));
                Log.v("AdservicesUtils", "Successful to Update Adservices Ad ID.");
                return;
            }
            a.b(v, 7);
            Log.v("AdservicesUtils", "Failed to Update Adservices Ad ID.");
        }
        catch(Exception exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
                a.b(v, 8);
            }
            else if((exception0 instanceof IllegalStateException)) {
                a.b(v, 6);
            }
            else if((exception0 instanceof SecurityException)) {
                a.b(v, 3);
            }
            else {
                a.b(v, 1);
            }
            Log.e("AdservicesUtils", "Encountered Error to Update Adservices Ad ID: ", exception0);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            a.b(v, 2);
            Log.e("AdservicesUtils", "Encountered NoClassDefFoundError to Update Adservices Ad ID: ", noClassDefFoundError0);
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            a.b(v, 2);
            Log.e("AdservicesUtils", "Encountered NoSuchMethodError to Update Adservices Ad ID: ", noSuchMethodError0);
        }
    }
}

