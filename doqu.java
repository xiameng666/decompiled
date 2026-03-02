import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.GetSeMfiPrepaidCardsRequest;

public final class doqu implements azys {
    public final GetSeMfiPrepaidCardsRequest a;

    public doqu(GetSeMfiPrepaidCardsRequest getSeMfiPrepaidCardsRequest0) {
        this.a = getSeMfiPrepaidCardsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dosm dosm0 = new dosm(((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.P(this.a, dosm0, apiMetadata0);
    }
}

