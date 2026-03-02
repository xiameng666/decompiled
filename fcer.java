import android.content.Context;
import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

public final class fcer extends azts {
    public final fdgx a;

    public fcer(Context context0, aztr_settings aztr0) {
        super(context0, fcfo.a, fcfn.a, aztr0);
        this.a = new fdgx();
    }

    public final evql e(Uri uri0) {
        baqc.c(uri0, "uri must not be null");
        fdgt fdgt0 = new fdgt(this.a, this.D, uri0);
        this.D.c(fdgt0);
        return batf.b(fdgt0, new fdhb());
    }

    public final evql f(Uri uri0) {
        fdgr fdgr0 = new fdgr(this.a, this.D, uri0);
        this.D.c(fdgr0);
        return batf.b(fdgr0, new fdhc());
    }

    public final evql g() {
        fdgo fdgo0 = new fdgo(this.a, this.D);
        this.D.c(fdgo0);
        return batf.b(fdgo0, new fdhd());
    }

    public final evql h(PutDataRequest putDataRequest0) {
        fdgq fdgq0 = new fdgq(this.a, this.D, putDataRequest0);
        this.D.c(fdgq0);
        return batf.b(fdgq0, new fdhc());
    }
}

