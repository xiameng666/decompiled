import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Groups;
import android.text.TextUtils;
import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.TWR;

public final class eheq extends ehew {
    private final ehga a;
    private final ehfx b;
    private final ehbg c;
    private final bbng d;
    private final ehab e;
    private final egzq f;
    private final ehcp g;
    private final ehfy h;
    private final ehfw n;
    private final ehft o;
    private final eher p;
    private final ehez q;
    private final ehep r;
    private final ehdl s;
    private final egzo t;
    private final egzz u;
    private final egzr v;

    static {
    }

    public eheq(Context context0, ehcp ehcp0, ehcq ehcq0, ehbg ehbg0, ehbp ehbp0, ehga ehga0, Account account0, ehim ehim0, egzp egzp0, bbng bbng0, ehif ehif0, ehdl ehdl0, egzr egzr0, egzq egzq0, egzz egzz0) {
        super(ehbp0, account0, ehim0, ehif0, egzp0);
        this.c = ehbg0;
        this.a = ehga0;
        ehfx ehfx0 = new ehfx(ehbp0, account0, egzp0, ehim0, ehbg0, egzr0);
        this.b = ehfx0;
        this.d = bbng0;
        ehab ehab0 = new ehab(((Account)ehfx0), ehbp0, ehim0);
        this.e = ehab0;
        this.g = ehcp0;
        this.v = egzr0;
        this.f = egzq0;
        ehfy ehfy0 = new ehfy(ehim0, ehab0, egzq0);
        this.h = ehfy0;
        ehft ehft0 = new ehft(context0, ehbp0, ((Account)ehfx0), egzp0);
        this.o = ehft0;
        egzo egzo0 = egzo.a();
        this.t = egzo0;
        this.u = egzz0;
        ehfw ehfw0 = new ehfw(ehab0, ehfx0, ((Account)ehfx0), ehbp0, ehbg0);
        this.n = ehfw0;
        ehfk ehfk0 = new ehfk();
        ehfq ehfq0 = new ehfq(((Account)ehfx0), ((ehbp)ehfw0));
        this.p = new eher(ehim0, ehfx0, ehfy0, ehfw0, egzp0, ehab0, ehcq0, ehfk0, ehfq0, ehdl0, ehft0, egzo0);
        this.q = new ehez(ehim0, ehfx0, ehfy0, ehfw0, egzp0, ehab0, ehcq0, ehfk0, ehfq0, ehdl0, ehft0, egzo0);
        this.r = new ehep(ehim0, ehfx0, ehfy0, ehfw0, egzp0, ehab0, ehcq0, ehfk0, ehfq0, ehdl0, ehft0);
        this.s = ehdl0;
    }

