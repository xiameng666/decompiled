import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.selector.NativeOsCompat;
import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class ffdm implements ffdl {
    public final Map a;
    public final ParcelFileDescriptor[] b;
    public boolean c;
    private static final byte[] d;
    private final ffdj e;
    private final Object f;

    static {
        ffdm.d = new byte[]{42};
    }

    public ffdm() {
        this.f = new Object();
        this.e = ffdi.a;
        this.a = new HashMap();
        try {
            this.b = ParcelFileDescriptor.createPipe();
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    @Override  // ffdl
    public final int a(ParcelFileDescriptor parcelFileDescriptor0, byte[] arr_b, int v, int v1) {
        ffdm.j(arr_b.length, v, v1);
        if(v1 != 0) {
            try {
                batl.s(parcelFileDescriptor0);
                batl.s(arr_b);
                int v2 = NativeOsCompat.nativeRead(parcelFileDescriptor0.getFd(), arr_b, v, v1);
                NativeOsCompat.a(v2, "read");
                ffdm.l(v2);
                return v2;
            }
            catch(ffdh ffdh0) {
                if(ffdh0.a != this.e.a) {
                    throw ffdh0;
                }
            }
        }
        return 0;
    }

    @Override  // ffdl
    public final int b(ParcelFileDescriptor parcelFileDescriptor0, byte[] arr_b, int v, int v1) {
        ffdm.j(arr_b.length, v, v1);
        if(v1 != 0) {
            try {
                batl.s(parcelFileDescriptor0);
                batl.s(arr_b);
                int v2 = NativeOsCompat.nativeWrite(parcelFileDescriptor0.getFd(), arr_b, v, v1);
                NativeOsCompat.a(v2, "write");
                ffdm.l(v2);
                return v2;
            }
            catch(ffdh ffdh0) {
                ffdj ffdj0 = this.e;
                int v3 = ffdh0.a;
                if(v3 != ffdj0.a) {
                    if(v3 == ffdj0.b) {
                        throw new EOFException();
                    }
                    throw ffdh0;
                }
            }
        }
        return 0;
    }

    @Override  // ffdl
    public final void c(ParcelFileDescriptor parcelFileDescriptor0) {
        throw null;
    }

    @Override
    public final void close() {
        synchronized(this.f) {
            this.c = true;
            ghjp.b(this.b[0]);
            ghjp.b(this.b[1]);
        }
    }

    @Override  // ffdl
    public final void d(ParcelFileDescriptor parcelFileDescriptor0, ffdk ffdk0) {
        throw null;
    }

    @Override  // ffdl
    public final void e(ParcelFileDescriptor parcelFileDescriptor0) {
        throw null;
    }

    @Override  // ffdl
    public final void f() {
        synchronized(this.f) {
            if(!this.c) {
                this.k();
            }
        }
    }

    @Override  // ffdl
    public final boolean g() {
        if(this.c) {
            return false;
        }
        for(Object object0: this.a.values()) {
            if(((ffdk)object0) != ffdk.a) {
                return true;
            }
        }
        return false;
    }

    public static ffdn h(ParcelFileDescriptor parcelFileDescriptor0) {
        ffdn ffdn0 = new ffdn();
        ffdn0.a = parcelFileDescriptor0;
        ffdn0.b = 1;
        return ffdn0;
    }

    public final void i() {
        ParcelFileDescriptor parcelFileDescriptor0 = this.b[0];
        while(true) {
            try {
                if(this.a(parcelFileDescriptor0, new byte[1], 0, 1) == 0) {
                    break;
                }
            }
            catch(ffdh ffdh0) {
                throw new IllegalStateException(ffdh0);
            }
            catch(EOFException eOFException0) {
                throw new IllegalStateException(eOFException0);
            }
        }
    }

    private static void j(int v, int v1, int v2) {
        if(v1 >= 0 && v2 >= 0 && v - v1 >= v2) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("length=%s; regionStart=%s; regionLength=%s", v, v1, v2));
    }

    private final void k() {
        try {
            this.b(this.b[1], ffdm.d, 0, 1);
        }
        catch(ffdh ffdh0) {
            throw new IllegalStateException(ffdh0);
        }
        catch(EOFException eOFException0) {
            throw new IllegalStateException(eOFException0);
        }
    }

    private static final void l(int v) {
        if(v != 0) {
            return;
        }
        throw new EOFException();
    }
}

