public class Hackathon_Work {

    public static void main (String [] args) {
        int [] cyclonesstrength = {15, 35, 45, 23, 19, 26, 14, 10, 11, 39, 10};
        int [] giantsstrength = { 16, 35, 24, 47, 28, 47, 11, 10, 16, 45, 10};
        int [] ravenssttrength = {36, 15, 25, 14, 47, 36, 29, 49, 11, 15, 39,};
        int [] pandasstrength = {14, 36, 50, 11, 24, 36, 21, 39, 49, 10, 10};
        int [] goatsstrengths = {24, 36, 47, 36, 19, 10, 17, 37, 18, 39, 42};
        int [] bozosstrengths = {11, 14 ,17 ,48, 36, 29, 50, 10 ,10 ,36, 23};
        int [] titansstrengths = {11, 15, 50, 10, 15, 50, 37, 48, 49, 36, 10};
        int [] vikingsstrengths = {15, 14, 47, 36, 29, 50, 47, 25, 20, 10, 50};


        int length = cyclonesstrength.length;
        int sum = 0;
        for (int i = 0; i < cyclonesstrength.length; i++){
            sum += cyclonesstrength[i];
        }
       double average = sum/length;

                System.out.println("Cyclones team rating: "+ average);

        int length2 = giantsstrength.length;
        int sum2 = 0;
        for (int i = 0; i < giantsstrength.length; i++){
            sum2 += giantsstrength[i];
        }
        double averag2 = sum2/length;

        System.out.println("Giants team rating: "+ averag2);
        int length3 = ravenssttrength.length;
        int sum3 = 0;
        for (int i = 0; i < ravenssttrength.length; i++){
            sum3 += ravenssttrength[i];
        }
        double averag3 = sum3/length;

        System.out.println("Ravens team rating: "+ averag3);

        int length4 = pandasstrength.length;
        int sum4 = 0;
        for (int i = 0; i < pandasstrength.length; i++){
            sum4 += pandasstrength[i];
        }
        double averag4 = sum4/length;

        System.out.println("Pandas team rating: "+ averag4);


        int length5 = goatsstrengths.length;
        int sum5 = 0;
        for (int i = 0; i < goatsstrengths.length; i++){
            sum5 += goatsstrengths[i];
        }
        double averag5 = sum5/length;

        System.out.println("Goats team rating: "+ averag5);


        int length6 = bozosstrengths.length;
        int sum6 = 0;
        for (int i = 0; i < bozosstrengths.length; i++){
            sum6 += bozosstrengths[i];
        }
        double averag6 = sum6/length;

        System.out.println("Bozos team rating: "+ averag6);


        int length7 = titansstrengths.length;
        int sum7 = 0;
        for (int i = 0; i < titansstrengths.length; i++){
            sum7+= titansstrengths[i];
        }
        double averag7 = sum7/length;

        System.out.println("Titans team rating: "+ averag7);

        int length8 = vikingsstrengths.length;
        int sum8 = 0;
        for (int i = 0; i < vikingsstrengths.length; i++){
            sum8+= vikingsstrengths[i];
        }
        double averag8 = sum8/length;

        System.out.println("Vikings team rating: "+ averag8);

    }
    }



