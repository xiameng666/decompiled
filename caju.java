import android.content.ComponentName;
import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public final class caju {
    public static final bboh a;
    public static final Object b;
    public final Context c;

    static {
        caju.a = bboh.b("GmscoreIpa", bbcu.ee);
        caju.b = new Object();
    }

    public caju(Context context0) {
        this.c = context0;
    }

    public final Set a() {
        BufferedReader bufferedReader1;
        BufferedReader bufferedReader0;
        Set set0 = new HashSet();
        Object object0 = caju.b;
        __monitor_enter(object0);
        try {
            bufferedReader0 = null;
            try {
                bufferedReader1 = new BufferedReader(new FileReader(this.c.getFileStreamPath("apps_3p_corpus_component_names.txt")));
                goto label_8;
            }
            catch(IOException iOException0) {
            }
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        goto label_16;
        try {
            while(true) {
            label_8:
                String s = bufferedReader1.readLine();
                if(s == null) {
                    goto label_28;
                }
                ComponentName componentName0 = ComponentName.unflattenFromString(s);
                if(componentName0 != null) {
                    set0.add(componentName0);
                }
            }
        }
        catch(IOException iOException0) {
            bufferedReader0 = bufferedReader1;
            try {
            label_16:
                a.e(caju.a.i(), "Failed to read from component name file %s", "apps_3p_corpus_component_names.txt", iOException0);
            }
            catch(Throwable throwable0) {
                goto label_25;
            }
            if(bufferedReader0 != null) {
                try {
                    bufferedReader0.close();
                }
                catch(IOException unused_ex) {
                }
                catch(Throwable throwable1) {
                    __monitor_exit(object0);
                    throw throwable1;
                }
            }
            goto label_33;
        }
        catch(Throwable throwable0) {
            bufferedReader0 = bufferedReader1;
        }
    label_25:
        if(bufferedReader0 != null) {
            try {
                try {
                    bufferedReader0.close();
                }
                catch(IOException unused_ex) {
                }
                throw throwable0;
                try {
                label_28:
                    bufferedReader1.close();
                }
                catch(IOException unused_ex) {
                }
                goto label_33;
            }
            catch(Throwable throwable1) {
                __monitor_exit(object0);
                throw throwable1;
            }
        }
        throw throwable0;
    label_33:
        __monitor_exit(object0);
        return set0;
    }

    public final void b(Iterable iterable0) {
        File file1;
        PrintWriter printWriter1;
        File file0;
        PrintWriter printWriter0;
        Object object0 = caju.b;
        __monitor_enter(object0);
        try {
            printWriter0 = null;
            try {
                file0 = File.createTempFile("tmp", "apps_3p_corpus_component_names.txt");
                printWriter1 = new PrintWriter(new BufferedWriter(new FileWriter(file0, false)));
                goto label_8;
            }
            catch(IOException iOException0) {
            }
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        goto label_25;
        try {
        label_8:
            for(Object object1: iterable0) {
                printWriter1.println(((ComponentName)object1).flattenToString());
            }
            printWriter1.close();
            file1 = this.c.getFileStreamPath("apps_3p_corpus_component_names.txt");
            __monitor_enter(object0);
        }
        catch(IOException iOException0) {
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
        try {
            file0.renameTo(file1);
            goto label_21;
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            label_21:
                __monitor_exit(object0);
                goto label_37;
            }
            catch(IOException iOException0) {
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
        }
    label_24:
        printWriter0 = printWriter1;
        try {
        label_25:
            a.ae(caju.a.i(), "Failed to open Apps corpus file.", iOException0);
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        if(printWriter0 != null) {
            try {
                printWriter0.close();
                goto label_42;
            }
            catch(RuntimeException unused_ex) {
                goto label_42;
            }
            catch(Throwable throwable2) {
                __monitor_exit(object0);
                throw throwable2;
            }
        label_33:
            printWriter0 = printWriter1;
        label_34:
            if(printWriter0 != null) {
                try {
                    try {
                        printWriter0.close();
                    }
                    catch(RuntimeException unused_ex) {
                    }
                    throw throwable0;
                    try {
                    label_37:
                        printWriter1.close();
                    }
                    catch(RuntimeException unused_ex) {
                    }
                    goto label_42;
                }
                catch(Throwable throwable2) {
                    __monitor_exit(object0);
                    throw throwable2;
                }
            }
            throw throwable0;
        }
    label_42:
        __monitor_exit(object0);
    }
}

