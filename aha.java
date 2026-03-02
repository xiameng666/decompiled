import android.app.appsearch.SearchResults;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

final class aha implements afy {
    public final aga a;
    public final Context b;
    private final SearchResults c;
    private final Executor d;

    public aha(SearchResults searchResults0, aga aga0, Executor executor0, Context context0) {
        kay.i(searchResults0);
        this.c = searchResults0;
        this.a = aga0;
        this.d = executor0;
        this.b = context0;
    }

    @Override  // afy
    public final gmcd a() {
        gmcd gmcd0 = new jqz();
        agz agz0 = new agz(this, ((jqz)gmcd0));
        this.c.getNextPage(this.d, agz0);
        return gmcd0;
    }

    public final void b(aez aez0, afa afa0, String s, Set set0) {
        bxf bxf0 = new bxf();
        bxe bxe0 = new bxe(((bxf)set0));
        while(bxe0.hasNext()) {
            Object object0 = bxe0.next();
            String s1 = (String)object0;
            if(s1.startsWith(s + ".")) {
                bxf0.add(s1.substring(s.length() + 1));
            }
        }
        if(!bxf0.isEmpty()) {
            aez aez1 = new aez(afa0);
            for(Object object1: afa0.o()) {
                String s2 = (String)object1;
                afa afa1 = afa0.g(s2);
                if(afa1 != null) {
                    this.b(aez1, afa1, s2, bxf0);
                }
                else if(!bxf0.contains(s2)) {
                    aez1.f(s2);
                }
            }
            aez0.a(s, new afa[]{aez1.e()});
        }
    }

    @Override  // afy
    public final void close() {
        this.c.close();
    }
}

