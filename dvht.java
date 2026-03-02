import android.net.Uri;
import com.google.android.apps.miphone.aiai.walletsuggestions.schema.WalletLocationsDocument;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.PassType;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.io.InputStream;

public final class dvht implements glzm {
    public final dvhw a;
    public final gmcd b;
    public final gmcd c;
    public final boolean d;
    public final ggfp e;

    public dvht(dvhw dvhw0, gmcd gmcd0, gmcd gmcd1, boolean z, ggfp ggfp0) {
        this.a = dvhw0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = z;
        this.e = ggfp0;
    }

    @Override  // glzm
    public final gmcd a() {
        hlxe hlxe0;
        fiyd fiyd0;
        aet aet0 = (aet)gmbu.r(this.b);
        afm afm0 = new afm();
        dvhw dvhw0 = this.a;
        dvjf dvjf0 = dvhw0.c;
        PassFilter passFilter0 = new PassFilter();
        passFilter0.h = 2;
        PassType[] arr_passType = new PassType[1];
        PassType passType0 = new PassType();
        passType0.a = 5;
        arr_passType[0] = passType0;
        passFilter0.a = arr_passType;
        gged_interceptors gged0 = (gged_interceptors)dvjf0.a(passFilter0).first;
        ggek ggek0 = new ggek();
        int v1 = gged0.size();
        for(int v = 0; v < v1; ++v) {
            Valuable valuable0 = (Valuable)gged0.get(v);
            ggek0.i(valuable0.c, valuable0);
        }
        ggeo ggeo0 = ggek0.g();
        fiyh fiyh0 = (fiyh)gmbu.r(this.c);
        if(fiyh0 == null) {
            ((ggtj)dvhw.a.i()).x("Issuer locations file group isn\'t downloaded yet.");
            return aet0.e(afm0.a());
        }
        for(Object object0: fiyh0.h) {
            fiyd0 = (fiyd)object0;
            if(!fiyd0.c.equals(hwhc.a.b().d())) {
                continue;
            }
            goto label_32;
        }
        fiyd0 = null;
    label_32:
        if(fiyd0 == null) {
            ((ggtj)dvhw.a.i()).x("Issuer locations file group is downloaded but couldn\'t find issuer locations file.");
            return aet0.e(new afm().a());
        }
        InputStream inputStream0 = (InputStream)dvhw0.f.d(Uri.parse(fiyd0.d), new frfr());
        while(true) {
            try {
            label_36:
                hlxe0 = (hlxe)((Parser)((ProtoLiteMessage)hlxe.a).jf(7, null)).h(inputStream0);
            }
            catch(hfur hfur0) {
                a.ae(dvhw.a.j(), "Failed to parse an invalid protocol buffer", hfur0);
                MessageLite hfvm0 = hfur0.a;
                if(hfvm0 == null) {
                    goto label_36;
                }
                hfvm0.getDefaultInstanceForType();
                goto label_36;
            }
            if(hlxe0 == null) {
                break;
            }
            String s = String.valueOf(hlxe0.b);
            if(!ggeo0.containsKey(s)) {
                goto label_36;
            }
            if(!this.d) {
                String s1 = ((Valuable)ggeo0.get(s)).b;
                if(this.e.contains(s1)) {
                    goto label_50;
                }
                goto label_36;
            }
        label_50:
            afm0.e(new Object[]{new WalletLocationsDocument("default", ((Valuable)ggeo0.get(s)).b, hlxe0.c)});
        }
        return aet0.e(afm0.a());
    }
}

