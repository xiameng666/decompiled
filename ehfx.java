import android.accounts.Account;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.Groups;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public final class ehfx extends ehfp {
    public final Uri e;
    public final ehfv f;
    public final egzr g;
    private static final String[] h;
    private final Map i;
    private final Set j;
    private final ehim k;
    private final ehfq l;
    private final ehbg m;

    static {
        ehfx.h = new String[]{"sourceid", "_id"};
    }

    public ehfx(ehbp ehbp0, Account account0, egzp egzp0, ehim ehim0, ehbg ehbg0, egzr egzr0) {
        String s;
        super(ehbp0, account0, egzp0);
        this.i = new HashMap();
        this.j = new HashSet();
        this.k = ehim0;
        this.l = new ehfq(account0, ehbp0);
        this.m = ehbg0;
        this.g = egzr0;
        this.f = new ehfv(egzr0);
        Uri uri0 = ehab.c(ContactsContract.Groups.CONTENT_URI, account0);
        this.e = uri0;
        try(ehag ehag0 = ehag.d(ehbp0, uri0, null, "sourceid IS NULL AND (system_id = \'Contacts\' OR title = \'Starred in Android\')", null, "_id")) {
            egzx egzx0;
            while((egzx0 = ehag0.a()) != null) {
                s = TextUtils.equals(egzx0.m, "Starred in Android") ? "Starred in Android" : egzx0.l;
                if(!this.i.containsKey(s)) {
                    this.i.put(s, egzx0);
                }
                this.j.add(egzx0.h);
            }
        }
    }

    @Override  // ehfp
    public final void b(List list0, ehic ehic0) {
        egzp egzp0 = this.c;
        egzp0.d();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        batl.b(linkedHashMap0.isEmpty());
        StringBuilder stringBuilder0 = new StringBuilder("sourceid");
        stringBuilder0.append(" in (");
        StringBuilder stringBuilder1 = new StringBuilder(String.format("(%s is NULL) AND (%s is NULL) AND %s in (", "sourceid", "system_id", "title"));
        Iterator iterator0 = list0.iterator();
        int v = 1;
    alab1:
        while(true) {
            int v1 = v;
            while(true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                egzx egzx0 = (egzx)object0;
                if(egzx0 != null) {
                    String s = egzx0.k;
                    if(!TextUtils.isEmpty(s)) {
                        if(v == 0) {
                            stringBuilder0.append(",");
                        }
                        linkedHashMap0.put(s, egzx0);
                        DatabaseUtils.appendEscapedSQLString(stringBuilder0, s);
                        String s1 = egzx0.m;
                        if(!TextUtils.isEmpty(s1)) {
                            if(v1 == 0) {
                                stringBuilder1.append(",");
                            }
                            DatabaseUtils.appendEscapedSQLString(stringBuilder1, s1);
                            v = 0;
                            break;
                        }
                        v = 0;
                    }
                }
            }
        }
        stringBuilder0.append(")");
        stringBuilder1.append(")");
        ehag ehag0 = ehag.d(this.a, this.e, null, String.format("%s OR (%s)", stringBuilder0.toString(), stringBuilder1.toString()), null, null);
        try {
            HashMap hashMap0 = new HashMap();
            HashMap hashMap1 = new HashMap();
            try {
                egzx egzx1;
                while((egzx1 = ehag0.a()) != null) {
                    egzp0.d();
                    String s2 = egzx1.k;
                    if(!TextUtils.isEmpty(s2)) {
                        hashMap0.put(s2, egzx1);
                    }
                    else if(!this.j.contains(egzx1.h)) {
                        hashMap1.put(egzx1.m, egzx1);
                    }
                }
            }
            catch(Throwable throwable1) {
                ehag0.close();
                throw throwable1;
            }
            ehag0.close();
            if(hwyi.z() && this.g.b()) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: hashMap0.values()) {
                    Long long0 = ((egzx)object1).h;
                    if(long0 != null) {
                        arrayList0.add(long0);
                    }
                }
                for(Object object2: hashMap1.values()) {
                    Long long1 = ((egzx)object2).h;
                    if(long1 != null) {
                        arrayList0.add(long1);
                    }
                }
                ggeo ggeo0 = this.f.a(arrayList0);
                ehfm.c(ggeo0, hashMap0);
                ehfm.c(ggeo0, hashMap1);
            }
            for(Object object3: linkedHashMap0.keySet()) {
                String s3 = (String)object3;
                egzx egzx2 = (egzx)linkedHashMap0.get(s3);
                if(hashMap0.containsKey(s3)) {
                    ehhm ehhm3 = ehhn.a();
                    ehhm3.b(egzx2);
                    ehhm3.a = (egzx)hashMap0.get(s3);
                    ehic0.d(ehhm3.a());
                }
                else {
                    String s4 = egzx2.m;
                    if(hashMap1.containsKey(s4)) {
                        ehhm ehhm2 = ehhn.a();
                        ehhm2.b(egzx2);
                        ehhm2.a = (egzx)hashMap1.remove(s4);
                        ehic0.d(ehhm2.a());
                    }
                    else {
                        Map map0 = this.i;
                        egzx egzx3 = (egzx)map0.remove(egzx2.l);
                        if(egzx3 == null) {
                            egzx3 = (egzx)map0.remove(s4);
                        }
                        if(egzx3 == null) {
                            ehhm ehhm1 = ehhn.a();
                            ehhm1.b(egzx2);
                            ehic0.d(ehhm1.a());
                        }
                        else {
                            ehhm ehhm0 = ehhn.a();
                            ehhm0.b(egzx2);
                            ehhm0.a = egzx3;
                            ehic0.d(ehhm0.a());
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(ehag0, throwable0);
            throw throwable0;
        }
        ehag0.close();
    }

    public final List f(Long long0, String s) {
        List list0;
        String s1 = String.format(Locale.US, "data_set IS NULL AND (sourceid IS NOT NULL AND _id != %d AND title = %s AND deleted = 0)", long0, DatabaseUtils.sqlEscapeString(s));
        try(ehag ehag0 = ehag.c(this.a, this.e, null, s1, null, null)) {
            list0 = new ArrayList();
            egzx egzx0;
            while((egzx0 = ehag0.a()) != null) {
                list0.add(egzx0);
            }
        }
        return list0;
    }

    public final Map g(ehag ehag0) {
        Map map0 = new EnumMap(ehfo.class);
        ehfo ehfo0 = ehfo.a;
        map0.put(ehfo0, new ArrayList());
        ehfo ehfo1 = ehfo.b;
        map0.put(ehfo1, new ArrayList());
        ehfo ehfo2 = ehfo.c;
        map0.put(ehfo2, new ArrayList());
        egiv.R();
        int v = (int)egiv.J();
        boolean z = hxco.c();
        boolean z1 = hxco.a.b().c();
        int v1 = 0;
        boolean z2 = z || z1 ? ehag.o(this.a, this.b) : true;
        while(true) {
            egzx egzx0 = ehag0.a();
            if(egzx0 == null || v1 >= v) {
                break;
            }
            this.c.d();
            if(z) {
                if(!z2 && !egzx0.g) {
                    this.k.i(gjhb.b);
                }
                if(egzx0.c && !egzx0.f()) {
                    this.k.i(gjhb.e);
                }
                if(egzx0.b && !egzx0.a && !"Contacts".equals(egzx0.l)) {
                    this.k.i(gjhb.c);
                }
                if(egzx0.d && !"Contacts".equals(egzx0.l)) {
                    this.k.i(gjhb.d);
                }
            }
            if(egzx0.f) {
                if(egzx0.k == null) {
                    continue;
                }
                ((List)map0.get(ehfo1)).add(egzx0);
            }
            else if(egzx0.k == null) {
                if(z1 && !z2 && !egzx0.g) {
                    egig.e("FSA2_LocalGroupsReader", "Skip syncing up new groups with should_not=0");
                    continue;
                }
                else {
                    ((List)map0.get(ehfo0)).add(egzx0);
                    goto label_37;
                }
                goto label_35;
            }
            else {
            label_35:
                if(!egzx0.e) {
                    continue;
                }
                ((List)map0.get(ehfo2)).add(egzx0);
            }
        label_37:
            ++v1;
        }
        this.e(this.e, "data_set IS NULL");
        List list0 = (List)map0.get(ehfo1);
        return map0;
    }

    public final void h(egzo egzo0, egzz egzz0) {
        ArrayList arrayList0 = new ArrayList();
        ehbp ehbp0 = this.a;
        Uri uri0 = this.e;
        Cursor cursor0 = ehbp0.a(uri0, ehfx.h, "title = \'Starred in Android\'", null, null);
        if(cursor0 != null) {
            boolean z = false;
            try {
            alab1:
                while(true) {
                    while(true) {
                        boolean z1 = cursor0.moveToNext();
                        boolean z2 = egzo0.d == 2;
                        if(!z1) {
                            break alab1;
                        }
                        if(cursor0.isNull(0)) {
                            break;
                        }
                        z = true;
                        if(z2) {
                            arrayList0.add(cursor0.getString(0));
                            break;
                        }
                        break alab1;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_34;
            }
            cursor0.close();
            if(!z) {
                this.i("No synced Starred in Android groups.");
            }
            try {
                if(ehab.a(ehbp0, uri0, "system_id = \'Contacts\' AND sourceid IS NOT NULL", null) <= 0) {
                    goto label_25;
                }
                goto label_26;
            }
            catch(RemoteException remoteException0) {
                throw new ehfh(remoteException0);
            }
        label_25:
            this.i("No synced My Contacts groups.");
        label_26:
            if(z2 && !arrayList0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList();
                arrayList1.addAll(arrayList0);
                arrayList1.add("6");
                egzz0.a = gged_interceptors.i(arrayList1);
            }
            return;
        }
        try {
            throw new ehfh(new RemoteException("Unable to query local Starred in Android Groups."));
        }
        catch(Throwable throwable0) {
        label_34:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    }

    private final void i(String s) {
        egig.b("FSA2_LocalGroupsReader", s);
        for(Object object0: this.i.values()) {
            egzx egzx0 = (egzx)object0;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girw.a).v_newBuilder();
            giru giru0 = ehik.a(egzx0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            girw girw0 = (girw)hftp0.b_message;
            giru0.getClass();
            girw0.c = giru0;
            girw0.b |= 1;
            egiv.R();
            try {
                girv girv0 = this.l.a(egzx0.h.longValue());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girw girw1 = (girw)hftp0.b_message;
                girv0.getClass();
                girw1.d = girv0;
                girw1.b |= 2;
            }
            catch(RemoteException unused_ex) {
            }
            girw girw2 = (girw)hftp0.N_build();
            this.k.c(girw2);
        }
        this.m.b();
        throw new ehfh(new ehfg(4, s));
    }
}

