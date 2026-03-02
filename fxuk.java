import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import j..util.Objects;
import java.util.List;
import java.util.TreeSet;

public final class fxuk {
    public final Integer a;
    public final Integer b;
    public final List c;

    public fxuk(AccountConfig accountConfig0) {
        List list0;
        if(accountConfig0 == null) {
            list0 = null;
            this.a = null;
            this.b = null;
        }
        else {
            this.a = accountConfig0.b();
            this.b = accountConfig0.a();
            list0 = accountConfig0.d();
        }
        this.c = list0;
    }

    public final String a() {
        List list0 = this.c;
        if(list0 == null) {
            return "null";
        }
        TreeSet treeSet0 = new TreeSet();
        for(Object object0: list0) {
            treeSet0.add(((InactiveReason)object0).c);
        }
        return treeSet0.toString();
    }

    public static String b(Integer integer0, Integer integer1) {
        return Objects.equals(integer0, integer1) ? String.valueOf(integer1) : integer0 + " -> " + integer1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fxuk) ? Objects.equals(this.a, ((fxuk)object0).a) && Objects.equals(this.b, ((fxuk)object0).b) && Objects.equals(this.c, ((fxuk)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

