import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public class szv implements essj {
    static {
    }

    public static tab a(essb essb0) {
        boolean z = essb0.b();
        boolean z1 = essb0.c();
        essb0.d();
        return new tab(z, z1);
    }

    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        tca tca0;
        tar tar1;
        tar tar0;
        byte[] arr_b1;
        byte[] arr_b;
        try {
            arr_b = szo.a(jSONObject0, "chipdata");
            if(jSONObject1 == null) {
                arr_b1 = new byte[0];
            }
            else {
                try {
                    arr_b1 = teb.f(new byte[][]{new tco(szo.a(jSONObject1, "qi")).d(), new tcp(szo.a(jSONObject1, "dq")).d(), new tcq(szo.a(jSONObject1, "dp")).d(), new tcr(szo.a(jSONObject1, "q")).d(), new tcs(szo.a(jSONObject1, "p")).d()});
                }
                catch(JSONException jSONException1) {
                    throw new RuntimeException(jSONException1);
                }
            }
        }
        catch(JSONException jSONException0) {
            throw teb.b(jSONException0);
        }
        teb.g(arr_b);
        teb.c(arr_b.length > 2);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        HashMap hashMap0 = new HashMap(1);
        HashSet hashSet0 = new HashSet(Arrays.asList(new tcj[]{tcf.a}));
        while(true) {
            try {
                if(byteArrayInputStream0.available() <= 0) {
                    break;
                }
                if(byteArrayInputStream0.available() < 2) {
                    throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                }
                byte b = (byte)byteArrayInputStream0.read();
                byte b1 = (byte)byteArrayInputStream0.read();
                tcj tcj0 = new tcj(b, b1);
                int v = tca.c(byteArrayInputStream0);
                if(byteArrayInputStream0.available() < v) {
                    throw new IllegalArgumentException("Parse exception, could not parse dgi data for tag " + tek.b(new byte[]{b, b1}));
                }
                byte[] arr_b2 = new byte[v];
                if(byteArrayInputStream0.read(arr_b2) != v) {
                    throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                }
                if(hashSet0.remove(tcj0)) {
                    hashMap0.put(tcj0, arr_b2);
                }
                if(hashSet0.isEmpty()) {
                    break;
                }
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
        }
        tcj tcj1 = tcf.a;
        byte[] arr_b3 = (byte[])hashMap0.get(tcj1);
        boolean z = arr_b3 != null && arr_b3.length > 0;
        if(z) {
            tak tak0 = new tak(new tcf(tcj1, arr_b3).b(tbv.a), tbv.c);
            try {
                String s = new String(tak0.f(), "ASCII");
                tar[] arr_tar = tar.values();
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= arr_tar.length) {
                        throw new IllegalStateException("Unsupported card type: " + s);
                    }
                    tar0 = arr_tar[v1];
                    if(tar0.r.equals(s)) {
                        break;
                    }
                }
                tar1 = tar0;
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new RuntimeException(unsupportedEncodingException0);
            }
        }
        else {
            tar1 = null;
        }
        if(!z) {
            throw new RuntimeException("Platform DGI not present");
        }
        szk szk0 = null;
        for(Object object0: szu.a) {
            szk szk1 = (szk)object0;
            if(tar.i.equals(tar1)) {
                szk0 = szk1;
                break;
            }
        }
        if(szk0 == null) {
            throw new IllegalStateException("Unsupported card type: " + tar1);
        }
        byte[] arr_b4 = teb.f(new byte[][]{arr_b, arr_b1});
        tko tko0 = new tko();
        Map map0 = new tci(new tcl[]{new tmy()}).a;
        tar tar2 = tar.i;
        tcl tcl0 = (tcl)map0.get(tar2);
        if(tcl0 == null) {
            throw new IllegalStateException("No dgi factory for platform " + tar2);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr_b4);
        while(byteArrayInputStream1.available() > 0) {
            try {
                if(byteArrayInputStream1.available() < 2) {
                    throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                }
                byte b2 = (byte)byteArrayInputStream1.read();
                byte b3 = (byte)byteArrayInputStream1.read();
                tcj tcj2 = new tcj(b2, b3);
                int v2 = tca.c(byteArrayInputStream1);
                if(byteArrayInputStream1.available() < v2) {
                    throw new IllegalArgumentException(a.v(tek.b(new byte[]{b2, b3}), "Parse exception, could not parse dgi data for tag "));
                }
                byte[] arr_b5 = new byte[v2];
                if(v2 != 0 && byteArrayInputStream1.read(arr_b5) != v2) {
                    throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                }
                tca0 = tcl0.b(tcj2, arr_b5);
            }
            catch(IOException iOException1) {
                throw new RuntimeException(iOException1);
            }
            tcj tcj3 = tca0.c;
            if(linkedHashMap0.containsKey(tcj3)) {
                byte[] arr_b6 = ((tca)linkedHashMap0.get(tcj3)).e();
                byte[] arr_b7 = tca0.e();
                byte[] arr_b8 = new byte[arr_b6.length + arr_b7.length];
                System.arraycopy(arr_b6, 0, arr_b8, 0, arr_b6.length);
                System.arraycopy(arr_b7, 0, arr_b8, arr_b6.length, arr_b7.length);
                linkedHashMap0.put(tcj3, tcl0.b(tcj3, arr_b8));
            }
            else {
                linkedHashMap0.put(tcj3, tca0);
            }
        }
        tko0.a = new tkn(linkedHashMap0);
        tko0.b = new szs();
        return new szq(tko0, szk0);
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        szv.f(((szq)esrz0), jSONObject0);
        tao tao0 = ((szq)esrz0).a;
        tdu tdu0 = tao0.b;
        essa essa0 = ((szs)tdu0).a;
        try {
            tax tax0 = tdw.a(tao0, szv.a(essb0), taq.a);
            essa0.a = tax0;
            essa0.c = new tna(tdu0);
            essa0.b = arr_b;
            tax0.d();
            return essa0;
        }
        catch(taa taa0) {
            throw new RuntimeException(taa0);
        }
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        byte[] arr_b3;
        byte[] arr_b1;
        tkm tkm0 = szv.f(((szq)esrz0), jSONObject0);
        tao tao0 = ((szq)esrz0).a;
        szp szp0 = ((szs)tao0.b).a;
        try {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: essg0.h) {
                arrayList0.add(((tan)Enum.valueOf(tan.class, ((essf)object0).name())));
            }
            EnumSet.copyOf(arrayList0);
            tab tab0 = szv.a(essb0);
            if(((tkn)tao0.b()).m().h()) {
                throw new syl("application blocked", syn.o);
            }
            String s = essg0.d;
            if(s == null) {
                throw new syl("missing input data element: transaction date", syn.p);
            }
            if(!s.matches("\\d{6}")) {
                throw new syl("Invalid transaction date: " + s, syn.k);
            }
            String s1;
            for(s1 = Long.toString(Math.abs(essg0.a) % 0x100000000L, 16); s1.length() < 8; s1 = "0" + s1) {
            }
            tdn tdn0 = new tdn(tek.d(s1));
            tkm tkm1 = ((szs)tao0.b).a(tao0).a;
            tba tba0 = new tba(tkm1.a);
            tam tam0 = tao0.b();
            tma tma0 = (tma)tam0.d(tma.a);
            tmq tmq0 = (tmq)tam0.d(tmq.a);
            tla tla0 = new tla();
            if(tab0.c != 1 && tab0.b != 1) {
                tla0.i(true);
                tla0.h(tkz.b);
            }
            else {
                tla0.i(false);
                tla0.h(tkz.a);
            }
            tld tld0 = tma0.j();
            tld0.q();
            tld0.m(new tkx(tek.d("A1")));
            tld0.p(new tbn(tmq0.a(0, 1)));
            tld0.o(new tlc(tek.d("A000000000")));
            tld0.n(tla0);
            tdm tdm0 = new tdm(new byte[1]);
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                byteArrayOutputStream0.write(tak.e(new tak[]{tdn0, tba0}));
                byteArrayOutputStream0.write(tld0.h());
                byteArrayOutputStream0.write(tld0.l().f());
                byteArrayOutputStream0.write(tld0.i());
                byteArrayOutputStream0.write(tak.e(new tak[]{tdm0}));
                tlb.a.a(byteArrayOutputStream0);
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            byte[] arr_b2 = tee.a(arr_b1, tkm1.b);
            tek.b(arr_b2);
            tbe tbe0 = new tbe(arr_b2);
            tbh tbh0 = ((tmr)tao0.b().d(tmr.a)).i();
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream1.write(tld0.h() & 15);
                byteArrayOutputStream1.write(tld0.l().f());
                byteArrayOutputStream1.write(tld0.i());
                byteArrayOutputStream1.write(tbe0.f());
                byteArrayOutputStream1.write(tdn0.f());
                byteArrayOutputStream1.write(tba0.f());
                byteArrayOutputStream1.write(((int)tbh0.f()[5]));
                byteArrayOutputStream1.write(new byte[]{-100});
                byteArrayOutputStream1.write(new byte[]{0});
            }
            catch(IOException iOException1) {
                throw new RuntimeException(iOException1);
            }
            arr_b3 = byteArrayOutputStream1.toByteArray();
        }
        catch(tdt unused_ex) {
            throw null;
        }
        tbt tbt0 = tao0.d();
        char[] arr_c = tek.e(tbt0.b, false);
        int v = FIN.finallyOpen$NT();
        byte[] arr_b4 = tbt0.b;
        int v1;
        for(v1 = arr_b4.length - 1; v1 >= 0 && arr_b4[v1] == -1; --v1) {
        }
        if(v1 >= 0) {
            int v2 = v1 + 1;
            int v3 = (arr_b4[v1] & 15) == 15 ? v2 + v2 - 1 : v2 + v2;
            char[] arr_c1 = new char[v3];
            System.arraycopy(arr_c, 0, arr_c1, 0, v3);
            FIN.finallyCodeBegin$NT(v);
            String s2 = szw.a(tao0.d(), tkm0.a, arr_b3);
            return new szt(arr_b3, szp0, new String(arr_c1), tao0.a.a(tao0.a.b().a(1)), tao0.a.a(tao0.a.b().a(0)) + 2000, s2);
        }
        throw new IllegalArgumentException("PAN congtains only \'0xFF\' bytes.");
    }

    @Override  // essj
    public final String e() {
        return "unknown";
    }

    private static final tkm f(szq szq0, JSONObject jSONObject0) {
        byte[] arr_b1;
        tkm tkm0;
        tdu tdu0;
        try {
            tdu0 = szq0.a.b;
            tkm0 = new tkm();
            tkm0.b = szo.a(jSONObject0, "key");
            tkm0.a = szo.a(jSONObject0, "atc");
        }
        catch(JSONException jSONException0) {
            throw teb.b(jSONException0);
        }
        new tba(tkm0.a);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream0.write(tkm0.a, 0, tkm0.a.length);
            byte[] arr_b = tkm0.b;
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 4);
            byteBuffer0.putInt(arr_b.length);
            byteBuffer0.put(arr_b);
            try {
                byteArrayOutputStream0.write(byteBuffer0.array());
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            arr_b1 = byteArrayOutputStream0.toByteArray();
        }
        finally {
            tel.a(byteArrayOutputStream0);
        }
        ((szs)tdu0).c = arr_b1;
        return tkm0;
    }
}

