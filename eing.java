import com.google.android.gms.common.api.Status;

public final class eing implements azys {
    public final einq a;
    public final String b;
    public final String c;

    public eing(einq einq0, String s) {
        this.a = einq0;
        this.b = s;
        this.c = "";
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eiqf eiqf0 = new eiqf(((evqp)object1));
        fprr fprr0 = new fprr(this.a.v.getPackageManager());
        String s = this.b;
        gocn gocn0 = fprr0.b("com.google.android.gms", s);
        if(gocn0 == null) {
            eiqf0.f(new Status(0x733F), null);
            return;
        }
        ((eiqj)((eiqk)object0).H()).n(eiqf0, s, (gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0), ((String[])gocn0.i.toArray(new String[0])), gocn0.k.toByteArray(), this.c, null);
    }
}

