import android.media.MediaScannerConnection;
import com.google.android.gms.nearby.sharing.FileAttachment;
import java.io.File;

public final class dfvz implements Runnable {
    public final dfzz a;
    public final File b;
    public final FileAttachment c;

    public dfvz(dfzz dfzz0, File file0, FileAttachment fileAttachment0) {
        this.a = dfzz0;
        this.b = file0;
        this.c = fileAttachment0;
    }

    @Override
    public final void run() {
        dfyj dfyj0 = new dfyj(this.a);
        MediaScannerConnection.scanFile(this.a.i, new String[]{this.b.toString()}, new String[]{this.c.f}, dfyj0);
    }
}

