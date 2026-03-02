import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.IOException;
import java.util.ArrayList;

public final class azeo extends cjtm {
    private final azcx a;
    private final String b;
    private final azgg c;
    private final String d;
    private final boolean e;

    public azeo(azcx azcx0, String s, azgg azgg0, String s1, boolean z) {
        super(40, "GetLogEventParcelablesOperation");
        this.a = azcx0;
        this.b = s;
        this.c = azgg0;
        this.d = s1;
        this.e = z;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(!ClearcutLoggerChimeraService.c(this.d)) {
            throw new cjuh(31001, "Debug operation disallowed");
        }
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = this.c.b();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            azge azge0 = (azge)gged0.get(v1);
            try {
                if(this.e) {
                    arrayList0.addAll(azge0.j(this.b));
                }
                else {
                    arrayList0.addAll(azge0.k(this.b));
                }
            }
            catch(IOException iOException0) {
                Log.e("CCTGetEventParcelables", "Unable to query log events for log source " + this.b, iOException0);
                throw new cjuh(31005, "Unable to query log events for log source " + this.b);
            }
        }
        baks baks0 = new baks(bakq.b);
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            bakq.e(baks0, ((LogEventParcelable)arrayList0.get(v3)));
        }
        try(DataHolder dataHolder0 = new DataHolder(baks0, 0)) {
            this.a.e(dataHolder0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        try(DataHolder dataHolder0 = new DataHolder(DataHolder.a, status0.i)) {
            this.a.e(dataHolder0);
        }
    }
}

