import android.util.LruCache;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

public final class ekgy {
    public static final ekgy a;
    public final LruCache b;

    static {
        ekgy.a = new ekgy();
    }

    private ekgy() {
        this.b = new LruCache(3);
    }

    public final gfsx a(String s, String s1, String[] arr_s) {
        gsug gsug0 = this.b(s, s1);
        if(gsug0 == null) {
            return gfqx.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gsug0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gsug0));
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = DesugarCollections.unmodifiableList(((gsug)((gsuf)hftp0).b_message).c).iterator();
    label_7:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            gsva gsva0 = (gsva)object0;
            int v = 0;
            while(true) {
                if(v >= arr_s.length) {
                    continue label_7;
                }
                if(gsva0.i.equals(arr_s[v])) {
                    break;
                }
                ++v;
            }
            arrayList0.add(gsva0);
        }
        if(!((gsuf)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gsuf)hftp0))).ensureMutable();
        }
        ((gsug)((gsuf)hftp0).b_message).c = hfvv.a;
        ((gsuf)hftp0).a(arrayList0);
        return gfsx.m(((gsug)((ProtoLiteBuilder)(((gsuf)hftp0))).N_build()));
    }

    public final gsug b(String s, String s1) {
        ekgx ekgx0 = new ekgx(s, s1);
        return (gsug)this.b.get(ekgx0);
    }
}

