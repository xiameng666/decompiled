import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.gms.scheduler.execution.TaskConnectionTracker.1;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class eksu implements Runnable {
    public final ektc a;
    public final eksl b;
    public final evqp c;

    public eksu(ektc ektc0, eksl eksl0, evqp evqp0) {
        this.a = ektc0;
        this.b = eksl0;
        this.c = evqp0;
    }

    @Override
    public final void run() {
        Bundle bundle1;
        eksz eksz2;
        int v1;
        eksz eksz1;
        Object object0;
        eksz eksz0;
        Context context0;
        ekta ekta0;
        evqp evqp0;
        ektc ektc0;
        eksl eksl0;
        try {
            eksl0 = this.b;
            ektc0 = this.a;
            evqp0 = this.c;
            ekta0 = new ekta(eksl0);
            context0 = ektc0.c.a(0);
            eksz0 = null;
            if(context0 == null) {
                Log.e("NetworkScheduler.TED", "Unable to get context for " + ekta0.c.toString());
            }
            else {
                object0 = ektc0.a;
                __monitor_enter(object0);
                goto label_11;
            }
            goto label_81;
        }
        catch(SecurityException unused_ex) {
            evqp0.c(Integer.valueOf(8));
            return;
        }
        catch(Exception unused_ex) {
            goto label_102;
        }
        try {
        label_11:
            eksz1 = (eksz)ektc0.b.get(ekta0);
            if(eksz1 == null) {
                Looper looper0 = ektc0.d;
                int v = ekta0.a;
                boolean z = true;
                if(v == 0) {
                    v1 = 1;
                }
                else if(!hthh.e()) {
                    v1 = 2;
                }
                else if(!hrvh.a.i().H()) {
                    v1 = 3;
                }
                else if(Build.VERSION.SDK_INT >= 33) {
                    v1 = 2;
                }
                else {
                    v1 = 3;
                }
                eksz2 = new eksz(ektc0, ekta0, looper0, v1);
                switch(eksz2.c) {
                    case 1: {
                        Intent intent0 = ekta0.a();
                        z = ektc0.f.e(context0, "NetworkScheduler", intent0, eksz2, 0x105);
                        break;
                    }
                    case 2: {
                        Intent intent1 = ekta0.a();
                        UserHandle userHandle0 = (UserHandle)ekqd.d(ekta0.a);
                        batl.s(userHandle0);
                        z = context0.bindServiceAsUser(intent1, eksz2, 0x105, userHandle0);
                        break;
                    }
                    default: {
                        evqp evqp1 = new evqp();
                        Bundle bundle0 = new Bundle();
                        bundle0.putBinder("callback", new bsou(eksz2, eksz2));
                        bundle0.putInt("OP_CODE", 5);
                        bundle0.putParcelable("intent", eksz2.b.a());
                        bundle0.putInt("user_serial", v);
                        ekqd.i(context0, v, new Intent().putExtras(bundle0).setClassName(eksz2.h.c.a(0), "com.google.android.gms.gcm.nts.SchedulerInternalReceiver"), null, new TaskConnectionTracker.1(ektc0, evqp1));
                        try {
                            bundle1 = (Bundle)evrg.n(evqp1.a);
                        }
                        catch(ExecutionException | InterruptedException exception0) {
                            Log.e("NetworkScheduler.TED", "Failed waiting for ordered broadcast: " + exception0.toString());
                            goto label_53;
                        }
                        if(bundle1 == null) {
                        label_53:
                            z = false;
                        }
                        else {
                            IBinder iBinder0 = bundle1.getBinder("binder");
                            if(iBinder0 == null) {
                                Log.e("NetworkScheduler.TED", "Proxy binder is missing from start proxy broadcast");
                                goto label_53;
                            }
                            else {
                                try {
                                    iBinder0.linkToDeath(eksz2, 0);
                                    eksz2.g = iBinder0;
                                }
                                catch(RemoteException remoteException0) {
                                    Log.e("NetworkScheduler.TED", "Binder linkToDeath failed", remoteException0);
                                    goto label_53;
                                }
                            }
                        }
                    }
                }
                if(z) {
                    goto label_67;
                }
                else {
                    Log.e("NetworkScheduler.TED", "Unable to bind to task service: " + ekta0.c.toString());
                    ektc0.a(eksz2);
                    goto label_65;
                }
            }
            else {
                goto label_75;
            }
            goto label_81;
        }
        catch(Throwable throwable0) {
            goto label_79;
        }
        try {
        label_65:
            __monitor_exit(object0);
            goto label_81;
        }
        catch(SecurityException unused_ex) {
            evqp0.c(Integer.valueOf(8));
            return;
        }
        catch(Exception unused_ex) {
            goto label_102;
        }
        try {
        label_67:
            ektc0.b.put(ekta0, eksz2);
        }
        catch(Throwable throwable0) {
            goto label_79;
        }
        try {
            __monitor_exit(object0);
            Objects.requireNonNull(eksz2);
            ekst ekst0 = new ekst(eksz2);
            long v2 = hthh.b();
            ((bbll)ektc0.e).g(ekst0, v2, TimeUnit.SECONDS);
            eksz0 = eksz2;
            goto label_81;
        }
        catch(SecurityException unused_ex) {
            evqp0.c(Integer.valueOf(8));
            return;
        }
        catch(Exception unused_ex) {
            goto label_102;
        }
        try {
        label_75:
            __monitor_exit(object0);
            eksz0 = eksz1;
            goto label_81;
        }
        catch(Throwable throwable0) {
            try {
            label_79:
                __monitor_exit(object0);
                throw throwable0;
            label_81:
                if(eksz0 != null) {
                    synchronized(eksz0.h.a) {
                        ektb ektb0 = new ektb(eksl0, evqp0);
                        eksz0.a.add(ektb0);
                        eksz0.e();
                    }
                    return;
                }
                Context context1 = ektc0.c.a(0);
                if(context1 != null) {
                    if(!eksl.n("com.google.android.gms.gcm.ACTION_TASK_READY", eksl0.a.f(), context1.getPackageManager())) {
                        evqp0.c(Integer.valueOf(0x20));
                        return;
                    }
                    evqp0.c(Integer.valueOf(0x200));
                    return;
                }
                evqp0.c(Integer.valueOf(4));
                return;
            }
            catch(SecurityException unused_ex) {
            }
            catch(Exception unused_ex) {
                goto label_102;
            }
        }
        evqp0.c(Integer.valueOf(8));
        return;
    label_102:
        Log.e("NetworkScheduler.TED", "Couldn\'t bind to service: " + eksl0.a.f().toString());
        evqp0.c(Integer.valueOf(0x200));
    }
}

