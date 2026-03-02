import android.os.Environment;
import java.io.File;
import java.io.IOException;

public final class dgmr {
    public static final void a(dgfc dgfc0) {
        for(Object object0: dgfc0.i()) {
            long v = ((Number)object0).longValue();
            if(dgfc0.j(v)) {
                cuws cuws0 = dgfc0.e(v).l;
                if(cuws0 != null) {
                    File file0 = cuws0.a;
                    if(file0 != null) {
                        file0.delete();
                    }
                }
            }
        }
    }

    public static final File b(String s, String s1, String s2, File file0) {
        String s4;
        File file2;
        File file1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if(s != null) {
            file1 = hrnt.i() ? new File(ccsb.a.b(file1, s)) : new File(file1, s);
        }
        if(s1 == null) {
            file2 = hrnt.i() ? new File(ccsb.a.b(file1, s2)) : new File(file1, s2);
        }
        else if(hrnt.i()) {
            file2 = new File(ccsb.a.d(ccsb.a.b(file1, s1), s2));
        }
        else {
            file2 = new File(new File(file1, s1), s2);
        }
        String s3 = file2.getName();
        ibuq.e(s3, "getName(...)");
        int v = ibzk.ae(s3, ".");
        if(v == -1) {
            s4 = file2.getName();
        }
        else {
            String s5 = file2.getName();
            ibuq.e(s5, "getName(...)");
            s4 = s5.substring(0, v);
            ibuq.e(s4, "substring(...)");
        }
        ibuq.c(s4);
        if(ibuq.m(file0.getParent(), file2.getParent())) {
            String s6 = file0.getName();
            ibuq.e(s6, "getName(...)");
            if(ibzk.W(s6, s4)) {
                return file0;
            }
        }
        try {
            File file3 = cuua.c(file2);
            if(!djad.u(file0, file3)) {
                dcvz.a.b().p("Rename file failed, try to copy.", new Object[0]);
                djad.p(file0, file3);
            }
            return file3;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public static final void c(ichm ichm0, Object object0) {
        Object object1 = ichm0.b(object0);
        if((object1 instanceof icgz)) {
            Throwable throwable0 = icha.b(object1);
            dcvz.a.e().f(throwable0).h("Channel closed when sending %s", object0);
        }
    }
}

