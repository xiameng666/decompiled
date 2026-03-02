package j$.nio.file;

import j..adapter.b;
import j..nio.file.spi.c;
import java.security.PrivilegedAction;

public final class j implements PrivilegedAction {
    @Override
    public final Object run() {
        Object object0 = b.a;
        String s = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if(s != null) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                try {
                    object0 = (c)Class.forName(s1, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(c.class).newInstance(object0);
                    if(!((c)object0).l().equals("file")) {
                        throw new Error("Default provider must use scheme \'file\'");
                    }
                }
                catch(Exception exception0) {
                    throw new Error(exception0);
                }
            }
        }
        return object0;
    }
}

