import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Request;
import java.util.ArrayList;
import java.util.List;

public final class bwtd {
    public static RegisterCorpusInfoCall.Request a(bwsa bwsa0) {
        abwh abwh0 = new abwh(bwsa0.c());
        bwqk bwqk0 = bwsa0.a;
        abwh0.a = Integer.toString(bwqk0.e);
        String s = Uri.encode(bwsa0.d());
        String s1 = bwsa0.b;
        String s2 = Uri.encode(s1);
        abwh0.b = Uri.parse((bwsv.a + "/?type=" + s + "&client=" + s2));
        String s3 = bwqk0.b;
        abwh0.e = ((Boolean)bwvu.a.b()).booleanValue() && !hubg.a.j().y().b.contains(a.r(s3, s1, ":"));
        if(!bwtj.f(s1)) {
            abwh0.j = (int)hubg.b();
        }
        if(gopv.b(bwsa0.c)) {
            ArrayList arrayList0 = new ArrayList();
            abwh0.d = abvu.a(new int[10], arrayList0);
        }
        abwj abwj0 = new abwj("thing_proto");
        abwj0.a = "blob";
        abwj0.b = true;
        abwh0.b(abwj0);
        for(Object object0: bwqk0.d) {
            bwqj bwqj0 = (bwqj)object0;
            abwj abwj1 = new abwj(bwqj0.b);
            abwj1.e = "\u0000";
            abwj1.d = bwqj0.d.equals("plain") || bwqj0.d.equals("rfc822") || bwqj0.d.equals("url");
            abwj1.a = bwqj0.d;
            abwj1.c = bwqj0.e;
            abwj1.b = bwqj0.e == 0;
            abwj1.g = new ScoringConfig((bwqj0.g == null ? bwwm.a : bwqj0.g).b);
            if(!bwqj0.f.isEmpty()) {
                abwj1.b(abwy.c(((String[])bwqj0.f.toArray(new String[0]))));
            }
            if("com.google.android.gms".equals(s1) && "Person".equals(bwqk0.b) && ("name".equals(bwqj0.b) || "additionalName".equals(bwqj0.b))) {
                abwj1.b(new Feature(1));
            }
            abwh0.c(abwj1.a());
        }
        RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0 = new RegisterCorpusInfoCall.Request();
        registerCorpusInfoCall$Request0.a = s1;
        registerCorpusInfoCall$Request0.b = bwsa0.c();
        registerCorpusInfoCall$Request0.c = abwh0.a();
        return registerCorpusInfoCall$Request0;
    }

    public static String b(String s) {
        return "CREATE INDEX [" + s + "_uri_index] ON [" + s + "](uri)";
    }

    public static String c(String s) {
        return '[' + s + ']';
    }

    public static List d(bwqk bwqk0) {
        List list0 = new ArrayList();
        list0.add(new Pair("seqno", "INTEGER PRIMARY KEY AUTOINCREMENT"));
        list0.add(new Pair("action", "STRING"));
        list0.add(new Pair("uri", "STRING"));
        list0.add(new Pair("tag", "STRING"));
        list0.add(new Pair("doc_score", "INTEGER"));
        list0.add(new Pair("created_timestamp", "INTEGER"));
        list0.add(new Pair("section_thing_proto", "BLOB"));
        for(Object object0: bwqk0.d) {
            list0.add(new Pair("section_" + ((bwqj)object0).b, "STRING"));
        }
        return list0;
    }
}

