import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

public final class eztb {
    public static final bboh a;
    private static final byte[] b;

    static {
        eztb.a = bboh.d();
        eztb.b = new byte[]{-17, -83, 24, -66, -52, 55, 29, -9, -45, 86, -1, -35, -93, 91, (byte)0xD1, 53, 53, -120, (byte)0xA1, 23};
    }

    public static hfqe a(Context context0, String s) {
        String s1;
        if(TextUtils.isEmpty(s)) {
            s1 = null;
        }
        else if(ezta.a().a.containsKey(s)) {
            s1 = (String)ezta.a().a.get(s);
        }
        else {
            String s2 = eztb.b(context0, s);
            if(s2 == null) {
                s1 = null;
            }
            else {
                SharedPreferences sharedPreferences0 = context0.getSharedPreferences("UdcConsistencyTokenPrefs", 0);
                if(sharedPreferences0.getBoolean(s2 + ":UdcConsistencyTokenPrefsHas", false)) {
                    long v = sharedPreferences0.getLong(s2 + ":UdcConsistencyTokenPrefsAge", 0L);
                    Long.valueOf(v).getClass();
                    s1 = v > System.currentTimeMillis() ? sharedPreferences0.getString(s2 + ":UdcConsistencyTokenPrefsToken", null) : null;
                }
                else {
                    s1 = null;
                }
            }
        }
        if(s1 == null) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfqe hfqe0 = (hfqe)hftp0.b_message;
        hfqe0.b |= 1;
        hfqe0.c = s1;
        return (hfqe)hftp0.N_build();
    }

    public static String b(Context context0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        MessageDigest messageDigest0 = bbms.g("MD5");
        if(messageDigest0 == null) {
            ((ggtj)eztb.a.i()).x("couldn\'t get a digest");
            return null;
        }
        String s1 = bzoe.h(context0).b();
        if(!TextUtils.isEmpty(s1)) {
            messageDigest0.update(s1.getBytes());
        }
        if(!TextUtils.isEmpty(Build.MODEL)) {
            messageDigest0.update(Build.MODEL.getBytes());
        }
        messageDigest0.update(eztb.b);
        byte[] arr_b = messageDigest0.digest(s.getBytes());
        if(arr_b == null) {
            ((ggtj)eztb.a.i()).x("couldn\'t digest account-id");
            return null;
        }
        return bboy.e(arr_b);
    }

    public static void c(Context context0, String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("UdcConsistencyTokenPrefs", 0).edit();
        sharedPreferences$Editor0.remove(s + ":UdcConsistencyTokenPrefsHas");
        sharedPreferences$Editor0.remove(s + ":UdcConsistencyTokenPrefsToken");
        sharedPreferences$Editor0.remove(s + ":UdcConsistencyTokenPrefsAge");
        sharedPreferences$Editor0.apply();
    }

    public static void d(hfqf hfqf0, Context context0, String s) {
        batl.r(s, "AccountId must not be empty");
        if(hfqf0 != null && (hfqf0.b & 1) != 0) {
            int v = (hfqf0.c == null ? gdjo.a : hfqf0.c).d;
            gdjo gdjo0 = hfqf0.c;
            if(((gdjo0 == null ? gdjo.a : gdjo0).b & 1) != 0) {
                if(gdjo0 == null) {
                    gdjo0 = gdjo.a;
                }
                String s1 = gdjo0.c;
                String s2 = eztb.b(context0, s);
                if(s2 != null) {
                    if(v <= 0) {
                        eztb.c(context0, s2);
                        if(v == 0) {
                            ezta.a().b(s);
                            return;
                        }
                        ezta.a().a.put(s, s1);
                        return;
                    }
                    SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("UdcConsistencyTokenPrefs", 0).edit();
                    sharedPreferences$Editor0.putBoolean(s2 + ":UdcConsistencyTokenPrefsHas", true);
                    sharedPreferences$Editor0.putString(s2 + ":UdcConsistencyTokenPrefsToken", s1);
                    sharedPreferences$Editor0.putLong(s2 + ":UdcConsistencyTokenPrefsAge", System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(((long)v)));
                    ezta.a().b(s);
                    sharedPreferences$Editor0.apply();
                }
            }
        }
    }
}

