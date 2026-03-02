import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class ehcu {
    public static final ggeo a;
    private static final ggeo b;
    private static final ggeo c;
    private static final ggeo d;
    private static final ggeo e;
    private static final ggeo f;
    private static final ggeo g;
    private static final efui h;

    static {
        Integer integer0 = (int)1;
        Integer integer1 = (int)2;
        ehcu.b = ggeo.m("male", integer0, "female", integer1);
        Integer integer2 = (int)5;
        Integer integer3 = (int)4;
        Integer integer4 = (int)3;
        ehcu.c = ggeo.p("user", integer3, "keyword", integer4, "home", integer1, "work", integer0, "other", integer2);
        Byte byte0 = (byte)1;
        Byte byte1 = (byte)2;
        Byte byte2 = (byte)3;
        Byte byte3 = (byte)-1;
        ehcu.d = ggeo.o(byte0, integer0, byte1, integer1, byte2, integer4, byte3, integer3);
        ehcu.e = ggeo.p(byte0, integer0, byte1, integer1, byte2, integer4, Byte.valueOf(((byte)4)), integer3, byte3, integer2);
        ehcu.f = ggeo.o("6", "Contacts", "d", "Friends", "e", "Family", "f", "Coworkers");
        ehcu.g = ggeo.l("6", "Contacts");
        ggek ggek0 = new ggek();
        ggek0.i(integer0, iapk.b);
        ggek0.i(Integer.valueOf(6), iapk.m);
        ggek0.i(integer2, iapk.h);
        ggek0.i(Integer.valueOf(7), iapk.p);
        ggek0.i(integer4, iapk.e);
        ggek0.i(integer3, iapk.g);
        ggek0.i(integer1, iapk.d);
        ehcu.a = ggek0.b();
        ehcu.h = efui.a;
    }

    public static egzv a(gdmq gdmq0, String s, egzo egzo0, egzz egzz0, boolean z) {
        ArrayList arrayList6;
        int v6;
        Object object7;
        List list21;
        List list20;
        List list19;
        hfuo hfuo12;
        ArrayList arrayList2;
        gged_interceptors gged5;
        gged_interceptors gged3;
        List list9;
        gged_interceptors gged1;
        List list4;
        gged_interceptors gged0;
        int v2;
        hfuo hfuo8;
        hfuo hfuo7;
        ArrayList arrayList0;
        List list0;
        batl.s(gdmq0);
        batl.s(s);
        if((gdmq0.d == null ? gdmx.a : gdmq0.d).d.size() > 0 && ehig.b(gdmq0).contains(s)) {
            egzu egzu0 = new egzu();
            egzu0.a = s;
            gdmx gdmx0 = gdmq0.d == null ? gdmx.a : gdmq0.d;
            for(Object object0: (gdmx0.f == null ? gdmb.a : gdmx0.f).b) {
                gdni gdni0 = (gdni)object0;
                if(gdni0 != null && s.equals(gdni0.d)) {
                    egzu0.b = gdni0.h;
                    long v = gdni0.f;
                    if(v != 0L) {
                        egzu0.d = v;
                    }
                    if(gdni0.e) {
                        egzu0.A();
                    }
                    break;
                }
            }
            hfuo hfuo0 = gdmq0.i;
            hfuo hfuo1 = gdmq0.h;
            hfuo hfuo2 = gdmq0.A;
            hfuo hfuo3 = gdmq0.v;
            hfuo hfuo4 = gdmq0.l;
            if(hfuo4.isEmpty()) {
                list0 = null;
            }
            else {
                eftp eftp0 = ehcu.h.b(gdle.class, z);
                list0 = eftp0 == null ? null : efui.s(hfuo4, s, eftp0, 3);
            }
            List list1 = ehcu.f(gdmq0.B, s);
            hfuo hfuo5 = gdmq0.G;
            hfuo hfuo6 = gdmq0.H;
            if(hfuo5.isEmpty() && hfuo6.isEmpty()) {
                arrayList0 = new ArrayList();
                hfuo7 = hfuo3;
            }
            else {
                ContentValues contentValues0 = new ContentValues();
                Iterator iterator1 = hfuo5.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        hfuo7 = hfuo3;
                        hfuo8 = hfuo6;
                        v2 = 0;
                        break;
                    }
                    Object object1 = iterator1.next();
                    gdlg gdlg0 = (gdlg)object1;
                    hfuo7 = hfuo3;
                    int v1 = gdll.a((gdlg0.c == null ? gdmt.a : gdlg0.c).d);
                    if(v1 == 0) {
                        hfuo3 = hfuo7;
                        iterator1 = iterator1;
                    }
                    else {
                        hfuo8 = hfuo6;
                        if(v1 == 3) {
                            hilf hilf0 = gdlg0.d == null ? hilf.a : gdlg0.d;
                            contentValues0 = new ContentValues();
                            contentValues0.put("mimetype", "vnd.android.cursor.item/calling_card");
                            contentValues0.put("x_calling_card_data", Base64.encodeToString(hilf0.toBytesArray(), 0));
                            contentValues0.put("x_sync5", (gdlg0.c == null ? gdmt.a : gdlg0.c).e);
                            v2 = 1;
                            break;
                        }
                        hfuo3 = hfuo7;
                        iterator1 = iterator1;
                        hfuo6 = hfuo8;
                    }
                }
                Iterator iterator2 = hfuo8.iterator();
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    gdmz gdmz0 = (gdmz)object2;
                    switch(gdll.a((gdmz0.c == null ? gdmt.a : gdmz0.c).d)) {
                        case 0: {
                            v2 = v2;
                            continue;
                        }
                        case 3: {
                            goto label_77;
                        }
                    }
                    v2 = v2;
                    iterator2 = iterator2;
                    continue;
                label_77:
                    contentValues0.put("mimetype", "vnd.android.cursor.item/calling_card");
                    contentValues0.put("x_sync1", gdmz0.d);
                    contentValues0.put("x_sync2", gdmz0.f);
                    if(!contentValues0.containsKey("x_sync5")) {
                        contentValues0.put("x_sync5", (gdmz0.c == null ? gdmt.a : gdmz0.c).e);
                    }
                    gged0 = gged_interceptors.l(contentValues0);
                    goto label_85;
                }
                gged0 = v2 == 0 ? ggna.a : gged_interceptors.l(contentValues0);
            label_85:
                arrayList0 = gged0;
            }
            List list2 = ehcu.f(gdmq0.E, s);
            List list3 = ehcu.f(hfuo1, s);
            hfuo hfuo9 = gdmq0.C;
            if(hfuo9.isEmpty()) {
                list4 = null;
            }
            else {
                eftp eftp1 = ehcu.h.b(gdlu.class, z);
                list4 = eftp1 == null ? null : efui.s(hfuo9, s, eftp1, 3);
            }
            List list5 = ehcu.f(gdmq0.q, s);
            List list6 = ehcu.f(gdmq0.r, s);
            hfuo hfuo10 = gdmq0.p;
            if(egzo0.d == 2) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: hfuo10) {
                    gdlj gdlj0 = (gdlj)object3;
                    if(egzz0.a.contains(gdlj0.f)) {
                        arrayList1.add(gdlj0);
                    }
                }
                hfuo10 = arrayList1;
            }
            List list7 = ehcu.f(hfuo10, s);
            List list8 = ehcu.f(gdmq0.t, s);
            efui efui0 = ehcu.h;
            if(hfuo0 == null) {
                gged1 = ggna.a;
            }
            else {
                eftp eftp2 = efui0.a(gdmy.class);
                gged_interceptors gged2 = null;
                for(Object object4: hfuo0) {
                    gdmy gdmy0 = (gdmy)object4;
                    if(gdmy0 != null) {
                        gdmt gdmt0 = eftp2.b(gdmy0);
                        if(efui.n(gdmt0, s)) {
                            list9 = list4;
                            gged2 = efui.g(gdmt0, "vnd.android.cursor.item/phone_v2", gdmy0.d, gged2);
                            goto label_129;
                        }
                    }
                    list9 = list4;
                label_129:
                    list4 = list9;
                }
                gged1 = gged2;
            }
            if(hfuo1 == null) {
                gged3 = ggna.a;
            }
            else {
                eftp eftp3 = efui0.a(gdlt.class);
                gged_interceptors gged4 = null;
                for(Object object5: hfuo1) {
                    gdlt gdlt0 = (gdlt)object5;
                    if(gdlt0 != null) {
                        gdmt gdmt1 = eftp3.b(gdlt0);
                        if(efui.n(gdmt1, s)) {
                            gged4 = efui.g(gdmt1, "vnd.android.cursor.item/email_v2", gdlt0.d, gged4);
                        }
                    }
                }
                gged3 = gged4;
            }
            if(hfuo2 == null) {
                gged5 = ggna.a;
            }
            else {
                eftp eftp4 = efui0.a(gdnk.class);
                gged_interceptors gged6 = null;
                for(Object object6: hfuo2) {
                    gdnk gdnk0 = (gdnk)object6;
                    if(gdnk0 != null) {
                        gdmt gdmt2 = eftp4.b(gdnk0);
                        if(efui.n(gdmt2, s)) {
                            arrayList2 = arrayList0;
                            gged6 = efui.g(gdmt2, "vnd.android.cursor.item/website", gdnk0.d, gged6);
                            goto label_163;
                        }
                    }
                    arrayList2 = arrayList0;
                label_163:
                    arrayList0 = arrayList2;
                }
                gged5 = gged6;
            }
            List list10 = ehjs.f(new List[]{gged1, gged3, gged5});
            if(list10.isEmpty()) {
                list10 = null;
            }
            List list11 = ehcu.f(gdmq0.s, s);
            ArrayList arrayList3 = new ArrayList();
            List list12 = ehcu.f(gdmq0.u, s);
            ArrayList arrayList4 = new ArrayList();
            hfuo hfuo11 = gdmq0.f;
            if(hfuo11.isEmpty()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdmg.a).v_newBuilder();
                gdmt gdmt3 = efui.d(s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdmg gdmg0 = (gdmg)hftp0.b_message;
                gdmt3.getClass();
                gdmg0.c = gdmt3;
                gdmg0.b |= 1;
                hfuo11 = gged_interceptors.l(((gdmg)hftp0.N_build()));
            }
            List list13 = ehcu.f(hfuo11, s);
            if(hfuo7.isEmpty()) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gdmj.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gdmj)hftp1.b_message).e = 0;
                ((gdmj)hftp1.b_message).b |= 4;
                gdmt gdmt4 = efui.d(s);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gdmj gdmj0 = (gdmj)hftp1.b_message;
                gdmt4.getClass();
                gdmj0.c = gdmt4;
                gdmj0.b |= 1;
                hfuo12 = gged_interceptors.l(((gdmj)hftp1.N_build()));
            }
            else {
                hfuo12 = hfuo7;
            }
            List list14 = ehcu.f(hfuo12, s);
            hfuo hfuo13 = gdmq0.m;
            if(hfuo13.isEmpty()) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gdkz.a).v_newBuilder();
                gdmt gdmt5 = efui.d(s);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gdkz gdkz0 = (gdkz)hftp2.b_message;
                gdmt5.getClass();
                gdkz0.c = gdmt5;
                gdkz0.b |= 1;
                hfuo13 = gged_interceptors.l(((gdkz)hftp2.N_build()));
            }
            List list15 = ehcu.f(hfuo13, s);
            List list16 = ehcu.f(gdmq0.x, s);
            List list17 = ehcu.f(hfuo0, s);
            List list18 = ehcu.f(gdmq0.n, s);
            gdmz[] arr_gdmz = (gdmz[])gdmq0.g.toArray(new gdmz[0]);
            if(ehjs.h(arr_gdmz)) {
                list19 = list10;
                list20 = list11;
                list21 = list17;
                object7 = null;
            }
            else {
                int v3 = 0;
                int v4 = -1;
                int v5 = -1;
                while(true) {
                    if(v3 >= arr_gdmz.length) {
                        list19 = list10;
                        list20 = list11;
                        list21 = list17;
                        v6 = -1;
                        break;
                    }
                    list19 = list10;
                    gdmz gdmz1 = arr_gdmz[v3];
                    ++v4;
                    list20 = list11;
                    gdmt gdmt6 = gdmz1.c == null ? gdmt.a : gdmz1.c;
                    list21 = list17;
                    if(!gdmz1.e && (gdmz1.b & 1) != 0) {
                        if(gdll.a(gdmt6.d) == 3 && s.equals(gdmt6.e)) {
                            v6 = v4;
                            break;
                        }
                        if(gdll.a(gdmt6.d) == 2) {
                            v5 = v4;
                        }
                    }
                    ++v3;
                    list10 = list19;
                    list11 = list20;
                    list17 = list21;
                }
                if(v6 >= 0) {
                    object7 = arr_gdmz[v6];
                }
                else if(v5 >= 0) {
                    object7 = arr_gdmz[v5];
                }
                else {
                    object7 = null;
                }
            }
            if(object7 != null && (object7.b & 1) != 0) {
                boolean z1 = (object7.c == null ? gdmt.a : object7.c).h;
                ContentValues contentValues1 = efui0.a(gdmz.class).a(object7, z1);
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(contentValues1);
                arrayList6 = arrayList5;
            }
            else {
                arrayList6 = null;
            }
            boolean z2 = object7 != null && (object7.b & 1) != 0 && gdll.a((object7.c == null ? gdmt.a : object7.c).d) == 2;
            List list22 = ehcu.d(((gdlh[])gdmq0.o.toArray(new gdlh[0])));
            List list23 = ehcu.f(gdmq0.z, s);
            List list24 = ehcu.f(gdmq0.D, s);
            List list25 = ehcu.f(hfuo2, s);
            ehcu.e(gdmq0.j, hfuo7, gdmq0.w, gdmq0.F, arrayList3, arrayList4);
            if(!ehjs.i(list0)) {
                for(Object object8: list0) {
                    egzu0.a(((ContentValues)object8));
                }
            }
            if(!ehjs.i(list1)) {
                for(Object object9: list1) {
                    egzu0.b(((ContentValues)object9));
                }
            }
            if(!ehjs.i(arrayList0)) {
                for(Object object10: arrayList0) {
                    egzu0.c(((ContentValues)object10));
                }
            }
            if(!ehjs.i(list2)) {
                for(Object object11: list2) {
                    egzu0.d(((ContentValues)object11));
                }
            }
            if(!ehjs.i(list3)) {
                for(Object object12: list3) {
                    egzu0.e(((ContentValues)object12));
                }
            }
            if(!ehjs.i(list4)) {
                for(Object object13: list4) {
                    egzu0.f(((ContentValues)object13));
                }
            }
            if(!ehjs.i(list5)) {
                for(Object object14: list5) {
                    egzu0.h(((ContentValues)object14));
                }
            }
            if(!ehjs.i(list6)) {
                for(Object object15: list6) {
                    egzu0.i(((ContentValues)object15));
                }
            }
            if(!ehjs.i(list7)) {
                for(Object object16: list7) {
                    egzu0.j(((ContentValues)object16));
                }
            }
            if(!ehjs.i(list8)) {
                for(Object object17: list8) {
                    egzu0.k(((ContentValues)object17));
                }
            }
            if(!ehjs.i(list19)) {
                for(Object object18: list19) {
                    egzu0.l(((ContentValues)object18));
                }
            }
            if(!ehjs.i(list20)) {
                for(Object object19: list20) {
                    egzu0.m(((ContentValues)object19));
                }
            }
            if(!ehjs.i(arrayList3)) {
                for(Object object20: arrayList3) {
                    egzu0.n(((ContentValues)object20));
                }
            }
            if(!ehjs.i(list12)) {
                for(Object object21: list12) {
                    egzu0.o(((ContentValues)object21));
                }
            }
            if(!ehjs.i(arrayList4)) {
                for(Object object22: arrayList4) {
                    egzu0.p(((ContentValues)object22));
                }
            }
            if(!ehjs.i(list13)) {
                for(Object object23: list13) {
                    egzu0.q(((ContentValues)object23));
                }
            }
            if(!ehjs.i(list14)) {
                for(Object object24: list14) {
                    egzu0.r(((ContentValues)object24));
                }
            }
            if(!ehjs.i(list15)) {
                for(Object object25: list15) {
                    egzu0.s(((ContentValues)object25));
                }
            }
            if(!ehjs.i(list16)) {
                for(Object object26: list16) {
                    egzu0.t(((ContentValues)object26));
                }
            }
            if(!ehjs.i(list21)) {
                for(Object object27: list21) {
                    egzu0.u(((ContentValues)object27));
                }
            }
            if(!ehjs.i(list18)) {
                for(Object object28: list18) {
                    egzu0.w(((ContentValues)object28));
                }
            }
            if(!ehjs.i(arrayList6)) {
                for(Object object29: arrayList6) {
                    egzu0.v(((ContentValues)object29));
                }
            }
            if(!ehjs.i(list22)) {
                for(Object object30: list22) {
                    egzu0.g(((ContentValues)object30));
                }
            }
            if(!ehjs.i(list23)) {
                for(Object object31: list23) {
                    egzu0.x(((ContentValues)object31));
                }
            }
            if(!ehjs.i(list24)) {
                for(Object object32: list24) {
                    egzu0.y(((ContentValues)object32));
                }
            }
            if(!ehjs.i(list25)) {
                for(Object object33: list25) {
                    egzu0.z(((ContentValues)object33));
                }
            }
            if(z2) {
                egzu0.j = true;
            }
            return new egzv(egzu0);
        }
        return null;
    }

    public static egzx b(egzx egzx0, ggeo ggeo0) {
        GroupContactOrder groupContactOrder1;
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = egzx0.r;
        int v = gged0.size();
        int v1 = 0;
        while(v1 < v) {
            String s = (String)gged0.get(v1);
            if(ggeo0.containsKey(s)) {
                arrayList0.add(((Long)ggeo0.get(s)));
                ++v1;
                continue;
            }
            egzw egzw0 = new egzw(egzx0);
            egzw0.i(true);
            return egzw0.a();
        }
        egzw egzw1 = new egzw(egzx0);
        GroupContactOrder groupContactOrder0 = egzx0.s;
        if(groupContactOrder0 == null) {
            egfe egfe1 = new egfe();
            egfe1.c(arrayList0);
            Long long0 = egzx0.h;
            if(long0 != null) {
                egfe1.a = long0.toString();
            }
            groupContactOrder1 = egfe1.a();
        }
        else {
            egfe egfe0 = new egfe(groupContactOrder0);
            egfe0.c(arrayList0);
            groupContactOrder1 = egfe0.a();
        }
        egzw1.l = groupContactOrder1;
        return egzw1.a();
    }

    public static egzx c(himv himv0, egzo egzo0) {
        gged_interceptors gged0;
        String s1;
        int v = 1;
        if(himv0 != null) {
            int v1 = himv0.g;
            if(himu.a(v1) != 0 && himu.a(v1) != 1) {
                int v2 = himu.a(v1);
                ggeo ggeo0 = ehcu.a;
                if(v2 != 0) {
                    v = v2;
                }
                iapk iapk0 = (iapk)ggeo0.get(Integer.valueOf(v));
                if(iapk0 == null) {
                    iapk0 = iapk.d;
                }
                egig.d("FSA2_ProtoToPeopleUtil", "Server error: %s", new Object[]{iapk0});
                if(hxbz.a.b().a() && !himv0.d.isEmpty()) {
                    iapk0 = iapk0.f(himv0.d);
                }
                throw new iapl(iapk0);
            }
            if((himv0.b & 4) != 0) {
                String s = null;
                himp himp0 = himv0.e == null ? himp.a : himv0.e;
                if((himp0.b & 1) != 0) {
                    if(!(himp0.c == null ? himq.a : himp0.c).c.isEmpty()) {
                        if((himp0.b & 2) == 0) {
                            s1 = null;
                        }
                        else if(!(himp0.d == null ? himr.a : himp0.d).d.isEmpty()) {
                            s1 = (himp0.d == null ? himr.a : himp0.d).d;
                        }
                        else {
                            s1 = (himp0.d == null ? himr.a : himp0.d).c;
                        }
                        String s2 = (himp0.c == null ? himq.a : himp0.c).c;
                        if(himx.a((himp0.g == null ? himy.a : himp0.g).c) == 3) {
                            String s3 = egzo0.d == 2 ? ((String)ehcu.g.get(s2)) : ((String)ehcu.f.get(s2));
                            if(s3 == null) {
                                egig.d("FSA2_ProtoToPeopleUtil", "Unexpected system group {id=%s}", new Object[]{s2});
                                return null;
                            }
                            s = s3;
                        }
                        else if(egzo0.d == 2 && !"Starred in Android".equals(s1)) {
                            egig.d("FSA2_ProtoToPeopleUtil", "Unexpected custom group {id=%s}", new Object[]{s2});
                            return null;
                        }
                        if(himp0.f.size() != 0) {
                            for(Object object0: himp0.f) {
                                if(himn.a(((himo)object0).b) == 2) {
                                    egzw egzw0 = egzx.b();
                                    egzw0.d = s2;
                                    egzw0.c(true);
                                    return egzw0.a();
                                }
                            }
                        }
                        long v3 = (himp0.b & 4) == 0 ? 0L : (himp0.e == null ? himz.a : himp0.e).b;
                        String s4 = himv0.f;
                        boolean z = "Starred in Android".equals(s1);
                        if(s == null && (TextUtils.isEmpty(s4) || TextUtils.isEmpty(s1))) {
                            egig.d("FSA2_ProtoToPeopleUtil", "Invalid group (contact group with no title or etag {id=%s}", new Object[]{s2});
                            throw new ehfa(6);
                        }
                        egzw egzw1 = egzx.b();
                        egzw1.d = s2;
                        egzw1.g = s4;
                        egzw1.f = s1;
                        if(s != null) {
                            egzw1.e = s;
                            egzw1.f(true);
                            if("6".equals(s2)) {
                                egzw1.b(true);
                            }
                        }
                        if(z) {
                            egzw1.e(true);
                            egzw1.f(true);
                        }
                        if(v3 != 0L) {
                            egzw1.c = v3;
                        }
                        if(hwyi.z()) {
                            if(himp0.h.size() == 0) {
                                gged0 = ggna.a;
                            }
                            else {
                                TreeMap treeMap0 = new TreeMap();
                                for(Object object1: himp0.h) {
                                    treeMap0.put(Integer.valueOf(((hina)object1).d), ((hina)object1).c);
                                }
                                gged0 = gged_interceptors.i(treeMap0.values());
                            }
                            egzw1.k = gged0;
                        }
                        return egzw1.a();
                    }
                    egig.d("FSA2_ProtoToPeopleUtil", "Group with empty result.id.id - %s", new Object[]{himv0.d});
                    throw new ehfa(4);
                }
                egig.d("FSA2_ProtoToPeopleUtil", "Group with no result.id - %s", new Object[]{himv0.d});
                throw new ehfa(3);
            }
            egig.d("FSA2_ProtoToPeopleUtil", "Group returned no result - %s", new Object[]{himv0.d});
            throw new ehfa(2);
        }
        egig.b("FSA2_ProtoToPeopleUtil", "Server returned null API group");
        throw new ehfa(1);
    }

    public static List d(gdlh[] arr_gdlh) {
        JSONObject jSONObject0;
        List list0 = null;
        if(!ehjs.h(arr_gdlh)) {
            for(int v = 0; v < arr_gdlh.length; ++v) {
                gdlh gdlh0 = arr_gdlh[v];
                if(gdlh0 != null && ("gdataExtendedProperty".equals(gdlh0.f) && "android".equals(gdlh0.d))) {
                    String s = gdlh0.e;
                    if(TextUtils.isEmpty(s)) {
                        return null;
                    }
                    try {
                        jSONObject0 = new JSONObject(s);
                    }
                    catch(JSONException unused_ex) {
                        return list0;
                    }
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s1 = (String)object0;
                        try {
                            ContentValues contentValues0 = new ContentValues();
                            contentValues0.put("mimetype", "vnd.com.google.cursor.item/contact_extended_property");
                            contentValues0.put("data1", s1);
                            contentValues0.put("data2", jSONObject0.getString(s1));
                            if(list0 == null) {
                                list0 = new ArrayList();
                            }
                            ((ArrayList)list0).add(contentValues0);
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    return list0;
                }
            }
        }
        return null;
    }

    public static void e(List list0, List list1, List list2, List list3, List list4, List list5) {
        if(!list0.isEmpty() || !list1.isEmpty() || !list2.isEmpty() || !list3.isEmpty()) {
            ContentValues contentValues0 = new ContentValues();
            if(!list0.isEmpty()) {
                String s = ((gdma)list0.get(0)).d;
                Integer integer0 = (Integer)ehcu.b.get(s);
                if(integer0 != null) {
                    contentValues0.put("data3", integer0);
                }
            }
            for(Object object0: list1) {
                int v = gdmi.a(((gdmj)object0).e);
                if(v == 0) {
                    v = 1;
                }
                String s1 = ((gdmj)object0).d;
                if(v != 1) {
                    switch(v - 1) {
                        case 2: {
                            contentValues0.put("data5", s1);
                            break;
                        }
                        case 3: {
                            contentValues0.put("data10", s1);
                            break;
                        }
                        case 4: {
                            contentValues0.put("data4", s1);
                        }
                    }
                }
            }
            if(!list2.isEmpty()) {
                contentValues0.put("data7", ((gdmk)list2.get(0)).d);
            }
            for(Object object1: list3) {
                String s2 = ((gdmo)object1).e;
                String s3 = ((gdmo)object1).d;
                if(!TextUtils.isEmpty(s2)) {
                    switch(s2) {
                        case "billinginformation": {
                            contentValues0.put("data1", s3);
                            continue;
                        }
                        case "directoryserver": {
                            contentValues0.put("data2", s3);
                            continue;
                        }
                        case "mileage": {
                            contentValues0.put("data6", s3);
                            continue;
                        }
                        case "priority": {
                            try {
                                int v1 = Byte.parseByte(s3);
                                contentValues0.put("data8", ((Integer)ehcu.d.get(Byte.valueOf(((byte)v1)))));
                            }
                            catch(NumberFormatException unused_ex) {
                                egig.d("FSA2_ProtoToPeopleUtil", "Getting priority value from %s failed", new Object[]{s3});
                            }
                            continue;
                        }
                        case "sensitivity": {
                            try {
                                int v2 = Byte.parseByte(s3);
                                contentValues0.put("data9", ((Integer)ehcu.e.get(Byte.valueOf(((byte)v2)))));
                            }
                            catch(NumberFormatException unused_ex) {
                                egig.d("FSA2_ProtoToPeopleUtil", "Getting sensitivity value from %s failed", new Object[]{s3});
                            }
                            continue;
                        }
                        case "subject": {
                            contentValues0.put("data11", s3);
                            continue;
                        }
                        default: {
                            Integer integer1 = (Integer)ehcu.c.get(s2);
                            if(integer1 == null) {
                                continue;
                            }
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("mimetype", "vnd.com.google.cursor.item/contact_jot");
                            contentValues1.put("data2", integer1);
                            efup.e(contentValues1, "data1", s3);
                            list4.add(contentValues1);
                            continue;
                        }
                    }
                    break;
                }
            }
            if(contentValues0.size() > 0) {
                contentValues0.put("mimetype", "vnd.com.google.cursor.item/contact_misc");
                list5.add(contentValues0);
            }
        }
    }

    private static List f(List list0, String s) {
        if(!list0.isEmpty()) {
            Class class0 = list0.get(0).getClass();
            eftp eftp0 = ehcu.h.a(class0);
            return eftp0 == null ? null : efui.s(list0, s, eftp0, 3);
        }
        return null;
    }

    private static void g(himv himv0) {
    }
}

