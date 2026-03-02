import android.text.TextUtils;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.STSortSpec;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public final class bwnb {
    public static final bwna a;
    public static final bwna b;
    private static final Pattern c;

    static {
        bwnb.c = Pattern.compile("(\\p{Alnum}|[-._/])+");
        bwnb.a = new bwmy();
        bwnb.b = new bwmz();
    }

    public static final String a(String s, String s1, int v) {
        try {
            bwnb.f(s, s1, v);
            return null;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            return illegalArgumentException0.getMessage();
        }
    }

    public static String b(String s) {
        if(s != null && !TextUtils.isEmpty(s)) {
            if(s.length() > 0x40) {
                return "Query origin too long, max is 64: " + s;
            }
            return bwnb.c.matcher(s).matches() ? null : "Incorrect query origin format. Should use following format: [a-zA-Z0-9._-/]+";
        }
        return null;
    }

    public static String c(QuerySpecification querySpecification0) {
        List list0 = querySpecification0.b;
        if(list0 != null) {
            if(list0.size() > 16) {
                return "Too many tags requested.";
            }
            for(Object object0: list0) {
                String s = bwnb.a("Tag", ((String)object0), 1000);
                if(s != null) {
                    return s;
                }
            }
        }
        if(querySpecification0.c != null && querySpecification0.c.size() > 16) {
            return "Too many sections requested.";
        }
        String s1 = bwnb.d(querySpecification0.h);
        if(s1 != null) {
            return s1;
        }
        String s2 = bwnb.b(querySpecification0.m);
        return s2 == null ? bwnb.e(querySpecification0.f, querySpecification0.l) : s2;
    }

    public static String d(int v) {
        return v < 0 || v > 3 ? "Invalid query tokenizer" : null;
    }

    public static String e(int v, STSortSpec sTSortSpec0) {
        if(sTSortSpec0 != null) {
            if(v != 5) {
                return "RankingStrategy.ST_SORT and STSortSpec must be set together.";
            }
            v = 5;
        }
        if(sTSortSpec0 == null && v == 5) {
            return "RankingStrategy.ST_SORT and STSortSpec must be set together.";
        }
        return v < 0 || v > 5 ? "Invalid ranking strategy." : null;
    }

    public static final void f(String s, String s1, int v) {
        if(TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException(s + " empty");
        }
        bwnb.l(s, s1, v);
    }

    public static final void g(String s, Object object0) {
        if(object0 != null) {
            return;
        }
        throw new IllegalArgumentException(s + " null");
    }

    public static final void h(String s, String s1, int v) {
        bwnb.g(s, s1);
        bwnb.l(s, s1, v);
    }

    public static void i(String s) {
        bwnb.f("Corpus name", s, 0x800);
        if(s.charAt(0) != 46) {
            return;
        }
        throw new IllegalArgumentException("Corpus name cannot start with .");
    }

    public static final void j(String s) {
        try {
            bwwb bwwb0 = new bwwb(s);
            if(bwwb0.h() || !bwwd.p(bwwb0.a())) {
                throw bwwb0.b("Expected a letter or _");
            }
            bwwb0.f();
            while(!bwwb0.h()) {
                if(!bwwd.q(bwwb0.a())) {
                    throw bwwb0.b("Invalid character; only letters, digits and _ are allowed");
                }
                bwwb0.f();
            }
        }
        catch(bwvz bwvz0) {
            throw new IllegalArgumentException("Invalid section name: " + bwvz0.a());
        }
        if(s.length() <= 0x40) {
            return;
        }
        throw new IllegalArgumentException("Section name too long, max is 64: " + s);
    }

    public static final void k(int v) {
        if(v >= 0 && v <= 0x3F) {
            return;
        }
        throw new IllegalArgumentException(a.f(v, "Bad section weight: [", "]"));
    }

    public static final void l(String s, String s1, int v) {
        if(s1.length() <= v) {
            return;
        }
        throw new IllegalArgumentException(a.W(v, s, " too long (max ", ")"));
    }

    public static final String m(RegisterCorpusInfo registerCorpusInfo0) {
        try {
            bwnb.i(registerCorpusInfo0.a);
            bwnb.h("Version tag", registerCorpusInfo0.b, 100);
            bwnb.g("Content provider uri", registerCorpusInfo0.c);
            bwnb.f("Content provider uri", registerCorpusInfo0.c.toString(), 0x800);
            RegisterSectionInfo[] arr_registerSectionInfo = registerCorpusInfo0.d;
            if(arr_registerSectionInfo == null) {
                return "Section information is missing";
            }
            if(arr_registerSectionInfo.length > 16) {
                return "Too many sections (max: 16)";
            }
            HashMap hashMap0 = new HashMap();
            int v = 0;
            while(v < arr_registerSectionInfo.length) {
                RegisterSectionInfo registerSectionInfo0 = arr_registerSectionInfo[v];
                if(registerSectionInfo0 == null) {
                    return "Null section info";
                }
                String s = registerSectionInfo0.a;
                bwnb.j(s);
                String s1 = registerSectionInfo0.b;
                if(s1 != null && !abwk.a.contains(s1)) {
                    throw new IllegalArgumentException(a.a(s1, "Bad section format: [", "]"));
                }
                if("blob".equals(s1) && !registerSectionInfo0.c) {
                    return "Format cannot be indexed";
                }
                bwnb.k(registerSectionInfo0.d);
                String s2 = registerSectionInfo0.f;
                if(s2 != null && s2.length() > 24) {
                    throw new IllegalArgumentException("Subsection separator string too long, max is 24: " + s2);
                }
                if(hashMap0.containsKey(s)) {
                    return "Duplicate section name " + s;
                }
                hashMap0.put(s, registerSectionInfo0);
                double f = abwy.a(registerSectionInfo0);
                if(f > 0.0 && f <= 1.0) {
                    double f1 = abwy.b(registerSectionInfo0);
                    int v1 = Double.compare(f1, 1.0);
                    if(v1 != 0 && !"rfc822".equals(s1)) {
                        return "DemoteRfc822Hostname feature only allowed on rfc822 sections.";
                    }
                    if(f1 > 0.0 && v1 <= 0) {
                        if(abwy.d(registerSectionInfo0) && !"url".equals(s1)) {
                            return "omniboxUrlSection only allowed on url section";
                        }
                        ++v;
                        continue;
                    }
                    return a.E(f1, "Bad demote rfc822 hostname factor ");
                }
                return a.E(f, "Bad demote common words factor ");
            }
            return null;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            return illegalArgumentException0.getMessage();
        }
    }

    public static final void n(byte[] arr_b) {
        if(arr_b.length <= 0xFA00) {
            return;
        }
        throw new IllegalArgumentException("Contents too long (max 64000)");
    }
}

