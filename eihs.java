import android.content.Intent;
import com.google.android.gms.personalsafety.spotbackend.FinderIdentificationIntentOperation;
import com.google.android.gms.personalsafety.utils.LocalBroadcastReceiver;
import j..util.Objects;

public final class eihs implements gmbg {
    final FinderIdentificationIntentOperation a;

    public eihs(FinderIdentificationIntentOperation finderIdentificationIntentOperation0) {
        Objects.requireNonNull(finderIdentificationIntentOperation0);
        this.a = finderIdentificationIntentOperation0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(eicd.a.j(), "Failed to obtain device identifier (unexpected error)", throwable0);
        this.a.b();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((ByteString)object0) != null && !((ByteString)object0).isEmpty()) {
            String s = frai.h(((ByteString)object0));
            Intent intent0 = new Intent("com.google.android.gms.personalsafety.FINDER_GET_IDENTIFIER_ACTION").putExtra("FinderIdentificationStatusCodeKey", 0).putExtra("FinderDeviceIdentifierKey", s);
            LocalBroadcastReceiver.c(this.a.getApplicationContext(), intent0);
            return;
        }
        ((ggtj)eicd.a.j()).x("Empty deviceIdentifier");
    }
}

