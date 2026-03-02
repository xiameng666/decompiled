import com.google.android.gms.auth.api.identity.FetchVerifiedPhoneNumbersResult;

public final class agld implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        gral gral0;
        ggdy ggdy0 = new ggdy();
        gram gram0 = ((grao)object0).b;
        if(gram0 == null) {
            gram0 = gram.a;
        }
        for(Object object1: gram0.b) {
            grak grak0 = (grak)object1;
            if(grak0.b.equals("https://www.googleapis.com/auth/verifiedphonenumber")) {
                ggdy0.k(grak0.c);
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        gram gram1 = ((grao)object0).b;
        String s = (gram1 == null ? gram.a : gram1).d;
        ggeo ggeo0 = aglf.b;
        if(gram1 == null) {
            gram1 = gram.a;
        }
        switch(gram1.c) {
            case 0: {
                gral0 = gral.a;
                break;
            }
            case 1: {
                gral0 = gral.b;
                break;
            }
            default: {
                gral0 = null;
            }
        }
        if(gral0 == null) {
            gral0 = gral.c;
        }
        return new FetchVerifiedPhoneNumbersResult(gged0, s, ((int)(((Integer)ggeo0.getOrDefault(gral0, Integer.valueOf(0))))));
    }
}

