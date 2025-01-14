public class StarshipExplorer {

    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";
    public Alien[] aliens = new Alien[50];


    public static void main(String[] args) {
        StarshipExplorer Starship1 = new StarshipExplorer();
    }

    public StarshipExplorer(){
        System.out.println("Hello World");

        for(int i=0; i<aliens.length; i++) {
            int randEnergy = (int)(75*Math.random())+1;
            int randHostility = (int)(100*Math.random())+1;

            aliens[i] = new Alien(randEnergy,randHostility);
        }

        displayAllAliens();
        System.out.println(checkEnergy());
        System.out.println("\n"+"Deciphered Message: "+decipher(alienLanguage));
    }

    public void displayAllAliens(){
        for(int i=0; i<aliens.length; i++){
            aliens[i].printInfo();
        }
    }

    public boolean checkEnergy(){
        for(int x=0; x<aliens.length; x++){
            int firstAlien = aliens[x].getEnergyLevel();
            for(int y = 0; y<aliens.length; y++){
                int secondAlien = aliens[y].getEnergyLevel();
                if(firstAlien == secondAlien && x!=y){
                    System.out.println("\nAlien "+x+" = "+firstAlien);
                    System.out.println("Alien "+y+" = "+secondAlien);
                    return true;
                }
            }
        }

        return false;
    }

    public String decipher(String languageSample){
        String decodedSample="";
        int charCheck = 0;
        Boolean asterixTrue=false;

        while(charCheck < languageSample.length()){

            if (asterixTrue==true){
                decodedSample = decodedSample + languageSample.charAt(charCheck);
                asterixTrue=false;
            } else if (languageSample.charAt(charCheck) == '*'){
                asterixTrue = true;
            }
            charCheck +=1;
        }

        return decodedSample;
    }
}