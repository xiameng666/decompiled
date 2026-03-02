import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.sqlite.SQLiteDatabase;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ethf {
    public static final int a;
    private static final bboh b;

    static {
        ethf.b = bboh.b("TapAndPay", bbcu.aM);
    }

    public static gtol a(Context context0, List list0, gjwg gjwg0) {
        String s = esge.d();
        SQLiteDatabase sQLiteDatabase0 = eshc.e(context0).c();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: list0) {
            String s1 = (String)object0;
            long v = System.currentTimeMillis() / 1000L;
            byte[] arr_b = evjd.i(sQLiteDatabase0, "SELECT package_allowlist_verdict from WhitelistVerdicts where package_name = ? and environment = ?", new String[]{s1, s});
            if(arr_b == null) {
                ((ggtj)ethf.b.h()).B("Verdict not found in cache for package %s ", s1);
                arrayList1.add(s1);
            }
            else {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtow.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gtow gtow0 = (gtow)hftv0;
                if(gtow0.c > v) {
                    ((ggtj)ethf.b.h()).B("Verdict exists for package %s ", s1);
                    if(!gjwg0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gjwg0).ensureMutable();
                    }
                    ((gjwh)gjwg0.b_message).e = 2;
                    ((gjwh)gjwg0.b_message).b |= 4;
                    arrayList0.add(gtow0);
                }
                else {
                    ((ggtj)ethf.b.h()).B("Verdict expires for package %s ", s1);
                    arrayList1.add(s1);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int v1 = arrayList1.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            String s2 = (String)arrayList1.get(v2);
            gged_interceptors gged0 = ethf.c(context0, s2);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtox.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s2.getClass();
            ((gtox)hftv1).b = s2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gtox gtox0 = (gtox)hftp0.b_message;
            hfuo hfuo0 = gtox0.c;
            if(!hfuo0.c()) {
                gtox0.c = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(gged0, gtox0.c);
            arrayList2.add(((gtox)hftp0.N_build()));
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            ((gjwh)gjwg0.b_message).e = 3;
            ((gjwh)gjwg0.b_message).b |= 4;
            gjwg0.a(gged0);
        }
        if(arrayList2.isEmpty()) {
            ((ggtj)ethf.b.h()).x("No packages to be checked");
            gtok gtok0 = (gtok)((ProtoLiteMessage)gtol.a).v_newBuilder();
            gtok0.a(arrayList0);
            return (gtol)((ProtoLiteBuilder)gtok0).N_build();
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtoj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtoj gtoj0 = (gtoj)hftp1.b_message;
        hfuo hfuo1 = gtoj0.b;
        if(!hfuo1.c()) {
            gtoj0.b = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList2, gtoj0.b);
        gtoj gtoj1 = (gtoj)hftp1.N_build();
        esgi esgi0 = esgj.g(context0, null);
        if(esgi0 == null) {
            esgi0 = new esgi("", "", s, context0);
        }
        gtol gtol0 = hypm.a.b().b() ? ((gtol)etsy.b(esgi0, etti.al, ((MessageLite)gtoj1), ((MessageLite)gtol.a))) : ((gtol)etsy.b(esgi0, etti.am, ((MessageLite)gtoj1), ((MessageLite)gtol.a)));
        for(Object object1: gtol0.b) {
            String s3 = ((gtow)object1).e;
            String s4 = esge.d();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("package_name", s3);
            contentValues0.put("response_proto", new byte[]{1});
            contentValues0.put("package_allowlist_verdict", ((gtow)object1).toBytesArray());
            contentValues0.put("environment", s4);
            sQLiteDatabase0.insertWithOnConflict("WhitelistVerdicts", null, contentValues0, 5);
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gtol0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gtol0));
        ((gtok)hftp2).a(arrayList0);
        return (gtol)((ProtoLiteBuilder)(((gtok)hftp2))).N_build();
    }

    @Deprecated
    public static gtop b(Context context0, String s, gjwg gjwg0) {
        gtop gtop0;
        String s1 = esge.d();
        SQLiteDatabase sQLiteDatabase0 = eshc.e(context0).c();
        byte[] arr_b = evjd.i(sQLiteDatabase0, "SELECT response_proto from WhitelistVerdicts where package_name = ? and environment = ?", new String[]{s, s1});
        if(arr_b != null && !Arrays.equals(arr_b, new byte[]{1})) {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtop.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gtop0 = (gtop)hftv0;
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            ((gjwh)gjwg0.b_message).e = 2;
            ((gjwh)gjwg0.b_message).b |= 4;
        }
        else {
            gtop0 = null;
        }
        if(gtop0 != null && gtop0.c >= System.currentTimeMillis() / 1000L) {
            return gtop0;
        }
        gged_interceptors gged0 = ethf.c(context0, s);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtoo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s.getClass();
        ((gtoo)hftv1).b = s;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtoo gtoo0 = (gtoo)hftp0.b_message;
        hfuo hfuo0 = gtoo0.c;
        if(!hfuo0.c()) {
            gtoo0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, gtoo0.c);
        gtoo gtoo1 = (gtoo)hftp0.N_build();
        if(!gjwg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjwg0).ensureMutable();
        }
        ((gjwh)gjwg0.b_message).e = 3;
        ((gjwh)gjwg0.b_message).b |= 4;
        gjwg0.a(gged0);
        esgi esgi0 = esgj.g(context0, s);
        if(esgi0 == null) {
            esgi0 = new esgi("", "", s1, context0);
        }
        gtop gtop1 = (gtop)etsy.b(esgi0, etti.ac, ((MessageLite)gtoo1), ((MessageLite)gtop.a));
        String s2 = esge.d();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("package_name", s);
        contentValues0.put("response_proto", gtop1.toBytesArray());
        contentValues0.put("environment", s2);
        sQLiteDatabase0.insertWithOnConflict("WhitelistVerdicts", null, contentValues0, 5);
        return gtop1;
    }

    private static gged_interceptors c(Context context0, String s) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x40);
            ggdy ggdy0 = new ggdy();
            Signature[] arr_signature = packageInfo0.signatures;
            for(int v = 0; v < arr_signature.length; ++v) {
                ggdy0.i(ethf.d(arr_signature[v].toByteArray()));
            }
            gged_interceptors gged0 = ggdy0.h();
            if(((ggna)gged0).c > 1) {
                ((ggtj)ethf.b.i()).x("Multiple hashes found using old api");
                return gged0;
            }
            try {
                String s1 = null;
                ggqk ggqk0 = bbms.d(context0, s, "SHA-256").E();
                if(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    s1 = esxg.a(((byte[])object0));
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(!gged0.isEmpty()) {
                if(s1 == null && ((ggna)gged0).c == 1) {
                    ((ggtj)ethf.b.i()).x("Found old hash, but not new hash");
                    return gged0;
                }
                if(gged0.get(0) == null) {
                    ((ggtj)ethf.b.i()).x("Found explicitly-null old hash");
                    return gged0;
                }
                if(!((String)gged0.get(0)).equals(s1)) {
                    ((ggtj)ethf.b.i()).x("New and old hashes don\'t match");
                    return gged0;
                }
            }
            else if(s1 != null) {
                ((ggtj)ethf.b.i()).x("Found new hash, but not old hash");
                return gged0;
            }
            return gged0;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return ggna.a;
        }
    }

    private static String d(byte[] arr_b) {
        MessageDigest messageDigest0;
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new IllegalStateException("No security provider initialized for SHA-256 encoding", noSuchAlgorithmException0);
        }
        messageDigest0.update(arr_b);
        return esxg.a(messageDigest0.digest());
    }
}

