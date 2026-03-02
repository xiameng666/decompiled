package org.bouncycastle.jcajce.provider.symmetric;

import idqg;
import idvi;
import ietu;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public class DESede.Mappings extends AlgorithmProvider {
    private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
    private static final String PREFIX;

    static {
        DESede.Mappings.PREFIX = DESede.class.getName();
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        String s = DESede.Mappings.PREFIX;
        configurableProvider0.addAlgorithm("Cipher.DESEDE", s + "$ECB");
        idqg idqg0 = idvi.F;
        configurableProvider0.addAlgorithm("Cipher", idqg0, s + "$CBC");
        configurableProvider0.addAlgorithm("Cipher.DESEDEWRAP", s + "$Wrap");
        configurableProvider0.addAlgorithm("Cipher", idvi.aj, s + "$Wrap");
        configurableProvider0.addAlgorithm("Cipher.DESEDERFC3211WRAP", s + "$RFC3211");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.DESEDERFC3217WRAP", "DESEDEWRAP");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.TDEA", "DESEDE");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.TDEAWRAP", "DESEDEWRAP");
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.TDEA", "DESEDE");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
        if(configurableProvider0.hasAlgorithm("MessageDigest", "SHA-1")) {
            configurableProvider0.addAlgorithm("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", s + "$PBEWithSHAAndDES3Key");
            configurableProvider0.addAlgorithm("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", s + "$PBEWithSHAAndDES2Key");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.az, "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.aA, "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        }
        configurableProvider0.addAlgorithm("KeyGenerator.DESEDE", s + "$KeyGenerator");
        configurableProvider0.addAlgorithm("KeyGenerator." + idqg0, s + "$KeyGenerator3");
        configurableProvider0.addAlgorithm("KeyGenerator.DESEDEWRAP", s + "$KeyGenerator");
        configurableProvider0.addAlgorithm("SecretKeyFactory.DESEDE", s + "$KeyFactory");
        configurableProvider0.addAlgorithm("SecretKeyFactory", ietu.e, s + "$KeyFactory");
        configurableProvider0.addAlgorithm("Mac.DESEDECMAC", s + "$CMAC");
        configurableProvider0.addAlgorithm("Mac.DESEDEMAC", s + "$CBCMAC");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
        configurableProvider0.addAlgorithm("Mac.DESEDEMAC/CFB8", s + "$DESedeCFB8");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
        configurableProvider0.addAlgorithm("Mac.DESEDEMAC64", s + "$DESede64");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
        configurableProvider0.addAlgorithm("Mac.DESEDEMAC64WITHISO7816-4PADDING", s + "$DESede64with7816d4");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableProvider0.addAlgorithm("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters." + idqg0, "DESEDE");
        configurableProvider0.addAlgorithm("AlgorithmParameterGenerator.DESEDE", s + "$AlgParamGen");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + idqg0, "DESEDE");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", s + "$PBEWithSHAAndDES3KeyFactory");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", s + "$PBEWithSHAAndDES2KeyFactory");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.PBE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    }
}

