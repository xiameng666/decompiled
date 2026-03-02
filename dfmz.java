import android.accounts.Account;
import com.google.android.gms.nearby.sharing.DeviceVisibility;

final class dfmz implements ibtx {
    final boolean a;
    final String b;
    final dfne c;
    final ibth d;
    final ibth e;
    final gui f;

    public dfmz(boolean z, String s, dfne dfne0, ibth ibth0, ibth ibth1, gui gui0) {
        this.a = z;
        this.b = s;
        this.c = dfne0;
        this.d = ibth0;
        this.e = ibth1;
        this.f = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$ScrollableScaffold");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        if(this.a) {
            ((goz)object1).M(0xF4F18D79);
            ddxv.b(((goz)object1));
            String s = this.b;
            dfne dfne0 = this.c;
            ibth ibth0 = this.d;
            ibth ibth1 = this.e;
            gui gui0 = this.f;
            dhg dhg0 = dho.g(16.0f);
            hey hey0 = hfc.e;
            iau iau0 = dii.a(dhg0, hei.m, ((goz)object1), 0);
            int v1 = dfmx.a(gol.c(((goz)object1)));
            gzk gzk0 = ((goz)object1).ap();
            hfc hfc0 = hew.c(((goz)object1), hey0);
            ibth ibth2 = iej.a;
            ((goz)object1).O();
            if(((goz)object1).ab()) {
                ((goz)object1).t(ibth2);
            }
            else {
                ((goz)object1).T();
            }
            ibtw ibtw0 = iej.e;
            guo.b(((goz)object1), iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(((goz)object1), gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                ((goz)object1).R(integer0);
                ((goz)object1).p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(((goz)object1), ibts0);
            guo.b(((goz)object1), hfc0, iej.c);
            ddzu.a(s, ((goz)object1), 0);
            ddxv.b(((goz)object1));
            ddxv.b(((goz)object1));
            ibtw ibtw3 = iej.c;
            hfc hfc1 = dla.j(hey0, 24.0f, 0.0f, 24.0f, 0.0f, 10);
            iau iau1 = dll.b(dho.a, hei.j, ((goz)object1), 0);
            int v2 = dfmx.a(gol.c(((goz)object1)));
            gzk gzk1 = ((goz)object1).ap();
            hfc hfc2 = hew.c(((goz)object1), hfc1);
            ((goz)object1).O();
            if(((goz)object1).ab()) {
                ((goz)object1).t(ibth2);
            }
            else {
                ((goz)object1).T();
            }
            guo.b(((goz)object1), iau1, ibtw0);
            guo.b(((goz)object1), gzk1, ibtw1);
            if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
                Integer integer1 = v2;
                ((goz)object1).R(integer1);
                ((goz)object1).p(integer1, ibtw2);
            }
            guo.a(((goz)object1), ibts0);
            guo.b(((goz)object1), hfc2, ibtw3);
            DeviceVisibility deviceVisibility0 = (DeviceVisibility)((dflq)dfne0.c).a;
            String s1 = (String)((dflq)dfne0.b).a;
            Account account0 = (Account)((dflq)dfne0.a).a;
            ((goz)object1).M(5004770);
            boolean z = ((goz)object1).X(gui0);
            Object object3 = ((goz)object1).k();
            if(z || object3 == gop.a) {
                object3 = new dfmy(gui0);
                ((goz)object1).R(object3);
            }
            ((goz)object1).A();
            ddhe.d(deviceVisibility0, s1, account0, ibth0, ibth1, ((ibts)object3), ((goz)object1), 0);
            ((goz)object1).z();
            ((goz)object1).z();
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(0xF4FD270E);
        dfnd.c(((goz)object1), 0);
        ((goz)object1).A();
        return ibom.a;
    }
}

