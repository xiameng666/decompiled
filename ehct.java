import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ehct {
    public static final int a;
    private static final efui b;
    private static final ggeo c;
    private static final Map d;
    private static final ggeo e;
    private static final Map f;
    private static final ggeo g;
    private static final Map h;
    private static final ggeo i;
    private static final Map j;

    static {
        ehct.b = efui.a;
        Integer integer0 = (int)1;
        Integer integer1 = (int)2;
        ggeo ggeo0 = ggeo.m("male", integer0, "female", integer1);
        ehct.c = ggeo0;
        ehct.d = efui.m(ggeo0);
        Byte byte0 = (byte)2;
        Byte byte1 = (byte)3;
        Integer integer2 = (int)3;
        Byte byte2 = (byte)-1;
        Integer integer3 = (int)4;
        Byte byte3 = (byte)1;
        ggeo ggeo1 = ggeo.o(byte3, integer0, byte0, integer1, byte1, integer2, byte2, integer3);
        ehct.e = ggeo1;
        ehct.f = efui.m(ggeo1);
        Integer integer4 = (int)5;
        ggeo ggeo2 = ggeo.p(byte3, integer0, byte0, integer1, byte1, integer2, Byte.valueOf(((byte)4)), integer3, byte2, integer4);
        ehct.g = ggeo2;
        ehct.h = efui.m(ggeo2);
        ggeo ggeo3 = ggeo.p("user", integer3, "keyword", integer2, "home", integer1, "work", integer0, "other", integer4);
        ehct.i = ggeo3;
        ehct.j = efui.m(ggeo3);
    }

    public static gdmq a(egzv egzv0, boolean z) {
        List list26;
        ArrayList arrayList6;
        Iterator iterator3;
        String s4;
        ArrayList arrayList5;
        ArrayList arrayList1;
        String s = egzv0.a;
        String s1 = ehig.a(s);
        String s2 = egzv0.b;
        gdmp gdmp0 = (gdmp)((ProtoLiteMessage)gdmq.a).v_newBuilder();
        if(s1 != null) {
            if(!gdmp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gdmp0).ensureMutable();
            }
            gdmq gdmq0 = (gdmq)gdmp0.b_message;
            gdmq0.b |= 1;
            gdmq0.c = s1;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdni.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdni)hftv0).c = 2;
        ((gdni)hftv0).b |= 2;
        if(s2 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdni gdni0 = (gdni)hftp0.b_message;
            gdni0.b |= 0x40;
            gdni0.h = s2;
        }
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdni gdni1 = (gdni)hftp0.b_message;
            gdni1.b |= 4;
            gdni1.d = s;
        }
        Long long0 = egzv0.e;
        if(long0 != null) {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdni gdni2 = (gdni)hftp0.b_message;
            gdni2.b |= 16;
            gdni2.f = v;
        }
        gdni gdni3 = (gdni)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gdmx.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gdmb.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gdmb gdmb0 = (gdmb)hftp2.b_message;
        gdni3.getClass();
        gdmb0.b();
        gdmb0.b.add(gdni3);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gdmx gdmx0 = (gdmx)hftp1.b_message;
        gdmb gdmb1 = (gdmb)hftp2.N_build();
        gdmb1.getClass();
        gdmx0.f = gdmb1;
        gdmx0.b |= 0x20;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gdmx)hftp1.b_message).c = 2;
        ((gdmx)hftp1.b_message).b |= 1;
        if(!TextUtils.isEmpty(s)) {
            long v1 = Long.parseLong(s, 16);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gdmx gdmx1 = (gdmx)hftp1.b_message;
            hfui hfui0 = gdmx1.d;
            if(!hfui0.c()) {
                gdmx1.d = ProtoLiteMessage.D(hfui0);
            }
            gdmx1.d.g(v1);
        }
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq1 = (gdmq)gdmp0.b_message;
        gdmx gdmx2 = (gdmx)hftp1.N_build();
        gdmx2.getClass();
        gdmq1.d = gdmx2;
        gdmq1.b |= 2;
        if(egzv0.O.isEmpty()) {
            return (gdmq)((ProtoLiteBuilder)gdmp0).N_build();
        }
        List list0 = ehct.e(egzv0.G, s);
        List list1 = ehct.d(egzv0.K, s);
        eftp eftp0 = ehct.b.b(gdle.class, z);
        List list2 = efui.h(ehjs.e(egzv0.n), s, eftp0);
        List list3 = ehct.d(egzv0.o, s);
        List list4 = egzv0.p;
        ArrayList arrayList0 = new ArrayList();
        if(list4 != null && !list4.isEmpty()) {
            ContentValues contentValues0 = (ContentValues)list4.get(0);
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gdlg.a).v_newBuilder();
            gdmt gdmt0 = efui.d(s);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gdlg gdlg0 = (gdlg)hftp3.b_message;
            gdmt0.getClass();
            gdlg0.c = gdmt0;
            gdlg0.b |= 1;
            try {
                byte[] arr_b = Base64.decode(contentValues0.getAsString("x_calling_card_data"), 0);
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hilf.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gdlg gdlg1 = (gdlg)hftp3.b_message;
                ((hilf)hftv1).getClass();
                gdlg1.d = (hilf)hftv1;
                gdlg1.b |= 2;
                arrayList0.add(((gdlg)hftp3.N_build()));
            }
            catch(hfur hfur0) {
                egig.c("FSA2_PeopleToProtoUtil", "Failed to convert Calling Card metadata data item", hfur0);
            }
        }
        List list5 = egzv0.t;
        if(ehjs.i(list5)) {
            arrayList1 = new ArrayList();
        }
        else {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: list5) {
                jSONObject0.put(((ContentValues)object0).getAsString("data1"), ((ContentValues)object0).getAsString("data2"));
            }
            String s3 = jSONObject0.toString();
            if(TextUtils.isEmpty(s3)) {
                throw new JSONException("Failed to convert JSON object: " + s3);
            }
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gdlh.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp4.b_message;
            ((gdlh)hftv2).b |= 8;
            ((gdlh)hftv2).f = "gdataExtendedProperty";
            if(!hftv2.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp4.b_message;
            ((gdlh)hftv3).b |= 2;
            ((gdlh)hftv3).d = "android";
            if(!hftv3.isImmutable()) {
                hftp4.ensureMutable();
            }
            gdlh gdlh0 = (gdlh)hftp4.b_message;
            s3.getClass();
            gdlh0.b |= 4;
            gdlh0.e = s3;
            gdmt gdmt1 = efui.d(s);
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gdlh gdlh1 = (gdlh)hftp4.b_message;
            gdmt1.getClass();
            gdlh1.c = gdmt1;
            gdlh1.b |= 1;
            arrayList1 = new ArrayList(gged_interceptors.l(((gdlh)hftp4.N_build())));
        }
        List list6 = ehct.d(egzv0.r, s);
        efui efui0 = ehct.b;
        eftp eftp1 = efui0.b(gdlu.class, z);
        List list7 = efui.h(egzv0.s, s, eftp1);
        List list8 = ehct.d(egzv0.u, s);
        List list9 = ehct.e(egzv0.v, s);
        ArrayList arrayList2 = new ArrayList();
        List list10 = ehct.d(egzv0.A, s);
        List list11 = ehct.d(egzv0.y, s);
        List list12 = ehct.d(egzv0.C, s);
        List list13 = efui0.j(egzv0.w, s);
        List list14 = egzv0.x;
        if(!ehjs.i(list14)) {
            list13.addAll(efui0.j(list14, s));
        }
        List list15 = ehct.e(egzv0.E, s);
        List list16 = ehct.d(egzv0.F, s);
        ArrayList arrayList3 = new ArrayList();
        List list17 = ehct.d(egzv0.H, s);
        ArrayList arrayList4 = new ArrayList();
        List list18 = ehct.d(egzv0.I, s);
        List list19 = ehct.d(egzv0.J, s);
        List list20 = ehct.d(egzv0.L, s);
        List list21 = ehct.d(egzv0.M, s);
        List list22 = ehct.d(egzv0.q, s);
        List list23 = ehct.d(egzv0.N, s);
        List list24 = egzv0.B;
        List list25 = egzv0.D;
        gdmt gdmt2 = efui.d(s);
        if(!ehjs.i(list24)) {
            Iterator iterator1 = list24.iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                Integer integer0 = ((ContentValues)object1).getAsInteger("data2");
                if(integer0 == null) {
                    arrayList5 = arrayList1;
                    s4 = null;
                }
                else {
                    arrayList5 = arrayList1;
                    s4 = (String)ehct.j.get(integer0);
                }
                String s5 = ((ContentValues)object1).getAsString("data1");
                if(s4 == null) {
                    s4 = "other";
                }
                ehct.f(s4, s5, gdmt2, arrayList4);
                list23 = list23;
                iterator1 = iterator1;
                arrayList1 = arrayList5;
            }
        }
        if(!ehjs.i(list25)) {
            boolean z1 = false;
            Iterator iterator2 = list25.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                Integer integer1 = ((ContentValues)object2).getAsInteger("data3");
                if(integer1 != null && arrayList2.isEmpty()) {
                    iterator3 = iterator2;
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gdma.a).v_newBuilder();
                    arrayList6 = arrayList0;
                    String s6 = (String)ehct.d.get(integer1);
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp5.b_message;
                    s6.getClass();
                    list26 = list3;
                    ((gdma)hftv4).b |= 2;
                    ((gdma)hftv4).d = s6;
                    if(!hftv4.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gdma gdma0 = (gdma)hftp5.b_message;
                    gdmt2.getClass();
                    gdma0.c = gdmt2;
                    gdma0.b |= 1;
                    arrayList2.add(((gdma)hftp5.N_build()));
                }
                else {
                    iterator3 = iterator2;
                    list26 = list3;
                    arrayList6 = arrayList0;
                }
                String s7 = ((ContentValues)object2).getAsString("data4");
                String s8 = ((ContentValues)object2).getAsString("data5");
                String s9 = ((ContentValues)object2).getAsString("data10");
                if(!z1 && !ehjs.g(new String[]{s7, s8, s9})) {
                    ehct.g(5, s7, gdmt2, list16);
                    ehct.g(3, s8, gdmt2, list16);
                    ehct.g(4, s9, gdmt2, list16);
                    z1 = true;
                }
                String s10 = ((ContentValues)object2).getAsString("data7");
                if(s10 != null) {
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gdmk.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp6.b_message;
                    ((gdmk)hftv5).b |= 2;
                    ((gdmk)hftv5).d = s10;
                    if(!hftv5.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gdmk gdmk0 = (gdmk)hftp6.b_message;
                    gdmt2.getClass();
                    gdmk0.c = gdmt2;
                    gdmk0.b |= 1;
                    arrayList3.add(((gdmk)hftp6.N_build()));
                }
                String s11 = ((ContentValues)object2).getAsString("data1");
                if(s11 != null) {
                    ehct.f("billinginformation", s11, gdmt2, arrayList4);
                }
                String s12 = ((ContentValues)object2).getAsString("data2");
                if(s12 != null) {
                    ehct.f("directoryserver", s12, gdmt2, arrayList4);
                }
                String s13 = ((ContentValues)object2).getAsString("data6");
                if(s13 != null) {
                    ehct.f("mileage", s13, gdmt2, arrayList4);
                }
                String s14 = ((ContentValues)object2).getAsString("data11");
                if(s14 != null) {
                    ehct.f("subject", s14, gdmt2, arrayList4);
                }
                Integer integer2 = ((ContentValues)object2).getAsInteger("data8");
                if(integer2 != null) {
                    Byte byte0 = (Byte)ehct.f.get(integer2);
                    if(byte0 == null) {
                        byte0 = (byte)-1;
                    }
                    ehct.f("priority", byte0, gdmt2, arrayList4);
                }
                Integer integer3 = ((ContentValues)object2).getAsInteger("data9");
                if(integer3 != null) {
                    Byte byte1 = (Byte)ehct.h.get(integer3);
                    if(byte1 == null) {
                        byte1 = (byte)-1;
                    }
                    ehct.f("sensitivity", byte1, gdmt2, arrayList4);
                }
                iterator2 = iterator3;
                arrayList0 = arrayList6;
                list3 = list26;
            }
        }
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq2 = (gdmq)gdmp0.b_message;
        hfuo hfuo0 = gdmq2.m;
        if(!hfuo0.c()) {
            gdmq2.m = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gdmq2.m);
        gdmp0.a(list1);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq3 = (gdmq)gdmp0.b_message;
        hfuo hfuo1 = gdmq3.l;
        if(!hfuo1.c()) {
            gdmq3.l = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(list2, gdmq3.l);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq4 = (gdmq)gdmp0.b_message;
        hfuo hfuo2 = gdmq4.B;
        if(!hfuo2.c()) {
            gdmq4.B = ProtoLiteMessage.E(hfuo2);
        }
        hfrj.E(list3, gdmq4.B);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq5 = (gdmq)gdmp0.b_message;
        hfuo hfuo3 = gdmq5.G;
        if(!hfuo3.c()) {
            gdmq5.G = ProtoLiteMessage.E(hfuo3);
        }
        hfrj.E(arrayList0, gdmq5.G);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq6 = (gdmq)gdmp0.b_message;
        hfuo hfuo4 = gdmq6.o;
        if(!hfuo4.c()) {
            gdmq6.o = ProtoLiteMessage.E(hfuo4);
        }
        hfrj.E(arrayList1, gdmq6.o);
        gdmp0.l(list6);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq7 = (gdmq)gdmp0.b_message;
        hfuo hfuo5 = gdmq7.C;
        if(!hfuo5.c()) {
            gdmq7.C = ProtoLiteMessage.E(hfuo5);
        }
        hfrj.E(list7, gdmq7.C);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq8 = (gdmq)gdmp0.b_message;
        hfuo hfuo6 = gdmq8.q;
        if(!hfuo6.c()) {
            gdmq8.q = ProtoLiteMessage.E(hfuo6);
        }
        hfrj.E(list8, gdmq8.q);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq9 = (gdmq)gdmp0.b_message;
        hfuo hfuo7 = gdmq9.r;
        if(!hfuo7.c()) {
            gdmq9.r = ProtoLiteMessage.E(hfuo7);
        }
        hfrj.E(list9, gdmq9.r);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq10 = (gdmq)gdmp0.b_message;
        hfuo hfuo8 = gdmq10.j;
        if(!hfuo8.c()) {
            gdmq10.j = ProtoLiteMessage.E(hfuo8);
        }
        hfrj.E(arrayList2, gdmq10.j);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq11 = (gdmq)gdmp0.b_message;
        hfuo hfuo9 = gdmq11.s;
        if(!hfuo9.c()) {
            gdmq11.s = ProtoLiteMessage.E(hfuo9);
        }
        hfrj.E(list10, gdmq11.s);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq12 = (gdmq)gdmp0.b_message;
        hfuo hfuo10 = gdmq12.t;
        if(!hfuo10.c()) {
            gdmq12.t = ProtoLiteMessage.E(hfuo10);
        }
        hfrj.E(list11, gdmq12.t);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq13 = (gdmq)gdmp0.b_message;
        hfuo hfuo11 = gdmq13.u;
        if(!hfuo11.c()) {
            gdmq13.u = ProtoLiteMessage.E(hfuo11);
        }
        hfrj.E(list12, gdmq13.u);
        gdmp0.k(list13);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq14 = (gdmq)gdmp0.b_message;
        gdmq14.b();
        hfrj.E(list15, gdmq14.f);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq15 = (gdmq)gdmp0.b_message;
        gdmq15.c();
        hfrj.E(list16, gdmq15.v);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq16 = (gdmq)gdmp0.b_message;
        hfuo hfuo12 = gdmq16.w;
        if(!hfuo12.c()) {
            gdmq16.w = ProtoLiteMessage.E(hfuo12);
        }
        hfrj.E(arrayList3, gdmq16.w);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq17 = (gdmq)gdmp0.b_message;
        hfuo hfuo13 = gdmq17.x;
        if(!hfuo13.c()) {
            gdmq17.x = ProtoLiteMessage.E(hfuo13);
        }
        hfrj.E(list17, gdmq17.x);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq18 = (gdmq)gdmp0.b_message;
        hfuo hfuo14 = gdmq18.F;
        if(!hfuo14.c()) {
            gdmq18.F = ProtoLiteMessage.E(hfuo14);
        }
        hfrj.E(arrayList4, gdmq18.F);
        gdmp0.m(list18);
        egiv.R();
        boolean z2 = hwzc.a.c().ak();
        Boolean.valueOf(z2).getClass();
        List list27 = z2 ? new ArrayList() : list19;
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq19 = (gdmq)gdmp0.b_message;
        hfuo hfuo15 = gdmq19.g;
        if(!hfuo15.c()) {
            gdmq19.g = ProtoLiteMessage.E(hfuo15);
        }
        hfrj.E(list27, gdmq19.g);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq20 = (gdmq)gdmp0.b_message;
        hfuo hfuo16 = gdmq20.z;
        if(!hfuo16.c()) {
            gdmq20.z = ProtoLiteMessage.E(hfuo16);
        }
        hfrj.E(list20, gdmq20.z);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq21 = (gdmq)gdmp0.b_message;
        hfuo hfuo17 = gdmq21.D;
        if(!hfuo17.c()) {
            gdmq21.D = ProtoLiteMessage.E(hfuo17);
        }
        hfrj.E(list21, gdmq21.D);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq22 = (gdmq)gdmp0.b_message;
        hfuo hfuo18 = gdmq22.E;
        if(!hfuo18.c()) {
            gdmq22.E = ProtoLiteMessage.E(hfuo18);
        }
        hfrj.E(list22, gdmq22.E);
        if(!gdmp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gdmp0).ensureMutable();
        }
        gdmq gdmq23 = (gdmq)gdmp0.b_message;
        hfuo hfuo19 = gdmq23.A;
        if(!hfuo19.c()) {
            gdmq23.A = ProtoLiteMessage.E(hfuo19);
        }
        hfrj.E(list23, gdmq23.A);
        return (gdmq)((ProtoLiteBuilder)gdmp0).N_build();
    }

    public static gdmq b(egzv egzv0, List list0, boolean z) {
        gdmq gdmq0 = ehct.a(egzv0, z);
        if(gdmq0 == null) {
            return null;
        }
        hfuo hfuo0 = gdmq0.p;
        ArrayList arrayList0 = new ArrayList(hfuo0.size());
        for(Object object0: hfuo0) {
            gdlj gdlj0 = (gdlj)object0;
            String s = gdlj0.f;
            if(list0 == null || !list0.contains(s)) {
                goto label_11;
            }
            continue;
            try {
            label_11:
                Long.parseLong(s, 16);
            }
            catch(NumberFormatException unused_ex) {
                egig.m("FSA2_GroupSourceIdValidator", "Unable to parse groupSourceId, treat as invalid: %s", new Object[]{s});
                continue;
            }
            arrayList0.add(gdlj0);
        }
        if(hfuo0.size() != arrayList0.size()) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gdmq0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gdmq0));
            if(!((gdmp)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gdmp)hftp0))).ensureMutable();
            }
            ((gdmq)((gdmp)hftp0).b_message).p = hfvv.a;
            ((gdmp)hftp0).k(arrayList0);
            return (gdmq)((ProtoLiteBuilder)(((gdmp)hftp0))).N_build();
        }
        return gdmq0;
    }

    public static hims[] c(List list0) {
        gged_interceptors gged0;
        if(list0 == null) {
            return null;
        }
        int v = list0.size();
        hims[] arr_hims = new hims[v];
        int v1 = 0;
        for(himp himp0 = null; v1 < v; himp0 = null) {
            egzx egzx0 = (egzx)list0.get(v1);
            if(egzx0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)himp.a).v_newBuilder();
                String s = egzx0.k;
                if(!TextUtils.isEmpty(s)) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)himq.a).v_newBuilder();
                    if(s != null) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        himq himq0 = (himq)hftp1.b_message;
                        himq0.b |= 1;
                        himq0.c = s;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himp himp1 = (himp)hftp0.b_message;
                    himq himq1 = (himq)hftp1.N_build();
                    himq1.getClass();
                    himp1.c = himq1;
                    himp1.b |= 1;
                }
                String s1 = egzx0.m;
                if(!TextUtils.isEmpty(s1)) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)himr.a).v_newBuilder();
                    if(s1 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        himr himr0 = (himr)hftp2.b_message;
                        himr0.b |= 1;
                        himr0.c = s1;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himp himp2 = (himp)hftp0.b_message;
                    himr himr1 = (himr)hftp2.N_build();
                    himr1.getClass();
                    himp2.d = himr1;
                    himp2.b |= 2;
                }
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)himy.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp3.b_message;
                ((himy)hftv0).c = 0;
                ((himy)hftv0).b |= 1;
                if(egzx0.l != null) {
                    if(!hftv0.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((himy)hftp3.b_message).c = 2;
                    ((himy)hftp3.b_message).b |= 1;
                }
                else if(!TextUtils.isEmpty(s1)) {
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((himy)hftp3.b_message).c = 1;
                    ((himy)hftp3.b_message).b |= 1;
                }
                if(hwyi.z() && egzx0.d()) {
                    if(egzx0.d()) {
                        gged_interceptors gged1 = egzx0.r;
                        if(gged1 == null) {
                            gged0 = ggna.a;
                        }
                        else {
                            ggdy ggdy0 = new ggdy();
                            for(int v2 = 0; v2 < gged1.size(); ++v2) {
                                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hina.a).v_newBuilder();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                hina hina0 = (hina)hftp4.b_message;
                                hina0.b |= 2;
                                hina0.d = v2;
                                String s2 = (String)gged1.get(v2);
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                hina hina1 = (hina)hftp4.b_message;
                                s2.getClass();
                                hina1.b |= 1;
                                hina1.c = s2;
                                ggdy0.i(((hina)hftp4.N_build()));
                            }
                            gged0 = ggdy0.h();
                        }
                    }
                    else {
                        gged0 = ggna.a;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himp himp3 = (himp)hftp0.b_message;
                    hfuo hfuo0 = himp3.h;
                    if(!hfuo0.c()) {
                        himp3.h = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(gged0, himp3.h);
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                himp himp4 = (himp)hftp0.b_message;
                himy himy0 = (himy)hftp3.N_build();
                himy0.getClass();
                himp4.g = himy0;
                himp4.b |= 8;
                himp0 = (himp)hftp0.N_build();
            }
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hims.a).v_newBuilder();
            if(himp0 != null) {
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((hims)hftp5.b_message).d = himp0;
                ((hims)hftp5.b_message).b |= 2;
                if((himp0.b & 1) != 0) {
                    himq himq2 = himp0.c == null ? himq.a : himp0.c;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hims hims0 = (hims)hftp5.b_message;
                    himq2.getClass();
                    hims0.c = himq2;
                    hims0.b |= 1;
                }
                String s3 = egzx0.n;
                if(s3 != null) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hims hims1 = (hims)hftp5.b_message;
                    hims1.b |= 4;
                    hims1.e = s3;
                }
                arr_hims[v1] = (hims)hftp5.N_build();
            }
            ++v1;
        }
        return arr_hims;
    }

    private static List d(List list0, String s) {
        return ehct.b.i(list0, s);
    }

    private static List e(List list0, String s) {
        List list1 = ehjs.e(list0);
        return ehct.b.i(list1, s);
    }

    private static void f(String s, String s1, gdmt gdmt0, List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdmo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdmo)hftv0).b |= 4;
        ((gdmo)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s1.getClass();
        ((gdmo)hftv1).b |= 2;
        ((gdmo)hftv1).d = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdmo gdmo0 = (gdmo)hftp0.b_message;
        gdmt0.getClass();
        gdmo0.c = gdmt0;
        gdmo0.b |= 1;
        list0.add(((gdmo)hftp0.N_build()));
    }

    private static void g(int v, String s, gdmt gdmt0, List list0) {
        if(!TextUtils.isEmpty(s)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdmj.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gdmj)hftv0).e = v - 1;
            ((gdmj)hftv0).b |= 4;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s.getClass();
            ((gdmj)hftv1).b |= 2;
            ((gdmj)hftv1).d = s;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdmj gdmj0 = (gdmj)hftp0.b_message;
            gdmt0.getClass();
            gdmj0.c = gdmt0;
            gdmj0.b |= 1;
            list0.add(((gdmj)hftp0.N_build()));
        }
    }
}

