import com.google.android.gms.auth.folsom.SecurityDomainMember;
import java.util.List;

public final class bnvn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((List)object0).isEmpty()) {
            return new bnvi(false, false);
        }
        for(Object object1: ((List)object0)) {
            SecurityDomainMember securityDomainMember0 = (SecurityDomainMember)object1;
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grey.a), securityDomainMember0.b, 0, securityDomainMember0.b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(((grey)hftv0).d) {
                    return new bnvi(true, true);
                }
                continue;
            }
            catch(hfur unused_ex) {
                ((ggtj)bnvp.a.i()).x("Unable to parse MemberMetadata.");
                return new bnvi(true, true);
            }
            return new bnvi(true, true);
        }
        return new bnvi(false, true);
    }
}

