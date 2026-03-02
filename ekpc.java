import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ekpc extends wby implements cjug, ekpd {
    public final String a;
    public final elnf b;
    protected final cjts c;

    public ekpc(elnf elnf0, cjts cjts0, String s) {
        super("com.google.android.gms.safetynet.internal.ISafetyNetService");
        this.b = elnf0;
        this.a = s;
        this.c = cjts0;
    }

    @Override  // ekpd
    public final void a(ekpa ekpa0, byte[] arr_b, String s) {
        this.h(new elne(ekpa0, arr_b, this.a, s));
    }

    @Override  // ekpd
    public void b(ekpa ekpa0) {
        throw null;
    }

    @Override  // ekpd
    public void c(ekpa ekpa0) {
        throw null;
    }

    @Override  // ekpd
    public void d(ekpa ekpa0) {
        throw null;
    }

    @Override  // ekpd
    public void e(ekpa ekpa0) {
        throw null;
    }

    @Override  // ekpd
    public void f() {
        throw null;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ekpa ekpa1;
        ekpa ekpa0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    ekpa1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa1 = (iInterface0 instanceof ekpa) ? ((ekpa)iInterface0) : new ekoy(iBinder0);
                }
                byte[] arr_b = parcel0.createByteArray();
                ekpc.gr(parcel0);
                this.h(new elne(ekpa1, arr_b, this.a, null));
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface1 instanceof ekpa) ? ((ekpa)iInterface1) : new ekoy(iBinder1);
                }
                ekpc.gr(parcel0);
                this.h(new elnx(ekpa0, this.a));
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface2 instanceof ekpa) ? ((ekpa)iInterface2) : new ekoy(iBinder2);
                }
                String s = parcel0.readString();
                int[] arr_v = parcel0.createIntArray();
                int v1 = parcel0.readInt();
                String s1 = parcel0.readString();
                ekpc.gr(parcel0);
                this.l(ekpa0, s, arr_v, v1, s1);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface3 instanceof ekpa) ? ((ekpa)iInterface3) : new ekoy(iBinder3);
                }
                ekpc.gr(parcel0);
                this.b(ekpa0);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface4 instanceof ekpa) ? ((ekpa)iInterface4) : new ekoy(iBinder4);
                }
                ekpc.gr(parcel0);
                this.e(ekpa0);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface5 instanceof ekpa) ? ((ekpa)iInterface5) : new ekoy(iBinder5);
                }
                String s2 = parcel0.readString();
                ekpc.gr(parcel0);
                this.p(ekpa0, s2);
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface6 instanceof ekpa) ? ((ekpa)iInterface6) : new ekoy(iBinder6);
                }
                byte[] arr_b1 = parcel0.createByteArray();
                String s3 = parcel0.readString();
                ekpc.gr(parcel0);
                this.a(ekpa0, arr_b1, s3);
                break;
            }
            case 9: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface7 instanceof ekpa) ? ((ekpa)iInterface7) : new ekoy(iBinder7);
                }
                ekpc.gr(parcel0);
                this.g(ekpa0);
                break;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface8 instanceof ekpa) ? ((ekpa)iInterface8) : new ekoy(iBinder8);
                }
                String s4 = parcel0.readString();
                int v2 = parcel0.readInt();
                byte[] arr_b2 = parcel0.createByteArray();
                ekpc.gr(parcel0);
                this.k(ekpa0, s4, v2, arr_b2);
                break;
            }
            case 11: {
                int v3 = parcel0.readInt();
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ekpc.gr(parcel0);
                this.m(v3, bundle0);
                break;
            }
            case 12: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface9 instanceof ekpa) ? ((ekpa)iInterface9) : new ekoy(iBinder9);
                }
                ekpc.gr(parcel0);
                this.c(ekpa0);
                break;
            }
            case 13: {
                this.f();
                break;
            }
            case 14: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface10 instanceof ekpa) ? ((ekpa)iInterface10) : new ekoy(iBinder10);
                }
                ekpc.gr(parcel0);
                this.d(ekpa0);
                break;
            }
            case 18: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface11 instanceof ekpa) ? ((ekpa)iInterface11) : new ekoy(iBinder11);
                }
                int v4 = parcel0.readInt();
                String s5 = parcel0.readString();
                ekpc.gr(parcel0);
                this.o(ekpa0, v4, s5);
                break;
            }
            case 19: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface12 instanceof ekpa) ? ((ekpa)iInterface12) : new ekoy(iBinder12);
                }
                int v5 = parcel0.readInt();
                ekpc.gr(parcel0);
                this.j(ekpa0, v5);
                break;
            }
            case 20: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface13 instanceof ekpa) ? ((ekpa)iInterface13) : new ekoy(iBinder13);
                }
                String s6 = parcel0.readString();
                byte[] arr_b3 = parcel0.createByteArray();
                ekpc.gr(parcel0);
                this.n(ekpa0, s6, arr_b3);
                break;
            }
            case 21: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    ekpa0 = (iInterface14 instanceof ekpa) ? ((ekpa)iInterface14) : new ekoy(iBinder14);
                }
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ekpc.gr(parcel0);
                this.i(ekpa0, bundle1);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // ekpd
    public void g(ekpa ekpa0) {
        throw null;
    }

    public abstract void h(cjtm arg1);

    public void i(ekpa ekpa0, Bundle bundle0) {
        throw null;
    }

    public void j(ekpa ekpa0, int v) {
        throw null;
    }

    public void k(ekpa ekpa0, String s, int v, byte[] arr_b) {
        throw null;
    }

    public void l(ekpa ekpa0, String s, int[] arr_v, int v, String s1) {
        throw null;
    }

    public void m(int v, Bundle bundle0) {
        throw null;
    }

    public void n(ekpa ekpa0, String s, byte[] arr_b) {
        throw null;
    }

    public void o(ekpa ekpa0, int v, String s) {
        throw null;
    }

    public void p(ekpa ekpa0, String s) {
        throw null;
    }
}

