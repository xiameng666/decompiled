import android.app.Person.Builder;
import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;

public final class ctvw {
    public final Context a;
    public final bboh b;
    public final bayn c;

    public ctvw(Context context0) {
        this.a = context0;
        this.b = ctnb.a("NotificationSync", new ibuk(this.getClass()));
        this.c = bayn.f(context0);
    }

    public final void a(int v, String s) {
        bayn bayn0 = this.c;
        if(bayn0 == null) {
            return;
        }
        bayn0.o(s, v, evuh.cY);
    }

    public static final Person b(cuat cuat0) {
        Person person0 = new Person.Builder().setName(cuat0.c).setBot(cuat0.d).setImportant(cuat0.e).setIcon(Icon.createWithData(cuat0.f.toByteArray(), 0, cuat0.f.size())).build();
        ibuq.e(person0, "build(...)");
        return person0;
    }
}

