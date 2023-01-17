package day11;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {

    @Test
    public void isExistTest(){
        String userDIR = System.getProperty("user.dir");
        System.out.println(userDIR); //\Users\senaa\IdeaProjects\com.B103Maven_Junit

        String userHOME = System.getProperty("user.home");
        System.out.println(userHOME); //\Users\senaa

        //logo.jpeg indirip MASAUSTUNE kaydedin
        //Logo masaustunde : /Users/senaa/Desktop

        String dosyaYolu = userHOME + "/Desktop/logo.jpeg";
        System.out.println(dosyaYolu);

        boolean isExist = Files.exists(Paths.get(dosyaYolu)); //dosya var ise true yok ise false return edicek
        Assert.assertTrue(isExist);
         /*
        1. fail -> PATH YANLIS : dosya masa ustunde degil, dosya adi yanlis, ya da arada onedrive gibi ex dosyalar olarak
         */
    }
}
