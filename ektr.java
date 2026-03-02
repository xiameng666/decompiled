import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import java.util.List;

public final class ektr {
    public static final ektr a;
    private static final frli b;

    static {
        ektr.a = new ektr();
        frie frie0 = frif.a();
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("scheduler");
        frce0.e("model_task_runs.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)ekuk.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        ektr.b = frli0;
    }

    public final Object a(ibrl ibrl0) {
        ektq ektq0;
        if((ibrl0 instanceof ektq)) {
            ektq0 = (ektq)ibrl0;
            int v = ektq0.c;
            if((v & 0x80000000) == 0) {
                ektq0 = new ektq(this, ibrl0);
            }
            else {
                ektq0.c = v - 0x80000000;
            }
        }
        else {
            ektq0 = new ektq(this, ibrl0);
        }
        Object object0 = ektq0.a;
        Object object1 = ibrx.a;
        switch(ektq0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = ektr.b.a();
                ibuq.e(gmcd0, "getData(...)");
                ektq0.c = 1;
                object0 = icpu.c(gmcd0, ektq0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = ((ekuk)object0).b;
        ibuq.e(object2, "getModelTasksList(...)");
        return object2;
    }

    public static final Object b(List list0, ibrl ibrl0) {
        ektp ektp0 = new ektp(new ekto(list0));
        Object object0 = icpu.c(ektr.b.b(ektp0, gmap.a), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

