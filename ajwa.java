import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;

public final class ajwa extends cjtm {
    private final ajua a;
    private final String b;
    private final String c;

    public ajwa(ajua ajua0, String s, String s1, azug azug0) {
        super(0xAC, "GetRecoveredSecurityDomains", azug0);
        this.a = ajua0;
        batl.q(s1);
        this.b = s1;
        batl.s(s);
        this.c = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            Map map0 = ((akba)akba.b.b()).j(this.b);
        }
        catch(IOException | acse unused_ex) {
            Status status0 = new Status(8);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
            this.a.a(status0, new String[0], apiMetadata0);
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if(s.startsWith(this.c)) {
                hfuo hfuo0 = ((ajxj)map$Entry0.getValue()).d;
                if(!hfuo0.isEmpty() && ((ajxe)gggq.p(hfuo0)).c != 0) {
                    arrayList0.add(s);
                }
            }
        }
        String[] arr_s = new String[arrayList0.size()];
        arrayList0.toArray(arr_s);
        ApiMetadata apiMetadata1 = cckf.d(bbdp.T);
        this.a.a(Status.b, arr_s, apiMetadata1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.a.a(status0, new String[0], apiMetadata0);
    }
}

