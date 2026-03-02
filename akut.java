import com.google.android.gms.auth.proximity.RemoteDevice;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class akut implements Runnable {
    final List a;
    final akvf b;

    public akut(akvf akvf0, List list0) {
        this.a = list0;
        Objects.requireNonNull(akvf0);
        this.b = akvf0;
        super();
    }

    @Override
    public final void run() {
        akul akul0;
        akvf akvf0 = this.b;
        if(akvf0.o == null) {
            akvf0.o = new akvd(akvf0, akvf0.m);
        }
        if(this.a.isEmpty()) {
            synchronized(akvf0.k.e) {
                akvf0.k.h = true;
                akvf0.k.f.clear();
            }
        }
        akvf akvf1 = this.b;
        List list0 = this.a;
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(true) {
            akul0 = akvf1.c;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            RemoteDevice remoteDevice0 = (RemoteDevice)object0;
            if(!akul0.b.contains(remoteDevice0)) {
                arrayList0.add(remoteDevice0);
            }
        }
        if(!arrayList0.isEmpty()) {
            StringBuilder stringBuilder0 = new StringBuilder("Adding Device IDs: [");
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                RemoteDevice remoteDevice1 = (RemoteDevice)arrayList0.get(v2);
                akul0.b.add(remoteDevice1);
                stringBuilder0.append(remoteDevice1.b());
                stringBuilder0.append(',');
            }
            stringBuilder0.replace(stringBuilder0.length() - 1, stringBuilder0.length(), "]");
            akul.a.d(stringBuilder0.toString(), new Object[0]);
        }
        ArrayList arrayList1 = new ArrayList();
        List list1 = akul0.b;
        for(Object object1: list1) {
            RemoteDevice remoteDevice2 = (RemoteDevice)object1;
            if(!list0.contains(remoteDevice2)) {
                arrayList1.add(remoteDevice2);
            }
        }
        if(!arrayList1.isEmpty()) {
            StringBuilder stringBuilder1 = new StringBuilder("Removing Device IDs: [");
            int v3 = arrayList1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                RemoteDevice remoteDevice3 = (RemoteDevice)arrayList1.get(v4);
                list1.remove(remoteDevice3);
                stringBuilder1.append(remoteDevice3.b());
                stringBuilder1.append(',');
            }
            stringBuilder1.replace(stringBuilder1.length() - 1, stringBuilder1.length(), "]");
            akul.a.d(stringBuilder1.toString(), new Object[0]);
        }
        if(arrayList0.isEmpty() && arrayList1.isEmpty()) {
            return;
        }
        akvf1.e();
    }
}