    public final void a() {
        String s;
        int v2;
        int v1;
        ehfx ehfx0;
        ehic ehic1;
        egzp egzp0;
        ehga ehga0;
        ehbg ehbg0;
        ehif ehif0 = this.m;
        ehif0.a();
        egiv.R();
        try {
            ehbg0 = this.c;
            ehga0 = this.a;
            egzp0 = this.l;
            ehhq ehhq0 = new ehhq(this.g, ehbg0, ehga0, egzp0, ContactsContract.Groups.CONTENT_URI, this.k);
            int v = (int)egiv.L();
            ehic ehic0 = new ehic(v);
            new ehhu(ehhq0, egzp0, ehic0).a();
            ehic1 = new ehic(v);
            ehfx0 = this.b;
            ehfx0.c(ehic0, ehic1);
            v1 = 0;
        }
        catch(Throwable throwable0) {
            v2 = 0;
            this.s.c();
            this.m.b("FSA_groupSyncDown", v2);
            throw throwable0;
        }
        try {
            while(true) {
                egzp0.d();
                ehia ehia0 = ehic1.a();
                ggqk ggqk0 = ehia0.a.E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    ehhn ehhn0 = (ehhn)object0;
                    egzx egzx0 = (egzx)ehhn0.b;
                    boolean z = egzx0 != null && TextUtils.equals(egzx0.n, ((egzx)ehhn0.a).n);
                    if(!TextUtils.isEmpty(((egzx)ehhn0.a).l) || !z) {
                        this.h.f(ehhn0, true);
                    }
                    this.s.d(1, false);
                    ++v1;
                }
                this.h.a();
                this.e.f();
                s = ehia0.b;
                if(ehia0.c) {
                    break;
                }
                egzq egzq0 = this.f;
                egzy egzy0 = new egzy(s);
                if(hwyi.z()) {
                    egzq0.c.a(egzy0);
                }
                if(!egzq0.b()) {
                    ehbg0.e(s);
                }
            }
            egzq egzq1 = this.f;
            if(hwyi.z()) {
                egzt egzt0 = egzq1.c;
                if(egzt0.c()) {
                    egzt0.b = s;
                }
                if(egzt0.b()) {
                    egzt0.a(new egzy(null));
                }
            }
            if(!egzq1.b()) {
                ehbg0.f(s);
            }
            if(!egzq1.b()) {
                ehga0.b(ContactsContract.Groups.CONTENT_URI);
            }
            ehfx0.h(this.t, this.u);
        }
        catch(Throwable throwable0) {
            v2 = v1;
            this.s.c();
            this.m.b("FSA_groupSyncDown", v2);
            throw throwable0;
        }
        this.s.c();
        ehif0.b("FSA_groupSyncDown", v1);
    }

    @Override  // ehew
    public final void b() {
        int v1;
        List list4;
        List list3;
        List list2;
        Map map2;
        Iterator iterator4;
        ggeo ggeo1;
        Map map1;
        this.m.a();
        egiv.R();
        int v = 0;
        try {
            ehfx ehfx0 = this.b;
            try(ehag ehag0 = ehag.d(ehfx0.a, ehfx0.e, null, "data_set IS NULL AND (sourceid IS NULL OR dirty != 0 OR deleted != 0)", null, null)) {
                if(hwyi.z() && ehfx0.g.b()) {
                    Map map0 = ehfx0.g(ehag0);
                    egzr egzr0 = ehfx0.f.a;
                    if(egzr0.b()) {
                        aet aet0 = egzr0.a;
                        if(aet0 == null) {
                            egig.b("FSA2_CpgSessionManager", "appSearchSession is null, CPG is unavailable");
                            map1 = ggnf.a;
                        }
                        else {
                            afz afz0 = new afz();
                            afz0.g(new String[]{"cpg:GroupContactOrder"});
                            map1 = egcb.d(aet0.b("dirty:true", afz0.a()));
                        }
                    }
                    else {
                        map1 = ggnf.a;
                    }
                    HashMap hashMap0 = new HashMap();
                    Iterator iterator0 = map1.entrySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            ggeo ggeo0 = ggeo.k(hashMap0);
                            if(ggeo0.isEmpty()) {
                                ggeo1 = ggnf.a;
                            }
                            else {
                                StringBuilder stringBuilder0 = new StringBuilder(TextUtils.join(",", ggeo0.w()));
                                StringBuilder stringBuilder1 = new StringBuilder("_id");
                                stringBuilder1.append(" in (");
                                stringBuilder1.append(stringBuilder0);
                                stringBuilder1.append(")");
                                ggek ggek0 = new ggek();
                                ehag ehag1 = ehag.d(ehfx0.a, ehfx0.e, null, stringBuilder1.toString(), null, null);
                                TWR.declareResource(ehag1);
                                while(true) {
                                    TWR.useResource$NT(ehag1);
                                    egzx egzx0 = ehag1.a();
                                    if(egzx0 == null) {
                                        break;
                                    }
                                    TWR.useResource$NT(ehag1);
                                    egzx egzx1 = ehfm.a(ggeo0, egzx0);
                                    ggek0.i(egzx0.h, egzx1);
                                }
                                TWR.useResource$NT(ehag1);
                                ggeo1 = ggek0.g();
                            }
                            List list0 = ehfm.b(((List)map0.get(ehfo.a)), ggeo1);
                            map0.put(ehfo.a, list0);
                            ehfo ehfo0 = ehfo.c;
                            map0.put(ehfo0, ehfm.b(((List)map0.get(ehfo0)), ggeo1));
                            ehfo ehfo1 = ehfo.b;
                            map0.put(ehfo1, ehfm.b(((List)map0.get(ehfo1)), ggeo1));
                            HashMap hashMap1 = new HashMap(ggeo1);
                            Iterator iterator1 = map0.values().iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    break;
                                }
                                Object object0 = iterator1.next();
                                Iterator iterator2 = ((List)object0).iterator();
                                while(true) {
                                    if(!iterator2.hasNext()) {
                                        break;
                                    }
                                    Object object1 = iterator2.next();
                                    Long long0 = ((egzx)object1).h;
                                    if(hashMap1.containsKey(long0)) {
                                        hashMap1.remove(long0);
                                    }
                                }
                            }
                            ArrayList arrayList0 = new ArrayList(((List)map0.get(ehfo0)).size() + hashMap1.size());
                            arrayList0.addAll(((Collection)map0.get(ehfo0)));
                            arrayList0.addAll(hashMap1.values());
                            map0.put(ehfo0, arrayList0);
                            ArrayList arrayList1 = new ArrayList();
                            Iterator iterator3 = map0.keySet().iterator();
                        alab1:
                            while(true) {
                                do {
                                    if(!iterator3.hasNext()) {
                                        break alab1;
                                    }
                                    Object object2 = iterator3.next();
                                    ehfo ehfo2 = (ehfo)object2;
                                    if(ehfo2 == ehfo1) {
                                        continue alab1;
                                    }
                                    iterator4 = ((List)map0.get(ehfo2)).iterator();
                                label_98:
                                }
                                while(!iterator4.hasNext());
                                Object object3 = iterator4.next();
                                egzx egzx2 = (egzx)object3;
                                if(egzx2.d()) {
                                    goto label_98;
                                }
                                arrayList1.add(egzx2.h);
                                goto label_98;
                            }
                            ggeo ggeo2 = ehfx0.f.a(arrayList1);
                            ggek ggek1 = new ggek();
                            Iterator iterator5 = map0.keySet().iterator();
                            while(true) {
                                if(!iterator5.hasNext()) {
                                    break;
                                }
                                Object object4 = iterator5.next();
                                List list1 = (List)map0.get(((ehfo)object4));
                                ArrayList arrayList2 = new ArrayList(list1.size());
                                Iterator iterator6 = list1.iterator();
                                while(true) {
                                    if(!iterator6.hasNext()) {
                                        break;
                                    }
                                    Object object5 = iterator6.next();
                                    egzx egzx3 = (egzx)object5;
                                    if(ggeo2.containsKey(egzx3.h)) {
                                        arrayList2.add(ehfm.a(ggeo2, egzx3));
                                    }
                                    else {
                                        arrayList2.add(egzx3);
                                    }
                                }
                                ggek1.i(((ehfo)object4), arrayList2);
                            }
                            map2 = ggek1.g();
                            break;
                        }
                        Object object6 = iterator0.next();
                        Map.Entry map$Entry0 = (Map.Entry)object6;
                        try {
                            hashMap0.put(Long.valueOf(Long.parseLong(((String)map$Entry0.getKey()))), ((GroupContactOrder)map$Entry0.getValue()));
                        }
                        catch(NumberFormatException numberFormatException0) {
                            egig.c("FSA2_LocalCpgReader", "Invalid rawGroupId for ContactGroupOrder", numberFormatException0);
                        }
                    }
                }
                else {
                    map2 = ehfx0.g(ehag0);
                }
                list2 = this.e(this.d(((List)map2.get(ehfo.a))));
                list3 = (List)map2.get(ehfo.b);
                list4 = this.e(this.d(((List)map2.get(ehfo.c))));
                v1 = list2.size() + list3.size() + list4.size();
            }
        }
        catch(Throwable throwable0) {
            goto label_164;
        }
        try {
            int v2 = egiv.r().booleanValue() ? list2.size() + list4.size() + list3.size() : list2.size() + list4.size();
            this.s.e(false, gjgi.c, v2);
            this.p.l(list2);
            this.q.l(list4);
            this.r.l(list3);
            goto label_167;
        }
        catch(Throwable throwable0) {
            v = v1;
        }
    label_164:
        this.s.c();
        this.m.b("FSA_groupSyncUp", v);
        throw throwable0;
    label_167:
        this.s.c();
        this.m.b("FSA_groupSyncUp", v1);
    }

    @Override  // ehew
    public final void c(int v) {
        try {
            Uri uri0 = ehab.c(ContactsContract.Groups.CONTENT_URI, this.b.b);
            int v1 = this.b.e(uri0, "data_set IS NULL AND deleted = 0");
            this.k.v(gjgi.c, v, 2, v1);
        }
        catch(ehfh unused_ex) {
            this.k.v(gjgi.c, v, 2, -1);
        }
    }

    private final List d(List list0) {
        if(hwyi.z() && this.v.b()) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                hashSet0.addAll(((egzx)object0).c());
            }
            StringBuilder stringBuilder0 = new StringBuilder(TextUtils.join(",", gged_interceptors.i(hashSet0)));
            StringBuilder stringBuilder1 = new StringBuilder("_id in (");
            stringBuilder1.append(stringBuilder0);
            stringBuilder1.append(")");
            HashMap hashMap0 = new HashMap();
            Cursor cursor0 = this.o.f(stringBuilder1.toString());
            if(cursor0 == null) {
            label_26:
                if(cursor0 != null) {
                    cursor0.close();
                }
            }
            else {
                while(true) {
                    try {
                    label_14:
                        if(!cursor0.moveToNext()) {
                            goto label_26;
                        }
                        Long long0 = cursor0.getLong(0);
                        String s = cursor0.getString(1);
                        if(gfta.c(s)) {
                            s = cursor0.getString(2);
                        }
                        if(gfta.c(s)) {
                            goto label_14;
                        }
                        hashMap0.put(long0, s);
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                }
            }
            ggeo ggeo0 = ggeo.k(hashMap0);
            List list1 = new ArrayList(list0.size());
            for(Object object1: list0) {
                egzx egzx0 = (egzx)object1;
                ArrayList arrayList0 = new ArrayList();
                if(!egzx0.c().isEmpty()) {
                    gged_interceptors gged0 = egzx0.c();
                    int v = gged0.size();
                    int v1 = 0;
                    while(v1 < v) {
                        Long long1 = (Long)gged0.get(v1);
                        if(ggeo0.containsKey(long1)) {
                            arrayList0.add(((String)ggeo0.get(long1)));
                            ++v1;
                            continue;
                        }
                        egzw egzw0 = new egzw(egzx0);
                        egzw0.i(true);
                        egzx0 = egzw0.a();
                        goto label_52;
                    }
                    egzw egzw1 = new egzw(egzx0);
                    egzw1.k = gged_interceptors.i(arrayList0);
                    egzx0 = egzw1.a();
                }
            label_52:
                list1.add(egzx0);
            }
            return list1;
        }
        return list0;
    }

    private final List e(List list0) {
        if(hwyi.z() && this.v.b()) {
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                egzx egzx0 = (egzx)object0;
                if(!egzx0.t || !egzx0.e()) {
                    list1.add(egzx0);
                }
            }
            return list1;
        }
        return list0;
    }
}

