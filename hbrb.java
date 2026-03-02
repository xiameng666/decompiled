import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public final class hbrb {
    public final hbkp a;
    public hbpo b;
    public final int c;

    public hbrb(hbkp hbkp0, int v) {
        this.b = new hbpo();
        this.a = hbkp0;
        hbrm.a();
        this.c = v;
    }

    public final byte[] a(int v) {
        this.b.i = Boolean.valueOf(1 == (v ^ 1));
        this.b.g = Boolean.valueOf(false);
        hbpp hbpp0 = new hbpp(this.b);
        hbkp hbkp0 = this.a;
        hbkp0.a = hbpp0;
        try {
            hbrm.a();
            if(v == 0) {
                hbkq hbkq0 = new hbkq(hbkp0);
                gpdg gpdg0 = new gpdg();
                hbhw.a(gpdg0);
                gpdg0.d = true;
                Objects.requireNonNull(gpdg0);
                StringWriter stringWriter0 = new StringWriter();
                try {
                    gpdh gpdh0 = new gpdh(stringWriter0, gpdg0.a, gpdg0.b, gpdg0.c, gpdg0.d);
                    gpdh0.g(hbkq0);
                    gpdh0.a.flush();
                }
                catch(IOException unused_ex) {
                }
                return stringWriter0.toString().getBytes("utf-8");
            }
            hbkq hbkq1 = new hbkq(hbkp0);
            gpds gpds0 = new gpds();
            hbhw.a(gpds0);
            HashMap hashMap0 = new HashMap(gpds0.a);
            HashMap hashMap1 = new HashMap(gpds0.b);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            try {
                gpdq gpdq0 = new gpdq(byteArrayOutputStream0, hashMap0, hashMap1, gpds0.c);
                Class class0 = hbkq1.getClass();
                gpcx gpcx0 = (gpcx)gpdq0.c.get(class0);
                if(gpcx0 == null) {
                    throw new gpcu("No encoder for " + hbkq1.getClass());
                }
                gpcx0.a(hbkq1, gpdq0);
            }
            catch(IOException unused_ex) {
            }
            return byteArrayOutputStream0.toByteArray();
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", unsupportedEncodingException0);
        }
    }
}

