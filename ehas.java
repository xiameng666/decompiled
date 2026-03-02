import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class ehas {
    public static ContentValues a(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eggh.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)egpo.a).v_newBuilder();
        efoy efoy0 = efoy.d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((egpo)hftp1.b_message).c = efoy0.k;
        ((egpo)hftp1.b_message).b |= 1;
        egpo egpo0 = (egpo)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eggh eggh0 = (eggh)hftp0.b_message;
        egpo0.getClass();
        eggh0.c = egpo0;
        eggh0.b |= 1;
        byte[] arr_b = ((eggh)hftp0.N_build()).toBytesArray();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("account_name", s);
        contentValues0.put("account_type", s1);
        hxba hxba0 = hxba.a;
        if(hxba0.e().U()) {
            contentValues0.putNull("sourceid");
        }
        if(hxba0.e().T()) {
            contentValues0.putNull("data_set");
        }
        if(hxba0.e().ad()) {
            if(hxba0.e().ae()) {
                contentValues0.put("sync1", Base64.encodeToString(arr_b, 2));
                return contentValues0;
            }
            contentValues0.put("sync1", arr_b);
        }
        return contentValues0;
    }

    public static ContentValues b(eggh eggh0, egpn egpn0) {
        ContentValues contentValues0 = new ContentValues();
        egpo egpo0 = eggh0.c == null ? egpo.a : eggh0.c;
        egpk egpk0 = egpo0.d == null ? egpk.a : egpo0.d;
        long v = (egpk0.d == null ? egpj.a : egpk0.d).c;
        egpo egpo1 = eggh0.c == null ? egpo.a : eggh0.c;
        egpk egpk1 = egpo1.d == null ? egpk.a : egpo1.d;
        egpj egpj0 = egpk1.d == null ? egpj.a : egpk1.d;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egpj0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)egpj0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        egpj egpj1 = (egpj)hftp0.b_message;
        egpj1.b |= 2;
        egpj1.c = v + 1L;
        egpj egpj2 = (egpj)hftp0.N_build();
        egpo egpo2 = eggh0.c == null ? egpo.a : eggh0.c;
        egpk egpk2 = egpo2.d == null ? egpk.a : egpo2.d;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)egpk2).jf(5, null);
        hftp1.X(((ProtoLiteMessage)egpk2));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((egpk)hftv0).c = egpn0;
        ((egpk)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        egpk egpk3 = (egpk)hftp1.b_message;
        egpj2.getClass();
        egpk3.d = egpj2;
        egpk3.b |= 4;
        egpk egpk4 = (egpk)hftp1.N_build();
        egpo egpo3 = eggh0.c == null ? egpo.a : eggh0.c;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)egpo3).jf(5, null);
        hftp2.X(((ProtoLiteMessage)egpo3));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        egpk4.getClass();
        ((egpo)hftv1).d = egpk4;
        ((egpo)hftv1).b |= 2;
        efoy efoy0 = efoy.d;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((egpo)hftp2.b_message).c = efoy0.k;
        ((egpo)hftp2.b_message).b |= 1;
        egpo egpo4 = (egpo)hftp2.N_build();
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)eggh0).jf(5, null);
        hftp3.X(((ProtoLiteMessage)eggh0));
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        eggh eggh1 = (eggh)hftp3.b_message;
        egpo4.getClass();
        eggh1.c = egpo4;
        eggh1.b |= 1;
        contentValues0.put("sync1", Base64.encodeToString(((eggh)hftp3.N_build()).toBytesArray(), 2));
        return contentValues0;
    }

    static String c() {
        String s = hxba.o() ? "(" + ehbq.a() + ")" : ehbq.a();
        if(hxba.z()) {
            s = s + " AND ((sourceid = _id OR sourceid IS NULL ) AND sync1 IS NULL AND sync2 IS NULL AND sync3 IS NULL AND sync4 IS NULL ) ";
        }
        if(hxba.x()) {
            s = s + " AND (data_set IS NULL ) ";
        }
        return hxba.a.e().H() ? s + " AND (deleted = 0) " : s;
    }

    public static final int d(Uri uri0, ehbp ehbp0) {
        return ehbp0.d(uri0, null);
    }

    public static final boolean e(String s, Context context0) {
        hwxg hwxg0 = hwxg.a;
        if(hwxg0.c().e()) {
            egyp egyp0 = egyp.b(context0);
            if(Objects.equals(s, "com.oppo.contacts.device")) {
                long v = System.currentTimeMillis();
                egpq egpq0 = egyp0.a().g;
                if(egpq0 == null) {
                    egpq0 = egpq.a;
                }
                return v - egpq0.c < TimeUnit.DAYS.toMillis(hwxg0.c().a());
            }
        }
        return false;
    }

    public static final ProtoLiteBuilder f(efpm efpm0, egyq egyq0) {
        String s = efpm0.c();
        if(TextUtils.isEmpty(s)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giqz giqz0 = (giqz)hftp0.b_message;
            giqz0.b |= 1;
            giqz0.c = "<NULL_ACCOUNT>";
            int v = egyq0.e("account_type IS NULL");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giqz giqz1 = (giqz)hftp0.b_message;
            giqz1.b |= 2;
            giqz1.d = v;
            return hftp0;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giqz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giqz giqz2 = (giqz)hftp1.b_message;
        s.getClass();
        giqz2.b |= 1;
        giqz2.c = s;
        int v1 = egyq0.e("account_type = " + DatabaseUtils.sqlEscapeString(s));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giqz giqz3 = (giqz)hftp1.b_message;
        giqz3.b |= 2;
        giqz3.d = v1;
        return hftp1;
    }

    public static final int g(Uri uri0, ContentValues contentValues0, String s, ehbp ehbp0) {
        return ehbp0.e(uri0, contentValues0, null);
    }
}

