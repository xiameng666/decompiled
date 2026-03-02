import android.content.res.Resources;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class gbok {
    public static final fbcb a(Resources resources0) {
        fbby fbby0 = fbbx.a(((ProtoLiteMessage)fbcb.a).v_newBuilder());
        ibuq.e("Center your card number in the frame", "getString(...)");
        fbby0.e("Center your card number in the frame");
        ghim ghim0 = gbok.c(resources0);
        ibuq.e(ghim0, "getScreenDescriptionHtml(...)");
        fbby0.d(ghim0);
        ibuq.e("Add with camera", "getString(...)");
        fbby0.c("Add with camera");
        ibuq.e("Enter details manually", "getString(...)");
        fbby0.b("Enter details manually");
        fbby0.f(fbcg.b);
        return fbby0.a();
    }

    public static final fbcb b(fbch fbch0, Resources resources0) {
        ibuq.f(fbch0, "<this>");
        ibuq.f(resources0, "resources");
        fbby fbby0 = fbbx.a(((ProtoLiteMessage)fbcb.a).v_newBuilder());
        ibuq.e("Add a card", "getString(...)");
        fbby0.e("Add a card");
        ibuq.e("Line it up with the frame", "getString(...)");
        ibuq.f("Line it up with the frame", "value");
        ProtoLiteBuilder hftp0 = fbby0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbcb fbcb0 = (fbcb)hftp0.b_message;
        "Line it up with the frame".getClass();
        fbcb0.c = 2;
        fbcb0.d = "Line it up with the frame";
        ibuq.e("Scan card with OCR", "getString(...)");
        fbby0.c("Scan card with OCR");
        ibuq.e("Enter details manually", "getString(...)");
        fbby0.b("Enter details manually");
        fbcg fbcg0 = fbcg.b;
        fbby0.f(fbcg0);
        fbcb fbcb1 = fbby0.a();
        if(fbch0.c == 2) {
            hfuo hfuo0 = ((fbcc)fbch0.d).b;
            ibuq.e(hfuo0, "getValueList(...)");
            fbcg fbcg1 = fbcg.b(((fbcb)hfuo0.get(0)).f);
            if(fbcg1 == null) {
                fbcg1 = fbcg.a;
            }
            if(fbcg1 == fbcg0) {
                Object object0 = hfuo0.get(0);
                ibuq.e(object0, "get(...)");
                return (fbcb)object0;
            }
        }
        return fbcb1;
    }

    public static final ghim c(Resources resources0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ArrayList arrayList0 = new ArrayList();
        if(!"a".matches("[a-z0-9-]+")) {
            throw new IllegalArgumentException(a.a("a", "Invalid element name \"", "\". Only lowercase letters, numbers and \'-\' allowed."));
        }
        if(ghil.a.contains("a")) {
            throw new IllegalArgumentException(a.a("a", "Element \"", "\" is not supported."));
        }
        ghil.b("See which cards you can add", "a", arrayList0);
        ghio ghio0 = ghiq.b("https://support.google.com/wallet/answer/12059326?hl=en&co=GENIE.CountryCode%3DUS");
        ggfp ggfp0 = ghil.b;
        if(!ggfp0.contains("a")) {
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: " + ggfp0);
        }
        linkedHashMap0.put("href", gqjv.a(ghio0.b));
        return ghin.d(ghil.a("a", linkedHashMap0, arrayList0));
    }
}

