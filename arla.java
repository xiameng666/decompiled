import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Future;

public final class arla extends arlf {
    public static final aqql a;
    public final Context b;
    public final epzz c;
    private boolean n;

    static {
        arla.a = new aqql(new String[]{"ConnectionlessSmartDeviceSourceController"});
    }

    public arla(Context context0, arim arim0, gmcg gmcg0, epzz epzz0) {
        super(arim0, gmcg0);
        this.n = false;
        this.b = context0;
        this.c = epzz0;
        arla.a.h("Using connectionless SourceDeviceClient", new Object[0]);
    }

    @Override  // arlf
    public final void a() {
        if(!this.n) {
            this.m.a = true;
            this.c.j("source-direct-transfer");
            azzc azzc0 = new azzc();
            azzc0.d = 0x50F0;
            azzc0.a = new eqjv();
            azzd azzd0 = azzc0.a();
            this.c.jn(azzd0);
            arla.a.h("Aborted Smart Device direct transfer", new Object[0]);
            this.c();
            this.n = true;
            return;
        }
        arla.a.h("Duplicate transfer abort request.", new Object[0]);
    }

    @Override  // arlf
    public final void b() {
        azzc azzc0 = new azzc();
        azzc0.a = new eqke();
        azzc0.d = 0x50ED;
        azzd azzd0 = azzc0.a();
        evql evql0 = this.c.iG(azzd0);
        evql0.A(new arkv(this));
        evql0.b(new arkw(this));
    }

    @Override  // arlf
    protected final void c() {
        this.c.g();
        ParcelFileDescriptor[] arr_parcelFileDescriptor = this.h;
        if(arr_parcelFileDescriptor != null) {
            bbpb.a(arr_parcelFileDescriptor[0]);
            bbpb.a(this.h[1]);
            this.h = null;
        }
        ParcelFileDescriptor[] arr_parcelFileDescriptor1 = this.g;
        if(arr_parcelFileDescriptor1 != null) {
            bbpb.a(arr_parcelFileDescriptor1[0]);
            bbpb.a(this.g[1]);
            this.g = null;
        }
        Future future0 = this.j;
        if(future0 != null) {
            future0.cancel(true);
            this.j = null;
        }
        this.e = null;
        this.f = null;
        this.i = new ByteArrayOutputStream();
    }
}

