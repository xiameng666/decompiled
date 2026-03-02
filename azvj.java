import com.google.android.gms.common.api.Status;

public final class azvj implements Runnable {
    public final aztz a;
    public final Status b;

    public azvj(aztz aztz0, Status status0) {
        this.a = aztz0;
        this.b = status0;
    }

    @Override
    public final void run() {
        this.a.a(this.b);
    }
}

