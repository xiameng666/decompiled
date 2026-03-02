import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

final class eqtd extends cjtm {
    public final DirectTransferOptions a;
    public final ParcelFileDescriptor[] b;
    public final epyl c;
    public final eqff d;
    public final eqtg e;
    private final Handler f;

    public eqtd(eqtg eqtg0, eqff eqff0, DirectTransferOptions directTransferOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyl epyl0, Handler handler0, azug azug0) {
        super(0xD3, "StartDirectTransferOperation", azug0);
        this.a = directTransferOptions0;
        this.b = arr_parcelFileDescriptor;
        this.c = epyl0;
        this.d = eqff0;
        this.e = eqtg0;
        this.f = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqtc eqtc0 = new eqtc(this);
        this.f.post(eqtc0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e.a(status0);
    }
}

