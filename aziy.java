import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.common.api.Status;
import j..time.Instant;
import j..util.Optional;

public final class aziy extends cjtm {
    private final ibnf a;
    private final LogOccurrenceRequest b;
    private final String c;
    private final azkv d;

    public aziy(ibnf ibnf0, LogOccurrenceRequest logOccurrenceRequest0, azkv azkv0, String s) {
        super(364, "LogOccurrence");
        this.a = ibnf0;
        this.b = logOccurrenceRequest0;
        this.d = azkv0;
        this.c = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        LogOccurrenceRequest logOccurrenceRequest0 = this.b;
        if(Long.compare(logOccurrenceRequest0.d, 0L) < 0) {
            throw new cjuh(10, String.format("Cobalt Occurrence count must not be negative, got: %d", ((long)this.b.d)));
        }
        int v = 0;
        while(true) {
            int[] arr_v = logOccurrenceRequest0.e;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = arr_v[v];
            if(v1 < 0) {
                throw new cjuh(10, String.format("Cobalt event vectors can\'t contain negative event codes, got: %d", v1));
            }
            ++v;
            continue;
        }
        azla azla0 = ((azlb)this.a).a();
        int v2 = logOccurrenceRequest0.a;
        int v3 = logOccurrenceRequest0.b;
        int v4 = logOccurrenceRequest0.c;
        long v5 = logOccurrenceRequest0.d;
        int[] arr_v1 = logOccurrenceRequest0.e;
        bboh bboh0 = azla.a;
        Integer integer0 = v2;
        Integer integer1 = v3;
        Integer integer2 = v4;
        ((ggtj)((ggtj)bboh0.h()).ar(0x653)).aa("Logging Cobalt occurrence for metric %d-%d-%d, with count %d and event vector %s, for caller: %s", integer0, integer1, integer2, Long.valueOf(v5), arr_v1, this.c);
        String s = this.c;
        Instant instant0 = azla0.c.d();
        Optional optional0 = azla0.d(azla0.b(v2, v3), v2, v3, v4);
        if(!optional0.isEmpty()) {
            if(gemz.a(((gena)optional0.get()).c) != 10) {
                azla0.d.b("WRONG_METRIC_TYPE", v2, v3);
                throw new cjuh(10, String.format("logOccurrence must be called for a Cobalt OCCURRENCE (8) metric, %d-%d-%d is of type: %d", integer0, integer1, integer2, ((int)((gena)optional0.get()).c)));
            }
            ((ggtj)((ggtj)bboh0.h()).ar(1620)).X("Loaded Cobalt registry contains metric: %d-%d-%d", integer0, integer1, integer2);
            aziq aziq0 = azla0.a(v2, v3);
            try {
                if(aziq0.d) {
                    azla0.e(v2, v3, v4, v5, arr_v1, s, azla0.c(s, v2, v3), instant0, ((gena)optional0.get()));
                }
                else {
                    azkp azkp0 = new azkp(v2, v3);
                    azla0.b.b(azkp0, instant0);
                }
            }
            catch(SQLiteException sQLiteException0) {
                azla0.d.b("DATABASE_ERROR", v2, v3);
                ((ggtj)((ggtj)azla.a.j()).ar(0x655)).X("Database error while logging Cobalt occurrence for metric %d-%d-%d", Integer.valueOf(v2), Integer.valueOf(v3), Integer.valueOf(v4));
                throw sQLiteException0;
            }
        }
        this.d.b(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.b(status0);
    }
}

