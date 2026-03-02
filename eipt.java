import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;

public final class eipt {
    private static final bboh a;
    private static final ggfp b;
    private static final ggfp c;
    private static volatile Boolean d;

    static {
        eipt.a = bboh.b("PhUsers", bbcu.al);
        eipt.b = ggfp.K("com.google", "com.google.work");
        eipt.c = new ggoh("cn.google");
    }

    public static boolean a(String s, Context context0) {
        String[] arr_s = eipt.b(context0);
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static String[] b(Context context0) {
        ggfp ggfp0;
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/common/Users", "getDeviceUsers", 27, "Get device users")) {
            if(eipt.d == null) {
                eipt.d = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("cn.google"));
            }
            ggfp0 = eipt.d.booleanValue() ? eipt.c : eipt.b;
            Account[] arr_account = cchj.b(context0).o();
            ArrayList arrayList0 = new ArrayList(arr_account.length);
            for(int v = 0; true; ++v) {
                if(v >= arr_account.length) {
                    break;
                }
                Account account0 = arr_account[v];
                if(ggfp0.contains(account0.type)) {
                    arrayList0.add(account0.name);
                }
            }
            return (String[])arrayList0.toArray(new String[0]);
        }
        catch(SecurityException securityException0) {
            a.ae(eipt.a.i(), "Failed to get device user accounts", securityException0);
            return new String[0];
        }
    }
}

