import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class hmtg implements essj {
    private static final byte[] a;
    private static final int b;
    private final hmsk c;

    static {
        hmtg.a = hmsi.q("35A0200000000800");
        hmtg.b = 6;
    }

    public hmtg() {
        this.c = new hmtf(this);
    }

    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        Object object2;
        try {
            JSONObject[] arr_jSONObject = {new JSONObject(), jSONObject0, jSONObject1};
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(int v = 0; v < 3; ++v) {
                JSONObject jSONObject2 = arr_jSONObject[v];
                if(jSONObject2 != null) {
                    Iterator iterator0 = jSONObject2.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s = object0.toString();
                        if(linkedHashMap0.containsKey(s)) {
                            Object object1 = linkedHashMap0.get(s);
                            if(object1 == null) {
                                object2 = jSONObject2.get(s);
                            }
                            else {
                                Object object3 = jSONObject2.get(s);
                                object2 = (JSONArray)object1;
                                JSONArray jSONArray0 = (JSONArray)object3;
                                for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                                    ((JSONArray)object2).put(jSONArray0.get(v1));
                                }
                            }
                            if(object2 == null) {
                                linkedHashMap0.remove(s);
                            }
                            else {
                                linkedHashMap0.put(s, object2);
                            }
                        }
                        else {
                            linkedHashMap0.put(s, jSONObject2.get(s));
                        }
                    }
                }
            }
            List list0 = hmsi.k(new hmsa[]{hmsa.b(((String)linkedHashMap0.get("Primary_AID")), ((String)linkedHashMap0.get("Primary_AID_FCI")))});
            if(linkedHashMap0.containsKey("Secondary_AID") && linkedHashMap0.containsKey("Secondary_AID_FCI")) {
                list0.add(hmsa.b(((String)linkedHashMap0.get("Secondary_AID")), ((String)linkedHashMap0.get("Secondary_AID_FCI"))));
            }
            return new hmvk(linkedHashMap0, hmsi.j(((hmsa[])list0.toArray(new hmsa[list0.size()]))));
        }
        catch(IOException | JSONException exception0) {
            throw new RuntimeException(exception0);
        }
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        hmvk hmvk0 = (hmvk)esrz0;
        return new hmte(new hmus(hmvk0, hmvc.a(jSONObject0), ((hmsn)this.c.a(hmvk0))), new hmvl(arr_b, essb0, set0));
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        byte[] arr_b31;
        byte[] arr_b14;
        byte[] arr_b13;
        hmvx hmvx0;
        long v7;
        int v6;
        int v5;
        hmvk hmvk1;
        hmtd hmtd1;
        hmuq hmuq0;
        if(((hmvk)esrz0) == null) {
            throw new essd(1, "Card profile or key missing.");
        }
        hmus hmus0 = new hmus(((hmvk)esrz0), hmvc.a(jSONObject0), ((hmsn)this.c.a(((hmvk)esrz0))));
        hmtd hmtd0 = hmtd.d(hmsn.l(arr_b));
        hmwb.b(essg0);
        byte[] arr_b1 = hmvw.b(hmtd0, 0);
        if(hmsi.d(arr_b1) >= 0xFFFF) {
            throw new essd(1, "ATC limit exceeded");
        }
        int v = essg0.e;
        byte[] arr_b2 = hmsi.w(((byte)(hmsi.d(arr_b1) + 1)));
        boolean z = hmus0.b(hmsi.w(((short)v)));
        long v1 = essg0.c;
        int v2 = essg0.b;
        int v3 = hmtg.b - ((int)(((Integer)hmvq.a.get(Integer.valueOf(v2)))));
        String s = Long.toString(v1);
        if(v3 < 0 || s.length() < v3 || !s.substring(s.length() - v3).matches("0*") || s.length() - v3 > 12) {
            throw new essd(1, "Cannot convert Amount micros to Amount authorized.");
        }
        long v4 = Long.parseLong(s.substring(0, s.length() - v3));
        hmvk hmvk0 = hmus0.a;
        hmst hmst0 = new hmst(hmsi.q(hmvk0.f("ACO")));
        hmtk hmtk0 = hmtk.c;
        if(hmst0.b(hmtk0) && hmst0.b(hmtk.d)) {
            throw new essd(2, "ACO does not authorize any of 3DS or EMV.");
        }
        hmtk hmtk1 = hmtk.a;
        boolean z1 = hmst0.a(hmtk1);
        hmtk hmtk2 = hmtk.b;
        if(z1 == hmst0.a(hmtk2)) {
            throw new essd(1, "ACO doesn\'t have exactly one prefered option");
        }
        if(hmst0.a(hmtk1) && hmst0.b(hmtk0) || hmst0.a(hmtk2) && hmst0.b(hmtk.d)) {
            throw new essd(1, "ACO prefered option is not authorized");
        }
        EnumSet enumSet0 = essg0.h;
        essf essf0 = essf.a;
        if(enumSet0.contains(essf0) && enumSet0.contains(essf.b)) {
            if(hmst0.a(hmtk1)) {
                hmuq0 = hmuq.b;
                goto label_42;
            }
            hmuq0 = hmuq.a;
            goto label_42;
        }
        if(enumSet0.contains(essf0)) {
            if(!hmst0.a(hmtk.d)) {
                throw new essd(2, "No compatible capabilities discovered.");
            }
            hmuq0 = hmuq.a;
            goto label_42;
        }
        if(!enumSet0.contains(essf.b)) {
            throw new essd(1, "ACO does not authorize any of 3DS or EMV.");
        }
        if(hmst0.a(hmtk0)) {
            hmuq0 = hmuq.b;
        label_42:
            hmuq hmuq1 = hmuq.b;
            if(hmuq0 == hmuq1) {
                hmst hmst1 = hmvs.a(hmus0);
                byte[] arr_b3 = (byte[])hmtd0.c(hmti.e.a()).g(new byte[]{0, 0, 0, 0, 0, 0});
                byte[] arr_b4 = (byte[])hmtd0.c(hmti.d.a()).g(new byte[]{0, 0, 0, 0, 0, 0});
                hmvc hmvc0 = hmus0.b;
                hmsu hmsu0 = new hmsu(new byte[1]);
                byte[] arr_b5 = hmsu0.b;
                hmty hmty0 = hmty.a;
                if(arr_b5.length > 0) {
                    arr_b5[0] = (byte)(arr_b5[0] | 1 << hmty0.a() - 1);
                }
                hmtd1 = hmtd0;
                hmvk1 = hmvk0;
                v5 = v2;
                v6 = v;
                hmus0 = hmus0;
                v7 = v1;
                hmvx0 = hmvy.a(hmus0, new hmst(hmsu0.c()), hmsn.b, hmst1, arr_b3, arr_b4, true, z, v4, hmvc0.c, hmvc0.d);
            }
            else {
                hmtd1 = hmtd0;
                v7 = v1;
                hmvk1 = hmvk0;
                v5 = v2;
                v6 = v;
                hmvx0 = new hmvx(hmtr.d(hmtg.a), hmsn.b, hmsn.b);
            }
            byte[] arr_b6 = hmsi.q(hmus0.b.a);
            try {
                hmtr hmtr0 = hmvx0.c;
                byte[] arr_b7 = hmtr0.c();
                byte[] arr_b8 = hmvk1.g();
                String s1 = hmus0.b.b;
                if(hmuq0 == hmuq1) {
                    byte[] arr_b9 = hmsi.p(hmsi.s(new long[]{v4}), 0, 6);
                    byte[] arr_b10 = hmsi.p(hmsi.r(new int[]{v6}), 0, 2);
                    byte[] arr_b11 = hmsi.p(hmsi.r(new int[]{v5}), 0, 2);
                    byte[] arr_b12 = hmsi.p(hmsi.s(new long[]{essg0.a}), 0, 4);
                    arr_b13 = hmsi.l(new Object[]{arr_b9, new byte[]{0, 0, 0, 0, 0, 0}, arr_b10, new byte[]{0, 0, 0, 0, 0}, arr_b11, hmsi.u(essg0.d), ((byte)hmve.a.e), arr_b12, arr_b8, arr_b2, arr_b7});
                    arr_b14 = arr_b2;
                }
                else {
                    arr_b14 = arr_b2;
                    arr_b13 = hmsi.m(new byte[][]{new byte[]{0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0}, new byte[]{0, 0}, new byte[]{0, 0, 0, 0, 0}, new byte[]{0, 0}, new byte[]{0, 0, 0}, new byte[]{0}, hmsi.t(essg0.a, 4), new byte[]{0, 0}, arr_b2, arr_b7});
                }
                byte[] arr_b15 = hmsi.q(s1);
                hmsh.a(arr_b15.length == 16, "ISO-9797-alg3 joined keys array must have size of 16 bytes");
                hmsp hmsp0 = new hmsp(hmsj.a(arr_b13, Arrays.copyOfRange(arr_b15, 0, 8), Arrays.copyOfRange(arr_b15, 8, 16)), hmuq0);
                byte[] arr_b16 = (byte[])hmsp0.a;
                byte[] arr_b17 = hmsi.v(arr_b16);
                byte[] arr_b18 = hmsi.p(hmsi.s(new long[]{essg0.a}), 4, 4);
                byte[] arr_b19 = hmsi.u(essg0.d);
                byte[] arr_b20 = hmsi.p(hmsi.s(new long[]{v7}), 2, 6);
                byte[] arr_b21 = hmsi.p(hmsi.r(new int[]{v5}), 2, 2);
                byte[] arr_b22 = hmsi.p(hmsi.r(new int[]{v6}), 2, 2);
                byte b = hmvk1.c();
                byte[] arr_b23 = hmvk1.g();
                hmri hmri0 = hmri.ai;
                byte[] arr_b24 = (byte[])hmvk1.i(hmri0).e("PAN Sequence Number (PSN) is mandatory element");
                byte[] arr_b25 = hmsi.v(hmtr0.c());
                byte[] arr_b26 = hmsi.v(arr_b6);
                byte[] arr_b27 = hmsi.v(arr_b14);
                Object object0 = hmsp0.b;
                if(((hmuq)object0) == hmuq1) {
                    hmvb hmvb0 = new hmvb(b, arr_b25, arr_b26);
                    byte[] arr_b28 = hmrl.a(hmri.V, arr_b17).e();
                    byte[] arr_b29 = hmrl.a(hmri.ac, new byte[]{hmsg.b.d}).e();
                    byte[] arr_b30 = hmvb0.a();
                    arr_b31 = hmsi.m(new byte[][]{arr_b28, arr_b29, hmrl.a(hmri.Z, arr_b30).e(), hmrl.a(hmri.u, arr_b18).e(), hmrl.a(hmri.Y, arr_b27).e(), hmrl.a(hmri.s, new byte[]{0, 0, 0, 0, 0}).e(), hmrl.a(hmri.J, arr_b19).e(), hmrl.a(hmri.K, new byte[]{hmve.a.e}).e(), hmrl.a(hmri.C, arr_b20).e(), hmrl.a(hmri.H, arr_b21).e(), hmrl.a(hmri.f, arr_b23).e(), hmrl.a(hmri.F, arr_b22).e(), hmrl.a(hmri.D, new byte[]{0, 0, 0, 0, 0, 0}).e(), hmrl.a(hmri0, arr_b24).e()});
                }
                else {
                    arr_b31 = hmsi.m(new byte[][]{new byte[]{b}, arr_b18, arr_b27, arr_b17, new byte[]{6}, arr_b24, arr_b26, new byte[]{0}});
                }
                byte[] arr_b32 = hmus0.c();
                int v8 = Integer.parseInt(("20" + hmsi.i(new byte[]{hmvk1.h(hmri.ak)[0]})));
                int v9 = Integer.parseInt(hmsi.i(new byte[]{hmvk1.h(hmri.ak)[1]}));
                String s2 = object0 == hmuq.a ? hmvk1.f("ECI") : null;
                hmwa hmwa0 = new hmwa();
                List list0 = hmvs.d(hmvx0.a, hmvx0.b, hmsn.b, hmsn.b);
                list0.add(new hmsw(hmrl.a(hmri.Y, arr_b14)));
                return new hmva(arr_b16, arr_b31, arr_b32, v8, v9, s2, hmtd1.e(hmwa0, list0));
            }
            catch(Exception exception0) {
                throw new essd(1, exception0.getMessage());
            }
        }
        throw new essd(2, "No compatible capabilities discovered.");
    }

    @Override  // essj
    public final String e() {
        return "@PROJECT_VERSION@";
    }
}

