import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class iaqf {
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final List e;

    public iaqf(Class class0, ClassLoader classLoader0) {
        Class class1 = class0.asSubclass(gdwp.class);
        this.a = class1;
        this.d = class1.getMethod("getScopes", null);
        Method method0 = Class.forName("gdxe", false, classLoader0).asSubclass(gdwp.class).getDeclaredMethod("newBuilder", null);
        this.b = method0;
        Class class2 = method0.getReturnType();
        this.c = class2.getMethod("build", null);
        ArrayList arrayList0 = new ArrayList();
        this.e = arrayList0;
        Method method1 = class1.getMethod("getClientId", null);
        arrayList0.add(new iaqg(method1, class2.getMethod("setClientId", method1.getReturnType())));
        Method method2 = class1.getMethod("getClientEmail", null);
        arrayList0.add(new iaqg(method2, class2.getMethod("setClientEmail", method2.getReturnType())));
        Method method3 = class1.getMethod("getPrivateKey", null);
        arrayList0.add(new iaqg(method3, class2.getMethod("setPrivateKey", method3.getReturnType())));
        Method method4 = class1.getMethod("getPrivateKeyId", null);
        arrayList0.add(new iaqg(method4, class2.getMethod("setPrivateKeyId", method4.getReturnType())));
        Method method5 = class1.getMethod("getQuotaProjectId", null);
        arrayList0.add(new iaqg(method5, class2.getMethod("setQuotaProjectId", method5.getReturnType())));
    }
}

