import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutInfo;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

public final class jwo {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    IconCompat h;
    public jvx[] i;
    public Set j;
    public jwi k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder shortcutInfo$Builder0 = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat0 = this.h;
        if(iconCompat0 != null) {
            shortcutInfo$Builder0.setIcon(jxw.c(iconCompat0));
        }
        if(!TextUtils.isEmpty(this.f)) {
            shortcutInfo$Builder0.setLongLabel(this.f);
        }
        if(!TextUtils.isEmpty(this.g)) {
            shortcutInfo$Builder0.setDisabledMessage(this.g);
        }
        ComponentName componentName0 = this.d;
        if(componentName0 != null) {
            shortcutInfo$Builder0.setActivity(componentName0);
        }
        Set set0 = this.j;
        if(set0 != null) {
            shortcutInfo$Builder0.setCategories(set0);
        }
        shortcutInfo$Builder0.setRank(this.m);
        PersistableBundle persistableBundle0 = this.n;
        if(persistableBundle0 != null) {
            shortcutInfo$Builder0.setExtras(persistableBundle0);
        }
        jvx[] arr_jvx = this.i;
        if(arr_jvx != null && arr_jvx.length > 0) {
            Person[] arr_person = new Person[arr_jvx.length];
            for(int v = 0; v < arr_jvx.length; ++v) {
                arr_person[v] = jvv.a(this.i[v]);
            }
            shortcutInfo$Builder0.setPersons(arr_person);
        }
        jwi jwi0 = this.k;
        if(jwi0 != null) {
            shortcutInfo$Builder0.setLocusId(jwi0.a);
        }
        shortcutInfo$Builder0.setLongLived(this.l);
        if(Build.VERSION.SDK_INT >= 33) {
            shortcutInfo$Builder0.setExcludedFromSurfaces(0);
        }
        return shortcutInfo$Builder0.build();
    }
}

