import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification.NotificationType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;

public final class flmu implements fmou {
    public final AccountContext a;
    final long b;
    public final gged_interceptors c;
    public final flsl d;
    public final flnc e;
    public static final int f;
    private static final String g;
    private final Context h;
    private final flkx i;
    private LruCache j;

    static {
        flmu.g = "messages INNER JOIN conversations ON conversation_row_id = " + flnh.b("conversations", "id");
    }

    public flmu(Context context0, AccountContext accountContext0, flsl flsl0, flkx flkx0, flnc flnc0, long v) {
        this.h = context0.getApplicationContext();
        this.d = flsl0;
        this.i = flkx0;
        this.e = flnc0;
        this.b = v;
        this.c = gged_interceptors.l(fmft.b);
        this.a = accountContext0;
        flbh.b();
        new gmct(Executors.newSingleThreadExecutor());
    }

    public final void A(ConversationId conversationId0, long v, List list0) {
        fllz fllz0 = new fllz(this, list0, v, conversationId0);
        flng.b(this.e, fllz0);
    }

    @Override  // fmou
    public final void B(ConversationId conversationId0) {
        fllg fllg0 = new fllg(this, conversationId0);
        flng.b(this.e, fllg0);
    }

    @Override  // fmou
    public final void C(ConversationId conversationId0, String[] arr_s) {
        flng.b(this.e, new flmt(this, "message_id IN (" + TextUtils.join(", ", Collections.nCopies(1, Character.valueOf('?'))) + ")", arr_s, conversationId0));
    }

    @Override  // fmou
    public final void D(ConversationId conversationId0, long v) {
        long v1 = this.d(conversationId0);
        String s = String.valueOf(v1);
        flng.b(this.e, new fllo(this, "conversation_row_id = ?  AND server_timestamp_us <= ? AND message_status NOT IN (" + TextUtils.join(", ", new Integer[]{((int)fmft.e.o), ((int)fmft.f.o)}) + ")", new String[]{s, String.valueOf(v)}, "conversation_row_id = ?  AND message_status IN ( " + TextUtils.join(", ", new Integer[]{((int)fmft.g.o), ((int)fmft.l.o)}) + ") ", new String[]{s}, v1, s, v, conversationId0));
    }

    @Override  // fmou
    public final void E(gged_interceptors gged0) {
        flmp flmp0 = new flmp(this, gged0);
        flng.b(this.e, flmp0);
    }

    @Override  // fmou
    public final void F() {
        SQLiteDatabase sQLiteDatabase0;
        try {
            sQLiteDatabase0 = this.i.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            flbj.d("SQLiteMessagingStore", "Unable to get writable database due to ", sQLiteException0);
            return;
        }
        sQLiteDatabase0.setForeignKeyConstraintsEnabled(false);
        flnf flnf0 = new flnf(new fllf(sQLiteDatabase0));
        flbo.b();
        try {
            try {
                sQLiteDatabase0.beginTransaction();
                flnf0.call();
                sQLiteDatabase0.setTransactionSuccessful();
            }
            catch(Exception exception0) {
                throw new flnd(exception0);
            }
        }
        catch(Throwable throwable0) {
            if(sQLiteDatabase0.inTransaction()) {
                sQLiteDatabase0.endTransaction();
            }
            throw throwable0;
        }
        if(sQLiteDatabase0.inTransaction()) {
            sQLiteDatabase0.endTransaction();
        }
        sQLiteDatabase0.setForeignKeyConstraintsEnabled(true);
    }

