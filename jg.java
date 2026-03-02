import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Xml;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import j..util.Objects;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlSerializer;

public abstract class jg {
    static final je a;
    public static int b;
    public static jzd c;
    public static jzd d;
    public static boolean e;
    public static final bxf f;
    public static final Object g;
    private static Boolean h;
    private static final Object i;

    static {
        jg.a = new je(new jf());
        jg.b = -100;
        jg.c = null;
        jg.d = null;
        jg.h = null;
        jg.e = false;
        jg.f = new bxf();
        jg.g = new Object();
        jg.i = new Object();
    }

    public abstract void A();

    public abstract void B(int arg1);

    public Context a() {
        throw null;
    }

    public abstract im b();

    public abstract MenuInflater c();

    public abstract View d(int arg1);

    static Object e() {
        bxe bxe0 = new bxe(jg.f);
        while(bxe0.hasNext()) {
            Object object0 = bxe0.next();
            jg jg0 = (jg)((WeakReference)object0).get();
            if(jg0 != null) {
                Context context0 = jg0.a();
                if(context0 != null) {
                    return context0.getSystemService("locale");
                }
            }
        }
        return null;
    }

    public abstract void f(View arg1, ViewGroup.LayoutParams arg2);

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public static void m(jg jg0) {
        synchronized(jg.g) {
            bxe bxe0 = new bxe(jg.f);
            while(bxe0.hasNext()) {
                Object object1 = bxe0.next();
                jg jg1 = (jg)((WeakReference)object1).get();
                if(jg1 == jg0 || jg1 == null) {
                    bxe0.remove();
                }
            }
        }
    }

    public static void n(jzd jzd0) {
        Objects.requireNonNull(jzd0);
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = jg.e();
            if(object0 != null) {
                jc.a(object0, LocaleList.forLanguageTags(jzd0.f()));
            }
        }
        else if(!jzd0.equals(jg.c)) {
            synchronized(jg.g) {
                jg.c = jzd0;
                bxe bxe0 = new bxe(jg.f);
                while(bxe0.hasNext()) {
                    Object object2 = bxe0.next();
                    jg jg0 = (jg)((WeakReference)object2).get();
                    if(jg0 != null) {
                        jg0.x();
                    }
                }
            }
        }
    }

    public abstract void o(int arg1);

    public abstract void p(View arg1);

    public abstract void q(View arg1, ViewGroup.LayoutParams arg2);

    public static void r(int v) {
        if(jg.b != v) {
            jg.b = v;
            Object object0 = jg.g;
            synchronized(object0) {
                bxe bxe0 = new bxe(jg.f);
                while(bxe0.hasNext()) {
                    Object object1 = bxe0.next();
                    jg jg0 = (jg)((WeakReference)object1).get();
                    if(jg0 != null) {
                        jg0.y();
                    }
                }
            }
        }
    }

    public abstract void s(int arg1);

    public abstract void t(Toolbar arg1);

    public abstract void u(CharSequence arg1);

    static void v(Context context0) {
        XmlSerializer xmlSerializer0;
        FileOutputStream fileOutputStream0;
        Object object1;
        String s;
        Object object0;
        if(jg.w(context0)) {
            if(Build.VERSION.SDK_INT < 33) {
                object0 = jg.i;
                synchronized(object0) {
                    jzd jzd0 = jg.c;
                    if(jzd0 == null) {
                        if(jg.d == null) {
                            jg.d = jzd.c(jtw.a(context0));
                        }
                        if(!jg.d.h()) {
                            jg.c = jg.d;
                            goto label_54;
                        }
                        __monitor_exit(object0);
                        return;
                    }
                    else {
                        goto label_17;
                    }
                    goto label_54;
                }
                __monitor_exit(object0);
                return;
                try {
                label_17:
                    if(!jzd0.equals(jg.d)) {
                        jg.d = jg.c;
                        s = jg.c.f();
                        object1 = jtw.a;
                        __monitor_enter(object1);
                        goto label_22;
                    }
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    throw throwable0;
                }
                try {
                label_22:
                    if(s.equals("")) {
                        context0.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                        goto label_28;
                    }
                    else {
                        try {
                            fileOutputStream0 = context0.openFileOutput("android.support.v7.app.AppCompatDelegate.application_locales_record_file", 0);
                            goto label_30;
                        }
                        catch(FileNotFoundException unused_ex) {
                            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "android.support.v7.app.AppCompatDelegate.application_locales_record_file"));
                            goto label_28;
                        }
                    }
                    goto label_54;
                }
                catch(Throwable throwable1) {
                    goto label_51;
                }
                try {
                label_28:
                    __monitor_exit(object1);
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    throw throwable0;
                }
                try {
                label_30:
                    xmlSerializer0 = Xml.newSerializer();
                }
                catch(Throwable throwable1) {
                    goto label_51;
                }
                try {
                    try {
                        xmlSerializer0.setOutput(fileOutputStream0, null);
                        xmlSerializer0.startDocument("UTF-8", Boolean.valueOf(true));
                        xmlSerializer0.startTag(null, "locales");
                        xmlSerializer0.attribute(null, "application_locales", s);
                        xmlSerializer0.endTag(null, "locales");
                        xmlSerializer0.endDocument();
                        goto label_47;
                    }
                    catch(Exception exception0) {
                    }
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", exception0);
                    if(fileOutputStream0 != null) {
                        goto label_41;
                    }
                    goto label_53;
                }
                catch(Throwable throwable2) {
                    goto label_44;
                }
                try {
                label_41:
                    fileOutputStream0.close();
                    goto label_53;
                }
                catch(IOException unused_ex) {
                    goto label_53;
                }
                catch(Throwable throwable1) {
                    goto label_51;
                }
            label_44:
                if(fileOutputStream0 != null) {
                    try {
                        try {
                            fileOutputStream0.close();
                        }
                        catch(IOException unused_ex) {
                        }
                        throw throwable2;
                    }
                    catch(Throwable throwable1) {
                        goto label_51;
                    }
                }
                throw throwable2;
            label_47:
                if(fileOutputStream0 != null) {
                    try {
                        fileOutputStream0.close();
                        goto label_53;
                    }
                    catch(IOException unused_ex) {
                        goto label_53;
                    }
                    catch(Throwable throwable1) {
                    }
                    try {
                    label_51:
                        __monitor_exit(object1);
                        throw throwable1;
                    label_53:
                        __monitor_exit(object1);
                        goto label_54;
                    }
                    catch(Throwable throwable0) {
                        __monitor_exit(object0);
                        throw throwable0;
                    }
                }
                goto label_53;
            label_54:
                __monitor_exit(object0);
            }
            else if(!jg.e) {
                jb jb0 = new jb(context0);
                jg.a.execute(jb0);
                return;
            }
        }
        try {
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    }

    static boolean w(Context context0) {
        if(jg.h == null) {
            try {
                ServiceInfo serviceInfo0 = context0.getPackageManager().getServiceInfo(new ComponentName(context0, kf.class), 640);
                if(serviceInfo0.metaData != null) {
                    jg.h = Boolean.valueOf(serviceInfo0.metaData.getBoolean("autoStoreLocales"));
                    return jg.h.booleanValue();
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                jg.h = Boolean.valueOf(false);
            }
        }
        return jg.h.booleanValue();
    }

    public void x() {
        throw null;
    }

    public abstract void y();

    public abstract void z();
}

