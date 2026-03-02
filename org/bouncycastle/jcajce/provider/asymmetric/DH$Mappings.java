package org.bouncycastle.jcajce.provider.asymmetric;

import idvi;
import iebd;
import org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class DH.Mappings extends AsymmetricAlgorithmProvider {
    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("KeyPairGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
        configurableProvider0.addAlgorithm("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        configurableProvider0.addAttributes("KeyAgreement.DH", DH.generalDhAttributes);
        configurableProvider0.addAlgorithm("KeyAgreement.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
        configurableProvider0.addAlgorithm("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        configurableProvider0.addAlgorithm("KeyAgreement", idvi.ai, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
        configurableProvider0.addAlgorithm("KeyAgreement", idvi.al, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
        configurableProvider0.addAlgorithm("KeyFactory.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
        configurableProvider0.addAlgorithm("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        configurableProvider0.addAlgorithm("AlgorithmParameters.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        configurableProvider0.addAlgorithm("AlgorithmParameterGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
        configurableProvider0.addAlgorithm("Cipher.IES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
        configurableProvider0.addAlgorithm("Cipher.IESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider0.addAlgorithm("Cipher.IESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider0.addAlgorithm("Cipher.IESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
        configurableProvider0.addAlgorithm("Cipher.DHIES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
        configurableProvider0.addAlgorithm("Cipher.DHIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider0.addAlgorithm("Cipher.DHIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider0.addAlgorithm("Cipher.DHIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
        configurableProvider0.addAlgorithm("KeyAgreement.DHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA1KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA224KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA256KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA384KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA512KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.DHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512KDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384CKDF");
        configurableProvider0.addAlgorithm("KeyAgreement.MQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512CKDF");
        KeyFactorySpi keyFactorySpi0 = new KeyFactorySpi();
        this.registerOid(configurableProvider0, idvi.t, "DH", keyFactorySpi0);
        KeyFactorySpi keyFactorySpi1 = new KeyFactorySpi();
        this.registerOid(configurableProvider0, iebd.Y, "DH", keyFactorySpi1);
    }
}

