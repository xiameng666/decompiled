package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import aztw;
import aztz;
import azua;
import azue;
import azuj;
import azuk;
import azun;
import azvi;
import azvl;
import azvm;
import azvn;
import azvo;
import azzg;
import basb;
import batl;
import clhn;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult extends azua {
    private final CountDownLatch a;
    private final ArrayList b;
    private azuk c;
    private final AtomicReference d;
    static final ThreadLocal e;
    public final Object f;
    protected final azvn g;
    public final WeakReference h;
    public azuj i;
    public basb j;
    public boolean k;
    public static final int l;
    private Status m;
    private volatile boolean n;
    private boolean o;
    private boolean p;
    private volatile azun q;
    private azvo resultGuardian;

    static {
        BasePendingResult.e = new azvm();
    }

    @Deprecated
    BasePendingResult() {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.k = false;
        this.g = new azvn(Looper.getMainLooper());
        this.h = new WeakReference(null);
    }

    @Deprecated
    protected BasePendingResult(Looper looper0) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.k = false;
        this.g = new azvn(looper0);
        this.h = new WeakReference(null);
    }

    protected BasePendingResult(aztw aztw0) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.k = false;
        this.g = new azvn((aztw0 == null ? Looper.getMainLooper() : aztw0.a()));
        this.h = new WeakReference(aztw0);
    }

    @Override  // azua
    public final void c(aztz aztz0) {
        synchronized(this.f) {
            if(this.p()) {
                aztz0.a(this.m);
            }
            else {
                azvl azvl0 = new azvl(clhn.b.a(), aztz0);
                this.b.add(azvl0);
            }
        }
    }

    @Override  // azua
    public final void d() {
        synchronized(this.f) {
            if(!this.o && !this.n) {
                basb basb0 = this.j;
                if(basb0 != null) {
                    try {
                        basb0.a();
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                BasePendingResult.m(this.i);
                this.o = true;
                this.i(this.g(Status.f));
            }
        }
    }

    @Override  // azua
    public final void e(azuk azuk0) {
        synchronized(this.f) {
            if(azuk0 == null) {
                this.c = null;
                return;
            }
            batl.m(((boolean)(this.n ^ 1)), "Result has already been consumed.");
            if(this.o()) {
                return;
            }
            if(this.p()) {
                azuj azuj0 = this.h();
                this.g.b(azuk0, azuj0);
            }
            else {
                this.c = BasePendingResult.j(azuk0);
            }
        }
    }

    @Override  // azua
    public final void f(azuk azuk0, long v, TimeUnit timeUnit0) {
        synchronized(this.f) {
            batl.m(((boolean)(this.n ^ 1)), "Result has already been consumed.");
            if(this.o()) {
                return;
            }
            if(this.p()) {
                azuj azuj0 = this.h();
                this.g.b(azuk0, azuj0);
            }
            else {
                this.c = BasePendingResult.j(azuk0);
                long v2 = timeUnit0.toMillis(v);
                Message message0 = this.g.obtainMessage(2, this);
                this.g.sendMessageDelayed(message0, v2);
            }
        }
    }

    protected abstract azuj g(Status arg1);

    private final azuj h() {
        azuj azuj0;
        synchronized(this.f) {
            batl.m(((boolean)(this.n ^ 1)), "Result has already been consumed.");
            batl.m(this.p(), "Result is not ready.");
            azuj0 = this.i;
            this.i = null;
            this.c = null;
            this.n = true;
        }
        azzg azzg0 = (azzg)this.d.getAndSet(null);
        if(azzg0 != null) {
            azzg0.a.b.remove(this);
        }
        batl.s(azuj0);
        return azuj0;
    }

    private final void i(azuj azuj0) {
        this.i = azuj0;
        this.m = azuj0.a();
        this.j = null;
        this.a.countDown();
        if(this.o) {
            this.c = null;
        }
        else {
            azuk azuk0 = this.c;
            if(azuk0 != null) {
                this.g.removeMessages(2);
                azuj azuj1 = this.h();
                this.g.b(azuk0, azuj1);
            }
            else if((this.i instanceof azue)) {
                this.resultGuardian = new azvo(this);
            }
        }
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aztz)arrayList0.get(v1)).a(this.m);
        }
        arrayList0.clear();
    }

    public static azuk j(azuk azuk0) {
        return new azvi(clhn.b.a(), azuk0);
    }

    @Deprecated
    public final void k(Status status0) {
        synchronized(this.f) {
            if(!this.p()) {
                this.n(this.g(status0));
                this.p = true;
            }
        }
    }

    public final void l() {
        this.k = this.k || ((Boolean)BasePendingResult.e.get()).booleanValue();
    }

    public static void m(azuj azuj0) {
        if((azuj0 instanceof azue)) {
            try {
                ((azue)azuj0).iz();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("BasePendingResult", "Unable to release " + azuj0, runtimeException0);
            }
        }
    }

    public final void n(azuj azuj0) {
        synchronized(this.f) {
            if(!this.p && !this.o) {
                this.p();
                batl.m(((boolean)(this.p() ^ 1)), "Results have already been set");
                batl.m(((boolean)(this.n ^ 1)), "Result has already been consumed");
                this.i(azuj0);
                return;
            }
            BasePendingResult.m(azuj0);
        }
    }

    public final boolean o() {
        synchronized(this.f) {
        }
        return this.o;
    }

    public final boolean p() {
        return this.a.getCount() == 0L;
    }

    public final void q(azzg azzg0) {
        this.d.set(azzg0);
    }

    @Override  // azua
    public final azuj s() {
        batl.k("await must not be called on the UI thread");
        batl.m(((boolean)(this.n ^ 1)), "Result has already been consumed");
        try {
            this.a.await();
        }
        catch(InterruptedException unused_ex) {
            this.k(Status.c);
        }
        batl.m(this.p(), "Result is not ready.");
        return this.h();
    }

    @Override  // azua
    public final azuj t(long v, TimeUnit timeUnit0) {
        if(v > 0L) {
            batl.k("await must not be called on the UI thread when time is greater than zero.");
        }
        batl.m(((boolean)(this.n ^ 1)), "Result has already been consumed.");
        try {
            if(!this.a.await(v, timeUnit0)) {
                this.k(Status.e);
            }
        }
        catch(InterruptedException unused_ex) {
            this.k(Status.c);
        }
        batl.m(this.p(), "Result is not ready.");
        return this.h();
    }
}

