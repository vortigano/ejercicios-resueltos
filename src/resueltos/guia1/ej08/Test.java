
package resueltos.guia1.ej08;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test {
    public static void main(String[] args) {
        Password pw1 = new Password();
        Password pw2 = new Password("abcd");
        Password pw3 = new Password("123456");
        Password pw4 = new Password("qwerty1234");
        
        Password[] pwds = {pw1, pw2, pw3, pw4};
        
        for (int i = 0; i < pwds.length; i++) {
            Password laPassword = pwds[i];
            
            System.out.printf("Password %d\n", i);
            laPassword.mostrar();
            System.out.println(laPassword.esFuerte());                    
        }
        
    }
}
