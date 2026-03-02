import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import java.io.Closeable;
import java.io.IOException;

final class epyx {
    public static final erqc a;
    public final epyv b;
    private final ParcelFileDescriptor.AutoCloseInputStream c;
    private final ParcelFileDescriptor.AutoCloseOutputStream d;
    private epyw e;

    static {
        epyx.a = new erqc(new String[]{"D2D", "epyx"});
    }

    public epyx(epyv epyv0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1) {
        this.b = epyv0;
        gftb.check(parcelFileDescriptor0);
        this.c = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
        gftb.check(parcelFileDescriptor1);
        this.d = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor1);
    }

    final void a() {
        epyx.a.d("cleanup", new Object[0]);
        epyw epyw0 = this.e;
        if(epyw0 != null) {
            epyw0.b = true;
        }
        epyx.e(this.c);
        epyx.e(this.d);
    }

    static void b(ParcelFileDescriptor[] arr_parcelFileDescriptor) {
        if(arr_parcelFileDescriptor != null) {
            try {
                for(int v = 0; v < arr_parcelFileDescriptor.length; ++v) {
                    arr_parcelFileDescriptor[v].close();
                }
            }
            catch(IOException iOException0) {
                epyx.a.m("IOException while closing ParcelFileDescriptor: " + iOException0.toString(), new Object[0]);
            }
        }
    }

    final void c() {
        epyw epyw0 = new epyw(this, this.c);
        this.e = epyw0;
        epyw0.a.execute(epyw0);
    }

    final void d(byte[] arr_b) {
        oyn.a("FidoReadWriteStreamHandler-writeReceivedData");
        try {
            this.d.write(arr_b);
        }
        catch(IOException iOException0) {
            epyx.a.l(iOException0);
            this.b.a(10701, "Write data to pipe failed.", null);
        }
        Trace.endSection();
    }

    private static void e(Closeable closeable0) {
        epyx.a.d("safelyCloseStream", new Object[0]);
        try {
            closeable0.close();
        }
        catch(IOException iOException0) {
            epyx.a.m("IOException while closing stream: " + iOException0.toString(), new Object[0]);
        }
    }
}

