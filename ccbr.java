import android.content.Context;
import java.io.File;

public final class ccbr {
    public final Context a;

    public ccbr(Context context0) {
        this.a = context0;
    }

    public final long a() {
        return this.a.getFilesDir().getUsableSpace();
    }

    public static boolean b(File file0) {
        if(file0.isFile()) {
            return file0.delete();
        }
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            int v = 1;
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                v &= ccbr.b(arr_file[v1]);
            }
            return file0.delete() && v != 0;
        }
        return true;
    }
}

