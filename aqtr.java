import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j..util.Objects;

public final class aqtr implements aqty {
    public aqtw a;
    public final fpth b;
    public static final int c;
    private static final baun d;
    private static final Intent e;
    private final Context f;
    private final aqvf g;
    private final gful_cronetEngineProvider h;
    private final gful_cronetEngineProvider i;
    private azox j;

    static {
        aqtr.d = aqql.a("PhotosAidlStatusCallbackApiClient");
        aqtr.e = new Intent().setPackage("com.google.android.apps.photos").setAction("com.google.android.apps.photos.backup.apiservice.PHOTOS_BACKUP_SERVICE");
    }

    public aqtr(Context context0) {
        aqvf aqvf0 = aqvf.b(context0, 2);
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new aqtn(context0)));
        super();
        this.i = gfus.a(((gful_cronetEngineProvider)new aqto()));
        this.j = null;
        this.b = new aqtp(this);
        this.f = context0;
        this.g = aqvf0;
        this.h = gful0;
    }

    @Override  // aqty
    public final void a(aqtw aqtw0, aqtv aqtv0, aqvd aqvd0) {
        this.a = aqtw0;
        this.j = new azox();
        if(!Objects.equals(this.d(new aqtm(this), 8, aqvd0, this.j), Boolean.TRUE)) {
            this.c(this.j);
            this.j = null;
            if(((Boolean)this.i.mr()).booleanValue()) {
                aqvj aqvj0 = ((aqvh)this.h.mr()).a(aqvd0).a;
                aqvj aqvj1 = aqvj.b;
                if(aqvj0 == aqvj1) {
                    aqvk aqvk0 = new aqvk(aqvj1, null, new aqvi());
                    aqtw0.a(new aqtx(false, 0, -1L, fpue.a, aqvk0));
                    return;
                }
            }
            aqtv0.a();
        }
    }

    @Override  // aqty
    public final void b(aqvd aqvd0) {
        azox azox0 = new azox();
        this.d(new aqtl(this), 9, aqvd0, azox0);
        this.c(azox0);
        azox azox1 = this.j;
        if(azox1 != null) {
            this.c(azox1);
            this.j = null;
        }
        this.a = null;
    }

    private final void c(azox azox0) {
        try {
            bbic.a().b(this.f, azox0);
        }
        catch(IllegalArgumentException | IllegalStateException exception0) {
            aqtr.d.n("Exception when unbinding: ", exception0, new Object[0]);
        }
    }

    private final Object d(aqtq aqtq0, int v, aqvd aqvd0, azox azox0) {
        fptf fptf0;
        aqvf aqvf0 = this.g;
        Long long0 = aqvf0.a();
        bbic bbic0 = bbic.a();
        Context context0 = this.f;
        if(!bbic0.d(context0, aqtr.e, azox0, (Build.VERSION.SDK_INT < 34 ? 1 : 0x201))) {
            aqvf0.e(v, aqvd0, aqvf.c(context0), long0);
            return null;
        }
        try {
            IBinder iBinder0 = azox0.a();
            if(iBinder0 == null) {
                fptf0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.libraries.photos.backup.api.IPhotosBackup");
                fptf0 = (iInterface0 instanceof fptf) ? ((fptf)iInterface0) : new fptf(iBinder0);
            }
            Object object0 = aqtq0.a(fptf0);
            aqvf0.g(v, aqvd0, object0, long0);
            return object0;
        }
        catch(InterruptedException | RemoteException exception0) {
            aqtr.d.l(exception0);
            this.g.f(v, aqvd0, aqvf.d(false, exception0), long0);
            return null;
        }
    }
}

