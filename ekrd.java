import android.util.SparseArray;
import j..time.Duration;
import j..util.DesugarCollections;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ekrd implements bbnw {
    @Override  // bbnw
    public final void a(PrintWriter printWriter0, String[] arr_s) {
        ArrayList arrayList1;
        ekqw ekqw0 = ekrs.b().d;
        if(ekqw0 != null) {
            printWriter0.println("NTS task filter is " + hrwh.c());
            printWriter0.println();
            printWriter0.println("Previous initialization errors:");
            ekvm ekvm0 = ekqw0.d;
            for(Object object0: ekvm0.u) {
                ((Throwable)object0).printStackTrace(printWriter0);
                printWriter0.println();
            }
            printWriter0.println("Global GmsTaskScheduler stats:");
            List list0 = ekvm0.a;
            synchronized(list0) {
                ekvm0.m.c(printWriter0);
                printWriter0.println("\nActive tasks:");
                __monitor_enter(list0);
            }
            try {
                boolean z = false;
                for(int v = 0; true; ++v) {
                    SparseArray sparseArray0 = ekvm0.c;
                    if(v >= sparseArray0.size()) {
                        break;
                    }
                    for(Object object1: ((Map)sparseArray0.valueAt(v)).values()) {
                        ((eksl)object1).k(printWriter0);
                        z = true;
                    }
                }
                if(!z) {
                    printWriter0.println("   none.");
                }
            }
            catch(Throwable throwable1) {
                try {
                    __monitor_exit(list0);
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                    __monitor_exit(list0);
                    throw throwable0;
                }
            }
            __monitor_exit(list0);
            try {
                printWriter0.println();
                ekvm0.l.b(printWriter0);
            }
            catch(Throwable throwable0) {
                __monitor_exit(list0);
                throw throwable0;
            }
            __monitor_exit(list0);
            if(hrwd.i()) {
                printWriter0.println("Device State History");
                clmd clmd0 = ekvm0.y.g.b.a();
                Long long0 = (clmd0.b & 1) == 0 ? "Not initialized" : ((long)clmd0.d);
                printWriter0.println(a.b(long0, "Initialize time: ", "\n"));
                long v1 = System.currentTimeMillis();
                for(Object object2: DesugarCollections.unmodifiableMap(clmd0.c).values()) {
                    long v2 = Duration.ofMillis(v1 - ((clmb)object2).d).toSeconds();
                    int v3 = ((clmb)object2).c;
                    ArrayList arrayList0 = new ArrayList();
                    if(ekwi.c(v3, 4)) {
                        arrayList0.add("CHARGING");
                    }
                    if(ekwi.c(v3, 2)) {
                        arrayList0.add("UNMETERED");
                    }
                    else if(ekwi.c(v3, 1)) {
                        arrayList0.add("ANY");
                    }
                    if(ekwi.c(v3, 0x40)) {
                        arrayList0.add("IDLE");
                    }
                    if((v3 | 71) != 71) {
                        arrayList0.add("UNKNOWN");
                    }
                    StringBuilder stringBuilder0 = new StringBuilder();
                    Iterator iterator3 = arrayList0.iterator();
                    if(iterator3.hasNext()) {
                        while(true) {
                            Object object3 = iterator3.next();
                            stringBuilder0.append(((CharSequence)object3));
                            if(!iterator3.hasNext()) {
                                break;
                            }
                            stringBuilder0.append("/");
                        }
                    }
                    printWriter0.println(stringBuilder0.toString() + " (" + ((clmb)object2).c + "): " + v2 + " seconds ago");
                }
            }
            ekvm0.z.a(printWriter0);
            printWriter0.println("Device state: " + ekvm0.r.b(ekvm0.f, ekvm0.x));
            synchronized(ekvm0.a) {
                if(hrvh.a.i().an()) {
                    synchronized(ekvm0.y) {
                        arrayList1 = new ArrayList(ekvm0.y.e.b());
                    }
                    arrayList1.addAll(ekvm0.a);
                    List list2 = DesugarCollections.unmodifiableList(arrayList1);
                    ekvm0.e.d(printWriter0, arr_s, list2, ekvm0.p);
                }
                else {
                    ekvm0.e.d(printWriter0, arr_s, ekvm0.a, ekvm0.p);
                }
            }
            return;
        }
        printWriter0.println("GmsTaskScheduler unavailable.");
    }
}

