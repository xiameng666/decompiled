import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class eksz extends clil implements Handler.Callback, IBinder.DeathRecipient, eksn {
    public final List a;
    public final ekta b;
    public final int c;
    public bsos d;
    public boolean e;
    public boolean f;
    public IBinder g;
    public final ektc h;
    public static final int i;
    private final Messenger j;

    public eksz(ektc ektc0, ekta ekta0, Looper looper0, int v) {
        Objects.requireNonNull(ektc0);
        this.h = ektc0;
        super("scheduler");
        this.a = new ArrayList();
        this.e = false;
        this.f = false;
        this.g = null;
        this.b = ekta0;
        this.c = v;
        this.j = new Messenger(new clht(looper0, this));
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        if(hthh.d()) {
            eksv eksv0 = () -> synchronized(this.h.a) {
                if(!eksm.b(iBinder0)) {
                    this.f();
                    return;
                }
                this.h(new bsor(iBinder0, this));
            };
            this.h.e.execute(eksv0);
            return;
        }
        this.j(iBinder0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        if(hthh.d()) {
            eksy eksy0 = () -> {
                ektc ektc0 = this.h;
                synchronized(ektc0.a) {
                    if(this.d != null) {
                        ektc0.a(this);
                        this.d = null;
                    }
                }
            };
            this.h.e.execute(eksy0);
            return;
        }
        this.k();
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        this.close();
    }

    public final Message c(Bundle bundle0, int v) {
        Message message0 = Message.obtain();
        message0.what = v;
        message0.replyTo = this.j;
        message0.setData(bundle0);
        return message0;
    }

    @Override  // eksn
    public final void close() {
        if(hthh.d()) {
            eksw eksw0 = new eksw(this);
            this.h.e.execute(eksw0);
            return;
        }
        this.h.a(this);
    }

    public final ektb d(String s) {
        synchronized(this.h.a) {
            Iterator iterator0 = this.a.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                ektb ektb0 = (ektb)object1;
                if(bata.b(s, ektb0.b.a.k())) {
                    iterator0.remove();
                    return ektb0;
                }
            }
        }
        return null;
    }

    public final void e() {
        synchronized(this.h.a) {
            if(this.d == null) {
                return;
            }
            for(Object object1: this.a) {
                ektb ektb0 = (ektb)object1;
                evqp evqp0 = ektb0.a;
                if(evqp0.a.m()) {
                    continue;
                    try {
                    label_14:
                        bsos bsos0 = this.d;
                        if(bsos0 != null) {
                            bsos0.b(this.c(eksz.l(ektb0), 1));
                        }
                        evqp0.c(Integer.valueOf(1));
                        continue;
                    }
                    catch(RemoteException unused_ex) {
                        ektb0.a.c(Integer.valueOf(0x800));
                        this.onServiceDisconnected(this.b.c);
                    }
                }
                else {
                    goto label_14;
                }
                break;
            }
        }
    }

    public final void f() {
        if(hthh.d()) {
            eksx eksx0 = () -> synchronized(this.h.a) {
                ekta ekta0 = this.b;
                ComponentName componentName0 = ekta0.c;
                Log.e("NetworkScheduler.TED", a.ab(componentName0, "Dropping task as app\'s play services SDK version does not support Android O. Either update the SDK or lower your app\'s target SDK version. Canceling all tasks for the service: "));
                ekqw ekqw0 = ekrs.b().d;
                if(ekqw0 != null) {
                    ekqw0.a(clms.b(ekta0.a, componentName0));
                }
            };
            this.h.e.execute(eksx0);
            return;
        }
        this.g();
    }

    // Detected as a lambda impl.
    public final void g() {
        synchronized(this.h.a) {
            ekta ekta0 = this.b;
            ComponentName componentName0 = ekta0.c;
            Log.e("NetworkScheduler.TED", a.ab(componentName0, "Dropping task as app\'s play services SDK version does not support Android O. Either update the SDK or lower your app\'s target SDK version. Canceling all tasks for the service: "));
            ekqw ekqw0 = ekrs.b().d;
            if(ekqw0 != null) {
                ekqw0.a(clms.b(ekta0.a, componentName0));
            }
        }
    }

    public final void h(bsos bsos0) {
        this.e = true;
        this.d = bsos0;
        if(this.f && this.c == 3) {
            Context context0 = this.h.c.a(0);
            if(context0 == null) {
                Log.e("NetworkScheduler.TED", "Unable to get context for " + this.b.c.toString());
                return;
            }
            this.i(context0);
            return;
        }
        this.e();
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        synchronized(this.h.a) {
            if(message0.sendingUid == this.b.b && message0.what == 3) {
                ektb ektb0 = this.d(message0.getData().getString("tag"));
                RuntimeException runtimeException0 = (RuntimeException)message0.getData().getSerializable("exception");
                if(this.a.isEmpty()) {
                    this.close();
                }
                if(ektb0 != null) {
                    int v1 = message0.arg1;
                    gfsx gfsx0 = gfsx.l(runtimeException0);
                    ektb0.b.m(v1, gfsx0);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void i(Context context0) {
        switch(this.c) {
            case 1: {
                try {
                    this.h.f.b(context0, this);
                }
                catch(IllegalArgumentException | IllegalStateException exception0) {
                    Log.w("NetworkScheduler.TED", "Error while unbinding: " + exception0.toString());
                }
                return;
            }
            case 2: {
                try {
                    context0.unbindService(this);
                }
                catch(IllegalArgumentException | IllegalStateException exception1) {
                    Log.w("NetworkScheduler.TED", "Error while unbinding: " + exception1.toString());
                }
                return;
            }
            default: {
                IBinder iBinder0 = this.g;
                if(iBinder0 != null) {
                    try {
                        iBinder0.unlinkToDeath(this, 0);
                    }
                    catch(NoSuchElementException noSuchElementException0) {
                        Log.e("NetworkScheduler.TED", "Binder unlinkToDeath failed", noSuchElementException0);
                    }
                }
                bsos bsos0 = this.d;
                if(bsos0 != null) {
                    try {
                        bsos0.a();
                    }
                    catch(RemoteException remoteException0) {
                        Log.e("NetworkScheduler.TED", "Failed to close remote binder connection" + remoteException0.toString());
                    }
                    this.d = null;
                    return;
                }
                Log.w("NetworkScheduler.TED", "Couldn\'t unbind from the task service in remote user");
            }
        }
    }

    // Detected as a lambda impl.
    public final void j(IBinder iBinder0) {
        synchronized(this.h.a) {
            if(!eksm.b(iBinder0)) {
                this.f();
                return;
            }
            this.h(new bsor(iBinder0, this));
        }
    }

    // Detected as a lambda impl.
    public final void k() {
        ektc ektc0 = this.h;
        synchronized(ektc0.a) {
            if(this.d != null) {
                ektc0.a(this);
                this.d = null;
            }
        }
    }

    public static final Bundle l(ektb ektb0) {
        Bundle bundle0 = new Bundle();
        eksl eksl0 = ektb0.b;
        eksc eksc0 = eksl0.a;
        bundle0.putString("tag", eksc0.k());
        bundle0.putParcelable("component", eksc0.f());
        bundle0.putParcelable("extras", eksc0.o.p);
        if(hthh.f()) {
            bundle0.putLong("max_exec_duration", eksl0.b());
        }
        if(eksc0.s()) {
            bundle0.putParcelableArrayList("triggered_uris", new ArrayList(eksc0.l()));
        }
        Bundle bundle1 = eksl0.h.a();
        if(!bundle1.isEmpty()) {
            bundle0.putBundle("engine_flags", bundle1);
        }
        return bundle0;
    }
}

