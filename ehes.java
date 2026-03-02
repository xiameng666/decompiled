import android.accounts.Account;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContactsEntity;
import android.text.TextUtils;
import com.google.android.gms.people.cpg.callingcard.storage.CallingCardDatabase;
import j..util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import jeb.synthetic.TWR;

public final class ehes extends ehew {
    public static final String[] a;
    public final ehcs b;
    public final ehab c;
    public final ehgd d;
    public final Uri e;
    public final Context f;
    public final ehdl g;
    public final egzo h;
    private final ehfz n;

    static {
        ehes.a = new String[]{"_id"};
    }

    public ehes(Context context0, ehcs ehcs0, ehbp ehbp0, Account account0, ehim ehim0, egzp egzp0, ehfz ehfz0, ehif ehif0, ehdl ehdl0) {
        super(ehbp0, account0, ehim0, ehif0, egzp0);
        this.f = context0;
        this.b = ehcs0;
        this.n = ehfz0;
        ehab ehab0 = new ehab(account0, ehbp0, ehim0);
        this.c = ehab0;
        this.d = new ehgd(account0, this.i, ehab0, egzp0);
        this.e = ehab.c(ContactsContract.Data.CONTENT_URI, account0);
        this.g = ehdl0;
        this.h = egzo.a();
    }

    public final int a(ehaf ehaf0, boolean z) {
        String s = "FSA_photoSyncUp";
        this.m.a();
        int v = ehaf0.e();
        this.g.e(z, gjgi.d, v);
        int v1 = 0;
        try {
            for(ContentProviderOperation.Builder contentProviderOperation$Builder0 = (ContentProviderOperation.Builder)ehaf0.b(); contentProviderOperation$Builder0 != null; contentProviderOperation$Builder0 = (ContentProviderOperation.Builder)ehaf0.b()) {
                ehab ehab0 = this.c;
                ehab0.e(contentProviderOperation$Builder0);
                if(z) {
                    ehab0.f();
                }
                else {
                    ehab0.h();
                }
                ++v1;
            }
            if(!z) {
                this.c.f();
            }
        }
        finally {
            this.g.c();
            ehif ehif0 = this.m;
            if(z) {
                s = "FSA_photoSyncDown";
            }
            ehif0.b(s, v1);
        }
        return v;
    }

