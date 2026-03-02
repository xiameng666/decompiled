import android.os.Build.VERSION;
import android.os.LocaleList;
import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;

public final class bgra implements bgrl {
    public static final bboh a;
    private final bgqy b;

    static {
        bgra.a = bgrz.a("contV");
    }

    public bgra(bgqy bgqy0) {
        this.b = bgqy0;
    }

    @Override  // bgrl
    public final void a(hguc hguc0, ProtoLiteBuilder hftp0) {
        boolean z;
        if(hguc0 == null) {
            throw new bgrk(4);
        }
        ggeo ggeo0 = ghlm.j(((Map)Collection.-EL.stream(hguc0.j).filter(new bgqz()).collect(ggaf.b(new bgqw(), Function.-CC.identity())))).b(new bgqx()).f();
        jzd jzd0 = jzd.d();
        hgtr hgtr0 = null;
        int v = 0;
    alab1:
        while(true) {
            if(v >= jzd0.a()) {
                if(!hguc0.k.isEmpty()) {
                    hgtr0 = (hgtr)ggeo0.get(Locale.forLanguageTag(hguc0.k));
                }
                break;
            }
            Locale locale0 = jzd0.g(v);
            if(locale0 != null) {
                hgtr0 = (hgtr)ggeo0.get(locale0);
                locale0.toLanguageTag();
                if(hgtr0 != null) {
                    break;
                }
                ggqj ggqj0 = ggeo0.v().om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    Locale locale1 = (Locale)map$Entry0.getKey();
                    if(Build.VERSION.SDK_INT >= 33) {
                        z = LocaleList.matchesLanguageAndScript(locale1, locale0);
                    }
                    else {
                        if(!locale1.equals(locale0)) {
                            if(locale1.getLanguage().equals(locale0.getLanguage()) && (!jzc.a(locale1) && !jzc.a(locale0))) {
                                String s = kal.a(locale1);
                                if(s.isEmpty()) {
                                    String s1 = locale1.getCountry();
                                    if(s1.isEmpty() || s1.equals(locale0.getCountry())) {
                                        goto label_30;
                                    }
                                }
                                else {
                                    z = s.equals(kal.a(locale0));
                                    goto label_31;
                                }
                            }
                            z = false;
                            goto label_31;
                        }
                    label_30:
                        z = true;
                    }
                label_31:
                    if(z) {
                        hgtr0 = (hgtr)map$Entry0.getValue();
                        locale0.toLanguageTag();
                        locale1.toLanguageTag();
                        break alab1;
                    }
                    locale0.toLanguageTag();
                    locale1.toLanguageTag();
                }
            }
            ++v;
        }
        if(hgtr0 == null) {
            throw new bgrk(5);
        }
        this.b.a(hgtr0);
        String s2 = hgtr0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgug hgug0 = (hgug)hftp0.b_message;
        s2.getClass();
        hgug0.j = s2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgug)hftp0.b_message).c = hgtr0;
        ((hgug)hftp0.b_message).b |= 1;
    }
}

