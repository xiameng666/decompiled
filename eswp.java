import android.nfc.cardemulation.PollingFrame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class eswp implements Runnable {
    public final eswy a;
    public final List b;

    public eswp(eswy eswy0, List list0) {
        this.a = eswy0;
        this.b = list0;
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object0: this.b) {
            PollingFrame pollingFrame0 = (PollingFrame)object0;
            int v = pollingFrame0.getType();
            byte[] arr_b = pollingFrame0.getData();
            ibuq.e(arr_b, "getData(...)");
            arrayList0.add(new esww(v, arr_b, pollingFrame0.getVendorSpecificGain(), pollingFrame0.getTimestamp(), pollingFrame0.getTriggeredAutoTransact()));
        }
        eswy eswy0 = this.a;
        esxe esxe0 = eswy0.j;
        eswv eswv0 = (eswv)esxe0.c;
        if(!eswv0.g) {
            ((ggtj)eswy.b.j()).B("Ignoring frames in %s state", eswv0.name());
            return;
        }
        for(Object object1: arrayList0) {
            esww esww0 = (esww)object1;
            if(!((eswv)esxe0.c).g) {
                ((ggtj)eswy.b.j()).x("A polling loop decision was made, discarding frames");
                return;
            }
            eswy0.c(eswu.a);
            int v1 = esww0.a;
            if(v1 != 65 && v1 != 66) {
                switch(v1) {
                    case 70: {
                        break;
                    }
                    case 85: {
                        eswy0.g.add(esww0);
                        eswy0.c(eswu.c);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            ArrayList arrayList1 = eswy0.g;
            if(!arrayList1.isEmpty()) {
                Object object2 = arrayList1.get(0);
                ibuq.e(object2, "get(...)");
                esww esww1 = (esww)object2;
                if(esww1.a == v1 && (v1 != 85 || Arrays.equals(esww1.b, esww0.b))) {
                    if(eswy0.f == -1L) {
                        eswy0.f = esww0.d - ((esww)arrayList1.get(arrayList1.size() - 1)).d;
                    }
                    eswy0.c(eswu.c);
                }
            }
            if(((eswv)esxe0.c).g) {
                arrayList1.add(esww0);
            }
        }
        long v2 = hysx.a.f().f();
        if(((long)eswy0.g.size()) > v2) {
            eswy0.c(eswu.c);
        }
    }
}

