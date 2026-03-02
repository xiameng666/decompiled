import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;

public final class ccdp {
    private static final Object a;
    private static volatile ccdm b;

    static {
        ccdp.a = new Object();
    }

    public static IInterface a(Context context0, String s, ccdo ccdo0) {
        IBinder iBinder0;
        if(ccdp.b == null) {
            synchronized(ccdp.a) {
                if(ccdp.b == null) {
                    ccdp.b = ccdp.b(context0);
                }
            }
        }
        try {
            synchronized(ccdm.a) {
                if(ccdm.b == null) {
                    try {
                        ccdm.b = bjia.f(context0, bjia.a, "com.google.android.gms.brella_dynamite");
                        ccdm.a(context0, true);
                    }
                    catch(bjhw bjhw1) {
                        ccdm.a(context0, false);
                        ccdm.c = true;
                        throw bjhw1;
                    }
                }
            }
            iBinder0 = ccdm.b.e(s);
        }
        catch(bjhw bjhw0) {
            throw new ccdn("Couldn\'t load impl " + s + ": " + bjhw0.getMessage(), bjhw0);
        }
        IInterface iInterface0 = iBinder0 == null ? null : ccdo0.a(iBinder0);
        if(iInterface0 != null) {
            return iInterface0;
        }
        throw new ccdn("null impl for " + s);
    }

    private static ccdm b(Context context0) {
        Class class1;
        Class class0;
        try {
            class0 = ccdp.class;
            class1 = class0.getClassLoader().loadClass("com.google.android.gms.learning.internal.dynamite.FatDynamiteLoader");
        }
        catch(ClassNotFoundException unused_ex) {
            try {
                class1 = class0.getClassLoader().loadClass("ccdm");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new ccdn("No dynamite loader found: " + classNotFoundException0.getMessage(), classNotFoundException0);
            }
        }
        try {
            return (ccdm)class1.getConstructor(Context.class).newInstance(context0);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException exception0) {
            throw new ccdn("Failed to create dynamite loader instance: " + ((ReflectiveOperationException)exception0).getMessage(), exception0);
        }
    }
}

