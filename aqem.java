import android.os.ParcelFileDescriptor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public final class aqem {
    public static List a(ParcelFileDescriptor parcelFileDescriptor0) {
        List list0 = new ArrayList();
        try(DataInputStream dataInputStream0 = new DataInputStream(new BufferedInputStream(new FileInputStream(parcelFileDescriptor0.getFileDescriptor())))) {
            try {
                while(true) {
                    String s = dataInputStream0.readUTF();
                    int v = dataInputStream0.readInt();
                    int v1 = Math.max(v, 0);
                    byte[] arr_b = new byte[v1];
                    dataInputStream0.read(arr_b, 0, v1);
                    list0.add(aqen.a(s, v, arr_b));
                }
            }
            catch(EOFException unused_ex) {
                return list0;
            }
        }
    }

    public static void b(aqen aqen0, ParcelFileDescriptor parcelFileDescriptor0) {
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(parcelFileDescriptor0.getFileDescriptor())))) {
            dataOutputStream0.writeUTF(aqen0.a);
            dataOutputStream0.writeInt(aqen0.b);
            dataOutputStream0.write(glwl.e(aqen0.c), 0, Math.max(aqen0.b, 0));
        }
    }
}

