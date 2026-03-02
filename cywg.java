import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class cywg implements Runnable {
    public final BluetoothDevice a;
    public final cyww b;
    public final boolean c;

    public cywg(BluetoothDevice bluetoothDevice0, cyww cyww0, boolean z) {
        this.a = bluetoothDevice0;
        this.b = cyww0;
        this.c = z;
    }

    @Override
    public final void run() {
        ibps ibps0;
        cust cust0 = cyjh.a;
        ggtj ggtj0 = cust0.d();
        BluetoothDevice bluetoothDevice0 = this.a;
        ggtj0.R("%s: onTempBondForLeAudioSharing for %s!", "TempBondManager", cywk.c(bluetoothDevice0));
        cyww cyww0 = this.b;
        cyck cyck0 = cyww0.i();
        if(cyck0 != null) {
            Integer integer0 = cyww.n(bluetoothDevice0, cyck0);
            if(integer0 != null) {
                HashMap hashMap0 = cyww0.l;
                int v = (int)integer0;
                cywo cywo0 = (cywo)hashMap0.get(integer0);
                if(cywo0 == null) {
                    LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                    Long long0 = cyww0.d.b();
                    cywo0 = new cywo(cyww0, linkedHashSet0, v, cywp.a, null, this.c, long0, 8);
                }
                LinkedHashSet linkedHashSet1 = cywo0.a;
                linkedHashSet1.add(bluetoothDevice0);
                bsaq bsaq0 = cyww0.j;
                if(bsaq0 == null) {
                    ibps0 = ibps.a;
                }
                else {
                    Set set0 = bsaq0.m();
                    if(set0 == null) {
                        ibps0 = ibps.a;
                    }
                    else {
                        ibps0 = new ArrayList();
                        for(Object object0: set0) {
                            ibuq.c(((BluetoothDevice)object0));
                            if(cyck0.a(((BluetoothDevice)object0)) == v) {
                                ibps0.add(object0);
                            }
                        }
                    }
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: ibps0) {
                    if(!ibuq.m(((BluetoothDevice)object1), bluetoothDevice0)) {
                        arrayList0.add(object1);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    linkedHashSet1.addAll(arrayList0);
                    cust0.d().X("%s: additionalMembers %s added for group ID %d", "TempBondManager", ibpo.aK(arrayList0, null, null, null, new cywj(), 0x1F), integer0);
                }
                Iterator iterator2 = linkedHashSet1.iterator();
                ibuq.e(iterator2, "iterator(...)");
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    ibuq.e(object2, "next(...)");
                    ibuq.f(((BluetoothDevice)object2), "device");
                    ibuq.f(((BluetoothDevice)object2), "<this>");
                    ibuq.f(cywp.a.b, "type");
                    cyan.b(((BluetoothDevice)object2), "TEMP_BOND_TYPE", cywp.a.b);
                }
                hashMap0.put(integer0, cywo0);
                cyww0.m();
                cyww0.l();
            }
        }
    }
}

