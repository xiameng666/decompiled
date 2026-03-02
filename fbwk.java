import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

public final class fbwk implements fbob {
    private final SharedPreferences a;

    public fbwk(Context context0) {
        this.a = context0.getSharedPreferences("com.google.android.gms.wallet.service.ib.UserDataStorage", 0);
    }

    @Override  // fbob
    public final Set a() {
        Set set0;
        synchronized(this) {
            set0 = new bxf();
            for(Object object0: this.a.getAll().keySet()) {
                String s = (String)object0;
                ArrayList arrayList0 = new ArrayList();
                int v1 = s.length();
                int v2 = 0;
                while(v2 < v1) {
                    int v3 = fbea.a;
                    if(s.charAt(v2) != v3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Missing part start in storageKey %s", s));
                    }
                    int v4 = s.indexOf(v3, v2 + 1);
                    if(v4 == -1) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Missing part length end in storageKey %s", s));
                    }
                    try {
                        v2 = Integer.parseInt(s.substring(v2 + 1, v4)) + (v4 + 1);
                    }
                    catch(NumberFormatException numberFormatException0) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Non integer part length in storageKey %s", s), numberFormatException0);
                    }
                    if(v2 > v1) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Part length overflow in storageKey %s", s));
                    }
                    arrayList0.add(s.substring(v4 + 1, v2));
                    continue;
                }
                set0.add(new Account(fbea.a(arrayList0), "com.google"));
            }
        }
        return set0;
    }

    @Override  // fbob
    public final void b(Set set0) {
        synchronized(this) {
            Set set1 = this.a.getAll().keySet();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            for(Object object0: set1) {
                String s = (String)object0;
                ArrayList arrayList0 = new ArrayList();
                int v1 = s.length();
                int v2 = 0;
                while(v2 < v1) {
                    int v3 = fbea.a;
                    if(s.charAt(v2) != v3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Missing part start in storageKey %s", s));
                    }
                    int v4 = s.indexOf(v3, v2 + 1);
                    if(v4 == -1) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Missing part length end in storageKey %s", s));
                    }
                    try {
                        v2 = Integer.parseInt(s.substring(v2 + 1, v4)) + (v4 + 1);
                    }
                    catch(NumberFormatException numberFormatException0) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Non integer part length in storageKey %s", s), numberFormatException0);
                    }
                    if(v2 > v1) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Part length overflow in storageKey %s", s));
                    }
                    arrayList0.add(s.substring(v4 + 1, v2));
                    continue;
                }
                if(set0.contains(new Account(fbea.a(arrayList0), "com.google"))) {
                    sharedPreferences$Editor0.remove(s);
                }
            }
            sharedPreferences$Editor0.apply();
        }
    }

    public final hfzc c(int v, Account account0) {
        hfzc hfzc0;
        synchronized(this) {
            hfzc0 = this.d(v, account0, null);
        }
        return hfzc0;
    }

    public final hfzc d(int v, Account account0, Integer integer0) {
        hfzc hfzc0;
        String s1;
        String s;
        synchronized(this) {
            if(account0 != null) {
                s = fbwk.e(v, account0, integer0);
                s1 = this.a.getString(s, null);
                return s1 != null ? ((hfzc)gciq.d(s1, ((Parser)((ProtoLiteMessage)hfzc.a).jf(7, null)))) : null;
            }
            return null;
        }
        try {
            hfzc0 = (hfzc)gciq.d(s1, ((Parser)((ProtoLiteMessage)hfzc.a).jf(7, null)));
        }
        catch(Throwable throwable1) {
            try {
                this.a.edit().remove(s).apply();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    Log.e("UserDataStorage", "Failed to clear corrupted shared preferences key", throwable2);
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                }
            }
            throw throwable0;
        }
        return hfzc0;
    }

    protected static String e(int v, Account account0, Integer integer0) {
        fbem fbem0 = new fbem();
        fbem0.b(v);
        fbem0.c(account0.name);
        if(integer0 != null) {
            fbem0.b(integer0.intValue());
        }
        return fbem0.a();
    }

    public final void f(int v, Account account0, hfzc hfzc0) {
        synchronized(this) {
            this.g(v, account0, hfzc0, null);
        }
    }

    public final void g(int v, Account account0, hfzc hfzc0, Integer integer0) {
        synchronized(this) {
            if(account0 != null) {
                String s = gciq.g(((MessageLite)hfzc0));
                SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
                sharedPreferences$Editor0.putString(fbwk.e(v, account0, integer0), s);
                sharedPreferences$Editor0.apply();
            }
        }
    }
}

