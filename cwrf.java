import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

public final class cwrf implements cwrm {
    @Override  // cwrm
    public final void a(Context context0, BluetoothDevice bluetoothDevice0, int v, byte[] arr_b) {
        if(arr_b != null && arr_b.length >= 2 && arr_b[0] == 4 && arr_b[1] == 1) {
            cwfa.a.d().z("AcknowledgementEventGroupListener: Support rfcomm ring or not, event code = %d", v);
            ((cwrs)cusq.c(context0, cwrs.class)).i(bluetoothDevice0, 4, 1, v);
            return;
        }
        if(arr_b != null && arr_b.length >= 2 && arr_b[0] == 5 && arr_b[1] == 1) {
            cwfa.a.d().z("AcknowledgementEventGroupListener: Set buffer size success or not, event code = %d", v);
            cutr.d(context0, new Intent("com.google.location.nearby.common.fastpair.ACTION_UPDATE_BUFFER_ACK_RECEIVED").putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice0).putExtra("com.google.location.nearby.common.fastpair.EXTRA_DEVICE_ACK_EVENT_CODE", v));
        }
    }

    @Override  // cwrm
    public final void b() {
    }
}

