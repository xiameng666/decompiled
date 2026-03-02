import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class eglo extends cjtm {
    private final egyo a;
    private final efzc b;
    private final int[] c;

    public eglo(efzc efzc0, Context context0, int[] arr_v, azug azug0) {
        super(0xD0, "RemoveAccountCategoryFromBackupAndSync", azug0);
        this.a = egyo.d(context0);
        this.c = arr_v;
        this.b = efzc0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        this.a.i(this.c);
        this.b.x(Status.b, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.x(status0, ApiMetadata.b);
    }
}

