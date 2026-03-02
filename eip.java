import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

public final class eip implements ibtz {
    @Override  // ibtz
    public final Object a(Object object0, Object object1, Object object2, Object object3, Object object4) {
        ResolveInfo resolveInfo0 = (ResolveInfo)object1;
        Intent intent0 = eiq.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", ((Boolean)object2).booleanValue()).setClassName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name);
        intent0.putExtra("android.intent.extra.PROCESS_TEXT", ((CharSequence)object3).subSequence(jbk.d(((jbk)object4).b), jbk.c(((jbk)object4).b)).toString());
        ((Context)object0).startActivity(intent0);
        return ibom.a;
    }
}

