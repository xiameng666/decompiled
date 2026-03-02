import android.os.ParcelFileDescriptor.AutoCloseOutputStream;

final class ctgq extends ibsl implements ibtx {
    final ParcelFileDescriptor.AutoCloseOutputStream a;

    public ctgq(ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0, ibrl ibrl0) {
        this.a = parcelFileDescriptor$AutoCloseOutputStream0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new ctgq(this.a, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.flush();
        return ibom.a;
    }
}

