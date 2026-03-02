import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;
import j..util.Objects;
import java.util.Collection;
import java.util.HashSet;

final class febh implements Runnable {
    public febg a;
    final febl b;
    private final Collection c;

    public febh(febl febl0, Collection collection0) {
        Objects.requireNonNull(febl0);
        this.b = febl0;
        super();
        this.a = null;
        this.c = collection0;
    }

    @Override
    public final void run() {
        febl febl0 = this.b;
        gged_interceptors gged0 = febl0.g.a.a();
        Collection collection0 = this.c;
        gftb.check(collection0);
        gftb.b(((boolean)(collection0.isEmpty() ^ 1)), "Remote accounts can\'t be empty.");
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            fewz fewz0 = (fewz)object0;
            hashSet0.add(fewz0.d);
            if((fewz0.b & 1) != 0) {
                hashSet1.add(fewz0.c);
            }
        }
        for(Object object1: collection0) {
            fewz fewz1 = (fewz)object1;
            if(((fewz1.b & 1) == 0 || !hashSet1.contains(fewz1.c)) && !hashSet0.contains(fewz1.d)) {
                hashSet2.add(fewz1);
            }
        }
        febl0.f = new AccountsMatcher.AccountsMatcherResult(ggfp.G(gged0), ggfp.G(collection0), ggfp.G(hashSet2));
        febg febg0 = this.a;
        if(febg0 != null) {
            febg0.a(febl0.f);
        }
    }
}

