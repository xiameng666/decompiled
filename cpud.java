import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class cpud extends wby implements cpue {
    fijk a;
    private final Context b;

    public cpud() {
        super("com.google.android.gms.matchstick.lighter.ILighterWebService");
    }

    public cpud(Context context0) {
        super("com.google.android.gms.matchstick.lighter.ILighterWebService");
        this.b = context0.getApplicationContext();
    }

    @Override  // cpue
    public final void a(String s, String s1) {
        Context context0 = this.b;
        fijc.b(context0).h(0x790);
        fijk fijk0 = this.a;
        if(fijk0 == null) {
            fihk.a("LWServiceImpl", "Attempting to call JSBridge method on bound service with no registered listener", new Object[0]);
            fijc.b(context0).d(0x777, 65);
            return;
        }
        fijk0.a(s, s1);
    }

    @Override  // cpue
    public final void b() {
        fijk fijk0 = this.a;
        if(fijk0 != null) {
            for(Object object0: fijk0.c.values()) {
                ((fiji)object0).c();
            }
            fijk0.c.clear();
            fijk0.a = null;
        }
        this.a = null;
    }

    @Override  // cpue
    public final void c(cpub cpub0) {
        fikf fikf0 = new fikf(this.b, cpub0);
        this.a = new fijk(this.b, fikf0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cpub cpub0;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    cpub0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.matchstick.lighter.ILighterWebListener");
                    cpub0 = (iInterface0 instanceof cpub) ? ((cpub)iInterface0) : new cptz(iBinder0);
                }
                cpud.gr(parcel0);
                this.c(cpub0);
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                cpud.gr(parcel0);
                this.a(s, s1);
                return true;
            }
            case 3: {
                this.b();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

