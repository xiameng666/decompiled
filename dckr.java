import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import j..util.Objects;

final class dckr implements Runnable {
    final dcks a;

    public dckr(dcks dcks0) {
        Objects.requireNonNull(dcks0);
        this.a = dcks0;
        super();
    }

    @Override
    public final void run() {
        dcvz.a.b().h("Registering the foreground receive surface is timeout %s millis.", Long.valueOf(hvqs.an()));
        dcks dcks0 = this.a;
        dcks0.d = false;
        kau kau0 = dcks0.c;
        if(kau0 != null) {
            dcks0.e(((ShareTarget)kau0.a), ((TransferMetadata)kau0.b));
            dcks0.c = null;
        }
    }
}

