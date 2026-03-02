import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class aiif {
    public static final ailb a;
    final Map b;
    public final Object c;
    public boolean d;
    public static final baun e;
    private static aiif f;
    private long g;

    static {
        aiif.e = new baun(new String[]{"DroidGuardHelper"});
        aiif.a = ailb.b(AppContextProvider.a());
    }

    public aiif() {
        this.b = new HashMap();
        this.c = new Object();
        this.g = 0L;
    }

    public static aiif a() {
        synchronized(aiif.class) {
            if(aiif.f == null) {
                aiif.f = new aiif();
            }
        }
        return aiif.f;
    }

    public final void b(byte[] arr_b) {
        synchronized(this) {
            if(!TextUtils.isEmpty(hpqx.e())) {
                String s = bboy.c(arr_b);
                Map map0 = this.b;
                if(!map0.containsKey(s)) {
                    map0.put(s, arr_b);
                    Object object0 = this.c;
                    synchronized(object0) {
                        if(!this.d || SystemClock.elapsedRealtime() > this.g) {
                            this.d = true;
                            this.g = SystemClock.elapsedRealtime() + hpqx.a.c().e();
                        }
                        aild.h(arr_b, 25, AppContextProvider.a());
                        new bblp(1, 9).execute(new aiie(this));
                    }
                }
            }
        }
    }

    public final void c(bhnd bhnd0) {
        Map.Entry map$Entry1;
        aila aila1;
        ReentrantLock reentrantLock0;
        String s;
        aila aila0;
        ailb ailb0;
        Map.Entry map$Entry0;
        Iterator iterator0;
        synchronized(this) {
            iterator0 = this.b.entrySet().iterator();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    goto label_50;
                }
                Object object0 = iterator0.next();
                map$Entry0 = (Map.Entry)object0;
                Map map0 = Collections.singletonMap("tx_id", ((String)map$Entry0.getKey()));
                ailb0 = aiif.a;
                aila0 = ailb0.a(((byte[])map$Entry0.getValue()));
                if(aila0 != null) {
                    s = bhnd0.a(map0);
                    reentrantLock0 = ailb.b;
                    reentrantLock0.lock();
                    break;
                }
                iterator0.remove();
            }
        }
        try {
            try {
                ailb0.f();
                String s1 = ailb.c(aila0);
                String s2 = ailb.c.a(s1);
                if(s2 != null) {
                    aila1 = aila.a(s2);
                    if(aila1 == null) {
                        ailb.d.f("Transaction entry was found to be corrupted during cache.updateTransactionState : " + s1, new Object[0]);
                        ailb.c.c();
                        goto label_45;
                    }
                    else {
                        map$Entry1 = map$Entry0;
                        goto label_22;
                    }
                }
                goto label_32;
            }
            catch(IOException iOException0) {
                goto label_36;
            }
            try {
            label_22:
                aila aila2 = new aila(aila1.a, aila1.b, aila1.c, aila1.d, aila1.e, aila1.f, aila1.h, s);
                if(ailb.c.d(s1, aila2.toString(), s2)) {
                    ailb.d.h("Transaction entry droidguard response is updated.", new Object[0]);
                    ailb.c.c();
                    goto label_39;
                }
                else {
                    ailb0.e();
                    ailb.d.f("Tx cache storage failed internally in updateTransactionState", new Object[0]);
                    goto label_40;
                }
                goto label_32;
            }
            catch(IOException iOException0) {
            }
        }
        catch(Throwable throwable1) {
            ailb.b.unlock();
            throw throwable1;
        }
        goto label_37;
        try {
        label_32:
            ailb.d.m("Could not update transaction - not found", new Object[0]);
            ailb.c.c();
            goto label_45;
        }
        catch(IOException iOException0) {
        }
        catch(Throwable throwable1) {
            ailb.b.unlock();
            throw throwable1;
        }
    label_36:
        map$Entry1 = map$Entry0;
        try {
        label_37:
            ailb.d.g("Internal transaction cache error", iOException0, new Object[0]);
            ailb0.e();
        }
        catch(Throwable throwable1) {
            ailb.b.unlock();
            throw throwable1;
        }
    label_39:
        reentrantLock0 = ailb.b;
    label_40:
        reentrantLock0.unlock();
        aild.h(((byte[])map$Entry1.getValue()), 26, AppContextProvider.a());
        iterator0.remove();
        goto label_2;
    label_45:
        reentrantLock0.unlock();
        map$Entry1 = map$Entry0;
        aild.h(((byte[])map$Entry1.getValue()), 26, AppContextProvider.a());
        iterator0.remove();
        goto label_2;
    label_50:
        bhnd0.close();
        synchronized(this.c) {
            this.d = false;
            this.g = -1L;
            this.c.notifyAll();
        }
        aiif.e.h("DroidGuard snapshot is initialized.", new Object[0]);
    }
}

