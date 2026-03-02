import com.google.android.gms.smartdevice.d2d.data.BlockstorePayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

public final class eqcc implements evpz {
    public final eqck a;

    public eqcc(eqck eqck0) {
        this.a = eqck0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.u(new BlockstorePayload());
        eqck eqck0 = this.a;
        if(evql0.n()) {
            byte[] arr_b = (byte[])evql0.j();
            if(arr_b != null && arr_b.length > 0) {
                eqck.h.d("Sending %d bytes blockstore data.", new Object[]{((int)arr_b.length)});
                eqck0.k.e(arr_b.length);
                messagePayload0.u(new BlockstorePayload(arr_b));
            }
        }
        else {
            Exception exception0 = evql0.i();
            eqck.h.l(exception0);
            if((exception0 instanceof aztb)) {
                eqck0.k.f(((aztb)exception0).b());
            }
        }
        eqck0.m(messagePayload0);
    }
}

