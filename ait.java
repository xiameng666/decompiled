import com.google.android.gms.appsearch.SetSchemaResponse.MigrationFailure;
import com.google.android.gms.appsearch.SetSchemaResponse;

public final class ait implements kas {
    @Override  // kas
    public final Object a(Object object0) {
        aea aea0;
        kay.i(((SetSchemaResponse)object0));
        agd agd0 = new agd();
        agd0.b(((SetSchemaResponse)object0).b());
        agd0.c(((SetSchemaResponse)object0).c());
        agd0.d(((SetSchemaResponse)object0).d());
        for(Object object1: ((SetSchemaResponse)object0).a()) {
            String s = ((SetSchemaResponse.MigrationFailure)object1).a;
            String s1 = ((SetSchemaResponse.MigrationFailure)object1).b;
            String s2 = ((SetSchemaResponse.MigrationFailure)object1).c;
            acgs acgs0 = ((SetSchemaResponse.MigrationFailure)object1).a();
            if(acgs0.b()) {
                try {
                    aea0 = new aea(0, ((Void)acgs0.a()), null);
                }
                catch(Throwable throwable0) {
                    aea0 = aea.a(throwable0);
                }
            }
            else {
                aea0 = new aea(acgs0.a, null, acgs0.b);
            }
            agd0.e(new age(s, s1, s2, aea0));
        }
        return agd0.a();
    }
}

