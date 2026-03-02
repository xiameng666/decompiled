import android.os.ParcelFileDescriptor.AutoCloseOutputStream;

final class ctgr implements icih {
    final ParcelFileDescriptor.AutoCloseOutputStream a;

    public ctgr(ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0) {
        this.a = parcelFileDescriptor$AutoCloseOutputStream0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        byte[] arr_b = ((ctyr)object0).c.toByteArray();
        this.a.write(arr_b);
        return ibom.a;
    }
}

