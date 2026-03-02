import android.accounts.Account;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.Groups;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import jeb.synthetic.TWR;

public final class ehau {
    public static final int a;
    private static final String[] b;
    private static final String[] c;

    static {
        ehau.b = new String[]{"_id", "title", "account_type"};
        ehau.c = new String[]{"_id", "title", "account_type", "data_set"};
    }

    public static final ehag a(String s, ehbp ehbp0) {
        return hxba.p() ? ehag.c(ehbp0, ContactsContract.Groups.CONTENT_URI, ehau.c, s, null, "_id") : ehag.c(ehbp0, ContactsContract.Groups.CONTENT_URI, ehau.b, s, null, "_id");
    }

    public static final Map b(ehag ehag0, efpm efpm0) {
        Map map0 = new TreeMap();
        egzx egzx0;
        while((egzx0 = ehag0.a()) != null) {
            efoy efoy0 = efpm0.a(egzx0.p, egzx0.q).c;
            if(efoy0 == efoy.d || hxba.o() && efoy0 == efoy.b) {
                map0.put(egzx0.h, egzx0.m);
            }
        }
        return map0;
    }

    public static final void c(Map map0, boolean z, ehbp ehbp0, Account account0, giqx giqx0, ehfs ehfs0) {
        int v;
        TreeMap treeMap1;
        ehbp ehbp1;
        try {
            Collection collection0 = map0.values();
            TreeMap treeMap0 = new TreeMap();
            if(collection0.isEmpty()) {
                ehbp1 = ehbp0;
            }
            else {
                ehbp1 = ehbp0;
                ehag ehag0 = ehag.c(ehbp1, ehab.c(ContactsContract.Groups.CONTENT_URI, account0), null, "title IN (" + a.T(collection0, "\"", "\",\"", "\"") + ")", null, "title");
                TWR.declareResource(ehag0);
                while(true) {
                    TWR.useResource$NT(ehag0);
                    egzx egzx0 = ehag0.a();
                    if(egzx0 == null) {
                        break;
                    }
                    TWR.useResource$NT(ehag0);
                    treeMap0.put(egzx0.m, egzx0.h);
                }
            }
            treeMap1 = new TreeMap();
            for(Object object0: map0.keySet()) {
                Long long0 = (Long)object0;
                String s = (String)map0.get(long0);
                if(treeMap0.containsKey(s)) {
                    treeMap1.put(long0, ((Long)treeMap0.get(s)));
                }
            }
        }
        catch(RemoteException remoteException0) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqy.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqy)hftp0.b_message).c = (z ? 7 : 8) - 1;
            ((giqy)hftp0.b_message).b |= 1;
            if(!giqx0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giqx0).ensureMutable();
            }
            girb girb0 = (girb)giqx0.b_message;
            giqy giqy0 = (giqy)hftp0.N_build();
            giqy0.getClass();
            girb0.p = giqy0;
            girb0.b |= 0x2000;
            throw remoteException0;
        }
        try {
            TreeMap treeMap2 = new TreeMap();
            Iterator iterator1 = map0.keySet().iterator();
            while(true) {
                v = 0;
                if(!iterator1.hasNext()) {
                    break;
                }
                Object object1 = iterator1.next();
                Long long1 = (Long)object1;
                String s1 = (String)map0.get(long1);
                if(treeMap1.containsKey(long1)) {
                }
                else if(treeMap2.containsKey(s1)) {
                    treeMap1.put(long1, ((Long)treeMap2.get(s1)));
                }
                else if(z) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("title", s1);
                    contentValues0.put("group_visible", Integer.valueOf(1));
                    Uri uri0 = ehab.d(ContactsContract.Groups.CONTENT_URI, account0, false);
                    Uri uri1 = ehbp1.b(uri0, contentValues0);
                    if(uri1 == null) {
                        throw new RemoteException("ContentResolver.insert returns null Uri. Uri to insert: %s" + uri0);
                    }
                    Long long2 = ContentUris.parseId(uri1);
                    treeMap1.put(long1, long2);
                    treeMap2.put(s1, long2);
                    int v1 = ((girb)giqx0.b_message).f + 1;
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb1 = (girb)giqx0.b_message;
                    girb1.b |= 16;
                    girb1.f = v1;
                }
                else {
                    ContentValues contentValues1 = new ContentValues();
                    contentValues1.put("account_name", account0.name);
                    contentValues1.put("account_type", account0.type);
                    contentValues1.putNull("sourceid");
                    ehbp1.e(ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, long1.longValue()), contentValues1, "system_id IS NULL AND group_is_read_only IS 0");
                    treeMap2.put(s1, long1);
                    int v2 = ((girb)giqx0.b_message).e + 1;
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb2 = (girb)giqx0.b_message;
                    girb2.b |= 4;
                    girb2.e = v2;
                }
            }
        }
        catch(RemoteException remoteException1) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giqy.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((giqy)hftp1.b_message).c = (z ? 5 : 3) - 1;
            ((giqy)hftp1.b_message).b |= 1;
            giqy giqy1 = (giqy)hftp1.N_build();
            if(!giqx0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giqx0).ensureMutable();
            }
            girb girb3 = (girb)giqx0.b_message;
            giqy1.getClass();
            girb3.p = giqy1;
            girb3.b |= 0x2000;
            throw remoteException1;
        }
        try {
            long v3 = hxba.a.e().k();
            for(Object object2: treeMap1.entrySet()) {
                ((Map.Entry)object2).getKey();
                ((Map.Entry)object2).getValue();
                int v4 = ehfs0.a(((Long)((Map.Entry)object2).getKey()).longValue(), ((Long)((Map.Entry)object2).getValue()).longValue(), v3);
                if(v4 >= 0) {
                    v += v4;
                }
            }
            if(v <= 0) {
                goto label_130;
            }
            else if(z) {
                if(!giqx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giqx0).ensureMutable();
                }
                girb girb4 = (girb)giqx0.b_message;
                girb4.b |= 0x100;
                girb4.j = v;
                goto label_131;
            }
            else {
                if(!giqx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giqx0).ensureMutable();
                }
                girb girb5 = (girb)giqx0.b_message;
                girb5.b |= 0x200;
                girb5.k = v;
                goto label_139;
            }
            return;
        }
        catch(RemoteException remoteException2) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giqy.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((giqy)hftp2.b_message).c = (1 == z ? 6 : 4) - 1;
            ((giqy)hftp2.b_message).b |= 1;
            giqy giqy2 = (giqy)hftp2.N_build();
            if(!giqx0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giqx0).ensureMutable();
            }
            girb girb6 = (girb)giqx0.b_message;
            giqy2.getClass();
            girb6.p = giqy2;
            girb6.b |= 0x2000;
            throw remoteException2;
        }
    label_130:
        if(z) {
        label_131:
            if(!treeMap1.isEmpty()) {
                int v5 = treeMap1.size();
                if(!giqx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giqx0).ensureMutable();
                }
                girb girb7 = (girb)giqx0.b_message;
                girb7.b |= 0x80;
                girb7.i = v5;
            }
        }
        else {
        label_139:
            Set set0 = treeMap1.keySet();
            int v6 = ehbp1.d(ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build(), String.format("(%s) AND (_id in (%s))", "system_id IS NULL AND group_is_read_only IS 0", TextUtils.join(",", ggia.h(new ArrayList(set0), new ehat()))));
            if(v6 > 0) {
                if(!giqx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giqx0).ensureMutable();
                }
                girb girb8 = (girb)giqx0.b_message;
                girb8.b |= 0x20;
                girb8.g = v6;
            }
            if(treeMap1.size() > v6) {
                int v7 = treeMap1.size() - v6;
                if(!giqx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giqx0).ensureMutable();
                }
                girb girb9 = (girb)giqx0.b_message;
                girb9.b |= 0x40;
                girb9.h = v7;
            }
        }
    }
}

