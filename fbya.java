import android.text.TextUtils;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import java.util.Locale;

public final class fbya {
    public static String a(int v) {
        switch(v) {
            case 0: 
            case 2: 
            case 21: {
                return "https://payments.sandbox.google.com";
            }
            case 22: {
                return "http://localhost:8889";
            }
            default: {
                return "https://payments.google.com";
            }
        }
    }

    public static String b(int v) {
        if(v != 0 && v != 2) {
            switch(v) {
                case 21: {
                    return "http://localhost:8081";
                }
                case 22: {
                    return "http://localhost:8889";
                }
                case 23: {
                    return hzls.c();
                }
                default: {
                    return "https://wallet.google.com";
                }
            }
        }
        return "https://payments.sandbox.google.com";
    }

    public static String c(int v, String s) {
        if(hzsh.d()) {
            if(v != 0 && v != 2) {
                switch(v) {
                    case 21: {
                        return "http://localhost:8081";
                    }
                    case 22: {
                        return "http://localhost:8889";
                    }
                    case 23: {
                        return hzls.c();
                    }
                    default: {
                        fbia fbia0 = hzsh.b();
                        if(TextUtils.isEmpty(s)) {
                            return "https://wallet.google.com";
                        }
                        if(!fbia0.b(s)) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid region %s to retrieve a url base path for prod.", s));
                        }
                        s.getClass();
                        fbhy fbhy0 = (fbhy)fbia0.b.get(s);
                        if(fbhy0 == null) {
                            throw new IllegalArgumentException();
                        }
                        fbhw fbhw0 = (fbhw)fbhy0.b.get("o1");
                        if(fbhw0 == null) {
                            throw new IllegalArgumentException();
                        }
                        String s1 = (String)fbhw0.b.get(Integer.valueOf(1));
                        if(s1 != null) {
                            return s1;
                        }
                        throw new IllegalArgumentException();
                    }
                }
            }
            fbia fbia1 = hzsh.b();
            if(TextUtils.isEmpty(s)) {
                return "https://payments.sandbox.google.com";
            }
            if(!fbia1.b(s)) {
                throw new IllegalArgumentException("Invalid region to retrieve a url base path for sandbox.");
            }
            s.getClass();
            fbhy fbhy1 = (fbhy)fbia1.b.get(s);
            if(fbhy1 == null) {
                throw new IllegalArgumentException();
            }
            fbhw fbhw1 = (fbhw)fbhy1.b.get("o1");
            if(fbhw1 == null) {
                throw new IllegalArgumentException();
            }
            String s2 = (String)fbhw1.b.get(Integer.valueOf(0));
            if(s2 != null) {
                return s2;
            }
            throw new IllegalArgumentException();
        }
        return fbya.b(v);
    }

    public static String d(int v) {
        return v == 0 || v == 2 || (v == 21 || v == 22 || v == 23) ? hzhs.a.b().a() : hzhs.a.b().c();
    }

    public static String e(ApplicationParameters applicationParameters0) {
        return fbya.d(applicationParameters0.a);
    }
}

