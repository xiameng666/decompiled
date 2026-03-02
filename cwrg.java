import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

public final class cwrg implements cwrm {
    @Override  // cwrm
    public final void a(Context context0, BluetoothDevice bluetoothDevice0, int v, byte[] arr_b) {
        if(v == 1) {
            if(arr_b != null) {
                cust cust0 = cwfa.a;
                cust0.d().R("DeviceActionEvent: Received ring action change, %s, additionalData=%s", gxyf.b(gxye.a, bluetoothDevice0), ghjc.f.o(arr_b));
                cutr.d(context0, new Intent("com.google.location.nearby.common.fastpair.EVENT_STREAM_DEVICE_ACTION_RECEIVED").putExtra("com.google.location.nearby.common.fastpair.EXTRA_DEVICE_ACTION_ADDITIONAL_DATA", arr_b));
                fgmf fgmf0 = (fgmf)((cwrs)cusq.c(context0, cwrs.class)).b.get(bluetoothDevice0);
                if(fgmf0 != null && fgmf0.p()) {
                    fgmf0.h(0xFF, 1, new byte[]{4, 1});
                    return;
                }
                cust0.d().x("EventStreamManager: sendAck: Medium is null or not connected.");
                return;
            }
            v = 1;
        }
        cwfa.a.d().H("DeviceActionEvent: Ignoring action %s with data %s.", v, (arr_b == null ? null : ghjc.f.o(arr_b)));
    }

    @Override  // cwrm
    public final void b() {
    }
}

