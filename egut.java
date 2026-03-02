import com.google.android.gms.people.contactssync.model.ImportSimContactsSuggestion;
import java.util.List;

public final class egut implements lqj {
    public final eguu a;

    public egut(eguu eguu0) {
        this.a = eguu0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        egwe egwe0;
        boolean z = hwyp.a.c().x();
        eguu eguu0 = this.a;
        egwa egwa0 = eguu0.i.j;
        int v = -1;
        int v1 = 0;
        if(z || bbqa.a() && hwyp.a.c().y()) {
            egwe0 = new egwe(-1, 0, 0, egwa0);
        }
        else {
            if(!((List)object0).isEmpty()) {
                v = ((ImportSimContactsSuggestion)((List)object0).get(0)).b;
            }
            int v2 = 0;
            for(Object object1: ((List)object0)) {
                ++v1;
                v2 += ((ImportSimContactsSuggestion)object1).a();
            }
            egwe0 = new egwe(v, v1, v2, egwa0);
        }
        eguu0.l(egwe0);
    }
}

