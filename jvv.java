import android.app.Person.Builder;
import android.app.Person;

public final class jvv {
    public static Person a(jvx jvx0) {
        Person.Builder person$Builder0 = new Person.Builder().setName(jvx0.a);
        return jvx0.b == null ? person$Builder0.setIcon(null).setUri(jvx0.c).setKey(jvx0.d).setBot(jvx0.e).setImportant(jvx0.f).build() : person$Builder0.setIcon(jxw.c(jvx0.b)).setUri(jvx0.c).setKey(jvx0.d).setBot(jvx0.e).setImportant(jvx0.f).build();
    }

    static jvx b(Person person0) {
        jvw jvw0 = new jvw();
        jvw0.a = person0.getName();
        jvw0.b = person0.getIcon() == null ? null : jxw.b(person0.getIcon());
        jvw0.c = person0.getUri();
        jvw0.d = person0.getKey();
        jvw0.e = person0.isBot();
        jvw0.f = person0.isImportant();
        return new jvx(jvw0);
    }
}

