import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;

public final class agow implements bxto {
    @Override  // bxto
    public final Object a(Object object0) {
        ajpt ajpt0 = ((TokenResponse)object0).a();
        if(ajpt0 != null && ajpt0.equals(ajpt.c)) {
            return null;
        }
        bxly bxly0 = new bxly();
        bxly0.a = 0x6EF4;
        bxly0.b = "Failed to record grants on server";
        throw bxly0.a();
    }
}

