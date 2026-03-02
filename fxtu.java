import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;
import java.util.Iterator;

public final class fxtu {
    public final SharedPreferences a;

    private fxtu(SharedPreferences sharedPreferences0) {
        this.a = sharedPreferences0;
    }

    public static fxtu a(Context context0) {
        fxuq.a();
        return new fxtu(context0.getSharedPreferences("ULR_PERSISTENT_PREFS", 0));
    }

    public final ReportingConfig b() {
        Long long0;
        long v7;
        String s5;
        int v6;
        ReportingConfig reportingConfig1;
        String s4;
        fxrz fxrz0;
        byte[] arr_b;
        ReportingConfig reportingConfig0 = null;
        String s = this.a.getString("reportingConfig", null);
        if(s != null && !s.isEmpty()) {
            try {
                arr_b = Base64.decode(s, 2);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                fxqw.h(illegalArgumentException0);
                arr_b = null;
            }
            if(arr_b != null) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fxrz.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    fxrz0 = (fxrz)hftv0;
                }
                catch(hfur hfur0) {
                    fxqw.h(hfur0);
                    return null;
                }
                ArrayList arrayList0 = new ArrayList();
                if((2 & fxrz0.b) != 0) {
                    for(Iterator iterator0 = fxrz0.c.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                        Object object0 = iterator0.next();
                        fxrl fxrl0 = (fxrl)object0;
                        int v = fxrl0.b;
                        String s1 = (v & 1) == 0 ? reportingConfig0 : fxrl0.c;
                        String s2 = (v & 2) == 0 ? reportingConfig0 : fxrl0.d;
                        Account account0 = new Account(s1, s2);
                        Conditions conditions0 = Conditions.b((fxrl0.o == null ? fxrp.a : fxrl0.o));
                        boolean z = fxrl0.e;
                        long v1 = fxrl0.f;
                        boolean z1 = fxrl0.g;
                        boolean z2 = fxrl0.i;
                        int v2 = fxrl0.b;
                        String s3 = (0x40000 & v2) == 0 ? reportingConfig0 : fxrl0.t;
                        boolean z3 = fxrl0.j;
                        if((0x80000 & v2) == 0) {
                            reportingConfig1 = reportingConfig0;
                            s4 = reportingConfig1;
                        }
                        else {
                            s4 = fxrl0.u;
                            reportingConfig1 = reportingConfig0;
                        }
                        long v3 = fxrl0.k;
                        int v4 = fxrl0.l;
                        boolean z4 = fxrl0.m;
                        boolean z5 = fxrl0.n;
                        int v5 = fxrl0.p;
                        if((v2 & 0x8000) == 0) {
                            v6 = v5;
                            s5 = reportingConfig1;
                        }
                        else {
                            v6 = v5;
                            s5 = fxrl0.r;
                        }
                        if((0x10000 & v2) == 0) {
                            v7 = v3;
                            long0 = reportingConfig1;
                        }
                        else {
                            v7 = v3;
                            long0 = (long)fxrl0.s;
                        }
                        Long long1 = (fxrl0.b & 0x100000) == 0 ? reportingConfig1 : ((long)fxrl0.v);
                        arrayList0.add(new AccountConfig(account0, z, v1, z1, z2, s3, z3, s4, v7, v4, z4, z5, conditions0, v6, s5, long0, long1, fxrl0.w, fxsf.a(fxrl0.x), fxrl0.y, fxrl0.z));
                        reportingConfig0 = reportingConfig1;
                        arrayList0 = arrayList0;
                    }
                    return new ReportingConfig(arrayList0, Conditions.b((fxrz0.d == null ? fxrp.a : fxrz0.d)));
                }
                fxqw.m(23, "Received invalid proto");
                return null;
            }
            return null;
        }
        return null;
    }

    public final Integer c(Account account0) {
        SharedPreferences sharedPreferences0 = this.a;
        String s = fxtu.g(account0);
        if(sharedPreferences0.contains(s)) {
            return sharedPreferences0.getInt(s, 0);
        }
        if(sharedPreferences0.contains("deviceTag")) {
            int v = sharedPreferences0.getInt("deviceTag", 0);
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.remove("deviceTag");
            sharedPreferences$Editor0.putInt(s, v);
            sharedPreferences$Editor0.apply();
            return v;
        }
        return null;
    }

    public static String d(Account account0) {
        return fxtv.a(account0).g;
    }

    public static String e(Account account0) {
        return fxtv.a(account0).f;
    }

    public static String f(Account account0) {
        return fxtv.a(account0).e;
    }

    public static String g(Account account0) {
        return fxtv.a(account0).a;
    }

    public static String h(Account account0) {
        return fxtv.a(account0).c;
    }

    public static String i(Account account0) {
        return fxtv.a(account0).b;
    }

    public static String j(Account account0) {
        return fxtv.a(account0).d;
    }

    public final boolean k() {
        return this.a.getBoolean("privateModeKey", false);
    }

    public final boolean l(int v, String s) {
        SharedPreferences sharedPreferences0 = this.a;
        int v1 = sharedPreferences0.getInt(s, -1);
        if(v1 != -1 && v == v1) {
            return false;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.putInt(s, v);
        sharedPreferences$Editor0.apply();
        return true;
    }
}

