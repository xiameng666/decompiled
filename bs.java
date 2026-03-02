import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

public final class bs extends Binder implements IInterface {
    public final amy a;
    private Handler b;

    public bs() {
        this.attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public bs(amy amy0) {
        this.a = amy0;
        super();
        this.attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v > 0 && v <= 0xFFFFFF) {
            parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        }
        if(v == 0x5F4E5446) {
            parcel1.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        switch(v) {
            case 2: {
                parcel0.readInt();
                Bundle bundle0 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new ana(this));
                    return true;
                }
                break;
            }
            case 3: {
                parcel0.readString();
                Bundle bundle1 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new anb());
                    return true;
                }
                break;
            }
            case 4: {
                Bundle bundle2 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new anc());
                }
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                parcel0.readString();
                Bundle bundle3 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new and());
                }
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                parcel0.readInt();
                Uri uri0 = (Uri)parcel0.readTypedObject(Uri.CREATOR);
                parcel0.readInt();
                Bundle bundle4 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new ane());
                    return true;
                }
                break;
            }
            case 7: {
                parcel0.readString();
                Bundle bundle5 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                parcel1.writeNoException();
                parcel1.writeTypedObject(null, 1);
                return true;
            }
            case 8: {
                parcel0.readInt();
                parcel0.readInt();
                Bundle bundle6 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new anf());
                    return true;
                }
                break;
            }
            case 9: {
                Bundle bundle7 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new ang());
                    return true;
                }
                break;
            }
            case 10: {
                parcel0.readInt();
                parcel0.readInt();
                parcel0.readInt();
                parcel0.readInt();
                parcel0.readInt();
                Bundle bundle8 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new anh());
                    return true;
                }
                break;
            }
            case 11: {
                Bundle bundle9 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new ani());
                    return true;
                }
                break;
            }
            case 12: {
                Bundle bundle10 = (Bundle)parcel0.readTypedObject(Bundle.CREATOR);
                if(this.a != null) {
                    this.b.post(new amz());
                    return true;
                }
                break;
            }
            default: {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
        }
        return true;
    }
}

