import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

public final class esrn {
    static gfmo a(JSONObject jSONObject0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfmo.a).v_newBuilder();
        ByteString hfsf0 = esrn.f(jSONObject0, "sk_cl_md");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfmo gfmo0 = (gfmo)hftp0.b_message;
        hfsf0.getClass();
        gfmo0.c = hfsf0;
        ByteString hfsf1 = esrn.f(jSONObject0, "sk_rp_md");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfmo gfmo1 = (gfmo)hftp0.b_message;
        hfsf1.getClass();
        gfmo1.g = hfsf1;
        ByteString hfsf2 = esrn.f(jSONObject0, "idn");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfmo gfmo2 = (gfmo)hftp0.b_message;
        hfsf2.getClass();
        gfmo2.e = hfsf2;
        ByteString hfsf3 = esrn.f(jSONObject0, "atc");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfmo gfmo3 = (gfmo)hftp0.b_message;
        hfsf3.getClass();
        gfmo3.d = hfsf3;
        ByteString hfsf4 = esrn.f(jSONObject0, "sk_cl_umd");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfmo gfmo4 = (gfmo)hftp0.b_message;
        hfsf4.getClass();
        gfmo4.b = hfsf4;
        ByteString hfsf5 = esrn.f(jSONObject0, "sk_rp_umd");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfmo gfmo5 = (gfmo)hftp0.b_message;
        hfsf5.getClass();
        gfmo5.f = hfsf5;
        return (gfmo)hftp0.N_build();
    }

    static gged_interceptors b() {
        return gged_interceptors.n(new hmht(ByteBuffer.allocate(2).putShort((short)0x9F1D).array(), 8), new hmht(ByteBuffer.allocate(2).putShort((short)0x9F7E).array(), 1), new hmht(ByteBuffer.allocate(2).putShort((short)0x9F4E).array(), 0x20));
    }

    static gged_interceptors c() {
        return gged_interceptors.l(new hmht(ByteBuffer.allocate(2).putShort((short)0x9F33).array(), 3));
    }

    public static boolean d(JSONObject jSONObject0) {
        try {
            if(jSONObject0.getInt("CDOL1_RelatedDataLength") >= 45 && esxg.c(jSONObject0.getString("issuerApplicationData")).length == 18 && esxg.c(jSONObject0.getString("ICC_privateKey_a")).length > 0 && esxg.c(jSONObject0.getString("ICC_privateKey_dp")).length > 0 && esxg.c(jSONObject0.getString("ICC_privateKey_dq")).length > 0 && esxg.c(jSONObject0.getString("ICC_privateKey_p")).length > 0 && esxg.c(jSONObject0.getString("ICC_privateKey_q")).length > 0) {
                return true;
            }
        }
        catch(JSONException unused_ex) {
        }
        return false;
    }

    public static hmie e(gfmn gfmn0) {
        boolean z2;
        hmif hmif1;
        gfml gfml0 = gfmn0.c == null ? gfml.a : gfmn0.c;
        gfmi gfmi0 = gfmn0.b == null ? gfmi.a : gfmn0.b;
        gfmm gfmm0 = gfmn0.d == null ? gfmm.a : gfmn0.d;
        hmif hmif0 = new hmif();
        hmif0.c(gfmi0.b.toByteArray(), gfmm0.c.toByteArray(), 3, 5);
        byte[] arr_b = gfml0.o.toByteArray();
        byte[] arr_b1 = gfml0.h.toByteArray();
        byte[] arr_b2 = gfml0.r.toByteArray();
        byte[] arr_b3 = gfml0.g.toByteArray();
        byte[] arr_b4 = gfml0.e.toByteArray();
        byte[] arr_b5 = gfml0.f.toByteArray();
        byte[] arr_b6 = gfml0.c.toByteArray();
        byte[] arr_b7 = gfml0.q.toByteArray();
        byte[] arr_b8 = gfml0.n.toByteArray();
        byte[] arr_b9 = new hmgz(Integer.toHexString(gfml0.d)).a;
        boolean z = gfml0.n.size() == 2;
        boolean z1 = esrn.g(gfml0);
        if(esrn.g(gfml0)) {
            hmif1 = hmif0;
            z2 = (gfml0.p == null ? gfmj.a : gfml0.p).d.size() == 6;
        }
        else {
            hmif1 = hmif0;
            z2 = false;
        }
        hmif1.d(arr_b, arr_b1, arr_b2, arr_b3, arr_b4, arr_b5, arr_b6, arr_b7, arr_b8, arr_b9, z, z1, z2, 1, 1);
        hmif1.e(gfmm0.i.toByteArray(), gfmm0.h.toByteArray(), gfmm0.e.toByteArray(), gfmm0.b.toByteArray(), gfmm0.f.toByteArray(), gfmm0.d.toByteArray(), gfmm0.g.toByteArray(), 1, 1);
        if((gfml0.b & 1) != 0) {
            gfmj gfmj0 = gfml0.p == null ? gfmj.a : gfml0.p;
            hmif1.a(gfmj0.f.toByteArray(), gfmj0.e.toByteArray(), gfmj0.d.toByteArray(), gfmj0.c.toByteArray(), gfmj0.b.toByteArray());
        }
        for(Object object0: gfml0.s) {
            hmif1.b(((gfmk)object0).c.toByteArray()[0], ((gfmk)object0).b.toByteArray()[0], ((gfmk)object0).d.toByteArray());
        }
        return new hmie(hmif1);
    }

    private static ByteString f(JSONObject jSONObject0, String s) {
        try {
            return ByteString.copyFrom(esxg.c(jSONObject0.getString(s)));
        }
        catch(JSONException unused_ex) {
            return ByteString.b;
        }
    }

    private static boolean g(gfml gfml0) {
        return gfml0.d >= 45 && gfml0.q.size() == 18 && !gfml0.i.isEmpty() && !gfml0.j.isEmpty() && !gfml0.k.isEmpty() && !gfml0.l.isEmpty() && !gfml0.m.isEmpty();
    }
}

