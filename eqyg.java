import com.google.android.gms.smartdevice.d2d.data.BlockstorePayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

public final class eqyg implements evpz {
    public final eqyw a;

    public eqyg(eqyw eqyw0) {
        this.a = eqyw0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.u(new BlockstorePayload());
        eqyw eqyw0 = this.a;
        if(evql0.n()) {
            byte[] arr_b = (byte[])evql0.j();
            if(arr_b != null && arr_b.length > 0) {
                eqyw.f.d("Sending %d bytes blockstore data.", new Object[]{((int)arr_b.length)});
                eqyw0.j.h(0, arr_b.length);
                messagePayload0.u(new BlockstorePayload(arr_b));
            }
        }
        else {
            Exception exception0 = evql0.i();
            if((exception0 instanceof aztb)) {
                eqyw0.j.h(((aztb)exception0).b(), 0);
            }
            eqyw.f.m("blockstoreTask exception: " + exception0, new Object[0]);
        }
        eqyw0.n(messagePayload0);
    }
}

