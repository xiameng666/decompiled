import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class kaq {
    public final File a;
    public final File b;
    public final File c;

    public kaq(File file0) {
        this.a = file0;
        this.b = new File(file0.getPath() + ".new");
        this.c = new File(file0.getPath() + ".bak");
    }

    public static void a(File file0, File file1) {
        if(file1.isDirectory() && !file1.delete()) {
            Objects.toString(file1);
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file1.toString());
        }
        if(!file0.renameTo(file1)) {
            Log.e("AtomicFile", a.m(file1, file0, "Failed to rename ", " to "));
        }
    }

    public static boolean b(FileOutputStream fileOutputStream0) {
        try {
            fileOutputStream0.getFD().sync();
            return true;
        }
        catch(IOException unused_ex) {
            return false;
        }
    }
}

