import java.io.ByteArrayInputStream;
import java.io.IOException;

public class tbo extends tak {
    private sza c;

    public tbo(byte[] arr_b, tcz tcz0) {
        super(arr_b, tcz0);
    }

    public final int h() {
        int v = 0;
        for(Object object0: this.c) {
            v += ((szd)object0).a;
        }
        return v;
    }

    public final void i() {
        int v;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(this.f());
        sza sza0 = new sza();
        while(byteArrayInputStream0.available() > 0) {
            szi szi0 = new szi(szh.d(byteArrayInputStream0));
            try {
                v = szh.a(byteArrayInputStream0);
            }
            catch(IOException iOException0) {
                throw new syz("Invalid stream", iOException0);
            }
            szd szd0 = new szd(v, szi0);
            sza0.a.add(szd0);
        }
        this.c = sza0;
    }

    public final szf j(byte[] arr_b) {
        try {
            sza sza0 = this.c;
            szf szf0 = new szf();
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            for(Object object0: sza0.a) {
                int v = byteArrayInputStream0.available();
                int v1 = ((szd)object0).a;
                if(v < v1) {
                    throw new syz("bytes to short");
                }
                szg szg0 = new szg(((szd)object0).b);
                byte[] arr_b1 = new byte[v1];
                if(byteArrayInputStream0.read(arr_b1) != v1) {
                    throw new syz("mismatch");
                }
                szg0.b(arr_b1);
                szf0.e(szg0);
            }
            return szf0;
        }
        catch(IOException iOException0) {
            throw new syz("error parsing", iOException0);
        }
    }
}

