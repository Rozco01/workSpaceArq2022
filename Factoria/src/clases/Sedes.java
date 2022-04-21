package clases;

import impl.*;

public class Sedes {
    public ISedes getSedes(String motor){
        if(motor == null){
            return new sedeVac();
        }
        else if(motor.equalsIgnoreCase("DEF")){
            return new sedeDefault();
        }
        else if(motor.equalsIgnoreCase("MED")){
            return new sedeMedicamentos();
        }
        else if(motor.equalsIgnoreCase("PRI")){
            return new sedePpal();
        }
        else if(motor.equalsIgnoreCase("QUI")){
            return new sedeQuirurjica();
        }

        return new sedeVac();
        
    }
}
