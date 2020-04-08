package jurgen.example.moviecatalogue;

import java.util.ArrayList;

public class MovieData {
    public  static ArrayList<String> getTitles(){
        String[] titles = {
                "A Star Is Born",
                "Aquaman",
                "Glass",
                "Hunter Killer",
                "Mary Poppins Returns",
                "Mortal Engines",
                "Preman Pensiun",
                "Robin Hood",
                "Spider-Man: Into the Spider-Verse",
                "The Girl in the Spider's Web",
                "The Mule",
                "Venom",
                "Fast & Furious Presents: Hobbs & Shaw"

        };
        ArrayList<String> list = new ArrayList<>();
        for (String aData : titles){
            list.add(aData);
        }
        return list;
    }

    public static ArrayList<String> getOverview(){
        String[] overviews ={
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.",
                "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "Gobang kembali ke Bandung, mengundang teman-temannya, para mantan preman untuk bertemu kembali. Mereka yang diundang adalah Ujang, Murad, Pipit, Cecep, Bohim, Mang Uu, Dikdik dan Joni. Dikdik kemudian tidak jadi datang karena masalah dengan istrinya. Dalam pertemuan yang disebut “reuni kecil-kecilan” itu, Gobang meminta bantuan teman-temannya untuk melakukan penyelidikan, siapa pelaku pembantaian terhadap adik iparnya hingga tewas. Pelaku pembantaian kemudian diketahui adalah Darman dan kawan-kawan yang hanya sebagai orang suruhan. Dalang di balik kejadian itu ternyata teman mereka sendiri, sesama bekas anak buah Muslihat (Epy Kusnandar) yang sebenarnya juga sudah pensiun. Muslihat mencoba mencegah terjadinya perang saudara, tapi Gobang sudah terlanjur datang dengan membawa dendam, “darah dibayar darah, nyawa dibayar nyawa",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "In Stockholm, Sweden, hacker Lisbeth Salander is hired by Frans Balder, a computer engineer, to retrieve a program that he believes it is too dangerous to exist.",
                "Earl Stone, a man in his 80s, is broke, alone, and facing foreclosure of his business when he is offered a job that simply requires him to drive. Easy enough, but, unbeknownst to Earl, he’s just signed on as a drug courier for a Mexican cartel. He does so well that his cargo increases exponentially, and Earl hit the radar of hard-charging DEA agent Colin Bates.",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                "A spinoff of The Fate of the Furious, focusing on Johnson's US Diplomatic Security Agent Luke Hobbs forming an unlikely alliance with Statham's Deckard Shaw."
        };
        ArrayList<String> list = new ArrayList<>();
        for (String aData : overviews){
            list.add(aData);
        }
        return list;
    }

    public static  ArrayList<String> getDates(){
        String[] dates = {
                "October 5, 2018",
                "December 21, 2018",
                "January 16, 2019",
                "October 26, 2018",
                "December 13, 2018",
                "November 27, 2018",
                "January 17, 2019",
                "November 20, 2018",
                "December 6, 2018",
                "October 25, 2018",
                "December 14, 2018",
                "September 28, 2018",
                "August 2, 2019"

        };
        ArrayList<String> list = new ArrayList<>();
        for (String aData : dates){
            list.add(aData);
        }
        return  list;
    }

    public static ArrayList<Double> getVoteAvarages(){
        double[] avarages = {
                7.5,
                6.8,
                6.5,
                6.3,
                6.6,
                6.0,
                6.6,
                5.8,
                8.4,
                6.0,
                6.6,
                6.6,
                6.5
        } ;
        ArrayList<Double> list = new ArrayList<>();
        for (Double aData : avarages){
            list.add(aData);
        }
        return list;
    }

    public static ArrayList<Integer> getImages(){
        Integer[] images ={
                R.drawable.poster_a_star,
                R.drawable.poster_aquaman,
                R.drawable.poster_glass,
                R.drawable.poster_hunterkiller,
                R.drawable.poster_marrypopins,
                R.drawable.poster_mortalengine,
                R.drawable.poster_preman,
                R.drawable.poster_robinhood,
                R.drawable.poster_spiderman,
                R.drawable.poster_thegirl,
                R.drawable.poster_themule,
                R.drawable.poster_venom,
                R.drawable.poster_fastfourious
        };
        ArrayList<Integer> imageArray = new ArrayList<>();
        for (int image :images){
            imageArray.add(image);
        }
        return imageArray;
    }
}
