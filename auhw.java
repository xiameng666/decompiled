import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.images.WebImage;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class auhw implements auad {
    final auhx a;

    public auhw(auhx auhx0) {
        Objects.requireNonNull(auhx0);
        this.a = auhx0;
        super();
    }

    @Override  // auad
    public final void a() {
    }

    @Override  // auad
    public final void b() {
        Object object0;
        auhx auhx0 = this.a;
        auhy auhy0 = auhx0.A;
        if(auhy0 == null) {
            auhx0.c.g("onSocketConnected called when probing operation is null in controller!", new Object[0]);
            return;
        }
        auhx0.c.n("onSocketConnected to %s", auhy0.a);
        if(auhx0.d(avjg.a, String.format(Locale.ROOT, "{\"type\":\"CONNECT\",\"package\":\"%s\",\"origin\":{}}", new Object[]{auhx0.j}))) {
            String s = avjg.e;
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("type", "eureka_info");
                jSONObject0.put("request_id", 3);
                JSONArray jSONArray0 = new JSONArray();
                jSONArray0.put("version");
                jSONArray0.put("name");
                jSONArray0.put("multizone");
                jSONArray0.put(String.format("%s.%s", "device_info", "ssdp_udn"));
                jSONArray0.put(String.format("%s.%s", "device_info", "manufacturer"));
                jSONArray0.put(String.format("%s.%s", "device_info", "product_name"));
                jSONArray0.put(String.format("%s.%s", "build_info", "build_type"));
                jSONArray0.put(String.format("%s.%s", "build_info", "cast_build_revision"));
                jSONArray0.put(String.format("%s.%s", "build_info", "system_build_number"));
                jSONArray0.put(String.format("%s.%s.%s", "device_info", "capabilities", "multiplexed_connections_supported"));
                if(hqsq.c()) {
                    jSONArray0.put(String.format("%s.%s", "device_info", "cloud_device_id"));
                }
                if(avij.e().r()) {
                    jSONArray0.put(String.format("%s.%s.%s", "device_info", "capabilities", "wake_on_lan_supported"));
                    jSONArray0.put(String.format("%s.%s", "device_info", "mac_for_wol"));
                }
                if(avij.e().l()) {
                    jSONArray0.put("tos_accepted");
                }
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("params", jSONArray0);
                jSONObject0.put("data", jSONObject1);
                object0 = jSONObject0.toString();
            }
            catch(JSONException unused_ex) {
                object0 = null;
            }
            if(auhx0.d(s, object0)) {
                auhx auhx1 = this.a;
                ++auhx1.q;
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList(auhx1.g);
                int v1 = arrayList1.size();
                for(int v = 0; v < v1; ++v) {
                    String s1 = (String)arrayList1.get(v);
                    if(!s1.startsWith("%")) {
                        arrayList0.add(a.a(s1, "\"", "\""));
                    }
                }
                if(arrayList0.isEmpty()) {
                label_52:
                    if(auhx1.d(avjg.b, String.format(Locale.ROOT, "{\"type\":\"GET_STATUS\",\"requestId\":%d}", new Object[]{((int)2)}))) {
                        ++auhx1.q;
                        if(auhx1.A != null && auhx1.A.b) {
                            auhx1.z = auhx1.m.c.r();
                            String s3 = audd.a;
                            auhx1.y = avjn.g(System.currentTimeMillis());
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gegy.a).v_newBuilder();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gegt.a).v_newBuilder();
                            ByteString hfsf0 = auhx1.y;
                            if(hfsf0 != null) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                gegt gegt0 = (gegt)hftp1.b_message;
                                gegt0.b |= 2;
                                gegt0.c = hfsf0;
                            }
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gegt)hftp1.b_message).d = 1;
                            ((gegt)hftp1.b_message).b |= 4;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gegy gegy0 = (gegy)hftp0.b_message;
                            gegt gegt1 = (gegt)hftp1.N_build();
                            gegt1.getClass();
                            gegy0.c = gegt1;
                            gegy0.b |= 1;
                            if(auhx1.d(s3, ((gegy)hftp0.N_build()).toBytesArray())) {
                                ++auhx1.q;
                            }
                        }
                    }
                }
                else {
                    String s2 = String.format(Locale.ROOT, "{\"type\":\"GET_APP_AVAILABILITY\",\"appId\":[%s],\"requestId\":%d}", TextUtils.join(",", arrayList0), ((int)1));
                    if(auhx1.d(avjg.b, s2)) {
                        ++auhx1.q;
                        goto label_52;
                    }
                }
            }
        }
    }

    @Override  // auad
    public final void c(int v) {
        if(v == 2) {
            auhx auhx0 = this.a;
            auhy auhy0 = auhx0.A;
            if(auhy0 != null) {
                auhx0.c.f("Failed to connect to %s", new Object[]{auhy0.a});
            }
        }
        else {
            this.a.c.d("onSocketConnectionFailed. Error: %d", new Object[]{v});
        }
        auhx auhx1 = this.a;
        auhy auhy1 = auhx1.a(false);
        if(auhy1 == null) {
            auhx1.c.m("onSocketConnectionFailed. Controller has already been deactivated");
            return;
        }
        String s = "connection failed: error=" + auaf.h(v);
        auhx1.l.a(auhy1, v, s, auhx1.w);
    }

    @Override  // auad
    public final void d(int v) {
        auhx auhx0 = this.a;
        avjh avjh0 = auhx0.c;
        avjh0.n("onSocketDisconnected: error=%s", auaf.h(v));
        auhx0.q = 0;
        boolean z = auhx0.r;
        auhx0.r = false;
        if(!z) {
            auhy auhy0 = auhx0.a(false);
            if(auhy0 == null) {
                avjh0.m("onSocketDisconnected. TcpProberDeviceController has already been deactivated");
                return;
            }
            Object[] arr_object = {auaf.h(v)};
            auhx0.l.a(auhy0, v, String.format(Locale.ROOT, "socket disconnected: error=%s", arr_object), auhx0.w);
            return;
        }
        auhx0.A = null;
        Objects.requireNonNull(auhx0.l);
        auhv auhv0 = new auhv(auhx0.l);
        auhx0.k.execute(auhv0);
    }

    @Override  // auad
    public final void e(gehl gehl0) {
        String s15;
        aujc aujc1;
        String s12;
        String s11;
        String s10;
        String s9;
        Boolean boolean2;
        Boolean boolean1;
        String s8;
        String s7;
        String s6;
        String s5;
        String s4;
        String s3;
        int v4;
        aube aube0;
        Object object3;
        Object object2;
        Iterator iterator1;
        evqu evqu0;
        gegy gegy0;
        auhx auhx0 = this.a;
        int v = 0;
        Boolean boolean0 = Boolean.valueOf(false);
        if(auhx0.A != null) {
            String s = gehl0.f;
            Object object0 = null;
            if(gehi.a(gehl0.g) == 2) {
                ByteString hfsf0 = gehl0.i;
                auhx0.c.p("processBinaryMessage %s, %s", auhx0.f, s);
                if(audd.a.equals(s)) {
                    byte[] arr_b = hfsf0.toByteArray();
                    evqp evqp0 = new evqp();
                    try {
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gegy.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        gegy0 = (gegy)hftv0;
                    }
                    catch(hfur hfur0) {
                        this.a.c.d("Received an unparseable protobuf (ignored): %s", new Object[]{hfur0.getMessage()});
                        evqp0.b(null);
                        evqu0 = evqp0.a;
                        evqu0.b(new auhu(this));
                        return;
                    }
                    if((gegy0.b & 2) == 0) {
                        this.a.c.d("No response in auth message", new Object[0]);
                        evqp0.b(null);
                    }
                    else {
                        gegx gegx0 = gegy0.d == null ? gegx.a : gegy0.d;
                        auhx auhx1 = this.a;
                        evqp evqp1 = new evqp();
                        ByteString hfsf1 = auhx1.y;
                        if(hfsf1 == null) {
                            evqp1.b(boolean0);
                        }
                        else {
                            byte[] arr_b1 = hfsf1.toByteArray();
                            audd.d(auhx1.a, gegx0, arr_b1, auhx1.z, null, auhx1.c).b(new auhr(evqp1));
                        }
                        auht auht0 = new auht(this, evqp0, gegx0);
                        evqp1.a.b(auht0);
                    }
                    evqu0 = evqp0.a;
                    evqu0.b(new auhu(this));
                    return;
                }
                auhx auhx2 = this.a;
                if(auhx2.q == 0) {
                    auhx2.b();
                    return;
                }
            }
            else {
                String s1 = gehl0.h;
                auhx auhx3 = this.a;
                auhx3.c.p("processStringMessage %s: %s", auhx3.f, s1);
                try {
                    JSONObject jSONObject0 = new JSONObject(s1);
                    if(jSONObject0.has("requestId")) {
                        long v3 = jSONObject0.getLong("requestId");
                        if(v3 == 1L) {
                            --auhx3.q;
                            auhx3.p = avij.e().g() ? aurf.j(jSONObject0, "timestamp") : null;
                            try {
                                JSONObject jSONObject8 = jSONObject0.getJSONObject("availability");
                                iterator1 = jSONObject8.keys();
                                object2 = null;
                            }
                            catch(JSONException jSONException2) {
                                object3 = null;
                                goto label_314;
                            }
                            try {
                                while(true) {
                                    if(!iterator1.hasNext()) {
                                        goto label_317;
                                    }
                                    Object object4 = iterator1.next();
                                    String s28 = (String)object4;
                                    if("APP_AVAILABLE".equals(jSONObject8.optString(s28))) {
                                        if(object0 == null) {
                                            object0 = new ArrayList();
                                        }
                                        ((List)object0).add(s28);
                                    }
                                    else if("APP_UNAVAILABLE".equals(jSONObject8.optString(s28))) {
                                        if(object2 == null) {
                                            object2 = new ArrayList();
                                        }
                                        ((List)object2).add(s28);
                                    }
                                }
                            }
                            catch(JSONException jSONException2) {
                                object3 = object0;
                                object0 = object2;
                            }
                        label_314:
                            auhx3.c.g("No app availabilities found in receiver response: %s", new Object[]{jSONException2.getMessage()});
                            object2 = object0;
                            object0 = object3;
                        label_317:
                            kau kau0 = new kau(object0, object2);
                            List list0 = (List)kau0.a;
                            if(list0 != null && !list0.isEmpty()) {
                                auhx3.h.addAll(list0);
                            }
                            List list1 = (List)kau0.b;
                            if(list1 != null && !list1.isEmpty()) {
                                auhx3.i.addAll(list1);
                            }
                        }
                        else if(v3 == 2L) {
                            auhx auhx6 = this.a;
                            --auhx6.q;
                            try {
                                JSONObject jSONObject6 = jSONObject0.getJSONObject("status");
                                if(jSONObject6.has("applications")) {
                                    JSONArray jSONArray0 = jSONObject6.getJSONArray("applications");
                                    if(jSONArray0.length() > 0) {
                                        JSONObject jSONObject7 = jSONArray0.getJSONObject(0);
                                        try {
                                            aube0 = new aube(jSONObject7);
                                        }
                                        catch(JSONException unused_ex) {
                                            auhx6.c.c("Error extracting the application info.", new Object[0]);
                                            aube0 = null;
                                        }
                                    }
                                    else {
                                        aube0 = null;
                                    }
                                }
                                else {
                                    goto label_263;
                                }
                                goto label_264;
                            }
                            catch(JSONException jSONException1) {
                                auhx6.c.d("Unable to extract the application info: %s", new Object[]{jSONException1.getMessage()});
                            }
                            aube0 = null;
                            goto label_264;
                        label_263:
                            aube0 = null;
                        label_264:
                            auhx6.o = null;
                            if(aube0 != null && !avjn.p(aube0.a)) {
                                auhx6.o = aube0.f;
                            }
                            Set set0 = auhx6.g;
                            if(!set0.isEmpty()) {
                                HashSet hashSet0 = new HashSet();
                                ArrayList arrayList1 = new ArrayList(set0);
                                int v5 = arrayList1.size();
                                while(v < v5) {
                                    String s26 = (String)arrayList1.get(v);
                                    if(s26.startsWith("%")) {
                                        hashSet0.add(s26);
                                    }
                                    ++v;
                                }
                                if(!hashSet0.isEmpty()) {
                                    if(aube0 != null) {
                                        for(Object object1: aube0.a()) {
                                            String s27 = "%" + ((String)object1);
                                            if(hashSet0.remove(s27)) {
                                                auhx6.h.add(s27);
                                            }
                                        }
                                    }
                                    auhx6.i.addAll(hashSet0);
                                }
                            }
                        }
                        else if(v3 == 3L) {
                            auhx auhx5 = this.a;
                            if(auhx5.x) {
                                String s16 = avjg.h;
                                if(s16.equals(s)) {
                                    String s17 = jSONObject0.optString("type", "");
                                    if("DEVICE_INFO".equals(s17)) {
                                        --auhx5.q;
                                        if(auhx5.A != null) {
                                            auhx5.c.n("Discovery info: %s", jSONObject0);
                                            String s19 = jSONObject0.optString("deviceCapabilities");
                                            String s20 = aurf.j(jSONObject0, "deviceIconUrl");
                                            String s21 = aurf.j(jSONObject0, "deviceId");
                                            String s22 = aurf.j(jSONObject0, "deviceModel");
                                            String s23 = aurf.j(jSONObject0, "receiverMetricsId");
                                            String s24 = aurf.j(jSONObject0, "friendlyName");
                                            String s25 = aurf.j(jSONObject0, "wifiProximityId");
                                            try {
                                                v4 = jSONObject0.getInt("controlNotifications");
                                            }
                                            catch(JSONException unused_ex) {
                                                auhx5.c.g("Failed to parse RCN enabled status from discovery info message.", new Object[0]);
                                                v4 = 0;
                                            }
                                            if(TextUtils.isEmpty(s21)) {
                                                auhx5.c.d("Discovery info response doesn\'t have device ID.", new Object[0]);
                                            }
                                            else {
                                                auhy auhy1 = auhx5.A;
                                                batl.s(auhy1);
                                                auah auah1 = auhy1.a;
                                                atrq atrq1 = new atrq(s21, auah1.b().getAddress());
                                                if(auhx5.d.F()) {
                                                    atrq1.k = boolean0;
                                                }
                                                try {
                                                    v = Integer.parseInt(s19);
                                                }
                                                catch(NumberFormatException unused_ex) {
                                                }
                                                atrq1.i = v;
                                                ArrayList arrayList0 = new ArrayList();
                                                if(!TextUtils.isEmpty(s20)) {
                                                    WebImage webImage0 = aurf.e(s20, auah1.b().getAddress());
                                                    if(webImage0 != null) {
                                                        arrayList0.add(webImage0);
                                                        atrq1.h = arrayList0;
                                                    }
                                                }
                                                if(!TextUtils.isEmpty(s22)) {
                                                    atrq1.d = s22;
                                                }
                                                if(!TextUtils.isEmpty(s23)) {
                                                    atrq1.m = s23;
                                                }
                                                if(!TextUtils.isEmpty(s24)) {
                                                    atrq1.c = s24;
                                                }
                                                if(!TextUtils.isEmpty(s25)) {
                                                    atrq1.o = s25;
                                                }
                                                atrq1.n = v4 == 0 ? ((int)hqtr.b()) : v4;
                                                atrq1.f = auah1.b().getPort();
                                                if(auhx5.t != null) {
                                                    if(hqsq.c()) {
                                                        CastDevice castDevice0 = auhx5.t;
                                                        batl.s(castDevice0);
                                                        atrq1.q = castDevice0.n;
                                                    }
                                                    CastDevice castDevice1 = auhx5.t;
                                                    batl.s(castDevice1);
                                                    atrq1.s = castDevice1.d();
                                                    if(auhx5.d.l()) {
                                                        CastDevice castDevice2 = auhx5.t;
                                                        batl.s(castDevice2);
                                                        if(castDevice2.h == 3) {
                                                            CastDevice castDevice3 = auhx5.t;
                                                            batl.s(castDevice3);
                                                            atrq1.j = castDevice3.h;
                                                        }
                                                    }
                                                }
                                                auhx5.t = atrq1.a();
                                            }
                                        }
                                    }
                                    else if("INVALID_REQUEST".equals(s17)) {
                                        --auhx5.q;
                                        String s18 = jSONObject0.getString("reason");
                                        auhx5.c.n("Invalid request from discovery namespace. Reason: %s", s18);
                                    }
                                    else {
                                        auhx5.c.n("Unrecognized type: %s", s17);
                                    }
                                }
                                else {
                                    auhx5.c.g("Unexpected namespace received. Expected: %s Actual: %s", new Object[]{s16, s});
                                }
                            }
                            else {
                                auhx5.c.g("Unexpected message received for a device that doesnot support the discovery namespace: %s", new Object[]{jSONObject0});
                            }
                        }
                        else {
                            this.a.c.d(a.ab(jSONObject0, "Unrecognized request ID: %d"), new Object[]{v3});
                        }
                    }
                    else {
                        if(!jSONObject0.has("request_id")) {
                            this.a.c.d("Message doesn\'t contain a request id", new Object[0]);
                            return;
                        }
                        long v1 = jSONObject0.getLong("request_id");
                        if(v1 != 3L) {
                            this.a.c.f("Unknown request id: %d", new Object[]{v1});
                            return;
                        }
                        if("eureka_info".equals(jSONObject0.optString("type", ""))) {
                            auhx auhx4 = this.a;
                            --auhx4.q;
                            if(auhx4.A != null) {
                                JSONObject jSONObject1 = aurf.p(jSONObject0, "data");
                                if(jSONObject1 != null) {
                                    int v2 = jSONObject1.optInt("version", 0);
                                    String s2 = jSONObject1.optString("name", "");
                                    if(v2 >= 7) {
                                        JSONObject jSONObject2 = aurf.p(jSONObject1, "device_info");
                                        s3 = aurf.j(jSONObject2, "ssdp_udn");
                                        s4 = aurf.j(jSONObject2, "manufacturer");
                                        s5 = aurf.j(jSONObject2, "product_name");
                                        JSONObject jSONObject3 = aurf.p(jSONObject1, "build_info");
                                        s6 = aurf.j(jSONObject3, "build_type");
                                        s7 = aurf.j(jSONObject3, "cast_build_revision");
                                        s8 = aurf.j(jSONObject3, "system_build_number");
                                        JSONObject jSONObject4 = aurf.p(jSONObject2, "capabilities");
                                        if(jSONObject4 == null) {
                                            boolean1 = null;
                                            boolean2 = null;
                                            s9 = null;
                                        }
                                        else {
                                            boolean1 = aurf.f(jSONObject4, "multiplexed_connections_supported");
                                            if(auhx4.d.r()) {
                                                boolean2 = aurf.f(jSONObject4, "wake_on_lan_supported");
                                                s9 = aurf.j(jSONObject2, "mac_for_wol");
                                            }
                                            else {
                                                boolean2 = null;
                                                s9 = null;
                                            }
                                        }
                                        s10 = hqsq.c() ? aurf.j(jSONObject2, "cloud_device_id") : null;
                                        auhx4.c.r("friendlyName = %s, productName = %s, buildType = %s, castBuildVersion = %s", s2, s5, s6, s7);
                                        s11 = s2;
                                        s12 = s9;
                                    }
                                    else {
                                        s11 = s2;
                                        s3 = aurf.j(jSONObject1, "ssdp_udn");
                                        s8 = null;
                                        s10 = null;
                                        boolean1 = null;
                                        boolean2 = null;
                                        s4 = null;
                                        s5 = null;
                                        s6 = null;
                                        s7 = null;
                                        s12 = null;
                                    }
                                    if(s3 != null) {
                                        s3 = s3.replace("-", "");
                                    }
                                    boolean z = jSONObject1.has("multizone");
                                    auhy auhy0 = auhx4.A;
                                    batl.s(auhy0);
                                    auah auah0 = auhy0.a;
                                    if(s3 != null) {
                                        atrq atrq0 = new atrq(s3, auah0.a);
                                        atrq0.f = auah0.b;
                                        atrq0.c = s11;
                                        atrq0.q = s10;
                                        avij avij0 = auhx4.d;
                                        if(avij0.F()) {
                                            atrq0.k = boolean0;
                                        }
                                        if(s4 == null) {
                                            s4 = null;
                                        }
                                        if(s5 == null) {
                                            s5 = null;
                                        }
                                        atrq0.s = new CastEurekaInfo(v2, z, false, s4, s5, (s6 == null ? null : s6), (s7 == null ? null : s7), (s8 == null ? null : s8), (boolean1 == null ? false : boolean1.booleanValue()), (boolean2 == null ? false : boolean2.booleanValue()));
                                        if(avij0.l()) {
                                            aujc aujc0 = aujc.a;
                                            Boolean boolean3 = aurf.f(jSONObject1, "tos_accepted");
                                            if(boolean3 == null) {
                                                aujc1 = aujc0;
                                            }
                                            else if(boolean3.booleanValue()) {
                                                aujc1 = aujc.c;
                                            }
                                            else {
                                                aujc1 = aujc.b;
                                            }
                                            auhx4.c.p("Terms of service state determined by TCP probing for device(%s): %s", auhx4.t, aujc1);
                                        }
                                        else {
                                            aujc1 = aujc.a;
                                        }
                                        if(aujc1.equals(aujc.b)) {
                                            atrq0.j = 3;
                                        }
                                        if(avij0.r()) {
                                            if(boolean2 != null && boolean2.booleanValue() && s12 != null) {
                                                avaa avaa0 = auhx4.n;
                                                if(avaa0.c() == null) {
                                                    auhx4.u = null;
                                                }
                                                else {
                                                    auhx4.c.m("Populating WoL device with network ID");
                                                    String s13 = avaa0.c();
                                                    batl.s(s13);
                                                    auhx4.u = new aunj(s3, s12, s13, 0, System.currentTimeMillis());
                                                }
                                            }
                                            else {
                                                auhx4.u = null;
                                            }
                                        }
                                        auhx4.t = atrq0.a();
                                        if(v2 >= 5) {
                                            v = 1;
                                        }
                                    }
                                }
                            }
                            auhx4.x = v;
                            if(v) {
                                String s14 = avjg.h;
                                JSONObject jSONObject5 = new JSONObject();
                                try {
                                    jSONObject5.put("requestId", 3);
                                    jSONObject5.put("type", "GET_DEVICE_INFO");
                                }
                                catch(JSONException unused_ex) {
                                    s15 = null;
                                    goto label_159;
                                }
                                s15 = jSONObject5.toString();
                            label_159:
                                if(auhx4.d(s14, s15)) {
                                    ++this.a.q;
                                }
                            }
                        }
                        else {
                            this.a.c.f("Unrecognized request ID: %d", new Object[]{((long)3L)});
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    this.a.c.d("Failed to parse response: %s", new Object[]{jSONException0.getMessage()});
                }
                auhx auhx7 = this.a;
                if(auhx7.q == 0) {
                    auhx7.b();
                }
            }
            return;
        }
        this.a.c.g("The controller is already deactivated. Ignoring the message.", new Object[0]);
    }
}

