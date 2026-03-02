import j..util.Objects;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Locale;

public final class atgs implements glzn {
    final gifo a;
    final atgt b;

    public atgs(atgt atgt0, gifo gifo0) {
        this.a = gifo0;
        Objects.requireNonNull(atgt0);
        this.b = atgt0;
        super();
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        hjjd hjjd0 = (hjjd)object0;
        int v = hjjd0.a;
        atgt atgt0 = this.b;
        gifo gifo0 = this.a;
        if(v == 200) {
            hjjc hjjc0 = hjjd0.b;
            if(hjjc0.f("X-Server-Object-Version")) {
                return gmbu.i(hjjc0.a("X-Server-Object-Version"));
            }
            atgt0.d.s(17, gifo0, 4, 200);
            throw new aqyc(String.format(Locale.US, "Completed Scotty request but %s response header was missing", "X-Server-Object-Version"));
        }
        hkzp hkzp0 = aqzu.a(hjjd0);
        int v1 = hkzp0.c;
        if(hkzo.a(v1) == 3) {
            aqql aqql0 = atgt.a;
            if(aqql0.b(3)) {
                try {
                    aqql0.d("Non-200 response body: %s", new Object[]{new String(ghjj.g(hjjd0.c), StandardCharsets.UTF_8)});
                    hjjc hjjc1 = hjjd0.b;
                    Iterator iterator0 = hjjc1.c().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_25;
                        }
                        Object object1 = iterator0.next();
                        aqql0.d("%s: %s", new Object[]{((String)object1), hjjc1.a(((String)object1))});
                    }
                }
                catch(IOException iOException0) {
                    atgt.a.e("Unable to log non-200 response body", iOException0, new Object[0]);
                    goto label_25;
                }
            }
            else {
            label_25:
                if(v != 470) {
                    atgt0.d.s(2, gifo0, 4, v);
                    if(atgt.a(v)) {
                        throw new aqyi(v);
                    }
                    throw new aqyd(v);
                }
            }
            atgt0.d.s(13, gifo0, 4, 470);
            throw new aqyn("");
        }
        if(hkzo.a(v1) != 50007) {
            if(hqmi.d() && hkzo.a(hkzp0.c) == 50008) {
                throw new aqyj();
            }
            if(hkzo.a(hkzp0.c) != 50006) {
                atgt0.d.s(2, gifo0, 4, v);
                if(atgt.a(v)) {
                    throw new aqyi(v, null);
                }
                throw new aqyd(v, null);
            }
            atgt0.d.s(15, gifo0, 4, v);
            throw new aqyg();
        }
        atgt0.d.s(13, gifo0, 4, v);
        throw new aqyn("");
    }
}

