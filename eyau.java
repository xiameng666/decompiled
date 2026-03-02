import android.bluetooth.BluetoothDevice;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class eyau implements exdz {
    final eyaz a;

    public eyau(eyaz eyaz0) {
        this.a = eyaz0;
        super();
    }

    @Override  // exdz
    public final void a(int v) {
        if(v != 10) {
            return;
        }
        eyaz eyaz0 = this.a;
        ((ggtj)eyaz0.d.h()).x("Adapter off, coarse proximity changed");
        Map map0 = eyaz0.a();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(map0.size()));
        for(Object object0: map0.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), Boolean.valueOf(false));
        }
        eyaz0.b(linkedHashMap0);
    }

    @Override  // exdz
    public final void b(BluetoothDevice bluetoothDevice0) {
        if(bbqa.c()) {
            eyaz eyaz0 = this.a;
            String s = bluetoothDevice0.getAddress();
            ibuq.e(s, "getAddress(...)");
            eyat.a(s);
            eyat eyat0 = new eyat(s);
            if(eyaz0.a().containsKey(eyat0)) {
                boolean z = bluetoothDevice0.isConnected();
                eyaz0.b(ibpz.o(eyaz0.a(), new ibns(new eyat(s), Boolean.valueOf(z))));
                ((ggtj)eyaz0.d.h()).S("Enrolled device %s is now connected?: %b", bluetoothDevice0.getAlias(), z);
            }
        }
    }
}

