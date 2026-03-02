import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.provider.ContactsContract.RawContactsEntity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

final class egnu implements egnv {
    public List a;
    boolean b;
    public final Map c;
    private static final bboh d;
    private final ContentResolver e;
    private final gqiv f;
    private final AccountWithDataSet g;
    private long[] h;

    static {
        egnu.d = bboh.b("SimCp2Intersect", bbcu.f);
    }

    public egnu(ContentResolver contentResolver0, gqiv gqiv0, AccountWithDataSet accountWithDataSet0) {
        this.h = null;
        this.a = ggna.a;
        this.b = false;
        this.c = new HashMap();
        this.e = contentResolver0;
        this.g = accountWithDataSet0;
        this.f = gqiv0;
    }

    public final Cursor a(String s, String[] arr_s) {
        try {
            ehbh ehbh0 = new ehbh();
            ehbh0.f("mimetype", s);
            ehbh0.e();
            ehbh0.i("account_name", this.g.a());
            ehbh0.e();
            ehbh0.i("account_type", this.g.b());
            ehbh0.e();
            ehbh0.i("data_set", this.g.b);
            Uri uri0 = ContactsContract.RawContactsEntity.CONTENT_URI;
            String[] arr_s1 = ehbh0.c();
            return this.e.query(uri0, arr_s, ehbh0.a(), arr_s1, null);
        }
        catch(SQLiteException | IllegalArgumentException unused_ex) {
            long[] arr_v = this.h;
            if(arr_v == null) {
                ehbh ehbh1 = new ehbh();
                ehbh1.i("account_name", this.g.a());
                ehbh1.e();
                ehbh1.i("account_type", this.g.b());
                ehbh1.e();
                ehbh1.i("data_set", this.g.b);
                Uri uri1 = ContactsContract.RawContacts.CONTENT_URI;
                String[] arr_s2 = ehbh1.c();
                Cursor cursor0 = this.e.query(uri1, new String[]{"_id"}, ehbh1.a(), arr_s2, null);
                try {
                    if(cursor0 == null) {
                        goto label_32;
                    }
                    else {
                        arr_v = new long[cursor0.getCount()];
                        while(cursor0.moveToNext()) {
                            int v1 = cursor0.getPosition();
                            arr_v[v1] = cursor0.getLong(0);
                        }
                        this.h = arr_v;
                        goto label_30;
                    }
                    goto label_38;
                }
                catch(Throwable throwable0) {
                    goto label_36;
                }
            label_30:
                cursor0.close();
                goto label_38;
                try {
                label_32:
                    arr_v = new long[0];
                    this.h = arr_v;
                }
                catch(Throwable throwable0) {
                label_36:
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
        label_38:
            ehbh ehbh2 = new ehbh();
            ehbh2.f("mimetype", s);
            ehbh2.e();
            if(arr_v != null) {
                ehbh2.b();
                StringBuilder stringBuilder0 = ehbh2.a;
                stringBuilder0.append("_id IN (");
                if(arr_v.length == 0) {
                    stringBuilder0.append(')');
                }
                else {
                    for(int v = 0; v < arr_v.length; ++v) {
                        stringBuilder0.append(arr_v[v]);
                        stringBuilder0.append(',');
                    }
                    stringBuilder0.deleteCharAt(stringBuilder0.length() - 1).append(')');
                }
            }
            Uri uri2 = ContactsContract.RawContactsEntity.CONTENT_URI;
            String[] arr_s3 = ehbh2.c();
            return this.e.query(uri2, arr_s, ehbh2.a(), arr_s3, null);
        }
    }

    static String b(String s) {
        return s.length() >= 7 ? s.substring(s.length() - 7) : s;
    }

    @Override  // egnv
    public final void c(List list0) {
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray0;
        this.a = list0;
        if(!list0.isEmpty()) {
            gfza gfza0 = new gfza(this.a.size(), 1);
            for(Object object0: this.a) {
                gfza0.v(((egnp)object0).c, ((egnp)object0));
            }
            this.b = gfza0.u("");
            Cursor cursor0 = this.a("vnd.android.cursor.item/name", new String[]{"_id", "data1"});
            try {
                if(cursor0 == null) {
                    goto label_26;
                }
                else {
                    longSparseArray0 = new LongSparseArray(this.a.size());
                    while(true) {
                    label_13:
                        if(!cursor0.moveToNext()) {
                            goto label_23;
                        }
                        long v1 = cursor0.getLong(0);
                        String s = cursor0.getString(1);
                        if(s == null) {
                            continue;
                        }
                        Iterator iterator1 = gfza0.g(s).iterator();
                        while(true) {
                            if(!iterator1.hasNext()) {
                                goto label_22;
                            }
                            Object object1 = iterator1.next();
                            egnu.e(longSparseArray0, v1, ((egnp)object1));
                        }
                        goto label_23;
                    }
                }
                goto label_32;
            }
            catch(Throwable throwable0) {
                goto label_30;
            }
        label_22:
            goto label_13;
        label_23:
            cursor0.close();
            LongSparseArray longSparseArray1 = longSparseArray0;
            goto label_32;
            try {
            label_26:
                ((ggtj)egnu.d.j()).B("Query of %s returned null cursor", ContactsContract.Data.CONTENT_URI);
                longSparseArray1 = new LongSparseArray(0);
            }
            catch(Throwable throwable0) {
            label_30:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_32:
            gfza gfza1 = new gfza(this.a.size(), 1);
            for(Object object2: this.a) {
                gfza1.v(egnu.b(((egnp)object2).d), ((egnp)object2));
            }
            Cursor cursor1 = this.a("vnd.android.cursor.item/phone_v2", new String[]{"_id", "data1", "data4"});
            try {
                if(cursor1 == null) {
                    goto label_64;
                }
                else {
                    longSparseArray2 = new LongSparseArray(this.a.size());
                    while(true) {
                    label_41:
                        if(!cursor1.moveToNext()) {
                            goto label_61;
                        }
                        long v2 = cursor1.getLong(0);
                        String s1 = cursor1.getString(1);
                        if(TextUtils.isEmpty(s1)) {
                            continue;
                        }
                        String s2 = cursor1.getString(2);
                        Collection collection0 = TextUtils.isEmpty(s2) ? gfza1.g(egnu.b(s1)) : gfza1.g(egnu.b(s2));
                        if(collection0.isEmpty()) {
                            collection0 = (Collection)longSparseArray1.get(v2, ggnj.a);
                        }
                        Iterator iterator3 = collection0.iterator();
                        while(true) {
                            if(!iterator3.hasNext()) {
                                goto label_60;
                            }
                            Object object3 = iterator3.next();
                            egnp egnp0 = (egnp)object3;
                            String s3 = egnp0.d;
                            if(!TextUtils.equals(s3, s1) && !TextUtils.equals(s3, s2)) {
                                switch(this.f.o(s3, s1)) {
                                    case 1: 
                                    case 2: {
                                        continue;
                                    }
                                    default: {
                                        egnu.e(longSparseArray2, v2, egnp0);
                                        continue;
                                    }
                                }
                            }
                            else {
                                egnu.e(longSparseArray2, v2, egnp0);
                                continue;
                            }
                            goto label_60;
                        }
                        goto label_61;
                    }
                }
                goto label_70;
            }
            catch(Throwable throwable1) {
                goto label_68;
            }
        label_60:
            goto label_41;
        label_61:
            cursor1.close();
            LongSparseArray longSparseArray3 = longSparseArray2;
            goto label_70;
            try {
            label_64:
                ((ggtj)egnu.d.j()).B("Query of %s returned null cursor", ContactsContract.Data.CONTENT_URI);
                longSparseArray3 = new LongSparseArray(0);
            }
            catch(Throwable throwable1) {
            label_68:
                TWR.safeClose$NT(cursor1, throwable1);
                throw throwable1;
            }
        label_70:
            this.c.clear();
            int v3 = 0;
            int v4 = 0;
            while(v3 < longSparseArray3.size() && v4 < longSparseArray1.size()) {
                long v5 = longSparseArray3.keyAt(v3);
                long v6 = longSparseArray1.keyAt(v4);
                if(v5 < v6) {
                    ++v3;
                }
                else {
                    if(v6 >= v5) {
                        Collection collection1 = (Collection)longSparseArray1.valueAt(v4);
                        for(Object object4: ((Collection)longSparseArray3.valueAt(v3))) {
                            egnp egnp1 = (egnp)object4;
                            if(collection1.contains(egnp1)) {
                                this.d(egnp1);
                            }
                        }
                        ++v3;
                    }
                    ++v4;
                }
            }
            if(this.b) {
                for(int v = 0; v < longSparseArray3.size(); ++v) {
                    for(Object object5: ((Collection)longSparseArray3.valueAt(v))) {
                        egnp egnp2 = (egnp)object5;
                        if(!egnp2.a()) {
                            this.d(egnp2);
                        }
                    }
                }
            }
            return;
        }
        this.c.clear();
    }

    private final void d(egnp egnp0) {
        Map map0 = this.c;
        egnt egnt0 = egnp0.a;
        BitSet bitSet0 = (BitSet)map0.get(egnt0);
        if(bitSet0 == null) {
            bitSet0 = new BitSet();
            map0.put(egnt0, bitSet0);
        }
        bitSet0.set(egnp0.b);
    }

    private static final void e(LongSparseArray longSparseArray0, long v, egnp egnp0) {
        Set set0 = (Set)longSparseArray0.get(v);
        if(set0 == null) {
            set0 = new bxf(1);
            longSparseArray0.append(v, set0);
        }
        set0.add(egnp0);
    }
}

