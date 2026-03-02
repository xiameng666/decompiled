import android.content.ContentProvider.PipeDataWriter;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

final class egle implements ContentProvider.PipeDataWriter {
    final ProtoLiteBuilder a;

    public egle(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // android.content.ContentProvider$PipeDataWriter
    public final void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor0, Uri uri0, String s, Bundle bundle0, Object object0) {
        byte[] arr_b;
        FileOutputStream fileOutputStream0;
        InputStream inputStream0 = (InputStream)object0;
        try {
            fileOutputStream0 = new FileOutputStream(parcelFileDescriptor0.getFileDescriptor());
        }
        catch(IOException unused_ex) {
            goto label_43;
        }
        try {
            if(inputStream0 == null) {
                egig.b("Gal2ProviderPhotoImpl", "Input stream cannot be null.");
            }
            else {
                arr_b = new byte[0x400];
                long v = System.currentTimeMillis();
                goto label_7;
            }
            goto label_41;
        }
        catch(Throwable throwable0) {
            goto label_39;
        }
        while(true) {
            try {
                try {
                label_7:
                    int v1 = inputStream0.read(arr_b);
                    if(v1 == -1) {
                        goto label_33;
                    }
                    fileOutputStream0.write(arr_b, 0, v1);
                    if(System.currentTimeMillis() - v > TimeUnit.SECONDS.toMillis(hxdy.e())) {
                        ProtoLiteBuilder hftp0 = this.a;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gipi)hftp0.b_message).d = 12;
                        ((gipi)hftp0.b_message).b |= 2;
                        egig.b("Gal2ProviderPhotoImpl", "openFile timed out");
                        goto label_33;
                    }
                }
                catch(IOException iOException0) {
                    ProtoLiteBuilder hftp1 = this.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gipi)hftp1.b_message).d = 13;
                    ((gipi)hftp1.b_message).b |= 2;
                    egig.c("Gal2ProviderPhotoImpl", "read photo data exception: ", iOException0);
                    goto label_33;
                }
            }
            catch(Throwable throwable1) {
                try {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException1) {
                        egig.c("Gal2ProviderPhotoImpl", "Unable to close input stream", iOException1);
                    }
                    throw throwable1;
                    try {
                    label_33:
                        inputStream0.close();
                    }
                    catch(IOException iOException2) {
                        egig.c("Gal2ProviderPhotoImpl", "Unable to close input stream", iOException2);
                    }
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
        }
        try {
        label_39:
            TWR.safeClose$NT(fileOutputStream0, throwable0);
            throw throwable0;
        label_41:
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
        label_43:
            egig.b("Gal2ProviderPhotoImpl", "Unable to close output stream");
        }
    }
}

