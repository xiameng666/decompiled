import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import jeb.synthetic.TWR;

public final class ehfz {
    private final ehbp a;

    public ehfz(ehbp ehbp0) {
        this.a = ehbp0;
    }

    public final byte[] a(Uri uri0) {
        byte[] arr_b1;
        AssetFileDescriptor assetFileDescriptor0 = this.a.a.openAssetFileDescriptor(uri0, "r");
        if(assetFileDescriptor0 != null) {
            try {
                FileInputStream fileInputStream0 = assetFileDescriptor0.createInputStream();
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                byte[] arr_b = new byte[0x1000];
                int v;
                while((v = fileInputStream0.read(arr_b)) != -1) {
                    byteArrayOutputStream0.write(arr_b, 0, v);
                }
                byteArrayOutputStream0.flush();
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(assetFileDescriptor0, throwable0);
                throw throwable0;
            }
            assetFileDescriptor0.close();
            return arr_b1;
        }
        return null;
    }
}

