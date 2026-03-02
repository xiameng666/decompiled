import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dvlt {
    public final Context a;
    public final dvma b;
    public final dvmd c;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dvlt(Context context0, dvma dvma0, dvmd dvmd0) {
        this.a = context0;
        this.b = dvma0;
        this.c = dvmd0;
    }

    public final String a(File file0) {
        ibuq.f(file0, "file");
        return String.valueOf(file0.getAbsolutePath().hashCode());
    }

    public final List b(String s) {
        File file0 = this.b.d(s, this.a);
        if(file0.exists() && file0.listFiles() != null) {
            File[] arr_file = file0.listFiles();
            if(arr_file == null || arr_file.length != 0) {
                File[] arr_file1 = file0.listFiles();
                if(arr_file1 == null) {
                    arr_file1 = new File[0];
                }
                List list0 = new ArrayList();
                for(int v = 0; v < arr_file1.length; ++v) {
                    File file1 = arr_file1[v];
                    if(!file1.isDirectory()) {
                        String s1 = file1.getName();
                        ibuq.e(s1, "getName(...)");
                        if(ibzk.W(s1, s)) {
                            list0.add(file1);
                        }
                    }
                }
                return list0;
            }
        }
        return ibps.a;
    }

    public static final int c(String s, String s1) {
        try {
            return Integer.parseInt(ibzk.Q(s1, s, ""));
        }
        catch(NumberFormatException numberFormatException0) {
            String s2 = String.format("Unable to find index from the file name: %s for valuable %s", Arrays.copyOf(new Object[]{s1, s}, 2));
            ibuq.e(s2, "format(...)");
            throw new gfuz(s2, numberFormatException0);
        }
    }
}

