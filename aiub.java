import com.google.android.gms.auth.blockstore.service.FolsomIntentOperation;
import j..util.Objects;

public final class aiub implements gmbg {
    public aiub(FolsomIntentOperation folsomIntentOperation0) {
        Objects.requireNonNull(folsomIntentOperation0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(FolsomIntentOperation.a.i(), "Failed to restore from Cloud", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ((ggtj)FolsomIntentOperation.a.h()).B("restored %s bytes from cloud.", ((Integer)object0));
    }
}

