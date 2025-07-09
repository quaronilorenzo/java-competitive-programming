public class Vocals {
    public static void main(String[] args) {
        String parola = "ciao";
        int VocalsCount = 0;
        parola = parola.toLowerCase();
        for(int i = 0; i < parola.length(); i++){
            char c = parola.charAt(i);
            switch(c){
                case 'a':
                    VocalsCount++;
                break;
                case 'e':
                    VocalsCount++;
                break;
                case 'i':
                    VocalsCount++;
                break;
                case 'o':
                    VocalsCount++;
                break;
                case 'u':
                    VocalsCount++;
                break;
            }
        }
        System.out.println(VocalsCount);
    }
}
