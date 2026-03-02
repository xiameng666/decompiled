import java.util.HashMap;
import java.util.Map;

final class hmmn implements hmnn {
    final Map a;

    public hmmn(fsas fsas0) {
        HashMap hashMap0 = new HashMap();
        fsbb[] arr_fsbb = fsas0.a();
        for(int v = 0; v < arr_fsbb.length; ++v) {
            fsbb fsbb0 = arr_fsbb[v];
            hashMap0.put(fsbb0.d, fsbb0);
        }
        this.a = hashMap0;
    }

    @Override  // hmnn
    public final hmnm a(String s) {
        fsbb fsbb0 = (fsbb)this.a.get(s);
        return fsbb0 == null ? null : new hmmm(this, fsbb0.c);
    }
}

