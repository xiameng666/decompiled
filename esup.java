import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class esup {
    public byte a;
    public byte b;
    public byte c;
    public byte d;
    public int e;
    public byte f;
    private static final Logger g;
    private static final String h;
    private byte[] i;

    static {
        esup.g = Logger.getLogger("esup");
        esup.h = "GPAY: esup";
    }

    public final byte[] a() {
        return (byte[])this.i.clone();
    }

    public final void b(byte[] arr_b) {
        if(arr_b.length < 5) {
            esup.g.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayutils.ApduCommand", "parseApduCommand", esup.h + "ApduCommand: Invalid APDU length.");
            return;
        }
        this.a = arr_b[0];
        this.b = arr_b[1];
        this.c = arr_b[2];
        this.d = arr_b[3];
        int v = (int)Integer.valueOf(Integer.toString(arr_b[4] & 0xFF, 16), 16);
        this.e = v;
        this.i = Arrays.copyOfRange(arr_b, 5, v + 5);
        this.f = arr_b[arr_b.length - 1];
    }
}

