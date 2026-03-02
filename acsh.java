import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.HasCapabilitiesRequest;

public final class acsh implements acsn {
    public final HasCapabilitiesRequest a;
    public final Context b;
    public final long c;
    public final long d;

    public acsh(HasCapabilitiesRequest hasCapabilitiesRequest0, Context context0, long v, long v1) {
        this.a = hasCapabilitiesRequest0;
        this.b = context0;
        this.c = v;
        this.d = v1;
    }

    @Override  // acsn
    public final Object a(IBinder iBinder0) {
        wtv wtv0;
        if(iBinder0 == null) {
            wtv0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            wtv0 = (iInterface0 instanceof wtv) ? ((wtv)iInterface0) : new wtt(iBinder0);
        }
        long v = this.d;
        long v1 = this.c;
        int v2 = wtv0.a(this.a);
        acry acry0 = acry.a(this.b);
        long v3 = System.currentTimeMillis();
        switch(v2) {
            case -1: {
                acry0.b(0x6C1, 0xC25D, v1, v3, v);
                return (int)-1;
            }
            case 1: {
                acry0.b(0x6C1, 0xC25A, v1, v3, v);
                return (int)1;
            }
            case 2: {
                acry0.b(0x6C1, 0xC25B, v1, v3, v);
                return (int)2;
            }
            case 4: {
                acry0.b(0x6C1, 0xC25C, v1, v3, v);
                return (int)4;
            }
            case 5: {
                acry0.b(0x6C1, 0xC25E, v1, v3, v);
                return (int)5;
            }
            case 6: {
                acry0.b(0x6C1, 0xC25F, v1, v3, v);
                return (int)6;
            }
            default: {
                acry0.b(0x6C1, 13, v1, v3, v);
                return v2;
            }
        }
    }
}

