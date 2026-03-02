import android.content.Context;
import android.os.Build.VERSION;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.trustagent.activeunlock.primary.ui.activity.ActiveUnlockSettingsChimeraActivity;

public final class eykc extends ibsl implements ibtw {
    Object a;
    int b;
    final ActiveUnlockSettingsChimeraActivity c;

    public eykc(ActiveUnlockSettingsChimeraActivity activeUnlockSettingsChimeraActivity0, ibrl ibrl0) {
        this.c = activeUnlockSettingsChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eykc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eykc(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_14;
        }
        ibnx.b(object0);
        ActiveUnlockSettingsChimeraActivity activeUnlockSettingsChimeraActivity0 = this.c;
        eyvx eyvx0 = (eyvx)activeUnlockSettingsChimeraActivity0.o.a();
        this.a = activeUnlockSettingsChimeraActivity0;
        this.b = 1;
        Object object3 = eyvx0.a(this);
        if(object3 != object1) {
            object0 = object3;
            object2 = activeUnlockSettingsChimeraActivity0;
        label_14:
            int v = ((Number)object0).intValue();
            du du0 = ((xoi)object2).getSupportFragmentManager().g(0x7F0B19B7);  // id:nav_host_fragment
            ibuq.d(du0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            nry nry0 = ((NavHostFragment)du0).z();
            int v1 = !homc.a.j().p() || Build.VERSION.SDK_INT <= 34 || !sku.a(((Context)object2)) ? 0 : 1;
            ntd ntd0 = nry0.f().a((1 == v1 ? 0x7F120001 : 0x7F120000));  // navigation:active_unlock_navigation_bc25
            ntd0.y(v);
            nry0.o(ntd0);
            return ibom.a;
        }
        return object1;
    }
}

