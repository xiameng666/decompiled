import android.accounts.Account;

final class caff implements icih {
    final cafj a;

    public caff(cafj cafj0) {
        this.a = cafj0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cafj cafj0 = this.a;
        cafj0.j.g(((String)object0));
        ((ggtj)cafj.a.h()).B("Account changed to: %s", ((String)object0));
        cafj0.h.g(((String)object0));
        for(Object object1: cafj0.e) {
            if(!ibuq.m(((Account)object1).name, ((String)object0))) {
                continue;
            }
            goto label_10;
        }
        object1 = null;
    label_10:
        cafj0.i.g(((Account)object1));
        caie caie0 = cafj0.a();
        cafj0.k.g(caie0);
        return ibom.a;
    }
}

