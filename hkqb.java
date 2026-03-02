import j..util.function.Function.-CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Pattern;

public final class hkqb {
    public static gged_interceptors a(List list0, Pattern pattern0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            String s = (String)object0;
            if(pattern0.matcher(s).find()) {
                ggdy0.i(s);
            }
        }
        return ggdy0.h();
    }

    public static boolean b(List list0, hkqd hkqd0, int v) {
        int v1 = 0;
        int v2 = 0;
        int v3 = 101;
        while(v1 < list0.size()) {
            String s = ((String)list0.get(v1)).toLowerCase(Locale.getDefault());
            int v4 = s.length();
            gged_interceptors gged0 = hkqd0.a;
            int v5 = ((ggna)gged0).c;
            int v6 = 0;
            int v7 = 101;
        alab1:
            while(v6 < v5) {
                ggqs ggqs0 = (ggqs)gged0.get(v6);
                int v8 = ggqs0.a();
                if(v4 <= v8) {
                    int v9 = ggqs0.b(s);
                    if(v9 < v7) {
                        if(v9 == 0) {
                            v7 = 0;
                            break;
                        }
                        else {
                            v7 = v9;
                            goto label_31;
                        }
                        goto label_21;
                    }
                }
                else {
                label_21:
                    for(int v10 = 0; v10 < v4 - v8 + 1; ++v10) {
                        int v11 = ggqs0.b(s.substring(v10, v10 + v8));
                        if(v11 < v7) {
                            if(v11 == 0) {
                                v7 = 0;
                                break alab1;
                            }
                            else {
                                v7 = v11;
                            }
                        }
                    }
                }
            label_31:
                ++v6;
            }
            if(v7 == 0) {
                return new hkqc(0, v1).a <= v;
            }
            if(v7 < v3) {
                v2 = v1;
            }
            if(v7 < v3) {
                v3 = v7;
            }
            ++v1;
        }
        return new hkqc(v3, v2).a <= v;
    }

    public static boolean c(List list0, Pattern pattern0) {
        return hkqb.d(list0, pattern0, Function.-CC.identity());
    }

    static boolean d(List list0, Pattern pattern0, Function function0) {
        for(Object object0: list0) {
            if(pattern0.matcher(((CharSequence)function0.apply(((String)object0)))).find()) {
                return true;
            }
        }
        return false;
    }
}

