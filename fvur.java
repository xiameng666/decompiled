import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Deprecated
public final class fvur {
    public volatile int a;
    private final byte[] b;
    private final File c;
    private final int d;
    private final fvuq e;

    public fvur(int v, byte[] arr_b, File file0, fvuq fvuq0) {
        this.a = -1;
        this.c = file0;
        this.d = v;
        this.b = arr_b;
        this.e = fvuq0;
    }

    public fvur(byte[] arr_b, File file0) {
        this(2, arr_b, file0, new fvup());
    }

    public final MessageLite a(Parser hfvs0) {
        byte[] arr_b1;
        DataInputStream dataInputStream1;
        File file0 = this.c;
        if(file0 == null) {
            throw new IOException("Unknown file");
        }
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        byte[] arr_b = this.b;
        if(arr_b == null) {
            throw new IOException("No cipher key specified.");
        }
        DataInputStream dataInputStream0 = null;
        fvsw fvsw0 = fvsw.b(arr_b, null);
        try {
            dataInputStream1 = new DataInputStream(fileInputStream0);
        }
        catch(Throwable throwable0) {
            fyba.b(dataInputStream0);
            fyba.b(fileInputStream0);
            throw throwable0;
        }
        try {
            this.a = dataInputStream1.readUnsignedShort();
            int v = this.d;
            if(this.a != v) {
                throw new IOException(String.format("Invalid version, desired = %d, actual = %d", v, ((int)this.a)));
            }
            arr_b1 = fvsw0.a(dataInputStream1).b;
        }
        catch(Throwable throwable0) {
            dataInputStream0 = dataInputStream1;
            fyba.b(dataInputStream0);
            fyba.b(fileInputStream0);
            throw throwable0;
        }
        fyba.b(dataInputStream1);
        fyba.b(fileInputStream0);
        if(arr_b1 == null) {
            throw new IOException("Could not decrypt");
        }
        MessageLite hfvm0 = hfvs0.p(arr_b1, hftc.a());
        if(this.e.a(hfvm0)) {
            return hfvm0;
        }
        throw new IOException("Invalid file format.");
    }

    public final void b(byte[] arr_b) {
        FileOutputStream fileOutputStream0;
        File file0 = this.c;
        if(file0 != null) {
            try {
                if(!file0.exists()) {
                    file0.createNewFile();
                }
                fileOutputStream0 = new FileOutputStream(file0);
            }
            catch(Throwable throwable0) {
                fileOutputStream0 = null;
                fyba.b(fileOutputStream0);
                throw throwable0;
            }
            try {
                fileOutputStream0.write(arr_b);
            }
            catch(Throwable throwable0) {
                fyba.b(fileOutputStream0);
                throw throwable0;
            }
            fyba.b(fileOutputStream0);
        }
    }

    public final byte[] c(MessageLite hfvm0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = null;
        try {
            dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
            dataOutputStream0.writeShort(this.d);
            byte[] arr_b = this.b;
            if(arr_b == null) {
                throw new IOException("No cipher specified.");
            }
            fvsw.b(arr_b, null).c(dataOutputStream0, hfvm0.toBytesArray());
            dataOutputStream0.flush();
        }
        catch(Throwable throwable0) {
            if(dataOutputStream0 != null) {
                fyba.b(dataOutputStream0);
            }
            throw throwable0;
        }
        fyba.b(dataOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }

    @Override
    public final String toString() {
        return "SimpleProtoBufStore loading from file " + this.c;
    }
}

