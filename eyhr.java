import com.google.android.gms.trustagent.activeunlock.primary.settings.ActiveUnlockSettingsTileChimeraContentProvider;
import java.util.List;

final class eyhr implements icih {
    final ActiveUnlockSettingsTileChimeraContentProvider a;

    public eyhr(ActiveUnlockSettingsTileChimeraContentProvider activeUnlockSettingsTileChimeraContentProvider0) {
        this.a = activeUnlockSettingsTileChimeraContentProvider0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        return this.b(((List)object0), ibrl0);
    }

    public final Object b(List list0, ibrl ibrl0) {
        Object object3;
        Object object2;
        eyhq eyhq0;
        if((ibrl0 instanceof eyhq)) {
            eyhq0 = (eyhq)ibrl0;
            int v = eyhq0.d;
            if((v & 0x80000000) == 0) {
                eyhq0 = new eyhq(this, ibrl0);
            }
            else {
                eyhq0.d = v - 0x80000000;
            }
        }
        else {
            eyhq0 = new eyhq(this, ibrl0);
        }
        Object object0 = eyhq0.b;
        Object object1 = ibrx.a;
        switch(eyhq0.d) {
            case 0: {
                ibnx.b(object0);
                ActiveUnlockSettingsTileChimeraContentProvider activeUnlockSettingsTileChimeraContentProvider0 = this.a;
                activeUnlockSettingsTileChimeraContentProvider0.f = list0;
                eyhq0.a = activeUnlockSettingsTileChimeraContentProvider0;
                eyhq0.d = 1;
                List list1 = activeUnlockSettingsTileChimeraContentProvider0.f;
                if(list1 == null) {
                    object2 = null;
                }
                else {
                    exwv exwv0 = (exwv)ibpo.T(list1);
                    if(exwv0 == null) {
                        object2 = null;
                    }
                    else {
                        eycb eycb0 = activeUnlockSettingsTileChimeraContentProvider0.e;
                        if(eycb0 == null) {
                            ibuq.j("proximityRepository");
                            eycb0 = null;
                        }
                        object2 = eycb.i(eycb0, exwv0, exkh.c(activeUnlockSettingsTileChimeraContentProvider0.a().a()), eyhq0);
                    }
                }
                if(object2 != object1) {
                    object0 = object2;
                    object3 = activeUnlockSettingsTileChimeraContentProvider0;
                    break;
                }
                return object1;
            }
            case 1: {
                object3 = eyhq0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((ActiveUnlockSettingsTileChimeraContentProvider)object3).g = (eybs)object0;
        this.a.getContext().getContentResolver().notifyChange(ActiveUnlockSettingsTileChimeraContentProvider.a, null);
        return ibom.a;
    }
}

