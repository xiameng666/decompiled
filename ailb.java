import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class ailb {
    static final gged_interceptors a;
    public static final ReentrantLock b;
    public static ajci c;
    public static final baun d;
    private static final ailb e;

    static {
        ailb.e = new ailb();
        ailb.d = new baun(new String[]{"TransactionCache"});
        ailb.a = gged_interceptors.l("auth.authzen.store.transactions");
        ailb.b = new ReentrantLock();
    }

    public final aila a(byte[] arr_b) {
        aila aila0;
        ReentrantLock reentrantLock0 = ailb.b;
        reentrantLock0.lock();
        try {
            this.f();
            ailb.c.c();
            Iterator iterator0 = ailb.c.b().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_21;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                String s1 = ailb.c.a(s);
                if(s1 == null) {
                    ailb.d.f("Found transaction set to null in cache.getByTxId: " + s, new Object[0]);
                }
                else {
                    aila0 = aila.a(s1);
                    if(aila0 == null) {
                        ailb.d.f("Found corrupted transaction in cache.getByTxId: " + s, new Object[0]);
                    }
                    else if(Arrays.equals(arr_b, aila0.a.c.toByteArray())) {
                        ailb.d.h("Found transaction in cache: " + s, new Object[0]);
                        break;
                    }
                }
                continue;
            }
        }
        catch(IOException iOException0) {
            goto label_24;
        }
        catch(Throwable throwable0) {
            ailb.b.unlock();
            throw throwable0;
        }
        reentrantLock0.unlock();
        return aila0;
        try {
            try {
            label_21:
                ailb.d.h("Requested transaction not found in cache", new Object[0]);
            }
            catch(IOException iOException0) {
            label_24:
                ailb.d.g("Internal transaction cache error", iOException0, new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            ailb.b.unlock();
            throw throwable0;
        }
        ailb.b.unlock();
        return null;
    }

    public static ailb b(Context context0) {
        try {
            ReentrantLock reentrantLock0 = ailb.b;
            reentrantLock0.lock();
            try {
                try {
                    if(ailb.c == null) {
                        File file0 = context0.getFilesDir();
                        ailb.c = new ajci((hrnt.i() ? new File(ccsb.a.b(file0, "auth.authzen.store.transactions_v2")) : new File(file0, "auth.authzen.store.transactions_v2")));
                        gged_interceptors gged0 = ailb.a;
                        int v = ((ggna)gged0).c;
                        for(int v1 = 0; v1 < v; ++v1) {
                            String s = (String)gged0.get(v1);
                            File file1 = context0.getFilesDir();
                            File file2 = hrnt.i() ? new File(ccsb.a.b(file1, s)) : new File(file1, s);
                            if(file2.isFile()) {
                                if(file2.delete()) {
                                    ailb.d.h("Clearing deprecated transaction cache: " + s, new Object[0]);
                                }
                                else {
                                    ailb.d.m("Failed to clear deprecated transaction cache: " + s, new Object[0]);
                                }
                            }
                        }
                    }
                }
                catch(NullPointerException | IOException exception0) {
                    ailb.c = null;
                    throw exception0;
                }
            }
            catch(Throwable throwable0) {
                ailb.b.unlock();
                throw throwable0;
            }
            reentrantLock0.unlock();
        }
        catch(IOException iOException0) {
            ailb.d.f("Could not initialize TransactionCache " + iOException0.toString(), new Object[0]);
        }
        return ailb.e;
    }

    public static String c(aila aila0) {
        return ailb.d(aila0.a);
    }

    public static String d(hhqx hhqx0) {
        if(hhqx0 == null) {
            ailb.d.f("makeTransactionCacheEntryKey called on null request", new Object[0]);
            return null;
        }
        hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
        if((hhqx0.b & 4) != 0 && (hhqw0.c & 0x400) != 0) {
            return (hhqw0.g == null ? hhpt.a : hhqw0.g).b + "/" + (hhqw0.g == null ? hhpt.a : hhqw0.g).c;
        }
        ailb.d.h("request doesn\'t have enough information to make cache entry key", new Object[0]);
        return null;
    }

    public final void e() {
        ailb.b.lock();
        try {
            ailb.d.h("Clearing transaction cache", new Object[0]);
            ajci ajci0 = ailb.c;
            Lock lock0 = ajci0.a.writeLock();
            lock0.lock();
            try {
                ajci0.b.clear();
                ajci0.c = true;
            }
            finally {
                lock0.unlock();
            }
            ailb.c.c();
        }
        catch(IOException iOException0) {
            ailb.d.g("Error while clearing cache", iOException0, new Object[0]);
        }
        finally {
            ailb.b.unlock();
        }
    }

    public final void f() {
        long v = SystemClock.elapsedRealtime();
        for(Object object0: ailb.c.b()) {
            String s = (String)object0;
            String s1 = ailb.c.a(s);
            if(s1 == null) {
                ailb.d.f("Database had null entry for transaction: " + s, new Object[0]);
                ailb.c.d(s, null, null);
            }
            else {
                aila aila0 = aila.a(s1);
                if(aila0 == null) {
                    ailb.d.f("Transaction entry was found to be corrupted during groom read: " + s, new Object[0]);
                    ailb.c.d(s, null, s1);
                }
                else {
                    if(aila0.d > v) {
                        continue;
                    }
                    ailb.c.d(s, null, s1);
                    ailb.d.h("  Removed an entry during groom: " + s, new Object[0]);
                }
            }
        }
    }
}

