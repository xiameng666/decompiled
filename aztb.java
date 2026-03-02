import com.google.android.gms.common.api.Status;

public class aztb extends Exception {
    @Deprecated
    public final Status a;

    public aztb(Status status0) {
        super(status0.i + ": " + (status0.j == null ? "" : status0.j));
        this.a = status0;
    }

    public final int b() {
        return this.a.i;
    }
}

