import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import j..util.Objects;
import java.util.Comparator;

final class acdq implements Comparator {
    final acdr a;

    public acdq(acdr acdr0) {
        Objects.requireNonNull(acdr0);
        this.a = acdr0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return this.a.a[((ContactPerson.ContactMethod)object0).a] - this.a.a[((ContactPerson.ContactMethod)object1).a];
    }
}

