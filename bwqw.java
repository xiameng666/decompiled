import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Request;

public final class bwqw {
    public static void a(bwmx bwmx0, bwud bwud0, bwsa bwsa0) {
        String s = bwsa0.c();
        CorpusStatus corpusStatus0 = bwmx0.P(bwud0, s, bwsa0.b);
        if(corpusStatus0.a && (corpusStatus0.f == null || Integer.parseInt(corpusStatus0.f) == bwsa0.a.e)) {
            return;
        }
        bwne.b("Couldn\'t find corpus \'%s\'.", s);
        RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0 = bwtd.a(bwsa0);
        bwqv bwqv0 = new bwqv(bwmx0.b, bwmx0, registerCorpusInfoCall$Request0, bwud0, s);
        bwmx0.c.h(bwqv0);
    }
}

