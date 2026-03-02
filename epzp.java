import com.google.android.gms.smartdevice.d2d.data.BlockstorePayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

public final class epzp implements evpz {
    public final epzx a;

    public epzp(epzx epzx0) {
        this.a = epzx0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.u(new BlockstorePayload());
        epzx epzx0 = this.a;
        if(evql0.n()) {
            byte[] arr_b = (byte[])evql0.j();
            if(arr_b != null && arr_b.length > 0) {
                epzx.f.d("Sending %d bytes blockstore data.", new Object[]{((int)arr_b.length)});
                epzx0.h.e(arr_b.length);
                messagePayload0.u(new BlockstorePayload(arr_b));
            }
        }
        else {
            Exception exception0 = evql0.i();
            epzx.f.l(exception0);
            if((exception0 instanceof aztb)) {
                epzx0.h.f(((aztb)exception0).b());
            }
        }
        epzx0.n(messagePayload0);
    }
}

