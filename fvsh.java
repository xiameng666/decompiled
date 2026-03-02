import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import jeb.synthetic.FIN;

@Deprecated
public final class fvsh {
    public final kaq a;
    public final fvsw b;

    public fvsh(File file0, fvsw fvsw0) {
        this.b = fvsw0;
        this.a = new kaq(file0);
    }

    public final MessageLite a(Parser hfvs0) {
        kaq kaq0 = this.a;
        File file0 = kaq0.c;
        if(file0.exists()) {
            kaq.a(file0, kaq0.a);
        }
        File file1 = kaq0.b;
        if(file1.exists() && kaq0.a.exists() && !file1.delete()) {
            Objects.toString(file1);
            Log.e("AtomicFile", "Failed to delete outdated new file " + file1.toString());
        }
        FileInputStream fileInputStream0 = new FileInputStream(kaq0.a);
        fvsw fvsw0 = this.b;
        int v = FIN.finallyOpen$NT();
        DataInputStream dataInputStream0 = new DataInputStream(fileInputStream0);
        int v1 = dataInputStream0.readUnsignedShort();
        if(v1 == 2) {
            MessageLite hfvm0 = hfvs0.parseFrom(fvsw0.a(dataInputStream0).b);
            FIN.finallyCodeBegin$NT(v);
            return hfvm0;
        }
        throw new IOException(String.format("Invalid version, desired = %d, actual = %d", ((int)2), v1));
    }

    public final void b(MessageLite hfvm0) {
        FileOutputStream fileOutputStream0;
        try {
            kaq kaq0 = this.a;
            File file0 = kaq0.c;
            if(file0.exists()) {
                kaq.a(file0, kaq0.a);
            }
            try {
                fileOutputStream0 = new FileOutputStream(kaq0.b);
            }
            catch(FileNotFoundException unused_ex) {
                File file1 = kaq0.b;
                if(!file1.getParentFile().mkdirs()) {
                    Objects.toString(file1);
                    throw new IOException("Failed to create directory for " + file1.toString());
                }
                try {
                    fileOutputStream0 = new FileOutputStream(file1);
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    Objects.toString(kaq0.b);
                    throw new IOException("Failed to create new file " + kaq0.b.toString(), fileNotFoundException0);
                }
            }
        }
        catch(IOException unused_ex) {
            fileOutputStream0 = null;
            goto label_30;
        }
        try {
            DataOutputStream dataOutputStream0 = new DataOutputStream(fileOutputStream0);
            dataOutputStream0.writeShort(2);
            byte[] arr_b = hfvm0.toBytesArray();
            this.b.c(dataOutputStream0, arr_b);
            kaq kaq1 = this.a;
            if(!kaq.b(fileOutputStream0)) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream0.close();
            }
            catch(IOException iOException0) {
                Log.e("AtomicFile", "Failed to close file output stream", iOException0);
            }
            kaq.a(kaq1.b, kaq1.a);
            return;
        }
        catch(IOException unused_ex) {
        }
    label_30:
        if(fileOutputStream0 != null) {
            kaq kaq2 = this.a;
            if(!kaq.b(fileOutputStream0)) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream0.close();
            }
            catch(IOException iOException1) {
                Log.e("AtomicFile", "Failed to close file output stream", iOException1);
            }
            File file2 = kaq2.b;
            if(!file2.delete()) {
                Objects.toString(file2);
                Log.e("AtomicFile", "Failed to delete new file " + file2.toString());
            }
        }
    }
}

