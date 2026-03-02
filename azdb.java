import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import java.util.Map;

final class azdb {
    private static volatile azdb a;
    private final Map b;
    private int c;

    private azdb() {
        this.c = 0;
        this.b = new bxd();
    }

    final BatchedLogErrorParcelable a() {
        BatchedLogErrorParcelable batchedLogErrorParcelable0;
        synchronized(this) {
            Map map0 = this.b;
            ArrayList arrayList0 = new ArrayList(map0.values());
            int v1 = this.c;
            if(v1 > 0) {
                arrayList0.add(new LogErrorParcelable("UNKNOWN", 1002, v1));
                this.c = 0;
            }
            map0.clear();
            batchedLogErrorParcelable0 = new BatchedLogErrorParcelable(arrayList0);
        }
        return batchedLogErrorParcelable0;
    }

    static azdb b() {
        if(azdb.a == null) {
            Class class0 = azdb.class;
            synchronized(class0) {
                if(azdb.a == null) {
                    azdb.a = new azdb();
                }
            }
            return azdb.a;
        }
        return azdb.a;
    }

    final void c(LogErrorParcelable logErrorParcelable0) {
        synchronized(this) {
            kau kau0 = new kau(logErrorParcelable0.a, ((int)logErrorParcelable0.b));
            Map map0 = this.b;
            LogErrorParcelable logErrorParcelable1 = (LogErrorParcelable)map0.get(kau0);
            if(logErrorParcelable1 != null) {
                logErrorParcelable1.c = gluj.c(logErrorParcelable1.c, logErrorParcelable0.c);
                return;
            }
            if(((bzs)map0).d_num >= 100) {
                this.c = gluj.c(this.c, logErrorParcelable0.c);
                return;
            }
            map0.put(kau0, logErrorParcelable0);
        }
    }
}

