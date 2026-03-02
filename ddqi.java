import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;

public final class ddqi implements azys {
    public final ddsc a;
    public final ContactFilter b;

    public ddqi(ddsc ddsc0, ContactFilter contactFilter0) {
        this.a = ddsc0;
        this.b = contactFilter0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        GetContactsCountParams getContactsCountParams0 = new GetContactsCountParams();
        getContactsCountParams0.a = new ddrq(this.a, ((evqp)object1));
        getContactsCountParams0.b = this.b;
        ((ddot)((ddub)object0).H()).j(getContactsCountParams0);
    }
}

