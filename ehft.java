import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract.RawContacts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

public final class ehft extends ehfp {
    static final ggfp e;
    public final Context f;

    static {
        ehft.e = ehft.h();
    }

    public ehft(Context context0, ehbp ehbp0, Account account0, egzp egzp0) {
        super(ehbp0, account0, egzp0);
        this.f = context0;
    }

    @Override  // ehfp
    public final void b(List list0, ehic ehic0) {
        ehhn ehhn0;
        this.c.d();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        batl.b(linkedHashMap0.isEmpty());
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = true;
        for(Object object0: list0) {
            egzv egzv0 = (egzv)object0;
            if(egzv0 != null) {
                if(!z) {
                    stringBuilder0.append(",");
                }
                linkedHashMap0.put(egzv0.a, egzv0);
                DatabaseUtils.appendEscapedSQLString(stringBuilder0, egzv0.a);
                z = false;
            }
        }
        ehbp ehbp0 = this.a;
        Account account0 = this.b;
        ggfp ggfp0 = ehft.l();
        try(ehae ehae0 = ehae.c(this.f, ehbp0, account0, ggfp0, String.format("(%s) OR (%s)", ehft.o(stringBuilder0), "data_set IS NULL AND sourceid IS NULL AND sync3 IS NOT NULL"), null)) {
            List list1 = ehae0.i();
        }
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        for(Object object1: list1) {
            egzv egzv1 = (egzv)object1;
            String s = egzv1.a;
            if(s == null) {
                String s1 = egzv1.c;
                if(s1 == null) {
                    continue;
                }
                hashMap0.put(s1, egzv1);
            }
            else {
                hashMap0.put(s, egzv1);
            }
        }
        for(Object object2: linkedHashMap0.keySet()) {
            String s2 = (String)object2;
            this.c.d();
            egzv egzv2 = (egzv)linkedHashMap0.get(s2);
            if(egzv2 != null) {
                if(hashMap0.containsKey(s2)) {
                    egzv egzv3 = (egzv)hashMap0.get(s2);
                    ehhm ehhm0 = ehhn.a();
                    ehhm0.b(egzv2);
                    ehhm0.a = egzv3;
                    ehhn0 = ehhm0.a();
                }
                else {
                    HashSet hashSet0 = new HashSet();
                    ArrayList arrayList0 = new ArrayList(Arrays.asList(new List[]{egzv2.E, egzv2.I, egzv2.r, egzv2.K}));
                    int v = arrayList0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        List list2 = (List)arrayList0.get(v1);
                        if(list2 != null) {
                            for(Object object3: list2) {
                                hashSet0.add(((ContentValues)object3).getAsString("data1"));
                            }
                        }
                    }
                    Integer integer0 = Arrays.hashCode(new Object[]{hashSet0});
                    if(hashMap1.containsKey(integer0)) {
                        egzv egzv4 = (egzv)hashMap1.remove(integer0);
                        ehhm ehhm1 = ehhn.a();
                        ehhm1.b(egzv2);
                        ehhm1.a = egzv4;
                        ehhn0 = ehhm1.a();
                    }
                    else {
                        ehhm ehhm2 = ehhn.a();
                        ehhm2.b(egzv2);
                        ehhn0 = ehhm2.a();
                    }
                }
                ehic0.d(ehhn0);
            }
        }
    }

    public final Cursor f(String s) {
        Uri uri0 = ehab.c(ContactsContract.RawContacts.CONTENT_URI, this.b);
        return this.a.a(uri0, new String[]{"_id", "sourceid", "sync2"}, s, null, null);
    }

    public final ggeo g(gged_interceptors gged0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = true;
        for(Object object0: gged0) {
            if(!z) {
                stringBuilder0.append(",");
            }
            DatabaseUtils.appendEscapedSQLString(stringBuilder0, ((String)object0));
            z = false;
        }
        HashMap hashMap0 = new HashMap();
        Cursor cursor0 = this.f(ehft.o(stringBuilder0));
        if(cursor0 == null) {
        label_24:
            if(cursor0 != null) {
                cursor0.close();
            }
        }
        else {
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        goto label_24;
                    }
                    Long long0 = cursor0.getLong(0);
                    String s = cursor0.getString(1);
                    if(gfta.c(s)) {
                        s = cursor0.getString(2);
                    }
                    hashMap0.put(s, long0);
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
        }
        return ggeo.k(hashMap0);
    }

    static ggfp h() {
        ggfn ggfn0 = new ggfn();
        ggfn0.j(new String[]{"vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/group_membership", "vnd.android.cursor.item/identity", "vnd.android.cursor.item/im", "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/note", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/photo", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/sip_address", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/website", "vnd.android.cursor.item/name", "vnd.com.google.cursor.item/contact_calendar_link", "vnd.com.google.cursor.item/contact_extended_property", "vnd.com.google.cursor.item/contact_external_id", "vnd.com.google.cursor.item/contact_hobby", "vnd.com.google.cursor.item/contact_jot", "vnd.com.google.cursor.item/contact_language", "vnd.com.google.cursor.item/contact_misc", "vnd.com.google.cursor.item/contact_user_defined_field", "vnd.com.google.cursor.item/contact_file_as", "vnd.android.cursor.item/bestie"});
        if(hxau.c()) {
            ggfn0.i("vnd.android.cursor.item/calling_card");
        }
        return ggfn0.h();
    }

    public final List i(ehae ehae0) {
        egiv.R();
        int v = (int)egiv.J();
        int v1 = (int)hwzc.b();
        try {
            return this.m(ehae0, v);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            egig.c("FSA2_LcReader", "Ran out of memory, using fallback", outOfMemoryError0);
            return this.m(ehae0, v1);
        }
    }

    public final Map j(ehae ehae0) {
        egiv.R();
        int v = (int)egiv.J();
        int v1 = (int)hwzc.b();
        try {
            return this.n(ehae0, v);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            egig.c("FSA2_LcReader", "Ran out of memory, using fallback", outOfMemoryError0);
            return this.n(ehae0, v1);
        }
    }

    public static boolean k(egzv egzv0) {
        List list0 = egzv0.w;
        if(list0 != null) {
            for(Object object0: list0) {
                if(((ContentValues)object0).getAsString("group_sourceid") == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ggfp l() {
        return hxau.a.b().h() ? ehft.h() : ehft.e;
    }

    private final List m(ehae ehae0, int v) {
        List list0 = new ArrayList();
        int v1 = 0;
        while(true) {
            egzv egzv0 = ehae0.a();
            if(egzv0 == null || v1 >= v) {
                break;
            }
            this.c.d();
            if(egzv0.h || !ehft.k(egzv0)) {
                list0.add(egzv0);
                ++v1;
            }
        }
        this.e(ehab.c(ContactsContract.RawContacts.CONTENT_URI, this.b), "data_set IS NULL");
        return list0;
    }

    private final Map n(ehae ehae0, int v) {
        Map map0 = new EnumMap(ehfo.class);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = hxbe.a.b().a();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        while(true) {
            egzv egzv0 = ehae0.a();
            if(egzv0 == null || v1 >= v) {
                break;
            }
            this.c.d();
            if(egzv0.h) {
                arrayList2.add(egzv0);
            }
            else {
                if(ehft.k(egzv0)) {
                    continue;
                }
                if(egzv0.a == null) {
                    if(!z || !egzv0.c()) {
                        arrayList0.add(egzv0);
                    }
                    if(egzv0.c()) {
                        ++v2;
                        if(egzv0.l) {
                            ++v3;
                        }
                    }
                    if(egzv0.b()) {
                        ++v6;
                    }
                }
                else if(egzv0.g) {
                    arrayList1.add(egzv0);
                    if(egzv0.c()) {
                        ++v4;
                        if(egzv0.l) {
                            ++v5;
                        }
                    }
                    if(egzv0.b()) {
                        ++v7;
                    }
                }
            }
            ++v1;
        }
        map0.put(ehfo.a, arrayList0);
        map0.put(ehfo.c, arrayList1);
        map0.put(ehfo.b, arrayList2);
        if(v2 > 0) {
            Account account0 = this.b;
            efpr.a().f(true, account0.name, v2, v3);
        }
        if(v4 > 0) {
            Account account1 = this.b;
            efpr.a().f(false, account1.name, v4, v5);
        }
        if(v6 > 0 || v7 > 0) {
            Account account2 = this.b;
            efpr.a();
            String s = account2.name;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gipg.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gipe.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gipe)hftv0).b |= 1;
            ((gipe)hftv0).c = v6;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gipe gipe0 = (gipe)hftp1.b_message;
            gipe0.b |= 2;
            gipe0.d = v7;
            gipe gipe1 = (gipe)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gipg gipg0 = (gipg)hftp0.b_message;
            gipe1.getClass();
            gipg0.d = gipe1;
            gipg0.b |= 2;
            gipg gipg1 = (gipg)hftp0.N_build();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gisr.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gisr gisr0 = (gisr)hftp2.b_message;
            gipg1.getClass();
            gisr0.H = gipg1;
            gisr0.b |= 0x20000000;
            efpt.b(s, hftp2);
        }
        this.e(ehab.c(ContactsContract.RawContacts.CONTENT_URI, this.b), "data_set IS NULL");
        return map0;
    }

    private static final String o(StringBuilder stringBuilder0) {
        return "sourceid in (" + stringBuilder0 + ") OR (sync2 in (" + stringBuilder0 + ") AND sourceid IS NULL)";
    }
}

