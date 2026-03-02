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

public class tkd implements essj {
    static {
    }

    public static tkh a(essb essb0) {
        boolean z = essb0.b();
        essb0.c();
        essb0.d();
        return new tkh(z);
    }

    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        tuw tuw0;
        long v2;
        ttr ttr1;
        ttr ttr0;
        byte[] arr_b1;
        byte[] arr_b;
        try {
            arr_b = tjw.a(jSONObject0, "chipdata");
            if(jSONObject1 == null) {
                arr_b1 = new byte[0];
            }
            else {
                try {
                    arr_b1 = twp.d(new byte[][]{new tvl(tjw.a(jSONObject1, "qi")).m(), new tvm(tjw.a(jSONObject1, "dq")).m(), new tvn(tjw.a(jSONObject1, "dp")).m(), new tvo(tjw.a(jSONObject1, "q")).m(), new tvp(tjw.a(jSONObject1, "p")).m()});
                }
                catch(JSONException jSONException1) {
                    throw new RuntimeException(jSONException1);
                }
            }
        }
        catch(JSONException jSONException0) {
            throw twp.b(jSONException0);
        }
        twp.e(arr_b);
        twp.c(arr_b.length > 2);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        HashMap hashMap0 = new HashMap(1);
        HashSet hashSet0 = new HashSet(Arrays.asList(new tvi[]{tvd.a}));
        while(true) {
            try {
            label_15:
                if(byteArrayInputStream0.available() > 0) {
                    if(byteArrayInputStream0.available() < 2) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                    }
                    byte b = (byte)byteArrayInputStream0.read();
                    byte b1 = (byte)byteArrayInputStream0.read();
                    tvi tvi0 = new tvi(b, b1);
                    int v = tuw.l(byteArrayInputStream0);
                    if(byteArrayInputStream0.available() < v) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi data for tag " + twz.b(new byte[]{b, b1}));
                    }
                    byte[] arr_b2 = new byte[v];
                    if(byteArrayInputStream0.read(arr_b2) != v) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                    }
                    if(hashSet0.remove(tvi0)) {
                        twm.a.n(tvi0, arr_b2);
                        hashMap0.put(tvi0, arr_b2);
                    }
                    if(hashSet0.isEmpty()) {
                        break;
                    }
                    goto label_15;
                }
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            if(hashSet0.isEmpty()) {
                break;
            }
            twm.a.f("findDgiValues() - not found {}", hashSet0);
            break;
        }
        tvi tvi1 = tvd.a;
        byte[] arr_b3 = (byte[])hashMap0.get(tvi1);
        boolean z = arr_b3 != null && arr_b3.length > 0;
        if(z) {
            ttk ttk0 = new ttk(new tvd(tvi1, arr_b3).k(tut.a), tut.b);
            try {
                String s = new String(ttk0.r(), "ASCII");
                ttr[] arr_ttr = ttr.values();
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= arr_ttr.length) {
                        throw new IllegalStateException("Unsupported card type: " + s);
                    }
                    ttr0 = arr_ttr[v1];
                    if(ttr0.r.equals(s)) {
                        break;
                    }
                }
                ttr1 = ttr0;
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new RuntimeException(unsupportedEncodingException0);
            }
        }
        else {
            ttr1 = null;
        }
        if(!z) {
            throw new RuntimeException("Platform DGI not present");
        }
        tju tju0 = null;
        for(Object object0: tkc.a) {
            tju tju1 = (tju)object0;
            if(tju1.a().equals(ttr1)) {
                tju0 = tju1;
                break;
            }
        }
        if(tju0 == null) {
            throw new IllegalStateException("Unsupported card type: " + ttr1);
        }
        byte[] arr_b4 = twp.d(new byte[][]{arr_b, arr_b1});
        tno tno0 = new tno();
        ttr ttr2 = tju0.a();
        tvk tvk0 = (tvk)new tvh(new tvk[]{new tpi()}).b.get(ttr2);
        if(tvk0 == null) {
            throw new IllegalStateException("No dgi factory for platform " + ttr2);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr_b4);
        while(byteArrayInputStream1.available() > 0) {
            try {
                try {
                    v2 = System.currentTimeMillis();
                    if(byteArrayInputStream1.available() < 2) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                    }
                    byte b2 = (byte)byteArrayInputStream1.read();
                    byte b3 = (byte)byteArrayInputStream1.read();
                    tvi tvi2 = new tvi(b2, b3);
                    int v3 = tuw.l(byteArrayInputStream1);
                    if(byteArrayInputStream1.available() < v3) {
                        throw new IllegalArgumentException(a.v(twz.b(new byte[]{b2, b3}), "Parse exception, could not parse dgi data for tag "));
                    }
                    byte[] arr_b5 = new byte[v3];
                    if(v3 != 0 && byteArrayInputStream1.read(arr_b5) != v3) {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                    }
                    tuw0 = tvk0.b(tvi2, arr_b5);
                }
                catch(IOException iOException1) {
                    throw new RuntimeException(iOException1);
                }
            }
            catch(Throwable throwable0) {
                tvh.a.f("Parsing Took {}", Long.valueOf(System.currentTimeMillis() - v2));
                throw throwable0;
            }
            igmf igmf0 = tvh.a;
            igmf0.f("Parsing Took {}", Long.valueOf(System.currentTimeMillis() - v2));
            tvi tvi3 = tuw0.c;
            if(linkedHashMap0.containsKey(tvi3)) {
                igmf0.b("Merging dgi: {}", tvi3);
                byte[] arr_b6 = ((tuw)linkedHashMap0.get(tvi3)).n();
                byte[] arr_b7 = tuw0.n();
                byte[] arr_b8 = new byte[arr_b6.length + arr_b7.length];
                System.arraycopy(arr_b6, 0, arr_b8, 0, arr_b6.length);
                System.arraycopy(arr_b7, 0, arr_b8, arr_b6.length, arr_b7.length);
                linkedHashMap0.put(tvi3, tvk0.b(tvi3, arr_b8));
            }
            else {
                linkedHashMap0.put(tvi3, tuw0);
            }
        }
        tno0.b = new tnn(linkedHashMap0);
        tno0.c = new tka();
        return new tjy(tno0, tju0);
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        tnz tnz0;
        tkd.f(((tjy)esrz0), arr_b, jSONObject0);
        tto tto0 = ((tjy)esrz0).a;
        twj twj0 = tto0.c;
        essa essa0 = ((tka)twj0).a;
        try {
            ttv ttv0 = twl.a(tto0, tkd.a(essb0), ttq.a);
            essa0.a = ttv0;
            essa0.b = new tqb(twj0);
            essa0.c = arr_b;
            ttv0.f();
            tto tto1 = ((tnp)ttv0).d;
            if(tto1.f == null || tto1.f.length == 0) {
                tnz tnz1 = new tnz();
                if(!twz.b(tto1.d.r()).equals("0001")) {
                    tor tor0 = (tor)ttv0.d.b().f(tor.a);
                    tnz1.d(new ton(tor0.h().r()));
                    tnz1.d(new tom(tor0.g().r()));
                }
                tto1.e = tnz1.c().c();
                tto1.f = tnz1.c().c();
            }
            tnz0 = ((tno)tto1).a();
            ((tnp)ttv0).a = tnz0;
            tto tto2 = ttv0.d;
            ttm ttm0 = tto2.b();
            tvi tvi0 = tor.a;
            tof tof0 = new tof(((tor)ttm0.f(tvi0)).e().r());
            if(tof0.d()) {
                throw new sxp(sxr.c);
            }
            ttt ttt0 = ttv0.l;
            ttt0.d(tof0);
            ttt0.d(new tnx(tnx.a));
            ttt0.d(new tny(tny.a));
            tof tof1 = new tof(tof.a);
            tof1.e[1] = 0;
            ttt0.d(tof1);
            tof tof2 = ttt0.B();
            tnx tnx0 = ttt0.y();
            tny tny0 = ttt0.z();
            tkj tkj0 = ((tnp)ttv0).b;
            if((tkj0 instanceof tkh) && ((tkh)tkj0).a()) {
                if(!((tor)tto2.b().f(tvi0)).i()) {
                    ton ton0 = ((tnp)ttv0).c();
                    ton0.m(ton.b);
                    ((tnp)ttv0).a.d(ton0);
                    tto2.c.a(((tnp)ttv0).a.c());
                }
                tom tom0 = ((tnp)ttv0).a.a();
                tom0.b();
                ((tnp)ttv0).a.d(tom0);
                tof2.c(true);
                tnx0.c();
            }
            ttt0.d(tof2);
            ttt0.d(tnx0);
            ttt0.d(tny0);
            return essa0;
        }
        catch(tkg tkg0) {
            throw new RuntimeException(tkg0);
        }
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        int v12;
        twi twi1;
        byte[] arr_b7;
        byte[] arr_b6;
        tvz tvz0;
        tvu tvu0;
        tpq tpq0;
        ttx ttx0;
        tuf tuf1;
        ttt ttt2;
        byte[] arr_b3;
        tpn tpn0;
        tuh tuh0;
        tvt tvt0;
        tvy tvy0;
        tpw tpw4;
        tuc tuc0;
        tur tur0;
        tua tua0;
        tno tno2;
        byte[] arr_b2;
        tuj tuj0;
        tof tof3;
        tnx tnx3;
        tor tor1;
        tpw tpw2;
        tno tno1;
        ttt ttt1;
        tqf tqf1;
        long v;
        tpk tpk0;
        tnm tnm0 = tkd.f(((tjy)esrz0), arr_b, jSONObject0);
        tto tto0 = ((tjy)esrz0).a;
        tqf tqf0 = new tqf();
        tjx tjx0 = ((tka)tto0.c).a;
        try {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: essg0.h) {
                arrayList0.add(((ttn)Enum.valueOf(ttn.class, ((essf)object0).name())));
            }
            EnumSet enumSet0 = EnumSet.copyOf(arrayList0);
            tkh tkh0 = tkd.a(essb0);
            if(enumSet0 == null) {
                tpk0 = new tpk((byte)0x8E);
            }
            else if(enumSet0.contains(ttn.a)) {
                tpk0 = new tpk(-50);
            }
            else if(enumSet0.contains(ttn.b)) {
                tpk0 = new tpk((byte)0x8E);
            }
            else {
                tpk0 = new tpk(0);
            }
            tpw tpw0 = new tpw(essg0.a, essg0.b, essg0.c / 10000L, essg0.d, essg0.e, tpk0);
            tkj tkj0 = tkh0.a() ? new tki() : new tkj();
            tnq tnq0 = new tnq(((tno)tto0), tkj0, new ttt(), tpw0);
            try {
                tno tno0 = tnq0.a;
                if(tno0.f == null || tno0.f.length == 0) {
                    tnz tnz0 = new tnz();
                    if(!twz.b(tno0.d.r()).equals("0001")) {
                        tor tor0 = (tor)tno0.b().f(tor.a);
                        tnz0.d(new ton(tor0.h().r()));
                        tnz0.d(new tom(tor0.g().r()));
                    }
                    tno0.e = tnz0.c().c();
                    tno0.f = tnz0.c().c();
                }
                tnq0.c = tno0.a();
                ttm ttm0 = tno0.b();
                tvi tvi0 = tor.a;
                tof tof0 = new tof(((tor)ttm0.f(tvi0)).e().r());
                if(!tof0.d()) {
                    ttt ttt0 = tnq0.f;
                    ttt0.d(tof0);
                    tnm tnm1 = ((tka)tno0.c).b().a;
                    if(new tww(tnm1.a).a() < 0xFFFF) {
                        ttt0.d(new ttx(tnm1.a));
                        tnq0.a();
                        ttt0.d(new tny(tny.a));
                        if(((tor)tno0.b().f(tvi0)).c().a()) {
                            tpw tpw1 = tnq0.d;
                            switch(tpw1.h.r()[0]) {
                                case 0xFFFFFF8E: 
                                case -50: {
                                    if(!tpw1.b.b()) {
                                        try {
                                            Long.parseLong(twz.b(tpw1.b.r()));
                                            v = Long.parseLong(twz.b(tpw1.f.r()));
                                            goto label_61;
                                        }
                                        catch(NumberFormatException unused_ex) {
                                        }
                                        goto label_59;
                                    }
                                    goto label_304;
                                }
                                default: {
                                    throw new tnl(tnk.e, tnk.g.h);
                                }
                            }
                        }
                        goto label_306;
                    }
                    goto label_308;
                }
                goto label_310;
            }
            catch(tnl tnl0) {
                goto label_160;
            }
            try {
            label_59:
                tqf1 = tqf0;
                throw new tnl(tnk.g, tnk.g.h);
            }
            catch(tnl tnl0) {
                goto label_313;
            }
            try {
            label_61:
                Long.valueOf(v).getClass();
                if(v == 0L) {
                    tnx tnx0 = new tnx(new byte[]{0, 0, 0, 0});
                    ttt1 = tnq0.f;
                    ttt1.d(tnx0);
                    tof tof1 = ttt1.B();
                    tnx tnx1 = ttt1.y();
                    tny tny0 = ttt1.z();
                    if((tnq0.b instanceof tki)) {
                        tno1 = tnq0.a;
                        ttm ttm1 = tno1.b();
                        tvi tvi1 = tor.a;
                        if(!((tor)ttm1.f(tvi1)).i()) {
                            ton ton0 = tnq0.c.b();
                            if(ton0 == null) {
                                ton0 = new ton(ton.b);
                            }
                            ton0.m(ton.b);
                            tnq0.c.d(ton0);
                            tno1.c.a(tnq0.c.c());
                        }
                        tom tom0 = tnq0.c.a();
                        tom0.b();
                        tnq0.c.d(tom0);
                        tof1.c(true);
                        tnx1.c();
                        ttt1.d(tof1);
                        ttt1.d(tnx1);
                        ttt1.d(tny0);
                        tny tny1 = ttt1.z();
                        if(ttt1.t().b() == 1) {
                            tny1.l(1, 3, true);
                        }
                        tny1.f();
                        tny1.e();
                        tpg tpg0 = (tpg)tno1.b().f(tpg.a);
                        String s = new tww(tpg0.a().r()).toString();
                        tpw2 = tnq0.d;
                        String s1 = new tww(tpw2.a.r()).toString();
                        String s2 = new tww(tpg0.b().r()).toString();
                        String s3 = new tww(tpw2.e.r()).toString();
                        if(!s.equals(s1)) {
                            tny1.a();
                            if(s2.equals(s3)) {
                                tny1.b();
                            }
                            else {
                                tny1.c();
                            }
                        }
                        else if(!s2.equals(s3)) {
                            tny1.d();
                        }
                        ttt1.d(tny1);
                        tnx tnx2 = ttt1.y();
                        tof tof2 = ttt1.B();
                        if(((tor)tno1.b().f(tvi1)).c().a() && tof2.e()) {
                            tnx2.c();
                        }
                        tnx2.b();
                        tnx2.e();
                        ttt1.t();
                        tor1 = (tor)tno1.b().f(tvi1);
                        ttt1.z();
                        ((tnn)tno1.b()).a();
                        tor1.c();
                        tnx3 = ttt1.y();
                        tof3 = ttt1.B();
                        tny tny2 = ttt1.z();
                        tnu tnu0 = tor1.a();
                        tnv tnv0 = tor1.b();
                        tny2.r();
                        tnu0.r();
                        tnv0.r();
                        boolean z = tnu0.a(tny2);
                        boolean z1 = tnv0.a(tny2);
                        if(tny2.h() && z1) {
                            tuj0 = tuj.a;
                        }
                        else {
                            tuj0 = z ? tuj.a : tuj.c;
                        }
                        tuj tuj1 = tuj.a;
                        if(tuj0 == tuj1) {
                            goto label_136;
                        }
                        else {
                            goto label_141;
                        }
                        goto label_144;
                    }
                    goto label_300;
                }
                goto label_302;
            }
            catch(tnl tnl0) {
                goto label_160;
            }
            try {
            label_136:
                tuf tuf0 = new tuf(0);
                tnx3.a();
                tnx3.e();
                tof3.a();
                goto label_144;
            label_141:
                tuf0 = new tuf((byte)0x80);
                tnx3.b();
                tnx3.e();
            label_144:
                ttt1.d(tuf0);
                ttt1.d(tnx3);
                ttt1.d(tof3);
                tuk tuk0 = ((tnn)tno1.b()).a();
                tny tny3 = ttt1.z();
                tnw tnw0 = tor1.c();
                tnx tnx4 = ttt1.y();
                toa toa0 = tor1.d();
                tns tns0 = ((toy)tno1.b().f(toy.a)).a();
                tpk tpk1 = tpw2.h;
                ttt1.d(new tpq(tuk0, tpk1, tny3, tnw0, tnx4, toa0, tns0));
                if(tuj0 != tuj1) {
                    byte[] arr_b1 = tpk1.r();
                    goto label_157;
                }
                goto label_298;
            }
            catch(tnl tnl0) {
                goto label_225;
            }
            try {
            label_157:
                if(arr_b1[0] == 0xFFFFFF8E) {
                    goto label_180;
                }
                else {
                    goto label_162;
                }
                goto label_201;
            }
            catch(tnl tnl0) {
            label_160:
                tqf1 = tqf0;
                goto label_313;
            }
            try {
            label_162:
                tpw tpw3 = tnq0.d;
                if(tpw3.h.r()[0] != -50) {
                    throw new tnl(tnk.e, tnk.c.h);
                }
                tnq0.a();
                tnq.b(tnq0.f, -50, new byte[][]{tpq.b, ttx.a});
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                try {
                    tpw3.c.o(byteArrayOutputStream0);
                    tnq0.f.t().o(byteArrayOutputStream0);
                    byteArrayOutputStream0.write(tnq0.f.C().r());
                    byteArrayOutputStream0.write(0x80);
                    while(byteArrayOutputStream0.size() % 8 != 0) {
                        byteArrayOutputStream0.write(0);
                    }
                    arr_b2 = byteArrayOutputStream0.toByteArray();
                    goto label_201;
                }
                catch(IOException iOException0) {
                    String s4 = iOException0.getStackTrace().toString();
                    throw new tnl(tnk.f, s4);
                }
            label_180:
                tnq0.a();
                tnq.b(ttt1, (byte)0x8E, new byte[][]{tpq.b, ttx.a});
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                try {
                    tpw2.b.o(byteArrayOutputStream1);
                    tpw2.f.o(byteArrayOutputStream1);
                    tpw2.a.o(byteArrayOutputStream1);
                    tpw2.d.o(byteArrayOutputStream1);
                    tpw2.g.o(byteArrayOutputStream1);
                    tpw2.c.o(byteArrayOutputStream1);
                    ttt1.t().o(byteArrayOutputStream1);
                    byteArrayOutputStream1.write(ttt1.C().r());
                    byteArrayOutputStream1.write(0x80);
                    while(byteArrayOutputStream1.size() % 8 != 0) {
                        byteArrayOutputStream1.write(0);
                    }
                    arr_b2 = byteArrayOutputStream1.toByteArray();
                    goto label_201;
                }
                catch(IOException iOException1) {
                }
            }
            catch(tnl tnl0) {
                goto label_225;
            }
            try {
                tqf1 = tqf0;
                String s5 = iOException1.getStackTrace().toString();
                throw new tnl(tnk.f, s5);
            }
            catch(tnl tnl0) {
                goto label_313;
            }
            try {
            label_201:
                tno2 = tnq0.a;
                tua0 = new tua(tws.a(arr_b2, ((tka)tno2.c).b().a.b), true);
                tur0 = ((tnn)tno2.b()).b();
                tuc0 = tno2.b().e();
                tpw4 = tnq0.d;
                tvy0 = tpw4.a;
                tvt0 = tpw4.b;
                tuh0 = new tuh(((tph)tno2.b().f(tph.a)).k(tuh.a));
                tpn0 = new tpn(tpn.b);
                arr_b3 = tpn0.r();
            }
            catch(tnl tnl0) {
                goto label_225;
            }
            try {
                Arrays.fill(arr_b3, 0);
            }
            catch(tnl tnl0) {
                try {
                    tqf1 = tqf0;
                }
                catch(tnl tnl0) {
                }
                goto label_313;
            }
            try {
                ttt2 = tnq0.f;
                tuf1 = ttt2.v();
                ttx0 = ttt2.t();
                tpq0 = ttt2.C();
                tvu0 = tpw4.f;
                tvz0 = tpw4.d;
                tqf1 = tqf0;
                goto label_227;
            }
            catch(tnl tnl0) {
                try {
                label_225:
                    tqf1 = tqf0;
                    goto label_313;
                label_227:
                    twa twa0 = tpw4.g;
                    tpr tpr0 = tnq0.e;
                    twb twb0 = tpw4.c;
                    byte[] arr_b4 = tua0.r();
                    byte[] arr_b5 = tpw4.h.r();
                    tpk tpk2 = tpw4.h;
                    if(arr_b5[0] == 0xFFFFFF8E) {
                        arr_b6 = twp.d(new byte[][]{tno2.d().r(), ttt2.t().r(), arr_b4});
                    }
                    else {
                        if(tpk2.r()[0] != -50) {
                            throw new tnl(tnk.e, tnk.e.h);
                        }
                        tpu tpu0 = new tpu(ttt2.t().r(), tpw4.c.r(), arr_b4, ttt2.v().r(), ttt2.C().r());
                        arr_b6 = twp.d(new byte[][]{tno2.d().r(), tpu0.r()});
                    }
                    tpr0.b = new tpx(twc.a(arr_b6));
                    switch(tpk2.r()[0]) {
                        case 0xFFFFFF8E: {
                            goto label_243;
                        }
                        case -50: {
                            goto label_245;
                        }
                    }
                    throw new tnl(tnk.e, tnk.e.h);
                label_243:
                    tpp tpp0 = new tpp(tuf1, ttx0, tua0, tpq0, tvu0, tvz0, twa0, twb0);
                    goto label_246;
                label_245:
                    tpp0 = new tpv(new tpu(ttx0.r(), twb0.r(), tua0.r(), tuf1.r(), tpq0.r()));
                label_246:
                    tpr0.f = new tpl(tur0, tuc0, tvy0, tvt0, tuh0, tpn0, tpp0);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        if(tpr0.h.equals("9000")) {
                            int v1 = tpr0.b.s().c().length;
                            tpt tpt0 = tpr0.c;
                            int v2 = v1 + tpt0.s().c().length;
                            tpo tpo0 = tpr0.d;
                            int v3 = v2 + tpo0.s().c().length;
                            tpm tpm0 = tpr0.e;
                            int v4 = v3 + tpm0.s().c().length + tpr0.f.s().c().length;
                            tps tps0 = tpr0.g;
                            int v5 = v4 + tps0.s().c().length;
                            byteArrayOutputStream2.write(tpr.a);
                            String s6 = Integer.toHexString(v5);
                            s6 = s6.length() % 2 == 0 ? Integer.toHexString(v5) : "0" + s6;
                            if(v5 > 0x7F && v5 <= 0xFF) {
                                byteArrayOutputStream2.write(twz.e("81"));
                            }
                            else if(v5 > 0xFF && v5 <= 0xFFFF) {
                                byteArrayOutputStream2.write(twz.e("82"));
                            }
                            byteArrayOutputStream2.write(twz.e(s6));
                            byteArrayOutputStream2.write(tpr0.b.s().c());
                            byteArrayOutputStream2.write(tpt0.s().c());
                            byteArrayOutputStream2.write(tpo0.s().c());
                            byteArrayOutputStream2.write(tpm0.s().c());
                            byteArrayOutputStream2.write(tpr0.f.s().c());
                            byteArrayOutputStream2.write(tps0.s().c());
                        }
                        byteArrayOutputStream2.write(twz.e(tpr0.h));
                    }
                    catch(IOException unused_ex) {
                        throw new sxp(sxr.c);
                    }
                    arr_b7 = byteArrayOutputStream2.toByteArray();
                }
                catch(tnl tnl0) {
                    goto label_313;
                }
            }
        }
        catch(twi twi0) {
            goto label_346;
        }
        tur tur1 = tto0.c();
        char[] arr_c = twz.f(tur1.e, false);
        int v6 = FIN.finallyOpen$NT();
        byte[] arr_b8 = tur1.e;
        int v7;
        for(v7 = arr_b8.length - 1; v7 >= 0 && arr_b8[v7] == -1; --v7) {
        }
        if(v7 >= 0) {
            int v8 = v7 + 1;
            int v9 = (arr_b8[v7] & 15) == 15 ? v8 + v8 - 1 : v8 + v8;
            char[] arr_c1 = new char[v9];
            System.arraycopy(arr_c, 0, arr_c1, 0, v9);
            FIN.finallyCodeBegin$NT(v6);
            String s7 = tke.a(tto0.c(), tnm0.a, arr_b7);
            return new tkb(arr_b7, tjx0, new String(arr_c1), tto0.b.d(tto0.b.e().i(1)), tto0.b.d(tto0.b.e().i(0)) + 2000, s7);
        }
        throw new IllegalArgumentException("PAN congtains only \'0xFF\' bytes.");
        try {
            try {
            label_298:
                tqf1 = tqf0;
                throw new tnl(tnk.c, tnk.c.h);
            label_300:
                tqf1 = tqf0;
                throw new tnl(tnk.g, tnk.g.h);
            label_302:
                tqf1 = tqf0;
                throw new tnl(tnk.g, tnk.g.h);
            label_304:
                tqf1 = tqf0;
                throw new tnl(tnk.g, tnk.g.h);
            label_306:
                tqf1 = tqf0;
                throw new tnl(tnk.g, tnk.g.h);
            label_308:
                tqf1 = tqf0;
                throw new tnl(tnk.g, tnk.g.h);
            label_310:
                tqf1 = tqf0;
                throw new tnl(tnk.g, tnk.g.h);
            }
            catch(tnl tnl0) {
            }
        label_313:
            tqf1.getClass();
            tnk tnk0 = tnl0.a;
            tnk tnk1 = tnk.a;
            if(tnk0 == tnk1) {
                twi1 = new twi(2, tnk1.h);
            }
            else {
                tnk tnk2 = tnk.b;
                if(tnk0 == tnk2) {
                    twi1 = new twi(2, tnk2.h);
                }
                else {
                    tnk tnk3 = tnk.c;
                    if(tnk0 == tnk3) {
                        twi1 = new twi(2, tnk3.h);
                    }
                    else {
                        tnk tnk4 = tnk.d;
                        if(tnk0 == tnk4) {
                            twi1 = new twi(2, tnk4.h);
                        }
                        else {
                            tnk tnk5 = tnk.e;
                            if(tnk0 == tnk5) {
                                twi1 = new twi(2, tnk5.h);
                            }
                            else {
                                tnk tnk6 = tnk.g;
                                if(tnk0 == tnk6) {
                                    twi1 = new twi(2, tnk6.h);
                                }
                                else {
                                    tnk tnk7 = tnk.f;
                                    twi1 = tnk0 == tnk7 ? new twi(2, tnk2.h) : new twi(4, tnk7.h);
                                }
                            }
                        }
                    }
                }
            }
            throw twi1;
        }
        catch(twi twi0) {
        label_346:
            int v10 = 2;
            int v11 = twi0.a;
            switch(v11) {
                case 1: {
                    v12 = 1;
                    break;
                }
                case 2: {
                label_357:
                    v12 = v10;
                    break;
                }
                default: {
                    v10 = 4;
                    switch(v11) {
                        case 3: {
                            v12 = 3;
                            break;
                        }
                        case 4: {
                            goto label_357;
                        }
                        default: {
                            v12 = 0;
                        }
                    }
                }
            }
            throw new essd(v12, twi0.getMessage());
        }
    }

    @Override  // essj
    public final String e() {
        return "unknown";
    }

    private static final tnm f(tjy tjy0, byte[] arr_b, JSONObject jSONObject0) {
        byte[] arr_b3;
        tnm tnm0;
        twj twj0;
        tto tto0;
        try {
            tto0 = tjy0.a;
            tto0.e = arr_b;
            tto0.f = arr_b;
            twj0 = tto0.c;
            tnm0 = new tnm();
            byte[] arr_b1 = tjw.a(jSONObject0, "key");
            byte[] arr_b2 = tnm0.b;
            if(arr_b2 != arr_b1) {
                Arrays.fill(arr_b2, 0);
            }
            tnm0.b = arr_b1;
            tnm0.a = tjw.a(jSONObject0, "atc");
        }
        catch(JSONException jSONException0) {
            throw twp.b(jSONException0);
        }
        tto0.d = new ttx(tnm0.a);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream0.write(tnm0.a, 0, tnm0.a.length);
            ttp.b(byteArrayOutputStream0, tnm0.b);
            ttp.b(byteArrayOutputStream0, new byte[0]);
            arr_b3 = byteArrayOutputStream0.toByteArray();
        }
        finally {
            txa.a(byteArrayOutputStream0);
        }
        ((tka)twj0).b = arr_b3;
        return tnm0;
    }
}

