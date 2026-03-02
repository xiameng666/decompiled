import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class syd extends sxy implements Serializable, Iterable {
    private byte[] b;
    private List c;
    private final Boolean d;

    public syd(syf syf0) {
        super(syf0);
        this.d = Boolean.valueOf(syf0.a());
        if(syf0.a()) {
            this.c = new ArrayList();
        }
    }

    public final void a(byte[] arr_b) {
        if(arr_b != null) {
            if(!this.a.a()) {
                this.b = (byte[])arr_b.clone();
                return;
            }
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            this.c = new sye().b(byteArrayInputStream0);
        }
    }

    public final void b(OutputStream outputStream0) {
        try {
            outputStream0.write(this.a.b());
            if(this.d.booleanValue()) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                for(Object object0: this.c) {
                    ((syd)object0).b(byteArrayOutputStream0);
                }
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                this.b = arr_b;
                syd.i(outputStream0, arr_b.length);
                outputStream0.write(this.b);
                return;
            }
            int v = this.b == null ? 0 : this.b.length;
            syd.i(outputStream0, v);
            if(v > 0) {
                outputStream0.write(this.b);
            }
        }
        catch(Exception exception0) {
            throw new sxu("Error occurred during writing to the given steam", exception0);
        }
    }

    public final byte[] c() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        this.b(byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }

    public final byte[] d() {
        try {
            if(this.a.a()) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                for(Object object0: this.c) {
                    ((syd)object0).b(byteArrayOutputStream0);
                }
                this.b = byteArrayOutputStream0.toByteArray();
                byteArrayOutputStream0.close();
            }
            return this.b == null ? null : ((byte[])this.b.clone());
        }
        catch(Exception exception0) {
            throw new sxu("Error occurred", exception0);
        }
    }

    public final syd e() {
        syf syf0 = this.a;
        if(syf0.a()) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            this.b(byteArrayOutputStream0);
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArrayOutputStream0.toByteArray());
            return new sye().c(byteArrayInputStream0);
        }
        syd syd0 = new syd(new syf(syf0.a));
        syd0.a(this.d());
        return syd0;
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
        return this.a.equals(((syd)object0).a) ? Arrays.equals(this.d(), ((syd)object0).d()) : false;
    }

    public final Iterator f(syf syf0) {
        if(this.d.booleanValue()) {
            return new sxz(this.iterator(), syf0);
        }
        throw new IllegalArgumentException("Instance is not a constructed TLV object.");
    }

    public final void g(syd syd0) {
        if(!this.a.a()) {
            throw new IllegalArgumentException("The instance is a \'simple\' TLV object, hence it can\'t accept any component");
        }
        if(syd0 == null) {
            throw new IllegalArgumentException("The provided component is null");
        }
        this.c.add(syd0);
    }

    public final int h(syd syd0) {
        syf syf0 = this.a;
        syf syf1 = syd0.a;
        int v = 0;
        if(syf0.equals(syf1)) {
            if(syf0.a()) {
                for(Object object0: syd0) {
                    v = this.h(((syd)object0));
                }
                return v;
            }
            this.a(syd0.d());
            return 1;
        }
        if(!syf0.a()) {
            return 0;
        }
        syd syd1 = null;
        for(Object object1: this.c) {
            syd syd2 = (syd)object1;
            if(syd2.a.equals(syf1)) {
                v += syd2.h(syd0);
                syd1 = syd2;
            }
        }
        if(syd1 == null) {
            this.g(syd0.e());
            return 1;
        }
        return v;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.d());
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
        if(this.d.booleanValue()) {
            return this.c.subList(0, this.c.size()).iterator();
        }
        throw new IllegalStateException("The instance is a simple TLV object");
    }

    @Override
    public final String toString() {
        return twz.b(this.c());
    }
}

