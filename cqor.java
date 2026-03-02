import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import j..util.DesugarArrays;
import j..util.Optional;

public final class cqor implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            PhoneNumberVerification[] arr_phoneNumberVerification = ((VerifyPhoneNumberResponse)evql0.j()).a;
            gged_interceptors gged0 = (gged_interceptors)DesugarArrays.stream(arr_phoneNumberVerification).filter(new cqoj()).flatMap(new cqol()).collect(ggaf.a);
            if(gged0.isEmpty()) {
                Optional optional0 = DesugarArrays.stream(arr_phoneNumberVerification).findFirst().map(new cqpa());
                return new cqpb(6, ggna.a, optional0);
            }
            return cqpb.c(gged0);
        }
        Exception exception0 = evql0.i();
        if(exception0 == null) {
            ((ggtj)cqpi.d.j()).x("Failed to verify phone number");
        }
        else {
            a.ae(cqpi.d.j(), "Failed to verify phone number", exception0);
        }
        if((exception0 instanceof aztb)) {
            if(((aztb)exception0).b() == 5001) {
                gged_interceptors gged1 = ggna.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgzc hgzc0 = (hgzc)hftp0.b_message;
                hgzc0.b = 1;
                hgzc0.c = (int)5001;
                return new cqpb(5, gged1, Optional.of(((hgzc)hftp0.N_build())));
            }
            return cqpb.b(((aztb)exception0));
        }
        return cqpb.a();
    }
}

