import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class igvj extends ftry {
    public static ftrs a;
    private JSONObject b;
    private JSONObject c;
    private JSONArray d;
    private igvd e;
    private JSONArray f;
    private igvn g;
    private boolean h;

    public igvj() {
        this.g = null;
        this.h = false;
    }

    @Override  // ftry
    public final JSONArray a(JSONObject jSONObject0, JSONArray jSONArray0, ftrs ftrs0) {
        this.f = jSONArray0;
        igvj.a = ftrs0;
        return this.c(jSONObject0, false);
    }

    @Override  // ftry
    public final JSONArray b(JSONObject jSONObject0, JSONArray jSONArray0, ftrs ftrs0) {
        this.f = jSONArray0;
        igvj.a = ftrs0;
        return this.c(jSONObject0, true);
    }

    private final JSONArray c(JSONObject jSONObject0, boolean z) {
        int v6;
        boolean z1;
        int v5;
        JSONObject jSONObject1;
        igvx igvx0;
        igvx igvx9;
        JSONObject jSONObject2;
        igvx igvx8;
        igvx igvx15;
        igvx igvx14;
        JSONObject jSONObject4;
        Short short0;
        String s;
        int v11;
        igvx igvx6;
        ArrayList arrayList2;
        igxi igxi0;
        igvx igvx1;
        ArrayList arrayList1;
        igvd igvd0;
        igvj igvj0 = this;
        JSONArray jSONArray0 = new JSONArray();
        try {
            igvd0 = new igvd(jSONObject0);
            igvj0.e = igvd0;
        }
        catch(igvg unused_ex) {
            throw new IllegalArgumentException("Invalid Image conversion");
        }
        igvh igvh0 = igvd0.f();
        int v = igvh0.a();
        igvl igvl0 = igvh0.a ? ((igvl)igvh0.c.get(igvh0.a() - 1)) : null;
        int v1 = 1;
        if(igvl0 == null) {
            arrayList1 = null;
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            try {
                if(igvl0.b) {
                    igvn igvn0 = igvj0.e.j(igvl0, v);
                    igvj0.g = igvn0;
                    for(Object object0: igvn0) {
                        arrayList0.add(new igvx(new igvt(((byte[])object0))));
                    }
                    if(arrayList0.size() == 2 && igvl0.f == 0) {
                        Collections.swap(arrayList0, 0, 1);
                    }
                }
                else {
                    arrayList0.add(new igvs(igvl0));
                }
                arrayList1 = arrayList0;
            }
            catch(Exception exception0) {
                igvj.a.a(String.format(Locale.UK, "Error reading Log @ %d", v), exception0);
                arrayList1 = null;
            }
        }
        igvj0.h = false;
        int v2 = 0;
        for(Object object1: igvh0.c) {
            igve igve0 = (igve)object1;
            int v3 = v2 + 1;
            int v4 = 0;
        alab1:
            while(true) {
                if(v4 < 5) {
                    if(igve0.a[v4] == 0) {
                        ++v4;
                        igvj0 = this;
                        continue;
                    }
                    else if(!(igve0 instanceof igvl)) {
                    label_67:
                        igvf igvf0 = (igvf)igve0;
                        int v7 = v3;
                        try {
                            igvj0.g = igvj0.e.j(igve0, v7);
                            igvt igvt0 = new igvt(((byte[])igvj0.g.get(0)));
                            if((igve0 instanceof igvf)) {
                                switch(igvf0.b) {
                                    case 2: {
                                        igvx1 = new igvx(igvf0, igvt0, null);
                                        goto label_94;
                                    }
                                    case 14: {
                                        igvx1 = new igvx(igvf0, igvt0);
                                        goto label_94;
                                    }
                                    case 16: {
                                        igvx1 = new igvx(igvf0, igvt0, null);
                                        goto label_94;
                                    }
                                    case 22: {
                                        igvx1 = new igvx(igvf0, igvt0, null);
                                        goto label_94;
                                    }
                                    case 23: {
                                        igvx1 = new igvx(igvf0, igvt0, null);
                                        goto label_94;
                                    }
                                    case 24: {
                                        igvx1 = new igvx(igvf0, igvt0, null);
                                        goto label_94;
                                    }
                                }
                            }
                            igvx1 = null;
                        }
                        catch(Exception exception2) {
                            z1 = v1;
                            v6 = v7;
                            igvj.a.a(String.format(Locale.UK, "Error reading IPE %d", v6), exception2);
                            break;
                        }
                    label_94:
                        if(igvf0.b()) {
                            try {
                                igvx igvx2 = igvj0.e(igvf0, v1);
                                igvx igvx3 = igvj0.e(igvf0, 2);
                                igxi0 = new igxi();
                                igxi0.a(igvx2);
                                igxi0.a(igvx3);
                                arrayList2 = igxi0.a;
                                Collections.sort(arrayList2);
                            }
                            catch(Exception exception2) {
                                z1 = v1;
                                v6 = v7;
                                igvj.a.a(String.format(Locale.UK, "Error reading IPE %d", v6), exception2);
                                break;
                            }
                            int v8 = arrayList2.size();
                            if(v8 > v1) {
                                try {
                                    igvx igvx4 = ((igxh)arrayList2.get(0)).c("Value");
                                    z1 = v1;
                                    int v9 = (short)(((Short)igvx4.c("Value").b()));
                                    z1 = v1;
                                    while(true) {
                                        if(v1 >= v8) {
                                            break;
                                        }
                                        igvx igvx5 = ((igxh)arrayList2.get(v1)).c("Value");
                                        int v10 = (short)(((Short)igvx5.c("Value").b()));
                                        igvx4.e(new igvz("DeltaP", ((short)(v9 - v10))));
                                        igvx4.e(new igvz("DeltaN", ((short)(v10 - v9))));
                                        ++v1;
                                        igvx4 = igvx5;
                                        v9 = v10;
                                        arrayList2 = arrayList2;
                                        v8 = v8;
                                    }
                                }
                                catch(Exception exception3) {
                                    try {
                                        igvj.a.a("Error extracting log DeltaP/DeltaN: ", exception3);
                                        igvx6 = (igvx)igxi0.a.get(0);
                                        goto label_136;
                                    }
                                    catch(Exception exception2) {
                                    }
                                    v6 = v7;
                                    igvj.a.a(String.format(Locale.UK, "Error reading IPE %d", v6), exception2);
                                    break;
                                }
                            }
                            else {
                                z1 = v1;
                                igvx6 = (igvx)igxi0.a.get(0);
                                goto label_136;
                            }
                            igvx6 = (igvx)igxi0.a.get(0);
                        }
                        else {
                            z1 = v1;
                            igvx6 = null;
                            igxi0 = null;
                        }
                    label_136:
                        if(igvx1 != null) {
                            igvx igvx7 = igvx1.c("IPE Instance ID");
                            if(igvx7 != null && (igvx7 instanceof igwd)) {
                                byte[] arr_b = ((igvy)((igwd)igvx7).b.get(2)).e;
                                if(arr_b.length == 4) {
                                    int v12 = arr_b[0] & 0xFF;
                                    int v13 = arr_b[z1];
                                    v11 = (v12 << 8) + (v13 & 0xFF) >> 3;
                                    if((v13 & 4) == 4) {
                                        if((v13 & 2) == 2) {
                                            v11 = (v13 & 1) == z1 ? 0xE000 | v11 : v11 | 0x6000;
                                        }
                                        else {
                                            v11 |= 0x2000;
                                        }
                                    }
                                }
                                else {
                                    v11 = -1;
                                }
                                if(v11 == -1) {
                                    igvj.a.b(String.format(Locale.UK, "Could not extract OID from the IPE IID in DirLoc %d", v7));
                                    v6 = v7;
                                    z1 = true;
                                    break;
                                }
                                else {
                                    try {
                                        s = (String)igvx7.a("", null);
                                    }
                                    catch(Exception exception4) {
                                        v6 = v7;
                                        z1 = true;
                                        igvj.a.a("Unable to extract IIID", exception4);
                                        break;
                                    }
                                    igvj0.g(igvf0.b, igvf0.c, String.format("%04X", v11), z);
                                    if(igvj0.b == null) {
                                        v6 = v7;
                                        z1 = true;
                                        break;
                                    }
                                    else {
                                        try {
                                            switch(igvj0.e.f().b(v7) - 1) {
                                                case 0: {
                                                    z1 = true;
                                                    short0 = (short)1;
                                                    goto label_179;
                                                }
                                                case 2: {
                                                    goto label_177;
                                                }
                                            }
                                        }
                                        catch(Exception exception5) {
                                            v6 = v7;
                                            z1 = true;
                                            igvj.a.a(String.format(Locale.UK, "Transaction error IPE %d", v6), exception5);
                                            break;
                                        }
                                        short0 = (short)3;
                                        z1 = true;
                                        goto label_179;
                                        try {
                                            z1 = true;
                                            short0 = (short)1;
                                            goto label_179;
                                        label_177:
                                            short0 = (short)2;
                                            z1 = true;
                                        label_179:
                                            igvx1.e(new igwa("sdkVersion", "Kernel 1.0.38"));
                                            igvx1.e(new igwa("shellId", igvj0.e.e()));
                                            igvx1.e(new igvz("shellState", ((short)igvj0.e.h())));
                                            igvx1.e(new igwa("ipeId", s));
                                            igvx1.e(new igvz("ipeState", short0));
                                        }
                                        catch(Exception exception5) {
                                            v6 = v7;
                                            igvj.a.a(String.format(Locale.UK, "Transaction error IPE %d", v6), exception5);
                                            break;
                                        }
                                        if(!z) {
                                            try {
                                                v6 = v7;
                                                jSONObject4 = igvj0.d(s, v6, igvf0);
                                                jSONObject4.put("displayCardReference", igvj0.e.e());
                                                igvj0.e.g(v6);
                                                igvj0.e.g(v6);
                                                jSONObject4.put("ticketStatus", ((igvj0.e.g(v6) | igvj0.e.h()) == 0 ? "ACTIVE" : "BLOCKED"));
                                                if(igvj0.d != null) {
                                                    if(arrayList1 != null) {
                                                        for(Object object5: arrayList1) {
                                                            igvx igvx13 = (igvx)object5;
                                                            if(!igvj.h(igvx13, v6, 0L)) {
                                                                continue;
                                                            }
                                                            igvx14 = igvx1;
                                                            igvx15 = igvx13;
                                                            goto label_261;
                                                        }
                                                    }
                                                    igvx14 = igvx1;
                                                    igvx15 = null;
                                                label_261:
                                                    igvj0.f(igvx14, igvx14, igvx6, igvx15, jSONObject4);
                                                }
                                            }
                                            catch(Exception exception7) {
                                                igvj.a.a(String.format(Locale.UK, "Ticket error IPE %d", v6), exception7);
                                                break;
                                            }
                                            jSONArray0.put(jSONObject4);
                                            break;
                                        }
                                        else if(igxi0 != null || arrayList1 != null) {
                                            if(igxi0 == null) {
                                                goto label_230;
                                            }
                                            else {
                                                try {
                                                    ArrayList arrayList3 = igxi0.a;
                                                    if(arrayList3.size() == 0) {
                                                        goto label_227;
                                                    }
                                                    else {
                                                        Iterator iterator3 = arrayList3.iterator();
                                                        while(true) {
                                                        label_195:
                                                            if(!iterator3.hasNext()) {
                                                                goto label_274;
                                                            }
                                                            Object object3 = iterator3.next();
                                                            igvx8 = (igvx)object3;
                                                            long v14 = (long)(((Long)igvx8.c("DateTimeStamp").b()));
                                                            jSONObject2 = igvj0.d(s, v7, igvf0);
                                                            if(igvj0.d == null) {
                                                                goto label_219;
                                                            }
                                                            else {
                                                                igvx9 = null;
                                                                int v15 = 0;
                                                                while(true) {
                                                                    if(v15 >= arrayList1.size()) {
                                                                        goto label_214;
                                                                    }
                                                                    igvx igvx10 = (igvx)arrayList1.get(v15);
                                                                    if(igvj.h(igvx10, v7, v14)) {
                                                                        igvx9 = igvx10;
                                                                    }
                                                                    else {
                                                                        ++v15;
                                                                        continue;
                                                                    }
                                                                    goto label_214;
                                                                }
                                                            }
                                                            goto label_222;
                                                        }
                                                    }
                                                    goto label_230;
                                                }
                                                catch(Exception exception6) {
                                                    try {
                                                        v6 = v7;
                                                        goto label_241;
                                                    label_214:
                                                        v6 = v7;
                                                        igvx igvx11 = igvx1;
                                                        igvf igvf1 = igvf0;
                                                        igvj0.f(igvx8, igvx11, igvx8, igvx9, jSONObject2);
                                                        goto label_222;
                                                    label_219:
                                                        igvf1 = igvf0;
                                                        v6 = v7;
                                                        igvx11 = igvx1;
                                                    label_222:
                                                        jSONArray0.put(jSONObject2);
                                                        igvx1 = igvx11;
                                                        v7 = v6;
                                                        igvf0 = igvf1;
                                                        goto label_195;
                                                    label_227:
                                                        v6 = v7;
                                                        Iterator iterator4 = arrayList1.iterator();
                                                        goto label_232;
                                                    label_230:
                                                        v6 = v7;
                                                        iterator4 = arrayList1.iterator();
                                                        while(true) {
                                                        label_232:
                                                            if(!iterator4.hasNext()) {
                                                                break alab1;
                                                            }
                                                            Object object4 = iterator4.next();
                                                            igvx igvx12 = (igvx)object4;
                                                            JSONObject jSONObject3 = igvj0.d(s, v6, igvf0);
                                                            if(igvj0.d != null && igvj.h(igvx12, v6, 0L)) {
                                                                igvj0.f(null, igvx1, null, igvx12, jSONObject3);
                                                            }
                                                            jSONArray0.put(jSONObject3);
                                                        }
                                                    }
                                                    catch(Exception exception6) {
                                                        goto label_241;
                                                    }
                                                }
                                            }
                                            goto label_232;
                                        label_241:
                                            igvj.a.a(String.format(Locale.UK, "Transaction error IPE %d", v6), exception6);
                                            break;
                                        }
                                    }
                                }
                            }
                            else {
                                v6 = v7;
                                igvj.a.b(String.format(Locale.UK, "Could not find IPE Instance ID in DirLoc %d", v6));
                                break;
                            }
                        }
                    label_274:
                        v6 = v7;
                        break;
                    }
                    else if(z && !igvj0.h) {
                        igvl igvl1 = (igvl)igve0;
                        igvj0.g(0, 0, "TTL", ((boolean)v1));
                        if(igvj0.d != null) {
                            try {
                                if(arrayList1.size() == 0) {
                                    goto label_59;
                                }
                                else {
                                    Iterator iterator2 = arrayList1.iterator();
                                    while(true) {
                                    label_48:
                                        if(!iterator2.hasNext()) {
                                            goto label_279;
                                        }
                                        Object object2 = iterator2.next();
                                        igvx0 = (igvx)object2;
                                        jSONObject1 = igvj0.d("TTL", v3, igvl1);
                                        v5 = v3;
                                        goto label_53;
                                    }
                                }
                                goto label_67;
                            }
                            catch(Exception exception1) {
                                goto label_62;
                            }
                            try {
                            label_53:
                                igvj0.f(igvx0, igvx0, igvx0, igvx0, jSONObject1);
                                jSONArray0.put(jSONObject1);
                                v3 = v5;
                                goto label_48;
                            }
                            catch(Exception exception1) {
                                igvj.a.a(String.format(Locale.UK, "Transaction error IPE %d", v5), exception1);
                                z1 = v1;
                                v6 = v5;
                                break;
                            }
                            try {
                            label_59:
                                jSONArray0.put(igvj0.d("TTL", v3, igvl1));
                                goto label_279;
                            }
                            catch(Exception exception1) {
                            label_62:
                                v5 = v3;
                            }
                            igvj.a.a(String.format(Locale.UK, "Transaction error IPE %d", v5), exception1);
                            z1 = v1;
                            v6 = v5;
                            break;
                        }
                    }
                }
            label_279:
                z1 = v1;
                v6 = v3;
                break;
            }
            igvj0 = this;
            v2 = v6;
            v1 = z1;
        }
        return jSONArray0;
    }

    private final JSONObject d(String s, int v, igve igve0) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("ticketId", s);
        jSONObject0.put("ticketIndex", v);
        if((igve0 instanceof igvf)) {
            jSONObject0.put("ticketTypeNumber", ((igvf)igve0).b);
            jSONObject0.put("ticketSubtype", ((igvf)igve0).c);
            jSONObject0.put("ticketExpireDate", igvq.f(((igvf)igve0).d).getTimeInMillis());
        }
        else {
            jSONObject0.put("logIpePointer", ((igvl)igve0).c);
            jSONObject0.put("logEntryExit", ((igvl)igve0).d);
            jSONObject0.put("transactionTime", igvq.e(((igvl)igve0).e).getTimeInMillis());
            jSONObject0.put("transactionStatus", "SUCCESS");
            jSONObject0.put("ticketRecordOffset", ((igvl)igve0).f);
        }
        JSONObject jSONObject1 = this.c == null ? null : this.c.optJSONObject("InstanceIdMap");
        if(jSONObject1 != null) {
            JSONObject jSONObject2 = jSONObject1.optJSONObject(s);
            if(jSONObject2 != null) {
                Iterator iterator0 = jSONObject2.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    jSONObject0.put(((String)object0), jSONObject2.get(((String)object0)));
                }
            }
        }
        return jSONObject0;
    }

    private final igvx e(igve igve0, int v) {
        igvt igvt0 = new igvt(((byte[])this.g.get(v)));
        if((igve0 instanceof igvf)) {
            int v1 = ((igvf)igve0).b;
            if(v1 != 2) {
                switch(v1) {
                    case 22: {
                        return new igvx(igvt0, v);
                    }
                    case 23: {
                        return new igvx(igvt0, v, null);
                    }
                    case 24: {
                        return new igvx(igvt0, v, null);
                    }
                    default: {
                        return null;
                    }
                }
            }
            return new igvx(igvt0, v, null);
        }
        return null;
    }

    private final void f(igvx igvx0, igvx igvx1, igvx igvx2, igvx igvx3, JSONObject jSONObject0) {
        Object object0;
        String s3;
        int v = 0;
        while(true) {
            try {
                if(v >= this.d.length()) {
                    break;
                }
                JSONObject jSONObject1 = this.d.getJSONObject(v);
                String s = jSONObject1.optString("field_name");
                String s1 = jSONObject1.optString("return_type").toLowerCase();
                String s2 = jSONObject1.getJSONObject("extra_parameters").optString("ipe_name");
                if(!s2.equals("")) {
                    switch(s2.charAt(0)) {
                        case 35: {
                            object0 = Float.parseFloat(s2.substring(1));
                            break;
                        }
                        case 36: {
                            object0 = s2.substring(1);
                            break;
                        }
                        default: {
                            igvx igvx4 = igvx0;
                            try {
                                for(int v1 = 0; v1 < s2.length(); v1 = v2 + 1) {
                                    int v2 = s2.indexOf(46, v1);
                                    if(v2 == -1) {
                                        s3 = s2.substring(v1);
                                        v2 = s2.length();
                                        this.h = true;
                                    }
                                    else {
                                        s3 = s2.substring(v1, v2);
                                    }
                                    if(v1 == 0) {
                                        switch(s3) {
                                            case "ipe": {
                                                igvx4 = igvx1;
                                                continue;
                                            }
                                            case "ttl": {
                                                igvx4 = igvx3;
                                                continue;
                                            }
                                            case "vr": {
                                                igvx4 = igvx2;
                                                continue;
                                            }
                                        }
                                    }
                                    igvx4 = igvx4.c(s3);
                                }
                                object0 = igvx4.a(s1, jSONObject1);
                            }
                            catch(Exception unused_ex) {
                                object0 = a.ak(s2, s1, new StringBuilder(), s, "<", ", ", ", ", ">");
                                s = "Unknown_" + Integer.toString(v);
                            }
                        }
                    }
                    jSONObject0.put(s, object0);
                }
                ++v;
            }
            catch(Exception exception0) {
                igvj.a.a("Error extracting data from IPE", exception0);
                try {
                    jSONObject0.put("decode_error", exception0.toString());
                }
                catch(Exception exception1) {
                    igvj.a.a("Could not add decode_error", exception1);
                }
                return;
            }
        }
    }

    private final void g(int v, int v1, String s, boolean z) {
        int v3;
        this.b = null;
        this.c = null;
        this.d = null;
        int v2 = 0;
        while(v2 < this.f.length()) {
            try {
                JSONObject jSONObject0 = this.f.getJSONObject(v2);
                this.b = jSONObject0;
                JSONObject jSONObject1 = jSONObject0.getJSONObject("extra_parameters");
                this.c = jSONObject1;
                String s1 = jSONObject1.optString("OID", "").toLowerCase();
                if(v == 0) {
                    if(s1.equalsIgnoreCase("TTL")) {
                        goto label_18;
                    }
                    else {
                        v3 = 0;
                        goto label_15;
                    }
                    goto label_14;
                }
                else {
                label_14:
                    v3 = v;
                }
            }
            catch(JSONException unused_ex) {
                break;
            }
        label_15:
            if(s1.equals("") || s1.equalsIgnoreCase(s)) {
                try {
                    if(this.c.getInt("TYP") == v3) {
                        goto label_17;
                    }
                    ++v2;
                    continue;
                }
                catch(JSONException unused_ex) {
                    try {
                    label_17:
                        if(this.c.getInt("PTYP") == v1) {
                            goto label_18;
                        }
                        ++v2;
                        continue;
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                try {
                label_18:
                    JSONArray jSONArray0 = this.b.getJSONArray((z ? "transaction_fields" : "ticket_fields"));
                    this.d = jSONArray0;
                    if(jSONArray0 != null) {
                        return;
                    }
                    ++v2;
                    continue;
                }
                catch(JSONException unused_ex) {
                }
                break;
            }
            ++v2;
            continue;
        }
        this.b = null;
        this.c = null;
        this.d = null;
    }

    private static final boolean h(igvx igvx0, int v, long v1) {
        igvx igvx2;
        igvx igvx1;
        try {
            if((igvx0 instanceof igvs)) {
                igvx1 = igvx0.c("PTR");
                igvx2 = igvx0.c("DTS");
            }
            else {
                igvx1 = igvx0.c("IPEPointer");
                if(igvx1 == null) {
                    igvx1 = igvx0.c("IPEID1");
                }
                igvx2 = igvx0.c("DateTimeStamp");
            }
            if(igvx1 == null || v != ((short)(((Short)igvx1.b())))) {
                return false;
            }
            if(Long.compare(v1, 0L) == 0) {
                return true;
            }
            if(igvx2 == null || v1 != ((long)(((Long)igvx2.b())))) {
                return false;
            }
        }
        catch(Exception exception0) {
            igvj.a.a("FindIpeLog: This should not happen! -- ", exception0);
            return false;
        }
        return true;
    }
}

