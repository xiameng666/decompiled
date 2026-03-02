import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class szg extends szb implements Serializable, Iterable {
    public final Boolean b;
    private byte[] c;
    private List d;

    public szg(szi szi0) {
        super(szi0);
        this.b = Boolean.valueOf(szi0.a());
        if(szi0.a()) {
            this.d = new ArrayList();
        }
    }

    public final int a() {
        byte[] arr_b = this.e();
        this.c = arr_b;
        return arr_b == null ? 0 : arr_b.length;
    }

    public final void b(byte[] arr_b) {
        if(arr_b != null) {
            if(!this.a.a()) {
                this.c = (byte[])arr_b.clone();
                return;
            }
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            this.d = new szh().b(byteArrayInputStream0);
        }
    }

    public final void c(OutputStream outputStream0) {
        try {
            outputStream0.write(this.a.b());
            if(this.b.booleanValue()) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                for(Object object0: this.d) {
                    ((szg)object0).c(byteArrayOutputStream0);
                }
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                this.c = arr_b;
                szg.i(outputStream0, arr_b.length);
                outputStream0.write(this.c);
                return;
            }
            int v = this.c == null ? 0 : this.c.length;
            szg.i(outputStream0, v);
            if(v > 0) {
                outputStream0.write(this.c);
            }
        }
        catch(Exception exception0) {
            throw new syx("Error occurred during writing to the given steam", exception0);
        }
    }

    public final byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        this.c(byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }

    public final byte[] e() {
        try {
            if(this.a.a()) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                for(Object object0: this.d) {
                    ((szg)object0).c(byteArrayOutputStream0);
                }
                this.c = byteArrayOutputStream0.toByteArray();
                byteArrayOutputStream0.close();
            }
            return this.c == null ? null : ((byte[])this.c.clone());
        }
        catch(Exception exception0) {
            throw new syx("Error occurred", exception0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        return this.a.equals(((szg)object0).a) ? Arrays.equals(this.e(), ((szg)object0).e()) : false;
    }

    public final szg f() {
        szi szi0 = this.a;
        if(szi0.a()) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            this.c(byteArrayOutputStream0);
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArrayOutputStream0.toByteArray());
            return new szh().c(byteArrayInputStream0);
        }
        szg szg0 = new szg(new szi(szi0.a));
        szg0.b(this.e());
        return szg0;
    }

    public final void g(szg szg0) {
        if(!this.a.a()) {
            throw new IllegalArgumentException("The instance is a \'simple\' TLV object, hence it can\'t accept any component");
        }
        if(szg0 == null) {
            throw new IllegalArgumentException("The provided component is null");
        }
        this.d.add(szg0);
    }

    public final int h(szg szg0) {
        szi szi0 = this.a;
        szi szi1 = szg0.a;
        int v = 0;
        if(szi0.equals(szi1)) {
            if(szi0.a()) {
                for(Object object0: szg0) {
                    v = this.h(((szg)object0));
                }
                return v;
            }
            this.b(szg0.e());
            return 1;
        }
        if(!szi0.a()) {
            return 0;
        }
        szg szg1 = null;
        for(Object object1: this.d) {
            szg szg2 = (szg)object1;
            if(szg2.a.equals(szi1)) {
                v += szg2.h(szg0);
                szg1 = szg2;
            }
        }
        if(szg1 == null) {
            this.g(szg0.f());
            return 1;
        }
        return v;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.e());
        return this.a.hashCode() + v;
    }

    private static final void i(OutputStream outputStream0, int v) {
        byte[] arr_b1;
        byte[] arr_b;
        if(v <= 0x7F) {
            arr_b = new byte[]{((byte)v)};
        }
        else if(v <= 0xFF) {
            arr_b = new byte[]{(byte)0x81, ((byte)v)};
        }
        else {
            if(v <= 0xFFFF) {
                arr_b1 = new byte[]{(byte)0x82, ((byte)(v >> 8 & 0xFF)), ((byte)(v & 0xFF))};
            }
            else {
                arr_b1 = v > 0xFFFFFF ? new byte[]{(byte)0x84, ((byte)(v >> 24 & 0xFF)), ((byte)(v >> 16 & 0xFF)), ((byte)(v >> 8 & 0xFF)), ((byte)(v & 0xFF))} : new byte[]{(byte)0x83, ((byte)(v >> 16 & 0xFF)), ((byte)(v >> 8 & 0xFF)), ((byte)(v & 0xFF))};
            }
            arr_b = arr_b1;
        }
        outputStream0.write(arr_b);
    }

    @Override
    public final Iterator iterator() {
        if(this.b.booleanValue()) {
            return this.d.subList(0, this.d.size()).iterator();
        }
        throw new IllegalStateException("The instance is a simple TLV object");
    }

    @Override
    public final String toString() {
        return tek.b(this.d());
    }
}

