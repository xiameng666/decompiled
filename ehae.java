import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.RemoteException;
import android.provider.ContactsContract.RawContactsEntity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ehae extends ehaf {
    private static final String[] b;
    private final Context c;
    private final Set d;
    private final Set e;
    private final boolean f;
    private int g;

    static {
        ehae.b = new String[]{"data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "data_sync1", "data_sync2", "data_sync3", "data_sync4"};
    }

    private ehae(Context context0, Cursor cursor0, Set set0) {
        super(cursor0);
        this.g = 0;
        this.c = context0;
        this.d = set0;
        this.e = new HashSet();
        this.f = true;
        this.m();
    }

    private ehae(Context context0, Cursor cursor0, Set set0, Set set1) {
        super(cursor0);
        this.g = 0;
        this.c = context0;
        this.d = set0;
        this.e = set1;
        this.f = false;
        this.m();
    }

    public final egzv a() {
        long v2;
        egzu egzu1;
        Cursor cursor1;
        Cursor cursor0 = this.a;
        if(!cursor0.isAfterLast()) {
            Long long0 = this.g("_id");
            long v = (long)long0;
            String s = this.h("sourceid");
            egzu egzu0 = new egzu();
            egzu0.e = long0;
            egzu0.a = s;
            egzu0.f = this.g("version");
            egzu0.d = this.g("sync3");
            if(s == null) {
                egzu0.c = this.h("sync2");
            }
            else {
                egzu0.b = this.h("sync2");
            }
            if(this.j("dirty")) {
                egzu0.g = true;
            }
            if(this.j("starred")) {
                egzu0.i = true;
            }
            if(this.j("deleted")) {
                egzu0.A();
            }
            egzu0.m = this.f();
            while(((long)this.g("_id")) == v) {
                String s1 = this.h("mimetype");
                if(!TextUtils.isEmpty(s1) && (!ehjs.i(this.d) && this.d.contains(s1))) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("mimetype", s1);
                    this.n(contentValues0, "data_id");
                    this.n(contentValues0, "data_version");
                    this.n(contentValues0, "is_primary");
                    if(TextUtils.equals(s1, "vnd.android.cursor.item/group_membership")) {
                        if(this.f) {
                            this.o(contentValues0, "group_sourceid");
                        }
                        else {
                            egiv.R();
                            boolean z = hwzc.a.c().aH();
                            Boolean.valueOf(z).getClass();
                            if(z) {
                                Long long1 = this.g("data1");
                                if(this.e.contains(long1)) {
                                    this.o(contentValues0, "group_sourceid");
                                    goto label_44;
                                }
                                else {
                                    contentValues0 = null;
                                    goto label_58;
                                }
                                goto label_43;
                            }
                            else {
                            label_43:
                                this.o(contentValues0, "group_sourceid");
                            }
                        }
                    }
                label_44:
                    String[] arr_s = ehae.b;
                    int v1 = 0;
                    while(v1 < 19) {
                        String s2 = arr_s[v1];
                        switch(cursor0.getType(cursor0.getColumnIndexOrThrow(s2))) {
                            case 0: {
                                break;
                            }
                            case 1: 
                            case 2: 
                            case 3: {
                                this.o(contentValues0, s2);
                                break;
                            }
                            case 4: {
                                byte[] arr_b = this.l(s2);
                                if(arr_b != null) {
                                    contentValues0.put(s2, arr_b);
                                }
                                break;
                            }
                            default: {
                                throw new IllegalStateException("Invalid or unhandled data type");
                            }
                        }
                        ++v1;
                        cursor0 = cursor0;
                    }
                label_58:
                    cursor1 = cursor0;
                    String s3 = s1.substring(s1.lastIndexOf("/") + 1);
                    switch(s1.hashCode()) {
                        case 0x98E57A2C: {
                            v2 = v;
                            if(s1.equals("vnd.com.google.cursor.item/contact_file_as")) {
                                egzu0.i(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xA272C504: {
                            v2 = v;
                            if(s1.equals("vnd.android.cursor.item/email_v2")) {
                                egzu0.e(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xB0CDE9D6: {
                            v2 = v;
                            if(s1.equals("vnd.android.cursor.item/contact_event")) {
                                String s4 = contentValues0.getAsString("data2");
                                if(!hxcf.d()) {
                                    efuo.h(contentValues0, false);
                                }
                                if("3".equals(s4)) {
                                    egzu0.a(contentValues0);
                                }
                                else {
                                    egzu0.f(contentValues0);
                                }
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xB80B32E6: {
                            v2 = v;
                            if(s1.equals("vnd.com.google.cursor.item/contact_external_id")) {
                                egzu0.h(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xBFAC5810: {
                            v2 = v;
                            if(s1.equals("vnd.android.cursor.item/name")) {
                                egzu0.q(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case -1079210633: {
                            v2 = v;
                            if(s1.equals("vnd.android.cursor.item/note")) {
                                egzu0.s(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xCEA41BF5: {
                            v2 = v;
                            if(s1.equals("vnd.com.google.cursor.item/contact_misc")) {
                                egzu0.p(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xDC29F784: {
                            v2 = v;
                            if(s1.equals("vnd.android.cursor.item/postal-address_v2")) {
                                egzu0.w(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xEC04F1B2: {
                            v2 = v;
                            if(s1.equals("vnd.com.google.cursor.item/contact_extended_property")) {
                                egzu0.g(contentValues0);
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            break;
                        }
                        case 0xEE83FE30: {
                            if(s1.equals("vnd.android.cursor.item/calling_card")) {
                                Long long2 = contentValues0.getAsLong("data1");
                                if(long2 != null && ((long)long2) > 0L) {
                                    try {
                                        v2 = v;
                                        ContentValues contentValues1 = egda.a(this.c, long2.longValue(), ggfp.N("x_calling_card_id", "x_calling_card_data", "x_data_version", "x_sync1", "x_sync2"));
                                        if(contentValues1 == null) {
                                            egig.d("FSA2_ContactsCursor", "Failed to get calling card for ID: %s", new Object[]{long2});
                                            break;
                                        }
                                        else {
                                            contentValues1.putAll(contentValues0);
                                            egzu0.c(contentValues1);
                                        }
                                    }
                                    catch(egdi unused_ex) {
                                        egig.d("FSA2_ContactsCursor", "Failed to get calling card for ID: %s", new Object[]{long2});
                                        break;
                                    }
                                    egzu1 = egzu0;
                                    goto label_248;
                                }
                                else {
                                    v2 = v;
                                    egig.d("FSA2_ContactsCursor", "Invalid calling card ID: %s", new Object[]{(long2 == null ? "null" : long2.toString())});
                                    break;
                                }
                            }
                            v2 = v;
                            break;
                        }
                        case 3430506: {
                            if(s1.equals("vnd.android.cursor.item/sip_address")) {
                                egzu0.y(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_140;
                        }
                        case 94070761: {
                        label_140:
                            if(s1.equals("vnd.com.google.cursor.item/contact_hobby")) {
                                egzu0.k(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_147;
                        }
                        case 0x1B3458F6: {
                        label_147:
                            if(s1.equals("vnd.android.cursor.item/website")) {
                                egzu0.z(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_154;
                        }
                        case 0x28C7A9F2: {
                        label_154:
                            if(s1.equals("vnd.android.cursor.item/phone_v2")) {
                                egzu0.u(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_161;
                        }
                        case 689862072: {
                        label_161:
                            if(s1.equals("vnd.android.cursor.item/organization")) {
                                egzu0.t(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_168;
                        }
                        case 905843021: {
                        label_168:
                            if(s1.equals("vnd.android.cursor.item/photo")) {
                                egzu0.v(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_175;
                        }
                        case 950831081: {
                        label_175:
                            if(s1.equals("vnd.android.cursor.item/im")) {
                                egzu0.m(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_182;
                        }
                        case 1238509849: {
                        label_182:
                            if(s1.equals("vnd.com.google.cursor.item/contact_user_defined_field")) {
                                egzu0.d(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_189;
                        }
                        case 0x4F6EDDE1: {
                        label_189:
                            if(s1.equals("vnd.com.google.cursor.item/contact_language")) {
                                egzu0.o(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_196;
                        }
                        case 0x54088D01: {
                        label_196:
                            if(s1.equals("vnd.android.cursor.item/relation")) {
                                egzu0.x(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_203;
                        }
                        case 0x5749A772: {
                        label_203:
                            if(s1.equals("vnd.com.google.cursor.item/contact_calendar_link")) {
                                egzu0.b(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_210;
                        }
                        case 0x574DEF9B: {
                        label_210:
                            if(s1.equals("vnd.android.cursor.item/group_membership")) {
                                egzu0.j(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_217;
                        }
                        case 0x61811FA6: {
                        label_217:
                            if(s1.equals("vnd.com.google.cursor.item/contact_jot")) {
                                egzu0.n(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_224;
                        }
                        case 0x6CFD03C3: {
                        label_224:
                            if(s1.equals("vnd.android.cursor.item/identity")) {
                                egzu0.l(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_231;
                        }
                        case 1907870277: {
                        label_231:
                            if(s1.equals("vnd.android.cursor.item/bestie")) {
                                if(contentValues0 != null) {
                                    if(egzu0.x == null) {
                                        egzu0.x = new ArrayList();
                                    }
                                    egzu0.x.add(contentValues0);
                                }
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                                break;
                            }
                            goto label_241;
                        }
                        case 2034973555: {
                        label_241:
                            if(s1.equals("vnd.android.cursor.item/nickname")) {
                                egzu0.r(contentValues0);
                                v2 = v;
                                egzu1 = egzu0;
                                goto label_248;
                            }
                            else {
                                v2 = v;
                            }
                            break;
                        }
                        default: {
                            v2 = v;
                        }
                    }
                    egzu1 = null;
                label_248:
                    if(egzu1 == null) {
                        egig.d("FSA2_ContactsCursor", "Error when adding data %s to Contact ID=%d", new Object[]{s3, long0});
                    }
                }
                else {
                    cursor1 = cursor0;
                    v2 = v;
                    if(hxba.a.e().af() || !TextUtils.isEmpty(s1)) {
                        egzu0.k = true;
                        if(!TextUtils.isEmpty(s1)) {
                            egzu0.l = true;
                        }
                    }
                }
                if(!this.k()) {
                    break;
                }
                cursor0 = cursor1;
                v = v2;
            }
            ++this.g;
            return new egzv(egzu0);
        }
        return null;
    }

    @Override  // ehaf
    public final Object b() {
        return this.a();
    }

    public static ehae c(Context context0, ehbp ehbp0, Account account0, Set set0, String s, String[] arr_s) {
        Cursor cursor0 = ehbp0.a((hxcf.a.b().c() ? ehab.d(ContactsContract.RawContactsEntity.CONTENT_URI, account0, false) : ehab.c(ContactsContract.RawContactsEntity.CONTENT_URI, account0)), null, s, arr_s, null);
        if(cursor0 != null) {
            List list0 = ehag.n(ehbp0, account0, (ehag.o(ehbp0, account0) ? ehag.c : ehag.b));
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                hashSet0.add(((egzx)object0).h);
            }
            return new ehae(context0, cursor0, set0, hashSet0);
        }
        egig.b("FSA2_ContactsCursor", "Failed to query CP2.");
        throw new ehfh(new RemoteException("Unable to query CP2."));
    }

    public static ehae d(Context context0, ehbp ehbp0, Account account0, Set set0, String s) {
        Cursor cursor0 = ehbp0.a(ehab.c(ContactsContract.RawContactsEntity.CONTENT_URI, account0), null, s, null, null);
        if(cursor0 != null) {
            return new ehae(context0, cursor0, set0);
        }
        egig.b("FSA2_ContactsCursor", "Failed to query CP2.");
        throw new ehfh(new RemoteException("Unable to query CP2."));
    }

    private final void n(ContentValues contentValues0, String s) {
        Long long0 = this.g(s);
        if(long0 != null) {
            contentValues0.put(s, long0);
        }
    }

    private final void o(ContentValues contentValues0, String s) {
        String s1 = this.h(s);
        if(s1 != null) {
            contentValues0.put(s, s1);
        }
    }
}

