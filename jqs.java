import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class jqs implements gmcd {
    static final boolean a;
    static final jqi b;
    private static final Logger c;
    private static final Object d;
    volatile jqm listeners;
    public volatile Object value;
    volatile jqr waiters;

    static {
        jqo jqo0;
        jqs.a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        jqs.c = Logger.getLogger(jqs.class.getName());
        try {
            jqo0 = new jqo(AtomicReferenceFieldUpdater.newUpdater(jqr.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(jqr.class, jqr.class, "next"), AtomicReferenceFieldUpdater.newUpdater(jqs.class, jqr.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(jqs.class, jqm.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(jqs.class, Object.class, "value"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            jqo0 = new jqq();
        }
        jqs.b = jqo0;
        if(throwable0 != null) {
            jqs.c.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        jqs.d = new Object();
    }

    static Object a(gmcd gmcd0) {
        if((gmcd0 instanceof jqs)) {
            Object object0 = ((jqs)gmcd0).value;
            if((object0 instanceof jqj) && ((jqj)object0).c) {
                Throwable throwable0 = ((jqj)object0).d;
                return throwable0 == null ? jqj.b : new jqj(false, throwable0);
            }
            return object0;
        }
        int v = gmcd0.isCancelled();
        if(((jqs.a ^ 1) & v) != 0) {
            return jqj.b;
        }
        try {
            Object object1 = jqs.c(gmcd0);
            return object1 == null ? jqs.d : object1;
        }
        catch(ExecutionException executionException0) {
            return new jql(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            if(v == 0) {
                Objects.toString(gmcd0);
                return new jql(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + gmcd0, cancellationException0));
            }
            return new jqj(false, cancellationException0);
        }
        catch(Throwable throwable1) {
            return new jql(throwable1);
        }
    }

    static Object c(Future future0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = future0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    @Override
    public final boolean cancel(boolean z) {
        jqj jqj0;
        Object object0 = this.value;
        if((object0 instanceof jqp | (object0 == null ? 1 : 0)) != 0) {
            if(jqs.a) {
                jqj0 = new jqj(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                jqj0 = z ? jqj.a : jqj.b;
            }
            boolean z1 = false;
            while(true) {
                if(jqs.b.d(this, object0, jqj0)) {
                    jqs.f(this);
                    if((object0 instanceof jqp)) {
                        gmcd gmcd0 = ((jqp)object0).b;
                        if((gmcd0 instanceof jqs)) {
                            this = (jqs)gmcd0;
                            object0 = this.value;
                            if(((object0 == null ? 1 : 0) | object0 instanceof jqp) != 0) {
                                z1 = true;
                                continue;
                            }
                            return true;
                        }
                        else {
                            gmcd0.cancel(z);
                        }
                    }
                    return true;
                }
                object0 = this.value;
                if(!(object0 instanceof jqp)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    protected String d() {
        Object object0 = this.value;
        if((object0 instanceof jqp)) {
            return "setFuture=[" + this.j(((jqp)object0).b) + "]";
        }
        return (this instanceof ScheduledFuture) ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    protected void e() {
    }

    static void f(jqs jqs0) {
        jqm jqm3;
        Runnable runnable0;
        jqm jqm2;
        jqm jqm1;
        jqm jqm0 = null;
        while(true) {
            jqr jqr0 = jqs0.waiters;
            if(!jqs.b.e(jqs0, jqr0, jqr.a)) {
                continue;
            }
            while(jqr0 != null) {
                Thread thread0 = jqr0.thread;
                if(thread0 != null) {
                    jqr0.thread = null;
                    LockSupport.unpark(thread0);
                }
                jqr0 = jqr0.next;
            }
            jqs0.e();
            do {
                jqm1 = jqs0.listeners;
            }
            while(!jqs.b.c(jqs0, jqm1, jqm.a));
            while(true) {
                jqm2 = jqm0;
                jqm0 = jqm1;
                if(jqm0 == null) {
                    break;
                }
                jqm1 = jqm0.next;
                jqm0.next = jqm2;
            }
        label_19:
            if(jqm2 != null) {
                runnable0 = jqm2.b;
                jqm3 = jqm2.next;
                if((runnable0 instanceof jqp)) {
                    jqs0 = ((jqp)runnable0).a;
                    if(jqs0.value == ((jqp)runnable0)) {
                        Object object0 = jqs.a(((jqp)runnable0).b);
                        if(jqs.b.d(jqs0, ((jqp)runnable0), object0)) {
                            jqm0 = jqm3;
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                jqm2 = jqm3;
                goto label_19;
            }
            return;
        }
        jqs.l(runnable0, jqm2.c);
        jqm2 = jqm3;
        goto label_19;
    }

    public final boolean g(Object object0) {
        if(object0 == null) {
            object0 = jqs.d;
        }
        if(jqs.b.d(this, null, object0)) {
            jqs.f(this);
            return true;
        }
        return false;
    }

    @Override
    public final Object get() {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.value;
        if(((object0 == null ? 0 : 1) & (object0 instanceof jqp ^ 1)) != 0) {
            return jqs.n(object0);
        }
        jqr jqr0 = this.waiters;
        if(jqr0 != jqr.a) {
            jqr jqr1 = new jqr();
            do {
                jqr1.a(jqr0);
                if(jqs.b.e(this, jqr0, jqr1)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.value;
                        if(((object1 == null ? 0 : 1) & (object1 instanceof jqp ^ 1)) != 0) {
                            return jqs.n(object1);
                        }
                    }
                    this.m(jqr1);
                    throw new InterruptedException();
                }
                jqr0 = this.waiters;
            }
            while(jqr0 != jqr.a);
        }
        return jqs.n(this.value);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.value;
        boolean z = true;
        if(((object0 == null ? 0 : 1) & (object0 instanceof jqp ^ 1)) != 0) {
            return jqs.n(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            jqr jqr0 = this.waiters;
            if(jqr0 != jqr.a) {
                jqr jqr1 = new jqr();
                do {
                    jqr1.a(jqr0);
                    if(jqs.b.e(this, jqr0, jqr1)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.m(jqr1);
                                throw new InterruptedException();
                            }
                            Object object1 = this.value;
                            if(((object1 == null ? 0 : 1) & (object1 instanceof jqp ^ 1)) != 0) {
                                return jqs.n(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.m(jqr1);
                        goto label_27;
                    }
                    jqr0 = this.waiters;
                }
                while(jqr0 != jqr.a);
            }
            return jqs.n(this.value);
        }
    label_27:
        while(v1 > 0L) {
            Object object2 = this.value;
            if(((object2 == null ? 0 : 1) & (object2 instanceof jqp ^ 1)) != 0) {
                return jqs.n(object2);
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            v1 = v2 - System.nanoTime();
            continue;
        }
        String s = this.toString();
        String s1 = timeUnit0.toString().toLowerCase(Locale.ROOT);
        String s2 = "Waited " + v + " " + timeUnit0.toString().toLowerCase(Locale.ROOT);
        if(v1 + 1000L < 0L) {
            String s3 = s2 + " (plus ";
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            int v5 = Long.compare(v3, 0L);
            if(v5 != 0 && v4 <= 1000L) {
                z = false;
            }
            if(v5 > 0) {
                s3 = (z ? s3 + v3 + " " + s1 + "," : s3 + v3 + " " + s1) + " ";
            }
            if(z) {
                s3 = s3 + v4 + " nanoseconds ";
            }
            s2 = s3 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s2 + " but future completed as timeout expired") : new TimeoutException(a.r(s, s2, " for "));
    }

    public final boolean h(Throwable throwable0) {
        jqs.i(throwable0);
        jql jql0 = new jql(throwable0);
        if(jqs.b.d(this, null, jql0)) {
            jqs.f(this);
            return true;
        }
        return false;
    }

    @Override  // gmcd
    public final void hB(Runnable runnable0, Executor executor0) {
        jqs.i(executor0);
        jqm jqm0 = this.listeners;
        if(jqm0 != jqm.a) {
            jqm jqm1 = new jqm(runnable0, executor0);
            do {
                jqm1.next = jqm0;
                if(jqs.b.c(this, jqm0, jqm1)) {
                    return;
                }
                jqm0 = this.listeners;
            }
            while(jqm0 != jqm.a);
        }
        jqs.l(runnable0, executor0);
    }

    static void i(Object object0) {
        object0.getClass();
    }

    @Override
    public final boolean isCancelled() {
        return this.value instanceof jqj;
    }

    @Override
    public final boolean isDone() {
        return this.value == null ? 0 : 1 & (this.value instanceof jqp ^ 1);
    }

    private final String j(Object object0) {
        return object0 == this ? "this future" : String.valueOf(object0);
    }

    private final void k(StringBuilder stringBuilder0) {
        try {
            Object object0 = jqs.c(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append(this.j(object0));
            stringBuilder0.append("]");
        }
        catch(ExecutionException executionException0) {
            stringBuilder0.append("FAILURE, cause=[");
            stringBuilder0.append(executionException0.getCause());
            stringBuilder0.append("]");
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
        }
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
        }
    }

    private static void l(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            jqs.c.log(Level.SEVERE, a.m(executor0, runnable0, "RuntimeException while executing runnable ", " with executor "), runtimeException0);
        }
    }

    private final void m(jqr jqr0) {
        jqr0.thread = null;
    alab1:
        jqr jqr1;
        while((jqr1 = this.waiters) != jqr.a) {
            jqr jqr2 = null;
            while(true) {
                if(jqr1 == null) {
                    break alab1;
                }
                jqr jqr3 = jqr1.next;
                if(jqr1.thread == null) {
                    if(jqr2 != null) {
                        jqr2.next = jqr3;
                        if(jqr2.thread == null) {
                            break;
                        }
                        else {
                            jqr1 = jqr3;
                            continue;
                        }
                    }
                    if(!jqs.b.e(this, jqr1, jqr3)) {
                        break;
                    }
                }
                else {
                    jqr2 = jqr1;
                }
                jqr1 = jqr3;
            }
        }
    }

    private static final Object n(Object object0) {
        if(!(object0 instanceof jqj)) {
            if(!(object0 instanceof jql)) {
                return object0 == jqs.d ? null : object0;
            }
            throw new ExecutionException(((jql)object0).b);
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((jqj)object0).d);
        throw cancellationException0;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append("[status=");
        if(this.isCancelled()) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.k(stringBuilder0);
        }
        else {
            try {
                s = this.d();
            }
            catch(RuntimeException runtimeException0) {
                Class class0 = runtimeException0.getClass();
                Objects.toString(class0);
                s = "Exception thrown from implementation: " + class0;
            }
            if(s != null && !s.isEmpty()) {
                stringBuilder0.append("PENDING, info=[");
                stringBuilder0.append(s);
                stringBuilder0.append("]");
            }
            else if(this.isDone()) {
                this.k(stringBuilder0);
            }
            else {
                stringBuilder0.append("PENDING");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

