package org.bouncycastle.jcajce.provider.symmetric;

import idvi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public class RC2.Mappings extends AlgorithmProvider {
    private static final String PREFIX;

    static {
        RC2.Mappings.PREFIX = RC2.class.getName();
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("AlgorithmParameterGenerator.RC2", RC2.Mappings.PREFIX + "$AlgParamGen");
        configurableProvider0.addAlgorithm("AlgorithmParameterGenerator.1.2.840.113549.3.2", RC2.Mappings.PREFIX + "$AlgParamGen");
        configurableProvider0.addAlgorithm("KeyGenerator.RC2", RC2.Mappings.PREFIX + "$KeyGenerator");
        configurableProvider0.addAlgorithm("KeyGenerator.1.2.840.113549.3.2", RC2.Mappings.PREFIX + "$KeyGenerator");
        configurableProvider0.addAlgorithm("AlgorithmParameters.RC2", RC2.Mappings.PREFIX + "$AlgParams");
        configurableProvider0.addAlgorithm("AlgorithmParameters.1.2.840.113549.3.2", RC2.Mappings.PREFIX + "$AlgParams");
        configurableProvider0.addAlgorithm("Cipher.RC2", RC2.Mappings.PREFIX + "$ECB");
        configurableProvider0.addAlgorithm("Cipher.RC2WRAP", RC2.Mappings.PREFIX + "$Wrap");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.ak, "RC2WRAP");
        configurableProvider0.addAlgorithm("Cipher", idvi.G, RC2.Mappings.PREFIX + "$CBC");
        configurableProvider0.addAlgorithm("Mac.RC2MAC", RC2.Mappings.PREFIX + "$CBCMAC");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.RC2", "RC2MAC");
        configurableProvider0.addAlgorithm("Mac.RC2MAC/CFB8", RC2.Mappings.PREFIX + "$CFB8MAC");
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory", idvi.w, "PBEWITHMD2ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory", idvi.y, "PBEWITHMD5ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory", idvi.A, "PBEWITHSHA1ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDRC2", RC2.Mappings.PREFIX + "$PBEWithMD2KeyFactory");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDRC2", RC2.Mappings.PREFIX + "$PBEWithMD5KeyFactory");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDRC2", RC2.Mappings.PREFIX + "$PBEWithSHA1KeyFactory");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", RC2.Mappings.PREFIX + "$PBEWithSHAAnd128BitKeyFactory");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", RC2.Mappings.PREFIX + "$PBEWithSHAAnd40BitKeyFactory");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.w, "PBEWITHMD2ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.y, "PBEWITHMD5ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.A, "PBEWITHSHA1ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.aB, "PBEWITHSHAAND128BITRC2-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher", idvi.aC, "PBEWITHSHAAND40BITRC2-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
        configurableProvider0.addAlgorithm("Cipher.PBEWITHSHA1ANDRC2", RC2.Mappings.PREFIX + "$PBEWithSHA1AndRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        configurableProvider0.addAlgorithm("Cipher.PBEWITHSHAAND128BITRC2-CBC", RC2.Mappings.PREFIX + "$PBEWithSHAAnd128BitRC2");
        configurableProvider0.addAlgorithm("Cipher.PBEWITHSHAAND40BITRC2-CBC", RC2.Mappings.PREFIX + "$PBEWithSHAAnd40BitRC2");
        configurableProvider0.addAlgorithm("Cipher.PBEWITHMD5ANDRC2", RC2.Mappings.PREFIX + "$PBEWithMD5AndRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
    }
}