    @Override  // ehew
    public final void b() {
        ehcr ehcr1;
        byte[] arr_b;
        int v6;
        Cursor cursor1;
        Iterator iterator1;
        HashMap hashMap2;
        ggfp ggfp0;
        HashMap hashMap1;
        gged_interceptors gged0;
        HashMap hashMap0;
        Account account0;
        ehbp ehbp0;
        Context context0;
        Cursor cursor0 = this.i.a(this.e, ehak.b, "mimetype=\'vnd.android.cursor.item/photo\' AND sourceid IS NOT NULL AND (data_sync4 IS NULL OR data_sync4!=(data_version+10)) ", null, null);
        if(cursor0 != null) {
            try(ehak ehak0 = new ehak(cursor0, this.b, this.k, this.l, this.n, this.g)) {
                this.a(ehak0, false);
            }
            if(((ehiv)this.k).D) {
                try {
                    context0 = this.f;
                    ehbp0 = this.i;
                    account0 = this.j;
                    hashMap0 = new HashMap();
                    gged0 = hwyi.n() ? ((gged_interceptors)oqj.b(CallingCardDatabase.v().u().a, true, false, new egeb())) : ggna.a;
                    if(gged0.isEmpty()) {
                        egig.e("FSA2_CallingCardOp", "No calling card photos to sync up.");
                        hashMap0 = new HashMap();
                    }
                    else {
                        hashMap1 = new HashMap();
                        ggfp0 = ggfp.K("x_calling_card_id", "x_sync5");
                        goto label_22;
                    }
                    goto label_102;
                }
                catch(egdi egdi0) {
                    goto label_183;
                }
                try {
                label_22:
                    ggqk ggqk0 = egda.b(context0, gged0, ggfp0).E();
                    while(true) {
                        if(!ggqk0.hasNext()) {
                            goto label_37;
                        }
                        Object object0 = ggqk0.next();
                        Long long0 = ((ContentValues)object0).getAsLong("x_calling_card_id");
                        String s = ((ContentValues)object0).getAsString("x_sync5");
                        if(long0 != null) {
                            if(s == null) {
                                s = "";
                            }
                            hashMap1.put(long0, s);
                        }
                        ggqk0 = ggqk0;
                    }
                }
                catch(egdi egdi1) {
                    try {
                        egig.c("FSA2_CallingCardOp", "Failed to get calling card content values", egdi1);
                        hashMap0 = new HashMap();
                        goto label_102;
                    label_37:
                        if(hashMap1.isEmpty()) {
                            goto label_100;
                        }
                        else {
                            hashMap2 = new HashMap();
                            String s1 = eham.b(gged0);
                            StringBuilder stringBuilder0 = new StringBuilder();
                            stringBuilder0.append("sourceid IN (");
                            int v = 0;
                            Iterator iterator0 = hashMap1.values().iterator();
                            while(iterator0.hasNext()) {
                                Object object1 = iterator0.next();
                                String s2 = (String)object1;
                                if(!TextUtils.isEmpty(s2)) {
                                    if(v > 0) {
                                        iterator1 = iterator0;
                                        stringBuilder0.append(",");
                                    }
                                    else {
                                        iterator1 = iterator0;
                                    }
                                    DatabaseUtils.appendEscapedSQLString(stringBuilder0, s2);
                                    ++v;
                                    iterator0 = iterator1;
                                }
                            }
                            stringBuilder0.append(")");
                            if(!hashMap1.values().isEmpty()) {
                                s1 = s1 + " OR " + stringBuilder0.toString();
                            }
                            cursor1 = ehbp0.a(ehab.c(ContactsContract.RawContactsEntity.CONTENT_URI, account0), new String[]{"sourceid", "deleted", "data1", "mimetype"}, s1, null, null);
                            goto label_61;
                        }
                        goto label_102;
                    }
                    catch(egdi egdi0) {
                        goto label_183;
                    }
                }
                try {
                label_61:
                    if(cursor1 == null) {
                        goto label_94;
                    }
                    else {
                        while(true) {
                            if(!cursor1.moveToNext()) {
                                goto label_77;
                            }
                            String s3 = cursor1.getString(0);
                            int v1 = cursor1.getInt(1);
                            long v2 = cursor1.getLong(2);
                            String s4 = cursor1.getString(3);
                            if(TextUtils.isEmpty(s3) || v1 != 0) {
                            }
                            else if(Objects.equals(s4, "vnd.android.cursor.item/calling_card")) {
                                Long long1 = v2;
                                hashMap2.put(s3, long1);
                                if(!TextUtils.isEmpty(((CharSequence)hashMap1.get(long1)))) {
                                    continue;
                                }
                                hashMap1.put(long1, s3);
                            }
                            else {
                                if(hashMap2.containsKey(s3)) {
                                    continue;
                                }
                                hashMap2.put(s3, Long.valueOf(0L));
                            }
                        }
                    }
                    goto label_102;
                }
                catch(Throwable throwable1) {
                    goto label_98;
                }
                try {
                label_77:
                    cursor1.close();
                    for(Object object2: hashMap1.entrySet()) {
                        Long long2 = (Long)((Map.Entry)object2).getKey();
                        String s5 = (String)((Map.Entry)object2).getValue();
                        if(!TextUtils.isEmpty(s5) && hashMap2.containsKey(s5)) {
                            Long long3 = (Long)hashMap2.get(s5);
                            if(((long)long3) == 0L) {
                                hashMap0.put(long2, new ehal(s5, true, true));
                            }
                            else if(long3.equals(long2)) {
                                hashMap0.put(long2, new ehal(s5, false, false));
                            }
                            else {
                                hashMap0.put(long2, new ehal("", false, true));
                            }
                        }
                    }
                }
                catch(egdi egdi0) {
                    goto label_183;
                }
                goto label_102;
                try {
                label_94:
                    egig.b("FSA2_CallingCardOp", "Couldn\'t get the cursor when query calling card and contact id.");
                    hashMap0 = new HashMap();
                    goto label_102;
                }
                catch(Throwable throwable1) {
                    try {
                    label_98:
                        TWR.safeClose$NT(cursor1, throwable1);
                        throw throwable1;
                    label_100:
                        egig.e("FSA2_CallingCardOp", "No calling card photos to sync up.");
                        hashMap0 = new HashMap();
                    label_102:
                        ggfp ggfp1 = ggfp.N("x_calling_card_id", "x_calling_card_file_uuid", "x_calling_card_file_uri", "x_data_version", "x_deleted");
                        Context context1 = this.f;
                        gged_interceptors gged1 = egda.b(context1, gged_interceptors.i(hashMap0.keySet()), ggfp1);
                        int v3 = ((ggna)gged1).c;
                        int v4 = 0;
                        while(true) {
                            if(v4 >= v3) {
                                return;
                            }
                            ContentValues contentValues0 = (ContentValues)gged1.get(v4);
                            Long long4 = contentValues0.getAsLong("x_calling_card_id");
                            String s6 = contentValues0.getAsString("x_calling_card_file_uuid");
                            String s7 = contentValues0.getAsString("x_calling_card_file_uri");
                            Long long5 = contentValues0.getAsLong("x_data_version");
                            Integer integer0 = contentValues0.getAsInteger("x_deleted");
                            int v5 = integer0 == null || ((int)integer0) != 1 ? 0 : 1;
                            if(long4 == null) {
                                egig.b("FSA2_PhotoSyncer", "Calling card id is null");
                            }
                            else {
                                ehal ehal0 = (ehal)hashMap0.get(long4);
                                if(ehal0 == null) {
                                    egig.d("FSA2_PhotoSyncer", "Null operation for calling card %d", new Object[]{long4});
                                }
                                else {
                                    String s8 = ehal0.a;
                                    if(TextUtils.isEmpty(s8)) {
                                        if(ehal0.c) {
                                            egig.i("FSA2_PhotoSyncer", "No contact to sync for calling card %d, Deleted: %s", long4, Boolean.valueOf(egda.d(context1, long4.longValue())));
                                            goto label_180;
                                        }
                                        else {
                                            v6 = v5;
                                            goto label_126;
                                        }
                                        goto label_125;
                                    }
                                    else {
                                    label_125:
                                        v6 = v5;
                                    }
                                label_126:
                                    if(TextUtils.isEmpty(s8)) {
                                        egig.g("FSA2_PhotoSyncer", "Empty contact id to sync for calling card %d", long4);
                                    }
                                    else {
                                        if(v6 == 0) {
                                            if(s6 != null && s7 != null) {
                                                try {
                                                    arr_b = this.n.a(Uri.parse(s7));
                                                    goto label_143;
                                                }
                                                catch(IOException iOException0) {
                                                    egig.c("FSA2_PhotoSyncer", "Failed to read photo from uri", iOException0);
                                                    this.d(girk.c, false);
                                                    this.e(girk.c, false);
                                                    ehim ehim0 = this.k;
                                                    ehim0.r(gjgi.j, girk.c, "READ_CPG_PHOTO_FAILED", iOException0);
                                                    ++((ehiv)ehim0).a.stats.numIoExceptions;
                                                    goto label_180;
                                                }
                                            }
                                            else {
                                                egig.e("FSA2_PhotoSyncer", "Null calling card file, should delete the CCC photo.");
                                            }
                                        }
                                        arr_b = null;
                                    label_143:
                                        ehcr ehcr0 = new ehcr(null, null);
                                        girk girk0 = arr_b == null || ehal0.b ? girk.d : girk.c;
                                        this.d(girk0, false);
                                        if(girk0 == girk.d) {
                                            try {
                                                this.b.d(s8, 6);
                                                egig.g("FSA2_PhotoSyncer", "Deleted calling card photo for contact %s", s8);
                                                ehcr1 = ehcr0;
                                                goto label_159;
                                            label_151:
                                                gftb.check(arr_b);
                                                ehcr1 = this.b.c(s8, arr_b, 6);
                                                goto label_159;
                                            }
                                            catch(iapl | acse | ehfd exception0) {
                                            }
                                            goto label_155;
                                        }
                                        else {
                                            goto label_151;
                                        label_155:
                                            egig.c("FSA2_PhotoSyncer", "Failed to sync up calling card photo", exception0);
                                            if(ehfl.a(false, gjgi.j, girk0, exception0, this.k, 1) == girk.d) {
                                                ehcr1 = ehcr0;
                                                v6 = 1;
                                            label_159:
                                                if(v6 == 0 && !ehal0.c) {
                                                    egcs egcs0 = egct.a();
                                                    if(long5 != null) {
                                                        egcs0.j = long5;
                                                    }
                                                    String s9 = ehcr1.b == null ? "" : ehcr1.b;
                                                    String s10 = ehcr1.a == null ? "" : ehcr1.a;
                                                    if(s6 == null) {
                                                        s6 = "";
                                                    }
                                                    egcs0.d(1, s9);
                                                    egcs0.d(2, s10);
                                                    egcs0.d(3, s10);
                                                    egcs0.d(4, s6);
                                                    egcs0.d(5, s8);
                                                    egct egct0 = egcs0.a();
                                                    egig.i("FSA2_PhotoSyncer", "Updated calling card %d: %s", long4, Boolean.valueOf(egda.e(this.f, long4.longValue(), egct0, true)));
                                                }
                                                else {
                                                    egig.i("FSA2_PhotoSyncer", "Deleted calling card %d: %s", long4, Boolean.valueOf(egda.d(this.f, long4.longValue())));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        label_180:
                            ++v4;
                        }
                    }
                    catch(egdi egdi0) {
                    }
                }
            label_183:
                egig.c("FSA2_PhotoSyncer", "Failed to sync up calling card photos", egdi0);
            }
            return;
        }
        egig.b("FSA2_SyncUpPhotoCursor", "Failed to query photos need to sync up in CP2.");
        throw new ehfh(new RemoteException("Unable to query CP2."));
    }

    public final void d(girk girk0, boolean z) {
        this.k.h(girk0, gjgi.j, z, 1, 1);
    }

    public final void e(girk girk0, boolean z) {
        this.k.h(girk0, gjgi.j, z, 2, 1);
    }

    final void f(String s, gjgi gjgi0) {
        int v = this.h(s);
        this.k.v(gjgi0, 3, 2, v);
    }

    final void g(String s, int v, int v1) {
        int v2 = this.h(s);
        if(v2 < 0) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisa.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gisa)hftv0).c = v - 1;
        ((gisa)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gisa)hftv1).d = v1 - 1;
        ((gisa)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehim ehim0 = this.k;
        gisa gisa0 = (gisa)hftp0.b_message;
        gisa0.b |= 4;
        gisa0.e = v2;
        gisa gisa1 = (gisa)hftp0.N_build();
        ehit ehit0 = new ehit(v, v1);
        ((ehiv)ehim0).f.put(ehit0, gisa1);
    }

    private final int h(String s) {
        try(Cursor cursor0 = this.i.a(this.e, ehes.a, s, null, null)) {
            if(cursor0 == null) {
                TWR.useResource$NT(null);
                egig.b("FSA2_PhotoSyncer", "Couldn\'t get the photo cursor.");
                return -1;
            }
            return cursor0.getCount();
        }
        catch(Exception exception0) {
            egig.c("FSA2_PhotoSyncer", "Exception found when query photo count", exception0);
            return -1;
        }
    }
}

