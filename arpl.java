import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

public final class arpl implements Runnable {
    public final arpn a;
    public final File b;
    public final long c;
    public final arli d;

    public arpl(arpn arpn0, File file0, long v, arli arli0) {
        this.a = arpn0;
        this.b = file0;
        this.c = v;
        this.d = arli0;
    }

    @Override
    public final void run() {
        arot.a.d("sendFileWithPayloadId, payloadId=%d", new Object[]{((long)this.c)});
        arli arli0 = this.d;
        try {
            ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.open(this.b, 0x10000000);
            long v = this.b.length();
            Uri uri0 = Uri.fromFile(this.b);
            cuwu cuwu0 = cuwu.e(cuws.a(this.b, parcelFileDescriptor0, v, uri0), this.c);
            this.a.e.e.put(cuwu0.i, arli0);
            this.a.e.d(cuwu0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            arot.a.i("Unable to find the file", fileNotFoundException0, new Object[0]);
            arli0.a(3);
        }
    }
}

