import androidx.window.extensions.layout.WindowLayoutComponent;

public final class qfi implements ibth {
    @Override  // ibth
    public final Object a() {
        try {
            ClassLoader classLoader0 = qfk.class.getClassLoader();
            qfg qfg0 = classLoader0 == null ? null : new qfg(classLoader0, new pzq(classLoader0));
            if(qfg0 != null) {
                WindowLayoutComponent windowLayoutComponent0 = qfg0.a();
                if(windowLayoutComponent0 != null) {
                    pzq pzq0 = new pzq(classLoader0);
                    int v = pzr.a();
                    if(v >= 9) {
                        return new qgg(windowLayoutComponent0, pzq0);
                    }
                    if(v >= 6) {
                        return new qgg(windowLayoutComponent0, pzq0);
                    }
                    if(v >= 2) {
                        return new qgg(windowLayoutComponent0, pzq0);
                    }
                    return v == 1 ? new qgf(windowLayoutComponent0, pzq0) : new qgd();
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

