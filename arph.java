import java.io.File;
import java.io.FileNotFoundException;

public final class arph implements Runnable {
    public final arpn a;
    public final File b;
    public final arli c;

    public arph(arpn arpn0, File file0, arli arli0) {
        this.a = arpn0;
        this.b = file0;
        this.c = arli0;
    }

    @Override
    public final void run() {
        arot.a.d("sendFile", new Object[0]);
        try {
            cuwu cuwu0 = cuwu.c(this.b);
            this.a.e.e.put(cuwu0.i, this.c);
            this.a.e.d(cuwu0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            arot.a.i("Unable to find the file", fileNotFoundException0, new Object[0]);
        }
    }
}

