import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public class tfr implements essj {
    public static final String a = "tfr";

    static {
    }

    public tfr() {
        tjk.f("--> OpenAppletImpl", new Object[0]);
        tjk.f("<-- OpenAppletImpl", new Object[0]);
    }

    public static tfv a(essb essb0) {
        boolean z = essb0.b();
        essb0.c();
        essb0.d();
        return new tfv(z);
    }

    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        thp thp0;
        long v3;
        tgj tgj1;
        tgj tgj0;
        byte[] arr_b1;
        byte[] arr_b;
        tjk.f("--> createCardProfile", new Object[0]);
        try {
            arr_b = tfk.a(jSONObject0, "chipdata");
            arr_b1 = jSONObject1 == null ? new byte[0] : tfk.a(jSONObject1, "chipdata");
        }
        catch(JSONException jSONException0) {
            throw tjh.b(jSONException0);
        }
        tjh.e(arr_b);
        tjh.c(arr_b.length > 2);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        HashMap hashMap0 = new HashMap(1);
        HashSet hashSet0 = new HashSet(Arrays.asList(new tib[]{thw.a}));
        while(true) {
            try {
            label_11:
                if(byteArrayInputStream0.available() > 0) {
                    if(byteArrayInputStream0.available() < 2) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                    }
                    byte b = (byte)byteArrayInputStream0.read();
                    byte b1 = (byte)byteArrayInputStream0.read();
                    tib tib0 = new tib(b, b1);
                    int v = thp.c(byteArrayInputStream0);
                    if(byteArrayInputStream0.available() < v) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi data for tag " + tjs.b(new byte[]{b, b1}));
                    }
                    byte[] arr_b2 = new byte[v];
                    if(byteArrayInputStream0.read(arr_b2) != v) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                    }
                    if(hashSet0.remove(tib0)) {
                        tjk.f("findDgiValues() - found {} {}", new Object[]{tib0, arr_b2});
                        hashMap0.put(tib0, arr_b2);
                    }
                    if(hashSet0.isEmpty()) {
                        break;
                    }
                    goto label_11;
                }
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            if(hashSet0.isEmpty()) {
                break;
            }
            tje.a.a("findDgiValues() - not found {}", hashSet0);
            break;
        }
        tib tib1 = thw.a;
        byte[] arr_b3 = (byte[])hashMap0.get(tib1);
        boolean z = arr_b3 != null && arr_b3.length > 0;
        if(z) {
            tgc tgc0 = new tgc(new thw(tib1, arr_b3).b(thl.a), thl.b);
            try {
                String s = new String(tgc0.k(), "ASCII");
                tgj[] arr_tgj = tgj.values();
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= arr_tgj.length) {
                        throw new IllegalStateException("Unsupported card type: " + s);
                    }
                    tgj0 = arr_tgj[v1];
                    if(tgj0.r.equals(s)) {
                        break;
                    }
                }
                tgj1 = tgj0;
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new RuntimeException(unsupportedEncodingException0);
            }
        }
        else {
            tgj1 = null;
        }
        if(!z) {
            throw new RuntimeException("Platform DGI not present");
        }
        tfi tfi0 = null;
        for(Object object0: tfq.a) {
            tfi tfi1 = (tfi)object0;
            if(tfi1.a().equals(tgj1)) {
                tfi0 = tfi1;
                break;
            }
        }
        tjk.f("for the platform {} found the paymentModule {}", new Object[]{tgj1, tfi0});
        if(tfi0 == null) {
            throw new IllegalStateException("Unsupported card type: " + tgj1);
        }
        byte[] arr_b4 = tjh.d(new byte[][]{arr_b, arr_b1});
        tqn tqn0 = new tqn();
        tgj tgj2 = tfi0.a();
        tid tid0 = (tid)new tia(new tid[]{new tsj()}).a.get(tgj2);
        if(tid0 == null) {
            throw new IllegalStateException("No dgi factory for platform " + tgj2);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr_b4);
        while(byteArrayInputStream1.available() > 0) {
            try {
                v3 = System.currentTimeMillis();
                if(byteArrayInputStream1.available() < 2) {
                    throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                }
                byte b2 = (byte)byteArrayInputStream1.read();
                byte b3 = (byte)byteArrayInputStream1.read();
                tib tib2 = new tib(b2, b3);
                int v4 = thp.c(byteArrayInputStream1);
                if(byteArrayInputStream1.available() < v4) {
                    throw new IllegalArgumentException(a.v(tjs.b(new byte[]{b2, b3}), "Parse exception, could not parse dgi data for tag "));
                }
                byte[] arr_b5 = new byte[v4];
                if(v4 != 0 && byteArrayInputStream1.read(arr_b5) != v4) {
                    throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                }
                thp0 = tid0.b(tib2, arr_b5);
            }
            catch(IOException iOException1) {
                throw new RuntimeException(iOException1);
            }
            finally {
                tia.b.a("Parsing Took {}", Long.valueOf(System.currentTimeMillis() - v3));
            }
            tib tib3 = thp0.c;
            if(linkedHashMap0.containsKey(tib3)) {
                tjk.f("Merging dgi: {}", new Object[]{tib3});
                byte[] arr_b6 = ((thp)linkedHashMap0.get(tib3)).e();
                byte[] arr_b7 = thp0.e();
                byte[] arr_b8 = new byte[arr_b6.length + arr_b7.length];
                System.arraycopy(arr_b6, 0, arr_b8, 0, arr_b6.length);
                System.arraycopy(arr_b7, 0, arr_b8, arr_b6.length, arr_b7.length);
                linkedHashMap0.put(tib3, tid0.b(tib3, arr_b8));
            }
            else {
                linkedHashMap0.put(tib3, thp0);
            }
        }
        tqn0.a = new tqm(linkedHashMap0);
        tqn0.b = new tfo();
        esrz esrz0 = new tfm(tqn0, tfi0);
        tjk.f("<-- createCardProfile", new Object[0]);
        return esrz0;
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        tjk.f("--> initializeForPayment", new Object[0]);
        tfr.f(((tfm)esrz0), arr_b, jSONObject0);
        tgg tgg0 = ((tfm)esrz0).b;
        tjb tjb0 = tgg0.b;
        essa essa0 = ((tfo)tjb0).a;
        try {
            tgn tgn0 = tjd.a(tgg0, tfr.a(essb0), tgi.a);
            essa0.a = tgn0;
            essa0.b = new ttc(tjb0);
            essa0.c = arr_b;
            tgn0.f();
            tjk.f("checking riscManagementData", new Object[0]);
            tgg tgg1 = ((tqo)tgn0).b;
            if(tgg1.e == null || tgg1.e.length == 0) {
                tqy tqy0 = new tqy();
                if(tjs.b(tgg1.c.k()).equals("0001")) {
                    tjk.f("riscManagementTLV Not found and ATC is 1 so initialize with 0: {}", new Object[]{((tqo)tgn0).l});
                }
                else {
                    trq trq0 = (trq)tgn0.b.a().d(trq.a);
                    tqy0.c(new trm(trq0.o().k()));
                    tqy0.c(new trl(trq0.n().k()));
                    tjk.f("riscManagementTLV Not found and ATC is not 1 so initialize with maximum value from profile: {}", new Object[]{((tqo)tgn0).l});
                }
                tgg1.d = tqy0.C().c();
                tgg1.e = tqy0.C().c();
                ((tqo)tgn0).l = ((tqn)tgg1).d();
            }
            else {
                ((tqo)tgn0).l = ((tqn)tgg1).d();
                tjk.f("riscManagementTLV found: {}", new Object[]{((tqo)tgn0).l});
            }
            tre tre0 = new tre(((trq)tgn0.b.a().d(trq.a)).l().k());
            if(tre0.q()) {
                throw new teq(tes.c);
            }
            tgn0.j.c(tre0);
            tqw tqw0 = new tqw(tqw.a);
            tgn0.j.c(tqw0);
            tqx tqx0 = new tqx(tqx.a);
            tgn0.j.c(tqx0);
            tre tre1 = new tre(tre.a);
            tre1.c[1] = 0;
            tgn0.j.c(tre1);
            ((tqo)tgn0).j();
        }
        catch(tfu tfu0) {
            throw new RuntimeException(tfu0);
        }
        tjk.f("<-- initializeForPayment", new Object[0]);
        return essa0;
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        int v13;
        tja tja1;
        byte[] arr_b7;
        byte[] arr_b6;
        tss tss0;
        tit tit0;
        tgl tgl2;
        tis tis0;
        tir tir0;
        tim tim0;
        tsr tsr0;
        tgp tgp0;
        tgx tgx1;
        byte[] arr_b3;
        tso tso0;
        tgz tgz0;
        til til0;
        tiq tiq0;
        tsx tsx4;
        tgu tgu0;
        thj thj0;
        tgs tgs0;
        tqn tqn2;
        byte[] arr_b2;
        tgx tgx0;
        thb thb0;
        Object[] arr_object;
        tqu tqu0;
        tqt tqt0;
        tqx tqx2;
        tre tre3;
        tqw tqw3;
        trq trq1;
        tsx tsx2;
        tqn tqn1;
        tgl tgl1;
        ttg ttg1;
        long v;
        tsl tsl0;
        tjk.f("--> generateInAppTransaction", new Object[0]);
        tql tql0 = tfr.f(((tfm)esrz0), arr_b, jSONObject0);
        tgg tgg0 = ((tfm)esrz0).b;
        ttg ttg0 = new ttg();
        tfl tfl0 = ((tfo)tgg0.b).a;
        try {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: essg0.h) {
                arrayList0.add(((tgf)Enum.valueOf(tgf.class, ((essf)object0).name())));
            }
            EnumSet enumSet0 = EnumSet.copyOf(arrayList0);
            tfv tfv0 = tfr.a(essb0);
            if(enumSet0 == null) {
                tsl0 = new tsl((byte)0x8E);
            }
            else if(enumSet0.contains(tgf.a)) {
                tsl0 = new tsl(-50);
            }
            else if(enumSet0.contains(tgf.b)) {
                tsl0 = new tsl((byte)0x8E);
            }
            else {
                tsl0 = new tsl(0);
            }
            tsx tsx0 = new tsx(essg0.a, essg0.b, essg0.c / 10000L, essg0.d, essg0.e, tsl0);
            tfx tfx0 = tfv0.a() ? new tfw() : new tfx();
            tqp tqp0 = new tqp(((tqn)tgg0), tfx0, new tgl(), tsx0);
            try {
                tjk.f("checking riscManagementData", new Object[0]);
                tqn tqn0 = tqp0.b;
                if(tqn0.e == null || tqn0.e.length == 0) {
                    tqy tqy0 = new tqy();
                    if(tjs.b(tqn0.c.k()).equals("0001")) {
                        tjk.f("riscManagementTLV Not found and ATC is 1 so initialize with 0: {}", new Object[]{tqp0.d});
                    }
                    else {
                        trq trq0 = (trq)tqn0.a().d(trq.a);
                        tqy0.c(new trm(trq0.o().k()));
                        tqy0.c(new trl(trq0.n().k()));
                        tjk.f("riscManagementTLV Not found and ATC is not 1 so initialize with maximum value from profile: {}", new Object[]{tqp0.d});
                    }
                    tqn0.d = tqy0.C().c();
                    tqn0.e = tqy0.C().c();
                    tqp0.d = tqn0.d();
                }
                else {
                    tqp0.d = tqn0.d();
                    tjk.f("riscManagementTLV found: {}", new Object[]{tqp0.d});
                }
                tge tge0 = tqn0.a();
                tib tib0 = trq.a;
                tre tre0 = new tre(((trq)tge0.d(tib0)).l().k());
                if(!tre0.q()) {
                    tgl tgl0 = tqp0.g;
                    tgl0.c(tre0);
                    tql tql1 = ((tfo)tqn0.b).b().a;
                    if(new tjp(tql1.a).a() < 0xFFFF) {
                        tgl0.c(new tgp(tql1.a));
                        tqp0.a();
                        tgl0.c(new tqx(tqx.a));
                        if(((trq)tqn0.a().d(tib0)).j().n()) {
                            tsx tsx1 = tqp0.e;
                            switch(tsx1.h.k()[0]) {
                                case 0xFFFFFF8E: 
                                case -50: {
                                    if(!tsx1.b.n()) {
                                        try {
                                            Long.parseLong(tjs.b(tsx1.b.k()));
                                            v = Long.parseLong(tjs.b(tsx1.f.k()));
                                            goto label_67;
                                        }
                                        catch(NumberFormatException unused_ex) {
                                        }
                                        goto label_65;
                                    }
                                    goto label_330;
                                }
                                default: {
                                    throw new tqk(tqj.e, tqj.g.h);
                                }
                            }
                        }
                        goto label_332;
                    }
                    goto label_334;
                }
                goto label_336;
            }
            catch(tqk tqk0) {
                goto label_138;
            }
            try {
            label_65:
                ttg1 = ttg0;
                throw new tqk(tqj.g, tqj.g.h);
            }
            catch(tqk tqk0) {
                goto label_339;
            }
            try {
            label_67:
                Long.valueOf(v).getClass();
                if(v == 0L) {
                    tqw tqw0 = new tqw(new byte[]{0, 0, 0, 0});
                    tgl1 = tqp0.g;
                    tgl1.c(tqw0);
                    tre tre1 = tgl1.y();
                    tqw tqw1 = tgl1.v();
                    tqx tqx0 = tgl1.w();
                    if((tqp0.c instanceof tfw)) {
                        tqn1 = tqp0.b;
                        tge tge1 = tqn1.a();
                        tib tib1 = trq.a;
                        if(!((trq)tge1.d(tib1)).p()) {
                            tjk.f("get TUSA", new Object[0]);
                            trm trm0 = tqp0.d.B();
                            if(trm0 == null) {
                                tjk.f("Error 1", new Object[0]);
                                trm0 = new trm(trm.d);
                            }
                            tjk.f("reset TUSA", new Object[0]);
                            trm0.f(trm.d);
                            tqp0.d.c(trm0);
                            tqn1.b.a(tqp0.d.C());
                        }
                        trl trl0 = tqp0.d.A();
                        tjk.f("resetting mcu", new Object[0]);
                        trl0.o();
                        tqp0.d.c(trl0);
                        tre1.p(true);
                        tqw1.p();
                        tgl1.c(tre1);
                        tgl1.c(tqw1);
                        tgl1.c(tqx0);
                        tqx tqx1 = tgl1.w();
                        if(tgl1.q().n() == 1) {
                            tqx1.e(1, 3, true);
                        }
                        tqx1.s();
                        tqx1.r();
                        tsh tsh0 = (tsh)tqn1.a().d(tsh.a);
                        String s = new tjp(tsh0.i().k()).toString();
                        tsx2 = tqp0.e;
                        String s1 = new tjp(tsx2.a.k()).toString();
                        String s2 = new tjp(tsh0.h().k()).toString();
                        String s3 = new tjp(tsx2.e.k()).toString();
                        if(!s.equals(s1)) {
                            tqx1.n();
                            if(s2.equals(s3)) {
                                tqx1.o();
                            }
                            else {
                                tqx1.p();
                            }
                        }
                        else if(!s2.equals(s3)) {
                            tqx1.q();
                        }
                        tgl1.c(tqx1);
                        tqw tqw2 = tgl1.v();
                        tre tre2 = tgl1.y();
                        if(((trq)tqn1.a().d(tib1)).j().n() && tre2.r()) {
                            tqw2.p();
                        }
                        tqw2.o();
                        tqw2.r();
                        tgl1.q();
                        trq1 = (trq)tqn1.a().d(tib1);
                        tgl1.w();
                        ((tqm)tqn1.a()).g();
                        trq1.j();
                        tqw3 = tgl1.v();
                        tre3 = tgl1.y();
                        tqx2 = tgl1.w();
                        tqt0 = trq1.h();
                        tqu0 = trq1.i();
                        arr_object = new Object[]{tqx2.k()};
                        goto label_140;
                    }
                    goto label_326;
                }
                goto label_328;
            }
            catch(tqk tqk0) {
            label_138:
                ttg1 = ttg0;
                goto label_339;
            }
            try {
            label_140:
                tjk.f("performCardIssuerActionCodeAnalysis - cvr {}", arr_object);
                tjk.f("performCardIssuerActionCodeAnalysis - ciacDenial {}", new Object[]{tqt0.k()});
                tjk.f("performCardIssuerActionCodeAnalysis - ciacOnline {}", new Object[]{tqu0.k()});
                boolean z = tqt0.n(tqx2);
                boolean z1 = tqu0.n(tqx2);
                if(tqx2.u() && z1) {
                    tjk.f("performCardIssuerActionCodeAnalysis - ciac analysis is ARQC but Unable to go online indicated by Terminal. Returning AAC.", new Object[0]);
                    thb0 = thb.a;
                }
                else if(z) {
                    tjk.f("performCardIssuerActionCodeAnalysis - ciac analysis is AAC.", new Object[0]);
                    thb0 = thb.a;
                }
                else {
                    tjk.f("performCardIssuerActionCodeAnalysis - ciac analysis is ARQC.", new Object[0]);
                    thb0 = thb.c;
                }
                thb thb1 = thb.a;
                if(thb0 == thb1) {
                    tjk.f("Preparing AAC", new Object[0]);
                    tgx0 = new tgx(0);
                    tqw3.n();
                    tqw3.r();
                    tre3.n();
                }
                else {
                    tjk.f("Preparing ARQC", new Object[0]);
                    tgx0 = new tgx((byte)0x80);
                    tqw3.o();
                    tqw3.r();
                }
                tgl1.c(tgx0);
                tgl1.c(tqw3);
                tgl1.c(tre3);
                thc thc0 = ((tqm)tqn1.a()).g();
                tqx tqx3 = tgl1.w();
                tqv tqv0 = trq1.j();
                tqw tqw4 = tgl1.v();
                tqz tqz0 = trq1.k();
                tqr tqr0 = ((trz)tqn1.a().d(trz.a)).h();
                tsl tsl1 = tsx2.h;
                tgl1.c(new tsr(thc0, tsl1, tqx3, tqv0, tqw4, tqz0, tqr0));
                if(thb0 != thb1) {
                    byte[] arr_b1 = tsl1.k();
                    goto label_180;
                }
                goto label_324;
            }
            catch(tqk tqk0) {
                goto label_251;
            }
            try {
            label_180:
                if(arr_b1[0] == 0xFFFFFF8E) {
                    goto label_203;
                }
                else {
                    goto label_185;
                }
                goto label_224;
            }
            catch(tqk tqk0) {
                try {
                    ttg1 = ttg0;
                }
                catch(tqk tqk0) {
                }
                goto label_339;
            }
            try {
            label_185:
                tsx tsx3 = tqp0.e;
                if(tsx3.h.k()[0] != -50) {
                    throw new tqk(tqj.e, tqj.c.h);
                }
                tqp0.a();
                tqp.b(tqp0.g, -50, new byte[][]{tsr.a, tgp.a});
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                try {
                    tsx3.c.h(byteArrayOutputStream0);
                    tqp0.g.q().h(byteArrayOutputStream0);
                    byteArrayOutputStream0.write(tqp0.g.z().k());
                    byteArrayOutputStream0.write(0x80);
                    while(byteArrayOutputStream0.size() % 8 != 0) {
                        byteArrayOutputStream0.write(0);
                    }
                    arr_b2 = byteArrayOutputStream0.toByteArray();
                    goto label_224;
                }
                catch(IOException iOException0) {
                    String s4 = iOException0.getStackTrace().toString();
                    throw new tqk(tqj.f, s4);
                }
            label_203:
                tqp0.a();
                tqp.b(tgl1, (byte)0x8E, new byte[][]{tsr.a, tgp.a});
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                try {
                    tsx2.b.h(byteArrayOutputStream1);
                    tsx2.f.h(byteArrayOutputStream1);
                    tsx2.a.h(byteArrayOutputStream1);
                    tsx2.d.h(byteArrayOutputStream1);
                    tsx2.g.h(byteArrayOutputStream1);
                    tsx2.c.h(byteArrayOutputStream1);
                    tgl1.q().h(byteArrayOutputStream1);
                    byteArrayOutputStream1.write(tgl1.z().k());
                    byteArrayOutputStream1.write(0x80);
                    while(byteArrayOutputStream1.size() % 8 != 0) {
                        byteArrayOutputStream1.write(0);
                    }
                    arr_b2 = byteArrayOutputStream1.toByteArray();
                    goto label_224;
                }
                catch(IOException iOException1) {
                }
            }
            catch(tqk tqk0) {
                goto label_251;
            }
            try {
                ttg1 = ttg0;
                String s5 = iOException1.getStackTrace().toString();
                throw new tqk(tqj.f, s5);
            }
            catch(tqk tqk0) {
                goto label_339;
            }
            try {
            label_224:
                tqn2 = tqp0.b;
                tgs0 = new tgs(tjl.a(arr_b2, ((tfo)tqn2.b).b().a.b), true);
                thj0 = ((tqm)tqn2.a()).c();
                tgu0 = tqn2.a().b();
                tsx4 = tqp0.e;
                tiq0 = tsx4.a;
                til0 = tsx4.b;
                tgz0 = new tgz(((tsi)tqn2.a().d(tsi.a)).b(tgz.a));
                tso0 = new tso(tso.d);
                arr_b3 = tso0.k();
            }
            catch(tqk tqk0) {
                goto label_251;
            }
            try {
                Arrays.fill(arr_b3, 0);
            }
            catch(tqk tqk0) {
                try {
                    ttg1 = ttg0;
                }
                catch(tqk tqk0) {
                }
                goto label_339;
            }
            try {
                tgx1 = tqp0.g.s();
                tgp0 = tqp0.g.q();
                tsr0 = tqp0.g.z();
                tim0 = tsx4.f;
                tir0 = tsx4.d;
                tis0 = tsx4.g;
                tgl2 = tqp0.g;
                tit0 = tsx4.c;
                tss0 = tqp0.f;
                ttg1 = ttg0;
                goto label_253;
            }
            catch(tqk tqk0) {
                try {
                label_251:
                    ttg1 = ttg0;
                    goto label_339;
                label_253:
                    byte[] arr_b4 = tgs0.k();
                    byte[] arr_b5 = tsx4.h.k();
                    tsl tsl2 = tsx4.h;
                    if(arr_b5[0] == 0xFFFFFF8E) {
                        arr_b6 = tjh.d(new byte[][]{tqn2.c().k(), tgl2.q().k(), arr_b4});
                    }
                    else {
                        if(tsl2.k()[0] != -50) {
                            throw new tqk(tqj.e, tqj.e.h);
                        }
                        tsv tsv0 = new tsv(tgl2.q().k(), tsx4.c.k(), arr_b4, tgl2.s().k(), tgl2.z().k());
                        arr_b6 = tjh.d(new byte[][]{tqn2.c().k(), tsv0.k()});
                    }
                    tss0.b = new tsy(tiu.a(arr_b6));
                    switch(tsl2.k()[0]) {
                        case 0xFFFFFF8E: {
                            goto label_266;
                        }
                        case -50: {
                            goto label_268;
                        }
                    }
                    throw new tqk(tqj.e, tqj.e.h);
                label_266:
                    tsq tsq0 = new tsq(tgx1, tgp0, tgs0, tsr0, tim0, tir0, tis0, tit0);
                    goto label_269;
                label_268:
                    tsq0 = new tsw(new tsv(tgp0.k(), tit0.k(), tgs0.k(), tgx1.k(), tsr0.k()));
                label_269:
                    tss0.f = new tsm(thj0, tgu0, tiq0, til0, tgz0, tso0, tsq0);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        if(tss0.h.equals("9000")) {
                            int v1 = tss0.b.l().c().length;
                            tsu tsu0 = tss0.c;
                            int v2 = v1 + tsu0.l().c().length;
                            tsp tsp0 = tss0.d;
                            int v3 = v2 + tsp0.l().c().length;
                            tsn tsn0 = tss0.e;
                            int v4 = v3 + tsn0.l().c().length + tss0.f.l().c().length;
                            tst tst0 = tss0.g;
                            int v5 = v4 + tst0.l().c().length;
                            byteArrayOutputStream2.write(tss.a);
                            String s6 = Integer.toHexString(v5);
                            s6 = s6.length() % 2 == 0 ? Integer.toHexString(v5) : "0" + s6;
                            if(v5 > 0x7F && v5 <= 0xFF) {
                                byteArrayOutputStream2.write(tjs.d("81"));
                            }
                            else if(v5 > 0xFF && v5 <= 0xFFFF) {
                                byteArrayOutputStream2.write(tjs.d("82"));
                            }
                            byteArrayOutputStream2.write(tjs.d(s6));
                            byteArrayOutputStream2.write(tss0.b.l().c());
                            byteArrayOutputStream2.write(tsu0.l().c());
                            byteArrayOutputStream2.write(tsp0.l().c());
                            byteArrayOutputStream2.write(tsn0.l().c());
                            byteArrayOutputStream2.write(tss0.f.l().c());
                            byteArrayOutputStream2.write(tst0.l().c());
                        }
                        byteArrayOutputStream2.write(tjs.d(tss0.h));
                    }
                    catch(IOException unused_ex) {
                        throw new teq(tes.c);
                    }
                    arr_b7 = byteArrayOutputStream2.toByteArray();
                }
                catch(tqk tqk0) {
                    goto label_339;
                }
            }
        }
        catch(tja tja0) {
            goto label_373;
        }
        thj thj1 = tgg0.b();
        char[] arr_c = tjs.e(thj1.c, false);
        int v6 = FIN.finallyOpen$NT();
        byte[] arr_b8 = thj1.c;
        int v7;
        for(v7 = arr_b8.length - 1; v7 >= 0 && arr_b8[v7] == -1; --v7) {
        }
        if(v7 >= 0) {
            int v8 = v7 + 1;
            int v9 = (arr_b8[v7] & 15) == 15 ? v8 + v8 - 1 : v8 + v8;
            char[] arr_c1 = new char[v9];
            System.arraycopy(arr_c, 0, arr_c1, 0, v9);
            FIN.finallyCodeBegin$NT(v6);
            String s7 = tfs.a(tgg0.b(), tql0.a, arr_b7);
            int v10 = tgg0.a.a(tgg0.a.b().a(1));
            tge tge2 = tgg0.a;
            tjk.f("<-- generateInAppTransaction", new Object[0]);
            return new tfp(arr_b7, tfl0, new String(arr_c1), v10, tge2.a(tge2.b().a(0)) + 2000, s7);
        }
        throw new IllegalArgumentException("PAN congtains only \'0xFF\' bytes.");
        try {
            try {
            label_324:
                ttg1 = ttg0;
                throw new tqk(tqj.c, tqj.c.h);
            label_326:
                ttg1 = ttg0;
                throw new tqk(tqj.g, tqj.g.h);
            label_328:
                ttg1 = ttg0;
                throw new tqk(tqj.g, tqj.g.h);
            label_330:
                ttg1 = ttg0;
                throw new tqk(tqj.g, tqj.g.h);
            label_332:
                ttg1 = ttg0;
                throw new tqk(tqj.g, tqj.g.h);
            label_334:
                ttg1 = ttg0;
                throw new tqk(tqj.g, tqj.g.h);
            label_336:
                ttg1 = ttg0;
                throw new tqk(tqj.g, tqj.g.h);
            }
            catch(tqk tqk0) {
            }
        label_339:
            ttg1.getClass();
            tjk.g("generateInAppTransaction() - error", tqk0);
            tqj tqj0 = tqk0.a;
            tqj tqj1 = tqj.a;
            if(tqj0 == tqj1) {
                tja1 = new tja(2, tqj1.h);
            }
            else {
                tqj tqj2 = tqj.b;
                if(tqj0 == tqj2) {
                    tja1 = new tja(2, tqj2.h);
                }
                else {
                    tqj tqj3 = tqj.c;
                    if(tqj0 == tqj3) {
                        tja1 = new tja(2, tqj3.h);
                    }
                    else {
                        tqj tqj4 = tqj.d;
                        if(tqj0 == tqj4) {
                            tja1 = new tja(2, tqj4.h);
                        }
                        else {
                            tqj tqj5 = tqj.e;
                            if(tqj0 == tqj5) {
                                tja1 = new tja(2, tqj5.h);
                            }
                            else {
                                tqj tqj6 = tqj.g;
                                if(tqj0 == tqj6) {
                                    tja1 = new tja(2, tqj6.h);
                                }
                                else {
                                    tqj tqj7 = tqj.f;
                                    tja1 = tqj0 == tqj7 ? new tja(2, tqj2.h) : new tja(4, tqj7.h);
                                }
                            }
                        }
                    }
                }
            }
            throw tja1;
        }
        catch(tja tja0) {
        label_373:
            int v11 = 2;
            tjk.g("generateInAppTransaction() - error", tja0);
            int v12 = tja0.a;
            switch(v12) {
                case 1: {
                    v13 = 1;
                    break;
                }
                case 2: {
                label_385:
                    v13 = v11;
                    break;
                }
                default: {
                    v11 = 4;
                    switch(v12) {
                        case 3: {
                            v13 = 3;
                            break;
                        }
                        case 4: {
                            goto label_385;
                        }
                        default: {
                            v13 = 0;
                        }
                    }
                }
            }
            throw new essd(v13, tja0.getMessage());
        }
    }

    @Override  // essj
    public final String e() {
        return "2.0.0";
    }

    private static final tql f(tfm tfm0, byte[] arr_b, JSONObject jSONObject0) {
        byte[] arr_b3;
        tql tql0;
        tjb tjb0;
        tgg tgg0;
        try {
            tgg0 = tfm0.b;
            tgg0.d = arr_b;
            tgg0.e = arr_b;
            tjb0 = tgg0.b;
            tql0 = new tql();
            byte[] arr_b1 = tfk.a(jSONObject0, "key");
            byte[] arr_b2 = tql0.b;
            if(arr_b2 != arr_b1) {
                Arrays.fill(arr_b2, 0);
            }
            tql0.b = arr_b1;
            tql0.a = tfk.a(jSONObject0, "atc");
        }
        catch(JSONException jSONException0) {
            throw tjh.b(jSONException0);
        }
        tgg0.c = new tgp(tql0.a);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream0.write(tql0.a, 0, tql0.a.length);
            tgh.b(byteArrayOutputStream0, tql0.b);
            tgh.b(byteArrayOutputStream0, new byte[0]);
            arr_b3 = byteArrayOutputStream0.toByteArray();
        }
        finally {
            tjt.a(byteArrayOutputStream0);
        }
        ((tfo)tjb0).b = arr_b3;
        return tql0;
    }
}

