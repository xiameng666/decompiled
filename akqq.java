import android.content.Context;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class akqq {
    private static akqq a;
    private final akiv b;
    private final yuv c;

    private akqq(Context context0) {
        akiw akiw0 = new akiw(context0);
        akiw0.a.b = new akik();
        yuv yuv0 = new yuv(akiw0.a);
        this.c = yuv0;
        this.b = new akiv(yuv0);
    }

    public static akqq a(Context context0) {
        synchronized(akqq.class) {
            if(akqq.a == null) {
                akqq.a = new akqq(context0);
            }
        }
        return akqq.a;
    }

    public final boolean b(Context context0, String s) {
        try {
            akiv akiv0 = this.b;
            ywh ywh0 = akiv0.a;
            akit akit0 = ywh0.k().a().a() ? new akin(akir.a(((yuv)ywh0).a)) : akiv0.a();
            UserHandle userHandle0 = (UserHandle)akit0.a().get(1000L, TimeUnit.MILLISECONDS);
            if(userHandle0 == null) {
                return false;
            }
            akit akit1 = akiv0.a();
            Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
            BundlerType bundlerType0 = BundlerType.a("android.os.UserHandle");
            akir.b.c(bundle0, "workProfileUserHandle", userHandle0, bundlerType0);
            BundlerType bundlerType1 = BundlerType.b("java.util.List", new BundlerType[]{BundlerType.a("java.lang.String")});
            yvy yvy0 = new yvy(akir.b, bundlerType1);
            ((akis)akit1).a.b().v(0xDF8D8B7CC8D3D7E0L, 1, bundle0, yvy0, yvy0.c);
            Iterator iterator0 = ((List)yvy0.c.v(1000L, TimeUnit.MILLISECONDS)).iterator();
            while(true) {
            label_17:
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                if(!s1.endsWith("@gmail.com") && s1.equals(s.toLowerCase(Locale.getDefault()))) {
                    akrd.a(context0).i(29);
                    return true;
                }
            }
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Log.e("AuthManagedCrossProfile", "Unable to check existence of accounts across profiles on device", exception0);
            return false;
        }
        goto label_17;
    }
}

