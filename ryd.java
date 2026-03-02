import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;

final class ryd extends ibsl implements ibtw {
    int a;
    final ryf b;

    public ryd(ryf ryf0, ibrl ibrl0) {
        this.b = ryf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ryd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ryd(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ryf ryf0 = this.b;
            if(ryf0.e.b(0x18CE5D55L)) {
                sdr sdr0 = new sdr(rrc.h, ErasedOnboardingTaskState.CREATOR);
                this.a = 1;
                object0 = ryf0.a.c("task_states", sdr0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_11;
            }
        }
        else {
        label_11:
            if(((Map)object0) != null) {
                ryf ryf1 = this.b;
                Objects.toString(((Map)object0));
                sct.c("TaskStateManager", "Restored task states from disk: " + ((Map)object0).toString());
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(((Map)object0).size()));
                for(Object object2: ((Map)object0).entrySet()) {
                    Object object3 = ((Map.Entry)object2).getKey();
                    rra rra0 = (rra)((Map.Entry)object2).getKey();
                    linkedHashMap0.put(object3, icnm.a(((ErasedOnboardingTaskState)((Map.Entry)object2).getValue()).j(new ryc(rra0))));
                }
                ryf1.c.putAll(linkedHashMap0);
            }
        }
        return ibom.a;
    }
}

