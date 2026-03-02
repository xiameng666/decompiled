import com.google.android.gms.common.api.Status;

public final class erfy extends erha {
    public erfy(azvd azvd0) {
        super(azvd0);
    }

    @Override  // erha
    public final void g(Status status0, long v) {
        if(!status0.e()) {
            this.a.a(status0);
            return;
        }
        this.a.b(Long.valueOf(v));
    }
}

