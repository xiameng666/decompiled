import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.ServiceType;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class epyt {
    public final cjpc a;
    public static final int b;
    private static final baun c;
    private final Context d;

    static {
        epyt.c = new erqc(new String[]{"D2D", "EsimController"});
    }

    public epyt(Context context0) {
        this.d = context0;
        this.a = cjqh.a(context0, "smartdevice", "SmartDevice.EsimController", 0);
    }

    public final evql a(epzc epzc0, EsimActivationInfo esimActivationInfo0) {
        evql evql0;
        long v1;
        if(esimActivationInfo0 != null && hyhh.a.b().e()) {
            epzc0.c(7, true);
            Context context0 = this.d;
            List list0 = ((SubscriptionManager)context0.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v = SubscriptionManager.getDefaultDataSubscriptionId();
            for(Object object0: list0) {
                SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)object0;
                if(subscriptionInfo0.isEmbedded()) {
                    arrayList0.add(subscriptionInfo0);
                    if(subscriptionInfo0.getSubscriptionId() == v) {
                        v = -1;
                    }
                }
            }
            if(v != -1) {
                for(Object object1: list0) {
                    SubscriptionInfo subscriptionInfo1 = (SubscriptionInfo)object1;
                    if(subscriptionInfo1.getSubscriptionId() == v) {
                        arrayList0.add(subscriptionInfo1);
                    }
                }
            }
            for(Object object2: list0) {
                SubscriptionInfo subscriptionInfo2 = (SubscriptionInfo)object2;
                if(!subscriptionInfo2.isEmbedded() && subscriptionInfo2.getSubscriptionId() != v) {
                    arrayList0.add(subscriptionInfo2);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            csml csml0 = new csml(context0, null);
            for(Object object3: arrayList0) {
                SubscriptionInfo subscriptionInfo3 = (SubscriptionInfo)object3;
                try {
                    v1 = Long.parseLong(esimActivationInfo0.e);
                }
                catch(NumberFormatException numberFormatException0) {
                    evql0 = evrg.c(numberFormatException0);
                    goto label_59;
                }
                epys epys0 = new epys(this);
                TelephonyManager telephonyManager0 = ((TelephonyManager)this.d.getSystemService(TelephonyManager.class)).createForSubscriptionId(subscriptionInfo3.getSubscriptionId());
                CheckAuthStatusRequest checkAuthStatusRequest0 = new CheckAuthStatusRequest();
                checkAuthStatusRequest0.a = "smartDevice";
                checkAuthStatusRequest0.c = v1;
                ServiceType serviceType0 = new ServiceType();
                serviceType0.a = 6;
                checkAuthStatusRequest0.b = serviceType0;
                AuthType authType0 = new AuthType();
                authType0.a = 2;
                checkAuthStatusRequest0.d = authType0;
                checkAuthStatusRequest0.e = telephonyManager0.getSubscriberId();
                batl.c(checkAuthStatusRequest0.a != null, "Need a non-null request_id.");
                azzc azzc0 = new azzc();
                azzc0.a = new csme(csml0, checkAuthStatusRequest0);
                azzc0.c = new Feature[]{csma.a};
                azzc0.d = 0x4075;
                evql0 = csml0.jn(azzc0.a()).g(new epyq(epys0, csml0)).g(new epyo(epys0, esimActivationInfo0, telephonyManager0, csml0)).g(new epyr(epys0, esimActivationInfo0, subscriptionInfo3));
            label_59:
                arrayList1.add(evql0);
            }
            return evrg.g(arrayList1).c(new epyp());
        }
        return null;
    }

    public final evql b() {
        String s = cjpd.c(this.a, "esimActivationPayload", null);
        if(s == null) {
            return evrg.d(new ArrayList());
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            JSONArray jSONArray0 = new JSONArray(s);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                EsimActivationPayload esimActivationPayload0 = new EsimActivationPayload();
                esimActivationPayload0.aw(jSONArray0.getJSONObject(v).toString().getBytes("UTF-8"));
                arrayList0.add(esimActivationPayload0);
            }
            return evrg.d(arrayList0);
        }
        catch(erpd | UnsupportedEncodingException | JSONException exception0) {
            return evrg.c(exception0);
        }
    }

    public final void c(ArrayList arrayList0) {
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: arrayList0) {
                jSONArray0.put(new JSONObject(((EsimActivationPayload)object0).toString()));
            }
            cjpa cjpa0 = this.a.c();
            cjpa0.h("esimActivationPayload", jSONArray0.toString());
            cjpd.f(cjpa0);
        }
        catch(JSONException unused_ex) {
            epyt.c.f("Invalid esimActivationPayloads: " + arrayList0.toString(), new Object[0]);
        }
    }
}

