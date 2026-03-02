import com.google.android.gms.audit.LogAuditRecordsRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class acqo {
    public int a;
    public int b;
    public String c;
    public byte[] d;
    private final List e;

    public acqo() {
        this.e = new ArrayList();
    }

    public final LogAuditRecordsRequest a() {
        if(this.a != 1 && this.a != 2) {
            throw new IllegalStateException("Invalid WriteMode.");
        }
        List list0 = this.e;
        if(list0.isEmpty()) {
            throw new IllegalStateException("Must specify at least one audit record.");
        }
        int v = this.b;
        if(v != 0) {
            return new LogAuditRecordsRequest(this.a, v, this.c, ((byte[][])list0.toArray(new byte[0][])), null, this.d);
        }
        throw new IllegalStateException("Invalid componentId.");
    }

    public final void b(byte[] arr_b) {
        this.e.add(arr_b);
    }

    public final void c(Collection collection0) {
        this.e.addAll(collection0);
    }
}

