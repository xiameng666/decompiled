import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

final class ehed extends clil {
    final int a;
    final String b;
    final Context c;
    final ehee d;

    public ehed(ehee ehee0, int v, String s, Context context0) {
        this.d = ehee0;
        this.a = v;
        this.b = s;
        this.c = context0;
        super("people");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        Object object0;
        gaew gaew0;
        if(iBinder0 != null) {
            try {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.setupcompat.portal.v1_1.ISetupNotificationServicePortalExtension");
                gaew0 = (iInterface0 instanceof gaew) ? ((gaew)iInterface0) : new gaew(iBinder0);
            }
            catch(NullPointerException unused_ex) {
                egig.k("FSA2_PortalRegistrationUtils", "NPE thrown when getting PortalExtension stub.");
                return;
            }
            if(gaew0 == null) {
                egig.k("FSA2_PortalRegistrationUtils", "NULL PortalExtension service.");
                return;
            }
            try {
                ehee ehee0 = this.d;
                ehee0.d = gaew0;
                int v = this.a;
                if(v > 0) {
                    String s = this.c.getResources().getResourceName(v);
                    String s1 = this.c.getResources().getResourceName(0x7F080CE5);
                    Intent intent0 = ehdn.a(this.c, this.b, "com.google.android.gms.people.notification.portal");
                    Parcel parcel0 = gaew0.jo();
                    wbz.f(parcel0, gaey.a("com.google.android.gms", ehef.c(this.b), s, s1, intent0));
                    Parcel parcel1 = gaew0.hM(2, parcel0);
                    IBinder iBinder1 = parcel1.readStrongBinder();
                    if(iBinder1 == null) {
                        object0 = null;
                    }
                    else {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback");
                        object0 = (iInterface1 instanceof gaev) ? ((gaev)iInterface1) : new gaev(iBinder1);
                    }
                    parcel1.recycle();
                    ehee0.c = object0;
                    egig.e("FSA2_PortalRegistrationUtils", "Registered task to Portal.");
                    return;
                }
                egig.e("FSA2_PortalRegistrationUtils", "Trying to reconnect to Portal to remove the task.");
                ehef.k(gaew0, this.b);
                ehef.i();
            }
            catch(RemoteException unused_ex) {
                egig.b("FSA2_PortalRegistrationUtils", "RemoteException when registering Portal task.");
            }
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ehef.i();
    }
}

