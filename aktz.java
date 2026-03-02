import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import java.util.HashSet;

public final class aktz implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        allu allu0 = (allu)object0;
        HashSet hashSet0 = new HashSet();
        long v = allu0.c;
        hashSet0.add(Integer.valueOf(4));
        long v1 = allu0.d;
        hashSet0.add(Integer.valueOf(3));
        String s = bbmu.c(allu0.b.toByteArray());
        hashSet0.add(Integer.valueOf(2));
        return new BeaconSeedEntity(hashSet0, s, v1, v);
    }
}

