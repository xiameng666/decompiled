import android.content.ContentResolver;
import android.provider.Settings.Secure;
import java.util.List;

final class eyeh extends eyei {
    private final String a;
    private final exln b;
    private final List c;

    public eyeh(String s, exln exln0, List list0) {
        ibuq.f(exln0, "precondtionTrigger");
        ibuq.f(list0, "values");
        super();
        this.a = s;
        this.b = exln0;
        this.c = list0;
    }

    @Override  // eyei
    public final void a(ContentResolver contentResolver0) {
        ibuq.f(contentResolver0, "contentResolver");
        eyei eyei0 = eyej.a(this.b);
        if(eyei0 != null) {
            eyei0.a(contentResolver0);
        }
        Settings.Secure.putString(contentResolver0, this.a, null);
    }

    @Override  // eyei
    public final void b(ContentResolver contentResolver0) {
        ibuq.f(contentResolver0, "contentResolver");
        eyei eyei0 = eyej.a(this.b);
        if(eyei0 != null) {
            eyei0.b(contentResolver0);
        }
        ibuq.f(this.c, "<this>");
        Settings.Secure.putString(contentResolver0, this.a, (this.c.isEmpty() ? " " : ibpo.aK(this.c, "|", null, null, null, 62)));
    }

    @Override
    public final String toString() {
        return this.a + "=" + this.c;
    }
}

