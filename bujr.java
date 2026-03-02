import com.google.android.chimera.android.Activity;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bujr implements Factory {
    private final Provider a;

    public bujr(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Activity activity0 = ((ejaw)this.a).a();
        String s = activity0.getIntent().getStringExtra("campaign_id");
        if(s == null) {
            s = "";
        }
        String s1 = activity0.getIntent().getStringExtra("onramp");
        if(s1 == null) {
            s1 = "GMSCORE_SMUI_UNSPECIFIED";
        }
        if(ibuq.m(s1, "GMSCORE_SMUI_UNSPECIFIED")) {
            ((ggtj)bujq.a.j()).x("No provided Onramp");
        }
        String s2 = activity0.getIntent().getStringExtra("platform");
        if(s2 == null) {
            s2 = "ANDROID";
        }
        String s3 = activity0.getIntent().getStringExtra("product");
        if(s3 == null) {
            s3 = "GMSCORE";
        }
        return new bujp(s1, s2, s3, s);
    }
}

