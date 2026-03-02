import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;

public abstract class alfu extends wby implements alfv {
    public alfu() {
        super("com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                String s = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                alfu.gr(parcel0);
                this.h(s, arr_b);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                this.k();
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                String s1 = parcel0.readString();
                alfu.gr(parcel0);
                this.j(s1);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s2 = parcel0.readString();
                alfu.gr(parcel0);
                this.i(s2);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                boolean z = wbz.i(parcel0);
                String s3 = parcel0.readString();
                alfu.gr(parcel0);
                this.f(z, s3);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                boolean z1 = wbz.i(parcel0);
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                alfu.gr(parcel0);
                this.e(z1, s4, s5);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                Intent intent0 = (Intent)wbz.a(parcel0, Intent.CREATOR);
                int v1 = parcel0.readInt();
                alfu.gr(parcel0);
                PendingIntent pendingIntent0 = this.a(intent0, v1);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent0);
                return true;
            }
            case 10: {
                String s6 = parcel0.readString();
                alfu.gr(parcel0);
                this.d(s6);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                String s7 = parcel0.readString();
                int v2 = parcel0.readInt();
                alfu.gr(parcel0);
                Intent intent1 = this.c(s7, v2);
                parcel1.writeNoException();
                wbz.g(parcel1, intent1);
                return true;
            }
            case 12: {
                String s8 = parcel0.readString();
                String s9 = parcel0.readString();
                int v3 = parcel0.readInt();
                alfu.gr(parcel0);
                this.g(s8, s9, v3);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

