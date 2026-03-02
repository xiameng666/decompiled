import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public final class criz implements Runnable {
    public final crja a;
    public final clcq b;

    public criz(crja crja0, clcq clcq0) {
        this.a = crja0;
        this.b = clcq0;
    }

    @Override
    public final void run() {
        int v = this.b.a();
        HashMap hashMap0 = new HashMap();
        ggqj ggqj0 = this.b.d().v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            hashMap0.put(((String)((Map.Entry)object0).getKey()), ((List)((Map.Entry)object0).getValue()));
        }
        byte[] arr_b = ((ByteArrayOutputStream)this.a.i()).toByteArray();
        this.a.b.a(this.a.a, v, null, arr_b, hashMap0);
    }
}

