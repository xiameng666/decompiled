import android.nfc.tech.IsoDep;
import j..util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class czwn implements Closeable {
    private final cuqg a;

    public czwn() {
        throw null;
    }

    public czwn(cuqg cuqg0) {
        this.a = cuqg0;
    }

    public final int a() {
        try {
            IsoDep isoDep0 = this.a.a;
            return isoDep0.isExtendedLengthApduSupported() ? Math.min(0xFFFF, isoDep0.getMaxTransceiveLength() - 9) : Math.min(0xFF, isoDep0.getMaxTransceiveLength() - 6);
        }
        catch(SecurityException unused_ex) {
            return 0;
        }
    }

    public final czwh b(czwg czwg0) {
        byte[] arr_b1;
        int v = (int)hvog.a.bk().bR();
        try {
            this.a.a.setTimeout(v);
        }
        catch(SecurityException unused_ex) {
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(czwg0.e.length + 4 + czwg0.f.length + czwg0.g.length + czwg0.h.length + czwg0.i.length);
        byteBuffer0.put(czwg0.a);
        byteBuffer0.put(czwg0.b);
        byteBuffer0.put(czwg0.c);
        byteBuffer0.put(czwg0.d);
        byteBuffer0.put(czwg0.e);
        byteBuffer0.put(czwg0.f);
        byteBuffer0.put(czwg0.g);
        byteBuffer0.put(czwg0.h);
        byteBuffer0.put(czwg0.i);
        byte[] arr_b = byteBuffer0.array();
        try {
            arr_b1 = this.a.a.transceive(arr_b);
        }
        catch(SecurityException securityException0) {
            throw new IOException(securityException0);
        }
        if(arr_b1.length < 2) {
            czkq.a.e().h("Failed to parse response %s because the byte array was too short", czmk.g(arr_b1));
            return czwh.a();
        }
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b1);
        byte[] arr_b2 = new byte[arr_b1.length - 2];
        byteBuffer1.get(arr_b2);
        byte[] arr_b3 = new byte[2];
        byteBuffer1.get(arr_b3);
        czwh czwh0 = new czwh(arr_b2, arr_b3);
        return czwh0 == null ? czwh.a() : czwh0;
    }

    public final boolean c() {
        boolean z;
        cuqg cuqg0 = this.a;
        if(!cuqg0.c()) {
            try {
                cuqg0.b();
                z = false;
                z = cuqg0.c();
            }
            catch(IOException unused_ex) {
            }
            finally {
                bbpb.b(this.a);
            }
            return z;
        }
        return true;
    }

    @Override
    public final void close() {
        bbpb.b(this.a);
    }

    public final void d() {
        this.a.b();
        if(!this.b(new czwg(0, -92, 4, 0, bboy.d("F00000FE2C"), 0)).d()) {
            return;
        }
        bbpb.b(this);
        throw new IOException(String.format("Failed to bind to the remote NFC service %s.", "F00000FE2C"));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof czwn) ? Objects.equals(this.a, ((czwn)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    @Override
    public final String toString() {
        return "NfcDevice{isoDep=" + this.a.toString() + "}";
    }
}

