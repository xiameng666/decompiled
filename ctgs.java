import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;
import com.google.android.gms.multidevice.sync.access.QuickAccessApiService;
import java.io.Closeable;

public final class ctgs extends ibsl implements ibtw {
    Object a;
    int b;
    final cubq c;
    final QuickAccessApiService d;
    final QuickAccessDevice e;
    final String f;
    final ctve g;

    public ctgs(cubq cubq0, QuickAccessApiService quickAccessApiService0, QuickAccessDevice quickAccessDevice0, String s, ctve ctve0, ibrl ibrl0) {
        this.c = cubq0;
        this.d = quickAccessApiService0;
        this.e = quickAccessDevice0;
        this.f = s;
        this.g = ctve0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctgs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctgs(this.c, this.d, this.e, this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0 = new ParcelFileDescriptor.AutoCloseOutputStream(arr_parcelFileDescriptor[1]);
            cubq cubq0 = this.c;
            String s = this.f;
            ctve ctve0 = this.g;
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctyy.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                ibuq.f(s, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ctyy ctyy0 = (ctyy)hftp0.b_message;
                s.getClass();
                ctyy0.b |= 1;
                ctyy0.c = s;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((ctyy)hftv0), "request");
                byte[] arr_b = ((ctyy)hftv0).toBytesArray();
                cubp cubp0 = new cubp(cubq0.a.h("QuickAccessService", "OpenDocument", arr_b));
                icjm icjm0 = new icjm(new icjo(new ctgp(ctve0, arr_parcelFileDescriptor, null), cubp0), new ctgq(parcelFileDescriptor$AutoCloseOutputStream0, null));
                ctgr ctgr0 = new ctgr(parcelFileDescriptor$AutoCloseOutputStream0);
                this.a = parcelFileDescriptor$AutoCloseOutputStream0;
                this.b = 1;
                if(icjm0.oR(ctgr0, this) != object1) {
                    goto label_40;
                }
                return object1;
            }
            catch(Throwable throwable1) {
                throwable0 = throwable1;
                object2 = parcelFileDescriptor$AutoCloseOutputStream0;
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable2) {
                ibsx.a(((Closeable)object2), throwable0);
                throw throwable2;
            }
        label_40:
            object2 = parcelFileDescriptor$AutoCloseOutputStream0;
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
        }
        ibsx.a(((Closeable)object2), null);
        return ibom.a;
    }
}

