import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class ebam extends ebav {
    private final byte[] a;
    private final donp b;

    public ebam(byte[] arr_b, String s, donp donp0, azug azug0) {
        super("ManagedSecureElementOperation", s, azug0);
        this.a = arr_b;
        this.b = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        dpfb dpfb0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dpfb.a), this.a, 0, this.a.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            dpfb0 = (dpfb)hftv0;
        }
        catch(hfur hfur0) {
            throw new cjuh(8, null, null, hfur0);
        }
        byte[] arr_b = dpfw.a(context0, dpfb0).toBytesArray();
        this.b.b(Status.b, arr_b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.b(status0, null);
    }
}

