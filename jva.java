import android.app.Notification.MessagingStyle.Message;
import android.app.Person;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class jva {
    public final CharSequence a;
    public final jvx b;
    public String c;
    public Uri d;
    private final long e;
    private final Bundle f;

    public jva(CharSequence charSequence0, long v, jvx jvx0) {
        this.f = new Bundle();
        this.a = charSequence0;
        this.e = v;
        this.b = jvx0;
    }

    final Notification.MessagingStyle.Message a() {
        Person person0 = this.b == null ? null : jvv.a(this.b);
        Notification.MessagingStyle.Message notification$MessagingStyle$Message0 = juz.a(this.a, this.e, person0);
        String s = this.c;
        if(s != null) {
            juy.a(notification$MessagingStyle$Message0, s, this.d);
        }
        return notification$MessagingStyle$Message0;
    }

    static List b(Parcelable[] arr_parcelable) {
        jvx jvx0;
        List list0 = new ArrayList(arr_parcelable.length);
        for(int v = 0; v < arr_parcelable.length; ++v) {
            Parcelable parcelable0 = arr_parcelable[v];
            if((parcelable0 instanceof Bundle)) {
                Bundle bundle0 = (Bundle)parcelable0;
                Object object0 = null;
                try {
                    if(bundle0.containsKey("text") && bundle0.containsKey("time")) {
                        if(bundle0.containsKey("person")) {
                            jvx0 = jvx.a(bundle0.getBundle("person"));
                        }
                        else if(bundle0.containsKey("sender_person")) {
                            jvx0 = jvv.b(((Person)bundle0.getParcelable("sender_person")));
                        }
                        else if(bundle0.containsKey("sender")) {
                            jvw jvw0 = new jvw();
                            jvw0.a = bundle0.getCharSequence("sender");
                            jvx0 = new jvx(jvw0);
                        }
                        else {
                            jvx0 = null;
                        }
                        jva jva0 = new jva(bundle0.getCharSequence("text"), bundle0.getLong("time"), jvx0);
                        if(bundle0.containsKey("type") && bundle0.containsKey("uri")) {
                            String s = bundle0.getString("type");
                            Uri uri0 = (Uri)bundle0.getParcelable("uri");
                            jva0.c = s;
                            jva0.d = uri0;
                        }
                        if(bundle0.containsKey("extras")) {
                            Bundle bundle1 = bundle0.getBundle("extras");
                            jva0.f.putAll(bundle1);
                        }
                        object0 = jva0;
                    }
                }
                catch(ClassCastException unused_ex) {
                }
                if(object0 != null) {
                    list0.add(object0);
                }
            }
        }
        return list0;
    }

    static Bundle[] c(List list0) {
        Bundle[] arr_bundle = new Bundle[list0.size()];
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            jva jva0 = (jva)list0.get(v1);
            Bundle bundle0 = new Bundle();
            CharSequence charSequence0 = jva0.a;
            if(charSequence0 != null) {
                bundle0.putCharSequence("text", charSequence0);
            }
            bundle0.putLong("time", jva0.e);
            jvx jvx0 = jva0.b;
            if(jvx0 != null) {
                bundle0.putCharSequence("sender", jvx0.a);
                bundle0.putParcelable("sender_person", jvv.a(jvx0));
            }
            String s = jva0.c;
            if(s != null) {
                bundle0.putString("type", s);
            }
            Uri uri0 = jva0.d;
            if(uri0 != null) {
                bundle0.putParcelable("uri", uri0);
            }
            bundle0.putBundle("extras", jva0.f);
            arr_bundle[v1] = bundle0;
        }
        return arr_bundle;
    }
}