    @Override  // fmou
    public final void G(fmga[] arr_fmga) {
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < arr_fmga.length; ++v) {
            fmfm fmfm0 = new fmfm(arr_fmga[v]);
            fmfm0.c = fmcu.a;
            fmfm0.h(fmfz.d.g);
            fmfm0.r(ByteString.b);
            ggdy0.i(fmfm0.a());
        }
        this.aa(ggdy0.h());
    }

    @Override  // fmou
    public final void H(ConversationId conversationId0, List list0) {
        flmq flmq0 = new flmq(this, conversationId0, list0);
        flng.b(this.e, flmq0);
    }

    @Override  // fmou
    public final void I(List list0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("needs_delivery_receipt", Boolean.valueOf(false));
        for(int v = 0; v < list0.size(); v = v1) {
            int v1 = Math.min(v + 998, list0.size());
            List list1 = list0.subList(v, v1);
            String[] arr_s = new String[list1.size()];
            list1.toArray(arr_s);
            flng.b(this.e, new fllv(this, contentValues0, a.a(flnh.c(list1.size()), "message_id IN (", ")"), arr_s));
        }
    }

    public final void J(ConversationId conversationId0) {
        flmu.an();
        this.M(conversationId0);
    }

    public final void K(ConversationId conversationId0) {
        flqe.a().b(flqb.d(this.b, conversationId0));
    }

    public final void L() {
        flqe.a().b(flqb.c(this.b));
    }

    public final void M(ConversationId conversationId0) {
        flqe.a().b(flqb.f(this.b, conversationId0));
    }

    public final void N(ConversationId conversationId0) {
        flqe.a().b(flqb.h(this.b, conversationId0));
    }

    public final void O(ConversationId conversationId0) {
        flqe.a().b(flqb.i("messages", new String[]{"REGISTRATION", String.valueOf(this.b), "UNREAD_COUNT_FOR_CONVERSATION_PATH", String.valueOf(conversationId0.hashCode())}));
    }

    public final void P(String s) {
        flqe.a().b(flqb.e(this.b, s));
    }

    public final void Q(fmft fmft0) {
        flqe.a().b(flqb.i("messages", new String[]{"REGISTRATION", String.valueOf(this.b), "MESSAGES_STATUS_COUNT_FOR_ACCOUNT_PATH", String.valueOf(fmft0)}));
    }

    public final void R() {
        flqe.a().b(flqb.g(this.b));
    }

    @Override  // fmou
    public final void S(fmpl fmpl0, boolean z) {
        flme flme0 = new flme(this, z, fmpl0);
        flng.b(this.e, flme0);
    }

    @Override  // fmou
    public final void T(List list0) {
        flmj flmj0 = new flmj(this, list0);
        flng.b(this.e, flmj0);
    }

    @Override  // fmou
    public final void U(ConversationId conversationId0, fmel[] arr_fmel) {
        flln flln0 = new flln(this, conversationId0, arr_fmel);
        flng.b(this.e, flln0);
    }

    @Override  // fmou
    public final void V(fmga fmga0) {
        this.ay(fmga0, true);
    }

    @Override  // fmou
    public final void W(fmga fmga0) {
        this.ay(fmga0, false);
    }

    public final void X(long v, Long long0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("update_timestamp_us", long0);
        Uri uri0 = this.l("conversations");
        if(this.e.b(uri0, contentValues0, "id = ?", new String[]{String.valueOf(v)}) < 0) {
            throw new SQLiteException("Failed to update conversation.");
        }
        this.L();
    }

    public final void Y(long v) {
        ContentValues contentValues0 = new ContentValues();
        flba.a();
        contentValues0.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        Uri uri0 = this.l("conversations");
        if(this.e.b(uri0, contentValues0, "id = ?", new String[]{String.valueOf(v)}) >= 0) {
            return;
        }
        throw new SQLiteException("Failed to update conversation local update timestamp.");
    }

    public final void Z(ConversationId conversationId0) {
        this.Y(this.d(conversationId0));
    }

    @Override  // fmou
    public final int a(long v, long v1) {
        if(v >= v1) {
            flbj.c("SQLiteMessagingStore", " Delete message in range not possible. Invalid time range.");
            return 0;
        }
        return (int)(((Integer)flng.a(this.e, new flmh(this, "message_status NOT IN (" + TextUtils.join(", ", new Integer[]{((int)fmft.e.o), ((int)fmft.f.o), ((int)fmft.g.o)}) + ") AND server_timestamp_us BETWEEN ? AND ? ", new String[]{String.valueOf(v), String.valueOf(v1)}))));
    }

    private static final String aA() {
        return "((conversations INNER JOIN contacts AS o ON owner_row_id = " + flnh.b("o", "id") + ") LEFT JOIN contacts AS c ON other_contact_row_id = " + flnh.b("c", "id") + ")";
    }

    private static final Pair aB(ContactId contactId0) {
        return flmu.az("contacts", contactId0);
    }

    @Override  // fmou
    public final void aa(gged_interceptors gged0) {
        if(!gged0.isEmpty()) {
            ggek ggek0 = new ggek();
            HashSet hashSet0 = new HashSet();
            int v = ((ggna)gged0).c;
            for(int v1 = 0; v1 < v; ++v1) {
                fmga fmga0 = (fmga)gged0.get(v1);
                ContentValues contentValues0 = new ContentValues();
                try {
                    byte[] arr_b = flbm.i(flon.c(fmga0));
                    contentValues0.put("rendering_type", Integer.valueOf(fmga0.k.a().g));
                    contentValues0.put("message_properties", arr_b);
                    contentValues0.put("capability", Integer.valueOf(fmga0.j));
                    ggek0.i(fmga0.a, contentValues0);
                }
                catch(IOException unused_ex) {
                    flbj.c("SQLiteMessagingStore", "Could not update message properties in database due to serialization error.");
                }
            }
            fllk fllk0 = new fllk(this, gged0, ggek0.b(), hashSet0);
            flng.b(this.e, fllk0);
        }
    }

    @Override  // fmou
    public final void ab(List list0, fmft fmft0, fmft fmft1) {
        if(!list0.isEmpty() && !fmft0.equals(fmft1)) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                arrayList0.add(((fmga)object0).a);
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("message_status", Integer.valueOf(fmft1.o));
            boolean z = false;
            for(int v = 0; v < arrayList0.size(); v = v1) {
                int v1 = Math.min(v + 997, arrayList0.size());
                List list1 = arrayList0.subList(v, v1);
                String[] arr_s = new String[list1.size() + 1];
                list1.toArray(arr_s);
                arr_s[list1.size()] = Integer.toString(fmft0.o);
                fllr fllr0 = new fllr(this, contentValues0, list1, arr_s);
                flng.a(this.e, fllr0);
            }
            HashSet hashSet0 = new HashSet();
            for(Object object1: list0) {
                fmga fmga0 = (fmga)object1;
                if(fmga0.g.equals(fmft0)) {
                    hashSet0.add(fmga0.c);
                    this.P(fmga0.a);
                    flmu.ap();
                }
            }
            if(this.c.contains(fmft1) || this.c.contains(fmft0)) {
                z = true;
            }
            for(Object object2: hashSet0) {
                ConversationId conversationId0 = (ConversationId)object2;
                this.Z(conversationId0);
                this.J(conversationId0);
                if(z) {
                    this.O(conversationId0);
                }
            }
            this.Q(fmft0);
            this.Q(fmft1);
        }
    }

    @Override  // fmou
    public final void ac(ConversationId conversationId0, List list0, List list1, fmft fmft0) {
        if(list0.isEmpty()) {
            return;
        }
        HashSet hashSet0 = new HashSet(list1);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("message_status", Integer.valueOf(fmft0.o));
        int v = hashSet0.size();
        HashSet hashSet1 = new HashSet();
        for(int v1 = 0; v1 < list0.size(); v1 = v2) {
            int v2 = Math.min(998 - v + v1, list0.size());
            List list2 = list0.subList(v1, v2);
            String[] arr_s = new String[list2.size() + hashSet0.size()];
            String s = "message_id IN (" + flnh.c(list2.size()) + ") AND message_status IN (" + flnh.c(hashSet0.size()) + ")";
            list2.toArray(arr_s);
            int v3 = 0;
            for(Object object0: hashSet0) {
                arr_s[list2.size() + v3] = Integer.toString(((fmft)object0).o);
                ++v3;
            }
            flmm flmm0 = new flmm(this, s, arr_s, contentValues0, fmft0, hashSet1);
            flng.b(this.e, flmm0);
        }
        this.Z(conversationId0);
        gged_interceptors gged0 = this.c;
        boolean z = gged0.contains(fmft0);
        for(Object object1: hashSet1) {
            this.Q(((fmft)object1));
            z = z || gged0.contains(((fmft)object1));
        }
        if(!hashSet1.isEmpty()) {
            this.Q(fmft0);
        }
        if(z) {
            this.O(conversationId0);
        }
        this.J(conversationId0);
    }

    @Override  // fmou
    public final void ad(fmga fmga0, long v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("server_timestamp_us", Long.valueOf(v));
        flmc flmc0 = new flmc(this, contentValues0, fmga0, v);
        flng.b(this.e, flmc0);
        this.P(fmga0.a);
        this.J(fmga0.c);
    }

    @Override  // fmou
    public final boolean ae(String s) {
        flms flms0 = new flms(this, s);
        return ((Boolean)flng.a(this.e, flms0)).booleanValue();
    }

    @Override  // fmou
    public final boolean af(String s, fmft fmft0) {
        flmi flmi0 = new flmi(this, s, fmft0);
        return ((Boolean)flng.a(this.e, flmi0)).booleanValue();
    }

    @Override  // fmou
    public final boolean ag(ConversationId conversationId0, ByteString hfsf0) {
        flll flll0 = new flll(this, conversationId0, hfsf0);
        return ((Boolean)flng.a(this.e, flll0)).booleanValue();
    }

    @Override  // fmou
    public final boolean ah(ConversationId conversationId0, String s, gfsi gfsi0, MessageReceivedNotification messageReceivedNotification0) {
        flmn flmn0 = new flmn(this, conversationId0, s, gfsi0, messageReceivedNotification0);
        return ((Boolean)flng.a(this.e, flmn0)).booleanValue();
    }

    @Override  // fmou
    public final fmpa ai(gged_interceptors gged0, Notification.NotificationType notification$NotificationType0) {
        String s1;
        String[] arr_s;
        String s;
        gged_interceptors gged1 = null;
        if(gged0 == null) {
            arr_s = null;
            s = null;
        }
        else {
            s = "notification_id IN (" + TextUtils.join(",", Collections.nCopies(((ggna)gged0).c, "?")) + ")";
            arr_s = (String[])gged0.toArray(new String[((ggna)gged0).c]);
        }
        if(notification$NotificationType0 != null) {
            if(s == null) {
                arr_s = new String[0];
                s1 = "";
            }
            else {
                s1 = s + " AND ";
            }
            arr_s = (String[])ggml.a(arr_s, Integer.toString(notification$NotificationType0.c));
            s = s1 + "notification_type = ? ";
        }
        flqc flqc0 = flqd.a();
        flqc0.d(this.l("notifications"));
        flqc0.a = gged_interceptors.k(flqp.a);
        flqc0.b = s;
        if(arr_s != null) {
            gged1 = gged_interceptors.k(arr_s);
        }
        flqc0.c = gged1;
        flqc0.d = "notification_timestamp_received_ms DESC";
        flqc0.b(-1);
        flqd flqd0 = flqc0.a();
        flly flly0 = new flly();
        Uri uri0 = flqb.g(this.b);
        return this.aw(flqd0, this.h, flly0, uri0);
    }

    @Override  // fmou
    public final fmpa aj(ConversationId conversationId0) {
        String[] arr_s1;
        String s1;
        String[] arr_s;
        String s;
        if(conversationId0.e() == ConversationId.IdType.a) {
            s = "(((participants INNER JOIN contacts AS c ON contact_row_id = " + flnh.b("c", "id") + ") INNER JOIN conversations ON conversation_row_id = " + flnh.b("conversations", "id") + ") INNER JOIN contacts AS o ON other_contact_row_id = " + flnh.b("o", "id") + ")";
            arr_s = flnh.i("c", flqi.a);
            Pair pair0 = flmu.az("o", conversationId0.c());
            s1 = (String)pair0.first;
            arr_s1 = (String[])pair0.second;
        }
        else {
            String[] arr_s2 = flnh.i("contacts", flqi.a);
            arr_s1 = new String[]{conversationId0.d().b(), conversationId0.d().a()};
            s1 = "conversation_group_id = ? AND conversation_group_app_name = ?";
            s = "((participants INNER JOIN conversations ON conversation_row_id = " + flnh.b("conversations", "id") + ") INNER JOIN contacts ON contact_row_id = " + flnh.b("contacts", "id") + ")";
            arr_s = arr_s2;
        }
        flqc flqc0 = flqd.a();
        flqc0.d(this.l(s));
        flqc0.a = gged_interceptors.k(arr_s);
        flqc0.b = s1;
        flqc0.c = gged_interceptors.k(arr_s1);
        flqc0.d = null;
        flqd flqd0 = flqc0.a();
        flmf flmf0 = new flmf();
        Uri uri0 = flqb.h(this.b, conversationId0);
        return this.aw(flqd0, this.h, flmf0, uri0);
    }

    @Override  // fmou
    public final void ak(fmeo fmeo0) {
        flma flma0 = new flma(this, fmeo0);
        Long long0 = (Long)flng.a(this.e, flma0);
    }

    @Override  // fmou
    public final void al(fmev fmev0) {
        fllh fllh0 = () -> {
            byte[] arr_b;
            long v = this.d(fmev0.a);
            if(v == -1L) {
                return this.au(fmev0);
            }
            gfsx gfsx0 = this.r(v);
            if(false && gfsx0.i() && ((fmev)gfsx0.d()).f != -1L) {
                return v;
            }
            ContentValues contentValues0 = new ContentValues();
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                try {
                    HashMap hashMap0 = floc.c(((fmev)object0));
                    floc.f(hashMap0, fmev0);
                    arr_b = flbm.i(hashMap0);
                }
                catch(IOException iOException0) {
                    flbj.d("ConversationCursors", "Failed to serialize conversation properties.", iOException0);
                    arr_b = new byte[0];
                }
                contentValues0.put("conversation_properties", arr_b);
            }
            else {
                contentValues0.put("conversation_properties", floc.e(fmev0));
            }
            contentValues0.put("conversation_app_data", floc.d(new HashMap(fmev0.i)));
            flba.a();
            contentValues0.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
            Uri uri0 = this.l("conversations");
            if(this.e.b(uri0, contentValues0, "id = ?", new String[]{String.valueOf(v)}) < 0) {
                flbj.c("SQLiteMessagingStore", "Failed to update conversation.");
                return -1L;
            }
            flmu.ao();
            this.K(fmev0.a);
            this.L();
            return v;
        };
        Long long0 = (Long)flng.a(this.e, fllh0);
    }

    @Override  // fmou
    public final void am(fmev fmev0) {
        flml flml0 = () -> {
            byte[] arr_b;
            long v = this.d(fmev0.a);
            if(v == -1L) {
                return this.au(fmev0);
            }
            gfsx gfsx0 = this.r(v);
            if(true && gfsx0.i() && ((fmev)gfsx0.d()).f != -1L) {
                return v;
            }
            ContentValues contentValues0 = new ContentValues();
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                try {
                    HashMap hashMap0 = floc.c(((fmev)object0));
                    floc.f(hashMap0, fmev0);
                    arr_b = flbm.i(hashMap0);
                }
                catch(IOException iOException0) {
                    flbj.d("ConversationCursors", "Failed to serialize conversation properties.", iOException0);
                    arr_b = new byte[0];
                }
                contentValues0.put("conversation_properties", arr_b);
            }
            else {
                contentValues0.put("conversation_properties", floc.e(fmev0));
            }
            contentValues0.put("conversation_app_data", floc.d(new HashMap(fmev0.i)));
            flba.a();
            contentValues0.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
            Uri uri0 = this.l("conversations");
            if(this.e.b(uri0, contentValues0, "id = ?", new String[]{String.valueOf(v)}) < 0) {
                flbj.c("SQLiteMessagingStore", "Failed to update conversation.");
                return -1L;
            }
            flmu.ao();
            this.K(fmev0.a);
            this.L();
            return v;
        };
        Long long0 = (Long)flng.a(this.e, flml0);
    }

    public static final void an() {
        flbj.a("SQLiteMessagingStore", "Sending conversation messages updated event");
        flbj.f("SQLiteMessagingStore", "Conversation messages updated event is not sent due to absent datastore events receiver");
    }

    public static final void ao() {
        flbj.a("SQLiteMessagingStore", "Sending conversation updated event");
        flbj.a("SQLiteMessagingStore", "Conversation updated event is not sent");
    }

    public static final void ap() {
        flbj.a("SQLiteMessagingStore", "Sending messages status updated event");
        flbj.f("SQLiteMessagingStore", "messages status updated event is not sent due to absent datastore events receiver");
    }

    public static final Pair aq(fmpl fmpl0) {
        if(fmpl0.b() == ConversationId.IdType.a) {
            ContactId contactId0 = fmpl0.c();
            String s = contactId0.b() == ContactId.ContactType.c ? flbd.a(contactId0.d()) : contactId0.d();
            String[] arr_s = new String[3];
            arr_s[0] = s;
            ContactId.ContactType contactId$ContactType0 = contactId0.b();
            arr_s[1] = Integer.toString(((flnx)flny.a.kt(contactId$ContactType0)).g);
            arr_s[2] = contactId0.e();
            return contactId0.c().i() ? Pair.create("lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =? AND lighter_handler_id =?", ((String[])ggml.a(arr_s, ((String)contactId0.c().d())))) : Pair.create("lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =?", arr_s);
        }
        return Pair.create("lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =?", new String[]{fmpl0.a().b(), Integer.toString(flnx.e.g), fmpl0.a().a()});
    }

    @Override  // fmou
    public final fmpa ar(int v, int v1) {
        flqc flqc0 = flqd.a();
        flqc0.d(this.l(flmu.aA()));
        flqc0.a = gged_interceptors.k(flnh.h(new String[][]{flnh.i("conversations", flqk.b), flnh.i("o", flqi.a), flnh.i("c", flqi.a)}));
        flqc0.b = "update_timestamp_us <> ?";
        flqc0.c = gged_interceptors.l(Long.toString(0L));
        flqc0.d = "update_timestamp_us DESC";
        flqc0.b(v1);
        flqc0.c(v);
        flqd flqd0 = flqc0.a();
        flle flle0 = new flle(this);
        Uri uri0 = flqb.c(this.b);
        return this.aw(flqd0, this.h, flle0, uri0);
    }

    @Override  // fmou
    public final fmpa as(ConversationId conversationId0, int v, fmfz[] arr_fmfz) {
        String s1;
        String[] arr_s1;
        String[] arr_s;
        String s;
        if(conversationId0.e() == ConversationId.IdType.b) {
            s = "((" + flmu.g + ") LEFT JOIN contacts ON sender_contact_row_id = " + flnh.b("contacts", "id") + ")";
            arr_s = new String[]{conversationId0.d().b(), conversationId0.d().a()};
            arr_s1 = flnh.h(new String[][]{flnh.i("messages", flqn.a), flnh.i("contacts", flqi.a)});
            s1 = "conversation_group_id = ? AND conversation_group_app_name = ?";
        }
        else {
            s = "(((" + flmu.g + ") LEFT JOIN contacts AS s ON sender_contact_row_id = " + flnh.b("s", "id") + ") INNER JOIN contacts AS o ON other_contact_row_id = " + flnh.b("o", "id") + ")";
            Pair pair0 = flmu.az("o", conversationId0.c());
            String s2 = (String)pair0.first;
            arr_s = (String[])pair0.second;
            arr_s1 = flnh.h(new String[][]{flnh.i("messages", flqn.a), flnh.i("s", flqi.a)});
            s1 = s2;
        }
        String s3 = s1 + " AND rendering_type IN (" + TextUtils.join(", ", Collections.nCopies(arr_fmfz.length, Character.valueOf('?'))) + ")";
        String[] arr_s2 = (String[])Arrays.copyOf(arr_s, arr_s.length + arr_fmfz.length);
        for(int v1 = 0; v1 < arr_fmfz.length; ++v1) {
            arr_s2[arr_s.length + v1] = Integer.toString(arr_fmfz[v1].g);
        }
        flqc flqc0 = flqd.a();
        flqc0.d(this.l(s));
        flqc0.a = gged_interceptors.k(arr_s1);
        flqc0.b = s3;
        flqc0.c = gged_interceptors.k(arr_s2);
        flqc0.d = "server_timestamp_us DESC";
        flqc0.b(v);
        flqd flqd0 = flqc0.a();
        flmk flmk0 = new flmk(this, conversationId0);
        Uri uri0 = flqb.f(this.b, conversationId0);
        return this.aw(flqd0, this.h, flmk0, uri0);
    }

    public final void at(fmeo fmeo0) {
        flqe.a().b(flqb.b(this.b, fmeo0.a));
        if(iacz.a.c().e()) {
            flbj.a("SQLiteMessagingStore", "Sending one to one conversation profile updated event");
            flbj.f("SQLiteMessagingStore", "One to one conversation profile updated event is not sent due to absent datastore events receiver");
        }
        flbj.a("SQLiteMessagingStore", "Sending contact updated event");
        flbj.a("SQLiteMessagingStore", "Contact updated event is not sent");
    }

    private final long au(fmev fmev0) {
        fllc fllc0 = new fllc(this, fmev0);
        return (long)(((Long)flng.a(this.e, fllc0)));
    }

    private final fmpa av(flqd flqd0) {
        fmpa fmpa0;
        synchronized(this) {
            LruCache lruCache0 = this.j;
            if(lruCache0 == null) {
                synchronized(this) {
                    int v1 = (int)iadc.b();
                    if(this.j == null && v1 > 0) {
                        this.j = new LruCache(v1);
                    }
                }
                return null;
            }
            fmpa0 = (fmpa)lruCache0.get(flqd0);
        }
        return fmpa0;
    }

    private final fmpa aw(flqd flqd0, Context context0, gfsi gfsi0, Uri uri0) {
        Exception exception1;
        fmpa fmpa1;
        flls flls0 = new flls(this, context0, gfsi0, uri0, flqd0);
        fmpa fmpa0 = this.av(flqd0);
        if(fmpa0 == null) {
            try {
                fmpa1 = (fmpa)flls0.call();
            }
            catch(Exception exception0) {
                exception1 = exception0;
                flbj.d("SQLiteMessagingStore", "Error creating monitor", exception1);
                return null;
            }
            try {
                this.ax(flqd0, fmpa1);
                return fmpa1;
            }
            catch(Exception exception2) {
                exception1 = exception2;
            }
            flbj.d("SQLiteMessagingStore", "Error creating monitor", exception1);
            return fmpa1;
        }
        return fmpa0;
    }

    private final void ax(flqd flqd0, fmpa fmpa0) {
        synchronized(this) {
            LruCache lruCache0 = this.j;
            if(lruCache0 == null) {
                int v1 = (int)iadc.b();
                if(this.j == null && v1 > 0) {
                    LruCache lruCache1 = new LruCache(v1);
                    this.j = lruCache1;
                    lruCache1.put(flqd0, fmpa0);
                    return;
                }
                return;
            }
            lruCache0.put(flqd0, fmpa0);
        }
    }

    private final void ay(fmga fmga0, boolean z) {
        ContentValues contentValues0 = flmu.k(fmga0);
        switch(fmga0.r) {
            case 0: {
                throw null;
            }
            case 1: {
                contentValues0.put("needs_delivery_receipt", Boolean.valueOf(true));
                break;
            }
            default: {
                contentValues0.put("needs_delivery_receipt", Boolean.valueOf(false));
            }
        }
        flld flld0 = new flld(this, fmga0, z, contentValues0);
        flng.b(this.e, flld0);
    }

    private static final Pair az(String s, ContactId contactId0) {
        String s1 = flnh.b(s, "lighter_id_normalized_id") + " =? AND " + flnh.b(s, "lighter_id_type") + " =? AND " + flnh.b(s, "lighter_id_app_name") + " =? ";
        String[] arr_s = {(contactId0.b() == ContactId.ContactType.c ? flbd.a(contactId0.d()) : contactId0.d()), Integer.toString(contactId0.b().f), contactId0.e()};
        return contactId0.c().i() ? Pair.create((s1 + " AND " + flnh.b(s, "lighter_handler_id") + " =? "), ((String[])ggml.a(arr_s, ((String)contactId0.c().d())))) : Pair.create((s1 + " AND " + flnh.b(s, "lighter_handler_id") + " is NULL "), arr_s);
    }

    @Override  // fmou
    public final int b(String s, String s1, gfsi gfsi0, long v) {
        fllb fllb0 = new fllb(this, s, s1, gfsi0, v);
        return (int)(((Integer)flng.a(this.e, fllb0)));
    }

    public final long c(ContactId contactId0) {
        Pair pair0 = flmu.aB(contactId0);
        Uri uri0 = this.l("contacts");
        try(Cursor cursor0 = this.e.h(uri0, new String[]{"id"}, ((String)pair0.first), ((String[])pair0.second), null, null)) {
            return !cursor0.moveToFirst() ? -1L : cursor0.getLong(0);
        }
    }

    public final long d(ConversationId conversationId0) {
        String[] arr_s;
        String s;
        if(conversationId0.e() == ConversationId.IdType.b) {
            s = "conversation_group_id = ? AND conversation_group_app_name = ?";
            arr_s = new String[]{conversationId0.d().b(), conversationId0.d().a()};
        }
        else {
            long v = this.c(conversationId0.c());
            if(v == -1L) {
                return -1L;
            }
            arr_s = new String[]{String.valueOf(v)};
            s = "other_contact_row_id = ?";
        }
        Uri uri0 = this.l("conversations");
        try(Cursor cursor0 = this.e.h(uri0, new String[]{"id"}, s, arr_s, null, null)) {
            if(cursor0.moveToFirst()) {
                return cursor0.getLong(0);
            }
        }
        return -1L;
    }

    @Override  // fmou
    public final long e(ConversationId conversationId0) {
        String s = String.valueOf(this.d(conversationId0));
        Uri uri0 = this.l("messages");
        try(Cursor cursor0 = this.e.h(uri0, new String[]{"server_timestamp_us"}, "conversation_row_id = ?  AND message_status NOT IN (" + TextUtils.join(", ", new Integer[]{((int)fmft.e.o), ((int)fmft.f.o), ((int)fmft.g.o), ((int)fmft.l.o)}) + ")", new String[]{s}, "id DESC", "1")) {
            return !cursor0.moveToFirst() ? 0L : cursor0.getLong(0);
        }
    }

    @Override  // fmou
    public final long f() {
        String s = TextUtils.join(", ", fmft.n);
        Uri uri0 = this.l("messages");
        try(Cursor cursor0 = this.e.h(uri0, new String[]{"server_timestamp_us"}, "message_status NOT IN (" + s + ")", new String[0], "server_timestamp_us DESC", "1")) {
            return !cursor0.moveToFirst() ? 0L : cursor0.getLong(0);
        }
    }

    public final long g(ContactId contactId0) {
        flmd flmd0 = new flmd(this, contactId0);
        return (long)(((Long)flng.a(this.e, flmd0)));
    }

    public final long h(fmeo fmeo0) {
        flmr flmr0 = new flmr(this, floa.a(fmeo0), fmeo0);
        return (long)(((Long)flng.a(this.e, flmr0)));
    }

    final long i(ConversationId conversationId0, gfsx gfsx0) {
        long v = this.d(conversationId0);
        if(v == -1L) {
            fmeu fmeu0 = fmev.a();
            fmeu0.g(conversationId0);
            fmeu0.i(-1L);
            fmeu0.b(new HashMap());
            fmeu0.c(conversationId0.e() == ConversationId.IdType.a);
            v = this.au(fmeu0.a());
        }
        if(gfsx0.i()) {
            this.X(v, ((Long)gfsx0.d()));
            this.Y(v);
        }
        return v;
    }

    // Detected as a lambda impl.
    public final long j(fmev fmev0, boolean z) {
        byte[] arr_b;
        long v = this.d(fmev0.a);
        if(v == -1L) {
            return this.au(fmev0);
        }
        gfsx gfsx0 = this.r(v);
        if(z && gfsx0.i() && ((fmev)gfsx0.d()).f != -1L) {
            return v;
        }
        ContentValues contentValues0 = new ContentValues();
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            try {
                HashMap hashMap0 = floc.c(((fmev)object0));
                floc.f(hashMap0, fmev0);
                arr_b = flbm.i(hashMap0);
            }
            catch(IOException iOException0) {
                flbj.d("ConversationCursors", "Failed to serialize conversation properties.", iOException0);
                arr_b = new byte[0];
            }
            contentValues0.put("conversation_properties", arr_b);
        }
        else {
            contentValues0.put("conversation_properties", floc.e(fmev0));
        }
        contentValues0.put("conversation_app_data", floc.d(new HashMap(fmev0.i)));
        flba.a();
        contentValues0.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        Uri uri0 = this.l("conversations");
        if(this.e.b(uri0, contentValues0, "id = ?", new String[]{String.valueOf(v)}) < 0) {
            flbj.c("SQLiteMessagingStore", "Failed to update conversation.");
            return -1L;
        }
        flmu.ao();
        this.K(fmev0.a);
        this.L();
        return v;
    }

    public static ContentValues k(fmga fmga0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("message_id", fmga0.a);
        int v = fmga0.r - 1;
        if(fmga0.r != 0) {
            contentValues0.put("message_type", Integer.valueOf(v));
            contentValues0.put("message_status", Integer.valueOf(fmga0.g.o));
            contentValues0.put("server_timestamp_us", Long.valueOf(fmga0.d));
            contentValues0.put("capability", Integer.valueOf(fmga0.j));
            contentValues0.put("rendering_type", Integer.valueOf(fmga0.k.a().g));
            contentValues0.put("filterable_flags", Integer.valueOf(fmga0.m));
            try {
                contentValues0.put("message_properties", flbm.i(flon.c(fmga0)));
                return contentValues0;
            }
            catch(IOException iOException0) {
                flbj.d("SQLiteMessagingStore", "Failed to serialize message profile.", iOException0);
                throw new SQLiteException("Fali to serialize message profile", iOException0);
            }
        }
        throw null;
    }

    public final Uri l(String s) {
        return flnh.a("com.google.android.gms.lighter.data", "MESSAGING", s, new String[]{Long.toString(this.b)});
    }

    @Override  // fmou
    public final Pair m(fmhr fmhr0) {
        flmo flmo0 = new flmo(this, fmhr0);
        return (Pair)flng.a(this.e, flmo0);
    }

    @Override  // fmou
    public final fmpa n(fmpl fmpl0) {
        Pair pair0 = flmu.aq(fmpl0);
        flqc flqc0 = flqd.a();
        flqc0.d(this.l("blocks"));
        flqc0.a = gged_interceptors.k(flqg.a);
        flqc0.b = (String)pair0.first;
        flqc0.c = gged_interceptors.k(((String[])pair0.second));
        flqc0.d = null;
        flqd flqd0 = flqc0.a();
        flmb flmb0 = new flmb();
        Uri uri0 = flqb.a(this.b, fmpl0);
        return this.aw(flqd0, this.h, flmb0, uri0);
    }

    @Override  // fmou
    public final fmpa o(ContactId contactId0) {
        Pair pair0 = flmu.aB(contactId0);
        String s = (String)pair0.first;
        String[] arr_s = (String[])pair0.second;
        flqc flqc0 = flqd.a();
        flqc0.d(this.l("contacts"));
        flqc0.a = gged_interceptors.k(flqi.a);
        flqc0.b = s;
        flqc0.c = gged_interceptors.k(arr_s);
        flqc0.d = null;
        flqd flqd0 = flqc0.a();
        fllw fllw0 = new fllw();
        Uri uri0 = flqb.b(this.b, contactId0);
        return this.aw(flqd0, this.h, fllw0, uri0);
    }

    @Override  // fmou
    public final fmpa p(ConversationId conversationId0) {
        String s;
        String[] arr_s;
        ConversationId.IdType conversationId$IdType0 = conversationId0.e();
        ConversationId.IdType conversationId$IdType1 = ConversationId.IdType.b;
        if(conversationId$IdType0 == conversationId$IdType1) {
            arr_s = new String[]{String.valueOf(conversationId$IdType1.c), conversationId0.d().b(), conversationId0.d().a()};
            s = "conversation_type = ? AND conversation_group_id = ? AND conversation_group_app_name = ?";
        }
        else {
            Pair pair0 = flmu.az("c", conversationId0.c());
            String s1 = String.valueOf(((String)pair0.first));
            arr_s = (String[])ggml.b(new String[]{String.valueOf(ConversationId.IdType.a.c)}, ((String[])pair0.second), String.class);
            s = "conversation_type = ?AND " + s1;
        }
        Pair pair1 = Pair.create(s, arr_s);
        String s2 = (String)pair1.first;
        String[] arr_s1 = (String[])pair1.second;
        String[] arr_s2 = flnh.h(new String[][]{flnh.i("conversations", flqk.b), flnh.i("o", flqi.a), flnh.i("c", flqi.a)});
        flqc flqc0 = flqd.a();
        flqc0.d(this.l(flmu.aA()));
        flqc0.a = gged_interceptors.k(arr_s2);
        flqc0.b = s2;
        flqc0.c = gged_interceptors.k(arr_s1);
        flqc0.d = null;
        flqd flqd0 = flqc0.a();
        fllj fllj0 = new fllj();
        Uri uri0 = flqb.d(this.b, conversationId0);
        return this.aw(flqd0, this.h, fllj0, uri0);
    }

    @Override  // fmou
    public final fmpa q(String s, ConversationId conversationId0) {
        String[] arr_s = flnh.h(new String[][]{flnh.i("messages", flqn.a), flnh.i("contacts", flqi.a)});
        flqc flqc0 = flqd.a();
        flqc0.d(this.l("((" + flmu.g + ") LEFT JOIN contacts ON sender_contact_row_id = " + flnh.b("contacts", "id") + ")"));
        flqc0.a = gged_interceptors.k(arr_s);
        flqc0.b = "message_id =?";
        flqc0.c = gged_interceptors.k(new String[]{s});
        flqd flqd0 = flqc0.a();
        fllp fllp0 = new fllp(conversationId0);
        Uri uri0 = flqb.e(this.b, s);
        return this.aw(flqd0, this.h, fllp0, uri0);
    }

    public final gfsx r(long v) {
        String[] arr_s = flnh.h(new String[][]{flnh.i("conversations", flqk.b), flnh.i("o", flqi.a), flnh.i("c", flqi.a)});
        try(Cursor cursor0 = this.e.h(this.l(flmu.aA()), arr_s, "conversations.id = ?", new String[]{Long.toString(v)}, null, null)) {
            if(cursor0.moveToFirst()) {
                return floc.a(cursor0);
            }
            flbj.f("SQLiteMessagingStore", "Conversation lookup failed");
        }
        return gfqx.a;
    }

    public final gfsx s(String s, String s1) {
        Uri uri0 = this.l("messages");
        try(Cursor cursor0 = this.e.h(uri0, new String[]{s1}, "message_id = ?", new String[]{s}, null, null)) {
            if(cursor0.moveToFirst()) {
                return gfsx.m(Long.valueOf(cursor0.getLong(0)));
            }
        }
        return gfqx.a;
    }

    public final gfsx t(String s) {
        return this.s(s, "server_timestamp_us");
    }

    public final gfsx u(String s) {
        Uri uri0 = this.l("notifications");
        try(Cursor cursor0 = this.e.h(uri0, flqp.a, "notification_id = ? AND notification_type = ?", new String[]{s, Integer.toString(Notification.NotificationType.b.c)}, null, Integer.toString(1))) {
            if(cursor0.moveToFirst()) {
                return flor.b(cursor0);
            }
        }
        return gfqx.a;
    }

    @Override  // fmou
    public final gged_interceptors v(ConversationId conversationId0, fmft fmft0, long v) {
        fllq fllq0 = new fllq(this, conversationId0, fmft0, v);
        return (gged_interceptors)flng.a(this.e, fllq0);
    }

    @Override  // fmou
    public final gged_interceptors w(ConversationId conversationId0, fmft fmft0, fmft fmft1) {
        if(fmft0.equals(fmft1)) {
            return ggna.a;
        }
        fllt fllt0 = new fllt(this, fmft1, conversationId0, fmft0);
        return (gged_interceptors)flng.a(this.e, fllt0);
    }

    @Override  // fmou
    public final gged_interceptors x(ConversationId conversationId0, long v, long v1) {
        fllu fllu0 = new fllu(this, conversationId0, v1, v);
        return (gged_interceptors)flng.a(this.e, fllu0);
    }

    @Override  // fmou
    public final ggeo y(long v) {
        return (ggeo)flng.a(this.e, new fllx(this, new String[]{"1", Long.toString(v)}));
    }

    @Override  // fmou
    public final void z(ConversationId conversationId0, List list0) {
        flli flli0 = new flli(this, conversationId0, list0);
        flng.b(this.e, flli0);
    }
}

