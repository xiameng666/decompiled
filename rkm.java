import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.OnboardingNode;
import java.util.List;

public final class rkm implements sdg, sdv {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rkm.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return rkm.f(((OnboardingNode)object0));
    }

    public static final rkn e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("component");
        if(s == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: component");
        }
        String s1 = persistableBundle0.getString("name");
        if(s1 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: name");
        }
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("foreground");
        if(persistableBundle1 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: foreground");
        }
        rjy rjy0 = rjz.a;
        PersistableBundle persistableBundle2 = persistableBundle1.getPersistableBundle("uiType");
        if(persistableBundle2 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: uiType");
        }
        rjz rjz0 = rjy0.e(persistableBundle2);
        rjw rjw0 = rjx.a;
        PersistableBundle persistableBundle3 = persistableBundle1.getPersistableBundle("backButtonBehavior");
        if(persistableBundle3 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: backButtonBehavior");
        }
        rjx rjx0 = rjw0.e(persistableBundle3);
        String s2 = persistableBundle1.getString("empty");
        if(s2 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: empty");
        }
        rkj rkj0 = new rkj(rjz0, rjx0, Boolean.parseBoolean(s2));
        PersistableBundle persistableBundle4 = persistableBundle0.getPersistableBundle("background");
        if(persistableBundle4 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: background");
        }
        seb seb0 = new seb(new rkh());
        PersistableBundle persistableBundle5 = persistableBundle4.getPersistableBundle("acceptsInterrupts");
        if(persistableBundle5 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: acceptsInterrupts");
        }
        List list0 = seb0.d(persistableBundle5);
        String s3 = persistableBundle4.getString("empty");
        if(s3 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: empty");
        }
        rki rki0 = new rki(list0, Boolean.parseBoolean(s3));
        rke rke0 = rkf.a;
        PersistableBundle persistableBundle6 = persistableBundle0.getPersistableBundle("specificationType");
        if(persistableBundle6 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: specificationType");
        }
        rkf rkf0 = rke0.e(persistableBundle6);
        String[] arr_s = persistableBundle0.getStringArray("offGraphCallers");
        if(arr_s == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: offGraphCallers");
        }
        List list1 = ibpg.N(arr_s);
        String s4 = persistableBundle0.getString("isTerminalNode");
        if(s4 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: isTerminalNode");
        }
        boolean z = Boolean.parseBoolean(s4);
        long v = persistableBundle0.getLong("timeoutInSeconds");
        seb seb1 = new seb(new rkl());
        PersistableBundle persistableBundle7 = persistableBundle0.getPersistableBundle("metadata");
        if(persistableBundle7 != null) {
            return new rkn(s, s1, rkj0, rki0, rkf0, list1, z, v, seb1.d(persistableBundle7));
        }
        throw new IllegalArgumentException("PersistableBundle is missing value for key: metadata");
    }

    public static final PersistableBundle f(OnboardingNode onboardingNode0) {
        ibuq.f(onboardingNode0, "value");
        return new rkn(onboardingNode0).a();
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

