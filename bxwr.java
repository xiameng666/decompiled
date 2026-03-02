import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.AddressCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.ApiKeyCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.BasicAuthCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.CreditCardCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.CustomFieldsCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.DriversLicenseCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.FileCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.GeneratedPasswordCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.IdentityDocumentCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.ItemReferenceCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.NoteCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.PasskeyCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.PassportCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.PersonNameCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.SshKeyCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.TotpCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.WifiCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Extension.SharedExtension;
import dagger.internal.Factory;

public final class bxwr implements Factory {
    public static hmys a() {
        hmyp hmyp0 = new hmyp();
        hmyp0.b(bxwu.a);
        hmyp0.b(bxww.a);
        hmyp0.b(bxwv.a);
        hmyp0.a(new hmzl(bxvy.class, "type", ibps.a, ibps.a).b(CredentialExchangeFormat.Credential.AddressCredential.class, bxvz.f.r).b(CredentialExchangeFormat.Credential.ApiKeyCredential.class, bxvz.h.r).b(CredentialExchangeFormat.Credential.BasicAuthCredential.class, bxvz.a.r).b(CredentialExchangeFormat.Credential.CreditCardCredential.class, bxvz.g.r).b(CredentialExchangeFormat.Credential.CustomFieldsCredential.class, bxvz.i.r).b(CredentialExchangeFormat.Credential.DriversLicenseCredential.class, bxvz.j.r).b(CredentialExchangeFormat.Credential.FileCredential.class, bxvz.e.r).b(CredentialExchangeFormat.Credential.GeneratedPasswordCredential.class, bxvz.k.r).b(CredentialExchangeFormat.Credential.IdentityDocumentCredential.class, bxvz.l.r).b(CredentialExchangeFormat.Credential.ItemReferenceCredential.class, bxvz.m.r).b(CredentialExchangeFormat.Credential.NoteCredential.class, bxvz.d.r).b(CredentialExchangeFormat.Credential.PasskeyCredential.class, bxvz.b.r).b(CredentialExchangeFormat.Credential.PassportCredential.class, bxvz.n.r).b(CredentialExchangeFormat.Credential.PersonNameCredential.class, bxvz.o.r).b(CredentialExchangeFormat.Credential.SshKeyCredential.class, bxvz.p.r).b(CredentialExchangeFormat.Credential.TotpCredential.class, bxvz.c.r).b(CredentialExchangeFormat.Credential.WifiCredential.class, bxvz.q.r));
        hmyp0.a(new hmzl(bxwa.class, "name", ibps.a, ibps.a).b(CredentialExchangeFormat.Extension.SharedExtension.class, "shared"));
        return new hmys(hmyp0);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return bxwr.a();
    }
}

