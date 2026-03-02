import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;
import java.util.HashMap;

public final class cywt implements Runnable {
    public final Intent a;
    public final cyww b;

    public cywt(Intent intent0, cyww cyww0) {
        this.a = intent0;
        this.b = cyww0;
    }

    @Override
    public final void run() {
        Bundle bundle0 = this.a.getExtras();
        Object object0 = null;
        BluetoothDevice bluetoothDevice0 = bundle0 == null ? null : ((BluetoothDevice)bundle0.getParcelable("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class));
        int v = this.a.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 0x80000000);
        if(bluetoothDevice0 != null && v != 0x80000000) {
            cyww cyww0 = this.b;
            if(v == 10) {
                HashMap hashMap0 = cyww0.l;
                Collection collection0 = hashMap0.values();
                ibuq.e(collection0, "<get-values>(...)");
                for(Object object1: collection0) {
                    if(((cywo)object1).a.contains(bluetoothDevice0)) {
                        object0 = object1;
                        break;
                    }
                }
                if(((cywo)object0) != null) {
                    cyjh.a.d().R("%s: device group %s is unpaired", "TempBondManager", ((cywo)object0));
                    cywo cywo0 = (cywo)hashMap0.get(Integer.valueOf(((cywo)object0).b));
                    if(cywo0 != null) {
                        cywo0.d(cywq.b);
                    }
                }
            }
            else if(v == 12 && ibuq.m(cyww0.e.b(), Boolean.valueOf(true)) && !cyww0.i) {
                Long long0 = cyww0.d.b();
                cyww0.m.put(bluetoothDevice0, long0);
            }
        }
    }
}

