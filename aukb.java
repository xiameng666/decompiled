import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aukb implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        byte[] arr_b;
        String s9;
        int v13;
        auiq auiq0;
        int v12;
        String s6;
        JSONArray jSONArray0;
        Map map0;
        long v11;
        JSONObject jSONObject1;
        String s5;
        aunj aunj0;
        int v10;
        String s1;
        aujd aujd0;
        String s;
        Object object1;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        int v3;
        int v1;
        int v;
        owg owg0;
        try(owg0 = ((oxi)object0).a("SELECT * FROM cast_device_info")) {
            v = oqn.b(owg0, "device_id");
            v1 = oqn.b(owg0, "cast_device");
            int v2 = oqn.b(owg0, "wake_on_lan_device");
            v3 = oqn.b(owg0, "app_availability_info");
            v4 = oqn.b(owg0, "last_discovered_timestamp_ms");
            v5 = oqn.b(owg0, "last_published_timestamp_ms");
            v6 = oqn.b(owg0, "discoveryMarkers");
            v7 = oqn.b(owg0, "dynamicGroupState");
            v8 = oqn.b(owg0, "statusText");
            v9 = oqn.b(owg0, "relay_access_token");
            object1 = new ArrayList();
            while(true) {
            label_14:
                if(!owg0.k()) {
                    return object1;
                }
                s = owg0.j(v1) ? null : owg0.d(v1);
                CastDevice castDevice0 = null;
                if(s != null) {
                    try {
                        castDevice0 = CastDevice.b(new JSONObject(s));
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                aujd0 = new aujd(castDevice0);
                aujd0.b = owg0.d(v);
                s1 = owg0.j(v2) ? null : owg0.d(v2);
                break;
            }
        }
        catch(Throwable throwable0) {
            goto label_159;
        }
        if(s1 == null) {
            v10 = v;
            goto label_51;
        }
        else {
            try {
                TWR.useResource$NT(owg0);
                v10 = v;
                JSONObject jSONObject0 = new JSONObject(s1);
                String s2 = jSONObject0.getString("device_id");
                ibuq.e(s2, "getString(...)");
                String s3 = jSONObject0.getString("mac_address");
                ibuq.e(s3, "getString(...)");
                String s4 = jSONObject0.getString("device_network_id");
                ibuq.e(s4, "getString(...)");
                aunj0 = new aunj(s2, s3, s4, jSONObject0.optInt("failed_attempts"), jSONObject0.optLong("created_timestamp"));
                goto label_52;
            }
            catch(JSONException unused_ex) {
            }
            catch(Throwable throwable0) {
                goto label_159;
            }
        label_51:
            aunj0 = null;
        }
        try {
        label_52:
            TWR.useResource$NT(owg0);
            aujd0.d = aunj0;
            if(owg0.j(v3)) {
                TWR.useResource$NT(owg0);
                s5 = null;
            }
            else {
                TWR.useResource$NT(owg0);
                s5 = owg0.d(v3);
            }
            if(s5 == null) {
                goto label_108;
            label_109:
                auiq0 = null;
            }
            else {
                try {
                    TWR.useResource$NT(owg0);
                    jSONObject1 = new JSONObject(s5);
                    v11 = System.currentTimeMillis();
                    map0 = new HashMap();
                    jSONArray0 = jSONObject1.optJSONArray("supported_criterion_to_timestamp_map");
                    if(jSONArray0 == null) {
                        TWR.useResource$NT(owg0);
                        Iterator iterator0 = aurf.m(jSONObject1.optJSONArray("supported_criteria")).iterator();
                        while(true) {
                        label_69:
                            TWR.useResource$NT(owg0);
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            TWR.useResource$NT(owg0);
                            Object object2 = iterator0.next();
                            s6 = (String)object2;
                            v12 = v1;
                            goto label_75;
                        }
                    }
                    else {
                        goto label_79;
                    }
                    goto label_81;
                }
                catch(JSONException unused_ex) {
                    goto label_108;
                }
                try {
                label_75:
                    TWR.useResource$NT(owg0);
                    map0.put(s6, Long.valueOf(v11));
                    v1 = v12;
                    goto label_69;
                }
                catch(JSONException unused_ex) {
                    goto label_109;
                }
                try {
                label_79:
                    TWR.useResource$NT(owg0);
                    map0 = aurf.l(jSONArray0);
                label_81:
                    TWR.useResource$NT(owg0);
                    v12 = v1;
                }
                catch(JSONException unused_ex) {
                    goto label_108;
                }
                try {
                    TWR.useResource$NT(owg0);
                    Map map1 = new HashMap();
                    JSONArray jSONArray1 = jSONObject1.optJSONArray("not_supported_criterion_to_timestamp_map");
                    if(jSONArray1 == null) {
                        TWR.useResource$NT(owg0);
                        for(Iterator iterator1 = aurf.m(jSONObject1.optJSONArray("not_supported_criteria")).iterator(); true; iterator1 = iterator1) {
                            TWR.useResource$NT(owg0);
                            if(!iterator1.hasNext()) {
                                break;
                            }
                            TWR.useResource$NT(owg0);
                            Object object3 = iterator1.next();
                            map1.put(((String)object3), Long.valueOf(v11));
                        }
                    }
                    else {
                        TWR.useResource$NT(owg0);
                        map1 = aurf.l(jSONArray1);
                    }
                    TWR.useResource$NT(owg0);
                    String s7 = aurf.j(jSONObject1, "device_config_change_timestamp");
                    auip auip0 = new auip();
                    auip0.a.clear();
                    auip0.a.putAll(map0);
                    auip0.b.clear();
                    auip0.b.putAll(map1);
                    auip0.c = s7;
                    auiq0 = new auiq(auip0);
                    goto label_110;
                label_108:
                    v12 = v1;
                }
                catch(JSONException unused_ex) {
                }
                goto label_109;
            }
        label_110:
            TWR.useResource$NT(owg0);
            aujd0.f(auiq0);
            aujd0.h = owg0.b(v4);
            aujd0.i = owg0.b(v5);
            aujd0.j = (int)owg0.b(v6);
            if(owg0.j(v7)) {
                TWR.useResource$NT(owg0);
                v13 = 0;
            }
            else {
                TWR.useResource$NT(owg0);
                String s8 = owg0.d(v7);
                switch(s8) {
                    case "STATE_REMOVED": {
                        v13 = 3;
                        break;
                    }
                    case "STATE_SWITCHED": {
                        v13 = 2;
                        break;
                    }
                    case "STATE_UP_TO_DATE": {
                        v13 = 1;
                        break;
                    }
                    default: {
                        TWR.useResource$NT(owg0);
                        throw new IllegalArgumentException("Can\'t convert value to enum, unknown value: " + s8);
                    }
                }
            }
            TWR.useResource$NT(owg0);
            aujd0.w = v13;
            if(owg0.j(v8)) {
                TWR.useResource$NT(owg0);
                s9 = null;
            }
            else {
                TWR.useResource$NT(owg0);
                s9 = owg0.d(v8);
            }
            TWR.useResource$NT(owg0);
            aujd0.i(s9);
            if(owg0.j(v9)) {
                TWR.useResource$NT(owg0);
                arr_b = null;
            }
            else {
                TWR.useResource$NT(owg0);
                arr_b = owg0.l(v9);
            }
            gqft gqft0 = null;
            if(arr_b != null) {
                try {
                    TWR.useResource$NT(owg0);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqft.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gqft0 = (gqft)hftv0;
                }
                catch(hfur unused_ex) {
                }
            }
            TWR.useResource$NT(owg0);
            aujd0.o = gqft0;
            ((List)object1).add(aujd0);
            v = v10;
            v1 = v12;
            goto label_14;
        }
        catch(Throwable throwable0) {
        label_159:
            TWR.moot$NT();
            throw throwable0;
        }
    }
}

