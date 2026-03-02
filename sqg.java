import com.android.volley.Header;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class sqg {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public sqg(String s, String s1, long v, long v1, long v2, long v3, List list0) {
        this.b = s;
        if("".equals(s1)) {
            s1 = null;
        }
        this.c = s1;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = list0;
    }

    public static sqg a(sqh sqh0) {
        if(DiskBasedCache.a(sqh0) != 0x20150306) {
            throw new IOException();
        }
        String s = DiskBasedCache.c(sqh0);
        String s1 = DiskBasedCache.c(sqh0);
        long v = DiskBasedCache.b(sqh0);
        long v1 = DiskBasedCache.b(sqh0);
        long v2 = DiskBasedCache.b(sqh0);
        long v3 = DiskBasedCache.b(sqh0);
        int v4 = DiskBasedCache.a(sqh0);
        if(v4 < 0) {
            throw new IOException("readHeaderList size=" + v4);
        }
        List list0 = v4 == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for(int v5 = 0; v5 < v4; ++v5) {
            list0.add(new Header(DiskBasedCache.c(sqh0).intern(), DiskBasedCache.c(sqh0).intern()));
        }
        return new sqg(s, s1, v, v1, v2, v3, list0);
    }
}

