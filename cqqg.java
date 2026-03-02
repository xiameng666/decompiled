import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.CellInfo;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class cqqg {
    public static boolean a(Context context0) {
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        if(keyguardManager0 != null) {
            try {
                return keyguardManager0.isDeviceSecure();
            }
            catch(NullPointerException unused_ex) {
            }
        }
        return false;
    }

    public static hltq b(Context context0) {
        String s1;
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        String s = null;
        NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getNetworkInfo(1);
        if(networkInfo0 != null && networkInfo0.isConnected()) {
            WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
            if(wifiManager0 != null && wifiManager0.isWifiEnabled()) {
                WifiInfo wifiInfo0 = wifiManager0.getConnectionInfo();
                s1 = wifiInfo0 == null ? null : wifiInfo0.getSSID();
                if(TextUtils.isEmpty(s1) || "<unknown ssid>".equals(s1) || s1.toLowerCase(Locale.getDefault()).endsWith("_nomap")) {
                    s1 = null;
                }
            }
            else {
                s1 = null;
            }
        }
        else {
            s1 = null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hltq.a).v_newBuilder();
        WifiManager wifiManager1 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        if(wifiManager1 != null) {
            int v = WifiManager.calculateSignalLevel(wifiManager1.getConnectionInfo().getRssi(), 5);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hltq hltq0 = (hltq)hftp0.b_message;
            hltq0.b |= 16;
            hltq0.e = v;
        }
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        if(hxvi.a.e().v()) {
            SubscriptionManager subscriptionManager0 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
            if(subscriptionManager0 != null) {
                List list0 = subscriptionManager0.getActiveSubscriptionInfoList();
                if(list0 != null && !list0.isEmpty()) {
                    SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)list0.get(0);
                    if(subscriptionInfo0 != null) {
                        s = String.valueOf(subscriptionInfo0.getDisplayName());
                    }
                }
            }
        }
        else {
            s = telephonyManager0.getNetworkOperatorName();
        }
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hltq hltq1 = (hltq)hftp0.b_message;
            s.getClass();
            hltq1.b |= 0x40;
            hltq1.g = s;
        }
        try {
            List list1 = telephonyManager0.getAllCellInfo();
            if(list1 == null) {
                goto label_55;
            }
            else {
                Iterator iterator0 = list1.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_55;
                    }
                    Object object0 = iterator0.next();
                    int v1 = ((CellInfo)object0).getCellSignalStrength().getLevel();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hltq hltq2 = (hltq)hftp0.b_message;
                    hltq2.b |= 0x20;
                    hltq2.f = v1;
                }
            }
            goto label_62;
        }
        catch(SecurityException unused_ex) {
            cqqt.c("GmsCore does not have ACCESS_COARSE_LOCATION permission", new Object[0]);
        }
    label_55:
        if(s1 == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hltq hltq3 = (hltq)hftp0.b_message;
            hltq3.b |= 4;
            hltq3.c = false;
            return (hltq)hftp0.N_build();
        }
    label_62:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hltq)hftv0).b |= 4;
        ((hltq)hftv0).c = true;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltq hltq4 = (hltq)hftp0.b_message;
        hltq4.b |= 8;
        hltq4.d = s1;
        return (hltq)hftp0.N_build();
    }

    public static String c(PackageManager packageManager0, Intent intent0) {
        List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
        return list0.isEmpty() ? null : ((ResolveInfo)list0.get(0)).activityInfo.packageName;
    }
}

