public class Main {


    public static void main(String[] args) {



        int playerx = 0;
        int playery = 0;
        int princesx= 0;
        int princesy= 0;

        String [] row1 = {"-","-","-"};
        String [] row2 = {"-","m","-"};
        String [] row3 = {"p","-","-"};

        // position of the player
        for (int i = 0; i<row1.length; i++) {

            if (row1[i].equals("m")) {
                playerx = i+1;
                playery = 1;

            }
        }
            for (int j = 0; j<row2.length; j++){

                if (row2[j].equals("m")){
                    playerx = j +1;
                    playery = 2;

                }

            }

            for (int k = 0; k<row3.length; k++){

                if (row3[k].equals("m")){
                    playerx = k +1;
                    playery = 3;
                }

            }




        System.out.println("the player is in the " + playerx + " position of the " + playery + " row");



            //Position of the princess

        for (int i = 0; i<row1.length; i++) {

            if (row1[i].equals("p")) {
                princesx = i+1;
                princesy= 1;

            }
        }
        for (int j = 0; j<row2.length; j++){

            if (row2[j].equals("p")){
                princesx = j +1;
                princesy = 2;

            }

        }

        for (int k = 0; k<row3.length; k++){

            if (row3[k].equals("p")){
                princesx = k +1;
                princesy = 3;
            }

        }

        System.out.println("the Princess is in the " + princesx + " position of the " + princesy + " row");



        //ai of the player:



    }



}
