import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

final class ehec extends clil {
    final boolean a;
    final int b;
    final String c;
    final Context d;
    final ehee e;

    public ehec(ehee ehee0, boolean z, int v, String s, Context context0) {
        this.e = ehee0;
        this.a = z;
        this.b = v;
        this.c = s;
        this.d = context0;
        super("people");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        Object object0;
        gaek gaek0;
        if(iBinder0 != null) {
            try {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.setupcompat.portal.ISetupNotificationServicePortalExtension");
                gaek0 = (iInterface0 instanceof gaek) ? ((gaek)iInterface0) : new gaek(iBinder0);
            }
            catch(NullPointerException unused_ex) {
                egig.k("FSA2_PortalRegistrationUtils", "NPE thrown when getting PortalExtension stub.");
                return;
            }
            if(gaek0 == null) {
                egig.k("FSA2_PortalRegistrationUtils", "NULL PortalExtension service.");
                return;
            }
            try {
                ehee ehee0 = this.e;
                ehee0.d = gaek0;
                if(this.a) {
                    int v = this.b;
                    if(v > 0) {
                        Intent intent0 = ehdn.a(this.d, this.c, "com.google.android.gms.people.notification.portal");
                        Parcel parcel0 = gaek0.jo();
                        wbz.f(parcel0, gaeu.a("com.google.android.gms", ehef.c(this.c), v, 0x7F080CE5, intent0));
                        Parcel parcel1 = gaek0.hM(2, parcel0);
                        IBinder iBinder1 = parcel1.readStrongBinder();
                        if(iBinder1 == null) {
                            object0 = null;
                        }
                        else {
                            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.setupcompat.portal.IPortalProgressCallback");
                            object0 = (iInterface1 instanceof gaef) ? ((gaef)iInterface1) : new gaef(iBinder1);
                        }
                        parcel1.recycle();
                        ehee0.c = object0;
                        egig.e("FSA2_PortalRegistrationUtils", "Registered task to Portal.");
                        return;
                    }
                }
                egig.e("FSA2_PortalRegistrationUtils", "Trying to reconnect to Portal to remove the task.");
                ehef.j(gaek0, this.c);
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

