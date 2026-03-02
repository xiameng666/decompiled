import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.net.Uri;
import android.os.LocaleList;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Groups;
import android.provider.ContactsContract.RawContacts;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class egni extends cjtm {
    public final ImportSimContactsRequest a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    private final efzc d;
    private final baqr e;
    private final Resources f;
    private final gmcg g;
    private final egns h;
    private final egnv i;
    private final egna j;
    private final efpr n;
    private final int o;
    private Uri p;
    private final egnk q;

    public egni(Context context0, baqr baqr0, gmcg gmcg0, ImportSimContactsRequest importSimContactsRequest0, egns egns0, egnv egnv0, egna egna0, efpr efpr0, egnk egnk0, efzc efzc0, azug azug0) {
        super(5, "ImportSimContacts", azug0);
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
        this.p = null;
        this.e = baqr0;
        this.f = context0.getResources();
        this.g = gmcg0;
        this.a = importSimContactsRequest0;
        this.h = egns0;
        this.i = egnv0;
        this.j = egna0;
        this.n = efpr0;
        this.q = egnk0;
        this.d = efzc0;
        this.o = egno.a(context0, baqr0, new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"});
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        Locale locale0;
        ArrayList arrayList2;
        ArrayList arrayList1;
        Set set0;
        if(this.o != 0) {
            throw new cjuh(17, "Missing require permissions");
        }
        ContentResolver contentResolver0 = context0.getContentResolver();
        ArrayList arrayList0 = new ArrayList();
        try {
            ImportSimContactsRequest importSimContactsRequest0 = this.a;
            set0 = importSimContactsRequest0.a;
            for(Object object0: set0) {
                arrayList0.addAll(this.h.a(new egnt(((int)(((Integer)object0))), 1)));
            }
            egnv egnv0 = this.i;
            egnv0.c(arrayList0);
            arrayList1 = new ArrayList();
            for(Object object1: ((egnu)egnv0).a) {
                egnp egnp0 = (egnp)object1;
                BitSet bitSet0 = (BitSet)((egnu)egnv0).c.get(egnp0.a);
                if(bitSet0 == null || !bitSet0.get(egnp0.b)) {
                    arrayList1.add(egnp0);
                }
            }
            this.c.set(arrayList1.size());
            if(arrayList1.isEmpty()) {
                arrayList2 = arrayList0;
            }
            else {
                AccountWithDataSet accountWithDataSet0 = importSimContactsRequest0.b;
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("account_name", accountWithDataSet0.a());
                contentValues0.put("account_type", accountWithDataSet0.b());
                String s = accountWithDataSet0.b;
                contentValues0.put("data_set", s);
                Date date0 = new Date(System.currentTimeMillis());
                Resources resources0 = this.f;
                Configuration configuration0 = resources0.getConfiguration();
                LocaleList localeList0 = configuration0.getLocales();
                arrayList2 = arrayList0;
                if(localeList0.isEmpty()) {
                    locale0 = configuration0.locale == null ? Locale.getDefault() : configuration0.locale;
                }
                else {
                    locale0 = localeList0.get(0);
                }
                contentValues0.put("title", resources0.getString(0x7F152569, new Object[]{DateFormat.getInstanceForSkeleton("Md", locale0).format(date0)}));  // string:people_imported_on_date_sim_label "Imported on %s"
                Uri uri0 = contentResolver0.insert(ContactsContract.Groups.CONTENT_URI, contentValues0);
                this.p = uri0;
                if(uri0 == null) {
                    throw new cjuh(8, "Failed to create group");
                }
                long v = ContentUris.parseId(uri0);
                ArrayList arrayList3 = new ArrayList(4);
                for(Object object2: arrayList1) {
                    egnp egnp1 = (egnp)object2;
                    arrayList3.clear();
                    arrayList3.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_name", accountWithDataSet0.a()).withValue("account_type", accountWithDataSet0.b()).withValue("data_set", s).build());
                    if(egnp1.a()) {
                        arrayList3.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", egnp1.c).build());
                    }
                    arrayList3.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", egnp1.d).build());
                    arrayList3.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Long.valueOf(v)).build());
                    contentResolver0.applyBatch("com.android.contacts", arrayList3);
                    this.b.incrementAndGet();
                }
            }
        }
        catch(OperationApplicationException operationApplicationException0) {
            throw new cjuh(8, "Error importing contacts", null, operationApplicationException0);
        }
        int v1 = arrayList1.size();
        if(!arrayList2.isEmpty()) {
            try {
                this.j.b(set0).get();
            }
            catch(InterruptedException | ExecutionException exception0) {
                throw new cjuh(8, "Failed to load recent imports", null, exception0);
            }
        }
        this.q.c(this);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
        this.d.o(Status.b, v1, apiMetadata0);
        AccountWithDataSet accountWithDataSet1 = this.a.b;
        String s1 = "com.google".equals(accountWithDataSet1.b()) ? accountWithDataSet1.a() : null;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gipj.a).v_newBuilder();
        int v2 = this.a.a.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gipj)hftv0).b |= 1;
        ((gipj)hftv0).c = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gipj gipj0 = (gipj)hftp0.b_message;
        gipj0.b |= 2;
        gipj0.d = v1;
        gipj gipj1 = (gipj)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gisr gisr0 = (gisr)hftp1.b_message;
        gipj1.getClass();
        gisr0.E = gipj1;
        gisr0.b |= 0x4000000;
        efpt.b(s1, hftp1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
        this.d.o(status0, 0, apiMetadata0);
        this.q.c(this);
    }

    @Override  // cjtm
    protected final ExecutorService r() {
        return this.g;
    }
}

