/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.facadepractica1;

import patrones.estructurales.facadepractica1.apis.MD5EncryptorAPI;
import patrones.estructurales.facadepractica1.apis.SHA256EncryptorAPI;
import patrones.estructurales.facadepractica1.apis.SHAEncryptorAPI;
/**
 *
 * @author Jefferson
 */
public class CheckFacadeEjemplo {
    
    public MD5EncryptorAPI md5encryptorApi;
    public SHA256EncryptorAPI sha256encryptorApi;
    public SHAEncryptorAPI shaencrytorApi;
    
    public CheckFacadeEjemplo(){
    md5encryptorApi = new MD5EncryptorAPI();
    sha256encryptorApi = new SHA256EncryptorAPI();
    shaencrytorApi = new SHAEncryptorAPI();
    }
    
    public void Enviar(String text){
        System.out.println(md5encryptorApi.encrypt(text));
        System.out.println(sha256encryptorApi.encrypt(text));
        System.out.println(shaencrytorApi.encrypt(text));
    }
    
}
