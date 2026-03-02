import java.io.ByteArrayOutputStream;

public final class igng extends ignj implements ignb {
    public byte[] a;

    public igng(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.a = arr_b;
    }

    @Override  // ignj
    public final boolean b(ignj ignj0) {
        return (ignj0 instanceof igng) ? igqw.c(this.a, ((igng)ignj0).a) : false;
    }

    @Override  // igne
    public final int hashCode() {
        return igqw.a(this.a);
    }

    @Override
    public final String toString() {
        byte[] arr_b = this.a;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            igrf igrf0 = igre.a;
            for(int v = 0; v < arr_b.length; ++v) {
                int v1 = arr_b[v];
                byteArrayOutputStream0.write(((int)igrf0.a[(v1 & 0xFF) >>> 4]));
                byteArrayOutputStream0.write(((int)igrf0.a[v1 & 15]));
            }
        }
        catch(Exception exception0) {
            throw new igrd("exception encoding Hex string: " + exception0.getMessage(), exception0);
        }
        return "#" + new String(byteArrayOutputStream0.toByteArray());
    }
}

