import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import java.nio.charset.StandardCharsets;

public final class dlpk implements icih {
    final dlps a;

    public dlpk(dlps dlps0) {
        this.a = dlps0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if((((frxf)object0) instanceof dlpz)) {
            dlps dlps0 = this.a;
            if((((dlpz)(((frxf)object0))) instanceof dlpv)) {
                Context context0 = dlps0.requireContext();
                Account account0 = dlps0.y();
                boolean z = dlps0.G();
                String s = dlps0.E();
                dlps0.as(new Intent("com.google.android.gms.pay.bankaccount.education.PIX_EDUCATION_SCREEN").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("ACCOUNT", account0).putExtra("INTENT_EXTRA_FROM_3P_INTENT", z).putExtra("INTENT_EXTRA_FROM_3P_VENDOR_ID", s));
                return ibom.a;
            }
            if((((dlpz)(((frxf)object0))) instanceof dlpu)) {
                fhwb fhwb0 = dlps0.C();
                fhvz fhvz0 = fhwa.a(0x33F63);
                fhvz0.c(fhwp.b(dlps0.y().name));
                gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                ghfz ghfz0 = ghfs.a;
                domj domj0 = dlps0.aj;
                if(domj0 == null) {
                    ibuq.j("loggingSessionIdManager");
                    domj0 = null;
                }
                gjca0.b(ghfz0.c(domj0.a(), StandardCharsets.UTF_8).c());
                gjip gjip0 = gjio.a(((ProtoLiteMessage)gjcf.a).v_newBuilder());
                gjil gjil0 = dlps0.D();
                boolean z1 = dlps.a.contains(gjil0);
                ProtoLiteBuilder hftp0 = gjip0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjcf gjcf0 = (gjcf)hftp0.b_message;
                gjcf0.b |= 1;
                gjcf0.c = z1;
                gjca0.d(gjip0.a());
                fhvz0.b(douc.a(gjca0.a()));
                fhwb0.a(fhvz0.a());
                ficj ficj0 = dlps0.aq;
                if(ficj0 == null) {
                    ibuq.j("veSloSpan");
                    ficj0 = null;
                }
                fhwb fhwb1 = dlps0.C();
                fhvz fhvz1 = fhwa.a(0x40618);
                fhvz1.c(fhwp.b(dlps0.y().name));
                fhvz1.b(ficj0.a());
                fhwb1.a(fhvz1.a());
                ficj0.close();
                acp acp0 = dlps0.ap;
                if(acp0 == null) {
                    ibuq.j("orchestrationFlowLauncher");
                    acp0 = null;
                }
                edtj edtj0 = dlps0.B();
                Context context1 = dlps0.z().requireContext();
                hkgq hkgq0 = ((dlpu)(((frxf)object0))).a;
                byte[] arr_b = (hkgq0.b == 2 ? ((ByteString)hkgq0.c) : ByteString.b).toByteArray();
                fbjk fbjk0 = new fbjk(context1, null);
                fbjk0.i(arr_b);
                edtj0.d(context1, fbjk0);
                fbjk0.f(3);
                Intent intent0 = fbjk0.a();
                ibuq.e(intent0, "buildAddPixAccountIntent(...)");
                acp0.b(intent0);
                return ibom.a;
            }
            if((((dlpz)(((frxf)object0))) instanceof dlpw)) {
                fhwb fhwb2 = dlps0.C();
                fhvz fhvz2 = fhwa.a((((dlpw)(((frxf)object0))).a ? 0x3DC15 : 252950));
                fhvz2.c(fhwp.b(dlps0.y().name));
                fhwb2.a(fhvz2.a());
                edwr.b(dlps0.an(), ((dlpw)(((frxf)object0))).a, new dlpd(dlps0), new dlpe(dlps0));
                return ibom.a;
            }
            if((((dlpz)(((frxf)object0))) instanceof dlpy)) {
                Context context2 = dlps0.requireContext();
                dlps0.as(new Intent("com.google.android.gms.pay.bankaccount.add.ADD_BANK_ACCOUNT_SUCCESS_SCREEN").setClassName(context2, "com.google.android.gms.pay.main.PayActivity").putExtra("PAYMENT_METHOD_DATA", ((dlpy)(((frxf)object0))).a.toBytesArray()));
                return ibom.a;
            }
            if((((dlpz)(((frxf)object0))) instanceof dlpt)) {
                dlps0.ao().finish();
                return ibom.a;
            }
            if(!(((dlpz)(((frxf)object0))) instanceof dlpx)) {
                throw new ibnq();
            }
            Context context3 = dlps0.requireContext();
            dlps0.as(new Intent("com.google.android.gms.pay.bankaccount.errorprofile.PAYMENT_PROFILE_ERROR_SCREEN").setClassName(context3, "com.google.android.gms.pay.main.PayActivity"));
            return ibom.a;
        }
        return ibom.a;
    }
}

