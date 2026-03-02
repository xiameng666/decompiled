import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

public final class ccdb extends wby implements IInterface {
    private final cbyy a;
    private final gfuv b;
    private final Object c;
    private boolean d;

    public ccdb() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }

    public ccdb(cbyy cbyy0, gfuv gfuv0) {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
        this.c = new Object();
        this.d = false;
        this.a = cbyy0;
        this.b = gfuv0;
    }

    public final void a() {
        synchronized(this.c) {
            if(this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
                return;
            }
            this.d = true;
            this.a.close();
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ccda ccda0;
        boolean z = false;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    ccda0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
                    ccda0 = (iInterface0 instanceof ccda) ? ((ccda)iInterface0) : new ccda(iBinder0);
                }
                ccdb.gr(parcel0);
                if(ccda0 != null) {
                    z = true;
                }
                gftb.checkTrue(z);
                synchronized(this.c) {
                    if(this.d) {
                        Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
                    }
                    else {
                        cccr cccr0 = new cccr(this, ccda0, this.b);
                        this.a.a(cccr0);
                    }
                }
                break;
            }
            case 3: {
                parcel0.readInt();
                ccdb.gr(parcel0);
                synchronized(this.c) {
                    if(this.d) {
                        Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
                    }
                    else {
                        this.a.b();
                    }
                }
                break;
            }
            case 4: {
                this.a();
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

