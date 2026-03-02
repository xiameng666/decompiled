import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;

final class ctgp extends ibsl implements ibtw {
    final ParcelFileDescriptor[] a;
    final ctve b;

    public ctgp(ctve ctve0, ParcelFileDescriptor[] arr_parcelFileDescriptor, ibrl ibrl0) {
        this.b = ctve0;
        this.a = arr_parcelFileDescriptor;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctgp)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctgp(this.b, this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ParcelFileDescriptor parcelFileDescriptor0 = this.a[0];
        ApiMetadata apiMetadata0 = cckf.d(bbdp.dr);
        this.b.a(parcelFileDescriptor0, apiMetadata0);
        return ibom.a;
    }
}

