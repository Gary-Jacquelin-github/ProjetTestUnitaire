package org.example.volunteers;

public class Utils {



    public String conversionTel(String tel){
        if (tel == null)
        {
            return null;
        }
        tel = tel.replaceAll("[^0-9]", ""); // on retire tous les caractères sauf les chiffres
        if(tel.length() > 6)
        {
            if(!"0".equals(tel.substring(0,1)))  // si le premier chiffre c'est pas 0 (+33..), on ajoute 00 au debut
            {
                tel = "00" + tel;
            }
            if("0033".equals(tel.substring(0,4)))  // si le numéro commence par 00.33.6.12.... on met au format 06.12.....
            {
                tel = "0" + tel.substring(4);
            }
            // dans tous les cas on met au format 02.35.63.36.54 ou 06.58.56.54.56 si 0033658565456
            if(tel.length() > 10)
            {
                return tel.replaceAll("(d{2})(d{2})(d{2})(d{2})(d{2})(d{2})", "$1.$2.$3.$4.$5.$6");
            }
            return tel.replaceAll("(d{2})(d{2})(d{2})(d{2})(d{2})", "$1.$2.$3.$4.$5");
        }
        return null;
    }

    public void conversionMail(String mail){

    }

}
