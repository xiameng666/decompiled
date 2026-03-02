import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class jvq implements ServiceConnection, Handler.Callback {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d;
    private Set e;

    public jvq(Context context0) {
        this.d = new HashMap();
        this.e = new HashSet();
        this.b = context0;
        HandlerThread handlerThread0 = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread0;
        handlerThread0.start();
        this.a = new Handler(handlerThread0.getLooper(), this);
    }

    private final void a(jvp jvp0) {
        if(jvp0.b) {
            this.b.unbindService(this);
            jvp0.b = false;
        }
        jvp0.e = null;
    }

    private final void b(jvp jvp0) {
        ArrayDeque arrayDeque0 = jvp0.c;
        if(!arrayDeque0.isEmpty()) {
            if(!jvp0.b) {
                Intent intent0 = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
                ComponentName componentName0 = jvp0.a;
                Intent intent1 = intent0.setComponent(componentName0);
                Context context0 = this.b;
                boolean z = context0.bindService(intent1, this, 33);
                jvp0.b = z;
                if(z) {
                    jvp0.d = 0;
                }
                else {
                    Objects.toString(componentName0);
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName0);
                    context0.unbindService(this);
                }
                if(jvp0.b) {
                    goto label_16;
                }
                goto label_40;
            }
        label_16:
            if(jvp0.e == null) {
                goto label_40;
            }
            jvn jvn0;
            while((jvn0 = (jvn)arrayDeque0.peek()) != null) {
                try {
                    jty jty0 = jvp0.e;
                    Parcel parcel0 = Parcel.obtain();
                    try {
                        parcel0.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                        parcel0.writeString(jvn0.a);
                        parcel0.writeInt(jvn0.b);
                        parcel0.writeString(jvn0.c);
                        parcel0.writeTypedObject(jvn0.d, 0);
                        jty0.a.transact(1, parcel0, null, 1);
                    }
                    finally {
                        parcel0.recycle();
                    }
                    arrayDeque0.remove();
                    continue;
                }
                catch(DeadObjectException remoteException0) {
                }
                catch(RemoteException unused_ex) {
                    break;
                }
                Objects.toString(jvp0.a);
                Log.w("NotifManCompat", "RemoteException communicating with " + jvp0.a, remoteException0);
                break;
            }
            if(!jvp0.c.isEmpty()) {
                this.c(jvp0);
                return;
            label_40:
                this.c(jvp0);
            }
        }
    }

    private final void c(jvp jvp0) {
        ComponentName componentName0 = jvp0.a;
        Handler handler0 = this.a;
        if(handler0.hasMessages(3, componentName0)) {
            return;
        }
        int v = jvp0.d;
        jvp0.d = v + 1;
        if(v + 1 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + jvp0.c.size() + " tasks to " + componentName0 + " after " + jvp0.d + " retries");
            jvp0.c.clear();
            return;
        }
        handler0.sendMessageDelayed(handler0.obtainMessage(3, componentName0), ((long)((1 << v) * 1000)));
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        Set set0;
        jty jty0;
        switch(message0.what) {
            case 0: {
                jvn jvn0 = (jvn)message0.obj;
                String s = Settings.Secure.getString(this.b.getContentResolver(), "enabled_notification_listeners");
                synchronized(jvr.a) {
                    if(s != null && !s.equals(jvr.b)) {
                        String[] arr_s = s.split(":", -1);
                        HashSet hashSet0 = new HashSet(arr_s.length);
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            ComponentName componentName0 = ComponentName.unflattenFromString(arr_s[v1]);
                            if(componentName0 != null) {
                                hashSet0.add(componentName0.getPackageName());
                            }
                        }
                        jvr.c = hashSet0;
                        jvr.b = s;
                    }
                    set0 = jvr.c;
                }
                if(!set0.equals(this.e)) {
                    this.e = set0;
                    List list0 = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet1 = new HashSet();
                    for(Object object1: list0) {
                        ResolveInfo resolveInfo0 = (ResolveInfo)object1;
                        if(set0.contains(resolveInfo0.serviceInfo.packageName)) {
                            ComponentName componentName1 = new ComponentName(resolveInfo0.serviceInfo.packageName, resolveInfo0.serviceInfo.name);
                            if(resolveInfo0.serviceInfo.permission == null) {
                                hashSet1.add(componentName1);
                            }
                            else {
                                Log.w("NotifManCompat", a.i(componentName1, "Permission present on component ", ", not adding listener record."));
                            }
                        }
                    }
                    for(Object object2: hashSet1) {
                        ComponentName componentName2 = (ComponentName)object2;
                        Map map0 = this.d;
                        if(!map0.containsKey(componentName2)) {
                            map0.put(componentName2, new jvp(componentName2));
                        }
                    }
                    Iterator iterator2 = this.d.entrySet().iterator();
                    while(iterator2.hasNext()) {
                        Object object3 = iterator2.next();
                        Map.Entry map$Entry0 = (Map.Entry)object3;
                        if(!hashSet1.contains(map$Entry0.getKey())) {
                            this.a(((jvp)map$Entry0.getValue()));
                            iterator2.remove();
                        }
                    }
                }
                for(Object object4: this.d.values()) {
                    ((jvp)object4).c.add(jvn0);
                    this.b(((jvp)object4));
                }
                return true;
            }
            case 1: {
                ComponentName componentName3 = ((jvo)message0.obj).a;
                IBinder iBinder0 = ((jvo)message0.obj).b;
                jvp jvp0 = (jvp)this.d.get(componentName3);
                if(jvp0 != null) {
                    if(iBinder0 == null) {
                        jty0 = null;
                    }
                    else {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        jty0 = iInterface0 == null || !(iInterface0 instanceof jty) ? new jty(iBinder0) : ((jty)iInterface0);
                    }
                    jvp0.e = jty0;
                    jvp0.d = 0;
                    this.b(jvp0);
                }
                return true;
            }
            case 2: {
                jvp jvp1 = (jvp)this.d.get(((ComponentName)message0.obj));
                if(jvp1 != null) {
                    this.a(jvp1);
                }
                return true;
            }
            case 3: {
                jvp jvp2 = (jvp)this.d.get(((ComponentName)message0.obj));
                if(jvp2 != null) {
                    this.b(jvp2);
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        jvo jvo0 = new jvo(componentName0, iBinder0);
        this.a.obtainMessage(1, jvo0).sendToTarget();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.a.obtainMessage(2, componentName0).sendToTarget();
    }
}

