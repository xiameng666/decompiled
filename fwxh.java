import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class fwxh implements gxbl, gxcz {
    public final gxcy a;
    public bblg b;
    bblf c;
    public fwxg d;
    public fwxg e;
    private static final AtomicBoolean f;
    private final ReadWriteLock g;
    private final fwzp h;
    private final fvwz i;
    private gxdb j;

    static {
        fwxh.f = new AtomicBoolean(true);
    }

    public fwxh(gxcy gxcy0, fwzp fwzp0, fvwz fvwz0) {
        this.g = new ReentrantReadWriteLock();
        this.a = gxcy0;
        this.h = fwzp0;
        this.i = fvwz0;
    }

    @Override  // gxcz
    public final void a(gxcy gxcy0, gxdb gxdb0, gxdm gxdm0) {
        this.g.readLock().lock();
        try {
            if(gxdb0 != null && gxdb0.d() == 0x476F6F676C00100BL) {
                fwxg fwxg0 = this.e;
                if(fwxg0 != null && gxaw.a(gxdm0.a) == 0x72) {
                    ((fwxa)fwxg0).a.lock();
                    try {
                        if(((fwxa)fwxg0).c == null) {
                            hfuh hfuh0 = new hfuh(((gwwy)gxdm0.a(((Parser)((ProtoLiteMessage)gwwy.b).jf(7, null)))).d, gwwy.a);
                            int[] arr_v = ((fwxa)fwxg0).e();
                            boolean z = false;
                            for(int v2 = 0; true; ++v2) {
                                if(v2 >= arr_v.length) {
                                    z = true;
                                    break;
                                }
                                if(!hfuh0.contains(fwxc.a(arr_v[v2]))) {
                                    break;
                                }
                            }
                            ((fwxa)fwxg0).c = Boolean.valueOf(z);
                            ((fwxa)fwxg0).d = hfuh0;
                            ((fwxa)fwxg0).b.signalAll();
                        }
                    }
                    finally {
                        ((fwxa)fwxg0).a.unlock();
                    }
                }
                if(this.d != null) {
                    fwxd fwxd0 = new fwxd(this, gxdm0);
                    this.h.m(fwxd0);
                }
            }
        }
        finally {
            this.g.readLock().unlock();
        }
    }

    public final int b() {
        int v;
        ReadWriteLock readWriteLock0 = this.g;
        readWriteLock0.readLock().lock();
        gxdb gxdb0 = this.j;
        if(gxdb0 != null) {
            try {
                v = gxdb0.c();
            }
            catch(Throwable throwable0) {
                this.g.readLock().unlock();
                throw throwable0;
            }
            this.g.readLock().unlock();
            return v;
        }
        readWriteLock0.readLock().unlock();
        return -1;
    }

    public final boolean c(gwww gwww0) {
        Lock lock0;
        ReadWriteLock readWriteLock0 = this.g;
        readWriteLock0.readLock().lock();
        gxdb gxdb0 = this.j;
        boolean z = false;
        if(gxdb0 == null) {
            lock0 = readWriteLock0.readLock();
        }
        else {
            try {
                gxdd gxdd0 = gxdb0.e(0x70, 1, ((MessageLite)gwww0), gxcx.b);
                if(gxdd0 == null) {
                    this.i.g(0x70);
                }
                else {
                    try {
                        if(((int)(((Integer)gxdd0.get(1L, TimeUnit.SECONDS)))) == 0) {
                            z = true;
                            goto label_15;
                        }
                    }
                    catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
                    }
                    this.i.g(0x70);
                    lock0 = this.g.readLock();
                    lock0.unlock();
                    return z;
                }
            }
            catch(Throwable throwable0) {
                this.g.readLock().unlock();
                throw throwable0;
            }
        label_15:
            lock0 = this.g.readLock();
        }
        lock0.unlock();
        return z;
    }

    @Override  // gxbl
    public final void j() {
        gxdb gxdb0;
        ReadWriteLock readWriteLock0 = this.g;
        readWriteLock0.writeLock().lock();
        try {
            gxcy gxcy0 = this.a;
            gxdb0 = gxcy0.b(0x476F6F676C00100BL);
            if(gxdb0 != null) {
                this.j = gxdb0;
                if(!gxcy0.h(gxdb0)) {
                    if(fwxh.f.compareAndSet(true, false)) {
                        try {
                            this.c(fwwz.a(gwwv.a));
                            fwso.f(this.i, gwwv.a.g);
                        }
                        catch(SecurityException unused_ex) {
                        }
                    }
                    this.j = null;
                    goto label_11;
                }
                goto label_13;
            }
            goto label_27;
        }
        catch(Throwable throwable0) {
            this.g.writeLock().unlock();
            throw throwable0;
        }
    label_11:
        this.g.writeLock().unlock();
        return;
        try {
        label_13:
            gxdb0.h(this, this.c);
        }
        catch(Throwable throwable0) {
            this.g.writeLock().unlock();
            throw throwable0;
        }
        this.g.writeLock().unlock();
        fwxg fwxg0 = this.e;
        if(fwxg0 != null) {
            ((fwxa)fwxg0).b();
            ((fwxa)fwxg0).d();
        }
        if(this.d != null) {
            fwxe fwxe0 = new fwxe(this);
            this.h.m(fwxe0);
        }
        return;
    label_27:
        readWriteLock0.writeLock().unlock();
    }

    @Override  // gxbl
    public final void k(int v) {
        this.g.writeLock().lock();
        try {
            gxdb gxdb0 = this.j;
            if(gxdb0 != null) {
                gxdb0.i(this);
                this.j = null;
            }
        }
        finally {
            this.g.writeLock().unlock();
        }
        fwxg fwxg0 = this.e;
        if(fwxg0 != null && v == 2) {
            ((fwxa)fwxg0).b();
        }
        if(this.d != null) {
            fwxf fwxf0 = new fwxf(this, v);
            this.h.m(fwxf0);
        }
    }

    @Override  // gxbl
    public final void r() {
    }
}

