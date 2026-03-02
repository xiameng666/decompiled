import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class srt extends stc {
    public final Map a;
    private final boolean b;

    public srt(srs srs0) {
        this(srs0, Collections.EMPTY_LIST, true);
    }

    public srt(srs srs0, List list0, boolean z) {
        super(srs0.c, new byte[0], false, ssa.c);
        this.a = new LinkedHashMap();
        this.b = z;
        for(Object object0: list0) {
            srv srv0 = (srv)object0;
            Integer integer0 = srv0.a.a();
            if(!this.a.containsKey(integer0)) {
                this.a.put(integer0, srv0);
            }
        }
    }

    @Override  // ssx, ssw
    public final byte[] a() {
        byte[] arr_b;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ArrayList arrayList0 = new ArrayList(this.a.values());
        if(this.b) {
            Collections.sort(arrayList0, new srr(this));
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            srv srv0 = (srv)arrayList0.get(v1);
            List list0 = srv0.b;
            if(list0.isEmpty()) {
                arr_b = new byte[0];
            }
            else {
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                stq.a(srv0.a.d(), byteArrayOutputStream1);
                stq.b(((byte)list0.size()), byteArrayOutputStream1);
                for(Object object0: list0) {
                    byteArrayOutputStream1.write(((sss)object0).a());
                }
                arr_b = byteArrayOutputStream1.toByteArray();
            }
            stq.a(arr_b, byteArrayOutputStream0);
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

