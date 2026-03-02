import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Bundle;

public final class cyqv extends cyqw {
    private final Context a;
    private final cyqw b;
    private final bbqb c;
    private String d;

    public cyqv(Context context0, cyrq cyrq0, cyqw cyqw0, bbqb bbqb0) {
        super(context0, cyrq0);
        this.d = null;
        this.a = context0;
        this.b = cyqw0;
        this.c = bbqb0;
    }

    @Override  // cyqw
    public final void a(BluetoothDevice bluetoothDevice0) {
        Bundle bundle0 = new Bundle();
        this.b.a(bluetoothDevice0);
        if(hvpp.a.f().cN()) {
            Context context0 = this.a;
            if(cyxu.a(context0)) {
                if(bluetoothDevice0 != null) {
                    if(!bluetoothDevice0.getAddress().equals(this.d) && this.c.a(bluetoothDevice0)) {
                        this.d = bluetoothDevice0.getAddress();
                        bundle0.putString("com.google.android.gms.nearby.fastpair.service.EXTRA_FAST_PAIR_DEVICE_ADDRESS", bluetoothDevice0.getAddress());
                        ((ggtj)cyjh.a.f().ar(8054)).B("BroadcastVolumeControlWrapper: SetSwitchCandidate address = %s.", fgjo.c(bluetoothDevice0));
                        cysr.c(context0, "com.google.android.gms.nearby.fastpair.service.ACTION_UPDATE_SASS_CANDIDATE", bundle0);
                    }
                }
                else if(this.d == null || !this.d.isEmpty()) {
                    this.d = "";
                    ((ggtj)cyjh.a.f().ar(8053)).x("TriangleAudioManagerMuteApiWrapper: SetSwitchCandidate address null.");
                    cysr.c(context0, "com.google.android.gms.nearby.fastpair.service.ACTION_UPDATE_SASS_CANDIDATE", bundle0);
                }
            }
        }
    }

    @Override  // cyqw
    public final boolean b() {
        return this.b.b();
    }

    @Override  // cyqw
    public final void close() {
        this.b.close();
    }
}

