import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class ffdx extends ffgn {
    public final fduq a;

    public ffdx(Intent intent0, fduq fduq0) {
        super("dataChanged", intent0);
        this.a = fduq0;
    }

    @Override  // ffgn
    public final String a() {
        return "DataWearableServiceEvent(" + this.a.b.b + ")";
    }

    @Override  // ffgn
    public final void b(fffu fffu0, fdjb fdjb0) {
        ArrayList arrayList0;
        DataHolder dataHolder1;
        Integer integer0 = (int)2;
        if(fffu0 != null) {
            ArrayDeque arrayDeque0 = fffu0.f;
            synchronized(arrayDeque0) {
                arrayList0 = new ArrayList();
                Iterator iterator0 = arrayDeque0.iterator();
                HashSet hashSet0 = new HashSet();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    ffgn ffgn0 = (ffgn)object0;
                    if((ffgn0 instanceof ffdx)) {
                        if(!hashSet0.add(((ffdx)ffgn0).a.b.c)) {
                            break;
                        }
                        arrayList0.add(((ffdx)ffgn0));
                        iterator0.remove();
                    }
                }
            }
            baks baks0 = new baks(ffec.a);
            int v2 = arrayList0.size();
            int v3 = 0;
            for(Object object1 = null; v3 < v2; object1 = fduq0) {
                ffdx ffdx0 = (ffdx)arrayList0.get(v3);
                fduq fduq0 = ffdx0.a;
                if(fduq0.c) {
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("event_type", integer0);
                    hashMap0.put("path", fduq0.b.c.toString());
                    if(Log.isLoggable("EventHolderBuilder", 3)) {
                        Log.d("EventHolderBuilder", "buildForDeletedDataItem: " + hashMap0.toString());
                    }
                    baks0.a(hashMap0);
                }
                else {
                    ffec.a(baks0, fduq0.b);
                }
                if(object1 != null && object1.equals(fduq0)) {
                    throw new IllegalStateException("it is illegal to have two consecutive instances of the same dataitem added to the DataHolder: " + object1.toString() + " and " + ffdx0.a);
                }
                ++v3;
            }
            DataHolder dataHolder0 = new DataHolder(baks0, 0);
            if(Log.isLoggable("EventHolderBuilder", 3)) {
                Log.d("EventHolderBuilder", "opened holder: " + dataHolder0.toString());
            }
            try {
                fdjb0.g(dataHolder0);
                fdny.a(fdnw.c);
                fffu0.d(this);
            }
            catch(RemoteException remoteException0) {
                int v5 = arrayList0.size();
                for(int v = 0; v < v5; ++v) {
                    fffu0.d(((ffgn)arrayList0.get(v5 - v - 1)));
                }
                throw remoteException0;
            }
            finally {
                ffme.a(dataHolder0, fdjb0);
            }
            return;
        }
        fduq fduq1 = this.a;
        if(fduq1.c) {
            fdun fdun0 = fduq1.b;
            baks baks1 = new baks(ffec.a);
            HashMap hashMap1 = new HashMap();
            hashMap1.put("event_type", integer0);
            hashMap1.put("path", fdun0.c.toString());
            if(Log.isLoggable("EventHolderBuilder", 3)) {
                Log.d("EventHolderBuilder", "buildForDeletedDataItem: " + hashMap1.toString());
            }
            baks1.a(hashMap1);
            dataHolder1 = new DataHolder(baks1, 0);
            if(Log.isLoggable("EventHolderBuilder", 3)) {
                Log.d("EventHolderBuilder", "opened holder: " + dataHolder1.toString());
            }
        }
        else {
            fdun fdun1 = fduq1.b;
            baks baks2 = new baks(ffec.a);
            ffec.a(baks2, fdun1);
            dataHolder1 = new DataHolder(baks2, 0);
            if(Log.isLoggable("EventHolderBuilder", 3)) {
                Log.d("EventHolderBuilder", "opened holder: " + dataHolder1.toString());
            }
        }
        try {
            fdjb0.g(dataHolder1);
            fdny.a(fdnw.c);
        }
        finally {
            ffme.a(dataHolder1, fdjb0);
        }
    }

    @Override  // ffgn
    public final boolean c() {
        return true;
    }
}

