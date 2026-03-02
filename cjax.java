import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.libs.identity.ImmutableWorkSource;
import java.util.ArrayList;
import java.util.Collection;

public final class cjax {
    public static final ImmutableWorkSource a(ClientIdentity clientIdentity0) {
        int v = clientIdentity0.c;
        WorkSource workSource0 = bbrd.c(v, clientIdentity0.e);
        if(huqy_phenotype.A()) {
            workSource0.createWorkChain().addNode(v, clientIdentity0.f);
        }
        return new ImmutableWorkSource(workSource0);
    }

    public static final ImmutableWorkSource b(Collection collection0) {
        ibuq.f(collection0, "workSources");
        if(collection0.isEmpty()) {
            return ImmutableWorkSource.a;
        }
        WorkSource workSource0 = new WorkSource();
        for(Object object0: collection0) {
            workSource0.add(((WorkSource)object0));
        }
        if(bbrd.g(workSource0)) {
            return ImmutableWorkSource.a;
        }
        int v = workSource0.size();
        int v1 = 0;
        while(v1 < v) {
            if(bbrd.d(workSource0, v1) == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ++v1;
            continue;
        }
        return new ImmutableWorkSource(workSource0);
    }

    public static final ImmutableWorkSource c(Collection collection0) {
        ibuq.f(collection0, "workSources");
        if(collection0.isEmpty()) {
            return ImmutableWorkSource.a;
        }
        if(collection0.size() == 1) {
            return (ImmutableWorkSource)ibpo.Q(collection0);
        }
        ArrayList arrayList0 = new ArrayList(ibpo.q(collection0, 10));
        for(Object object0: collection0) {
            arrayList0.add(((ImmutableWorkSource)object0).c);
        }
        return cjax.b(arrayList0);
    }
}

