import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class esom implements Runnable {
    public final Bitmap a;
    public final File b;

    public esom(Bitmap bitmap0, File file0) {
        this.a = bitmap0;
        this.b = file0;
    }

    @Override
    public final void run() {
        File file0 = this.b;
        Bitmap bitmap0 = this.a;
        if(bitmap0 == null) {
            ((ggtj)espb.a.j()).x("Failed to save card image to file because bitmap is missing.");
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            bitmap0.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream0);
            try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                byteArrayOutputStream0.writeTo(fileOutputStream0);
            }
        }
        catch(IOException iOException0) {
            a.ae(espb.a.j(), "Failed to save card image to file.", iOException0);
        }
    }
}

