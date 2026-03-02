import android.accounts.Account;
import java.util.ArrayList;

public final class aati implements glzn {
    public final aatl a;
    public final Account b;

    public aati(aatl aatl0, Account account0) {
        this.a = aatl0;
        this.b = account0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        grvb grvb0 = ((grxr)object0).c == 8 ? ((grvb)((grxr)object0).d) : grvb.a;
        hfuo hfuo0 = (grvb0.b == 9 ? ((gryo)grvb0.c) : gryo.a).b;
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            arrayList0.add(glzd.f(this.a.b(this.b, ((grxw)object1).c), new aatk(this.b), this.a.d));
        }
        return gmbu.e(arrayList0);
    }
}

