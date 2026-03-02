import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class tfe extends tez implements Serializable, Iterable {
    private byte[] b;
    private List c;
    private final Boolean d;

    public tfe(tfg tfg0) {
        super(tfg0);
        this.d = Boolean.valueOf(tfg0.a());
        if(tfg0.a()) {
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
            this.c = new tff().b(byteArrayInputStream0);
        }
    }

    public final void b(OutputStream outputStream0) {
        try {
            outputStream0.write(this.a.b());
            if(this.d.booleanValue()) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                for(Object object0: this.c) {
                    ((tfe)object0).b(byteArrayOutputStream0);
                }
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                this.b = arr_b;
                tfe.i(outputStream0, arr_b.length);
                outputStream0.write(this.b);
                return;
            }
            int v = this.b == null ? 0 : this.b.length;
            tfe.i(outputStream0, v);
            if(v > 0) {
                outputStream0.write(this.b);
            }
        }
        catch(Exception exception0) {
            throw new tev("Error occurred during writing to the given steam", exception0);
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
                    ((tfe)object0).b(byteArrayOutputStream0);
                }
                this.b = byteArrayOutputStream0.toByteArray();
                byteArrayOutputStream0.close();
            }
            return this.b == null ? null : ((byte[])this.b.clone());
        }
        catch(Exception exception0) {
            throw new tev("Error occurred", exception0);
        }
    }

    public final tfe e() {
        tfg tfg0 = this.a;
        if(tfg0.a()) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            this.b(byteArrayOutputStream0);
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArrayOutputStream0.toByteArray());
            return new tff().c(byteArrayInputStream0);
        }
        tfe tfe0 = new tfe(new tfg(tfg0.a));
        tfe0.a(this.d());
        return tfe0;
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
        return this.a.equals(((tfe)object0).a) ? Arrays.equals(this.d(), ((tfe)object0).d()) : false;
    }

    public final Iterator f(tfg tfg0) {
        if(this.d.booleanValue()) {
            return new tfa(this.iterator(), tfg0);
        }
        throw new IllegalArgumentException("Instance is not a constructed TLV object.");
    }

    public final void g(tfe tfe0) {
        if(!this.a.a()) {
            throw new IllegalArgumentException("The instance is a \'simple\' TLV object, hence it can\'t accept any component");
        }
        if(tfe0 == null) {
            throw new IllegalArgumentException("The provided component is null");
        }
        this.c.add(tfe0);
    }

    public final int h(tfe tfe0) {
        tfg tfg0 = this.a;
        tfg tfg1 = tfe0.a;
        int v = 0;
        if(tfg0.equals(tfg1)) {
            if(tfg0.a()) {
                for(Object object0: tfe0) {
                    v = this.h(((tfe)object0));
                }
                return v;
            }
            this.a(tfe0.d());
            return 1;
        }
        if(!tfg0.a()) {
            return 0;
        }
        tfe tfe1 = null;
        for(Object object1: this.c) {
            tfe tfe2 = (tfe)object1;
            if(tfe2.a.equals(tfg1)) {
                v += tfe2.h(tfe0);
                tfe1 = tfe2;
            }
        }
        if(tfe1 == null) {
            this.g(tfe0.e());
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
        return tjs.b(this.c());
    }
}

